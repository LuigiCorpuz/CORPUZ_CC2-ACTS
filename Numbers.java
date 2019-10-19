import java.util.Scanner;
   public class Numbers{
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
    
      int num=11;
     
      while(num<=99){
      
           int tens = num/10;
           int ones = num%10;
           boolean ten = tens == aanum||tens == abnum||tens == acnum||tens == adnum||tens == aenum||tens == afnum;
           boolean one = ones == aanum||ones == abnum||ones == acnum||ones == adnum||ones == aenum||ones == afnum;
         
        if(ten==true || one==true){
          num++;
          
          }else{ 
             System.out.println(num);
              num++;
            }
           
          
           }
        }
        catch(Exception aanum){
        System.out.println("Invalid Input"); 
        } 
      }
   }   
 
 
 