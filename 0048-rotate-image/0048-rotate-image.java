class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reverse(matrix);
    }

    void transpose(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    void reverse(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            int left = 0;
            int right = arr.length - 1;
            while (left < right) {
                int temp = arr[row][left];
                arr[row][left] = arr[row][right];
                arr[row][right] = temp;
                left++;
                right--;
            }
        }
    }
}