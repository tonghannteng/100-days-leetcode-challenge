package leetcode

/**
 * @author: tonghann.teng
 * @since: 8/14/23 (Day 3)
 * @link: https://leetcode.com/problems/build-array-from-permutation/description/
 */
fun buildArray(nums: IntArray): IntArray {
    val result = IntArray(nums.size)
    for (i in nums.indices) {
        result[i] = nums[nums[i]]
    }
    return result
}
