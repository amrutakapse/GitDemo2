
public class JavaSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JavaSample s=new JavaSample();
		int a=8,b=9,c = 0;
		System.out.println("We are at main class");
		s.addition(a,b,c);
		s.multiplication(a, b, c);
		s.substraction(a, b, c);
		s.avarage(a, b, c);
	
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
public void avarage(int a, int b,int c)
{
	
	int f=(a+b+c)/3;
	System.out.println(f);
	
	}
}
