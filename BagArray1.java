public class PaintArray {
    public static void main(String[] args) {
       
        String paint1 = "Acrylic Paint";
        String paint2 = "Oil Paint";
        String paint3 = "Watercolor Paint";
        String paint4 = "Spray Paint";
        String paint5 = "Tempera Paint";

        
        String[] paints = {paint1, paint2, paint3, paint4, paint5};

      
        for (int index = 0; index < 5; index++) {
            System.out.println(paints[index]);
        }
    }
}