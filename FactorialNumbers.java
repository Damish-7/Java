class FactorialNumbers {
    public static void showFactorial(int[] arr) {
        for (int num : arr) {
            int fact = 1;
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
            System.out.println("Factorial of " + num + " is " + fact);
        }
    }
}