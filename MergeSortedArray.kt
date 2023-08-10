package leetcode

import java.util.PriorityQueue

/**
 * @author: tonghann.teng
 * @since: 8/10/23 (Day 1)
 * @link: https://leetcode.com/problems/merge-sorted-array/description/
 */
fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    val queue = PriorityQueue<Int>()
    for (i in 0 until m) {
        queue.add(nums1[i])
    }
    for (i in 0 until n) {
        queue.add(nums2[i])
    }
    var i = 0
    while (queue.isNotEmpty()) {
        nums1[i] = queue.remove()
        i++
    }
}
