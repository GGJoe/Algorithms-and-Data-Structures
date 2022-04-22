package base.day1.tpic002_select_sort;

/**选择排序
 * @author 郭家赫
 */
public class SelectSort {





    public static void selectSort(int [] arr){

        int n=arr.length;
        if (arr==null||n<2){
            return;
        }

        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {
                if (arr[j]<arr[i]){
                    int temp;
                    temp =arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

    }
    public static void main(String[] args) {
        int [] arr ={1,5,1,2,5,1,341,64,3,2};
        selectSort(arr);
        for (int j : arr) {
            System.out.print(j+" ");
        }
    }
}
