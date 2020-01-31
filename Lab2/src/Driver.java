
public class Driver {
	
	static int x=2;
	static int y=4;
	
	static int array[];

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		IterationMatlib iterationLibrary = new IterationMatlib();
		RecursiveMatlib recursionLibrary = new RecursiveMatlib();
		// TODO Auto-generated method stub
		
		System.out.println("Recursion");
		runCode(recursionLibrary);
		System.out.println("Iteration");
		runCode(iterationLibrary);
		
		
		

	}

	private static void runCode(MatLib library) {
		
		System.out.println("GCD("+x+","+y+") ="+library.gcd(x,y));
		
		System.out.println("ACK("+x+","+y+") ="+library.ack(x,y));
		
		System.out.println("Fibonacci("+ x +") numbers Series \n");
		   for(int i=0; i < x; i++) {
			   System.out.println(library.fib(i));
		   }
		   
		   System.out.println("Hanoi tower("+ x +"):" +library.hanoi(x));
		
		
		
	}

}
