package base.day1.topic003_bubble_sort;

/** 冒泡排序
 * @author 郭家赫
 */
public class BubbleSort {

    public static void main(String[] args) {
        int [] arr = {1,2,5,4,6,1,7};
        bubbleSort(arr);
        for (int a:arr){
            System.out.print(a+" ");
        }

    }


    /**
     *  两两相比，谁大谁往后,每一步确定最后一个数位
     * @param arr 排序后的结果
     */
    public static void bubbleSort(int [] arr){
        int n = arr.length;
        if (arr==null ||n<2){
            return;
        }
        for (int i = n-1; i >=0 ; i--) {
            for (int j = 1; j <=i ; j++) {
                if (arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
