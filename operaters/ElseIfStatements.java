class ElseIfStatements{
	public static void main(String[] args){
		int a= 10;
		int b=20;
		int c=30;
		int d=40;
		
		int sum=a+b;
		int sum1=a-b;
		int sum2=a*b;
		int sum3=a/b;
		int sum4=a%b;
		System.out.println(sum);
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);
		
		boolean sum5 = a==10;
		boolean sum6 = a==b;
		boolean sum7=a>b;
		boolean sum8=a<b;
		boolean sum9=a!=b;
		
	    System.out.println(sum5);
		System.out.println(sum6);
		System.out.println(sum7);
		System.out.println(sum8);
		System.out.println(sum9);
		
		if(a==10){
        int result = ElseIfStatements.addition(100 , 400);
		System.out.println(result);
		}
		if(b==20){
		int result = ElseIfStatements.substraction(300 , 200);
		System.out.println(result);
		}
		if(a<b && c<d){
			int result = ElseIfStatements.multipication(23 , 22);
		System.out.println(result);
		}
		
			
			
		
		}
		static int addition(int a , int b){
			int sum=a+b;
			return sum;
		}
		static int substraction(int a ,int b){
			int sum = a-b;
			return sum;
		}
		static int multipication(int a , int b){
			int sum = a*b;
			return sum;
		}
}

		
		

		
	
