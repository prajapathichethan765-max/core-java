class MathDemo{
	public static void main(String[] args){
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		
		int sum1=a+b;
		int sum2=a-b;
		int sum3=a*b;
		int sum4=a/b;
		
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);

		boolean sum6 = a==b;
		boolean sum7= a>b;
		boolean sum8 =a<c;
		boolean sum9 = c>a;
		boolean sum10= a<d;
		
		System.out.println(sum6);
		System.out.println(sum7);
		System.out.println(sum8);
		System.out.println(sum9);
		System.out.println(sum10);
		
		if(a==b && b==c){
		System.out.println("whts th price of the face wash");
		int price = MathDemo.priceOfFaceWash(100);
		System.out.println(price);
		}
		else if (a>b || c>d){
		System.out.println("price of the buld");
		int price = MathDemo.priceOfBulb(10);
		System.out.println(price);
		}
		else if(a>=b || a<=d){
		System.out.println("price of bike");
		int price = MathDemo.priceOfBike(100);
		System.out.println(price);
		}
	}		
		
		
		static int priceOfFaceWash(int a){
		int price = 100;
		return price;
	}
	
		static int priceOfBulb(int a){
		int price = 200;
		return price;
	}
	static int priceOfBike(int a){
		int price = 100;
		return price;
	}
}

	
	
		
	