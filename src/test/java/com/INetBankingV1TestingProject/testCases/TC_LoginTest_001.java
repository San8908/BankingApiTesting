package com.INetBankingV1TestingProject.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.INetBankingV1TestingProject.pageObject.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() throws IOException {
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered username");

		lp.setPassword(password);
		logger.info("Entered password");

		lp.clickSubmit();

		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("Login test passed");
		} else {
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}

	}

}
