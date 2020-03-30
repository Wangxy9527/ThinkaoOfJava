链表篇：

1.从尾到头打印链表
	`public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(listNode!=null){
            list.add(0,listNode.val);
            listNode = listNode.next;
        }
        return list;
    }`

2.输入一个链表，反转链表后，输出新链表的表头
	`public ListNode ReverseList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode pre = null;
        ListNode next = null;
        while(head!=null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }`

3.输入一个链表，输出该链表中倒数第k个结点
	`public ListNode FindKthToTail(ListNode head,int k) {
       if(head==null){
           return null;
       }
        ListNode p1 = head;
        ListNode p2 = head;
        int i= 0;
        for(;p1!=null;i++){
            if(i>=k){
                p2 = p2.next;
            }
            p1 = p1.next;
        }
        return k > i ? null : p2; 
    }`
    
4.输入两个单调递增的链表，输出两个链表合成后的链表，合成后的链表满足单调不减规则
	`public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        if(list1.val>list2.val){
            list2.next = Merge(list1,list2.next);
            return list2;
        }else{
            list1.next = Merge(list1.next,list2);
            return list1;
        }
    }`
	
5.输入两个链表，找出它们的第一个公共结点
	`ListNode* FindFirstCommonNode( ListNode* pHead1, ListNode* pHead2) {
        ListNode *p1 = pHead1;
        ListNode *p2 = pHead2;
        while(p1!=p2){
            p1 = (p1==NULL?pHead2 : p1->next);
            p2 = (p2==NULL?pHead1 : p2->next);
        }
        return p1;
    }`
	
6.给一个链表，若其中包含环，请找出该链表的环的入口结点
	`public ListNode EntryNodeOfLoop(ListNode pHead){
        if(pHead==null||pHead.next==null){
            return null;
        }
        ListNode p = pHead;
        ListNode q = pHead;
        while(pHead.next != null){
            p = p.next.next;
            q = q.next;
            if(p==q){
                 p = pHead;
                while(p!=q){
                   p = p.next;
                   q = q.next;
                }
                if(p==q){
                    return p;
                }
            }
        }
        return null;
    }`
    
7.删除链表中重复的结点
	`public ListNode deleteDuplication(ListNode pHead){
        if(pHead==null||pHead.next==null){
            return pHead;
        }
        if(pHead.val == pHead.next.val){
            ListNode pNode = pHead.next;
            while(pNode!=null&&pNode.val==pHead.val){
                pNode = pNode.next;
            }
            return deleteDuplication(pNode);
        }else{
            pHead.next = deleteDuplication(pHead.next);
            return pHead;
        }
    }`
