package biz.donvi.evenDistribution;

import biz.donvi.gnuPlotter.Plotter;

public class TestPlot {
    public static void main(String[] args) {
        Plotter plotter = new Plotter();
        int len = 6000;
        double[][] dataLeft = new double[len][];
        double[][] dataRight = new double[len][];
        for (int i = 0; i < len; i++) {
            dataLeft[i] = RandomCords.getRandXyRectangle(1000, 750);
            dataRight[i] = RandomCords.getRandXyRectangle(1000, 750,150,250,250,-50);
        }
        plotter.writeData(dataLeft, dataRight)
               .plot(true);
        // To re-plot existing data, just copy the command that shows up orange in console.
    }
}