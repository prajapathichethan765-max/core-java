class Application{
	static String appName="instagram";
	static String category="social media";
	static String platform="android";
	static String country="india";
	public static void main(String[] args){
		long noOfUsers=100000;
	    String  usedFor="intertenment";
	    float space=350.23f;
        String logoColor="red and white";
        String ageLimit="no limit";
System.out.println(appName);
System.out.println(category);
System.out.println(platform);
System.out.println(country);
System.out.println(noOfUsers);
System.out.println(usedFor);
System.out.println(space);
System.out.println(logoColor);
System.out.println(ageLimit);
Application.canWeMessage();
Application.canWeWatchReels();
Application.canWeEarn();

	}
static void canWeMessage(){
System.out.println("yes we can");
}

static void canWeWatchReels(){
System.out.println("yes we can watch");
}
static void canWeEarn(){
System.out.println("yes we can earn");
}
}
		