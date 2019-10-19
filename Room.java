import java.io.*;
import java.text.DecimalFormat;

public class Room{
  public static void main(String[] args)throws IOException{
  BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
  BufferedReader a = new BufferedReader(new InputStreamReader(System.in));

 
  
  System.out.println("Enter length");
    String inputString = b.readLine();
    double length = Double.parseDouble(inputString);
  System.out.println("Enter width");
    String inputg = a.readLine();
    double width = Double.parseDouble(inputg);
    double floor = (length*width);
    
    String pattern = ("#######.00");
    DecimalFormat df = new DecimalFormat(pattern);
    String number = df.format(floor);
    
   System.out.println("The floor space of the room is "+ number +" square units.");
  
   }
  }