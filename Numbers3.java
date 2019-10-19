import java.util.Scanner;
import java.io.*;
    public class Numbers3{
      public static void main(String[]args){
   
      try{
      Scanner sc = new Scanner(System.in);  
      System.out.println(" Input numbers from 0 -9");
        int aanum = sc.nextInt();
        int abnum = sc.nextInt();
        int acnum = sc.nextInt();
        int adnum = sc.nextInt();
        int aenum = sc.nextInt();
        int afnum = sc.nextInt();
    
     if(aanum >= 0 && aanum <=9 && abnum >=0 && abnum <=9 && acnum >=0 && acnum <=9 && adnum >=0 && adnum <=9 && aenum >=0 && aenum <=9 && afnum >=0 && afnum<=9){
          for (int y= 11;y <100; y++){
             int tens = y/10;
             int ones = y%10;
                 if(aanum==tens || abnum==tens || acnum ==tens || adnum==tens || aenum==tens || afnum==tens||
                aanum==ones || abnum==ones || acnum==ones || adnum==ones || aenum==ones || afnum==ones){
                      continue;
                    }
                 else{ 
                      System.out.println(y);
                    }
                }  
            }
     else{
         System.out.println("Error");
    }
 }
        catch(Exception aanum){
        System.out.println("Invalid Input"); 
       }
    }    
 }
 
 
 