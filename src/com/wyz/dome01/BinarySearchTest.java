package com.wyz.dome01;

/**
 * 二分查找练习
 */
public class BinarySearchTest {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9};

        //定义开始的下标
        int begin = 0;
        //定义结束的下标
        int end = array.length;
        //定义中间的下标
        int mid = (begin + end)/2;

        //目标元素
        int target = 9;
        int index = -1;
        while (true){

            //当开始值大于等于结束值时，说明没有该元素
            if (begin >= end){
                index = -1 ;
                break;
            }
            //先判断中间元素
            if ( target == array[mid] ){
                index = mid;
                break;

              //如果不相等，那么根据中间值的大小来改变开始或者结尾值
            }else {

                //如果中间值大于目标值，则改变结尾值
                if ( array[mid] > target){
                    end = mid - 1;

                    //否则，改变开始值
                }else {
                    begin = mid + 1;
                }

                //最后，都要改变中间值
                mid = (begin + end)/2 ;
            }

        }
        System.out.println("index :" + index );

    }

}
