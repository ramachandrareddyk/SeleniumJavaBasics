package NewJava;

public class DuplicatesInArray {

	public static void main(String[] args) {
		String a[]={"java","php","c","c++","java","c++"};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if((a[i].equals(a[j]))&&(i!=j)){
					System.out.println(a[i]);
				}
				
			}
			
		}

	}

}
