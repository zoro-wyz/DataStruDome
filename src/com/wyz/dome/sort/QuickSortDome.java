package com.wyz.dome.sort;

import java.util.Arrays;

/**
 * todo：快速排序练习
 *  先选用一个哨兵，作为比较，然后将所有比哨兵大的放到右侧，比哨兵小的放到左侧
 *  然后将这两侧的数分别进行排序，使用递归
 */
public class QuickSortDome {

    public static void main(String[] args) {

        int[] array = {5,8,4,0,1,7,3};
        quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] array, int start, int end){

        if (start < end){
            //定义一个标准数，哨兵，作为比较值。
            int stard = array[start];

            //定义两个记录大数和小数的下标
            int low = start;
            int high = end;

            //循环找出比标准数大的数和比标准数小的
            while(low < high){

                //如果右边的数比标准数大
                while (low<high && stard <= array[high]){
                    //将下标往前移
                    high--;
                }
                //如果右边的数比标准数小，则将该数替换掉左边的数
                array[low] = array[high];

                //如果左边的数比标准数小
                while (low<high && stard>= array[low]){
                    low++;
                }
                //如果左边的数比标准数大，则将该数替换掉右边的数
                array[high] = array[low];
            }

            //将标准数赋值给低位数的下标
            array[low] = stard;

            //通过递归对左边的数进行排序
            quickSort(array,start,low);
            //通过递归对右边的数进行排序
            quickSort(array,low+1,end);

        }

    }
}
