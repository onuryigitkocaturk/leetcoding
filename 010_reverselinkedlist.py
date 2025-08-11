class Solution:
    # time complexity:o(n), space complexity:o(1)
    # Definition for singly-linked list.
    # class ListNode:
    #     def __init__(self, val=0, next=None):
    #         self.val = val
    #         self.next = next
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        reversed_ll = None

        while head:
            temp = head.next
            head.next = reversed_ll
            reversed_ll = head
            head = temp
        return reversed_ll
