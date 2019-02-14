package WebdriverBasics;

public class LargestandsmalestinArray {

	public static void main(String[] args) {
		int a[]={1,2,5,4,8,9,25};
		int largest=a[0];
		int smalest=a[0];
		for (int i = 1; i < a.length; i++) {
			if(a[i]>largest){
				largest=a[i];}
				else if(a[i]<smalest){
					smalest=a[i];
				}
			
		}
		System.out.println(largest);
		System.out.println(smalest);
	}

}
