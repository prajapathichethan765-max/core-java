class CollegeFees{
    static long checkFees(int engineering, int medical, int degree){

        System.out.println(engineering);
        System.out.println(medical);
        System.out.println(degree);

        int fees[] = {engineering, medical, degree};

        System.out.println(fees[0]);
        System.out.println(fees[1]);
        System.out.println(fees[2]);

        fees[1] = 75000;
        System.out.println(fees[1]);

        switch(engineering){
            case 50000:
                System.out.println("Engineering fees available");
                return 55000L;

            case 60000:
                System.out.println("Engineering fees available");
                return 65000L;

            case 70000:
                System.out.println("Engineering fees available");
                return 75000L;

            default:
                System.out.println("Fees not available");
                return 0L;
        }
    }
}

class CollegeFeesRunner{
    public static void main(String[] args){

        int course1 = 50000;
        int course2 = 80000;
        int course3 = 30000;

        long totalFees = CollegeFees.checkFees(course1, course2, course3);
        System.out.println(totalFees);
    }
}