class Solution {
	static ArrayList<Integer> snakePattern(int matrix[][]) {
		// code here
		int row = matrix.length;
		int col = matrix[0].length;
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for (int i = 0; i<row; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j <col; j++) {
					al.add(matrix[i][j]);
				}
			}
			else {
				for (int j = col-1; j >=0; j--) {
					al.add(matrix[i][j]);
				}
			}
		}
		return al;
	}
}
