public class A
{
int i=25;
public void m1()
{
}
}
class B extends A
{
int k=45;
public void m2()
{
}
public static void main(String[]args)
{
B obj=new B();
System.out.println(obj.k);
}
}

