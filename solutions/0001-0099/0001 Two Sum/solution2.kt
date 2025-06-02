class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        // key is an element from nums, value is that element's index
        val numMap: MutableMap<Int, Int> = mutableMapOf()

        for ((i, v) in nums.withIndex()) {
            val pair = target - v
            val pairIndex = numMap.get(pair)

            val pairExists = pairIndex != null
            if (pairExists) {
                return intArrayOf(pairIndex, i)
            }

            numMap[v] = i
        }

        return intArrayOf()
    }
}
