import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddReport {

	public static void main(String[] args) throws Exception 
	{

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://testwave.qabidder.net/#/page/login");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

//		Login page
		
		WebElement emailTextBox = driver.findElement(By.id("exampleInputEmail1"));
		emailTextBox.sendKeys("qabootcamp@mailinator.com");
		
		WebElement passwdTextBox = driver.findElement(By.id("exampleInputPassword1"));
		passwdTextBox.sendKeys("123456");
		
		Thread.sleep(5000);
		
		WebElement loginButton = driver.findElement(By.tagName("button"));
		loginButton.click();
		
		Thread.sleep(2000);
		
//		Goto Add Report		
		
		WebElement reports = driver.findElement(By.linkText("Add Report"));
		reports.click();
		
//		Select Department
		
		List<WebElement> radioButtonLabels = driver.findElements(By.xpath("//fieldset/*[@class='ng-scope']//label"));
		for (int i = 0; i < radioButtonLabels.size(); i++) {
			WebElement radioButtomLabel = radioButtonLabels.get(i);
			String text = radioButtomLabel.getText();
			if (text.equals("Dep1")) {
				WebElement radioButton = radioButtomLabel.findElement(By.xpath("span"));
				radioButton.click();
			}
		}
		
		WebElement nextButton = driver.findElement(By.cssSelector(".next>a"));
		nextButton.click();

//		Subject Information Section		
		
		WebElement caseId = driver.findElement(By.cssSelector(".form-control.ng-pristine.ng-untouched.ng-valid.ng-empty"));
		caseId.sendKeys("123");

		WebElement suspectDropDown = driver.findElement(By.xpath("//select[@ng-model='wizard.report.suspectType']"));
		suspectDropDown.findElement(By.xpath("option[text()='Suspect']")).click();

		WebElement lastName = driver.findElement(By.xpath("//input[@ng-model='wizard.report.lastName']"));
		lastName.sendKeys("LastName");
		
		WebElement firstName = driver.findElement(By.xpath("//input[@ng-model='wizard.report.firstName']"));
		firstName.sendKeys("FirstName");
		
		WebElement middleName = driver.findElement(By.xpath("//input[@ng-model='wizard.report.middleName']"));
		middleName.sendKeys("MiddleName");
		
		WebElement nickName = driver.findElement(By.xpath("//input[@ng-model='wizard.report.nickname']"));
		nickName.sendKeys("NickName");
		
		WebElement dob = driver.findElement(By.xpath("//input[@ng-model='wizard.report.dob']"));
		dob.sendKeys("01/01/2001");

		WebElement ageNumber = driver.findElement(By.xpath("//input[@ng-model='wizard.report.age']"));
		ageNumber.sendKeys("42");
		
		WebElement sexDropDown = driver.findElement(By.xpath("//select[@ng-model='wizard.report.sex']"));
		sexDropDown.findElement(By.xpath("option[text()='M']")).click();

		WebElement raceDropDown = driver.findElement(By.xpath("//select[@ng-model='wizard.report.race']"));
		raceDropDown.findElement(By.xpath("option[text()='Cambodian']")).click();
		
		WebElement height = driver.findElement(By.xpath("//input[@ng-model='wizard.report.height']"));
		height.sendKeys("6.00");
		
		WebElement weight = driver.findElement(By.xpath("//input[@ng-model='wizard.report.weight']"));
		weight.sendKeys("226.0");
		
		WebElement buildDropDown = driver.findElement(By.xpath("//select[@ng-model='wizard.report.build']"));
		buildDropDown.findElement(By.xpath("option[text()='Obese']")).click();
				
		WebElement hairColorDropDown = driver.findElement(By.xpath("//select[@ng-model='wizard.report.hairColor']"));
		hairColorDropDown.findElement(By.xpath("option[text()='Black']")).click();
		
		WebElement hairLengthDropDown = driver.findElement(By.xpath("//select[@ng-model='wizard.report.hairLength']"));
		hairLengthDropDown.findElement(By.xpath("option[text()='Short']")).click();
		
		WebElement hairStyleDropDown = driver.findElement(By.xpath("//select[@ng-model='wizard.report.hairStyle']"));
		hairStyleDropDown.findElement(By.xpath("option[text()='Afro']")).click();
		
		WebElement eyeColorDropDown = driver.findElement(By.xpath("//select[@ng-model='wizard.report.eyeColor']"));
		eyeColorDropDown.findElement(By.xpath("option[text()='Brown']")).click();
		
		WebElement complexionDropDown = driver.findElement(By.xpath("//select[@ng-model='wizard.report.complexion']"));
		complexionDropDown.findElement(By.xpath("option[text()='Dark']")).click();
		
		WebElement teethDropDown = driver.findElement(By.xpath("//select[@ng-model='wizard.report.teeth']"));
		teethDropDown.findElement(By.xpath("option[text()='Gold']")).click();
		
		WebElement handPreferenceDropDown = driver.findElement(By.xpath("//select[@ng-model='wizard.report.handPreference']"));
		handPreferenceDropDown.findElement(By.xpath("option[text()='Left']")).click();
		
		WebElement primaryLanguage = driver.findElement(By.xpath("//input[@ng-model='wizard.report.primaryLanguage']"));
		primaryLanguage.sendKeys("English");
		
		WebElement streetAddress = driver.findElement(By.xpath("//input[@ng-model='wizard.report.streetAddress']"));
		streetAddress.sendKeys("1234 Any St.");
		
		WebElement countryDropDown = driver.findElement(By.xpath("//select[@ng-model='wizard.report.country']"));
		countryDropDown.findElement(By.xpath("option[text()='Cambodia']")).click();
		
		WebElement city = driver.findElement(By.xpath("//input[@ng-model='wizard.report.city']"));
		city.sendKeys("Any City");
		
		WebElement state = driver.findElement(By.xpath("//input[@ng-model='wizard.report.state']"));
		state.sendKeys("Phnom Penh");
		
		WebElement zip = driver.findElement(By.xpath("//input[@ng-model='wizard.report.zip']"));
		zip.sendKeys("12345");
		
		WebElement contactTelephone = driver.findElement(By.xpath("//input[@ng-model='wizard.report.contactTelephone']"));
		contactTelephone.sendKeys("1234567890");
		
		WebElement contactEmail = driver.findElement(By.xpath("//input[@ng-model='wizard.report.contactEmail']"));
		contactEmail.sendKeys("name@mail.com");
				
 		List<WebElement> roadRadioButtonLabels = driver.findElements(By.xpath("//fieldset/*[@class='row']//label"));

		for (int i = 0; i < roadRadioButtonLabels.size(); i++) {
			WebElement roadRadioButtomLabel = roadRadioButtonLabels.get(i);
			String text = roadRadioButtomLabel.getText();
			if (text.equals("Passenger")) {
				WebElement roadRadioButton = roadRadioButtomLabel.findElement(By.xpath("span"));
				roadRadioButton.click();
			}
		}
		
		WebElement identifierTab = driver.findElement(By.xpath("//a[@ng-click='wizard.go(3)']"));
		identifierTab.click();
		
//		Identifier Section
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@ng-model='wizard.report.tattoos']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Tattoos']")).sendKeys("Ugly Tattoos");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@ng-model='wizard.report.scars']")).click();
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//input[@placeholder='Scars']")).sendKeys("Ugly Scars");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@ng-model='wizard.report.needleMarks']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Needle marks']")).sendKeys("Ugly Marks");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@ng-model='wizard.report.tracks']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Tracks']")).sendKeys("Ugly Tracks");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@ng-model='wizard.report.glasses']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Glasses']")).sendKeys("Ugly Glasses");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@ng-model='wizard.report.mustache']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Mustache']")).sendKeys("Ugly Mustache");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@ng-model='wizard.report.beard']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Beard']")).sendKeys("Ugly Beard");
		Thread.sleep(2000);
		
		WebElement idInfoTab = driver.findElement(By.xpath("//div[@title='ID Information']"));
		idInfoTab.click();
		Thread.sleep(2000);
		
//		ID Information Section
		
		WebElement socialSecurity = driver.findElement(By.xpath("//input[@ng-model='wizard.report.socialSecurity']"));
		socialSecurity.sendKeys("123-12-1234");
		
		WebElement driverLicense = driver.findElement(By.xpath("//input[@ng-model='wizard.report.driverLicense']"));
		driverLicense.sendKeys("B2983777");
		
		WebElement dlStateDropDown = driver.findElement(By.xpath("//select[@ng-model='wizard.report.dlState']"));
		dlStateDropDown.findElement(By.xpath("option[text()='California']")).click();
		
		
		WebElement otherId = driver.findElement(By.xpath("//input[@ng-model='wizard.report.otherId']"));
		otherId.sendKeys("Other ID");
		
		WebElement otherIdCountryDropDown = driver.findElement(By.xpath("//select[@ng-model='wizard.report.otherIdCountry']"));
		otherIdCountryDropDown.findElement(By.xpath("option[text()='Cambodia']")).click();
		
		WebElement otherIdState = driver.findElement(By.xpath("//input[@ng-model='wizard.report.otherIdState']"));
		otherIdState.sendKeys("Phnom Penh");
		
		WebElement otherIdType = driver.findElement(By.xpath("//input[@ng-model='wizard.report.otherIdType']"));
		otherIdType.sendKeys("Ugly ID Card");
	
//		School Information
		
		WebElement schoolName = driver.findElement(By.xpath("//input[@ng-model='wizard.report.schoolName']"));
		schoolName.sendKeys("The Ugly High School");
		
		WebElement schoolAddress = driver.findElement(By.xpath("//input[@ng-model='wizard.report.schoolAddress']"));
		schoolAddress.sendKeys("1234 Ugly Way");
		
		WebElement schoolCity = driver.findElement(By.xpath("//input[@ng-model='wizard.report.schoolCity']"));
		schoolCity.sendKeys("Uglyville");
		
		WebElement schoolStateDropDown = driver.findElement(By.xpath("//select[@ng-model='wizard.report.schoolState']"));
		schoolStateDropDown.findElement(By.xpath("option[text()='Utah']")).click();
	
		WebElement schoolZip = driver.findElement(By.xpath("//input[@ng-model='wizard.report.schoolZip']"));
		schoolZip.sendKeys("12345");
		
		WebElement schoolTelephone = driver.findElement(By.xpath("//input[@ng-model='wizard.report.schoolTelephone']"));
		schoolTelephone.sendKeys("1231231234");
		
//		Parent Information
		
		WebElement parentName = driver.findElement(By.xpath("//input[@ng-model='wizard.report.parentName']"));
		parentName.sendKeys("The Jetsons");
		
		WebElement parentAddress = driver.findElement(By.xpath("//input[@ng-model='wizard.report.parentAddress']"));
		parentAddress.sendKeys("1234 Uglier Way");
		
		WebElement parentCity = driver.findElement(By.xpath("//input[@ng-model='wizard.report.parentCity']"));
		parentCity.sendKeys("Uglyville");
		
		WebElement parentStateDropDown = driver.findElement(By.xpath("//select[@ng-model='wizard.report.parentState']"));
		parentStateDropDown.findElement(By.xpath("option[text()='Utah']")).click();
	
		WebElement parentZip = driver.findElement(By.xpath("//input[@ng-model='wizard.report.parentZip']"));
		parentZip.sendKeys("12345");
		
		WebElement parentTelephone = driver.findElement(By.xpath("//input[@ng-model='wizard.report.parentTelephone']"));
		parentTelephone.sendKeys("1231231234");
		
//		Employer Information
		
		WebElement occupation = driver.findElement(By.xpath("//input[@ng-model='wizard.report.occupation']"));
		occupation.sendKeys("The Ugly Mascot");
		
		WebElement employerName = driver.findElement(By.xpath("//input[@ng-model='wizard.report.employerName']"));
		employerName.sendKeys("The Ugly Ducklings");
		
		WebElement employerAddress = driver.findElement(By.xpath("//input[@ng-model='wizard.report.employerAddress']"));
		employerAddress.sendKeys("1234 Ugliest Way");
		
		WebElement employerCity = driver.findElement(By.xpath("//input[@ng-model='wizard.report.employerCity']"));
		employerCity.sendKeys("Uglyville");
		
		WebElement employerStateDropDown = driver.findElement(By.xpath("//select[@ng-model='wizard.report.employerState']"));
		employerStateDropDown.findElement(By.xpath("option[text()='Utah']")).click();
	
		WebElement employerZip = driver.findElement(By.xpath("//input[@ng-model='wizard.report.employerZip']"));
		employerZip.sendKeys("123-12-1234");
		
		WebElement employerTelephone = driver.findElement(By.xpath("//input[@ng-model='wizard.report.employerTelephone']"));
		employerTelephone.sendKeys("1231231234");
		
		Thread.sleep(2000);
		
		WebElement gangMemberTab = driver.findElement(By.xpath("//a[@ng-click='wizard.go(5)']"));
		gangMemberTab.click();
		
//		Distribution Seciton
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@ng-model='wizard.report.gangUnit']")).click();
		driver.findElement(By.xpath("//input[@ng-model='wizard.report.sexCrimes']")).click();
		driver.findElement(By.xpath("//input[@ng-model='wizard.report.robbery']")).click();
		driver.findElement(By.xpath("//input[@ng-model='wizard.report.narco']")).click();
		driver.findElement(By.xpath("//input[@ng-model='wizard.report.viceIntel']")).click();

		driver.findElement(By.xpath("//input[@ng-model='wizard.report.other']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Other Distribution']")).sendKeys("Ugly Mustache");
		Thread.sleep(2000);

		
		WebElement reasonForStop = driver.findElement(By.xpath("//input[@ng-model='wizard.report.reasonForStop']"));
		reasonForStop.sendKeys("Looking Too Ugly");
		
		WebElement locationOfStop = driver.findElement(By.xpath("//input[@ng-model='wizard.report.locationOfStop']"));
		locationOfStop.sendKeys("In Front Of An Ugly Building");
		
		WebElement dispositionOfStop = driver.findElement(By.xpath("//input[@ng-model='wizard.report.dispositionOfStop']"));
		dispositionOfStop.sendKeys("I Dont Know!!!");
		
		WebElement gangName = driver.findElement(By.xpath("//input[@ng-model='wizard.report.gangName']"));
		gangName.sendKeys("BULB");
		
		WebElement howLong = driver.findElement(By.xpath("//input[@ng-model='wizard.report.howLong']"));
		howLong.sendKeys("Too Long");
		
		driver.findElement(By.xpath("//input[@ng-model='wizard.report.selfAdmission']")).click();
		driver.findElement(By.xpath("//input[@ng-model='wizard.report.frequentingGangArea']")).click();
		driver.findElement(By.xpath("//input[@ng-model='wizard.report.displayingGangSigns']")).click();
		driver.findElement(By.xpath("//input[@ng-model='wizard.report.byReliableInformant']")).click();
		driver.findElement(By.xpath("//input[@ng-model='wizard.report.gangTattoos']")).click();
		driver.findElement(By.xpath("//input[@ng-model='wizard.report.gangClothing']")).click();
		driver.findElement(By.xpath("//input[@ng-model='wizard.report.affiliatingWithGangMembers']")).click();
		driver.findElement(By.xpath("//input[@ng-model='wizard.report.participatingInGangCrime']")).click();
		driver.findElement(By.xpath("//input[@ng-model='wizard.report.gangRegistrant']")).click();
		
		driver.findElement(By.xpath("//input[@ng-model='wizard.report.onParole']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Parole Officer']")).sendKeys("Officer Bob");
		driver.findElement(By.xpath("//input[@placeholder='Parole Officer Phone']")).sendKeys("1231231234");

		
		driver.findElement(By.xpath("//input[@ng-model='wizard.report.onProbation']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Probation Officer']")).sendKeys("Officer Jim");
		driver.findElement(By.xpath("//input[@placeholder='Probation Officer Phone']")).sendKeys("1231231234");

		
		WebElement otherInformation = driver.findElement(By.xpath("//textarea[@ng-model='wizard.report.otherInformation']"));
		otherInformation.sendKeys("Other Information");
		
		WebElement officerId = driver.findElement(By.xpath("//input[@ng-model='wizard.report.officerId']"));
		officerId.sendKeys("112233");
		
		WebElement beat = driver.findElement(By.xpath("//input[@ng-model='wizard.report.beat']"));
		beat.sendKeys("Im Beat.");
		
		Thread.sleep(2000);
		
		WebElement vehicleTab = driver.findElement(By.xpath("//a[@ng-click='wizard.go(6)']"));
		vehicleTab.click();
		
		
//		Vehicle Section
		
		WebElement vehicleLicense = driver.findElement(By.xpath("//input[@ng-model='wizard.report.vehicleLicense']"));
		vehicleLicense.sendKeys("1ABC123");
		
		WebElement vehicleMake = driver.findElement(By.xpath("//input[@ng-model='wizard.report.vehicleMake']"));
		vehicleMake.sendKeys("UZA");

		WebElement vehicleModel = driver.findElement(By.xpath("//input[@ng-model='wizard.report.vehicleModel']"));
		vehicleModel.sendKeys("Urraco");

		WebElement vehicleBodystyle = driver.findElement(By.xpath("//input[@ng-model='wizard.report.vehicleBodystyle']"));
		vehicleBodystyle.sendKeys("Unique");

		WebElement vehicleYear = driver.findElement(By.xpath("//input[@ng-model='wizard.report.vehicleYear']"));
		vehicleYear.sendKeys("2000");

		WebElement vehicleColors = driver.findElement(By.xpath("//input[@ng-model='wizard.report.vehicleColors']"));
		vehicleColors.sendKeys("Ube");
		
		WebElement vehicleStateDropDown = driver.findElement(By.xpath("//select[@ng-model='wizard.report.vehicleState']"));
		vehicleStateDropDown.findElement(By.xpath("option[text()='Utah']")).click();

		WebElement vehicleOddities = driver.findElement(By.xpath("//input[@ng-model='wizard.report.vehicleOddities']"));
		vehicleOddities.sendKeys("Ultra Wide");
		
		Thread.sleep(2000);
		
//		Photo Upload Section
		
		WebElement photoTab = driver.findElement(By.xpath("//a[@ng-click='wizard.go(7)']"));
		photoTab.click();
		
		Thread.sleep(2000);
		
		WebElement previewTab = driver.findElement(By.xpath("//a[@ng-click='wizard.go(8)']"));
		previewTab.click();
		
//		Preview Section		
		
		Thread.sleep(2000);
		
		WebElement publishButton = driver.findElement(By.xpath("//button[@ng-click='wizard.commitReport()']"));
		publishButton.click();
		
		System.out.println("complete");

		driver.close();
		driver.quit();
		
	}
}

