package Java12;

public class LargestandSmalestNumbers {

	public static void main(String[] args) {
		
		int a[] = { 23, 34, 13, 64, 72, 90, 10, 15, 9, 27 };
		int min=0;
		int max=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max){
				max=a[i];
			}
			if(a[i]<min){
				min=a[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
}
