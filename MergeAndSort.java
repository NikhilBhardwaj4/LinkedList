package LinkedList;

public class MergeAndSort {
    public static class LL{
        Node head;
        Node tail;

        public void insertFirst(int val){
            Node node = new Node(val);
            node.next = head;
            head = node;

            if(tail==null) {
                tail = head;
            }
        }
        public void insertlLast(int val){
            if(tail==null){
                insertFirst(val);
                return;
            }
            Node node = new Node(val);
            tail.next=node;
            tail=node;

        }
        public void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+"->");
                temp=temp.next;
            }
            System.out.println("END");
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

        public static LL merge(LL first,LL second){
            Node fh = first.head;
            Node sh = second.head;

            LL ans = new LL();
            while(fh!=null && sh!=null) {
                if (fh.val < sh.val) {
                    ans.insertlLast(fh.val);
                    fh = fh.next;
                } else {
                    ans.insertlLast(sh.val);
                    sh = sh.next;
                }
            }

                while(fh!=null){
                    ans.insertlLast(fh.val);
                    fh=fh.next;
                }
                while(sh!=null){
                    ans.insertlLast(sh.val);
                    sh=sh.next;
                }
            return ans;

        }

    }
    public static void main(String[] args) {
        LL First =new LL();
        LL Second =new LL();
        First.insertlLast(1);
        First.insertlLast(3);
        First.insertlLast(5);
        Second.insertlLast(2);
        Second.insertlLast(4);
        Second.insertlLast(6);
        Second.insertlLast(10);
       LL ans = LL.merge(First,Second);
       ans.display();




    }
}
