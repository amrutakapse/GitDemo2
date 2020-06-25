
public class JavaSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JavaSample s=new JavaSample();
		int a=8,b=9,c = 0;
		s.addition(a,b,c);
		s.multiplication(a, b, c);
		s.substraction(a, b, c);
		
	}
public void addition(int a, int b,int c)
{
	
	int f=a+b;
	System.out.println(f);
	
	}
public void multiplication(int a, int b,int c)
{
	
	int f=a*b;
	System.out.println(f);
	
	}
public void substraction(int a, int b,int c)
{
	
	int f=a-b;
	System.out.println(f);
	
	}
}
