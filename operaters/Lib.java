class Lib{
public static void main(String[] args){

System.out.println("library name");
Lib.libName();

System.out.println("total books");
int books = Lib.bookCount();
System.out.println(books);

System.out.println("reading hours");
float hours = Lib.hours();
System.out.println(hours);

System.out.println("book categories");
Lib.categories("Science","History","Maths");

System.out.println("book numbers");
Lib.numbers(1111L,2222L,3333L);

System.out.println("librarian");
Lib.librarian("Kiran");

System.out.println("available books");
System.out.println(Lib.available(500,150));

System.out.println("library rating");
System.out.println(Lib.rating(4.6));
}

static void libName(){
System.out.println("Knowledge Library");
}
static int bookCount(){
return 500;
}
static float hours(){
return 8.5f;
}
static void categories(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void numbers(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void librarian(String name){
System.out.println(name);
}
static int available(int total,int issued){
return total-issued;
}
static double rating(double value){
return value;
}
}