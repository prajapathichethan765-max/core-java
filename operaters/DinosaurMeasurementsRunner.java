class DinosaurMeasurementsRunner {
    public static void main(String[] args) {

        float tRex = 12.5f;
        float brachiosaurus = 25.5f;
        float velociraptor = 2.1f;
        float stegosaurus = 9.0f;
        float triceratops = 8.5f;

        float total = DinosaurMeasurements.dinosaurDetails(
            tRex, brachiosaurus, velociraptor, stegosaurus, triceratops);

        System.out.println("Total measurements: " + total);

        System.out.println(tRex);
        System.out.println(brachiosaurus);
        System.out.println(velociraptor);
        System.out.println(stegosaurus);
        System.out.println(triceratops);
    }
}