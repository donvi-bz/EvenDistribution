package biz.donvi.evenDistribution;

import biz.donvi.gnuPlotter.Plotter;

public class TestPlot { // REQUIRES GnuPlotter (made by me)
    public static void main(String[] args) {
        Plotter plotter = new Plotter();
        int len = 8000;
        double[][] dataLeft = new double[len][];
        double[][] dataRight = new double[len][];
        for (int i = 0; i < len; i++) {
            dataLeft[i] = RandomCords.getRandXySquare(1000, 250);
            dataRight[i] = RandomCords.getRandXyCircle(1000, 250);
        }
        plotter.writeData(dataLeft,dataRight)
               .plot(true);
        // To re-plot existing data, just copy the command that shows up orange in console.
    }
}