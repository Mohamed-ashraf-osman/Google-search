import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Google;

public class verifyGoogleLogoIsDisplayed extends BaseTest {

    Google Google;
    @Test

        public void verifyLogo(){
            Google = new Google(driver);
            Google.VrifyLogo();
        boolean actualTitle = Google.VrifyLogo();
    Assert.assertTrue(actualTitle);

    }
}