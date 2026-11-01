class Product{
public static void main(String[] lkj){
	
int a = 30 ;
int b = 40 ;
float c = 40.4f ;
 float d = 50.56f;
long e = 49942;
long f = 40000;
 
if(a>b && c<d){
System.out.println("name of the product");
Product.nameOfProduct();
}
else if(c>d || e<f){

System.out.println("price of the product");
int productPrice = Product.priceOfProduct();
}
else if(e>f || a<b){
System.out.println("what does the product do");
String productUse = "clear the skin";
Product.productUseFor(productUse);
}
else if(c<d || a>b){
System.out.println("check whether it the certified or not");
String isCertified = "yes";
String certified = Product.checkCertification(isCertified);
}
else {
	System.out.println("invalid inputs");
}


}
static void nameOfProduct(){
System.out.println("detaan");
}
static int priceOfProduct(){
int price = 500;
return price;
}
static void productUseFor(String useOfProduct){
System.out.println(useOfProduct);
}
static String checkCertification(String isCertified){
System.out.println(isCertified);

if(isCertified == "yes" ){
return isCertified + " it is certified from the company";
}
else {
return isCertified + " no it is not ";
}
}
}
