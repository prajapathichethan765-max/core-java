class SubstractionOperation{
	public static void main(String[] args){
		char operation='-';
			
	
	if(operation=='+'){
		int a=10;
		int b=49;
		int result=SubstractionOperation.addition(a, b);
		System.out.println(result);
	}
	else if(operation=='*'){
		long a=2376;
		long b =8376;
		long result=SubstractionOperation.multiplication(a,b);
		System.out.println(result);
	}
	else if(operation=='/'){
		double a=736.2d;
		double b=213.21d;
		double result=SubstractionOperation.division(a, b);
		System.out.println(result);
	}
	else if(operation=='-'){
		float a=123.12f;
		float b=23.2f;
		float result=substaction(a,b);
		System.out.println(result);
	}		
    System.out.println("all t eh operations of math");
	
	int resultone=SubstractionOperation.addition(21,12);
		System.out.println(resultone);
		float resulttwo=SubstractionOperation.substaction(634.2f,212.1f);
		System.out.println(resulttwo);
		long resultthere=SubstractionOperation.multiplication(423,21211);
		System.out.println(resultthere);
		double resultfour=SubstractionOperation.division(2121.2d,3432.21);
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

		