class SportsAcademy {
    public static void main(String[] args) {

        System.out.println("academy name");
        SportsAcademy.academyName();

        System.out.println("academy location");
        SportsAcademy.academyLocation();

        System.out.println("monthly fees");
        double fees = SportsAcademy.monthlyFees();
        System.out.println(fees);

        System.out.println("number of players");
        int players = SportsAcademy.playerCount();
        System.out.println(players);

        System.out.println("number of coaches");
        short coaches = 35;
        SportsAcademy.coachCount(coaches);

        System.out.println("academy rating");
        float rating = 4.7f;
        SportsAcademy.ratingDetails(rating);

        System.out.println("academy manager");
        String manager = "Rakesh";
        String result = SportsAcademy.managerName(manager);
        System.out.println(result);

        System.out.println("swimming pool facility");
        boolean swimming = true;
        SportsAcademy.swimmingFacility(swimming);

        System.out.println("academy grade");
        char grade = 'A';
        SportsAcademy.gradeDetails(grade);

        System.out.println("number of playgrounds");
        byte grounds = 5;
        SportsAcademy.groundCount(grounds);

        System.out.println("check academy fees");
        int amount = 2500;
        String status = SportsAcademy.checkFees(amount);
        System.out.println(status);

        System.out.println("academy starting year");
        SportsAcademy.startingYear();

        System.out.println("academy contact number");
        long phone = 9876543210L;
        SportsAcademy.contactNumber(phone);
    }

    static void academyName() {
        System.out.println("Champions Sports Academy");
    }

    static void academyLocation() {
        System.out.println("Bangalore");
    }

    static double monthlyFees() {
        return 3000.50;
    }

    static int playerCount() {
        return 750;
    }

    static void coachCount(short count) {
        System.out.println(count);
    }

    static void ratingDetails(float rating) {
        System.out.println(rating);
    }

    static String managerName(String name) {
        return name + " manages the sports academy";
    }

    static void swimmingFacility(boolean available) {
        System.out.println(available);
    }

    static void gradeDetails(char category) {
        System.out.println(category);
    }

    static void groundCount(byte count) {
        System.out.println(count);
    }

    static String checkFees(int fees) {
        if (fees <= 3000) {
            return "Academy fees are affordable";
        } else {
            return "Academy fees are expensive";
        }
    }

    static void startingYear() {
        System.out.println(2018);
    }

    static void contactNumber(long number) {
        System.out.println(number);
    }
}