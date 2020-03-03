//-----------------------------------------//
// MATH226 - Numerical Methods for EE
// Project 02
//
// Name-Surname: <Alper Salik>
// Student ID: <041502005>
//-----------------------------------------//


package project2;

import java.util.Scanner;

public class project2 {
	public static void main(String[] args){

		Scanner scan =new Scanner(System.in);
		functions func =new functions();

		// in this part you choose function
		System.out.println("Which function do you prefer:");
		System.out.println();
		System.out.println("Number 1:x^3 − 2x − 5 = 0  Number 2:e^−x − x = 0  Number 3:x sin(x) −1 = 0  Number 4:x^3 − 3x^2 + 3x −1= 0 ");
		System.out.println();
		System.out.println("Give Number:");
		int k=scan.nextInt();

		// in this part you choose method
		System.out.println("Choose method: Number 1: Bisection Number 2: Secant ");
		System.out.println("Give Number:");
		int l=scan.nextInt();

		if(l==1){//call bisection method
			System.out.println("Enter tolerans:");
			float tol=scan.nextFloat();
			System.out.println("Enter a:");
			float a=scan.nextFloat();
			System.out.println("Enter b:");
			float b=scan.nextFloat();
			//this part check that is there root between a and b
			if(func.function(k,a)<0 && func.function(k,b)<0 || func.function(k,a)>0 && func.function(k,b)>0){
				System.out.println("There is no root");	
			}
			else{
				System.out.println("Bisection solution is:"+func.bisection(a, b, tol, k));}
		}
		else if(l==2){//call secant method

			System.out.println("Enter x0:");
			float x0=scan.nextFloat();
			System.out.println("Enter x1:");
			float x1=scan.nextFloat();


			System.out.println("Secant solution is:"+func.secant(x0, x1, k));

		}

	}
}
