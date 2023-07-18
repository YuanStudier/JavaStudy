package org.ywb.math;

import org.apache.commons.math3.distribution.CauchyDistribution;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.RandomGeneratorFactory;

public class zipf {
    public static void main(String[] args) {
        RandomGenerator rng = RandomGeneratorFactory.createRandomGenerator();

        // 创建齐夫分布对象
        CauchyDistribution cauchyDistribution = new CauchyDistribution(0, 1);

        // 生成齐夫分布数据
        int numSamples = 1000;
        double[] data = new double[numSamples];
        for (int i = 0; i < numSamples; i++) {
            data[i] = cauchyDistribution.sample();
        }

        // 打印生成的数据
        for (double value : data) {
            System.out.println(value);
        }
    }
}
