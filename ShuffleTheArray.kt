package leetcode

/**
 * @author: tonghann.teng
 * @since: 8/28/23 (Day 4)
 * @link: https://leetcode.com/problems/shuffle-the-array/description/
 */
fun shuffle(nums: IntArray, n: Int): IntArray {
    val result = IntArray(nums.size)
    var index = 0
    for (i in 0 until n) {
        result[index] = nums[i]
        index += 2
    }
    index = 1
    for (i in n until result.size) {
        result[index] = nums[i]
        index += 2
    }
    return result
}
