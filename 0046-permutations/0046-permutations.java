class Solution {
    List<List<Integer>> r = new ArrayList<>();
    void permuteHelper(int[] nums,int index)
    {
        if(index==nums.length)
        {
            List<Integer> permutation = new ArrayList<>();
            for(int num:nums)
            permutation.add(num);
            r.add(permutation);
            return;
        }
        for(int i=index;i<nums.length;i++)
        {
            swap(nums,i,index);
            permuteHelper(nums,index+1);
            swap(nums,i,index);
        }
    }
    void swap(int[] arr,int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // void backtrack(int[] nums,boolean[] used, List<Integer> current)
    // {
    //     if(current.size()==nums.length)
    //     {
    //         r.add(new ArrayList<>(current));
    //         return;
    //     }
    //     for(int i=0;i<nums.length;i++)
    //     {
    //         if(used[i])
    //         continue;
    //         used[i]=true;
    //         current.add(nums[i]);
    //         backtrack(nums,used,current);
    //         current.remove(current.size()-1);
    //         used[i]=false;
    //     }
    // }


    // void generate(int[] nums,List<Integer> current)
    // {
    //     if(current.size()==nums.length)
    //     {
    //         Set<Integer> set = new HashSet<>(current);
    //         if(set.size()==nums.length)
    //         r.add(new ArrayList<>(current));
    //         return;
    //     }
    //     for(int num: nums)
    //     {
    //         current.add(num);
    //         generate(nums,current);
    //         current.remove(current.size()-1);
    //     }
    // } 
    public List<List<Integer>> permute(int[] nums) {   
        r.clear();
        permuteHelper(nums,0);
        return r;
    }
}