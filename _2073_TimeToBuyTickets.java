import java.util.LinkedList;
import java.util.Queue;

public class _2073_TimeToBuyTickets {
        public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i : tickets) {
            q.add(i);
        }

        int count = 0;
        int index = 0;
        while (!q.isEmpty()) {
            int num = q.remove();
            if (index == k && num == 1) {
                return count+1;
            } 
            else if (num == 0) {
                q.add(num);
            }
            else {
                num -= 1;
                q.add(num);
                count++;
            }


            index = (index + 1) % tickets.length;
        }

        return count;
    }
}
