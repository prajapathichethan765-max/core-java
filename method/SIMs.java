class SIMs{
	static int simRecharge(int airtel , int jio ,  int vi){
		System.out.println(airtel);
		System.out.println(jio);
		System.out.println(vi);
		int sim[] = {airtel , jio , vi};
		System.out.println(sim[0]);
		System.out.println(sim[1]);
		System.out.println(sim[2]);
		
		sim[0] = 593;
		System.out.println(sim[0]);
		
		switch(airtel){
			case 350:
			System.out.println("recharge plane is avilable");
			return 400;
			
			case 340:
			System.out.println("recharge is avilable");
			return 600;
			case 360:
			System.out.println("recharge plane is avilable");
			return 546;
			
			default :
			System.out.println("recharge not avilable");
			return 0;
		}
	}
}
