package slider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SliderTests extends BaseTests {

    @Test
    public void testSliderNumber(){
        String value = "2";
        var sliderPage = homePage.clickHorizontalSlider();
        sliderPage.setSliderValue(value);
        var sliderValue = sliderPage.getSliderValue();
        assertEquals(sliderValue, value, "Slider values are not matching");
    }
}
