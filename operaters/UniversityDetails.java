class UniversityDetails {
    public static void main(String[] args) {

        System.out.println("university nammmme");
        UniversityDetails.universityName();

        System.out.println("university address");
        UniversityDetails.universityAddress();

        System.out.println("university fee");
        double fee = UniversityDetails.feeDetails();
        System.out.println(fee);

        System.out.println("number of departments");
        byte departments = UniversityDetails.departmentCount();
        System.out.println(departments);

        System.out.println("total students");
        long students = 12000L;
        UniversityDetails.studentDetails(students);

        System.out.println("university rating");
        float rating = 4.6f;
        UniversityDetails.ratingDetails(rating);

        System.out.println("university principal");
        String principal = "Mahesh";
        String result = UniversityDetails.principalDetails(principal);
        System.out.println(result);

        System.out.println("hostel facility");
        boolean hostel = true;
        UniversityDetails.hostelAvailability(hostel);

        System.out.println("university grade");
        char grade = 'A';
        UniversityDetails.gradeDetails(grade);

        System.out.println("number of laboratories");
        int labs = 35;
        UniversityDetails.labCount(labs);

        System.out.println("check university fee");
        int amount = 90000;
        String status = UniversityDetails.checkFee(amount);
        System.out.println(status);

        System.out.println("university establishment");
        UniversityDetails.establishmentDetails();

        System.out.println("university phone number");
        long phone = 9876541230L;
        UniversityDetails.phoneDetails(phone);
    }

    static void universityName() {
        System.out.println("Bangalore University");
    }

    static void universityAddress() {
        System.out.println("Jnanabharathi");
    }

    static double feeDetails() {
        return 95000.75;
    }

    static byte departmentCount() {
        return 12;
    }

    static void studentDetails(long count) {
        System.out.println(count);
    }

    static void ratingDetails(float stars) {
        System.out.println(stars);
    }

    static String principalDetails(String name) {
        return name + " is the university principal";
    }

    static void hostelAvailability(boolean available) {
        System.out.println(available);
    }

    static void gradeDetails(char grade) {
        System.out.println(grade);
    }

    static void labCount(int count) {
        System.out.println(count);
    }

    static String checkFee(int amount) {
        if (amount <= 100000) {
            return "University fee is affordable";
        } else {
            return "University fee is expensive";
        }
    }

    static void establishmentDetails() {
        System.out.println(1964);
    }

    static void phoneDetails(long number) {
        System.out.println(number);
    }
}