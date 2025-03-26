public class WallArray {
    public static void main(String[] args) {
        
        String wall1 = "Brick Wall";
        String wall2 = "Concrete Wall";
        String wall3 = "Glass Wall";
        String wall4 = "Wooden Wall";
        String wall5 = "Stone Wall";

        
        String[] walls = {wall1, wall2, wall3, wall4, wall5};
		
        for (int index = 0; index < 5; index++) {
            System.out.println(walls[index]);
        }
    }
}
