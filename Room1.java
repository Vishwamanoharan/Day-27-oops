class Room1 
{
	public String facutly_name;
	private int age;
	private long contact;
	private double sal;

	private Room1(){
		//LI
	}

	public Room1(String facutly_name,int age,long contact,double sal){
		this.facutly_name=facutly_name;
		this.age=age;
		this.contact=contact;
		this.sal=sal;
	}
	public double amala(){
		return this.sal;
	}
	private int vimala(){
		return this.age;

	}


	public static void main(String[] args) 
	{
		Room1 sir1=new Room1("Tabrez",30,123445678,100000);
		Room1 sir2=new Room1("surya",31,123465678,1000);
		Room3 sirr1=new Room3("Bharatha",32,122645678,100044);
		Room3 sirr2=new Room3("Harish",33,123442698,100055);

		sirr1.Harsha();
		sirr2.Harsha();
		sir1.Girishi();
		sir2.Girishi();
}


public void Girishi(){
	System.out.println("Name:"+facutly_name);
	System.out.println("Age:"+age);
	System.out.println("Contact"+contact);
	System.out.println("Salary:"+sal);
}

}
