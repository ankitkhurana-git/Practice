
public class Palindrome {
public static void main(String[] args) {
	
	int a = 567;
	int pd =0;
	
	while (a>0) {
		int b = a%10;
		pd = pd *10 + b;
		a = a/10;
		
	}
	System.out.println(pd);
}
}
