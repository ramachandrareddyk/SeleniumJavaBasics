package NewJava;

public class Swaping {

	static int a=10;
	static int b=20;
	
	static String s="Ram";
	static String t="Gopi";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=100;
		int j=200;
		int k=i;
		i=j;
		j=k;
		System.out.println("i= "+i+"; j= "+j);
		m1();
		m2();
	}
	public static void m1(){
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a= "+a+"; b= "+b);
		
	}
	public static void m2(){
		s=s+t;
		t=s.substring(0, s.length()-t.length());
		s=s.substring(t.length());
		System.out.println("s= "+s+"; t= "+t);
	}
	

}
