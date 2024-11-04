package ninety;
class Practice
{
public static void main(String[]args) 
{
	Monday s=new Monday();
	Monday.disp(s); 
	Monday.disp1(s);
	
	Tuesday s1=new Tuesday();
	Tuesday.demo(s1);


	
}
}
   class Monday
{
	int a=2;
	int b=45;
	void disp2(int a)
	{
		this.a=a;
	}
	

     static void disp1(Monday s)
{
    	System.out.println(s);
	System.out.println(s.b);
	
}
	

	    static void disp(Monday s)
	{
	    
		System.out.println(s.a);
		
	}
}
	
  class Tuesday
	{
		 int a=23;
		 static void demo(Tuesday d)
		{
			System.out.println(d.a);
		}
	}
	 

	 
