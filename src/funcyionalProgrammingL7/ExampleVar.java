package funcyionalProgrammingL7;

import java.io.*;
import java.util.Map;

public class ExampleVar {
    //  var field;

    public static void main(String[] args) throws IOException {
        System.out.println(new ExampleVar().test(5));
    }
    public String test(int val) throws IOException{
        var example = "Hello World!";
      //  example = val;
       // example = 5;
       // example = null;

        try (var inputStream = new FileInputStream("test.txt")) {

        }
        return example;
    }

    // Пример 1
    public static String func() throws IOException{
        StringBuilder output = new StringBuilder();
        try(InputStream inputStream = new BufferedInputStream(new FileInputStream("test.txt"))) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            String line = reader.readLine();
            while (line != null) {
                output.append(line);
                line = reader.readLine();
            }
            return output.toString();
        }
    }

    // Пример 1
    public static String funcVar() throws IOException{
        var output = new StringBuilder();
        try(var inputStream = new BufferedInputStream(new FileInputStream("test.txt"))) {
            var reader = new BufferedReader(new InputStreamReader(inputStream));

            var line = reader.readLine();
            while (line != null) {
                output.append(line);
                line = reader.readLine();
            }
            return output.toString();
        }
    }

    //Пример 2
    public boolean find(Map<? extends String, ? extends Integer> mapA, Map<? extends String, ? extends Integer> mapB, int value) {
        String keyA = null;
        for (Map.Entry<? extends String, ? extends Integer> entry : mapA.entrySet()) {
            if (entry.getValue() == value){
                keyA = entry.getKey();
                break;
            }
        }
        if (keyA == null){
            return false;
        }

        String keyB = null;
        int stepCount = 0;
        for (Map.Entry<? extends String, ? extends Integer> entry : mapB.entrySet()) {
            if (entry.getValue() == value){
                keyB = entry.getKey();
                stepCount++;
                break;
            }
        }
        System.out.println(stepCount);
        return keyA.equals(keyB);
    }

    //Пример 2
    public boolean findVar(Map<? extends String, ? extends Integer> mapA, Map<? extends String, ? extends Integer> mapB, int value) {
        String keyA = null;
        for (var entry : mapA.entrySet()) {
            if (entry.getValue() == value){
                keyA = entry.getKey();
                break;
            }
        }
        if (keyA == null){
            return false;
        }

        String keyB = null;
        int stepCount = 0;
        for (var entry : mapB.entrySet()) {
            if (entry.getValue() == value){
                keyB = entry.getKey();
                stepCount++;
                break;
            }
        }
        System.out.println(stepCount);
        return keyA.equals(keyB);
    }

    //пример 3 - плохой пример использования
    public void funcNotGood(){
        var val = getSomething();
        System.out.println(val);
    }

    private String getSomething(){
        return "Hello World!";
    }
}
