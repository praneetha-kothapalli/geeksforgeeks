class Solution {
    public String baseNeg2(int n) {
        if (n == 0) return "0";
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            int r = n & 1;          // remainder 0 or 1
            sb.append(r);
            n = (n - r) / -2;       // move to next digit
        }
        return sb.reverse().toString();
    }
}
