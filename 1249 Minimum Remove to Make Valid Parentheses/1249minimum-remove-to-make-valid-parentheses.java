class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder(s);
        Stack<Integer> stk = new Stack();
        for(int i=0; i<s.length(); ++i){
            if (sb.charAt(i) == '(') stk.add(i+1);
            if (sb.charAt(i) == ')') {
                if(!stk.empty() && stk.peek()>=0) stk.pop();
                else{
                    stk.add(-(i+1)); //if ')' is appearing before any '(' we add index of appearance of ')' into the stack with -ve sign
                }
            }
        }
        while(!stk.empty()){
            sb.deleteCharAt(Math.abs(stk.pop())-1);
        }
        return sb.toString();
    }
}