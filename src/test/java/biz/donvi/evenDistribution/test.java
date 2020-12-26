package biz.donvi.evenDistribution;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static biz.donvi.evenDistribution.RandomCords.*;

public class test {

    public static void main(String[] args) throws IOException {
//        new Thread(() -> Application.launch(PointsPage.class)).start();
//        new Thread(new Runnable() {
//            @Override
//            public synchronized void run() {
//                try {
//                    wait(3000L);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                } finally {
//                    Platform.exit();
//                }
//            }
//        }).start();
        gnuPlotPoints();
    }

    private static void gnuPlotPoints() throws IOException {
        int radiusMax = 1000;
        int radiusMin = 500;

        File randPointDataFile = new File("plot/random.txt");
        if (!randPointDataFile.exists()) {
            randPointDataFile.getParentFile().mkdir();
            randPointDataFile.createNewFile();
        }
        FileWriter randPointDataFileWriter = new FileWriter(randPointDataFile);

        for (int i = 0; i < 40000; i++) {
            double[] randomCord = getRandXyCircle(radiusMax, radiusMin,6,.5);
            randPointDataFileWriter.write(randomCord[0] + " " + randomCord[1] + '\n');
        }


        randPointDataFileWriter.close();
        Runtime.getRuntime().exec(
                "\"C:/Program Files/gnuplot/bin/wgnuplot.exe\" " +
                "--persist \"D:/Laptop/Java/myLibs/EvenDistribution/plot/plotShape.sh\"");
    }
}
