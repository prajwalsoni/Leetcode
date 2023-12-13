class Solution {
    public boolean isNumber(String s) {
        try{
            Double.valueOf(s);
            return Character.isDigit(s.charAt(s.length() - 1)) || s.charAt(s.length() - 1) == '.';
        } catch(Exception e){
            return false;
        }
    }
}