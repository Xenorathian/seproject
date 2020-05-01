import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
    }


    /*

    Login test:

    1) Navigate to https://statista.com

    2) Click on login button at page header

    3) Fill out the login form with given credentials

    4) Click submit button

     */

    @Test
    public void loginTest() {


    }


    @After
    public void tearDown() {
        driver.close();
    }

}
