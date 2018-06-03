package sort;

public class BinarySearch {

    public int binarySearch(int[] nums, int key) {
        int l = 0,r = nums.length;
        while (l<=r){
            int m = l+ (r-l)/2;
            if(nums[m] == key)
                return m;
            else if (nums[m]>key)
                r = m - 1;
            else
                l = m + 1;
        }
        return -1;
    }
}
