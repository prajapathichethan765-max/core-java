class FruitsShop {
    static String fruitDetails(String f1, String f2, String f3, String f4, String f5) {

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
        System.out.println(f5);

        String fruits[] = {f1, f2, f3, f4, f5};

        System.out.println(fruits[0]);
        System.out.println(fruits[1]);
        System.out.println(fruits[2]);
        System.out.println(fruits[3]);
        System.out.println(fruits[4]);

        return fruits[0] + " " + fruits[1] + " " + fruits[2]
             + " " + fruits[3] + " " + fruits[4];
    }
}