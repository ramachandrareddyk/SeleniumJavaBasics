package Java12;

public class SwapTwoNumbers {
	
	public static void main(String[] args) {
			
	/*int a= 100;
	int b=250;
	// using thard variable
	int c=a;
	a=b;
	b=c;
	System.out.println(a);
	System.out.println(b);*/
	
	/*// Swaping Strings
		String x="Ramu";
		String y="Roopa";
		String z=x;
		
		x=y;
		y=z;
		System.out.println(x);
		System.out.println(y);*/
		
	//Witout using thard variable
	/*a=a+b;
	b=a-b;
	a=a-b;
	
	System.out.println(a);
	System.out.println(b);*/
		String p="Ramu";
		String q="Roopa";
		p=p+q;
		q=p.substring(0, p.length()-q.length());
		p=p.substring(q.length());
		System.out.println(p);
		System.out.println(q);
		
		String s="Selenium";
		int l=s.length();
		String rev="";
		for (int i =l- 1; i >=0; i--) {
			rev=rev+s.charAt(i);
			System.out.println(rev);
			
		}
		}

	private static String charAt() {
		// TODO Auto-generated method stub
		return null;
	}
}
