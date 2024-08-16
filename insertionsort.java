package DataStructers;

public class insertionsort {
    public static void main(String[] args) {
        int[] array = { 8, 7, 9, 2, 3, 1, 5, 4, 6 };
        insertionsort(array);
        for (int i : array) {
            System.out.print(i);
        }
    }

    public static void insertionsort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }
}
