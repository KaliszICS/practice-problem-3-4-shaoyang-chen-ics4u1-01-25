public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int[] recaman(int n){
		if (n == 0) return new int[0];
		if (n == 1) return new int[]{1};
		int[] arr = new int[n];
		arr[0] = 0;
		Set<Integer> seen = new HashSet<>();
		generateRecaman(1, n, arr, seen, 0);
		return arr;
	}
	public static void generateRecaman(int start, int n, int[] result, Set<Integer> seen, int pos) {
		if (start > n) {
			return;
		}
		int candidate = pos - start;

		// if candidate meet requirements
		if (candidate > 0 && !seen.contains(candidate)) {
			result[start - 1] = candidate;
			seen.add(candidate);
		} else {
			// else case
			candidate = pos + start;
			result[start - 1] = candidate;
			seen.add(candidate);
		}
		generateRecaman(n + 1, n, result, seen, candidate);
	}

}
