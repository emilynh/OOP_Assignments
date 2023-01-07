package javabasics1;

public class HarmonicSum {
	public static void main(String[] args) {
		final int MAXDENOMINATOR = 50000;
		double sumL2R = 0.0;
		double sumR2L = 0.0;
		double absDiff;
		
		for(int denominator = 1; denominator <= MAXDENOMINATOR; denominator++) {
			sumL2R += 1/((double)(denominator));
		}
		System.out.println("The sum from left-to-right is: " + sumL2R);
		
		for(int denominator = 50000; denominator >= 1; denominator--) {
			sumR2L += 1/((double)(denominator));
		}
		System.out.println("The sum from right-to-left is: " + sumR2L);
		
		if(sumL2R > sumR2L) {
			absDiff = sumL2R - sumR2L;
		}else {
			absDiff = sumR2L - sumL2R;
		}
		System.out.println("The absolute between these two sums is: " + absDiff);
	}
}

//The sum from left-to-right is: 11.397003949278504
//The sum from right-to-left is: 11.397003949278519
//The absolute between these two sums is: 1.4210854715202004E-14