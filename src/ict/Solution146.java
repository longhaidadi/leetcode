package ict;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lon on 16-6-21.
 */
public class Solution146 {

    private int capacity;
    Map<Integer,Node> map = new HashMap<>();
    Node head = null;
    Node end = null;
    public void LRUCache(int capacity) {
        this.capacity=capacity;
    }

    public int get(int key) {
        if(map.containsKey(key)){
            Node n = map.get(key);
            remove(n);
            setHead(n);
            return n.value;
        }
        return -1;
    }
    public void remove(Node n){
        if(n.pre!=null){
            n.pre.next=n.next;
        }else{
            head = n.next;
        }
        if(n.next!=null){
            n.next.pre=n.pre;
        }else end = end.pre;
    }
    public void setHead(Node node){
        node.next=head;
        node.pre=null;
        if(head!=null)
            head.pre=node;
        head=node;
        if(end==null)
            end=head;

    }

    public void set(int key, int value) {
        if(map.containsKey(key)){
            Node old = map.get(key);
            old.value=value;
            remove(old);
            setHead(old);
        }else {
            Node newNode = new Node(key,value);
            if(map.size()>=capacity){
                map.remove(end.key);
                remove(end);
                setHead(newNode);
            }else setHead(newNode);
            map.put(key,newNode);
        }
    }

    public static class Node{
        int key;
        int value;
        Node pre;
        Node next;

        public Node(int key,int value){
            this.key=key;
            this.value=value;
        }

    }
}
