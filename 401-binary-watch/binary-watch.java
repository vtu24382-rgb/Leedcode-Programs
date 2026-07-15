class Solution {
    public List<String> readBinaryWatch(int turnedOn) {

        List<String> ans = new ArrayList<>();

        for (int hour = 0; hour < 12; hour++) {
            for (int minute = 0; minute < 60; minute++) {

                int totalBits = countBits(hour) + countBits(minute);

                if (totalBits == turnedOn) {

                    String time = hour + ":" + formatMinute(minute);
                    ans.add(time);
                }
            }
        }

        return ans;
    }

    // Count number of 1's in binary
    public int countBits(int n) {

        int count = 0;

        while (n > 0) {

            if ((n & 1) == 1) {
                count++;
            }

            n = n >> 1;
        }

        return count;
    }

    // Convert minute into two digits
    public String formatMinute(int minute) {

        if (minute < 10) {
            return "0" + minute;
        }

        return "" + minute;
    }
}