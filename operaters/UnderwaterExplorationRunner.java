class UnderwaterExplorationRunner {
    public static void main(String[] args) {

        long location1 = 1200L;
        long location2 = 2500L;
        long location3 = 3500L;
        long location4 = 4500L;
        long location5 = 5500L;

        long total = UnderwaterExploration.explorationDetails(
            location1, location2, location3, location4, location5);

        System.out.println("Total exploration distance: " + total);

        System.out.println(location1);
        System.out.println(location2);
        System.out.println(location3);
        System.out.println(location4);
        System.out.println(location5);
    }
}