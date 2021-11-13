class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr = new ArrayList<List<Integer>>(numRows);
        
        for(int i=0; i<numRows; i++){
            List<Integer> arrRow = new ArrayList<Integer>(numRows);
            for(int j=0; j<=i; j++){
                if(i==j || j==0) //if the element is either first or last in the subarray -> 1 
                    arrRow.add(1);
                else{
                    // an element i,j of List<List<>> is,
                    // F(i,j) = F(i-1, j-1) + F(i-1, j)
                    arrRow.add(arr.get(i-1).get(j-1)+arr.get(i-1).get(j));
                }
            }
        arr.add(arrRow);
        }
        return arr;
    }
}