class Book
{
	public String bname;
	private double price;
	private String color;

	public Book (String bname,double price,String color){
		this.bname=bname;
		this.price=price;
		this.color=color;
	}

	//behaviours of helpers

	public double getprice(){
		return this.price;
	}

	public String getcolor(){
		return color;
	}

	public void setcolor(String m_color){
		this.color=m_color;
	}

	
}  



