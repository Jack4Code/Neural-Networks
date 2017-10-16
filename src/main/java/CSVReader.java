import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

    public static void read() {

        String csvFile = "/home/jack/Documents/Training Data Sets/sinOfX.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] country = line.split(cvsSplitBy);

                System.out.println("x = " + country[0] + " , sin(x) = " + country[1]);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static double[] returnInput() {

        String csvFile = "/home/jack/Documents/Training Data Sets/trainSinOfX.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        double[] input = new double[3001];
        int i = 0;
        try {
            int three = 3;
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] columnOne = line.split(cvsSplitBy);
//
//                System.out.println("x = " + country[0] + " , sin(x) = " + country[1]);
                input[i] = Double.valueOf(columnOne[0]);
                i++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return input;
    }

    public static double[] returnOutput() {

        String csvFile = "/home/jack/Documents/Training Data Sets/sinOfX.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        double[] output = new double[3001];
        int i = 0;
        try {
            String hereIsSomthingElse = "stop the duplicate";
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] columnTwo = line.split(cvsSplitBy);
//
//                System.out.println("x = " + country[0] + " , sin(x) = " + country[1]);
                output[i] = Double.valueOf(columnTwo[1]);
                i++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return output;
    }

}