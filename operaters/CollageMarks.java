class CollageMarks{
	public static void main(String[] args){
		
		int math = 100;
		int java = 98;
		int hindi = 100;
		int physics = 76;
		int chemistry =95;
		int c = 99;
		
		System.out.println("sum of math and hindi:"+(math + hindi));
		System.out.println("substraction of physics and chemistry="+(physics - chemistry));
		System.out.println("division of c and hindi:"+(c/ hindi));
		System.out.println("modules of java and c:"+(java % c));
		System.out.println("multilication of chemistry and hindi:"+(chemistry * hindi));
		
if(math == 100 && hindi == 80){
	int result = CollageMarks.additon(23 , 144);
		System.out.println(result);
}
else if ( c == 97 || chemistry == 80){
int result = CollageMarks.substraction(98 , 77);
		System.out.println(result);
}
else if(physics > chemistry && c == 99){
	float result = CollageMarks.multilication(98.5f , 83.56f);
		System.out.println(result);
}
else if(java > physics || c >java){
	float result = CollageMarks.division(98.5f , 98.44f);
		System.out.println(result);
}
else {
	
		System.out.println("defaults intput");
}		
	}
	static int additon(int a , int b){
	int sum = a+b;
	return sum;
	}
	static int substraction(int a, int b){
		int sum = a - b ;
		return sum;
	}
	static float multilication(float a , float b){
	float sum = a*b;
	return sum;
	}
	static float division(float a , float b){
	float sum = a/b;
return sum;
	}	
	
}