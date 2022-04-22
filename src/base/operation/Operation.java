package base.operation;

/**
 * 位运算
 * @author 郭家赫
 */
public class Operation {
    public static void main(String[] args) {
        int num =1;
        print(num);

    }

    public static void print(int num){
        for (int i = 31; i >=0 ; i--) {
            //将1 左移i 位，i位的值与num的i位相与，高位为1 则保留继续下一位
            //左移一位乘2，右移除2
            System.out.print((num &(1<<i))==0?"0":"1");
        }
        System.out.println();
    }
}
