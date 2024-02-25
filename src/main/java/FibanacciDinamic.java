import java.util.HashMap;
import java.util.Map;

public class FibanacciDinamic {

    public static final Map<Integer,Integer> map = new HashMap<>();
    //time O(log n)
    //memory O(1)
    public static int  calc(int n){
        if(map.isEmpty()){
            map.put(0,0);
            map.put(1,1);
            map.put(2,1);
        }
        if(!map.containsKey(n)) {
            for (int i = map.size(); i <= n; i++) {
                map.put(i, (
                        map.get(i - 1)
                        + map.get(i - 2)));
            }
        }
        return map.get(n);
    }
}
