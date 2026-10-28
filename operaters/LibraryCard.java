class LibraryCard {
    public static void main(String[] args) {

        String memberName = "Ravi";
        int cardNumber = 789;

        LibraryCard.checkLibraryCard(memberName, cardNumber);
    }

    static void checkLibraryCard(String name, int cardNo) {
        System.out.println(name);
        System.out.println(cardNo);

        if (name.equals("Manoj")) {
            System.out.println("Member name is matching");
        }
        else if (cardNo == 790) {
            System.out.println("Card number is matching");
        }
        else if (name.equals("Ravi") && cardNo == 789) {
            System.out.println("Member name and card number both are matching");
        }
    }
}