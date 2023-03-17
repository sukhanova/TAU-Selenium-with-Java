package exercises.passwords;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class ForgotPasswordTest extends BaseTests {
    @Test
    public void testRetreivePassword(){
        var forgetPasswordPage = homePage.clickForgotPassword();
        var emailSentPage = forgetPasswordPage.retrievePassword("tau@example.com");
        assertEquals(emailSentPage.getConfirmationMessage(), "Your e-mail's been sent!", "Message is incorrect");
    }
}
