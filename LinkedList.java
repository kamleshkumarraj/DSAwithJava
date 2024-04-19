public class LinkedList {
    Node head = null;
    Node tail = null;
    int count =0 ;

    public void addLast(int data) {
        Node temp = new Node(data);
        count++;
        if(head == null && tail == null) this.head = temp;
        else this.tail.next = temp;
        this.tail = temp;
    }

    public void printList() {
        Node temp = this.head;
        System.out.print("[ ");
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("]");
    }
    
}

class Main{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(23);
        list.addLast(24);
        list.addLast(25);
        list.addLast(26);
        list.addLast(27);
        System.out.println("Our list is :");
        list.printList();
    }
}