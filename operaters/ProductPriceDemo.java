class ProductPriceDemo {

    public static void main(String[] args) {
        float laptop = 55000.50f;
        float mobile = 25000.25f;
        float discount = 5000.00f;
        float delivery = 500.00f;

        float total = laptop + mobile;
        float finalPrice = total - discount;
        float extraCharge = discount + delivery;
        float average = total / 2;
        float remainder = laptop % mobile;

        System.out.println("Total Price: " + total);
        System.out.println("Final Price: " + finalPrice);
        System.out.println("Extra Charges: " + extraCharge);
        System.out.println("Average Price: " + average);
        System.out.println("Remainder: " + remainder);

        if (laptop > mobile) {
            System.out.println("Laptop is more expensive");
        } else {
            System.out.println("Mobile is more expensive or equal");
        }

        if (finalPrice <= 80000 && delivery < 1000) {
            System.out.println("Purchase is within the budget");
        } else {
            System.out.println("Purchase exceeds the budget");
        }

        if (discount != delivery) {
            System.out.println("Discount and delivery charges differ");
        } else {
            System.out.println("Both amounts are equal");
        }
    }

    
}