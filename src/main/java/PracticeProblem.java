import java.util.HashSet;
import java.util.Set;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int[] recaman(int n) {
        //sp
        if (n <= 0) {
            return new int[0];
        }
        //seen number set and result set
        int[] result = new int[n];
        Set<Integer> seen = new HashSet<>();
        generateRecaman(1, 0, result, seen);

        return result;
    }

    public static void generateRecaman(int current, int prev, int[] result, Set<Integer> seen) {
        // sp: completed
        if (current > result.length) {
            return;
        }
        // test value
        int testValue = prev - current;
        // meet requirement case1
        if (testValue > 0 && !seen.contains(testValue)) {
            result[current - 1] = testValue;
            seen.add(testValue);
        } else {
            // case2
            testValue = prev + current;
            result[current - 1] = testValue;
            seen.add(testValue);
        }
        generateRecaman(current + 1, testValue, result, seen);
    }

}
