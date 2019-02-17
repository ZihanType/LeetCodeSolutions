fun rotate1(nums: IntArray, k: Int): Unit {
//    val k = k % nums.size
    val result = intArrayOf(*nums)
//    val result = java.util.Arrays.copyOf(nums, nums.size)
    for (index in 0 until nums.size) {
        nums[(index + k) % nums.size] = result[index]
    }
}

fun rotate2(nums: IntArray, k: Int): Unit {
    if (nums.isEmpty() || k % nums.size == 0) return

    var temp1 = nums[0]
    var temp2: Int
    var index = 0
    var start = 0

    repeat(nums.size) {
        index = (index + k) % nums.size
        temp2 = nums[index]
        nums[index] = temp1
        temp1 = if (index == start) {
            index++
            start++
            nums[index]
        } else {
            temp2
        }
    }
}
