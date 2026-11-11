class PhoneAaps{
	public static void main(String[] kjwge){
		String app1 = "instagram";
		String app2 = "whatsapp";
		String app3 = "facebook";
		String app4 = "pubg";
		String app5 = "free fire";
		System.out.println(app1);
		System.out.println(app2);
		System.out.println(app3);
		System.out.println(app4);
		System.out.println(app5);
		
		String apps = PhoneAaps.appsName(app1 , app2 , app3 , app4 , app5);
		System.out.println(apps);
		
		
	}
	static String appsName(String appone , String appTwo , String appThree , String appFour , String appFive){
		
		System.out.println(appone);
		System.out.println(appTwo);
		System.out.println(appThree);
		System.out.println(appFour);
		System.out.println(appFive);
		
		String apps[] = {appone , appTwo , appThree , appFour , appFive};
		System.out.println(apps[0]);
		System.out.println(apps[1]);
		System.out.println(apps[2]);
		System.out.println(apps[3]);
		System.out.println(apps[4]);
		
		apps[1] = "nipex";
		apps[2] = "galary";
		System.out.println(apps[1]);
		System.out.println(apps[2]);
		
		return appone + appTwo + appThree + appFour + appFour + appFive + apps[0] + apps[1] + apps[2];
	}
}