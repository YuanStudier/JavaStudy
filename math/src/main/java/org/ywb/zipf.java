package org.ywb;

import org.apache.commons.math3.distribution.CauchyDistribution;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.RandomGeneratorFactory;
import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class zipf {
    public static void main(String[] args) {
        // 创建随机数生成器
//        RandomGenerator rng = RandomGeneratorFactory.createRandomGenerator();

        // 创建齐夫分布对象
        CauchyDistribution cauchyDistribution = new CauchyDistribution(10, 100);

        // 生成齐夫分布数据
        int numSamples = 1000;
        int[] randomData = new int[numSamples];
        for (int i = 0; i < numSamples; i++) {
            randomData[i] = (int) Math.round(cauchyDistribution.sample());
        }


        String filename = "zipf.txt";  // 文件名

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (int i = 0; i < randomData.length; i++) {
                writer.write(String.valueOf(randomData[i]));
                writer.newLine();
            }
            System.out.println("数据已成功写入文件：" + filename);
        } catch (IOException e) {
            System.err.println("写入文件时发生错误：" + e.getMessage());
        }

//        JFrame frame = new JFrame("Bar Chart Example");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(400, 300);
//        frame.setLocationRelativeTo(null);
//
//        BarChartExample barChart = new BarChartExample(data);
//        frame.add(barChart);
//
//        frame.setVisible(true);
    }
}



