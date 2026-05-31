class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int arr[] = new int[row * col];
        int index = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[index] = matrix[i][j];
                index++;
            }
        }

        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return false;
    }
}
