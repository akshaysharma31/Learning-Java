package Arrays;


public class Merge_two_shorted_arrays_in_one_single_array {


        public void merge(int[] nums1, int m, int[] nums2, int n) {
            // Start filling from the end of nums1 array
            int i = m - 1; // Last element in the initial part of nums1
            int j = n - 1; // Last element in nums2
            int k = m + n - 1; // Last position in nums1

            // Merge nums1 and nums2 starting from the end
            while (i >= 0 && j >= 0) {
                if (nums1[i] > nums2[j]) {
                    nums1[k] = nums1[i];
                    i--;
                    k--;
                } else {
                    nums1[k] = nums2[j];
                    j--;
                    k--;
                }
            }

            // If there are remaining elements in nums2, copy them
            while (j >= 0) {
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }

        public static void main(String[] args) {
            Merge_two_shorted_arrays_in_one_single_array solution = new Merge_two_shorted_arrays_in_one_single_array();

            int[] nums1 = {1, 2, 3, 0, 0, 0};
            int m = 3;
            int[] nums2 = {2, 5, 6};
            int n = 3;

            System.out.println("Before merging: ");
            printArray(nums1, m + n);

            solution.merge(nums1, m, nums2, n);

            System.out.println("After merging: ");
            printArray(nums1, m + n);
        }

        private static void printArray(int[] nums, int length) {
            for (int i = 0; i < length; i++) {
                System.out.print(nums[i] + " ");
            }
            System.out.println();
        }
    }




