class CinemaTheatre {
    public static void main(String[] args) {

        System.out.println("theatre name");
        CinemaTheatre.theatreName();

        System.out.println("theatre location");
        CinemaTheatre.theatreLocation();

        System.out.println("ticket price");
        double ticket = CinemaTheatre.ticketPrice();
        System.out.println(ticket);

        System.out.println("number of screens");
        byte screens = CinemaTheatre.screenCount();
        System.out.println(screens);

        System.out.println("number of seats");
        int seats = 1200;
        CinemaTheatre.seatCount(seats);

        System.out.println("movie rating");
        float rating = 4.5f;
        CinemaTheatre.movieRating(rating);

        System.out.println("movie name");
        String movie = "KGF";
        CinemaTheatre.movieDetails(movie);

        System.out.println("manager name");
        String manager = "Vijay";
        String result = CinemaTheatre.managerName(manager);
        System.out.println(result);

        System.out.println("parking facility");
        boolean parking = true;
        CinemaTheatre.parkingStatus(parking);

        System.out.println("theatre category");
        char category = 'A';
        CinemaTheatre.theatreCategory(category);

        System.out.println("check ticket price");
        int price = 250;
        String status = CinemaTheatre.checkTicketPrice(price);
        System.out.println(status);

        System.out.println("number of shows");
        CinemaTheatre.showCount();

        System.out.println("theatre contact");
        long contact = 9988776655L;
        CinemaTheatre.theatreContact(contact);
    }

    static void theatreName() {
        System.out.println("PVR Cinemas");
    }

    static void theatreLocation() {
        System.out.println("Malleshwaram");
    }

    static double ticketPrice() {
        return 350.50;
    }

    static byte screenCount() {
        return 8;
    }

    static void seatCount(int totalSeats) {
        System.out.println(totalSeats);
    }

    static void movieRating(float stars) {
        System.out.println(stars);
    }

    static void movieDetails(String movieName) {
        System.out.println(movieName);
    }

    static String managerName(String name) {
        return name + " is the theatre manager";
    }

    static void parkingStatus(boolean available) {
        System.out.println(available);
    }

    static void theatreCategory(char grade) {
        System.out.println(grade);
    }

    static String checkTicketPrice(int amount) {
        if (amount <= 300) {
            return "Ticket price is affordable";
        } else {
            return "Ticket price is expensive";
        }
    }

    static void showCount() {
        System.out.println(6);
    }

    static void theatreContact(long number) {
        System.out.println(number);
    }
}