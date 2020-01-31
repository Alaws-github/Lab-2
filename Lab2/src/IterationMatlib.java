
public class IterationMatlib extends MatLib {

	@Override
	public int gcd(int x, int y) {
		if(!(x == 0 || y == 0)) {
			for(int i = x; i > 0; i--) {

				if(x % i==0 && y % i==0) {
					return i;
				}	
			}
		}
		return x+y;
	}



	@Override
	public int fib(int x) { 
        int  f1 = 0, f2 = 1, n = 0;
        for (int i = 0; i < x; ++i)
        { 
            n = f1 + f2;
            f1 = f2;
            f2 = n;
        }
		return f1;
		
			
		
	}

	@Override
	public int hanoi(int n) {
		// TODO Auto-generated method stub
		int moves = 2;
		for(int i=1; i < n; i++) {
			moves *= 2;
		}
		return moves-1;
	}



	@Override
	public int ack(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

}