class FilmProductionHouse{
public static void main(String[] args){

System.out.println("production house name");
FilmProductionHouse.productionName();

System.out.println("total employees");
int employees = FilmProductionHouse.employeeCount();
System.out.println(employees);

System.out.println("movie budget");
double budget = FilmProductionHouse.movieBudget();
System.out.println(budget);

System.out.println("movie genres");
String a = "Action";
String b = "Comedy";
String c = "Thriller";
FilmProductionHouse.movieGenres(a,b,c);

System.out.println("movie identification numbers");
long x = 567812L;
long y = 678123L;
long z = 781234L;
FilmProductionHouse.movieIds(x,y,z);

System.out.println("film director");
String director = "Prashanth";
FilmProductionHouse.directorDetails(director);

System.out.println("remaining shooting days");
int total = 90;
int completed = 65;
System.out.println(FilmProductionHouse.remainingDays(total,completed));

System.out.println("movie rating");
float rating = 8.5f;
System.out.println(FilmProductionHouse.movieRating(rating));

}

static void productionName(){
System.out.println("Dream Star Productions");
}

static int employeeCount(){
return 180;
}

static double movieBudget(){
return 45000000.75;
}

static void movieGenres(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void movieIds(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void directorDetails(String name){
System.out.println(name);
}

static int remainingDays(int total,int completed){
return total-completed;
}

static float movieRating(float value){
return value;
}
}