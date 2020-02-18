package uk.co.sja.domain;

import uk.co.sja.pages.RegisterPage;

public class RegisterDomain {

    RegisterPage registerPage = new RegisterPage();

    public RegisterDomain registerAccount(String firstname, String lastname, String accounttype, String jobtitle, String company, String email, String phonenumber, String password, String confirmpassword){

        registerPage.enterFirstName(firstname)
                    .enterLastName(lastname)
                    .selectAccountType(accounttype)
                    .enterJobTitle(jobtitle)
                    .enterCompanyName(company)
                    .enterEmail(email)
                    .enterPhoneNumber(phonenumber)
                    .enterPassword(password)
                    .confirmPassword(confirmpassword);
        return this;

    }
}