class Samosa{
	static void alluSamosa(){
		System.out.println("allu samosa");
		onionSamosa();
		alluSamosa();
		
	}
	static void onionSamosa(){
		System.out.println("onion samosa");
		alluSamosa();
		onionSamosa();
		
	}
	 void chikenSamosa(){
		System.out.println("chiken samosa");
		alluSamosa();
		onionSamosa();
		chikenSamosa();
		chillySamosa();
		
	}
	 void chillySamosa(){
		System.out.println("chilly samosa");
		alluSamosa();
		onionSamosa();
		chikenSamosa();
		chillySamosa();
	}
	public static void main(String[] args){
	}
}