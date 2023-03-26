package contextmenu;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ContextMenuTests extends BaseTests{

    @Test
    public void testRightClick(){
        var menuPage = homePage.clickContextMenu();
        menuPage.rightClickInBox();
        String expectedMessage = "You selected a context menu";
        String message = menuPage.getTextOnPopUp();
        menuPage.acceptPopup();
        assertEquals(message, expectedMessage, "Actual and expected pop up messages do not match!");

    }
}
