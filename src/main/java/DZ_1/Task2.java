package DZ_1;

class Solution {
    public int removeElement(int[] nums, int val) {
        int currentIndex = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[currentIndex++] = nums[i];
                count++;
            }
        }
        while (currentIndex < nums.length) {
            nums[currentIndex++] = -1;
        }
        return count;
    }
}