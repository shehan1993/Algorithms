public class LinkListStack {

    /**
     * Implented stack using Link list - Stack is FILO (== LIFO)
     *Ref:   https://www.geeksforgeeks.org
     * **/


    private int size = 0;
    private Node head;

    private class Node{
        int value;
        Node next;
    }

    public LinkListStack(){
        head = null;
    }

    /**
     * get the last input from satck and delete it
     * **/
    public int pop() throws LinkedListEmptyException{
        if(head == null){
            throw new LinkedListEmptyException();
        }else{
            --size;

            int rValue = head.value;
            head = head.next;
            return rValue;
        }

    }

    /**
     * add new value to satck
     **/

    public void push(int value){
        Node oldHead = head;
        head = new Node();
        head.value = value;
        head.next = oldHead;
        size++;
    }

    public void printStack(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();

    }

//    public int size(){
//        Node temp = head;
//        int size = 0;
//        while(temp != null){
//            size++;
//            temp = temp.next;
//        }
//        return size;
//    }
    public int getSize(){
        return size;
    }

    public static void main(String args []){
        LinkListStack lls = new LinkListStack();
       // lls.pop();
        lls.push(20);
        lls.push(50);
        lls.push(80);
        lls.push(70);
        lls.push(30);
        lls.printStack();
        System.out.println(lls.getSize());
        System.out.println("Element removed from LinkedList: "+lls.pop());
        lls.printStack();
        System.out.println(lls.getSize());
        System.out.println("Element removed from LinkedList: "+lls.pop());
        lls.printStack();
        System.out.println(lls.getSize());

    }
}

class LinkedListEmptyException extends RuntimeException{

    public LinkedListEmptyException(){
        super();
    }
    public LinkedListEmptyException(String message){
        super(message);
    }

}
