import preprocess.DataPreprocess;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();

        // 预处理
        DataPreprocess dataProcess = new DataPreprocess();
        dataProcess.arrangeData();

        long endTime = System.currentTimeMillis();
        System.out.println("time cost:" + (endTime - startTime) * 1.0 / 1000 / 60 + "min");
    }
}