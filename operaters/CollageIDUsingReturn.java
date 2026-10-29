class CollageIDUsingReturn{
public static void main(String[] args){

String nameOfStudent = "ankit";
int usn = 061;

String detile = CollageIDUsingReturn.checkStudentNameAndUsn(nameOfStudent , usn);
System.out.println(detile);

}
static String checkStudentNameAndUsn(String name , int usn){

System.out.println(name);
System.out.println(usn);

if(name == "ankit" && usn == 051){
retrun " name and usn is correct ";
}
else if( name == "ankit" && usn == 061 ){
retrun "name and use is matching";
}
else if(name == "chrthan" && use == 061){
retrun "name and use are matching";
}
else{
retrun "invalid name and usn";

}
}
}
