class StudentMarkss{
static String[] studentNameAndCourse = {"chethan","cse"};

public static void main(String[] sdf){

int[] marks = new int[5];

marks[0] = 100;
marks[1] = 98;
marks[2] = 99;
marks[3] = 87;
marks[4] = 77;

System.out.println(marks[0]); 
System.out.println(marks[1]); 
System.out.println(marks[2]); 
System.out.println(marks[3]); 
System.out.println(marks[4]);

System.out.println(StudentMarkss.studentNameAndCourse[0]); 
 System.out.println(StudentMarkss.studentNameAndCourse[1]);
 
 int[] marksOfStudent = {29 ,72, 47 ,24,28};
 int total = 435;
 int mark = StudentMarkss.checkStudent2Marks(marksOfStudent , total);
 System.out.println(mark);
 
}

static int checkStudent2Marks(int marksOfSecStudent[] , int totalMarks){
System.out.println(marksOfSecStudent[0]); 
System.out.println(marksOfSecStudent[1]); 
System.out.println(marksOfSecStudent[2]); 
System.out.println(marksOfSecStudent[3]); 
System.out.println(marksOfSecStudent[4]);

return  marksOfSecStudent[1]  +marksOfSecStudent[2] + marksOfSecStudent[3] + totalMarks;
}
}
 



