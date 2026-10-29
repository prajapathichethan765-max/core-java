class VoterId{
public static void main(String[] args){

String name = "chethan";
int IDNumber = 321;

System.out.println(VoterId.checkTheNameAndVoterId(name , IDNumber));

}
static String checkTheNameAndVoterId(String nameOfPerson , int voterIDNumber){
System.out.println(nameOfPerson);
System.out.println(voterIDNumber);

if(nameOfPerson == "chettan"){
return "name is matching";
}
else if(voterIDNumber == 322){
return "id number is matching";
}
else if(nameOfPerson == "chethan" && voterIDNumber == 321){
return "name and id number both are matching";
}
return "cheching done";
}
}





