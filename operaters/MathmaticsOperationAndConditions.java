class MathmaticsOperationAndConditions{
	public static void main(String[] args){
		int a = 60;
		int b = 10;
		int c= 20;
		int d = 40;
		long e = 5000;
		long f = 10000;
		long g = 43200;
		long h = 5251;
		
		int sum1= a+b;
		int sum2= a-b;
		int sum3= a/b;
		int sum4= a%b;
		int sum5= a/b;
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);
		System.out.println(sum5);
		
		if(a>b && c<d){
		int result = MathmaticsOperationAndConditions.addition( 100 , 200);
        System.out.println(result);
		}
		else if(a==b && c<=d){
			int result = MathmaticsOperationAndConditions.substaction(454 , 332);
	        System.out.println(result);
		}
		else if(b<a && c<d){
			long result = MathmaticsOperationAndConditions.multipication(7632 , 7863);
	        System.out.println(result);
		}
		else if(a>=c && c<=a){
			long result = MathmaticsOperationAndConditions.division(563 , 232);
	        System.out.println(result);
		
		}
		else{
        System.out.println("invalid input");
		}	
		
		}
static int addition(int a , int b){
int sum = a+b;
return sum;
	}
static int substaction(int a , int b){
int sum = a-b;
return sum;
}
static long multipication( long a , long b){
long sum=a*b;
return sum;
}
static long division(long a , long b){
long sum = a/b;
return sum;
}
}


	
		
		