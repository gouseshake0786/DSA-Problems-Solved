class Solution {
    public boolean isSubsequence(String s, String t) {
        int sp=0,tp=0;
        if(s.length()==0) return true;
        while(sp<s.length()&tp<t.length()){
            if(s.charAt(sp)==t.charAt(tp))
            sp++;
            tp++;
           
        }
        return sp==s.length();
    }
}