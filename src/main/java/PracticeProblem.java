public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static Set<Integer> seen;
    public static int[] result;
    public static int[] recaman(int n){
        if (n == 0) return new int[0];
        if (n == 1) return new int[]{1};
        int[] result = new int[n];
        result[0] = 0;
        Set<Integer> seen = new HashSet<>();
        generateRecaman(1, 0);
        return result;
    }
    public static void generateRecaman(int start, int prev) {
        if (start > result.length) {
            return;
        }
        int testValue = prev - start;

        // if testValue meet requirements
        if (testValue > 0 && !seen.contains(testValue)) {
            result[start - 1] = testValue;
            seen.add(testValue);
        } else {
            // else case
            testValue = prev + start;
            result[start - 1] = testValue;
            seen.add(testValue);
        }
        generateRecaman(start +1, testValue);
    }

}
