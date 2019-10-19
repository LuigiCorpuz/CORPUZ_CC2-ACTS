import java.util.*;
public class Grade{
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int nm = 0;
    nm = sc.nextInt();
   
         if (nm>91&&nm<101){
            System.out.println("A");
          }else if (nm>86&&nm<92){
             System.out.println("B+");
          }else if (nm>82&&nm<87){
              System.out.println("B");
          }else if (nm>78&&nm<83){
              System.out.println("C+");
          }else if (nm>74&&nm<79){
               System.out.println("C");
          }else if (nm>69&&nm<75){
               System.out.println("D");
          
          }else if (nm<=69){
               System.out.println("F");
          
        }
      }
    } 
     
     
        