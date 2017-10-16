/**
 * Created by jack on 10/15/17.
 */
public class Main {
    public static void main(String[] args) {
//        Double[] input = CSVReader.returnInput();
//        for(int i=0; i<input.length; i++){
//            System.out.println(input[i]);
//        }

        CSVReader.read();
        NeuralNetworkLearner.learn();

    }
}
