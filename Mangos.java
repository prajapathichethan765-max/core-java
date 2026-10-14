class Mangos{
	public static void main(String[] args){
		System.out.println("rate of totapuri mango in  bangalore");
		int a=100;
		Mangos.mangoRate(a);
		System.out.println("rate of mango in rajasthan and up");
		int b=110;
		int c=120;
		Mangos.mangoRateINRajasthanandUP(b,c);
		System.out.println("rate of mango in mp,nepal,gujrat");
		int d=130;
		int e=140;
		int f=10;
		Mangos.rateOfMangoInMPNepalGujrat(d,e,f);
		System.out.println("quality of mangos in mp,nepal,gujrat, rajasthan");
		
		Mangos.qualityofMango('a','A','b','a');
		System.out.println("colors of mango");
		String clr1="lightly orange and yellow";
		String clr2="light green and yellow";
        String clr3=" dark green";
        String clr4="pure yellow";
        String clr5="light yellow";
Mangos.colorsOfMangos(clr1,clr2,clr3,clr4,clr5);		
		
	}
	static void mangoRate(int a ){
		System.out.println("rate of mango="+a);
	}
	static void mangoRateINRajasthanandUP(int b , int c ){
		System.out.println("rate of mango in rajasthan="+b);
		System.out.println("rate of mango in up="+c);
		
	}
	static void rateOfMangoInMPNepalGujrat(int d, int e, int f){
		System.out.println("rate of mango in mp="+d);
		System.out.println("rate of mango in nepal="+e);
		System.out.println("rate of mango in gujrat="+f);
}
    static void qualityofMango(char qualityInMp , char qualityInNepal , char qualityInGujrat , char qualityInRajasthan){
	
			System.out.println("quality of mango in mp="+qualityInMp);
			System.out.println("quality of mango in gujrat="+qualityInGujrat);
			System.out.println("quality of mango in nepal="+qualityInMp);
			System.out.println("quality of mango in rajasthan="+qualityInRajasthan);
			}
	static void colorsOfMangos(String clrOfTotapuri , String clrOfDasheri , String clrOfLangra , String clrOfBadami , String clrOfKesar){
System.out.println("color of totapuri="+clrOfTotapuri);
System.out.println("color of daseri="+clrOfDasheri);
System.out.println("color of langra="+clrOfLangra);
System.out.println("color of Badami="+clrOfBadami);
System.out.println("color of kesar="+clrOfKesar);
}




	
			
			
	
		
	
}

		