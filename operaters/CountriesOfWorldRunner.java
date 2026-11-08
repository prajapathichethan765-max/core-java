class CountriesOfWorldRunner {
    public static void main(String[] args) {

        String country1 = "India";
        String country2 = "Japan";
        String country3 = "France";
        String country4 = "Australia";
        String country5 = "Canada";

        String result = CountriesOfWorld.countryNames(
            country1, country2, country3, country4, country5);

        System.out.println(result);

        System.out.println(country1);
        System.out.println(country2);
        System.out.println(country3);
        System.out.println(country4);
        System.out.println(country5);
    }
}