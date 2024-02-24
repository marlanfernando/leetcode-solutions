package _24_02_2024;

public class MedianTwoArray {

    public static void main(String[] args) {
        MedianTwoArray mm = new MedianTwoArray();
        int[] arr1 = new int[] {100001};
        int[] arr2 = new int[] {100000};

        System.out.println(mm.findMedianInSortedArrays(arr1, arr2));
    }

    /**
     * Given two sorted int arrays, find the median of the merged array
     * @param nums1
     * @param nums2
     * @return
     */
    public double findMedianInSortedArrays(int[] nums1, int[] nums2) {

        int len = nums1.length + nums2.length;
        boolean isFirstFinished = false;
        int[] merged = new int[len];
        int ctr1 = 0;
        int ctr2 = 0;
        int lastIdx = 0;

        if (nums1.length == 0) {
            merged = nums2;
        } else if (nums2.length == 0) {
            merged = nums1;
        } else {

            for (int i = 0; i < len; i++) {
                if(nums1[ctr1] < nums2[ctr2] && !isFirstFinished) {
                    merged[i] = nums1[ctr1];

                    if(ctr1 + 1 < nums1.length) {
                        ctr1++;
                    } else {
                        isFirstFinished = true;
                    }

                } else {
                    merged[i] = nums2[ctr2];

                    if(ctr2 + 1 < nums2.length) {
                        ctr2++;
                    } else {
                        lastIdx = i;
                        break;
                    }

                }
            }

            for(int i = lastIdx+1; i < len && !isFirstFinished; i++) {
                merged[i] = nums1[ctr1];
                ctr1++;
            }
        }

        if(len%2 != 0) {
            return merged[len/2];
        } else {
            return (double) (merged[len / 2] + merged[len / 2 - 1]) /2;
        }

    }
}
