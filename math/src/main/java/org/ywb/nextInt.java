package org.ywb;

import org.apache.commons.math3.distribution.ZipfDistribution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class nextInt {
    public static void main(String[] args) {
        int dataSize = 100; // 数据集大小

        List<Integer> dataValue = new ArrayList<>();
        //先产生数组，在打乱
        for (int k = 0; k < dataSize; k++){
            dataValue.add(k + 1);
        }
        Collections.shuffle(dataValue);
        for (int i = 0; i < dataValue.size(); i++) {
            System.out.println(dataValue.get(i));
        }
    }


}
