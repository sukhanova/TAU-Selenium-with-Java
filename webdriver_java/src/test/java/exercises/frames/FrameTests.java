package exercises.frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests {

    @Test
    public void testFrameText(){
        var nestedFramesPage = homePage.clickFramesPage().clickNestedFrames();
        assertEquals(nestedFramesPage.getLeftFrameText(), "LEFT", "Left frame test is incorrect");
        assertEquals(nestedFramesPage.getBottomFrame(), "BOTTOM", "Bottom frame test is incorrect");
    }
}
