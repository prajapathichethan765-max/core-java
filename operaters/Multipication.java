class Multipication{
	public static void main(String[] args){
		char opertion='*';
		
		if(opertion=='/'){
		int result=Multipication.addition(100, 12);
		System.out.println(result);
		}
		else if(opertion=='+'){
        int result=Multipication.substraction(122,23);
		System.out.println(result);
		}
		else if(opertion=='/'){
			int result=Multipication.multipication(12,21);
		System.out.println(result);
		}
		else if(opertion=='*'){
 int result=Multipication.substraction(122,23);
		System.out.println(result);		
		}
else{
System.out.println("invalid input");
}
	
			
			
			
	}
	static int addition(int a, int b){
	int sum=a+b;
	return sum;
}
static int substraction(int a , int b){
int sum=a-b;
return sum;
}
static int multipication(int a, int b){
int sum = a*b;
return sum;
}
static int division(int a,  int b){
int sum = a/b;
return sum;
}

}
