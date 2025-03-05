package a1_CoreJava.Day4_PrintNumbers;

public class PrintNumber {

	public static void main(String args[]) {
		number(1);
	}
	public static void number(int a) {
		if(a<=10) {
			System.out.println(a);
			a++;
			number(a);
		}
	}
}
