class test
{
   int x;
  public void input()
  {
    
   
    int x=20;
    System.out.println(x);
    
    
  }
}
class sub extends test
{
   
 public void display()
  {
    
  }
}
class sub2 extends sub
{
  public void input()
  {
    
    super.input();
    int x=10;
    
   System.out.println(x);
    
  }
}
class sub1
{
public static void main(String args[])
{
  sub2 t = new sub2();
  t.input();
  t.display();
}
}