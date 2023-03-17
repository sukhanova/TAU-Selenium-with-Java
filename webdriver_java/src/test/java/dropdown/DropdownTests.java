package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DropdownTests extends BaseTests {

    @Test
    public void testSelectOption(){
        var dropdownPage = homePage.clickDropDown();
        String option = "Option 1";
        dropdownPage.selectFromDropDown(option);
        var selectedOptions = dropdownPage.getSelectedOptions();
        System.out.println("Selected option is: " + selectedOptions);
        assertEquals(selectedOptions.size(), 1, "Incorrect numbers of selections");
        assertTrue(selectedOptions.contains(option),"Options not selected");
    }
}
