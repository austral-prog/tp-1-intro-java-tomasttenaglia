package com.template;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

class AppTest {

    App exercises = new App();

    @Test
    public void testSum() {
        assertEquals(5, exercises.sum(2, 3));
        assertEquals(0, exercises.sum(-1, 1));
    }

    @Test
    public void testIsEven() {
        assertTrue(exercises.isEven(4));
        assertFalse(exercises.isEven(3));
    }

    @Test
    public void testMax() {
        assertEquals(5, exercises.max(3, 5));
        assertEquals(10, exercises.max(10, 2));
    }

    @Test
    public void testFactorial() {
        assertEquals(120, exercises.factorial(5));
        assertEquals(1, exercises.factorial(0));
    }

    @Test
    public void testCountChars() {
        assertEquals(5, exercises.countChars("Hello"));
        assertEquals(0, exercises.countChars(""));
    }

    @Test
    public void testReverse() {
        assertEquals("olleH", exercises.reverse("Hello"));
        assertEquals("", exercises.reverse(""));
    }

    @Test
    public void testIsPrime() {
        assertTrue(exercises.isPrime(7));
        assertFalse(exercises.isPrime(4));
    }

    @Test
    public void testFindMin() {
        assertEquals(1, exercises.findMin(new int[]{3, 1, 4, 1, 5}));
        assertEquals(-1, exercises.findMin(new int[]{0, -1, 1}));
    }

    @Test
    public void testArraySum() {
        assertEquals(10, exercises.arraySum(new int[]{1, 2, 3, 4}));
        assertEquals(0, exercises.arraySum(new int[]{}));
    }

    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(32.0, exercises.celsiusToFahrenheit(0.0));
        assertEquals(212.0, exercises.celsiusToFahrenheit(100.0));
    }

    @Test
    public void testSumList() {
        assertEquals(10, exercises.sumList(Arrays.asList(1, 2, 3, 4)));
        assertEquals(0, exercises.sumList(Collections.emptyList()));
    }

    @Test
    public void testFindMax() {
        assertEquals(8, exercises.findMax(Arrays.asList(1, 8, 3, 4)));
        assertThrows(IllegalArgumentException.class, () -> exercises.findMax(Collections.emptyList()));
    }

    @Test
    public void testFilterEvenNumbers() {
        List<Integer> expected = Arrays.asList(2, 4, 6);
        assertEquals(expected, exercises.filterEvenNumbers(Arrays.asList(1, 2, 3, 4, 5, 6)));
        assertEquals(Collections.emptyList(), exercises.filterEvenNumbers(Arrays.asList(1, 3, 5)));
    }

    @Test
    public void testConcatenateLists() {
        List<String> list1 = Arrays.asList("a", "b");
        List<String> list2 = Arrays.asList("c", "d");
        List<String> expected = Arrays.asList("a", "b", "c", "d");
        assertEquals(expected, exercises.concatenateLists(list1, list2));
    }

    @Test
    public void testListContains() {
        assertTrue(exercises.listContains(Arrays.asList("a", "b", "c"), "b"));
        assertFalse(exercises.listContains(Arrays.asList("a", "b", "c"), "d"));
    }

    @Test
    public void testToUpperCase() {
        List<String> input = Arrays.asList("hello", "world");
        List<String> expected = Arrays.asList("HELLO", "WORLD");
        assertEquals(expected, exercises.toUpperCase(input));
    }

    @Test
    public void testRemoveDuplicates() {
        List<Integer> input = Arrays.asList(1, 2, 2, 3, 1, 4);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4);
        assertEquals(expected, exercises.removeDuplicates(input));
    }

    @Test
    void testListToSet() {
        App app = new App();
        List<Integer> listWithDuplicates = Arrays.asList(1, 2, 2, 3, 1, 3);
        Set<Integer> expectedSet = Set.of(1, 2, 3);
        assertEquals(expectedSet, app.listToSet(listWithDuplicates));
    }

    @Test
    void testMapContainsKey() {
        App app = new App();
        Map<String, String> map = Map.of("Hello", "World", "Java", "Programming");
        assertTrue(app.mapContainsKey(map, "Hello"));
        assertFalse(app.mapContainsKey(map, "Python"));
    }

    @Test
    void testMapContainsValue() {
        App app = new App();
        Map<String, String> map = Map.of("Hello", "World", "Java", "Programming");
        assertTrue(app.mapContainsValue(map, "World"));
        assertFalse(app.mapContainsValue(map, "Scripting"));
    }

    @Test
    void testIterateMap() {
        App app = new App();
        Map<String, String> map = Map.of("Hello", "World", "Java", "Programming");
        List<String> expected = Arrays.asList("Hello -> World", "Java -> Programming");
        List<String> result = app.iterateMap(map);
        Collections.sort(expected);
        Collections.sort(result);
        assertEquals(expected, result);
    }
}
