class FootballClub{
	public static void main(String[] args){

		String club1 = "Real Madrid";
		String club2 = "Barcelona";
		String club3 = "Manchester United";
		String club4 = "Chelsea";
		String club5 = "Liverpool";

		String footballClubs[] = {club1, club2, club3, club4, club5};

		System.out.println("Club 0 = "+footballClubs[0]);
		System.out.println("Club 1 = "+footballClubs[1]);
		System.out.println("Club 2 = "+footballClubs[2]);
		System.out.println("Club 3 = "+footballClubs[3]);
		System.out.println("Club 4 = "+footballClubs[4]);

		short trophies1 = 15;
		short trophies2 = 27;
		short trophies3 = 20;
		short trophies4 = 12;
		short trophies5 = 19;

		short trophyCounts[] = {trophies1, trophies2, trophies3, trophies4, trophies5};

		System.out.println("Trophies 0 = "+trophyCounts[0]);
		System.out.println("Trophies 1 = "+trophyCounts[1]);
		System.out.println("Trophies 2 = "+trophyCounts[2]);
		System.out.println("Trophies 3 = "+trophyCounts[3]);
		System.out.println("Trophies 4 = "+trophyCounts[4]);

		trophyCounts[0] = 30;

		System.out.println("Updated trophies = "+trophyCounts[0]);
	}
}