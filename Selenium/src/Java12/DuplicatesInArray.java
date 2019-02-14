package Java12;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesInArray {

	public static void main(String[] args) {
		String P[]={"java","php","c","java","c++","c"};
		
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
	}

}
