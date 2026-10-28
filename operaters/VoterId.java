class VoterId{
public static void main(String[] args){

String name = "chethan";
int IDNumber = 321;

VoterId.checkTheNameAndVoterId(name , IDNumber);

}
static void checkTheNameAndVoterId(String nameOfPerson , int voterIDNumber){
System.out.println(nameOfPerson);
System.out.println(voterIDNumber);

if(nameOfPerson == "chettan"){
System.out.println("name is matching");
}
else if(voterIDNumber == 322){
System.out.println("id number is matching");
}
else if(nameOfPerson == "chethan" && voterIDNumber == 321){
System.out.println("name and id number both are matching");
}
}
}





