package practice5.Problem2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        String inputFilePath = "C:\\Users\\saken\\IdeaProjects\\OOP_2026\\src\\practice5\\Problem2\\input.txt";
        String reportFilePath = "C:\\Users\\saken\\IdeaProjects\\OOP_2026\\src\\practice5\\Problem2\\report.txt";
        Map<String,Integer> counter = new  HashMap<String, Integer>();

        try {
            BufferedReader bfr = new BufferedReader(new InputStreamReader(new FileInputStream(inputFilePath),StandardCharsets.UTF_8));
            String line = bfr.readLine();
            while (line != null){
                List<String> words = List.of(line.split("\\s+"));
                for(String word : words){
                    word = word.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
                    if (!word.isEmpty()) {
                        if (counter.containsKey(word)) {
                            int count = counter.get(word);
                            counter.put(word, count+1);
                        } else {
                            counter.put(word, 1);
                        }
                    }
                }
                line = bfr.readLine();
            }
            bfr.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not Found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("File is read");
        }

        List<Map.Entry<String,Integer>> list = new ArrayList<>(counter.entrySet());

        list.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });


        try {
            PrintWriter pw = new PrintWriter(new FileWriter(reportFilePath));
            for(Map.Entry<String,Integer> mp: list){
                pw.write(mp.getKey() + ":" +mp.getValue() + "\n");
            }
            pw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("Data is loaded to report file");
        }
    }
}
