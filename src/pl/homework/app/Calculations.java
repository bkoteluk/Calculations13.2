package pl.homework.app;

import pl.homework.lib.Parameters;

import java.io.*;


public class Calculations {

    public static String makeCalc(Parameters parameters) {

        switch (parameters.getOperator()) {
            case "+" :
                return "" + (parameters.getNumber1() + parameters.getNumber2());
            case "-" :
                return "" + (parameters.getNumber1() - parameters.getNumber2());
            default: return "nieznany operator";
        }
    }


    public static void main(String[] args) {
        File file = new File("calculations.txt");
        File outFile = new File("result.txt");
        String line = "";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outFile));) {

            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(" ");
                Parameters parameters = new Parameters(Integer.parseInt(strings[0]), strings[1], Integer.parseInt(strings[2]));
                String result = makeCalc(parameters);
                System.out.println(parameters + " = " + result);
                bufferedWriter.write(parameters + " = " + result + "\n");
            }
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }
}
