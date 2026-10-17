class Salary{
	public static void main(String[] args){
		System.out.println("salary of work of the year 2023 , 2024, 2025");
		int a=11223;
		int b=21363;
		int c=12786;
		Salary.salaryOfWorker(a , b, c);

		System.out.println("salary of teacher of the year 2023 , 2024, 2025");
		Salary.salaryOfTeacher(2000,30000,10000);
		
		

	}
	static void salaryOfWorker(int a, int b, int c){
		System.out.println("salary of 2023="+a);
		System.out.println("salary of 2024="+b);
		System.out.println("salary of 2025="+c);
	}
	static void salaryOfTeacher(int a, int b, int c){
			System.out.println("salary of 2024="+a);
		System.out.println("salary of 2024="+b);
		System.out.println("salary of 2024="+c);
	}
	
}
