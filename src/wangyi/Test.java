package wangyi;

/**
 * Created by lon on 16-8-1.
 */
public class Test {
    public static void main(String[] args) {
        String str = "[[2,2],[10,8],[7,9],[8,2],[7,6],[2,18],[11,2],[7,4],[14,6],[13,13],[2,4],[14,5],[11,6],[6,5],[7,11],[14,16],[7,13],[2,5],[12,4],[12,1],[1,9],[3,6],[12,14],[12,7],[6,1],[10,8],[5,9],[3,6],[2,4],[15,2],[3,5],[11,6],[12,1],[2,4],[8,18],[15,9],[3,6],[10,3],[13,3],[12,9],[12,10],[7,10],[10,3],[4,5],[10,5],[3,18],[10,3],[2,16],[7,1],[11,18],[12,16],[7,9],[15,15],[16,9],[15,9],[13,18],[7,5],[3,5],[13,18],[13,15],[11,13],[1,9],[12,15],[2,6],[11,6],[11,14],[17,5],[13,6],[7,18],[4,5],[8,2],[8,4],[10,8],[16,4],[13,6],[16,17],[11,2],[13,14],[12,3],[7,14],[11,5],[18,5],[10,14],[7,11],[12,3],[16,4],[8,16],[12,9],[16,1],[12,4],[1,9],[3,6],[11,6],[3,5],[16,18],[8,2],[12,2],[11,8],[8,2],[12,3],[14,9],[8,2],[4,5],[12,17],[3,9],[8,4],[6,17],[8,5],[13,17],[6,9],[2,16],[2,5],[11,18],[12,17],[13,5],[12,5],[6,4],[13,8],[11,3],[3,4],[16,16],[8,2],[6,9],[13,17],[15,1],[1,17],[11,10],[10,5],[11,10],[12,1],[11,3],[8,4],[10,15],[12,13],[6,6],[18,17],[2,16],[7,5],[10,8],[11,17],[15,6],[3,18],[8,18],[16,17],[10,17],[13,13],[16,4],[13,16],[8,18],[15,3],[10,18],[11,13],[1,9],[12,4],[1,5],[8,17],[17,17],[12,2],[13,4],[15,1],[2,9],[4,5],[12,13],[11,2],[13,18],[10,1],[6,18],[12,17],[4,9],[12,14],[7,15],[2,16],[4,9],[12,1],[17,5],[10,16],[16,4],[17,9],[13,8],[8,3],[12,3],[8,4],[2,5],[7,11],[13,5],[8,4],[14,5],[16,9],[1,1],[14,17],[15,16],[2,4],[4,9],[18,4],[12,15],[1,5],[16,6],[3,14],[2,5],[4,9],[8,9],[13,8],[13,13],[13,16],[10,16],[8,5],[11,17],[10,5],[6,4],[8,6],[12,17],[1,17],[10,6],[13,9],[14,6],[2,17],[13,2],[11,10],[16,5],[7,9],[6,17],[3,16],[6,9],[8,5],[2,9],[10,16],[2,5],[13,6],[8,8],[13,10],[8,2],[10,14],[10,5],[15,14],[13,16],[11,17],[7,9],[7,4],[10,18],[2,5],[14,1],[7,5],[12,6],[4,5],[8,3],[13,16],[15,5],[3,9],[11,4],[16,4],[12,9],[8,6],[12,5],[6,18],[3,9],[15,5],[17,5],[3,6],[3,16],[8,1],[7,10],[8,18],[15,14],[17,9],[6,17],[16,1],[6,1],[11,15],[6,17],[10,5],[15,18],[10,16],[13,10],[10,4],[8,6],[8,1],[12,6],[17,9],[8,9],[14,5],[11,8],[15,14],[7,5],[18,4],[7,6],[3,16],[11,18],[12,10],[7,10],[16,5],[12,10],[8,18],[18,1],[16,1],[15,9],[12,18],[8,9],[7,1],[6,9],[2,16],[10,14],[10,1],[8,4],[11,5],[11,5],[16,5],[12,7],[8,3],[15,18],[8,5]]";
        System.out.println(str.replace('[','{').replace(']','}'));
    }

}
