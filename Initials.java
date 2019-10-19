import javax.swing.*;

public class Initials{
	public static void main(String[] args){
		String firstname ="";
		String middlename ="";
		String lastname = "";
		
		firstname=JOptionPane.showInputDialog("Enter your first name's initial");
		char t = firstname.charAt(0);
		middlename=JOptionPane.showInputDialog("Enter your middle name's initial");
		char u = middlename.charAt(0);
		lastname=JOptionPane.showInputDialog("Enter your last name's initial");
		char v = lastname.charAt(0);
		
	JOptionPane.showMessageDialog(null,""+ t + " "+ u + " "+ v );
		
		
		}
	
	}