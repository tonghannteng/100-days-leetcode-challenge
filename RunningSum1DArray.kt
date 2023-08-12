package leetcode

/**
 * @author: tonghann.teng
 * @since: 8/12/23 (Day 3)
 * @link: https://leetcode.com/problems/running-sum-of-1d-array/description/
 */
fun runningSum(nums: IntArray): IntArray {
    for (i in 1 until nums.size) {
        nums[i] = nums[i - 1] + nums[i]
    }
    return nums
}
