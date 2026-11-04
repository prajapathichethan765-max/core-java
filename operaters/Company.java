class Company{
static String[] companyNameAndBranch = {"google","mumbai"};
public static void main(String[] args){

long[] profitPerMonthInYear = new long[6];

profitPerMonthInYear[0] = 100000l;
profitPerMonthInYear[1] = 200000l;
profitPerMonthInYear[2] = 12222l;
profitPerMonthInYear[3] = 130000l;
profitPerMonthInYear[4] = 150000l;
profitPerMonthInYear[5] = 310000l;


System.out.println(profitPerMonthInYear[0]);
System.out.println(profitPerMonthInYear[2]);
System.out.println(profitPerMonthInYear[3]);
System.out.println(profitPerMonthInYear[4]);
System.out.println(profitPerMonthInYear[5]);
System.out.println(profitPerMonthInYear[1]);


System.out.println(Company.companyNameAndBranch[0]);
System.out.println(Company.companyNameAndBranch[1]);
}
}






