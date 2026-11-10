class MovieRatingsRunner {
    public static void main(String[] args) {

        float movie1 = 4.5f;
        float movie2 = 3.8f;
        float movie3 = 4.2f;
        float movie4 = 4.7f;
        float movie5 = 3.9f;

        float result = MovieRatings.movieDetails(
            movie1, movie2, movie3, movie4, movie5);

        System.out.println("Total movie ratings: " + result);

        System.out.println(movie1);
        System.out.println(movie2);
        System.out.println(movie3);
        System.out.println(movie4);
        System.out.println(movie5);
    }
}