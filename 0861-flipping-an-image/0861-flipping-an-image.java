class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] row : image) {
            // reverse this array
            for (int i = 0; i < (image[0].length + 1) / 2; i++) {
                // swap
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length - i - 1] ^ 1;
                row[image[0].length - i - 1] = temp;
            }
        }
        return image;
    }

    public void reverse(int[] arr, int start, int end){
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public void swap(int[] arr, int id1, int id2){
        int temp = arr[id1];
        arr[id1] = arr[id2];
        arr[id2] = temp;
    }
    
}