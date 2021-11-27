class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result_arr = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        char[] chrs_arr = new char[26]; // stores the string from input array character by character to facilitate sorting
        for(int i=0; i<strs.length; i++){
            chrs_arr = strs[i].toCharArray(); //store the string in character array
            // System.out.println(new String(chrs_arr));
            Arrays.sort(chrs_arr);
            
            String keyStr = String.valueOf(chrs_arr); //key (String) of HashMap
            if(!map.containsKey(keyStr)){
                map.put(keyStr, new ArrayList<>());
            }
            // System.out.println("Before = "+Arrays.asList(map));
            map.get(keyStr).add(strs[i]); // get the value using key -> add the current string into the list
            // System.out.println("After = "+Arrays.asList(map));
        }
        for(String s : map.keySet()){
            result_arr.add(map.get(s));
        }
        return result_arr;
    }
}