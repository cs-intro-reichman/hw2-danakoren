// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		int num = Integer.parseInt(args[0]);
		double piSum = 0;
		double approximatedpi;
		for(int i = 0; i < num; i++){
			double odd = 1.0 / ( 1 + (i * 2));
			if(i % 2 == 0){
				piSum = piSum + odd;
			}else{
				piSum = piSum - odd;
			}

		}
		approximatedpi = piSum * 4 ;
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " +  approximatedpi);

	}
}
