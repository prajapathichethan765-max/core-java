class CricketScoreDemo {
    public static void main(String[] args) {
        int teamA = 185;
        int teamB = 172;
        int overs = 20;
        int wickets = 6;

        int totalScore = teamA + teamB;
        int scoreDifference = teamA - teamB;
        int doubleScore = teamA * 2;
        int averageScore = teamA / overs;
        int remainder = teamA % overs;

        System.out.println("Total Score: " + totalScore);
        System.out.println("Score Difference: " + scoreDifference);
        System.out.println("Double Score: " + doubleScore);
        System.out.println("Average Per Over: " + averageScore);
        System.out.println("Remainder: " + remainder);

        if (teamA > teamB) {
            System.out.println("Team A scored more runs");
        } else {
            System.out.println("Team B scored more runs or scores are equal");
        }

        if (overs == 20 && wickets < 10) {
            System.out.println("Match format and wickets are valid");
        } else {
            System.out.println("Match conditions are not satisfied");
        }

        if (teamA >= 180 || teamB >= 180) {
            System.out.println("A team scored at least 180 runs");
        } else {
            System.out.println("Neither team scored 180 runs");
        }

        if (teamA != teamB) {
            System.out.println("Both teams have different scores");
        } else {
            System.out.println("Both teams have equal scores");
        }
    }

   
}