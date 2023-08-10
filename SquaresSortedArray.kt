package leetcode

/**
 * @author: tonghann.teng
 * @since: 8/10/23 (Day 1)
 * @link: https://leetcode.com/problems/squares-of-a-sorted-array/description/
 */
fun sortedSquares(nums: IntArray): IntArray {
    val result = IntArray(nums.size)
    var left = 0
    var right = nums.size - 1
    for (i in nums.size - 1 downTo 0) {
        val r = nums[right] * nums[right]
        val l = nums[left] * nums[left]
        if (r > l) {
            result[i] = r
            right--
        } else {
            result[i] = l
            left++
        }
    }
    return result
}
