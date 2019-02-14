package WebdriverBasics;

public class RevesString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Ramachandra";
		int i=a.length();
		String rev="";
		for (int j =a.length()-1; j >=1; --j) {
			rev=rev+a.charAt(j);
			
		}
		System.out.println(rev);
		StringBuffer s= new StringBuffer(a);
		System.out.println(s.reverse());
		

	}

}
