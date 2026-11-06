class LibraryManagement{
	public static void main(String[] args){

		String book1 = "Java";
		String book2 = "Python";
		String book3 = "C Programming";
		String book4 = "HTML";
		String book5 = "SQL";

		String bookNames[] = {book1, book2, book3, book4, book5};

		System.out.println("Book 0 = "+bookNames[0]);
		System.out.println("Book 1 = "+bookNames[1]);
		System.out.println("Book 2 = "+bookNames[2]);
		System.out.println("Book 3 = "+bookNames[3]);
		System.out.println("Book 4 = "+bookNames[4]);

		char grade1 = 'A';
		char grade2 = 'B';
		char grade3 = 'C';
		char grade4 = 'A';
		char grade5 = 'B';

		char bookGrades[] = {grade1, grade2, grade3, grade4, grade5};

		System.out.println("Grade 0 = "+bookGrades[0]);
		System.out.println("Grade 1 = "+bookGrades[1]);
		System.out.println("Grade 2 = "+bookGrades[2]);
		System.out.println("Grade 3 = "+bookGrades[3]);
		System.out.println("Grade 4 = "+bookGrades[4]);

		bookGrades[2] = 'A';

		System.out.println("Updated grade = "+bookGrades[2]);
	}
}