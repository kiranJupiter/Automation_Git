package Pure_java;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

public class String_Revese {

Scanner data;

public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner data = new Scanner(System.in);
System.out.println("Please enter the word that you want to revese");
String word =data.next();
int s=word.length();
System.out.println(s);
for(int i=word.length()-1 ;i>=0;i--){
	System.out.print(word.charAt(i));
	}

System.out.println();
//String_Revese a1=new String_Revese();
//a1.Largest_word_InString();

	}
//public void Largest_word_InString() {
//	String temp= null;
//	int i=0;
//	String s= "I am Good";
////System.out.println("Enter the string to find largest word");
////String word1=data.next();
//String[] a = s.split(" ");;
//	if(a[i].length()>a[i+1].length()&&a[i].length()>a[i+2].length()) {
//		temp=a[i];
//		
//	}else if(a[i+1].length()>a[i+2].length()&&a[i+1].length()>a[i].length()) {
//		temp=a[i+1];
//	}else {
//		temp=a[i+2];
//	}
//	System.out.println(temp);
//		
//	
//}
}