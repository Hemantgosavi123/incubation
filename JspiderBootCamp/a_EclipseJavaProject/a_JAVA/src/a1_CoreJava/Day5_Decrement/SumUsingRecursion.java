package a1_CoreJava.Day5_Decrement;

public class SumUsingRecursion {
	public static void main(String args[]) {
		System.out.println(sum(5));
	}
	
	public static int sum(int a) {
		if(a==1) {
			return 1;
		}else {
			return a+sum(a-1);
		}
	}
}
