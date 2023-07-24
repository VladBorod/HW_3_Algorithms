public class HomeWork3 {

    private Node head;
    private Node tail;

    public class Node{
        private Node next;
        private Node previous;
        private int value;
    }
//    1. Необходимо реализовать метод разворота связного списка двухсвязного.
    public void revert(){
        Node thisNode = head;
        while (thisNode != null){
            Node next = thisNode.next;
            Node previous = thisNode.previous;
            thisNode.next = previous;
            thisNode.previous = next;
            if (previous == null){
                tail = thisNode;
            }
            if (next == null){
                head = thisNode;
            }
            thisNode = next;
        }
    }

//    2. Доп Задача. Добавляем метод сортировки для связного списка.
    public void bubbleSort(){
        Node thisNode = head;
        int count = 0;
        while (thisNode != null){
            count ++;
        }
        boolean finish;
//        Node next = thisNode.next;
        do {
            finish = true;
            for (int i = 0; i < count; i++){
                if (thisNode.value > thisNode.next.value){
                    int tempNode = thisNode.value;
                    thisNode.value = thisNode.next.value;
                    thisNode.next.value = tempNode;
                    finish = false;
                }
            }
        } while (!finish);
    }
    public void addFirst(int value){
        Node node = new Node();
        node.value = value;
        if (head != null){
            node.next = head;
            head.previous = node;
        } else {
            tail = node;
        }
        head = node;
    }
    public void addLast(int value){
        Node node = new Node();
        node.value = value;
        if (tail != null){
            node.previous = tail;
            tail.next = node;
        } else {
            head = node;
        }
        tail = node;
    }
    public void removeFirst(){
        if (head != null && head.next != null){
//            head.next.previous = null;
//            head = head.next;
            head = head.next;
            head.previous = null;
        } else {
            head = null;
            tail = null;
        }
    }
    private void removeLast(){
        if (tail != null && tail.previous != null){
            tail = tail.previous;
            tail.next = null;
        } else {
            head = null;
            tail = null;
        }
    }
}
