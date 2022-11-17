package DZ_5;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> mapa = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!mapa.containsKey(nums[i])) {
                mapa.put(nums[i], i);
            } else if (Math.abs(mapa.get(nums[i]) - i) <= k) {
                return true;
            } else {
                mapa.put(nums[i], i);
            }
        }
        return false;
    }
}
