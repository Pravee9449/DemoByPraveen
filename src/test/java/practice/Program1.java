package practice;

public class Program1  {
	static int ha=10;
	int b=20;
	
	static public void running()
	{
		System.out.println("This is static same class");
	}
	
	public void practice()
	{
		System.out.println("isit working....");
	}
	
	

	public static void main(String[] args) {
		
		Program1 p=new Program1(); 
		Program2 p2=new Program2();
		System.out.println(ha);
		System.out.println(p.b);
		running();
		p.practice();
		
		System.out.println(p2.c);
		System.out.println(p2.d);
		p2.runthe();
		p2.anotherclass();
		
		
	}

}
