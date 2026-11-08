class FruitsShopRunner {
    public static void main(String[] args) {

        String fruit1 = "Apple";
        String fruit2 = "Mango";
        String fruit3 = "Orange";
        String fruit4 = "Banana";
        String fruit5 = "Grapes";

        String result = FruitsShop.fruitDetails(
            fruit1, fruit2, fruit3, fruit4, fruit5);

        System.out.println(result);

        System.out.println(fruit1);
        System.out.println(fruit2);
        System.out.println(fruit3);
        System.out.println(fruit4);
        System.out.println(fruit5);
    }
}