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

WebUI.navigateToUrl('http://localhost/')

WebUI.click(findTestObject('Object Repository/Page_L Tm Anh/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_L Tm Anh Log in to the site/input_Username_username'), 'anhle2')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_L Tm Anh Log in to the site/input_Password_password'), 'eGmz8XUbrLe3vUQiiiujBg==')

WebUI.click(findTestObject('Object Repository/Page_L Tm Anh Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_My courses'))

WebUI.click(findTestObject('Object Repository/Page_My courses/div_Course category                        _b991c1'))

WebUI.click(findTestObject('Object Repository/Page_My courses/span_Category 1'))

WebUI.click(findTestObject('Object Repository/Page_My courses/div_Course image'))

WebUI.click(findTestObject('Object Repository/Page_Course 1/a_Deadline 1  Assignment'))

WebUI.click(findTestObject('Object Repository/Page_1 Deadline 1/button_Add submission'))

WebUI.click(findTestObject('Object Repository/Page_1 Deadline 1 - Edit submission/i_- drag and drop not supported_icon fa fa-_916087'))

WebUI.click(findTestObject('Object Repository/Page_1 Deadline 1 - Edit submission/button_Create folder'))

WebUI.click(findTestObject('Object Repository/Page_1 Deadline 1 - Edit submission/i_New folder_icon fa fa-ellipsis-v fa-fw'))

WebUI.click(findTestObject('Object Repository/Page_1 Deadline 1 - Edit submission/button_Zip'))

WebUI.scrollToElement(findTestObject('Page_1 Deadline 1 - Edit submission/input_Loading_submitbutton'), 0)

WebUI.click(findTestObject('Page_1 Deadline 1 - Edit submission/input_Loading_submitbutton'))

WebUI.closeBrowser()

