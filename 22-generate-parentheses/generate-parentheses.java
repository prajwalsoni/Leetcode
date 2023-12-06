class Solution {
    List<String> result;
    public List<String> generateParenthesis(int num) {
        result = new ArrayList<>();
        generateParenthesis(num, num, new StringBuilder());
        return result;
    }
    public void generateParenthesis(int open, int close, StringBuilder sb) {
        if(open==0 && close==0){
            result.add(sb.toString());
            return;
        }
        if(open > close || open < 0)
            return;
        generateParenthesis(open-1, close, sb.append('('));
        sb.deleteCharAt(sb.length() - 1);
        
        generateParenthesis(open, close-1, sb.append(')'));
        sb.deleteCharAt(sb.length() - 1);
    }
}