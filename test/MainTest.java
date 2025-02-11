import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;

public class MainTest {
    Main main = new Main();

    @Test
    public void whenAddTwoDifferentNumbers_ReturnOneResult() {
        int a = 100;
        int b = 200;
        //when
        int result = main.maxValue(a, b);
        //then
        assertEquals(b, result);
    }

    @Test
    public void whenAddTwoSameNumbers_ReturnOneResult() {
        int a = 100;
        int b = 100;
        int result = main.maxValue(a, b);
        assertEquals(a, result);
    }

    @Test
    public void whenAddOneNegativeNumber_ReturnZeroResult() {
        int a = -100;
        int b = 200;
        int result = main.maxValue(a, b);
        assertEquals(b, result);
    }

    @Test
    public void whenAddArrayOfNumber_ReturnArrayOfSymbols() {
       int[] array = {97, 98, 99};
       char[] expected = {'a', 'b', 'c'};
       char[] result = main.toCharArray(array);
       assertArrayEquals(expected, result);
    }

    @Test
    public void whenAddThreeDifferentNumbers_DisBiggest() {
        int c = 100;
        int e = 200;
        int d = 300;
        int result = main.maxValue(c, e, d);
        assertEquals(d, result);
    }

    @Test
    public void whenAddThreeDifferentNumbers_EisBiggest(){
        int c = 7;
        int e = 10;
        int d = 3;
        int result = main.maxValue(c, e, d);
        assertEquals(e, result);
    }

    @Test
    public void whenAddThreeDifferentNumbers_CisBiggest() {
        int c = 45;
        int e = 34;
        int d = 22;
        int result = main.maxValue(c, e, d);
        assertEquals(c, result);
    }

    @Test
    public void whenAddTwoSameNumbersAndOneDifferent_ReturnOneResult() {
        int c = 4;
        int e = 4;
        int d = 2;
        int result = main.maxValue(c, e, d);
        assertEquals(c, result);
    }

    @Test
    public void whenAddThreeSameNumbers_ReturnOneResult() {
        int c = 4;
        int e = 4;
        int d = 4;
        int result = main.maxValue(c, e, d);
        assertEquals(d, result);
    }

    @Test
    public void whenAddFiveDifferentNumbers_ReturnOneResult() {
        int f = 1;
        int g = 2;
        int h = 3;
        int j = 4;
        int k = 5;
        int result = main.maxValue(f, g, h, j, k);
        assertEquals(k, result);
    }

    @Test
    public void whenAddThreeNegativeNumbersAndTwoSame_ReturnOneResult() {
        int f = -1;
        int g = -2;
        int h = -3;
        int j = 2;
        int k = 2;
        int result = main.maxValue(f, g, h, j, k);
        assertEquals(j, result);
    }
    @Test
    public void whenAddFiveNegativeNumbers_ReturnOneResult() {
        int f = -1;
        int g = -2;
        int h = -3;
        int j = -4;
        int k = -5;
        int result = main.maxValue(f, g, h, j, k);
        assertEquals(f, result);
    }

    @Test
    public void whenAddFiveSameNumbers_ReturnOneResult() {
        int f = 10;
        int g = 10;
        int h = 10;
        int j = 10;
        int k = 10;
        int result = main.maxValue(f, g, h, j, k);
        assertEquals(g, result);
    }

    @Test
    public void whenAddSomeSymbols_ReturnString() {
        //when
        char[] array = {'H', 'e', 'l', 'l', 'o'};
        //then
        String result = "Hello";
        assertEquals(result, main.charToString(array));
    }
    @Test
    public void whenAddArrayWithOneElement_ReturnString() {
        char[] array = {'a'};
        String result = "a";
        assertEquals(result, main.charToString(array));
    }
    @Test
    public void whenAddEmptyArray_ReturnEmptyString() {
        char[] array = {};
        String result = "";
        assertEquals(result, main.charToString(array));
    }
    @Test
    public void whenAddArrayWithSpecialSymbols_ReturnString() {
        char[] array = {'!', ' ', '&'};
        String result = "! &";
        assertEquals(result, main.charToString(array));
    }

    @Test
    public void whenAddArrayOfDifferentNumbersAndValue_ReturnOneResult() {
        int[] array = {1, 2, 3};
        int value = 2;
        int expected = 1;
        int result = main.indexOf(array, value);
        assertEquals(expected, result);
    }

    @Test
    public void whenAddArrayOfSameNumbersAndSameValue_ReturnOneResult() {
        int[] array = {3, 3, 3};
        int value = 3;
        int expected = 0;
        int result = main.indexOf(array, value);
        assertEquals(expected, result);
    }

    @Test
    public void whenAddArrayOfNegativeNumbersAndNegativeValue_ReturnOneResult() {
        int[] array = {-3, -1, -2};
        int value = -2;
        main.indexOf(array, value);
        assertEquals(value, -2);
    }

    @Test
    public void whenAddArrayWithOneNumberAndOneValue_ReturnOneResult() {
        int[] array = {1};
        int value = 1;
        main.indexOf(array, value);
        assertEquals(value, 1);
    }

    @Test
    public void whenAddArrayAndDifferentNumbers_ReturnOneResult() {
        int[] array = {1, 2, 3};
        int value = 4;
        int expected = -1;
        int result = main.indexOf(array, value);
        assertEquals(expected, result);
    }

    @Test
    public void whenAddArrayAndOneValue_ReturnOneResult() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int value = 5;
        int expected = 4;
        int result = main.indexOf(array, value);
        assertEquals(expected, result);
    }

    @Test
    public void whenAddArrayNegativeNumbersAndNegativeValue_ReturnOneResult() {
        int[] array = {-13, -15, -20, -45, -61};
        int value = -61;
        int expected = 4;
        int result = main.indexOf(array, value);
        assertEquals(expected, result);
    }

    @Test
    public void whenAddEmptyArrayAndOneValue_ReturnOneResult() {
        int[] array = {};
        int value = 5;
        int expexted = -1;
        int result = main.indexOfEnd(array, value);
        assertEquals(expexted, result);
    }

    @Test
    public void whenAddArrayWithOneNumberAndOneValue_ReturnResult() {
        int[] array = {10};
        int value = 10;
        int expected = 0;
        int result = main.indexOfEnd(array, value);
        assertEquals(expected, result);
    }

    @Test
    public void whenAddNumber_ReturnFactorialOfThisNumber() {
        int a = 3;
        int expected = 6;
        int result = main.factorial(a);
        assertEquals(expected, result);
    }

    @Test
    public void whenAddZero_ReturnFactorial() {
        int a = 0;
        int expected = 1;
        int result = main.factorial(a);
        assertEquals(expected, result);
    }

    @Test
    public void whenAddBigNumber_ReturnFactorial() {
        int a = 10;
        int expected = 3628800;
        int result = main.factorial(a);
        assertEquals(expected, result);
    }

    @Test
    public void whenAddYear_ReturnReslt(){
        int year = 2024;
        boolean result  = main.isLeapYear(year);
        assertTrue(result);
    }

    @Test
    public void whenAddYearDivisibleBy400_ReturnReslt(){
        int year = 2000;
        boolean result  = main.isLeapYear(year);
        assertTrue(result);
    }

    @Test
    public void whenAddYearNotDivisibleBy4_ReturnReslt(){
        int year = 2023;
        boolean result = main.isLeapYear(year);
        assertFalse(result);
    }

    @Test
    public void whenAddZeroYear_ReturnReslt(){
        int year = 0;
        boolean result  = main.isLeapYear(year);
        assertTrue(result);
    }

    @Test
    public void whenAddArrayAndNumber_ReturnMultipleNumbers() {
        int[] array = {10, 11, 12};
        int value = 2;
        int result = 10;
        main.multiple(array, value);
        assertEquals(10, result);
    }

    @Test
    public void whenAddArrayAndDifferentNumbers_ReturnMultipleNumbers() {
        int[] array = {10, 11, 12};
        int value = 7;
        main.multiple(array, value);
        assertEquals(0, 0);
    }

    @Test
    public void whenAddArrayWithSameNumbersAndValue_ReturnMultipleNumbers() {
        int[] array = {12, 12, 12};
        int value = 2;
        main.multiple(array, value);
        assertEquals(12, 12);
    }

    @Test
    public void whenAddArrayWithNegativeNumbersAndValue_ReturnMultipleNumbers() {
        int[] array = {-12, -14, 9};
        int value = 2;
        main.multiple(array, value);
        assertEquals(-12, -12);
    }

    @Test
    public void whenAddEmptyArrayAndOneValue_ReturnMultipleNumbers() {
        int[] array = {};
        int value = 2;
        main.multiple(array, value);
        assertEquals(0, 0);
    }

    @Test
    public void whenAddArray_ReturnSortingArray() {
        int[] array = {10, 6, 2, 13, 1, 43};
        int[] result = {1, 2, 6, 10, 13, 43};
        main.sorting(array);
        assertArrayEquals(result, array);
    }

    @Test
    public void whenAddArrayWithOneNumber_ReturnSortingArray() {
        int[] array = {1};
        int[] result = {1};
        main.sorting(array);
        assertArrayEquals(result, array);
    }

    @Test
    public void whenAddArrayWithSameNumbers_ReturnSortingArray() {
        int[] array = {2, 3, 2, 1, 1, 3};
        int[] result = {1, 1, 2, 2, 3, 3};
        main.sorting(array);
        assertArrayEquals(result, array);
    }

    @Test
    public void whenAddArrayWithNegativeNumbers_ReturnSortingArray() {
        int[] array = {-5, -12, -2, -16, 0, -3};
        int[] result = {-16, -12, -5, -3, -2, 0};
        main.sorting(array);
        assertArrayEquals(result, array);
    }

    @Test
    public void whenAddArray_ReturnRepitingElements() {
        byte[] array = {1, 1, 2, 3, 2, 4,};
        boolean result = main.reiteration(array);
        assertTrue(result);
    }

    @Test
    public void whenAddArrayWithSameNumbers_ReturnRepitingElements() {
        byte[] array = {1, 1, 1, 1};
        boolean result = main.reiteration(array);
        assertTrue(result);
    }

    @Test
    public void whenAddEmptyArrayAnd_ReturnRepiting() {
        byte[] array = {};
        boolean result = main.reiteration(array);
        assertFalse(result);
    }

    @Test
    public void whenAddNegativeElements_ReturnRepiting() {
        byte[] array = {-1, -2, -1, 0, 2};
        boolean result = main.reiteration(array);
        assertTrue(result);
    }

    @Test
    public void whenAddTwoArrays_ReturnNewArrayWithMultipliedElements() {
        int[] array = {1, 2, 3, 4};
        int[] arraySecond = {1, 2, 3, 4};
        int[] expected = {1, 4, 9, 16};
        int[] result = main.arrsMath(array, arraySecond);
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenAddTwoArraysWithNegativeElements_ReturnNewArrayWithMultipliedElements() {
        int[] array = {-1, -2, -1, -3};
        int[] arraySecond = {2, -2, -4, 3};
        int[] expected = {-2, 4, 4, -9};
        int[] result = main.arrsMath(array, arraySecond);
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenAddTwoArraysWithZero_ReturnNewArrayWithMultipliedElements() {
        int[] array = {0, 1};
        int[] arraySecond = {1, 0};
        int[] expected = {0, 0};
        int[] result = main.arrsMath(array, arraySecond);
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenAddTwoEmptyArrays_ReturnNewArrayWithMultipliedElements() {
        int[] array = {};
        int[] arraySecond = {};
        int[] expected = {};
        int[] result = main.arrsMath(array, arraySecond);
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenAddTwoArrays_ReturnNewArrayWithDifferentOfThem() {
        int[] array = {1, 2, 3, 4, 12};
        int[] arraySecond = {1, 5, 10, 2, 4};
        int[] expected = {3, 12, 5, 10};
        int[] result = main.offSet(array, arraySecond);
        assertArrayEquals(expected, result);
    }
    @Test
    public void whenAddTwoSameArrays_ReturnNewArrayWithDifferentOfThem() {
        int[] array = {1, 2, 3, 4, 12};
        int[] arraySecond = {1, 2, 3, 4, 12};
        int[] expected = {};
        int[] result = main.offSet(array, arraySecond);
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenAddTwoNegativeArrays_ReturnNewArrayWithDifferentOfThem() {
        int[] array = {1, -2, 3, -4, -12};
        int[] arraySecond = {-1, 2, -2, 4, -12};
        int[] expected = {1, 3, -4, -1, 2, 4};
        int[] result = main.offSet(array, arraySecond);
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenAddTwoEmptyArrays_ReturnNewArrayWithDifferentOfThem() {
        int[] array = {};
        int[] arraySecond = {};
        int[] expected = {};
        int[] result = main.offSet(array, arraySecond);
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenAddArray_ReturnItInReverse(){
        int[] array = {1, 2, 3, 4, 12};
        int[] expected = {12, 4, 3, 2, 1};
        int[] result = main.reverseArray(array);
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenAddArrayWithOneElement_ReturnItInReverse(){
        int[] array = {1};
        int[] expected = {1};
        int[] result = main.reverseArray(array);
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenAddEmptyArray_ReturnItInReverse(){
        int[] array = {};
        int[] expected = {};
        int[] result = main.reverseArray(array);
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenAddThreeValues_ReturnRandomArray() {
        int min = 1;
        int max = 100;
        int length = 5;
        int[] result = main.randomArray(min, max, length);
        int expected = 5;
        assertEquals(expected, result.length);
    }

    @Test
    public void whenAddThreValuesLenghtZero_ReturnRandomArray() {
        int min = 3;
        int max = 10;
        int length = 0;
        int[] result = main.randomArray(min, max, length);
        int expected = 0;
        assertEquals(expected, result.length);
    }

    @Test
    public void whenAddTwoCharArrays_ReturnSame(){
        char[] first = {'a', 'b', 'c'};
        char[] second = {'a', 'b', 'c'};
        assertTrue(main.arrayChar(first, second));
    }

    @Test
    public void whenAddTwoDifferentArrays_ReturnSame(){
        char[] first = {'a', 'b', 'c'};
        char[] second = {'d', 'e', 'f'};
        assertFalse(main.arrayChar(first, second));
    }

    @Test
    public void whenAddTwoEmptyCharArrays_ReturnSame(){
        char[] first = {};
        char[] second = {};
        assertFalse(main.arrayChar(first, second));
    }
}