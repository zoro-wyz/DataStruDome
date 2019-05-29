package com.wyz.dome01;

/**
 * 使用递归解决 汉诺塔 问题
 */
public class HanoiTest {

    public static void main(String[] args) {

        hanoi(3,"A","B","C");
    }

    /**
     *  思路： 不管有多少盘子，只当做有两个盘子： 最底下的盘子和上面的盘子，n，n-1
     * @param n 有多少个盘子
     * @param from 开始的盘子
     * @param in 中间的盘子
     * @param to 目标盘子
     */
    public static void  hanoi(int n, String from, String in , String to){

        //当只有一个盘子时
        if ( n == 1 ){
            System.out.println("第1个盘子从" + from + "移动到" + to );
        }else {
            //将上面所有的盘子移动到中间盘子
            hanoi(n-1 , from, to , in  );
            //将 下面的盘子 移动到目标盘子
            System.out.println( "第" + n + "个盘子从" + from +"移动到" + to);
            //将 上面的盘子 从中间盘子移动到 目标盘子
            hanoi( n-1 , in, from , to);
        }
    }
}
