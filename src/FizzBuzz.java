

public class FizzBuzz {

		int i;
		for (i = 1; i <= 100; i = i +1) {
			
			
		
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
