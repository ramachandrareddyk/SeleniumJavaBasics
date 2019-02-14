package NewJava;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2;i<=100;i++){
			for(int j=2;j<=i;j++){
				if(i==j){
					System.out.print(i);
				}
				if(i%j==0){
					break;
				}
			}
		}

	}

}
