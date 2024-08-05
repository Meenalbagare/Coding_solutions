class Solution {
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int mod = 1000000007;

        int totalSum = 0;
        int maxDiff = 0;
        for (int i = 0; i < n; i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            totalSum = (totalSum + diff) % mod;
        }

        int[][] sortedNums1 = new int[n][2];
        for (int i = 0; i < n; i++) {
            sortedNums1[i][0] = nums1[i];
            sortedNums1[i][1] = i;
        }
        Arrays.sort(sortedNums1, Comparator.comparingInt(o -> o[0]));

        int maxImprovement = 0;
        for (int i = 0; i < n; i++) {
            int originalDiff = Math.abs(nums1[i] - nums2[i]);

            int idx = binarySearch(sortedNums1, nums2[i]);

            if (idx < n) {
                int newDiff = Math.abs(sortedNums1[idx][0] - nums2[i]);
                maxImprovement = Math.max(maxImprovement, originalDiff - newDiff);
            }
            if (idx > 0) {
                int newDiff = Math.abs(sortedNums1[idx - 1][0] - nums2[i]);
                maxImprovement = Math.max(maxImprovement, originalDiff - newDiff);
            }
        }


        return (totalSum - maxImprovement + mod) % mod;
    }

    private int binarySearch(int[][] sortedArr, int target) {
        int low = 0, high = sortedArr.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (sortedArr[mid][0] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}