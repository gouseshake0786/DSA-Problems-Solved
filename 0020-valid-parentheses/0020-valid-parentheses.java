class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if(!stack.isEmpty()){
                char last = stack.peek();
                if((last == '(' && ch == ')') ||
               (last == '{' && ch == '}') ||
               (last == '[' && ch == ']')){
                stack.pop();
                continue;
               }
            }
            stack.push(ch);
        }

        if(stack.isEmpty())
            return true;
        
        return false;
    }

}