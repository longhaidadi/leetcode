package ict;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * Created by lon on 16-6-21.
 */
public class Solution127 {
    public int ladderLength(String beginWord,String endWord,Set<String> wordList){
        Queue<Node>queue = new LinkedList<>();
        queue.add(new Node(beginWord,1));
        while (queue.isEmpty()){
            Node node = queue.poll();
            wordList.remove(node);
            if(endWord.equals(node.val)){
                return node.level;
            }
            char [] array = node.val.toCharArray();
            for (char i = 'a'; i < 'z'; i++) {
                for (int j = 0; j <array.length; j++) {
                    array[j]=i;
                    String tmp = new String(array);
                    if(!tmp.equals(node.val)&& wordList.contains(tmp)){
                        queue.add(new Node(tmp,node.level+1));
                        wordList.remove(tmp);
                    }
                }
            }
        }
        return 0;


    }

    private static class Node{
        String val;
        int level;
        public Node(String val,int level){
            this.val=val;
            this.level=level;
        }
    }
}
