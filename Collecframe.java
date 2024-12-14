package LinkedList;
import java.util.*;

public class Collecframe {
    public static void main(String[] args) {
//        LinkedList<String> ll = new LinkedList<>();
//        ll.add("harsh");
//        ll.add("Nikhil");
//        ll.add("harshuu");
//        System.out.println(ll);
//        ll.addFirst("findy");
//        ll.addLast("beta");
//        System.out.println(ll);
//        ll.add(3,"vishal");
//        ll.remove(1);
//        System.out.println(ll);
//        Stack<String> name = new Stack<>();  //LIFO
//        name.push("harshu");
//        name.push("Nikhil");
//        name.push("harsh");
//        name.pop();
//        for(String str:name){
//            System.out.println(str);
//        }
        ArrayDeque<String> name = new ArrayDeque<>();  //FIFO
        name.add("vishal");
        name.add("Nikhil");
        name.add("harsh");
        name.remove();
        for(String str:name){
            System.out.println(str);
        }
    }
}
