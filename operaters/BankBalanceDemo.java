class BankBalanceDemo {

    public static void main(String[] args) {
        long account1 = 150000L;
        long account2 = 85000L;
        long deposit = 25000L;
        long withdrawal = 10000L;

        long totalBalance = account1 + deposit;
        long remainingBalance = account2 - withdrawal;
        long combinedBalance = account1 + account2;
        long dividedAmount = account1 / account2;
        long remainderAmount = account1 % account2;

        System.out.println("Updated Account 1: " + totalBalance);
        System.out.println("Updated Account 2: " + remainingBalance);
        System.out.println("Combined Balance: " + combinedBalance);
        System.out.println("Division Result: " + dividedAmount);
        System.out.println("Remainder: " + remainderAmount);

        if (account1 > account2) {
            System.out.println("Account 1 has more money");
        } else {
            System.out.println("Account 2 has more money or equal balance");
        }

        if (deposit >= withdrawal && account1 != account2) {
            System.out.println("Both conditions are satisfied");
        } else {
            System.out.println("Both conditions are not satisfied");
        }

        if (account2 < account1 || withdrawal > deposit) {
            System.out.println("At least one condition is true");
        } else {
            System.out.println("No condition is true");
        }
    }

    
}