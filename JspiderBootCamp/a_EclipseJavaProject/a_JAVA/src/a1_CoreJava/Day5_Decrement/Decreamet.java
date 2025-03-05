package a1_CoreJava.Day5_Decrement;

public class Decreamet {
	public static void main(String args[]) {
		System.out.println("Program starts");
		decrement(10);
		System.out.println("Program Ends");
	}
	public static void decrement(int a) {
		if(a>=1) {
			System.out.println(a);
			a--;
			decrement(a);
		}
	}
}
