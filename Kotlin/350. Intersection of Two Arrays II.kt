fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    val tmp = mutableListOf<Int>()

    val map = mutableMapOf<Int, Int>()

    repeat(nums1.size) {
        // 取nums元素为key，该元素出现次数为value，构造map
        map[nums1[it]] = (map[nums1[it]] ?: 0) + 1
    }

    repeat(nums2.size) {
        if (map.containsKey(nums2[it]) && map[nums2[it]]!! > 0) {
            tmp.add(nums2[it])
            map[nums2[it]] = map[nums2[it]]!! - 1
        }
    }

    val result = IntArray(tmp.size)
    repeat(tmp.size) {
        result[it] = tmp[it]
    }

    return result
}
