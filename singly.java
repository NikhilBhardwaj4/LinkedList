package LinkedList;


public class singly {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(8);
        list.insertFirst(12);
        list.insertFirst(19);
        list.insertlLast(99);
        list.insert(69,3);

        list.display();
        //list.deleteFrist();
        //list.deleteLast();
        list.delete(2);
        list.display();
    }
    public static class  LL{

        private Node head;
        private Node tail;
        private int size;

        public LL(){
            this.size=0;
        }

        public void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+"->");
                temp=temp.next;
            }
            System.out.println("END");
        }
        public void insertlLast(int val){
            if(tail==null){
                insertFirst(val);
                return;
            }
            Node node = new Node(val);
            tail.next=node;
            node = tail;
            size++;
        }

        public void insertFirst(int val){
            Node node = new Node(val);
            node.next = head;
            head = node;

            if(tail==null){
                tail=head;
            }
            size++;
        }
        public void insert(int val,int index){
            if(index==0){
                insertFirst(val);
                return;
            }
            if(index==size){
                insertlLast(val);
                return;
            }
            Node temp=head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            Node node = new Node(val,temp.next);
            temp.next=node;

            size++;
        }
        public void deleteFrist(){
            head=head.next;
            if(head==null){
                head=tail;
                size--;
            }
        }
        public void  deleteLast(){
            Node secondlast = get(size-2);
            tail=secondlast;
            tail.next = null;

        }
        public Node get(int index){
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        }

        public void delete(int index){
            Node prev = get(index-1);
            prev.next = prev.next.next;
        }


        private static class Node{
            int val;
            Node next;

            public Node(int val){
                this.val=val;
            }
            public Node(int val,Node next){
                this.val = val;
                this.next = next;
            }
        }
    }
}
