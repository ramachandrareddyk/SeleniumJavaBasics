package WebdriverBasics;

public class SwapingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=100;
		int b=200;
		/*a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		String x="ramu";
		String y="Gopi";
		x=x+y;
		y=x.substring(0,x.length()-y.length());
		x=x.substring(y.length());
		
		System.out.println("x = "+x);
		System.out.println("y = "+y);*/
		int c=a;
		a=b;
		b=c;
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
		String x="Ramu";
		String y="Gopi";
		x=x+y;
		y=x.substring(0,x.length()-y.length());
		x=x.substring(y.length());
		System.out.println(x);
		System.out.println(y);

		
		
	}

}
