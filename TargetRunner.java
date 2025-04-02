public class TargetRunner {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3; 

        if (TargetArray.checkTarget(arr, target)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}