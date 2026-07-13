class Solution 
{
    public boolean hasDuplicate(int[] nums) 
    {
        HashSet<Integer> seen_num = new HashSet<>();

        for(int i : nums )
        {
            if(!seen_num.add(i))
            {
                return true;
            }
        }     
        return false;   
    }
}