fun hasCycle(head: ListNode?): Boolean {
    var slow = head
    var fast = head

    // 一个快，一个慢，如果相遇，说明有环；否则，快的指针为空，说明无环
    while (fast != null && fast.next != null) {
        slow = slow?.next
        fast = fast.next?.next

        if (slow == fast)
            return true
    }

    return false
}
