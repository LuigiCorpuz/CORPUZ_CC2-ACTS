import java.util.*;
public class Calculator{
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in); 
      String operation;
      int l,k ;
     
      
      System.out.println("Enter # of operations");
       int vb =sc.nextInt();
       
      if(vb >=1 & vb <= 100){
        System.out.print("Enter all operations in one line:");
        //while(counter <= highestNum) {.....counter++;}
        for(int p=1; p<=vb;p++){
        operation=sc.next();
        
        if(operation.equals("negate")){
            l=sc.nextInt();
            System.out.println( -l);
       }else if(operation.equals("add")){
          l=sc.nextInt();
          k=sc.nextInt();
          System.out.println(l+k);
       }else if(operation.equals("max")){
          l=sc.nextInt();
          k=sc.nextInt();
          if(l>k)
            System.out.println(l);
          else 
            System.out.println(k);
            
       
        }else{
        System.out.println("invalid input");
        }
       
      } 
    }
     
     else{
      System.out.println("invalid input");
    }
  
  }
}