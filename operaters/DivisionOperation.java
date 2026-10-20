class DivisionOperation{
	public static void main(String[] args){
		char operation='/';
			
	
	if(operation=='+'){
		int a=80;
		int b=69;
		int result=DivisionOperation.addition(a, b);
		System.out.println(result);
	}
	else if(operation=='*'){
		long a=2876;
		long b =7676;
		long result=DivisionOperation.multiplication(a,b);
		System.out.println(result);
	}
	else if(operation=='/'){
		double a=836.2d;
		double b=2983.21d;
		double result=DivisionOperation.division(a, b);
		System.out.println(result);
	}
	else if(operation=='-'){
		float a=765.12f;
		float b=82.2f;
		float result=substaction(a,b);
		System.out.println(result);
	}		
    System.out.println("all t eh operations of math");
	
	int resultone=DivisionOperation.addition(21,12);
		System.out.println(resultone);
		float resulttwo=DivisionOperation.substaction(634.2f,212.1f);
		System.out.println(resulttwo);
		long resultthere=DivisionOperation.multiplication(423,21211);
		System.out.println(resultthere);
		double resultfour=DivisionOperation.division(2121.2d,3432.21);
		System.out.println(resultfour);		
			
	}
	static int addition(int a, int b){
		int sum=a+b;
		return sum;
	}
	static float substaction( float a, float b){
		float sum=a-b;
		return sum;
	}
	static long multiplication( long a , long b){
		long sum= a*b;
		return sum;
	}
	static double division(double a, double b){
		double sum=a/b;
		return sum;
	}
}

		