package Java12;

public class StrigSplitting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="is he Ramachandra";
		char name[]=a.toCharArray();
		
		Character c = null;
		Character d= null;
		c=name[0];
		d=name[1];
		name[0]=name[3];
		name[1]=name[4];
		name[3]=c;
		name[4]=d;
		System.out.println(name);
		
	}

}
