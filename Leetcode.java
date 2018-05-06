import java.util.Comparator;
import java.util.TreeSet;

class Solution5 {
  class mCom implements Comparator{
      @Override
      public int compare(Object o1, Object o2) {
          int resc;
         Integer i1=(Integer)o1;
         Integer i2=(Integer)o2;
         resc= i1.compareTo(i2);
         if(resc==0){
             resc=-1;
         }
          return resc;
      }

      @Override
      public boolean equals(Object obj) {
          return false;
      }
  }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        TreeSet<Integer> ts=new TreeSet<>(new mCom());
        double res;
     for(int i=0;i<nums1.length;i++){
       ts.add(nums1[i]);
     }
     for (int j=0;j<nums2.length;j++){
         ts.add(nums2[j]);
     }
     Integer a[]=ts.toArray(new Integer[0]);


     int b=a.length/2;
     if(a.length%2==0){
          res=(a[b]+a[b-1])/2.0;
          return res;
     }else {
           res=a[b];
           return res;
     }
    }
    public static void main(String[] args){
      Solution5 s5=new Solution5();
        int a[]={1,1};
        int b[]={1,2};
        double c= s5.findMedianSortedArrays(a,b);
        System.out.println(c);
    }
}