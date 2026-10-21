class ElectricityBillDemo {

    public static void main(String[] args) {
        int units = 250;
        int rate = 6;
        int fixedCharge = 100;
        int previousUnits = 200;

        float taxRate = 5.0f;
        float billAmount = units * rate;
        float totalBill = billAmount + fixedCharge;
        float tax = totalBill * taxRate / 100;
        float finalBill = totalBill + tax;

        System.out.println("Bill Amount: " + billAmount);
        System.out.println("Total Before Tax: " + totalBill);
        System.out.println("Tax Amount: " + tax);
        System.out.println("Final Bill: " + finalBill);

        if (units > previousUnits) {
            System.out.println("Electricity usage has increased");
        } else {
            System.out.println("Electricity usage has not increased");
        }

        if (units >= 200 && finalBill > 1000) {
            System.out.println("High electricity consumption");
        } else {
            System.out.println("Normal electricity consumption");
        }

        if (units < 100 || fixedCharge == 0) {
            System.out.println("Low usage or no fixed charge");
        } else {
            System.out.println("Regular billing conditions apply");
        }

        if (billAmount != totalBill) {
            System.out.println("Fixed charge is included in the total");
        } else {
            System.out.println("No additional charge is included");
        }
    }

    }