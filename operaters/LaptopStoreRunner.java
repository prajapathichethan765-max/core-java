class LaptopStoreRunner {
    public static void main(String[] args) {

        double laptop1 = 1.5;
        double laptop2 = 1.8;
        double laptop3 = 2.0;
        double laptop4 = 1.2;
        double laptop5 = 2.3;

        double result = LaptopStore.laptopWeights(laptop1, laptop2, laptop3, laptop4, laptop5);

        System.out.println("Total laptop weight: " + result);

        System.out.println(laptop1);
        System.out.println(laptop2);
        System.out.println(laptop3);
        System.out.println(laptop4);
        System.out.println(laptop5);
    }
}