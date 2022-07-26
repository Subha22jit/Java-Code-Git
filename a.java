import java.util.Scanner;
class a
{  public static void main(String args[])
{
int s,i;
Scanner r=new Scanner (System.in);
System.out.print("enter the array no");
s=r.nextInt();
int a[]=new int [s];
for(i=0;i<s;i++)
{
  a[i]=r.nextInt();
}
System.out.print("all no");
for(i=0;i<s;i++)
{
  System.out.print(a[i]+" ");
}

}
}