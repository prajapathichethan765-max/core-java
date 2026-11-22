class BokLib{
public static void main(String[] args){

System.out.println("library name");
BokLib.libraryName();

System.out.println("total books");
int books = BokLib.bookCount();
System.out.println(books);

System.out.println("monthly expenses");
float expenses = BokLib.monthlyExpenses();
System.out.println(expenses);

System.out.println("book categories");
String a = "Science";
String b = "History";
String c = "Technology";
BokLib.categories(a,b,c);

System.out.println("book codes");
long x = 456789L;
long y = 567891L;
long z = 678912L;
BokLib.bookCodes(x,y,z);

System.out.println("librarian");
String librarian = "Suresh";
BokLib.librarian(librarian);

System.out.println("available books");
int total = 5000;
int issued = 1800;
System.out.println(BokLib.available(total,issued));

System.out.println("reading rate");
double rate = 85.5;
System.out.println(BokLib.readingRate(rate));
}

static void libraryName(){
System.out.println("Knowledge Book Library");
}
static int bookCount(){
return 5000;
}
static float monthlyExpenses(){
return 25000.5f;
}
static void categories(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void bookCodes(long a,long b,long c){
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
static double readingRate(double value){
return value;
}
}