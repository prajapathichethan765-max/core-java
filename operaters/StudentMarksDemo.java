class StudentMarksDemo {

    public static void main(String[] args) {
        int maths = 85;
        int science = 72;
        int english = 90;

        int total = maths + science + english;
        int difference = maths - science;
        int product = maths * science;
        int division = maths / science;
        int remainder = maths % science;

        System.out.println("Total Marks: " + total);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Division: " + division);
        System.out.println("Remainder: " + remainder);

        if (maths > science) {
            System.out.println("Maths marks are greater");
        } else {
            System.out.println("Maths marks are not greater");
        }

        if (english >= 90) {
            System.out.println("Excellent performance");
        } else {
            System.out.println("Keep practicing");
        }
    }
}