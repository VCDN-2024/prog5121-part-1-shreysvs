
package pkg2024_poe_programming;

import javax.swing.JOptionPane;
import java.lang.String;
// Java Package to use JOptionPane


public class POEtaskClass
{
    
    
    //Decalareing private vairables
    private String username;
    private String password;
    private String firstName;
    private String lastName;

    public POEtaskClass(String Uname, String pas, String FName, String LName)
    {
        this.username = Uname;
        this.password = pas;
        this.firstName = FName;
        this.lastName = LName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

   
    
  
   

    public boolean checkUsername(String username) //decalaring boolean method
    {
        return username.length() <= 5 && username.contains("_");
    }

    public boolean checkPasswordComplexity(String password)//decalaring boolean method
    {
        return password.length() >= 8 && password.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]+$");
    }

    public void registerUser()// validating the username and password based on the requirments
    {
        if ( checkUsername( username) && checkPasswordComplexity( password))
        {
          System.out.println( "Welcome " + firstName + " " + lastName+" its great to see you again");
        } 
    


        else 
        {
            if (!checkUsername(username))
            {
                System.out.println( "Username is not correctly formatted, please ensure that your username contains an underscore and is no more then 5 characters in lentgh.");
            }
            if (!checkPasswordComplexity(password))
            {
                System.out.println( "Password is not correctly formatted, plase ensure that the password contains atleast characters, a captial letter, a number and  aspecial character");
            }
            System.out.println( "Username or password inncorect, plase try again");
        }
    }

   
}  

    

