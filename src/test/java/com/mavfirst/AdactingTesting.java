package com.mavfirst;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class AdactingTesting extends BaseClass {
@Before 
public void broswerStart() {
	toBrowserlaunchChrome();
	toLaunchUrl("http://adactinhotelapp.com/");
	toImplicitWait(30);
	toMax();
}
@Ignore
@Test
public void tc101() {
	LoginPage l = new LoginPage();
	toSendKeys(l.getTxtuser(), "MukeshMasailamani");
	toSendKeys(l.getTxtPass(), "Since@1995");
	toClick(l.getLogin());
	System.out.println("Test No: tc101 TestPass");

}
@Ignore
@Test
public void tc102() throws IOException {
	LoginPage l = new LoginPage();
	SearchHotelPage search = new SearchHotelPage();
	toSendKeys(l.getTxtuser(), "MukeshMasailamani");
	toSendKeys(l.getTxtPass(), "Since@1995");
	toClick(l.getLogin());
	dropAndDownSelectByIndex(search.getLocation(), 1);
	dropAndDownSelectByIndex(search.getHotels(), 1);
	dropAndDownSelectByIndex(search.getRoomType(), 1);
	dropAndDownSelectByIndex(search.getNoOfRooms(), 1);
	toClear(search.getCheckInDate());
	toSendKeys(search.getCheckInDate(), "07/04/2021");
	toClear(search.getCheckOutdate());
	toSendKeys(search.getCheckOutdate(), "05/04/2021");
	toClick(search.getSearch());
	toGetScreenShot("C:\\Users\\ram\\eclipse-workspace\\org.hello\\ScreenShot\\tc102.png");
	System.out.println("Test No: tc102 TestPass");
}
@Ignore
@Test	
public void tc103() throws IOException {
	LoginPage l = new LoginPage();
	SearchHotelPage search = new SearchHotelPage();
	toSendKeys(l.getTxtuser(), "MukeshMasailamani");
	toSendKeys(l.getTxtPass(), "Since@1995");
	toClick(l.getLogin());
	dropAndDownSelectByIndex(search.getLocation(), 1);
	dropAndDownSelectByIndex(search.getHotels(), 1);
	dropAndDownSelectByIndex(search.getRoomType(), 1);
	dropAndDownSelectByIndex(search.getNoOfRooms(), 1);
	toClear(search.getCheckInDate());
	toSendKeys(search.getCheckInDate(), "23/03/2021");
	toClear(search.getCheckOutdate());
	toSendKeys(search.getCheckOutdate(), "25/03/2021");
	toClick(search.getSearch());
	toGetScreenShot("C:\\Users\\ram\\eclipse-workspace\\org.hello\\ScreenShot\\tc103.png");
	System.out.println("Test No: tc103 TestPass");
}	
@Ignore
@Test	
public void tc104() throws IOException {
	LoginPage l = new LoginPage();
	SearchHotelPage search = new SearchHotelPage();
	toSendKeys(l.getTxtuser(), "MukeshMasailamani");
	toSendKeys(l.getTxtPass(), "Since@1995");
	toClick(l.getLogin());
	//dropAndDownSelectByIndex(search.getLocation(), 1);
	s = new Select(search.getLocation());
	s.selectByIndex(1);
	WebElement firstSelectedOption = s.getFirstSelectedOption();
	String actual = firstSelectedOption.getText();
	dropAndDownSelectByIndex(search.getHotels(), 1);
	dropAndDownSelectByIndex(search.getRoomType(), 1);
	dropAndDownSelectByIndex(search.getNoOfRooms(), 1);
	toClear(search.getCheckInDate());
	toSendKeys(search.getCheckInDate(), "23/03/2021");
	toClear(search.getCheckOutdate());
	toSendKeys(search.getCheckOutdate(), "25/03/2021");
	dropAndDownSelectByIndex(search.getAdultPerRoom(), 1);
	dropAndDownSelectByIndex(search.getChildPerRoom(), 1);
	toClick(search.getSearch());
	//toGetScreenShot("C:\\Users\\ram\\eclipse-workspace\\org.hello\\ScreenShot\\tc104a.png");
	WebElement locationHotel = driver.findElement(By.name("location_0"));
	String expected = locationHotel.getAttribute("value");
	
	System.out.println("Expected Result"   +   expected);
	
	System.out.println("Actual Result"     +    actual);
	
	Assert.assertEquals("equal or Not", expected, actual);
	System.out.println("Test No: tc104 TestPass");
	
}	
@Ignore
@Test	
public void tc106() throws IOException {
	LoginPage l = new LoginPage();
	SearchHotelPage search = new SearchHotelPage();
	toSendKeys(l.getTxtuser(), "MukeshMasailamani");
	toSendKeys(l.getTxtPass(), "Since@1995");
	toClick(l.getLogin());
	dropAndDownSelectByIndex(search.getLocation(), 1);
	dropAndDownSelectByIndex(search.getHotels(), 1);
	dropAndDownSelectByIndex(search.getRoomType(), 1);
	dropAndDownSelectByIndex(search.getNoOfRooms(), 1);
	toClear(search.getCheckInDate());
	toSendKeys(search.getCheckInDate(), "28/03/2021");
	toClear(search.getCheckOutdate());
	toSendKeys(search.getCheckOutdate(), "29/03/2021");
	
	String actual = search.getCheckOutdate().getAttribute("value");
	
	
	dropAndDownSelectByIndex(search.getAdultPerRoom(), 1);
	dropAndDownSelectByIndex(search.getChildPerRoom(), 1);
	toClick(search.getSearch());
	//toGetScreenShot("C:\\Users\\ram\\eclipse-workspace\\org.hello\\ScreenShot\\tc104a.png");
	WebElement outDate = driver.findElement(By.name("dep_date_0"));
	String expected = outDate.getAttribute("value");
	
	System.out.println("Expected Result :  "+expected);
	
	System.out.println("Actual Result :  " +actual);
	
	Assert.assertEquals("equal or Not", expected, actual);
	System.out.println("Test No: tc105 TestPass");
	
}	

@Test	
public void tc105() throws IOException {
	LoginPage l = new LoginPage();
	SearchHotelPage search = new SearchHotelPage();
	toSendKeys(l.getTxtuser(), "MukeshMasailamani");
	toSendKeys(l.getTxtPass(), "Since@1995");
	toClick(l.getLogin());
	dropAndDownSelectByIndex(search.getLocation(), 1);
	dropAndDownSelectByIndex(search.getHotels(), 1);
	dropAndDownSelectByIndex(search.getRoomType(), 1);
	dropAndDownSelectByIndex(search.getNoOfRooms(), 1);
	toClear(search.getCheckInDate());
	toSendKeys(search.getCheckInDate(), "28/03/2021");
	toClear(search.getCheckOutdate());
	toSendKeys(search.getCheckOutdate(), "29/03/2021");
	
	String actual = search.getCheckOutdate().getAttribute("value");
	
	
	dropAndDownSelectByIndex(search.getAdultPerRoom(), 1);
	dropAndDownSelectByIndex(search.getChildPerRoom(), 1);
	toClick(search.getSearch());
	//toGetScreenShot("C:\\Users\\ram\\eclipse-workspace\\org.hello\\ScreenShot\\tc104a.png");
	WebElement outDate = driver.findElement(By.name("dep_date_0"));
	String expected = outDate.getAttribute("value");
	
	System.out.println("Expected Result :  "+expected);
	
	System.out.println("Actual Result :  " +actual);
	
	Assert.assertEquals("equal or Not", expected, actual);
	System.out.println("Test No: tc105 TestPass");
	
}	





























/*@Test	
public void tc105() throws IOException {
	LoginPage l = new LoginPage();
	SearchHotelPage search = new SearchHotelPage();
	toSendKeys(l.getTxtuser(), "MukeshMasailamani");
	toSendKeys(l.getTxtPass(), "Since@1995");
	toClick(l.getLogin());
	dropAndDownSelectByIndex(search.getLocation(), 1);
	dropAndDownSelectByIndex(search.getHotels(), 1);
	dropAndDownSelectByIndex(search.getRoomType(), 1);
	dropAndDownSelectByIndex(search.getNoOfRooms(), 1);
	toClear(search.getCheckInDate());
	toSendKeys(search.getCheckInDate(), "28/03/2021");
	toClear(search.getCheckOutdate());
	toSendKeys(search.getCheckOutdate(), "29/03/2021");
	dropAndDownSelectByIndex(search.getAdultPerRoom(), 1);
	dropAndDownSelectByIndex(search.getChildPerRoom(), 1);
	toGetScreenShot("C:\\Users\\ram\\eclipse-workspace\\org.hello\\ScreenShot\\tc105.png");
	toClick(search.getSearch());
	toGetScreenShot("C:\\Users\\ram\\eclipse-workspace\\org.hello\\ScreenShot\\tc105a.png");
}
*/

}
