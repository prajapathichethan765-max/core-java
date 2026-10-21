class EmployeeSalaryDemo {

    public static void main(String[] args) {
        int salary = 45000;
        int experience = 5;
        int age = 28;
        int bonus = 5000;

        int totalSalary = salary + bonus;
        System.out.println("Total Salary: " + totalSalary);

        if (salary >= 40000 && experience >= 3) {
            System.out.println("Employee is eligible for promotion");
        } else {
            System.out.println("Employee is not eligible for promotion");
        }

        if (age < 25 || experience >= 5) {
            System.out.println("Employee meets one requirement");
        } else {
            System.out.println("Employee does not meet any requirement");
        }

        if (salary != bonus) {
            System.out.println("Salary and bonus are different");
        } else {
            System.out.println("Salary and bonus are equal");
        }
    }
}