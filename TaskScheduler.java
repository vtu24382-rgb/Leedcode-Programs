import java.util.*;

class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for (char c : tasks) freq[c - 'A']++;

        Arrays.sort(freq);
        int max = freq[25];
        int idle = (max - 1) * n;

        for (int i = 24; i >= 0 && freq[i] > 0; i--) {
            idle -= Math.min(freq[i], max - 1);
        }
        return idle > 0 ? tasks.length + idle : tasks.length;
    }
}
