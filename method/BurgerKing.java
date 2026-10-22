class BurgerKing{
public static void main(String[] args){
System.out.println("select veg nor non veg");
BurgerKing.mealType();
System.out.println("drop which burger you want");	
BurgerKing.Burgertype();
System.out.println("select payment type");
BurgerKing.payment();
System.out.println("click on place the order");
	BurgerKing.finalClick();
	

}
static void mealType (){
System.out.println("veg");
}	
static void Burgertype(){
	System.out.println("extra cheez with double feling");
}
static void payment(){
	System.out.println("online");
}
static void finalClick(){
	System.out.println("order placed");
}
}



	