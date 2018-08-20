import java.lang.*;
import java.util.*;
class Main {
  public static void main(String   [] aaa) {
   System.out.println("enter the no");
   Scanner ss=new Scanner(System.in);
   int a,b=0;
    a=ss.nextInt();
    for(int i=2;i<a;i++)
    {
      if(a%i==0)
      {
        b++;
        break;
      }
    }
    if(b==0)
    {
    System.out.println("no is prime");
    }
    else
    {
    System.out.println("no is not prime");
    }
   ss.close();
   }
}