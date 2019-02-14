package WebdriverBasics;

public class ReoveJunkvaus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="79$#%%HJkkjhCHhg()(*&hfbvcGXGX";
		a=a.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(a);
	}

}
