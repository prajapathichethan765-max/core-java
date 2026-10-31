class VoteEligibilty{
public static void main(String[] args){

String name = "chethan";
int age = 22;
String eligibility = VoteEligibilty.checkTheEligibilityOfPerson(name , age);
System.out.println(eligibility);


}
static String checkTheEligibilityOfPerson(String nameOfPerson , int ageOfPerson){

System.out.println(nameOfPerson);
System.out.println(ageOfPerson);

if(ageOfPerson>=18 && nameOfPerson == "chethan"){
return "the person is eligibility for vote";
}
else {
return "person is not eligibility for  vote";
}

}
}
