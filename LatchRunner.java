public class LatchRunner {
    public static void main(String[] args) {
        System.out.println("Latch Types and Prices:");

        Latch.typesWithPrice("Deadbolt Latch", "$15");
        Latch.typesWithPrice("Spring Latch", "$10");
        Latch.typesWithPrice("Sliding Bolt Latch", "$12");
        Latch.typesWithPrice("Chain Latch", "$8");
        Latch.typesWithPrice("Cam Latch", "$18");
    }
}