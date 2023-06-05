class Employee 
{
	public String name;
	private int id;
	private double sal;
	public String desigation;

public Employee(String name,int id,double sal,String desigation){
	this.name=name;
	this.id=id;
	this.sal=sal;
	this.desigation=desigation;
}

public void Employee_details(){
	System.out.println("Enter the name"+name);
	System.out.println("Enter the id"+id);
	System.out.println("Enter the salary"+sal);
	System.out.println("Enter the designation"+desigation);
}
}