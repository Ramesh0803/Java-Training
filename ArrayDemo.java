public class ArrayDemo {
	public static void main(String[] args) {
	      int[][] matrix = {
	              {1,2,3},
	              {4,5,6}
	          };
        for (int[] ints : matrix) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
	}
}

