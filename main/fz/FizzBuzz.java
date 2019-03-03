package fz;

public class FizzBuzz {

	public static void main(String[] args) {
		for (int i = 1; i < 101; i++) {
			System.out.println(setFizzBuzz(i));
		}
	}
	
	public static String setFizzBuzz(int a) {
		if (a%15 == 0) {
			return "FizzBuzz" ;
		} else 
		if (a%5 == 0) {
			return "Buzz";
		} else
		if (a%3 == 0) {
			return "Fizz";
		}
		return String.valueOf(a);
	}
}
