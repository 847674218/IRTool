import document.TextDataset;
import ir.IR;
import preprocess.DataPreprecess;

public class Test {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();

        String irModelName = "ir.LSI";
        DataPreprecess dataProcess = new DataPreprecess();
        dataProcess.arrangeData();
        TextDataset textDataset = new TextDataset(dataProcess.getClassProcessedPath(),dataProcess.getUcPreProcessedPath());
        IR ir = new IR();
        ir.compute(textDataset,irModelName);

        long endTime = System.currentTimeMillis();
        System.out.println("time cost:" + (endTime - startTime) * 1.0 / 1000 / 60);
    }
}
