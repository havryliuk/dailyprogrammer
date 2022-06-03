package codewars;

public class SquareSum {

    static int squareSum(int[] array) {
        double result = 0;
        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            try {
                int next = array[i + 1];
                result = result + Math.pow(current, next);
            } catch (IndexOutOfBoundsException e) {
                result = result + Math.pow(current, current);
                System.out.println("Reached end of array.");
            }
        }
        return (int) result;
    }
}
