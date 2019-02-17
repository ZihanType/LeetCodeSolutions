fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
    var m1 = m - 1
    var n2 = n - 1
    var l = m + n - 1

    while (m1 >= 0 && n2 >= 0)
        if (nums1[m1] > nums2[n2])
            nums1[l--] = nums1[m1--]
        else
            nums1[l--] = nums2[n2--]

    while (m1 >= 0)
        nums1[l--] = nums1[m1--]

    while (n2 >= 0)
        nums1[l--] = nums2[n2--]
}
