class PanCard{
public static void main(String[] args){
String name = "chethan";
String panNumber = "CP98I4FD";

PanCard.checkTheName(name , panNumber);


}
static void checkTheName(String nameOfCandidate , String numberOfPan ){
System.out.println("name of the candidate is ="+ nameOfCandidate);
System.out.println("pan number of candidate="+ numberOfPan);

if(nameOfCandidate == "chethaan" && numberOfPan == "CP87IPCS"){
System.out.println("candidate pan number is matching");
System.out.println("candidate name is matching");
}
else if(nameOfCandidate == "chetha" && numberOfPan == "ch327id"){
System.out.println("candidate pan number  is matching");
System.out.println("candidate name is matching");
}
else if (nameOfCandidate == "chethan" && numberOfPan == "CP98I4FD"){
System.out.println("candidate number is  is matching");
System.out.println("candidate name is matching");
}
else {
System.out.println("inavlid input");

}
}
}

