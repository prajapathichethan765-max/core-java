class OperaterDemo{
	public static void main(String[] args){
		int a = 100;
		int b = 200;
		int c = 300;
		int d = 350;
		
		int sum1 = a+b;
		int sum2 = a-b;
		int sum3 = a/b;
		int sum4 = a%b;
		int sum5 = a*b;
		
		boolean sum6 = a==b;
		boolean sum7= a>b;
		boolean sum8 = a<b;
		boolean sum9 = a<=c;
		boolean sum10 = a!=d;
		
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);
		System.out.println(sum5);
		System.out.println(sum6);
		System.out.println(sum7);
		System.out.println(sum8);
		System.out.println(sum9);
		System.out.println(sum10);

		
		
		
		if(a>b && a<c){
			System.out.println("is store is open");
			boolean isOpen = OperaterDemo.isStoreOpen( true);
			System.out.println(isOpen);

		}
	else if(a<=b || a>=c ){
			System.out.println("do we have classes tommarow");
			boolean isClassThere = OperaterDemo.isClassesThere(false);
			System.out.println(isClassThere);
	}
	else if(a== b && c==d){
			System.out.println("is home door is open");
			boolean isDoorOpen = OperaterDemo.isDoorIsOpen(false);
			System.out.println(isDoorOpen);
	}			
		}
		static boolean isStoreOpen(boolean a){
			boolean isOpen= true;
			return isOpen;
		}
		static boolean isClassesThere(boolean a){
			boolean isClassThere = true;
			return isClassThere;
		}
		static boolean isDoorIsOpen(boolean a){
			boolean isDoorOpen = false;
			return isDoorOpen;
		}
		
		
}

		
		