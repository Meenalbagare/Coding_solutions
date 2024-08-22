// public class Solution {

//     // Helper function to heapify a subtree rooted with node i
//     public void heapify(int[] nums, int n, int i) {
//         int largest = i; // Initialize largest as root
//         int l = 2 * i + 1; // left child
//         int r = 2 * i + 2; // right child

//         // If left child is larger than root
//         if (l < n && nums[l] > nums[largest]) {
//             largest = l;
//         }

//         // If right child is larger than largest so far
//         if (r < n && nums[r] > nums[largest]) {
//             largest = r;
//         }

//         // If largest is not root
//         if (largest != i) {
//             int temp = nums[i];
//             nums[i] = nums[largest];
//             nums[largest] = temp;

//             // Recursively heapify the affected subtree
//             heapify(nums, n, largest);
//         }
//     }

//     // Function to find the kth largest element
//     public int findKthLargest(int[] nums, int k) {
//         int n = nums.length;

//         // Build a max-heap from the entire array
//         for (int i = n / 2 - 1; i >= 0; i--) {
//             heapify(nums, n, i);
//         }

//         // Extract the maximum element k-1 times
//         for (int i = n - 1; i >= n - k + 1; i--) {
//             // Move current root to end
//             int temp = nums[0];
//             nums[0] = nums[i];
//             nums[i] = temp;

//             // Call heapify on the reduced heap
//             heapify(nums, i, 0);
//         }

//         // The root of the heap now contains the kth largest element
//          int N = nums.length;

//         for (int i = 0; i < N; ++i) {
//             System.out.print(nums[i] + " ");
//         }
//         System.out.println();
//         return nums[0];
//     }
// }
public class Solution {

    // Helper function to heapify a subtree rooted with node i
    public void heapify(int[] nums, int n, int i) {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left child
        int r = 2 * i + 2; // right child

        // If left child is larger than root
        if (l < n && nums[l] > nums[largest]) {
            largest = l;
        }

        // If right child is larger than largest so far
        if (r < n && nums[r] > nums[largest]) {
            largest = r;
        }

        // If largest is not root
        if (largest != i) {
            int temp = nums[i];
            nums[i] = nums[largest];
            nums[largest] = temp;

            // Recursively heapify the affected subtree
            heapify(nums, n, largest);
        }
    }

    // Function to find the kth largest element
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;

        // Build a max-heap from the entire array
        for (int i = n / 2 ; i >= 0; i--) {
            heapify(nums, n, i);
        }

        // Extract the maximum element k-1 times
        for (int i = n - 1; i >= n - k + 1; i--) {
            // Move current root to end
            int temp = nums[0];
            nums[0] = nums[i];
            nums[i] = temp;

            // Call heapify on the reduced heap
            heapify(nums, i, 0);
        }

        // The root of the heap now contains the kth largest element
        return nums[0];
    }}