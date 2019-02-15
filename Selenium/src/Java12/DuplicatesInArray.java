package Java12;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesInArray {

	public static void main(String[] args) {
		String P[]={"java","php","c","java","c++","cc"};
		
		Set<String>s= new HashSet<String>();
		for(String name:P){
			if(s.add(name)==false){
				System.out.println(name);
			}
			
		}
		/*for (int i = 0; i < names.length-1; i++) {
			for (int j =i+1; j < names.length; j++) {
				if ((names[i].equals(names[j]))&&(i!=j)) {*/

		for (int i = 0; i < P.length-1; i++) {
			for (int j = i+1; j < P.length; j++) {
				if((P[i].equals(P[j]))&&(i!=j)){
					System.out.println(P[i]);
				}
				
			}
			
		}
		System.out.println(P.length);
		System.out.println(P.length);
	}

	public static void M1(){
		char a[]={1,2,3,5,64,1,3};
		/*for(int i=0;i<=a.length-1;i++){
			for (int j = i+1; j < a.length; j++) {
				if((a[i].equals(a[j]))&&(i!=j)){
					System.out.println(P[i]);
				}
				
			}
		}
*/	
		}
}
