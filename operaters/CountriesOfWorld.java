class CountriesOfWorld {
    static String countryNames(String c1, String c2, String c3, String c4, String c5) {

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);

        String countries[] = {c1, c2, c3, c4, c5};

        System.out.println(countries[0]);
        System.out.println(countries[1]);
        System.out.println(countries[2]);
        System.out.println(countries[3]);
        System.out.println(countries[4]);

        return countries[0] + " " + countries[1] + " " + countries[2]
             + " " + countries[3] + " " + countries[4];
    }
}