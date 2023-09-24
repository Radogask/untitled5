//№21-667
//Вариант 0
public class Main {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] > target) {
                right = mid - 1;
            }

            else {
                left = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 12, 4, 25, 51, 17};
        int target = 3;
        int result = binarySearch(array, target);
        System.out.println("Индекс элемента " + target + " в массиве: " + result);
    }
}