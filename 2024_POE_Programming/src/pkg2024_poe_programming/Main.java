
package pkg2024_poe_programming;

import javax.swing.JOptionPane;




public class Main
{

    public static void main(String[] args)
    {
        // asking the user to enter thier details
        String username = JOptionPane.showInputDialog("Enter username:");
        String password = JOptionPane.showInputDialog("Enter password:");
        String firstName = JOptionPane.showInputDialog("Enter first name:");
        String lastName = JOptionPane.showInputDialog("Enter last name:"); 
        
    POEtaskClass obj = new POEtaskClass(username, password, firstName,lastName);
    // calling the specific methods
    obj.checkPasswordComplexity(password);
    obj.checkUsername(username);
    obj.registerUser();
        
    }
    
}
