fun isPalindrome(head: ListNode?): Boolean {
    var head = head
    if (head?.next == null)
        return true

    var slow = head
    var fast = head.next

    while (fast?.next != null) {
        fast = fast.next?.next
        slow = slow?.next
    }

    // -----start reverse the second half linked list
    var before = slow
    var after = slow?.next
    var tmp: ListNode?

    before?.next = null

    while (after != null) {
        // reverse linked list
        tmp = after.next
        after.next = before

        // move pointer
        before = after
        after = tmp
    }
    // -----end reverse

    while (before != null && head != null) {
        if (before.`val` != head.`val`)
            return false
        before = before.next
        head = head.next
    }

    return true
}
