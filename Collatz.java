// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int N = Integer.parseInt(args[0]);
		String mode = args[1];
		String v = "v" ;
		String c = "c" ;
		if (mode.charAt(0) == v.charAt(0)){
			
			for (int seed = 1 ; seed <= N ; seed ++){
			int sum = 0;
			int newSeed = seed;
			do{
				System.out.print(newSeed + " ");
				if (newSeed % 2 == 0){
					newSeed /= 2;
				} else {
					newSeed = (newSeed * 3) + 1;
				}
				sum++;
			}while(newSeed!=1);
			System.out.println( "(" + (sum + 1) + ")" );
			
		}
		System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
	}
	else {
		if ( mode.charAt(0) == c.charAt(0)){
			System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
		}
	}
	
}
}