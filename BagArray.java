public class BagArray {
    public static void main(String[] args) {
        
        String bag1 = "Backpack";
        String bag2 = "Messenger Bag";
        String bag3 = "Tote Bag";
        String bag4 = "Duffel Bag";
        String bag5 = "Laptop Bag";

        
        String[] bags = {bag1, bag2, bag3, bag4, bag5};

        
        for (String bag : bags) {
            System.out.println(bag);
        }
    }
}
