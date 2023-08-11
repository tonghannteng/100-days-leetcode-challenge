package leetcode

/**
 * @author: tonghann.teng
 * @since: 8/10/23 (Day 2)
 * @link: https://leetcode.com/problems/find-pivot-index/description/
 */
fun pivotIndex(nums: IntArray): Int {
    var sum = 0
    var sumRight = 0
    for (num in nums) {
        sum += num
    }
    for (i in nums.indices) {
        sum -= nums[i]
        if (sum == sumRight) {
            return i
        }
        sumRight += nums[i]
    }
    return -1
}
