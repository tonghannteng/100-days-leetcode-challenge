package leetcode

/**
 * @author: tonghann.teng
 * @since: 8/9/23 (Day 1)
 * @link: https://leetcode.com/problems/two-sum/
 */
fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = mutableMapOf<Int, Int>()
    val result = IntArray(2)
    for (i in nums.indices) {
        map.put(nums[i], i)
    }
    for (i in nums.indices) {
        val sum = target - nums[i]
        if (map.containsKey(sum) && map.getValue(sum) != i) {
            val index = map.getOrDefault(sum, 0)
            result[0] = i
            result[1] = index
        }
    }
    return result
}
