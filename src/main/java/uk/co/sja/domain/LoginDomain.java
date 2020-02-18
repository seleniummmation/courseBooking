package uk.co.sja.domain;

import uk.co.sja.pages.LoginPage;

import static org.junit.Assert.assertEquals;

public class LoginDomain {

    LoginPage loginPage = new LoginPage();

    public LoginDomain signIn ( String email, String password) throws InterruptedException {

        loginPage.enterEmail(email)
                 .pwrd(password)
                 .clickLogInButton();
        Thread.sleep(Long.parseLong("15000"));
        return this;
    }

    public void verifyUserAccount() {
        String expected = "AVAJNELES@GMAIL.COM";
        assertEquals(expected, loginPage.getAccount());
        System.out.println(loginPage.getAccount());
    }
}