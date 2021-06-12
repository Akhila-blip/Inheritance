class B
{
static int m=30;
public static void m1()
{
}
}
class C extends B
{
static int n=20;
public static void m2()
{
}
}
class HeirarchyInheritance extends C
{
static int j=15;
public static void m3()
{
}
public static void main(String[]args)
{
B.m1();
C.m1();
C.m2();
System.out.println(m);
System.out.println(m);
System.out.println(n);
}
}

