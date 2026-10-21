class NumberComparisonDemo {

    public static void main (String[] args) {
        int p = 150;
        int q = 250;
        int r = 350;
        int s = 150;

        System.out.println("Sum: " + (p + q));
        System.out.println("Subtraction: " + (r - p));
        System.out.println("Multiplication: " + (p * 2));
        System.out.println("Division: " + (q / p));
        System.out.println("Remainder: " + (r % q));

        if (p == s) {
            System.out.println("P is equal to S");
        } else {
            System.out.println("P is not equal to S");
        }

        if (r > q && q > p) {
            System.out.println("R is greater than Q and Q is greater than P");
        } else {
            System.out.println("The conditions are false");
        }

        if (p < q || s > r) {
            System.out.println("At least one condition is true");
        } else {
            System.out.println("Both conditions are false");
        }
    }
}

   