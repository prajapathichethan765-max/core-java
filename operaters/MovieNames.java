class MovieNames{
    public static void main(String[] args){

        String movie1 = "KGF";
        String movie2 = "Kantara";
        String movie3 = "Charlie";
        String movie4 = "Salaar";
        String movie5 = "Pushpa";

        System.out.println(movie1);
        System.out.println(movie2);
        System.out.println(movie3);
        System.out.println(movie4);
        System.out.println(movie5);

        String movies = MovieNames.movieTitles(
            movie1, movie2, movie3, movie4, movie5);

        System.out.println(movies);
    }

    static String movieTitles(String first, String second,
    String third, String fourth, String fifth){

        String films[] = {first, second, third, fourth, fifth};

        System.out.println(films[0]);
        System.out.println(films[1]);
        System.out.println(films[2]);
        System.out.println(films[3]);
        System.out.println(films[4]);

        films[1] = "Lucia";
        films[3] = "Ugram";

        System.out.println(films[1]);
        System.out.println(films[3]);

        return films[0] + films[1] + films[2]
        + films[3] + films[4];
    }
}