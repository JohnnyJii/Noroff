public class App {

    public static int diff(int[] A) {
        int diff = Integer.MIN_VALUE;
        int i, j;
        for (i = 0; i < A.length - 1; i++) {
            for (j = i + 1; j < A.length; j++) {
                diff = Integer.max(diff, A[j] - A[i]);
            }
        }
        return diff;
    }
 

    public static void main(String[] args) throws Exception {
        int[] A = { 2, 3, 1, 7, 9, 5, 11, 3, 5 };

        System.out.println("The maximum difference between two array elements is: " + diff(A));
    }
}
