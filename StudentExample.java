class Person
{
int age;
Person(int age)
{
this.age=age;
}
	
Person()
{
		
}
	
}
class Student extends Person
{
Student(String id,String name)
{
this.id=id;
this.name=name;
}
Student(String id)
{
this(id,null);
}
Student(String id,String name,int age)
{
super(age);
this.id=id;
this.name=name;
}
Student()
{
this("20","Adhi");
this.id="25";
}
String id;
String name;
}
class StudentExample
{
public static void main(String[] arg)
{
Student ob=new Student("20","String");
System.out.println(ob.id+" "+ob.name+" "+ob.age); 
Student ob1=new Student("10");
System.out.println(ob1.id+" "+ob1.name+" "+ob1.age);
Student ob3=new Student();
System.out.println(ob3.id+" "+ob3.name+" "+ob3.age);
Student ob4=new Student("20","raj",30);
System.out.println(ob3.id+" "+ob3.name+" "+ob3.age);
}
}
