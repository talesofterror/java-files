public class list {

    Node head;
    static list ll = new list();
    
    public void append (int data){
        Node current = head;

        while (current.next != null){
            current = current.next; 
        }

        current.next = new Node(data);
    }

    public static void main(String[] args){
        ll.append(5);
    }

}