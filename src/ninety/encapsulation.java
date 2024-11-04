package ninety;

public class encapsulation
{
	private int a=10;
	public int getA()
	{
		return a;
	}
	public void setA(int a)
	{
		this.a=a;
	}

	public static void main(String[] args) 
	{
		encapsulation s=new encapsulation();
		System.out.println(s.getA());
		s.setA(26);
		System.out.println(s.getA());
		
		// TODO Auto-generated method stub

	}

}
