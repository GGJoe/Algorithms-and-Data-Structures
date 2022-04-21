package interview.class01;

/**
 * @author 郭家赫
 * 给定一个数组arr,你可以决定每个数字之前添加+/-
 *
 * 但是必须所有数字都参与
 *
 * 在给定一个目标值target
 *
 * 请问最后算出的target的方法是多少
 *
 * arr=[1,2,3,4,5] target = 3;
 *
 * 用例：
 * +1 -2 +3 -4 +5 = 3
 * 计算不同的计算方法
 */
public class TargetSum {
    public static void main(String[] args) {

        int [] arr ={1,2,3,4,5,3  };
        int target =3;
        System.out.println(process(arr, 0, target));

    }


    /**
     *
     * @param arr 需要求解的数组
     * @param index 一个索引，当前索引位置
     * @param rest 目标值
     * @return 返回可行地计算次数
     */
    public static int process(int [] arr,int index,int rest){

        //*base case
        if (index==arr.length){
            return rest== 0?1:0;
        }
        return process(arr,index+1,rest-arr[index]) +
                process(arr,index+1,rest+arr[index]);

    }


}
