class ShoppingDiscountDemo {
    public static void main(String[] args) {
        int shirt = 1200;
        int shoes = 2500;
        int bag = 1800;
        int discount = 500;

        int total = shirt + shoes + bag;
        int difference = shoes - shirt;
        int product = shirt * 2;
        int division = shoes / shirt;
        int remainder = bag % shirt;

        int finalAmount = total - discount;

        System.out.println("Total Amount: " + total);
        System.out.println("Price Difference: " + difference);
        System.out.println("Double Shirt Price: " + product);
        System.out.println("Division Result: " + division);
        System.out.println("Remainder: " + remainder);
        System.out.println("Final Amount: " + finalAmount);

        if (total >= 5000) {
            System.out.println("Customer gets a discount");
        } else {
            System.out.println("Customer does not get a discount");
        }

        if (shirt < shoes && shoes > bag) {
            System.out.println("Shoes are the most expensive item");
        } else {
            System.out.println("Shoes are not the most expensive item");
        }

        if (discount > 0 || total >= 6000) {
            System.out.println("Special offer is available");
        } else {
            System.out.println("No special offer is available");
        }

        if (finalAmount <= 6000 && finalAmount != total) {
            System.out.println("Discount applied successfully");
        } else {
            System.out.println("Discount conditions are not satisfied");
        }
    }

    
}