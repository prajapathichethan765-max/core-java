class CollegeSubjects{
    public static void main(String[] args){

        String subject1 = "Java";
        String subject2 = "Python";
        String subject3 = "Maths";
        String subject4 = "Physics";
        String subject5 = "Chemistry";

        System.out.println(subject1);
        System.out.println(subject2);
        System.out.println(subject3);
        System.out.println(subject4);
        System.out.println(subject5);

        String subjects = CollegeSubjects.subjectNames(
            subject1, subject2, subject3, subject4, subject5);

        System.out.println(subjects);
    }

    static String subjectNames(String s1, String s2,
    String s3, String s4, String s5){

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);

        String subjects[] = {s1, s2, s3, s4, s5};

        System.out.println(subjects[0]);
        System.out.println(subjects[1]);
        System.out.println(subjects[2]);
        System.out.println(subjects[3]);
        System.out.println(subjects[4]);

        subjects[0] = "Database";
        subjects[2] = "Operating System";

        System.out.println(subjects[0]);
        System.out.println(subjects[2]);

        return subjects[0] + subjects[1] + subjects[2]
        + subjects[3] + subjects[4];
    }
}