package Pure_java;

public class Palindrome_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			  int r,sum=0,temp;    
			  int n=567;//It is the number variable to be checked for palindrome  
			  
			  temp=n;    
			  while(n>0){    
			   r=n%10;  // 5 ,5, 5 
			   sum=(sum*10)+r;    //(0*10)+5=5, (5*10)+5=55, (55*10)+5
			   n=n/10;    //55, 5, 0
			  }    
			  if(temp==sum)   { 
			   System.out.println("palindrome number ");    }
			  else    {
			   System.out.println("not palindrome");    
			}  
			}  
	}


