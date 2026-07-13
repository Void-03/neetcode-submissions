class Solution 
{
    public boolean hasDuplicate(int[] nums) 
    {
        HashMap<Integer, Integer> seen_num = new HashMap<>();

        for(int i=0; i < nums.length; i++)
        {
            int current = nums[i];
            if(seen_num.containsValue(current))
            {
                return true;
            }
            seen_num.put(i,nums[i]);
        }     
        return false;   
    }
}