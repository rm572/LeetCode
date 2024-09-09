import java.util.HashMap;

public class _75_SortColors {
        public void sortColors(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int num: nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            }
            else {
                map.put(num, map.get(num)+1);
            }
        }
        int count = 0;

        if (map.containsKey(0)) {
            for (int i = 0; i < map.get(0); i++) {
                nums[count] = 0;
                count++;
            }
        }

        if (map.containsKey(1)) {
            for (int i = 0; i < map.get(1); i++) {
                nums[count] = 1;
                count++;
            }
        }


        if (map.containsKey(2)) {
            for (int i = 0; i < map.get(2); i++) {
                nums[count] = 2;
                count++;
            }
        }
    }
}
