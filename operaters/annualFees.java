class University{
public static void main(String[] args){

System.out.println("university name");
University.universityName();

System.out.println("total departments");
int departments = University.departmentCount();
System.out.println(departments);

System.out.println("annual fees");
float fees = University.annualFees();
System.out.println(fees);

System.out.println("courses");
String c1 = "Computer Science";
String c2 = "Mechanical";
String c3 = "Electronics";
University.courseDetails(c1,c2,c3);

System.out.println("student registration numbers");
long id1 = 123456L;
long id2 = 234567L;
long id3 = 345678L;
University.studentIds(id1,id2,id3);

System.out.println("principal name");
String principal = "Suresh";
University.principalDetails(principal);

System.out.println("available seats");
int total = 5000;
int filled = 4200;
System.out.println(University.availableSeats(total,filled));

System.out.println("university rating");
double rating = 4.9;
System.out.println(University.ratingCheck(rating));

}

static void universityName(){
System.out.println("Bangalore University");
}

static int departmentCount(){
return 15;
}

static float annualFees(){
return 85000.50f;
}

static void courseDetails(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void studentIds(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void principalDetails(String name){
System.out.println(name);
}

static int availableSeats(int total,int filled){
if(total>=filled){
return total-filled;
}
else{
return 0;
}
}

static double ratingCheck(double value){
return value;
}
}