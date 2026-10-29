class CollegeID {
    public static void main(String[] args) {

        String studentName = "Sneha";
        int collegeIDNumber = 234;

      System.out.println(  CollegeID.verifyCollegeID(studentName, collegeIDNumber));
    }

    static String verifyCollegeID(String name, int idNumber) {
        System.out.println(name);
        System.out.println(idNumber);

        if (name.equals("Priya")) {
            return "Student name is matching";
        }
        else if (idNumber == 235) {
           return "College ID is matching";
        }
        else if (name.equals("Sneha") && idNumber == 234) {
            return "Student name and college ID both are matching";
        }
    }
}