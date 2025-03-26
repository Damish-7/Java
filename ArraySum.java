class ArraySum {
    public static void sum(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        System.out.println("Sum: " + total);
    }
}