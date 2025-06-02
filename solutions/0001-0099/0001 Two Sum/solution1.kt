class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in nums.indices) {
            for (j in i+1 until nums.size) {
                val total = nums[i] + nums[j]
                if (total == target) {
                    return intArrayOf(i, j)
                }
            }
        }

        return intArrayOf()
    }
}
