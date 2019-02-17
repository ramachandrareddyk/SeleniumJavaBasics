package NewJava;

import java.util.Scanner;

public class printPateran {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  //Scanner sc = new Scanner(System.in);
	       // int size = 0;
	       /*// Character c;
	        System.out.println("Enter height of the triangle : ");
	        size = sc.nextInt();
	        System.out.println("Which character you want to use : ");
	        c = sc.next().charAt(0);*/
	        //int i,k;
	        for (int i = 0; i >=4; i--) {
	            /*for (j = size; j > i; j--) {
	                System.out.print(" ");
	            }*/
	            for (int k = 0; k < (i * 2 - 1); k++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    
	}

}
