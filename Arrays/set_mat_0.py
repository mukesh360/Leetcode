
# it only staisfy 200/202 test cases -- gpt
class Solution(object):
    def matrix_row(self, arr, i):
        for j in range(len(arr[0])):       # ✅ iterate over columns
            if arr[i][j] != 0:
                arr[i][j] = -1

    def matrix_col(self, arr, j):
        for i in range(len(arr)):          # ✅ iterate over rows
            if arr[i][j] != 0:
                arr[i][j] = -1

    def setZeroes(self, arr):
        rows, cols = len(arr), len(arr[0])

        # Step 1: mark cells with -1 (temporary flag)
        for i in range(rows):
            for j in range(cols):
                if arr[i][j] == 0:
                    self.matrix_row(arr, i)   # ✅ call with self and pass arr
                    self.matrix_col(arr, j)

        # Step 2: convert marked -1 into 0
        for i in range(rows):
            for j in range(cols):
                if arr[i][j] == -1:
                    arr[i][j] = 0
                    

    
