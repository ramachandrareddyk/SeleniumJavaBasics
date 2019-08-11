package Java12;

public class IntReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=123456;
		int b=0;
		while(a!=0){
			int c=a%10;
			b=b*10+c;
			a/=10;
			
		}
		System.out.println(b);
		
	}

}
