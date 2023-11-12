
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Google;

public class verifyPageTitle extends BaseTest {

    Google Google;
    @Test
    public void TestVerifyPageTitle (){
        Google = new Google(driver);
        Google.GetPageTitle();
        String actualTitle = Google.GetPageTitle();

        Assert.assertEquals(actualTitle, "https://www.google.com/","Page title is not as expected");

    }
}
