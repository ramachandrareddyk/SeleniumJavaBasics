package WebdriverBasics;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesInArray {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		//String names[]={"ramu","gopi","asif","ramu","jag"};
		/*Set<String>store=new HashSet<String>();
		for(String name:names){
 			if(store.add(name)==false){
				System.out.println("Duplicates are= "+names);*/
				
				
		int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};
		 
        for (int i = 0; i < my_array.length-1; i++)
        {
            for (int j = i+1; j < my_array.length; j++)
            {
                if ((my_array[i] == my_array[j]) && (i != j))
                {
                    System.out.println("Duplicate Element : "+my_array[j]);
                }
            }
        }
	
	String names[]={"ramu","gopi","asif","ramu","jag"};
	for (int i = 0; i < names.length-i; i++) {
		for (int j = i; j < names.length; j++) {
			if((names[i]==names[j]) && (i!=j))
			{
				System.out.println("Duplicate Element : "+names[j]);
			}
		}
		
	}
	}
	

}
