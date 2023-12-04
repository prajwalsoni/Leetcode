class Solution {
    public String intToRoman(int num) {
        final StringBuilder result = new StringBuilder();
        short cur;
        if ((cur = (short) (num / 1000 % 10)) != 0) {
            convertNumeralToRoman(result, cur, "M", null, null);
        }
        if ((cur = (short) (num / 100 % 10)) != 0) {
            convertNumeralToRoman(result, cur, "C", "D", "M");
        }
        if ((cur = (short) (num / 10 % 10)) != 0) {
            convertNumeralToRoman(result, cur, "X", "L", "C");
        }
        if ((cur = (short) (num % 10)) != 0) {
            convertNumeralToRoman(result, cur, "I", "V", "X");
        }
        return result.toString();
    }

    private static void convertNumeralToRoman(StringBuilder result,
                                         short num,
                                         String one,
                                         String five,
                                         String ten) {
        switch (num) {
            case 1 -> result.append(one);
            case 2 -> result.append(one).append(one);
            case 3 -> result.append(one).append(one).append(one);
            case 4 -> result.append(one).append(five);
            case 5 -> result.append(five);
            case 6 -> result.append(five).append(one);
            case 7 -> result.append(five).append(one).append(one);
            case 8 -> result.append(five).append(one).append(one).append(one);
            case 9 -> result.append(one).append(ten);
            default -> {
            }
        }
    }
}