class TouristPlaces{
    public static void main(String[] args){

        String place1 = "Goa";
        String place2 = "Mysore";
        String place3 = "Ooty";
        String place4 = "Manali";
        String place5 = "Kerala";

        System.out.println(place1);
        System.out.println(place2);
        System.out.println(place3);
        System.out.println(place4);
        System.out.println(place5);

        String places = TouristPlaces.placeNames(
            place1, place2, place3, place4, place5);

        System.out.println(places);
    }

    static String placeNames(String p1, String p2,
    String p3, String p4, String p5){

        String locations[] = {p1, p2, p3, p4, p5};

        System.out.println(locations[0]);
        System.out.println(locations[1]);
        System.out.println(locations[2]);
        System.out.println(locations[3]);
        System.out.println(locations[4]);

        locations[1] = "Coorg";
        locations[3] = "Ladakh";

        System.out.println(locations[1]);
        System.out.println(locations[3]);

        return locations[0] + locations[1] + locations[2]
        + locations[3] + locations[4];
    }
}