class BankAccount {
    public static void main(String[] args) {

        String accountHolder = "Chethan";
        int accountNumber = 123;

        BankAccount.checkAccount(accountHolder, accountNumber);
    }

    static void checkAccount(String name, int accNumber) {
        System.out.println(name);
        System.out.println(accNumber);

        if (name.equals("Rahul")) {
            System.out.println("Name is matching");
        }
        else if (accNumber == 124) {
            System.out.println("Account number is matching");
        }
        else if (name.equals("Chethan") && accNumber == 123) {
            System.out.println("Name and account number both are matching");
        }
    }
}