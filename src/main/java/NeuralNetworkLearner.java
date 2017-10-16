import org.neuroph.core.NeuralNetwork;
import org.neuroph.core.data.DataSet;
import org.neuroph.core.data.DataSetRow;
import org.neuroph.nnet.Perceptron;

/**
 * Created by jack on 10/15/17.
 */
public class NeuralNetworkLearner {

    public static void learn(){
        //create the number of inputs and the number of outputs...i think
        NeuralNetwork neuralNetwork = new Perceptron(1,1);

        //create the training set
        DataSet trainingSet = new DataSet(1,1);

        //add training data to the training set
        //trainingSet.addRow(new DataSetRow(CSVReader.returnInput(), CSVReader.returnOutput()));
        double[] input = CSVReader.returnInput();
        double[] output = CSVReader.returnOutput();
        for(int i=0; i<10; i++){
            //System.out.println(input[i] + " --- " + output[i]);
            trainingSet.addRow(new DataSetRow(new double[]{input[i]}, new double[]{output[i]}));
        }

        // learn the training set
        neuralNetwork.learn(trainingSet);

        // set network input
        //neuralNetwork.setInput(1, 1);
//        double[] inputVec = new double[10];
//        for(int i=10; i<21; i++){
//            //System.out.println(input[i] + " --- " + output[i]);
//            inputVec[i] = input[i];
//
//        }
        neuralNetwork.setInput(59);
        // calculate network
        neuralNetwork.calculate();
        // get network output
        double[] networkOutput = neuralNetwork.getOutput();
        System.out.println("and for the results: ");
        for(int i=0; i<networkOutput.length; i++){
            System.out.println(networkOutput[i]);
        }


    }
}
