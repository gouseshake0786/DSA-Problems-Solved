class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int N = matrix.length, M = matrix[0].length;
        List<Integer> rowMin = new ArrayList<Integer>();
        for(int row = 0; row<N;row++){
            int currentMin = Integer.MAX_VALUE;
            for(int column =0; column<M;column++){
                currentMin = Math.min(currentMin,matrix[row][column]);
            }
            rowMin.add(currentMin);
        }

        List<Integer> colMax = new ArrayList<Integer>();
        for(int row = 0; row<M;row++){
            int currentMax = Integer.MIN_VALUE;
            for(int column =0; column<N;column++){
                currentMax = Math.max(currentMax,matrix[column][row]);
            }
            colMax.add(currentMax);
        }

        List<Integer> luckyNumbers = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (matrix[i][j] == rowMin.get(i) && matrix[i][j] == colMax.get(j)) {
                    luckyNumbers.add(matrix[i][j]);
                }
            }
        }

        return luckyNumbers;
    }
}