package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.Base;

import utilities.Utils;

public class HomepagePageObj extends Base{
	
	public HomepagePageObj() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktopLink;
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopsAndNotebooksLink;
	@FindBy(xpath = "//a[text()='Components']")
	private WebElement componentsLink;
	@FindBy(xpath = "//a[text()='Tablets']")
	private WebElement tabletsLink;
	@FindBy(xpath = "//a[text()='Software']")
	private WebElement softwareLink;
	@FindBy(xpath = "//a[text()='Phones & PDAs']")
	private WebElement phonesAndPADsLink;
	@FindBy(xpath = "//a[text()='Cameras']")
	private WebElement camerasLink;
	@FindBy(xpath = "//a[text()='MP3 Players']")
	private WebElement mps3PlayersLink;
	
	public void compareTextDesktopLink(String expectedText) {
		String actualText = Utils.getTextFromUI(desktopLink);
		Assert.assertEquals(expectedText, actualText);
	}
	public void compareTextlaptopsAndNotebooksLink(String expectedText) {
		String actualText = Utils.getTextFromUI(laptopsAndNotebooksLink);
		Assert.assertEquals(expectedText, actualText);
	}
	public void compareTextcomponentsLink(String expectedText) {
		String actualText = Utils.getTextFromUI(componentsLink);
		Assert.assertEquals(expectedText, actualText);
	}
	public void compareTexttabletsLink(String expectedText) {
		String actualText = Utils.getTextFromUI(tabletsLink);
		Assert.assertEquals(expectedText, actualText);
	}
	public void compareTextsoftwareLink(String expectedText) {
		String actualText = Utils.getTextFromUI(softwareLink);
		Assert.assertEquals(expectedText, actualText);
	}
	public void compareTextphonesAndPADsLink(String expectedText) {
		String actualText = Utils.getTextFromUI(phonesAndPADsLink);
		Assert.assertEquals(expectedText, actualText);
	}
	public void compareTextcamerasLink(String expectedText) {
		String actualText = Utils.getTextFromUI(camerasLink);
		Assert.assertEquals(expectedText, actualText);
	}
	public void compareTextmps3PlayersLink(String expectedText) {
		String actualText = Utils.getTextFromUI(mps3PlayersLink);
		Assert.assertEquals(expectedText, actualText);
	}
	
	
	
	
	
	

}
