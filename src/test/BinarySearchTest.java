package test;

import org.junit.Test;

import static main.BonusBinarySearch.binarySearch;
import static org.junit.Assert.assertEquals;

public class BinarySearchTest {

    @Test
    public void intFoundTest() {
        int[] numbers = {1, 2, 3, 4};
        assertEquals(2, binarySearch(numbers, 3));
    }

    @Test
    public void intFoundFirstValueTest() {
        int[] numbers = {1, 2, 3, 4};
        assertEquals(0, binarySearch(numbers, 1));
    }

    @Test
    public void intFoundLastValueTest() {
        int[] numbers = {1, 2, 3, 4};
        assertEquals(3, binarySearch(numbers, 4));
    }

    @Test
    public void intFoundMiddleTest() {
        int[] numbers = {1, 2, 3, 4, 5};
        assertEquals(2, binarySearch(numbers, 3));
    }

    @Test
    public void intNotFoundGreaterThanAllTest() {
        int[] numbers = {1, 2, 3, 4};
        assertEquals(-1, binarySearch(numbers, 5));
    }

    @Test
    public void intNotFoundLessThanAllTest() {
        int[] numbers = {10, 20, 30, 40};
        assertEquals(-1, binarySearch(numbers, 5));
    }

    @Test
    public void intNotFoundBetweenMinAndMaxTest() {
        int[] numbers = {10, 20, 30, 40};
        assertEquals(-1, binarySearch(numbers, 15));
    }
}
