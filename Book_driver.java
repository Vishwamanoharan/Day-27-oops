class Book_driver 
{
	public String b_name;
	private int price;
	private String color;

	public static void main(String[] args) 
	{
		BookEncap B1=new BookEncap("Java",120,"brown");
		BookEncap B2=new BookEncap("Sql",13,"Red");

		System.out.println("Book Name:"+B1.b_name);
		System.out.println("Price:"+B1.getprice());
		System.out.println("Colour:"+B1.getcolor());

		B1.setcolor("Orange");
		System.out.println(B1.getcolor());

	
		
	}


	
}
