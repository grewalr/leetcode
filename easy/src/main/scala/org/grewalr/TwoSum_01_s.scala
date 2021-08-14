package org.grewalr

import scala.util.Success

/*

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Constraints:

  2 <= nums.length <= 104
  -109 <= nums[i] <= 109
  -109 <= target <= 109
  Only one valid answer exists.


*/
object TwoSum_01_s extends App {

  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val indexMap: Map[Int, Int] = nums.zipWithIndex.map{
      case (value, index) => value -> index
    }.toMap

    val returnResult: Array[Int] = nums.zipWithIndex.flatMap {
      case (num, value) =>
        val lookupNum = target - num
        val operand: Option[Int] = indexMap.get(lookupNum)

        Array(1, 2)

    }

    returnResult

  }

  val nums1 = Array(2, 7, 11, 15)
  val target1 = 9
  val output1 = Array(0, 1)

  val nums2 = Array(3, 2, 4)
  val target2 = 6
  val output2 = Array(1, 2)

  val nums3 = Array(3, 3)
  val target3 = 6
  val output3 = Array(0, 1)

  twoSum(nums1, target1).mkString(",")
//  twoSum(nums2, target2)
//  twoSum(nums3, target3)
}
