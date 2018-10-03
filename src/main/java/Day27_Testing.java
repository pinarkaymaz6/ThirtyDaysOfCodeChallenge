import java.util.*;

public class Day27_Testing {

    public static int minimum_index(int[] seq) {
        if (seq.length == 0) {
            throw new IllegalArgumentException("Cannot get the minimum value index from an empty sequence");
        }
        int min_idx = 0;
        for (int i = 1; i < seq.length; ++i) {
            if (seq[i] < seq[min_idx]) {
                min_idx = i;
            }
        }
        return min_idx;
    }
    static class TestDataEmptyArray {
        public static int[] get_array() {
            return new int[0];
        }
    }

    static class TestDataUniqueValues {
        static int[] array;

        public static int[] get_array() {
            int max = 10;
            int min = 2;
            Random random = new Random();
            int size = random.nextInt((max - min) + 1) + min;
            Set<Integer> set = new HashSet<Integer>();
            for(int i=0; i< size; i++){
                set.add(random.nextInt(100));
            }

            array = new int[size];
            int i = 0;
            for(int value: set){
                array[i++] = value;
                System.out.println(value);
            }
            return array;
        }

        public static int get_expected_result() {
            int min = 9999999;
            int minIndex = -1;
            for(int i = 0; i < array.length; i++){
                if(array[i] < min){
                    min = array[i];
                    minIndex = i;
                }
            }
            return minIndex;
        }
    }

    static class TestDataExactlyTwoDifferentMinimums {
        static int[] array = new int[2];
        public static int[] get_array() {
            Random random = new Random();
            array[0] = random.nextInt(100);
            array[1] = array[0];
            return array;
        }

        public static int get_expected_result() {
            int min = 9999999;
            int minIndex = -1;
            for(int i = 0; i < array.length; i++){
                if(array[i]< min){
                    min = array[i];
                    minIndex = i;
                }
            }
            return minIndex;
        }
    }

    public static void TestWithEmptyArray() {
        try {
            int[] seq = TestDataEmptyArray.get_array();
            int result = minimum_index(seq);
        } catch (IllegalArgumentException e) {
            return;
        }
        throw new AssertionError("Exception wasn't thrown as expected");
    }

    public static void TestWithUniqueValues() {
        int[] seq = TestDataUniqueValues.get_array();
        if (seq.length < 2) {
            throw new AssertionError("less than 2 elements in the array");
        }

        Integer[] tmp = new Integer[seq.length];
        for (int i = 0; i < seq.length; ++i) {
            tmp[i] = Integer.valueOf(seq[i]);
        }
        if (!((new LinkedHashSet<Integer>(Arrays.asList(tmp))).size() == seq.length)) {
            throw new AssertionError("not all values are unique");
        }

        int expected_result = TestDataUniqueValues.get_expected_result();
        int result = minimum_index(seq);
        if (result != expected_result) {
            throw new AssertionError("result is different than the expected result");
        }
    }

    public static void TestWithExactlyTwoDifferentMinimums() {
        int[] seq = TestDataExactlyTwoDifferentMinimums.get_array();
        if (seq.length < 2) {
            throw new AssertionError("less than 2 elements in the array");
        }

        int[] tmp = seq.clone();
        Arrays.sort(tmp);
        if (!(tmp[0] == tmp[1] && (tmp.length == 2 || tmp[1] < tmp[2]))) {
            throw new AssertionError("there are not exactly two minimums in the array");
        }

        int expected_result = TestDataExactlyTwoDifferentMinimums.get_expected_result();
        int result = minimum_index(seq);
        if (result != expected_result) {
            throw new AssertionError("result is different than the expected result");
        }
    }

    public static void main(String[] args) {
      //  TestWithEmptyArray();
      //  TestWithUniqueValues();
        TestWithExactlyTwoDifferentMinimums();
        System.out.println("OK");
    }
}
