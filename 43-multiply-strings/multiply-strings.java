class Solution {
    public String multiply(String num1, String num2) {
        char[] ans = new char[num1.length() + num2.length() + 1];
        char[] n = new char[num1.length()];
        for (int i = 0, j = num1.length()-1; i < num1.length(); i++, j--) {
            n[i] = (char) (num1.charAt(j)-'0');
        }

        // need to truncate from the
        int n1Length = 0;
        for (int i = num2.length()-1; i >= 0; i--) {
            char[] n2 = mul(n, (char) (num2.charAt(i)-'0'), (num2.length()-1-i));
            n1Length = add(ans, n2, n1Length);
        }

        while (n1Length > 0 && ans[n1Length] == 0) {
            n1Length--;
        }

        for (int i = 0; i < n1Length+1; i++) {
            ans[i] = (char) (ans[i] + '0');
        }

        for (int i = 0; i < (n1Length+1)/2; i++) {
            char t = ans[i];
            ans[i] = ans[n1Length-i];
            ans[n1Length-i] = t;
        }
        return new String(Arrays.copyOf(ans, n1Length+1));
    }

    public static char[] mul(char[] num1, char d, int p) {
        char[] ans = new char[num1.length + p + 1];
        int l = 0;
        // num in reverse order
        int curry = 0;
        for (int i = 0; i < num1.length; i++) {
            int v = num1[i] * d + ans[p+i];
            ans[p+i] = (char) (v % 10);
            curry = (v / 10);
            l = p+i;

            // curry
            int k = 1;
            while (curry != 0) {
                v = ans[p+i+k] + curry;
                l = p+i+k;
                ans[p+i+k] = (char) (v % 10);
                curry = k / 10;
                k++;
            }
        }
        return Arrays.copyOf(ans, l+1);
    }

    public static int add(char[] num1, char[] num2, int num1Length) {
        // add value of num2 to num1, with the space of num1
        // num1 length greater than num2
        int k = 0;
        int curry = 0;
        for (int i = 0; i < Math.max(num1Length, num2.length); i++) {
            int v = num1[i] + num2[i] + curry;
            num1[i] = (char) (v % 10);
            curry = v / 10;
            k = i;
        }

        // curry
        while (curry != 0) {
            k++;
            int v = num1[k] + curry;
            num1[k] = (char) (v % 10);
            curry = v / 10;
        }
        return Math.max(k, num1Length);
    }
}