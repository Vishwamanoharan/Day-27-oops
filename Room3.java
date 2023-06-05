class Room3

{
	public String faculty_name;
	private int age;
	private long contact;
	private double sal;

	private Room3(){
		//LI
	}
	
	public Room3(String faculty_name,int age,long contact,double sal){
		this.faculty_name=faculty_name;
		this.age=age;
		this.contact=contact;
		this.sal=sal;
		
	}

	public int Praveen(){
		return age;
	}

	private double prathap(){
		return sal;
	}

	public  void Harsha(){

		System.out.println("Haii From"+faculty_name);
		System.out.println("Im at present"+age);
		System.out.println("Im avaliable by"+contact);
		System.out.println("I get in"+sal);
		

		
	}



}
