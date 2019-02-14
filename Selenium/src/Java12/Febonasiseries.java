package Java12;

public class Febonasiseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10, t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        /*
        for (int i = 1; i <=1000; i++) {
			if(i%7==0 & i%5!=1){
					System.out.println(i);
				}
			}
		int a=10, b=0, c=0;
		for (int i = 1; i <=a; ++i) {
			int sum=b+c;
			b=c;
			c=sum;
			System.out.println(b+ " +  ");
			
		}*/
	}

}
