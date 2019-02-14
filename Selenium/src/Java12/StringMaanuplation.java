package Java12;

public class StringMaanuplation {

	public static void main(String[] args) {
		String a="Ramachandrareddy K";
		System.out.println(a.length());
		System.out.println(a.charAt(12));
		System.out.println(a.indexOf('y'));
		System.out.println(a.indexOf('a',a.indexOf('a')+1));
		String b="   Selenium     ";
		System.out.println(b.trim());
		System.out.println(b);
		String date="12/1/2018";
		System.out.println(date.replace('/', '-'));

	}

}
