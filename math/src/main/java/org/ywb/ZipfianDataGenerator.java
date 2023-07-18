package org.ywb;

import org.apache.commons.math3.distribution.ZipfDistribution;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ZipfianDataGenerator {
    public static void main(String[] args) {
        int dataSize = 1000; // 数据集大小
        double zipfExponent = 2; // Zipf 分布的指数参数

        ZipfDistribution zipfDistribution = new ZipfDistribution(dataSize, zipfExponent);
        List<Integer> dataValue = new ArrayList<>();
        List<Integer> data = new ArrayList<>();
        //先产生数组，在打乱
        for (int k = 0; k < dataSize; k++){
            dataValue.add(k + 1);
        }
        Collections.shuffle(dataValue);
        //利用zipfian生成对应数据
        for (int k = 0; k < dataSize; k++){
            int index = zipfDistribution.sample();
            data.add(dataValue.get(index));
        }

        String filename = "zipf.txt";  // 文件名

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (int i = 0; i < data.size(); i++) {
                writer.write(String.valueOf(data.get(i)));
                writer.newLine();
            }
            System.out.println("数据已成功写入文件：" + filename);
        } catch (IOException e) {
            System.err.println("写入文件时发生错误：" + e.getMessage());
        }
    }
}

