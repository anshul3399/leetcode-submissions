class Solution {
    public int strStr(String haystack, String needle) {
        int l1=haystack.length(), l2=needle.length();
        if(l1>=0 && l2==0) return 0; //if both strings are empty
        if(l1==0 && l2>=0) return -1; // haystack is empty
        int check_until = l1-l2;
        for(int i=0; i<=check_until;++i){
            // if the needle string is found in haystack from the current index
            if(haystack.substring(i,i+l2).equals(needle)) return i;
        }
        return -1;
    }
}