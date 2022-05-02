package com.callor.school.exec;

public class ExecV2 {

	public static void main(String[] args) {

		int[] intKor = new int[5];
		int[] intEng = new int[5];
		int[] intMath = new int[5];

		int[] intSum = new int[5];

		for (int i = 0; i < intKor.length; i++) {
			int iKor = (int) (Math.random() * 100) + 1;
			int iEng = (int) (Math.random() * 100) + 1;
			int iMath = (int) (Math.random() * 100) + 1;
			int iSum = iKor + iEng + iMath;

			intKor[i] = iKor;
			intEng[i] = iEng;
			intMath[i] = iMath;
			intSum[i] = iSum;
		}
		printScore(intKor, intEng, intMath, intSum);
		for(int i=0; i< intSum.length; i++) {
			for(int j =i +1 ; j < intSum.length; j++ ) {
				if(intSum[i] > intSum[j]) {
					int _t = intSum[i];
					intSum[i] = intSum[j];
					intSum[j] = _t;
			
					int _a = intKor[i];
					intKor[i] = intKor[j];
					intKor[j] = _a;
			
					int _v = intEng[i];
					intEng[i] = intEng[j];
					intEng[j] = _v;

					int _d = intMath[i];
					intMath[i] = intMath[j];
					intMath[j] = _d;
					
				}
			}
		}

					
		
		printScore(intKor, intEng, intMath, intSum);
		
	}

	private static void printScore(int[] intKor, int[] intEng, int[] intMath, int[] intSum) {

		System.out.println("==========");
		for (int i = 0; i < intKor.length; i++) {
			System.out.printf("%3d\t", intKor[i]);
			System.out.printf("%3d\t", intEng[i]);
			System.out.printf("%3d\t", intMath[i]);
			System.out.printf("%3d\n", intSum[i]);
		}
		

	}
}