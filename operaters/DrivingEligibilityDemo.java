class DrivingEligibilityDemo {

    public static void main(String[] args) {
        int age = 21;
        int minimumAge = 18;
        int testScore = 75;
        int requiredScore = 60;

        int ageDifference = age - minimumAge;
        int doubleAge = age * 2;
        int ageDivision = age / 2;
        int ageRemainder = age % 2;

        System.out.println("Age Difference: " + ageDifference);
        System.out.println("Double Age: " + doubleAge);
        System.out.println("Age Division: " + ageDivision);
        System.out.println("Age Remainder: " + ageRemainder);

        if (age >= minimumAge) {
            System.out.println("Eligible by age");
        } else {
            System.out.println("Not eligible by age");
        }

        if (age >= minimumAge && testScore >= requiredScore) {
            System.out.println("Eligible for the driving test");
        } else {
            System.out.println("Not eligible for the driving test");
        }

        if (age < 18 || testScore < 60) {
            System.out.println("Eligibility requirements are not met");
        } else {
            System.out.println("Eligibility requirements are met");
        }

        if (age != minimumAge) {
            System.out.println("Age is different from the minimum age");
        } else {
            System.out.println("Age equals the minimum age");
        }
    }

   
}