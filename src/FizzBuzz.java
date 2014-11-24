import java.io.Console;


public class FizzBuzz {

	  private static int N;

	public static void main(String[] args ) throws Exception {
		Console console = System.console();
	      do {
		  String line = console.readLine("Enter a number that is less than 10000000:  ");
	        N = Integer.parseInt(line);
	        if (N > Math.pow(10, 7)) {
	        	console.printf("Sorry, the number you enter must be less than 10000000.\n");
	        }
	      } while(N > Math.pow(10, 7));
	      
    for( int i = 1; i <= N; i++) {
  	  if (i % 15 == 0) {
  		  System.out.println("FizzBuzz");
  	  } else if (i % 3 == 0) {
  		  System.out.println("Fizz");
  	  } else if (i % 5 == 0) {
  		  System.out.println("Buzz");
  	  } else {
  		  System.out.println(String.valueOf(i));
  	  }
	      
		}
	}
}
	