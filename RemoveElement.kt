package leetcode

/**
 * @author: tonghann.teng
 * @since: 8/14/23 (Day 3)
 * @link: https://leetcode.com/problems/remove-element/description/
 */
fun removeElement(nums: IntArray, `val`: Int): Int {
    var count = 0
    for (i in nums.indices) {
        if (nums[i] != `val`) {
            nums[count] = nums[i]
            count++
        }
    }
    return count
}
