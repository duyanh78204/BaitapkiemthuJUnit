import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuickSortTest {

    @Test
    void testQuickSortSortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void testQuickSortUnsortedArray() {
        int[] arr = {5, 3, 2, 4, 1};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void testQuickSortEmptyArray() {
        int[] arr = {};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    void testQuickSortArrayWithDuplicates() {
        int[] arr = {4, 2, 2, 8, 4};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{2, 2, 4, 4, 8}, arr);
    }

    @Test
    void testQuickSortArrayWithNegativeNumbers() {
        int[] arr = {-3, -1, -2, 0, 1};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{-3, -2, -1, 0, 1}, arr);
    }

    @Test
    void testQuickSortArrayWithMinAndMaxValues() {
        int[] arr = {Integer.MAX_VALUE, Integer.MIN_VALUE, 0};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{Integer.MIN_VALUE, 0, Integer.MAX_VALUE}, arr);
    }

    @Test
    public void testLargeArray() {
        int[] array = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = array.length - i;
        }
        QuickSort.quickSort(array, 0, array.length - 1);
        for (int i = 0; i < array.length - 1; i++) {
            assertTrue(array[i] <= array[i + 1]);
        }
    }

    @Test
    void testQuickSortSingleElementArray() {
        int[] arr = {42};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{42}, arr);
    }

    @Test
    void testQuickSortReversedArray() {
        int[] arr = {5, 4, 3, 2, 1};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void testQuickSortAllZeros() {
        int[] arr = {0, 0, 0, 0};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{0, 0, 0, 0}, arr);
    }

    @Test
    void testQuickSortSingleElement() {
        int[] arr = {42};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{42}, arr);
    }

    @Test
    void testQuickSortTwoSortedElements() {
        int[] arr = {1, 2};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{1, 2}, arr);
    }

    @Test
    void testQuickSortTwoUnsortedElements() {
        int[] arr = {2, 1};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{1, 2}, arr);
    }

    @Test
    void testQuickSortSortedDescendingArray() {
        int[] arr = {5, 4, 3, 2, 1};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void testQuickSortArrayWithIdenticalElements() {
        int[] arr = {7, 7, 7, 7, 7};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{7, 7, 7, 7, 7}, arr);
    }
}
