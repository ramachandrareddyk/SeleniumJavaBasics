package Java12;

public class StringSplit {

	public static boolean isNumeric(int i){

		  return  (i >= '0' && i <= '9');

		 }

		 public static boolean isAlphabet(char ch)
		 {
		  return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
		 }

		 public static String reverseString(String str){

		  char[] cArray = str.toCharArray();
		  int l=0;
		  int r = str.length()-1;
		  char temp;

		  while(l<r){
		   
		   if(!isAlphabet(cArray[l])){
		    l++;
		   }else if(!isAlphabet(cArray[r])){
		    r--;
		   }else{
		    temp = cArray[r];
		    cArray[r] = cArray[l];
		    cArray[l] = temp;
		    l++;
		    r--;

		   }
		  }
		  return new String(cArray);

		 }
		 
		 public static String reverseInteger(String str){
		  
		  char[] cArray = str.toCharArray();
		  int l=0;
		  int r = str.length()-1;
		  char temp;

		  while(l<r){
		   
		   if(!isNumeric(cArray[l])){
		    l++;
		   }else if(!isNumeric(cArray[r])){
		    r--;
		   }else{
		    temp = cArray[r];
		    cArray[r] = cArray[l];
		    cArray[l] = temp;
		    l++;
		    r--;

		   }
		  }
		  return new String(cArray);
		  
		 }
		 

		 public static void main(String[] args) {

		  String givenStr = "123Rama456";
		  
		  System.out.println("output 1 : "+reverseString(givenStr));
		  System.out.println("output 2 : "+reverseInteger(givenStr));

		 }

		}

