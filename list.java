import java.util.Scanner;

public class list {

    static Scanner scanner = new Scanner(System.in);

    static class Node {
        Node next;
        // static list ll = new list();
        static Scanner scanner = new Scanner(System.in);
    
        String data;
    
        public Node (String data){
            this.data = data;
            next = null;
        }
    
    
    
    }

    Node head;

    public static void main(String[] args){

        list ll = new list();

        System.out.println("Type 'append' to append data to the list.");
        System.out.println("Type 'readCurrent' to recall node data");

        var input = scanner.next();
        
        if (input == "append"){
            System.out.println("Enter data to append.");
            var appendValue = scanner.next();
            ll.append(appendValue);
            System.out.println(appendValue + "added to the linked list.");
            return;
        }

        if (input == "readCurrent") {
            System.out.println("Current node is " + ll.head.data);
            return;
        }

    }

    ////// METHODS //////

    public void append (String data){

        if (head==null){
            head = new Node(data);
            return;
        }
        
        Node current = head;

        while (current.next != null){
            current = current.next; 
        }

        current.next = new Node(data);
    }

    public void prepend(String data) {

        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public void deleteWithValue(String data) {

        if (head == null) return;
        if (head.data == data){
            head = head.next;
            return;
        }

        Node current = head;
        while(current.next != null) {
            if(current.next.data == data){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void readCurrent(String data){
        
    }

}