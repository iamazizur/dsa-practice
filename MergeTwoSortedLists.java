
//  https://www.geeksforgeeks.org/batch/must-do-1/track/md-linkedlist/problem/merge-two-sorted-linked-lists

//  Given two sorted linked lists consisting of N and M nodes respectively. The task is to merge both of the list (in-place) and return head of the merged list.


class LinkedList
{
    
    Node sortedMerge(Node h1, Node h2) {
    
        if(h1 == null) return h2;
        if(h2 == null) return h1;
        
        Node result = null;
        if(h1.data <= h2.data){
            result = h1;
            h1 = h1.next;
        }
        else{
            result = h2;
            h2 = h2.next;
        }
        Node curr = result;
        
        while(h1 != null && h2 != null){
            
            if(h1.data <= h2.data){
                curr.next = h1;
                h1 = h1.next;
            }
            else{
                curr.next = h2;
                h2 = h2.next;
            }
            
            curr = curr.next;
            
        }
        if(h1 == null)
            curr.next = h2;
        
        if(h2 == null)
            curr.next = h1;
            
        return result;
    
   } 
}
