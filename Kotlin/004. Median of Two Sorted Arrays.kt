fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    val list = IntArray(nums1.size + nums2.size)
    var left = 0
    var right = 0
    for (current in 0 until list.size) {
        when {
            // 当取完一个数组后，直接将另一个数组中的数填充到 list 后面
            left == nums1.size -> {
                list[current] = nums2[right]
                right++
            }
            right == nums2.size -> {
                list[current] = nums1[left]
                left++
            }

            // 取两个数组中的数，从小到大填充到 list 中
            nums1[left] < nums2[right] -> {
                list[current] = nums1[left]
                left++
            }
            nums1[left] >= nums2[right] -> {
                list[current] = nums2[right]
                right++
            }
        }
    }

    // 偶数个数，取中间两个数除以2；奇数个数，直接取中间的数
    val midIndex = list.size / 2
    return if (list.size % 2 == 0) {
        (list[midIndex].toDouble() + list[midIndex - 1]) / 2
    } else {
        list[midIndex].toDouble()
    }
}
