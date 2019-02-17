fun singleNumber1(nums: IntArray): Int {
    nums.sort()
    (1 until nums.size step 2).forEach {
        if (nums[it] != nums[it - 1])
            return nums[it - 1]
    }
    return nums.last()
}

fun singleNumber2(nums: IntArray): Int {
    var result = 0
    repeat(nums.size) {
        result = nums[it] xor result
    }
    return result
}
