import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.url)
WebUI.maximizeWindow()

def objectMap = [
	user1 : [
		first_name: 'huy',
		last_name: 'nguyen',
		email:'huynt@yopmail.com',
		],
	user2 : [
		first_name: 'huy1',
		last_name: 'nguyen1',
		email:'huynt1@yopmail.com',
		],
	user3 : [
		first_name: 'huy2',
		last_name: 'nguyen2',
		email:'huynt2@yopmail.com',
		]
	]

WebUI.sendKeys(input_first_name, objectMap.user2.first_name)
WebUI.sendKeys(input_last_name, objectMap.user2.last_name)

inputEmail(3,objectMap.user2.email)

WebUI.setEncryptedText(input_password, '7Dxoto1EjKfQbGop/Ov+1g==')

WebUI.click(button_create)

def inputEmail(def repeat, def email) {
	for(def i = 0; i <= repeat; i++) {
		WebUI.setText(input_email,email)
		}
}
