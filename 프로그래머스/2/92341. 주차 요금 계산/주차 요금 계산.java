import java.util.*;

class Solution {
    
    public int cal_time(String time) {
        String[] time_hm = time.split(":");
        return Integer.parseInt(time_hm[0]) * 60 + Integer.parseInt(time_hm[1]);
    }
    
    public int[] solution(int[] fees, String[] records) {
        
        int default_time = fees[0];
        int default_fee = fees[1];
        int cal_min = fees[2];
        int min_fee = fees[3];
        
        Map<Integer, Integer> result = new TreeMap<>();
        Map<Integer, Integer> time_get = new HashMap<>();
        
        for (String data : records) {
            String[] str = data.split(" ");
            int time = cal_time(str[0]);
            int car_num = Integer.parseInt(str[1]);
            if (str[2].equals("OUT")) {
                int a = time - time_get.get(car_num);
                time_get.remove(car_num);
                if (result.containsKey(car_num)) {
                    int be_time = result.get(car_num);
                    result.put(car_num, be_time + a);
                } else {
                    result.put(car_num, a);
                }
            } else {
                time_get.put(car_num, time);
            }
        }
        
        int not_out = 23 * 60 + 59;
        if (time_get.size() != 0) {
            for (Integer i : time_get.keySet()) {
                int fee = not_out - time_get.get(i);
                if (result.containsKey(i)) {
                    result.put(i, result.get(i) + fee);
                } else {
                    result.put(i, fee);
                }
            }
        }
        
        int[] answer = new int[result.size()];
        int idx = 0;
        
        for (Integer i : result.keySet()) {
            double unit = (double)(result.get(i) - default_time) / cal_min;
            int x = (int)Math.ceil(unit);
            if (result.get(i) >= default_time) {
                answer[idx] = default_fee + x * min_fee;
            } else {
                answer[idx] = default_fee;
            }
            idx++;
        }
        
        return answer;
    }
}