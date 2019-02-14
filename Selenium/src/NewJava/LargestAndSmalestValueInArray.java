package NewJava;

public class LargestAndSmalestValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={-1,0,5,85,25,451};
		int l=a[0];
		int s=a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]>l){
				l=a[i];
			}
			if (a[i]<s) {
				s=a[i];
			}
		}
		System.out.println(l);
		System.out.println(s);
	}

}
