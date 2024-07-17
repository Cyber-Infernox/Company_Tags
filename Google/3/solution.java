class Solution {
    public String maximumTime(String time) {
        String firstAns = time.substring(0, 2);
        String secondAns = time.substring(3);

        if (time.charAt(0) == '?' && time.charAt(1) == '?') {
            firstAns = "23";
        } else if (time.charAt(0) == '?') {
            if (time.charAt(1) - '0' >= 4)
                firstAns = "1" + time.charAt(1);
            else
                firstAns = "2" + time.charAt(1);
        } else if (time.charAt(1) == '?') {
            if (time.charAt(0) - '0' == 0 || time.charAt(0) - '0' == 1)
                firstAns = time.charAt(0) + "9";
            else
                firstAns = time.charAt(0) + "3";
        }

        if (time.charAt(3) == '?' && time.charAt(4) == '?') {
            secondAns = "59";
        } else if (time.charAt(3) == '?') {
            secondAns = "5" + time.charAt(4);
        } else if (time.charAt(4) == '?') {
            secondAns = time.charAt(3) + "9";
        }

        return firstAns + ":" + secondAns;
    }
}