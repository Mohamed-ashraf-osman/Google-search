import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Google;

public class verifySeleinumPage extends BaseTest
        {
           Google Google;
            @Test
            public void TesTverifySeleinumPage(){
                Google = new Google(driver);
                Google.searchForSelenium();
                Google.GetSearchResult();



            }
            }

