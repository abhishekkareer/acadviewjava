import java.lang.*;
import java.util.*;
class Main {
  public static void main(String   [] aaa) {
   System.out.println("enter the no");
   Scanner ss=new Scanner(System.in);
   int a,b;
   int cc=0;
   a=ss.nextInt();
   b=a;
  while(a!=0)
  {
    int rem=a%10;
    cc=(cc*10)+rem;
    a=a/10;
  }
  if(cc==b)
  {
    System.out.println("no is palidrom");
  }
  else
  {
    System.out.println("no not is palidrom");
  }
   ss.close();
   }
}