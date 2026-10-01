class Belt{
	static int lock=1;
	static int hook=1;
	
	public static void main(String[] args){
	int price=200;
char size='M';
float length=12.2f;
double height=2.3d;
String color="black";	
float thikness=1.1f;
System.out.println(Belt.lock);
System.out.println(Belt.hook);
System.out.println(price);
System.out.println(height);
System.out.println(length);
System.out.println(color);
System.out.println(thikness);
size='L';
length=11.3f;
height=1.1d;
color="brown";
thikness=2.2f;
System.out.println(price);
System.out.println(height);
System.out.println(length);
System.out.println(color);
System.out.print(thikness);
	}
	static void canWeWare(){
		System.out.print("yes we can");
	}
	static void canWeadjuest(){
		System.out.print("yess but for limitied times");
	}
	static void canWecut(){
		System.out.print("yes we can");
	}
}


