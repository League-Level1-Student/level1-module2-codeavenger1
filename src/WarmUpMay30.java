
public class WarmUpMay30 {
	int number;
	
	public void WarmUpMay30() {
		number = 10;
	}
	
	public static void main(String[] args) {
		for (int i = 10; i > 0; i--) {
			if (i > 2) {
				System.out.println(i);
			}

			else if (i == 2) {
				System.out.println("two");
			}

			else if (i == 1) {
				System.out.println("one");
			}

		}
		
		System.out.println("ignition blast off");
	
	
	
	
	
	WarmUpMay30 warm = new WarmUpMay30();
	System.out.println("Number: " + warm.number);
	
}
}