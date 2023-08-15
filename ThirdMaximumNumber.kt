package leetcode

import java.util.PriorityQueue

/**
 * @author: tonghann.teng
 * @since: 8/14/23 (Day 3)
 * @link: https://leetcode.com/problems/third-maximum-number/description/
 */
fun thirdMax(nums: IntArray): Int {
    val set = HashSet<Int>()
    val priorityQueue = PriorityQueue<Int>()
    for (num in nums) {
        set.add(num)
    }
    for (num in set) {
        if (priorityQueue.size == 4) {
            priorityQueue.poll()
        }
        priorityQueue.add(num)
    }
    return if (priorityQueue.size == 3) {
        priorityQueue.peek()
    } else if (priorityQueue.size > 3) {
        priorityQueue.remove()
        priorityQueue.peek()
    } else {
        priorityQueue.last()
    }
}
