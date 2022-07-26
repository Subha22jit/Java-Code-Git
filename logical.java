import java.util.Scanner;
class logical
{
   public static void main(String args[])
 {
 int a,b,c,d;
 System.out.println("enter 4 numbers");
 Scanner obj=new Scanner(System.in);
 a=obj.nextInt();
 b=obj.nextInt();
 c=obj.nextInt();
 d=obj.nextInt();
  
 System.out.println("logical and");
 System.out.println((a<b) && (b<c));
 System.out.println((a<b) && (b>c));
 System.out.println((a>b) && (b>c));

 System.out.println("logical or");
 System.out.println((a<b) || (b<c));
 System.out.println((a<b) || (b>c));
 System.out.println((a>b) || (b>c));

 System.out.println("logical not");
 System.out.println(!(a<b));
 System.out.println(!(b>c));
 }
}