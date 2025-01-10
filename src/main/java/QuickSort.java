public class QuickSort {

    // Phương thức chính để gọi QuickSort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            // Sắp xếp các phần bên trái và phải của pivot
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Chia mảng và trả về chỉ số pivot
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Chọn phần tử cuối làm pivot
        int i = low - 1; // Chỉ số của phần tử nhỏ hơn pivot

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Hoán đổi arr[i] và arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Đưa pivot về đúng vị trí
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
