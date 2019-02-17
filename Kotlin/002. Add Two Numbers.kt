fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    if (l1 == null) return l2
    if (l2 == null) return l1

    val l3: ListNode

    if (l1.`val` + l2.`val` < 10) {
        l3 = ListNode(l1.`val` + l2.`val`)
        l3.next = addTwoNumbers(l1.next, l2.next)
    } else {
        l3 = ListNode((l1.`val` + l2.`val`) % 10)
        val tmp = ListNode(1)
        tmp.next = null
        l3.next = addTwoNumbers(l1.next, addTwoNumbers(l2.next, tmp))
    }

    return l3
}
