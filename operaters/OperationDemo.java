class OperationDemo{
	public static void main(String[] args){
		byte a = 2;
		byte b= 3;
		byte c = 1;
		byte d= 5;
		System.out.println("rice price");
		if(a<d && a>b){
		System.out.println(OperationDemo.priceOfRice(100 , 200));	
		}
		else if(a==2){
		System.out.println(OperationDemo.priceOfRice(100 , 200));	
         
		
		
	 
	}
	System.out.println("addition opertaion");
	if(a<b && c<d){
	int result=OperationDemo.addition(2376 , 1222);
		System.out.println(result);
	}
else {

		System.out.println("condition is not true");	
	
		
}
	}
	
	
static int priceOfRice(int a, int b){
int price = 100;
int sum=a+b;
return sum;
}
static int addition(int a , int b){
	int sum=a+b;
	return sum;
}

}

	