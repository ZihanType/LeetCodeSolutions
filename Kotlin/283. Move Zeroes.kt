fun moveZeroes(nums: IntArray): Unit {
    var index = 0
    var temp: Int

    repeat(nums.size) {
        if (nums[it] != 0) {
            temp = nums[index]
            nums[index] = nums[it]
            nums[it] = temp
            index++
        }
    }
}
