class Solution:
    def rotateArr(self, arr, d):
        n = len(arr)
        d = d % n  # Ensure d is within array bounds

        # Step 1: Store first d elements
        replacers = []
        for i in range(d):
            replacers.append(arr[i])

        # Step 2: Shift the rest of the array to the left
        for i in range(n - d):
            arr[i] = arr[i + d]

        # Step 3: Place replacers at the end
        for i in range(d):
            arr[n - d + i] = replacers[i]
