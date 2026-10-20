class Calculator{
	public static void main(String[] args){
		char operationOne='+';
		char operationTwo='-';
		char operationThere='/';
		char operationFour='*';
		char operationFive='%';
		
		if(operationOne=='+'){
		int result=Calculator.addition(10,20);
		System.out.println(result);
		}
		else if (operationOne=='-'){
			int result=Calculator.substraction(20,56);
			System.out.println(result);
		}
		else if(operationOne=='*'){
			long result=Calculator.multipication(3752 , 2311);
			System.out.println(result);
		}
		else if(operationOne=='/'){
			double result=Calculator.division(236.3d,122.23d);
					System.out.println(result);
		}
else {
				System.out.println("invalid input");
}
			System.out.println("operations of two number");
			int resultOne=Calculator.addition(62 , 21);
    			System.out.println(resultOne);
				
			int resultTwo=Calculator.substraction(52 ,12);
			System.out.println(resultTwo);
			
			long resultThere=Calculator.multipication(523 , 211);
			System.out.println(resultThere);
			
			double resultFour=Calculator.division(122.21d,1221.2d);
			System.out.println(resultFour);
					
		}
		static int addition(int a , int b){
		int sum=a+b;
		return sum;
		}
		static int substraction(int a , int b){
			int sum=a-b;
			return sum;
		}
		static long multipication(long a , long b){
			long sum=a*b;
			return sum;
		}
		static double division(double a ,double b){
			double sum=a/b;
			return sum;
		}
	}


		
			
		
			