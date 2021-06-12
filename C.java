class C
{ 
void m1()
{
System.out.println("m1 method");
}
}
class D extends C
{ 
void m2()
{
System.out.println("m2 method");
}
}
class E extends D
{ 
void m3()
{
System.out.println("m3 method");
}
public static void main(String[] args)
{ 
C c= new C(); 
c.m1(); 
D d = new D(); 
d.m1();
d.m2();
E e = new E(); 
e.m1(); 
e.m2(); 
e.m3();
}
}