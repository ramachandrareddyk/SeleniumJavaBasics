package Java12;

public class ReverseString {

	public static void main(String[] args) {
		String a="Ramachandra";
		StringBuffer b= new StringBuffer(a);
		System.out.println(b.reverse());
		
		String x="Selenium";
		int s=x.length();
		String y="";
		for (int i = s-1; i >=0; i--) {
			y=y+x.charAt(i);
			
			
		}
		System.out.println(y);
		int Z=123456;
		System.out.println(new StringBuffer(String.valueOf(Z)).reverse());
	}

}
