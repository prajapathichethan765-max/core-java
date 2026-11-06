class GameCenter{
	public static void main(String[] args){

		String game1 = "Cricket";
		String game2 = "Football";
		String game3 = "Hockey";
		String game4 = "Tennis";
		String game5 = "Badminton";

		String gameNames[] = {game1, game2, game3, game4, game5};

		System.out.println("Game 0 = "+gameNames[0]);
		System.out.println("Game 1 = "+gameNames[1]);
		System.out.println("Game 2 = "+gameNames[2]);
		System.out.println("Game 3 = "+gameNames[3]);
		System.out.println("Game 4 = "+gameNames[4]);

		boolean game1Available = true;
		boolean game2Available = false;
		boolean game3Available = true;
		boolean game4Available = true;
		boolean game5Available = false;

		boolean gameStatus[] = {game1Available, game2Available, game3Available, game4Available, game5Available};

		System.out.println("Status 0 = "+gameStatus[0]);
		System.out.println("Status 1 = "+gameStatus[1]);
		System.out.println("Status 2 = "+gameStatus[2]);
		System.out.println("Status 3 = "+gameStatus[3]);
		System.out.println("Status 4 = "+gameStatus[4]);

		gameStatus[1] = true;

		System.out.println("Updated status = "+gameStatus[1]);
	}
}