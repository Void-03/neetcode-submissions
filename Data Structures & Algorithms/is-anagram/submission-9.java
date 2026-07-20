class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
        if(s.length() != t.length())
        {
            return false;
        }

        HashMap<Character,Integer> s_seen = new HashMap<>();
        HashMap<Character,Integer> t_seen = new HashMap<>();

        for(int i=0; i<s.length(); i++)
        {
            // if(s_seen.equals(t_seen))
            // {
            //     return true;
            // }
            s_seen.put(s.charAt(i), s_seen.getOrDefault(s.charAt(i),0) + 1);
            t_seen.put(t.charAt(i), t_seen.getOrDefault(t.charAt(i),0) + 1 );
        }
        
        return s_seen.equals(t_seen);
    }
}
