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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://banksystem-demoshop.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/Page_DemoShop/a_Login'))

WebUI.setText(findTestObject('Object Repository/Page_DemoShop/input_Email_Input.Email'), 'kedaisandekala@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_DemoShop/input_Password_Input.Password'), 'cvhLaiCRk1fCS9WfVfVr2A==')

WebUI.click(findTestObject('Object Repository/Page_DemoShop/button_Buy now'))

WebUI.click(findTestObject('Object Repository/Page_DemoShop/button_Pay by card'))

WebUI.click(findTestObject('Object Repository/Page_DemoShop/form_Card number                           _385a24'))

WebUI.setText(findTestObject('Object Repository/Page_DemoShop/input_Card number_Number'), '2019646668505162')

WebUI.click(findTestObject('Object Repository/Page_DemoShop/input_Cardholder name_Name'))

WebUI.click(findTestObject('Object Repository/Page_DemoShop/input_Cardholder name_Name'))

WebUI.setText(findTestObject('Object Repository/Page_DemoShop/input_Cardholder name_Name'), 'Wahid Khairul Anam')

WebUI.setText(findTestObject('Object Repository/Page_DemoShop/input_Expiration date_ExpiryDate'), '12/24')

WebUI.setText(findTestObject('Object Repository/Page_DemoShop/input_Security code_SecurityCode'), '518')

WebUI.click(findTestObject('Object Repository/Page_DemoShop/button_Pay'))

WebUI.click(findTestObject('Object Repository/Page_DemoShop/button_Logout'))

