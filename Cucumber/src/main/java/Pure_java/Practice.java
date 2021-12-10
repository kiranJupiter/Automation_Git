package Pure_java;

public class Practice {

	public static void main(String[] args) {
		// to print 1 to 5
		int i = 1;
		Practice abc = new Practice();
		abc.methodTwo();
//
//	for (i = 1; i <= 5; i++) {
//		System.out.print(i);
//	}
//
//	// odd or even no
//	while (i <= 100) {
//		if (i % 2 == 0) {
//			System.out.println("even");
//		} else {
//			System.out.println("odd");
//		}
//		i++;
//	}
//		
	
		while (i <= 5) {
			System.out.println(i);
			;
			i++;
		}
abc.methodOne();
	}

	public void methodOne() {
		System.out.println("From methodOne");
	}
	void methodTwo() {
		System.out.println("From methodTwo");
	}
}
