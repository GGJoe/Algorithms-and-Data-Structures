package interview.class01;

import java.util.Objects;

/**
 * 一个数组中只存在‘G’ 和 ‘B’，
 *
 * 想让左右的G都在左侧，所有的B都在右侧
 *
 * 只能在相邻字符之间进行交换操作
 *
 * 返回至少交换的次数
 * @author 郭家赫
 */
public class MinSwap {
    public static void main(String[] args) {
        char [] chars = {'B','B','G','G','B','B','G'};
        System.out.println(greedyMethod(chars));
    }

    public static int greedyMethod(char [] chars){
        if(chars==null){
            return 0;
        }
        int l = 0;
        int res =0;
        int n = chars.length;
        for (int index = 0; index < n &&l<n; index++) {
            if (chars[index]!='G'){
                index++;
            } else {
                res+= index-l;
                l++;
            }
        }
        return res;
    }
}
