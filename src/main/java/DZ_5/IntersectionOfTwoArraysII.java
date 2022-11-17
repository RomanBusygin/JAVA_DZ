package DZ_5;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }

        Map<Integer, Integer> mapa = new HashMap<>();
        List<Integer> intersectList = new ArrayList<>();
        for (int num : nums1) {
            if (mapa.containsKey(num)) {
                mapa.put(num, mapa.get(num) + 1);
            } else {
                mapa.put(num, 1);
            }
        }

        for (int num : nums2) {
            if ((mapa.containsKey(num)) && (mapa.get(num) > 0)) {
                intersectList.add(num);
                mapa.put(num, mapa.get(num) - 1);
            }
        }

        int[] answer = new int[intersectList.size()];
        for (int i = 0; i < intersectList.size(); i++) {
            answer[i] = intersectList.get(i);
        }
        return answer;
    }
}
