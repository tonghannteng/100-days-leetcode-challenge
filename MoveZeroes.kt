package leetcode

/**
 * @author: tonghann.teng
 * @since: 8/9/23 (Day 1)
 * @link: https://leetcode.com/problems/move-zeroes/
 */
fun moveZeroes(nums: IntArray): Unit {
    var index = 0
    for (num in nums) {
        if (num != 0) {
            nums[index] = num
            index++
        }
    }
    for (i in index until nums.size) {
        nums[i] = 0
    }
}
