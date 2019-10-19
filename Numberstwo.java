import java.util.Scanner;
   public class NumbersTwo{
      public static void main(String[] args){
    try Scanner sc = new Scanner(System.in);
       int  numa, numb, numc, numd, nume, numf;
            
       System.out.print(" Enter Input");
        numa= sc.nextInt();
        numb= sc.nextInt();
        numc= sc.nextInt();
        numd= sc.nextInt();
        nume= sc.nextInt();
        numf= sc.nextInt();
      
      int num=11;
      
      int tens = num/10;
      int ones = num%10;
      
     for(int y=11;y<99;y++){
        if(y==numa && y==numb && y==numc && y==numd && y==nume && y==numf){
       
        boolean ten = tens == numa||tens == numb||tens == numc||tens == numd||tens == nume||tens == numf;
        boolean one = ones == numa||ones == numb||ones == numc||ones == numd||ones == nume||ones == numf;
          
     
       }else{ 
         System.out.println(y);
       
     
      
         
         }
       }
     }
    }
   
 
