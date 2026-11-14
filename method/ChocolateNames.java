class ChocolateNames{
    public static void main(String[] args){

        String chocolate1 = "Dairy Milk";
        String chocolate2 = "Kitkat";
        String chocolate3 = "5 Star";
        String chocolate4 = "Munch";
        String chocolate5 = "Perk";

        System.out.println(chocolate1);
        System.out.println(chocolate2);
        System.out.println(chocolate3);
        System.out.println(chocolate4);
        System.out.println(chocolate5);

        String chocolates = ChocolateNames.chocolateBrands(
            chocolate1, chocolate2, chocolate3, chocolate4, chocolate5);

        System.out.println(chocolates);
    }

    static String chocolateBrands(String c1, String c2,
    String c3, String c4, String c5){

        String sweets[] = {c1, c2, c3, c4, c5};

        System.out.println(sweets[0]);
        System.out.println(sweets[1]);
        System.out.println(sweets[2]);
        System.out.println(sweets[3]);
        System.out.println(sweets[4]);

        sweets[0] = "Milky Bar";
        sweets[4] = "Temptation";

        System.out.println(sweets[0]);
        System.out.println(sweets[4]);

        return sweets[0] + sweets[1] + sweets[2]
        + sweets[3] + sweets[4];
    }
}