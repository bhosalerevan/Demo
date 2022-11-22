class Employee
{
int id,sal;
String name;
public static void main(String []args)
{
Employee e= new Employee();
e.id=1;
e.name="Revan";
e.sal=20000;
System.out.println(e.id + " " + e.name + " " + e.sal);
Employee e1= new Employee();
e1.id=2;
e1.name="Abhijit";
e1.sal=25000;
System.out.println(e1.id + " " + e1.name + " " + e1.sal);

Employee e2= new Employee();
e2.id=3;
e2.name="Rohit";
e2.sal=30000;
System.out.println(e2.id + " " + e2.name + " " + e2.sal);

}

}