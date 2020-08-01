import java.util.*;
public class Overloading {
	static void calculate() {
	int n;
	n=23+45;
	System.out.println(n);
	}
	
	static void calculate(int a) {
		int b=15;
		int n= a+b;
		System.out.println(n);
	}
	static int calculate(int a, int b) {
		int sum=a+b;
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=14;
		int y=16;
		calculate();
		calculate(y);
		int ans= calculate(x,y);
		System.out.println(ans);

	}

}
