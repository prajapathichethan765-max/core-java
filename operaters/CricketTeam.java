class CricketTeam{
	public static void main(String[] args){

		String player1 = "Virat";
		String player2 = "Rohit";
		String player3 = "Dhoni";
		String player4 = "Hardik";
		String player5 = "Gill";

		String players[] = {player1, player2, player3, player4, player5};

		System.out.println("Player 0 = "+players[0]);
		System.out.println("Player 1 = "+players[1]);
		System.out.println("Player 2 = "+players[2]);
		System.out.println("Player 3 = "+players[3]);
		System.out.println("Player 4 = "+players[4]);

		float playerRating1 = 9.5f;
		float playerRating2 = 8.8f;
		float playerRating3 = 9.9f;
		float playerRating4 = 8.5f;
		float playerRating5 = 8.7f;

		float ratings[] = {playerRating1, playerRating2, playerRating3, playerRating4, playerRating5};

		System.out.println("Rating 0 = "+ratings[0]);
		System.out.println("Rating 1 = "+ratings[1]);
		System.out.println("Rating 2 = "+ratings[2]);
		System.out.println("Rating 3 = "+ratings[3]);
		System.out.println("Rating 4 = "+ratings[4]);

		ratings[0] = 10.0f;

		System.out.println("Updated rating = "+ratings[0]);
	}
}