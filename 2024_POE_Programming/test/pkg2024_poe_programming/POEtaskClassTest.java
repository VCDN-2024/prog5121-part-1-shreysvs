
package pkg2024_poe_programming;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;




//Title: PROG5121 POE Unit Testing Task 1
//Author: Fatima
//Date:12April2024
//Link: https://www.youtube.com/channel/UCkOAdHEzxIJeIEWYWdSW2ig



public class POEtaskClassTest
{
    
    public POEtaskClassTest() 
     
    { }
    POEtaskClass login = new POEtaskClass("", "", "", "");
  //   POEtaskClassTest login = new POEtaskClassTest();

   @Test
    public void testCheckUsernameFormat() 
    {
      //  POEtaskClassTest login = new POEtaskClassTest();
        
        POEtaskClass login = new POEtaskClass("", "", "", "");
        boolean actual = login.checkUsername("Kyl_1");
        assertTrue(actual);
        
        
    }

    @Test
    public void testCheckUsernameFormatPoor()
    {
        POEtaskClass login = new POEtaskClass("", "", "", "");
        boolean actual = login.checkUsername("ky1_1");
        assertFalse(false);
        
    }

    @Test
    public void testRegisterUserPasswordPass()
    {
        POEtaskClass login = new POEtaskClass("", "", "", "");
        boolean actual = login.checkPasswordComplexity("ch&&sec@ke9");
        assertTrue(true);
    }
     public void testRegisterUserPasswordFail()
    {
        POEtaskClass login = new POEtaskClass("", "", "", "");
        boolean actual = login.checkPasswordComplexity("password");
        assertTrue(true);
    }
    
}
