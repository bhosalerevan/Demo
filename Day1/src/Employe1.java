
class Employe1 {
int id;
String name;
int sal;
public void emp(int a , String b , int c)
     {
	//id=a;
	//name=b;
	//sal=c;
System.out.println(a + " " + b + " " + c);
	}
public static void main(String[] args) 
   {
	Employe1 e= new Employe1();
	e.emp(1,"Revan",20000);
   }
}
