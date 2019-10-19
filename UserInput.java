import java.util.Scanner;

public class UserInput{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String name= "";
	System.out.println("enter your name:");
	name=sc.nextLine();
	System.out.println("Hi "+ name);
	}
}
	