class EmployeeInfo {
    public static void main(String[] args) {
        System.out.println("Employee Information");

        String employeeName = "Arun";
        EmployeeInfo.showName(employeeName);

        int employeeId = 102;
        EmployeeInfo.showId(employeeId);

        float salary = 35000.50f;
        EmployeeInfo.showSalary(salary);

        char grade = 'B';
        EmployeeInfo.showGrade(grade);

        boolean isPermanent = true;
        EmployeeInfo.showStatus(isPermanent);

        double experience = 3.5;
        EmployeeInfo.showExperience(experience);

        short age = 28;
        EmployeeInfo.showAge(age);
    }

    static void showName(String name) {
        System.out.println("Name: " + name);
    }

    static void showId(int id) {
        System.out.println("Employee ID: " + id);
    }

    static void showSalary(float amount) {
        System.out.println("Salary: " + amount);
    }

    static void showGrade(char employeeGrade) {
        System.out.println("Grade: " + employeeGrade);
    }

    static void showStatus(boolean status) {
        System.out.println("Permanent: " + status);
    }

    static void showExperience(double years) {
        System.out.println("Experience: " + years);
    }

    static void showAge(short employeeAge) {
        System.out.println("Age: " + employeeAge);
    }
}