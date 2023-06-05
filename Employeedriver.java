class Employeedriver 
{
	public static void main(String[] args) 
	{
		Employee E1=new Employee("Lee",12,1000,"labour");
		Employee E2=new Employee("Leo",10,200,"Servan");
		Employee E3=new Employee("Su",11,2000,"Manager");
		Employee E4=new Employee("Ram",13,500,"PA");
		Employee E5=new Employee("Sam",9,1000,"labour");


		System.out.println("Emp1");
		E1.Employee_details();
		System.out.println("Emp2");
		E2.Employee_details();
		System.out.println("Emp3");
		E3.Employee_details();
		System.out.println("Emp4");
		E4.Employee_details();
		System.out.println("Emp5");
		E5.Employee_details();

		System.out.println("Enter the id"+E1.id);


		


	}
}
