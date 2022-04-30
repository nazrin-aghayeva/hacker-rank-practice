import lombok.AllArgsConstructor;
import org.apache.commons.lang3.ObjectUtils;

public class ReversedLinkedList {
    static Node head;

    @AllArgsConstructor
    static class Node{
        Integer data;
        Node next;

        Node(Integer d){
            data= d;
            next=null;
        }
    }

    Node reverse(Node node){
        Node prev = null;
        Node current = node;
        Node next;

        while(ObjectUtils.isNotEmpty(current)){
            next = current.next;
            current.next = prev;
            prev = current;
            current= next;
        }
        node= prev;
        return node;
    }

    public static void main(String[] args) {
        ReversedLinkedList list = new ReversedLinkedList();
        head = new Node(86);
        head.next = new Node(12);
        head.next.next= new Node(5);
        list.reverse(head);
    }
}
