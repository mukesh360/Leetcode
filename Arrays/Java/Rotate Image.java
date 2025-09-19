// brute force
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] ans = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                ans[j][n- 1 - i] = matrix[i][j];
            }
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                 matrix[i][j] = ans[i][j];
            }
        }
    
    }
}
// optimized
class Solution {
    private void reverseRow(int[] row) {
        int left = 0, right = row.length - 1;
        while (left < right) {
            int temp = row[left];
            row[left] = row[right];
            row[right] = temp;
            left++;
            right--;
        }
    }
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        

        for(int i = 0; i < n ; i++){
            for(int j = i; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            reverseRow(matrix[i]);
        }
    
    }
}
///Here, n = 3 (3 rows).

// Dry Run of the Loop

// Iteration 1: (i = 0)

// matrix[0] = [1, 4, 7]

// Call reverseRow([1, 4, 7])

// After reversal → [7, 4, 1]

// Matrix becomes: