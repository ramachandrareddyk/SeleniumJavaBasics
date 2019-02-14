package Java12;

public class PrimeNumbers {

	public static void main(String[] args) {
		for(int i=2;i<=100;i++){
			for(int j=2;j<=i;j++){
			if(j==i){
				System.out.println("Prime number is : "+i);
			}
			if(i%j==0){
				break;
			}
			}
		}

	}

}
