package c4q.lighterletter;

// singly list
public class SinglyNode {
    SinglyNode next;
    String data;
    public SinglyNode(String data) { this.data = data; }
}

class SinglyList {
    SinglyNode head;

    public void addToHead(String data) {
        SinglyNode newNode = new SinglyNode(data);
        newNode.next = head;
        head = newNode;
    }
    public void addToTail(String data) {
        SinglyNode newNode = new SinglyNode(data);
        SinglyNode walker = head;
        while (walker.next != null){
            walker = walker.next;
        }
        walker.next = newNode;
        newNode.next = head;
        //newNode.next = null;
    }
    public void insertAfter(String prevData, String newData) {
        SinglyNode current = head;

        // traverse through list
        while(current != null && !current.data.equals(prevData)) {
            current = current.next;
        }

        if(current != null) {
            // then we know current is pointing to the node after
            // which we add 'newData'
            SinglyNode newNode = new SinglyNode(newData);
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void update(String oldData, String newData) {
        SinglyNode current = head;
        while (current != null && !current.data.equals(oldData)) {
            current = current.next;
        }
        if (current != null) {
            current.data = newData;
        }
    }

    public void delete(String data) {
        if(head == null) {
            return;
        }
        if(head.data.equals(data)) {
            head = head.next;
        }
        SinglyNode prevNode = head;
        while (prevNode.next != null && !prevNode.next.data.equals(data)) {
            prevNode = prevNode.next;
        }
        if(prevNode.next != null) {
            prevNode.next = prevNode.next.next;
        }
    }

    public void print() {
        SinglyNode current = head;
        while(current != null){
            System.out.print(current.data + ",");
            current = current.next;
        }
        System.out.println();
    }
}



class SinglyMain {
    public static void main(String[] args) {
        SinglyList list = new SinglyList();
        list.print();
        list.addToHead("I");
        list.print();
        list.insertAfter("I","am");
        list.print();
        list.addToTail("a");
        list.print();
        list.addToTail("linked");
        list.print();
        list.addToTail("list");
        list.print();

    }
}