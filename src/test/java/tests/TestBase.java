package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;

public class TestBase {

    static Logger logger = LoggerFactory.getLogger(TestBase.class);
    protected static ApplicationManager app = new ApplicationManager();


    @BeforeClass
    public static void setUp() {
        WebDriverManager.firefoxdriver().setup(); //Драйверы для хрома (можно для любого браузера
        logger.info("Setup firefox driver");
    }

    @BeforeMethod
    public void setupTest(Method m, Object[] p) throws MalformedURLException {
        app.init(false);
    }


    @AfterMethod
    public void tearDown() {
        app.stop();
    }

    @AfterMethod
    public void stopTest(ITestResult result) throws IOException {
        if (result.isSuccess()) {
            logger.info("PASSED" + result.getMethod().getMethodName()); // + app.getRegister().deleteFiles("records"));
        } else {
            logger.info("FAILED" + result.getMethod().getMethodName()); // + "Screenshot path: " + app.takeScreenshot());
        }

        logger.info("=========================================================================");
    }


    /*protected void stop() {
        driver.quit();
    }*/


}
