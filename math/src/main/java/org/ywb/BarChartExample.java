package org.ywb;

import javax.swing.*;
import java.awt.*;

public class BarChartExample extends JPanel {
    private double[] data;
    private int yAxisMargin = 30;  // Y轴的边距
    private Color barColor = Color.BLUE;  // 柱形的颜色
    private int barWidth = 20;  // 柱形的宽度

    public BarChartExample(double[] data) {
        this.data = data;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        int width = getWidth();
        int height = getHeight();

        // 计算每个柱形的间隔
        int barGap = (width - yAxisMargin - barWidth * data.length) / (data.length + 1);

        // 找出最大值以便进行比例缩放
        double maxData = 0;
        for (double value : data) {
            if (value > maxData) {
                maxData = value;
            }
        }

        // 绘制坐标轴
        g2d.setColor(Color.BLACK);
        g2d.drawLine(yAxisMargin, height - yAxisMargin, yAxisMargin, 0);  // Y轴
        g2d.drawLine(yAxisMargin, height - yAxisMargin, width, height - yAxisMargin);  // X轴

        // 绘制柱状图
        for (int i = 0; i < data.length; i++) {
            int barHeight = (int) ((double) data[i] / maxData * (height - yAxisMargin));
            int x = i * (barWidth + barGap) + yAxisMargin + barGap;
            int y = height - barHeight - yAxisMargin;
            g2d.setColor(barColor);
            g2d.fillRect(x, y, barWidth, barHeight);
        }
    }
}
