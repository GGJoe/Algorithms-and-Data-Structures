package interview.class01;

/**
 * 题目要求：给定一个有序数组arr,代表坐落在x轴上的点
 *
 * 给定一个正数k，代表绳子长度
 *
 * 返回绳子最多压中几个点（包括绳子边缘处）
 */
public class CordCoverMaxPoint {
    public static void main(String[] args) {
        int [] arr = {1,2,5,8,9,12,15,18,21};
        int k=4;
        System.out.println(MaxPointForBinary.maxPointForBinary(arr, k));
    }
}


/**
 * 算法1:将绳子右端点始终放在坐标上，计算中间的点个数
 * 思维：贪心+二分查找
 */

class MaxPointForBinary{
    public  static  int maxPointForBinary(int [] arr,int k){
        int res = 1;
        for (int i = 0; i < arr.length; i++) {
            int nearest = binary(arr,i,arr[i]-k);
            res=Math.max(res,i-nearest+1);
        }
        return res;
    }
    public static int binary(int [] arr,int r,int value){
        int l = 0 ;
        int index = r;
        while(l<=r){
            int mid =l+((r-l)>>1);
            if (arr[mid]>=value) {
                index=mid;
                r=mid-1;
            }else {
                l=mid+1;
            }
        }
        return index;
    }
}




class MaxPointForSlideWindow{

}