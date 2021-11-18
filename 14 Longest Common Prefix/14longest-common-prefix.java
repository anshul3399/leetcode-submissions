class Solution {
    public String longestCommonPrefix(String[] strs) {
        String lngst_cmn_str = new String();
        lngst_cmn_str = strs[0];
        for(int i=1;i<strs.length;i++){
            if(strs[i].startsWith(lngst_cmn_str)){
                
            }
            else{
                lngst_cmn_str=commonChars(strs[i],lngst_cmn_str);
            }
            // System.out.println("Lngst Common Prefix - "+lngst_cmn_str);
        }
        
        return (lngst_cmn_str.toString());
    }
    public String commonChars(String s1, String s2){
        int i;
            for(i=0;i<Math.min(s1.length(),s2.length());i++){
                if(s1.charAt(i)!=s2.charAt(i)){
                    break;
                }
            }
            return (s1.substring(0,i));
        }
}