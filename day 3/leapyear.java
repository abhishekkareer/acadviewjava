import java.lang.*;
import java.util.*;
class Main {
  public static void main(String   [] aaa) {
   System.out.println("enter the year");
   Scanner ss=new Scanner(System.in);
   int a;
   a=ss.nextInt();
   if((a%4==0)&&(a%100!=0))
   {
     System.out.println(a+"  this is the leap year");
   }
   else
   {
     System.out.println("this is not the leap year");
   }
   ss.close();
   }
}