import java.util.*;
class Fibonacci{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		int a=0,b=1;
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<(n-2);i++){
			int c;
			c=a+b;
			System.out.println(c);
			a=b; b=c;
		}
	}
}