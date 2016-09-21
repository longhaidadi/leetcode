package test;

/**
 * Created by lon on 16-3-14.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Father {


    public static void main(String[] args) {
        Map<Integer,List<Integer>>listMaps = new HashMap<>();
        for(int i =0;i<10;i++){
            List<Integer> lists = listMaps.get(i);
            if(lists==null)
            {
                lists = new ArrayList<>();
                listMaps.put(i,lists);
            }

            lists.add(1);

        }
        for(Map.Entry<Integer,List<Integer>>entry : listMaps.entrySet())
            System.out.println(entry.getKey()+"\t"+entry.getValue());
    }

}
