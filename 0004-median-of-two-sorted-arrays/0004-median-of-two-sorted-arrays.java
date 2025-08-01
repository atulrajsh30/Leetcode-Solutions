class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1= nums1.length;
        int l2= nums2.length;
        double a; double b;
        a=0; b=0;
        double median;
        median=0.0;
        int l3= l1+l2;
        int sa[] = new int[l3];
        int c=0;
        for(int i=0; i<l1; i++)
        {
            sa[c]=nums1[i];
            c++;
        }
        for (int i=0; i<l2; i++)
        {
            sa[c]= nums2[i];
            c++;
        }
        Arrays.sort(sa);
        if(l3%2==0)
        {
            int g= l3/2;
            a= sa[g];
            b= sa[g-1];
            median= (a+b)/2;
        }
        else if (l3%2!=0)
        {
            median = (double) sa[l3/2];
        }
        return median;

    }
}