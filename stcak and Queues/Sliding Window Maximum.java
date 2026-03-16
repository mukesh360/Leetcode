
//brute force



class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int n = arr.length;
        int[] ans = new int[n - k + 1];

        for(int i = 0; i <= n - k; i++){
            int max = arr[i];
            for(int j = i; j < i + k; j++){
                max = Math.max(max , arr[j]);
            }
            ans[i] = max;
        }
        return ans;
    }
}


class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int n = arr.length;
        int[] ans = new int[n - k + 1];
        Deque<Integer> dq = new ArrayDeque<>(); // stores indices

        for (int i = 0; i < n; i++) {

            // Remove elements outside the window
            if (!dq.isEmpty() && dq.peekFirst() < i - k + 1) {
                dq.pollFirst();
            }

            // Remove smaller elements from the back
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
                dq.pollLast();
            }

            dq.offerLast(i);

            // Start recording answers once first window is complete
            if (i >= k - 1) {
                ans[i - k + 1] = arr[dq.peekFirst()];
            }
        }
        return ans;
    }
}
```

// ---

// ## How it works

// The deque stores **indices** and is maintained in a way where `arr[dq.front()]` is always the **maximum of the current window**.

// ---

// ### The 3 key steps per iteration:

// **Step 1 — Evict expired index from front**
// ```
// if dq.front() < i - k + 1  →  remove it
// ```
// The front index has slid out of the window, so it's no longer valid.

// ---

// **Step 2 — Maintain decreasing order from back**
// ```
// while arr[dq.back()] < arr[i]  →  remove from back
// ```
// Any element smaller than the incoming `arr[i]` can **never be a future maximum** (since `arr[i]` is both larger and more recent), so they're useless — discard them.

// ---

// **Step 3 — Record answer**
// ```
// once i >= k-1  →  ans[i - k + 1] = arr[dq.front()]