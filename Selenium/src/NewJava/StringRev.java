package NewJava;

public class StringRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseString();

		String S="Selenium";
		int l=S.length();
		String rev="";
		for(int i=l-1;i>=0;i--)
		{
			rev=rev+S.charAt(i);
			//System.out.println("String Rev= "+rev);

		}
		System.out.println("String Rev= "+rev);
		
		/*String R="Ramachandra";
		StringBuffer ss=new StringBuffer(R);
		System.out.println(ss.reverse());*/
	}

	public static void ReverseString(){
		String name="Ramachandra";
		int length=name.length();
		String rev="";
		for (int i = length-1;i>=0; i--) {
			rev=rev+name.charAt(i);
			
		}
		System.out.println("String value= "+rev);
	}
}
