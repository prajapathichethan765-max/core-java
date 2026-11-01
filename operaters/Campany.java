class Campany{
public static void main(String[] hgas){

System.out.println("name of the company");
Campany.nameOfCompany();

System.out.println("ceo name");
String ceoNames = Campany.ceoName();
System.out.println(ceoNames);

System.out.println("total members in the company and manager name ");
int totalMember = 5000;
String nameOfManager = "mohan";
long mangaerSalary = 100000;
Campany.numberMembers(totalMember , nameOfManager , mangaerSalary);

System.out.println("check where company is in loss or in profit");
long companyProfitInDay = 300000;
String profit = Campany.checkCompanyStatus(companyProfitInDay);
System.out.println(profit);

int a = 300;
int b = 400;
long  c = 40000;
long d = 50000;
float e = 455.5f;
float f = 761.23f;



if(a>= b && c>d){

System.out.println("name of the company");
Campany.nameOfCompany();
}
else if (e<= f && c>=d){
System.out.println("ceo name");
String ceoNamess = Campany.ceoName();
System.out.println(ceoNamess);
}
else if(a<=b || c>=d){
System.out.println("total members in the company and manager name ");
int totallMember = 5000;
String nameeOfManager = "mohan";
long mangaerrSalary = 100000;
Campany.numberMembers(totallMember , nameeOfManager , mangaerrSalary);
}
else if(e<f || f>e){
System.out.println("check where company is in loss or in profit");
long companyProfitInDayy = 300000;
String profitt = Campany.checkCompanyStatus(companyProfitInDayy);
System.out.println(profitt);

}
else{
System.out.println("invalid inputs");
}

}
static void nameOfCompany(){
System.out.println("google");
}

static String ceoName(){
String name = "morgan";
String name2 = "ori";
String name3 = "harle";
return name	+ name2 + name3 + " this are the ceos of the google company";
}

static void numberMembers(int totMember , String managerName , long salaryOfManager){
System.out.println(totMember);
System.out.println(managerName);
System.out.println(salaryOfManager);

if(totMember == 5000){
System.out.println("not vecancy");
}
else {
System.out.println("vecancy are avilable");
}
}

static String checkCompanyStatus(long campanyProfit ){
System.out.println(campanyProfit);

if(campanyProfit >= 200000){
return "company is in profit ";
}
else{
return "company is in loss";
}
}
}

