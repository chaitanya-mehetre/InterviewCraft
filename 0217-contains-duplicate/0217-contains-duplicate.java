class Solution {
    public boolean containsDuplicate(int[] nums) {
        int[] checkArr = nums.clone();
        
        Arrays.sort(checkArr);

        for(int i = 0; i < checkArr.length - 1 ; i++){
            if(checkArr[i] == checkArr[i+1]){
                return true;
            }
        }
        return false;
    }
}