package com.tianyongwei.algorithm.misc;

import lombok.AllArgsConstructor;
import lombok.Data;

public class FindMinMax {

    public MinMax getMinMax(int[] array) {
        return getMinMax(array, 0, array.length-1);
    }

    private MinMax getMinMax(int [] array,int start,int end){
        //分治的终止条件 如果  两个坐标相邻 或者是同一个坐标，返回最小的值和最大的值
        if(end-start<=1){
            if(array[start]>array[end]){
                return new MinMax(array[end],array[start]);
            }else
            {
                return new MinMax(array[start], array[end]);
            }
        }
        else{
            //如果开始下标和终止下标没有到达终止下标，求出中间坐标
            int mid = (start+end)/2;
            MinMax left = getMinMax(array, start, mid);
            MinMax right = getMinMax(array, mid+1, end);
            
            int max = 0, min = 0;
            
            min = left.getMin()<right.getMin()
                    ? left.getMin() : right.getMin();
            max = left.getMax()>right.getMax()
                    ? left.getMax() : right.getMax();
            
            //返回查找的最大最小
            return new MinMax(min, max);
        }
    }


}
@Data
@AllArgsConstructor
class MinMax{
    private int min, max;
}
