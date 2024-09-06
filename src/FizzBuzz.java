

public class FizzBuzz {

	public static void main(String[] args) {
	//set variable i (i is the integer variables that are going to be replaced) 
		int i;
		for (i = 1; i <= 100; i = i +1) {
			
			
	//if statement to encapsulate when to print fizz, buzz, and fizzbuzz
		if (i % 3 == 0 && i % 5 == 0) {
			System.out.println("FizzBuzz"); }
			else if(i % 3 == 0) {
				System.out.println("Fizz"); }
			else if(i % 5 == 0) {
				System.out.println("Buzz"); }
		
			else {
				System.out.println(i);
			}
			}
		}
}	

