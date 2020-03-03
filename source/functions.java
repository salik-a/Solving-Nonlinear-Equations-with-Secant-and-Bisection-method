package project2;

public class functions {
	public static void main(String[] args){

	}
	// this is our functions
	public static float function(int k,float x){
		float y=0;
		if(k==1)
			y= (float) (Math.pow(x,3)-2*x-5);
		else if(k==2)
			y= (float) (Math.exp(-x)-x);
		else if(k==3)
			y= (float) ((x*Math.sin(x*Math.PI/180)) - 1);
		else if(k==4)
			y= (float) (Math.pow(x,3)-3 * Math.pow(x,2)+3*x-1);
		return y;
	}



	public static float bisection(float a,float b,float tol,int k){
		float m ;
		float x;
		int iteration=0;

		do{//this part find midpoint accordint to do signs
			m = a+(b-a)/2;// this is midpoint


			if(function(k,a)<0 && function(k,m)<0 || function(k,a)>0 && function(k,m)>0)	
				a=m;
			else
				b=m;

			iteration++;
		}while(Math.abs(b-a)>tol);

		System.out.println("iteration:"+iteration);
		System.out.println();
		return m;
	}
	public static float secant(float x0,float x1,int k){
		float x2;
		int iteration=-1;
		do{//this part finds xk+1 with using secant method formula
			x2= x1- function(k,x1)*(x1-x0)/(function(k,x1)-function(k,x0));
			x0=x1;
			x1=x2;
			iteration++;
		}while(Math.abs(x2-x1)==0);
		System.out.println("Iteration number is:"+iteration);
		return x0;
	}
}


