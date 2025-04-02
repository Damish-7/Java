class NumberCount {
    public static void countEven(int[] arr) {
        int evenCount = 0;
        System.out.print("Even numbers: ");
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
                evenCount++;
            }
        }
        System.out.println("\nEven count: " + evenCount);
    }

    public static void countOdd(int[] arr) {
        int oddCount = 0;
        System.out.print("Odd numbers: ");
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
                oddCount++;
            }
        }
        System.out.println("\nOdd count: " + oddCount);
    }
}