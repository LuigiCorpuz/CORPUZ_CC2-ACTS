import java.util.Scanner;

public class UserInputScanner{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String name="";
		System.out.println("Enter your name:");
		name = sc.nextLine();
			System.out.println("Hi " + name);
 
 	}
}	
