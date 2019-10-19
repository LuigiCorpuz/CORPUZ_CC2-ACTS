public class CC2_Lab3 { 
    public static void main(String [] args) {
    char l = 'L';
    char u = 'U';
    char i = 'I';
    char a = '!';
    int z = l;
    int n = u;
    int k = i;
    int p = a; 
     
     System.out.println("L-"+z);
     System.out.println("U-"+n);
     System.out.println("I-"+k);
     System.out.println("!-"+p);
     System.out.println(l+""+u+""+i+""+a);
    
     int b=z+n+k+p;
     int o=z*n*k*p;
     int y=(z+n+k+p)/5;
     int t=o%y;
     
     System.out.println("Sum:" + b);
     System.out.println("Product:" + o);
     System.out.println("Average:" + y);
     System.out.println("Remainder:" + t);
     
    } 
    }