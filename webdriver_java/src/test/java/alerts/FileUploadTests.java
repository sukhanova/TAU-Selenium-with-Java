package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FileUploadTests extends BaseTests {
    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("TAU/Selenium_withJava/webdriver_java/resources/chromedriver");
        assertEquals(uploadPage.getUploadedFiles(), "schema.jpeg", "Uploaded file is incorrect");
    }
}
