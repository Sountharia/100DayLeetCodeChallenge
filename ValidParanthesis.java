class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> paranthesis = new HashMap<>();
        Stack<Character> stk = new Stack<>();
        paranthesis.put(')', '(');
        paranthesis.put(']', '[');
        paranthesis.put('}', '{');
        if (s.length() == 0 || s.length()%2!=0) return false;
        for (Character c : s.toCharArray()){
            if (paranthesis.get(c) != null && stk.size()>0 && paranthesis.get(c)==stk.peek()){
                stk.pop();
            } else{
                stk.push(c);
            }
            System.out.println(stk);
        }
        
        return stk.size() == 0; // stk.isEmpty();


        // Map<Character, Character> mp = new HashMap<>();
        // mp.put('}','{');
        // mp.put(')','(');
        // mp.put(']','[');
        // Stack<Character> st = new Stack<>();
        // for (Character c : s.toCharArray()){
        //     System.out.println("c:"+ c);
        //     if (mp.containsKey(c) && st.size() >0 && mp.get(c)==st.peek() ){
        //         st.pop();
        //     }else st.push(c);
        // }
        // return st.size()==0;


        // Stack<Character> stack = new Stack<>();
        // java.util.Map<Character, Character> cc = new java.util.HashMap<>();
        // cc.put(')','(');
        // cc.put(']','[');
        // cc.put('}','{');
        // for (char c: s.toCharArray()){
        //     if (cc.containsKey(c)){
        //         if (!stack.isEmpty() && stack.peek()==cc.get(c)){
        //             stack.pop();
        //         }else{
        //             return false;
        //         }
        //     }
        //     else {
        //         stack.push(c);
        //     }

            
        // }
        // return stack.isEmpty();
    }
}
