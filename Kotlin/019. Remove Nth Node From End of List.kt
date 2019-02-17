fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    var slow = head
    var fast = head

    repeat(n) {
        fast = fast?.next

        // 当倒数第n个就是正数第1个的时候，fast会等于null，此时跳过第1个，即返回head.next
        if (fast == null) {
            return head?.next
        }
    }

    while (fast?.next != null) {
        slow = slow?.next!!
        fast = fast?.next
    }

    slow?.next = slow?.next?.next

    return head
}
