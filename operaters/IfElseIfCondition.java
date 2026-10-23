class  IfElseIfCondition{
public static void main(String[] a){
System.out.println(a[0]);
System.out.println(a[1]);
System.out.println(a[2]);
System.out.println(a[3]);
System.out.println(a[4]);

float e =107.5f;
float b = 87.4f;
float c = 121.3f;
float d = 63.4f;

if(e>b && c>b){
	System.out.println("how far is rajasthan is");
IfElseIfCondition.distance();
}
else if (e>b && c>e){
	System.out.println("addtion operation");
int add = IfElseIfCondition.addtion(100, 140);
System.out.println(add);
}
	
}
static void distance(){
System.out.println("2500 kilometers");
}
static int addtion(int a , int b){
	int add = a+b;
	return add;
}
}

