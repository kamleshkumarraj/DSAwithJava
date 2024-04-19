public class LinkedList {
    Node head = null;
    Node tail = null;
    int count =0 ;

    /*This method is used for add a node in last of the list. */
    public void addLast(int data) {
        Node temp = new Node(data);
        this.count++;
        if(head == null && tail == null) this.head = temp;
        else this.tail.next = temp;
        this.tail = temp;
    }

    /*This method is used for add a node in first of the list. */
    public void addFirst(int data){
        Node temp  = new Node(data);
        this.count++;
        if(this.head == null && this.tail == null) this.tail = temp;
        else temp.next = this.head;
        this.head = temp;
    }

    /*This method is used for printing the list on console. */
    public void printList() {
        Node temp = this.head;
        System.out.print("[ ");
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("]");
    }
    
    /*This method is used for find the size of the list. */
    public int size(){
        return this.count;
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

        list.addFirst(50);
        list.addFirst(51);
        list.addFirst(52);
        System.out.println("After add node in first then our list is : ");
        list.printList();
    }
}