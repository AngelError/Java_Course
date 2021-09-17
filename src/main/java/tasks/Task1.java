package tasks;

public class Task1 {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int n = 4;
        int[] cars = {6, 2, 12, 7};
        int k = 3;

        System.out.println("n = " + n);
        System.out.println("cars = { " + Arrays.toString(cars) + " }");
        System.out.println("k = " + k);

        if (cars.length == n) {
            Arrays.sort(cars);

            for (int i = 0; i < n - 2; i++) {
                int min1 = cars[i + k - 1] - cars[i];
                if (min1 < min) {
                    min = min1;
                }
            }
            System.out.println("the minimum length of a roof that can cover " + k + " cars" + min + 1);
        }
    }
}
