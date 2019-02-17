fun isBadVersion(version: Int) = true

fun firstBadVersion(n: Int): Int {
    var high = n
    var low = 1
    var version: Int

    while (low <= high) {
        version = low + (high - low) / 2

        if (isBadVersion(version))
            high = version - 1
        else
            low = version + 1
    }

    return low
}
