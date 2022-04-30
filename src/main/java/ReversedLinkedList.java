import lombok.AllArgsConstructor;
import org.apache.commons.lang3.ObjectUtils;

public class ReversedLinkedList {

    @AllArgsConstructor
    public static class Node{
        Integer value;
        Node next;

        Node(Integer d){
            value = d;
            next=null;
        }
    }

    private Node reverse(Node node){
        Node previous = null;
        Node current = node;
        Node next;

        while(ObjectUtils.isNotEmpty(current)){
            next = current.next;
            current.next = previous;
            previous = current;
            current= next;
        }
        node= previous;
        return node;
    }

    public static void main(String[] args) {
        ReversedLinkedList list = new ReversedLinkedList();
        Node head = new Node(86);
        head.next = new Node(12);
        head.next.next= new Node(5);
        System.out.println(list.reverse(head).next.value);
    }
}
