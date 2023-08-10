package leetcode

/**
 * @author: tonghann.teng
 * @since: 8/10/23 (Day 2)
 * @link: https://leetcode.com/problems/intersection-of-two-arrays/description/
 */
fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
    val set = HashSet<Int>()
    val result = HashSet<Int>()

    for (num in nums1) {
        set.add(num)
    }
    for (num in nums2) {
        if (set.contains(num)) {
            result.add(num)
        }
    }
    return result.toIntArray()
}
