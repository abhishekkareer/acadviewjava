import java.lang.*;
import java.util.*;
class Main {
  public static void main(String   [] aaa) {
   System.out.println("enter the no");
   Scanner ss=new Scanner(System.in);
   int a,b,c;
    a=ss.nextInt();
    b=ss.nextInt();
    c=ss.nextInt();
    
    if(a >= b && a >= c)
    {
        System.out.println("no 1 is biggest"+a);
    }

    if(b >= a && b >= c)
    {
        System.out.println("no 2 is biggest"+b);
    }

    if(c >= a && c >= b) {
         System.out.println("no 3 is biggest"+c);
    }
   ss.close();
   }
}