package com.tianyongwei.algorithm.hashfilter;

import com.google.common.base.Charsets;
import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

/**
 * https://www.kdocs.cn/p/89582750348
 */
public class BloomFilterDemo {
    public static void main(String[] args) {
        int total = 1000000; // 总数量
        BloomFilter<CharSequence> filter =
                BloomFilter.create(Funnels.stringFunnel(Charsets.UTF_8), total, 0.001D);
        // 初始化 1000000 条数据到过滤器中
        for (int i = 0; i < total; i++) {
            filter.put("" + i);
        }
        System.out.println(filter.mightContain("tian"));
        System.out.println(filter.mightContain("1"));
    }
}
