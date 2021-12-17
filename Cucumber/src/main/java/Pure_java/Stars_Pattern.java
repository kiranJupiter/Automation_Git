package Pure_java;
import java.util.*;


public class Stars_Pattern {
	public static void main(String[] args) {
// don't get confused for unary operator. Here after completing one loop, it will get incremented
	
		Stars_Pattern a1= new Stars_Pattern();
		for (int i = 0; i <= 5; i++) {
			//System.out.print("*");
			for (int j = 0; j<=i  ; j++) {
				
				System.out.print("+");
				
			}
		System.out.print("\n");
		}
System.out.println();	
	a1.another_Star_Pattern();
	}
	

	
public void another_Star_Pattern() {
	
	
	for (int i=1; i<=4;i++) {
		for(int j=1;j<=4;j++) {
			if(i==1||j==1||i==4||j==4) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
		}System.out.print("\n");
	}
	
}
}
