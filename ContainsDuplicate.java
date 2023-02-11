public class Solution {
    static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        for(Integer number:nums){
            if(!s.add(number)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums={1,2,3,4};
        System.out.println(containsDuplicate(nums));
    }
}
