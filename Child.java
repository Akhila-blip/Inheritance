class Parent
{ 
void m1(int a)
{ 
System.out.println("parent m1");
}
}
class Child extends Parent
{ 
void m1(int a)
{ 
System.out.println("child m1");
}
void m2()
{ 
this.m1(10);  
System.out.println("child m2");
super.m1(100); 
}
public static void main(String[] args)
{ 
Child c = new Child();
c.m2();
}
}
