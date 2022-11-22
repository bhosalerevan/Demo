class Student {
	int id;
	String name;
	float fee;
	int age;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s= new Student();
		s.id=1;
		s.name="Revan ";
		s.fee=20000.25f;
		s.age=24;
		System.out.println("id=" + s.id + " name=" + s.name + "fee=" + s.fee + " age=" + s.age);
		Student s1= new Student();
		s1.id=2;
		s1.name="Abhijit";
		s1.fee=25000.70f;
		s1.age=30;
		System.out.println(s1.id + " " + s1.name + " " + s1.fee + " " + s1.age);


	}

}
