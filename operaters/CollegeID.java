class CollegeID {
    public static void main(String[] args) {

        String studentName = "Sneha";
        int collegeIDNumber = 234;

        CollegeID.verifyCollegeID(studentName, collegeIDNumber);
    }

    static void verifyCollegeID(String name, int idNumber) {
        System.out.println(name);
        System.out.println(idNumber);

        if (name.equals("Priya")) {
            System.out.println("Student name is matching");
        }
        else if (idNumber == 235) {
            System.out.println("College ID is matching");
        }
        else if (name.equals("Sneha") && idNumber == 234) {
            System.out.println("Student name and college ID both are matching");
        }
    }
}