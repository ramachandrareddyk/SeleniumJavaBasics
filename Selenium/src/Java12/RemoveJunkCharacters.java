package Java12;

public class RemoveJunkCharacters {

	public static void main(String[] args) {
		String a="gsgfbjzb68435246+*-/@$$&^$VJGDJG";
		a=a.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(a);

	}

}
