package practice5.Problem4;

import java.io.*;
import java.util.Random;

public class SensorTest {
    public static String filePath = "C:\\Users\\saken\\IdeaProjects\\OOP_2026\\src\\practice5\\Problem4\\sensor.bin";
    public static void main(String[] args) {
        Random rnd = new Random();
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath) );
            for (int i = 0; i < 60; i++){
                double bin = 15.0 + (35.0-15.0)*rnd.nextDouble();
                dos.writeDouble(bin);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            RandomAccessFile raf = new RandomAccessFile(filePath,"rw");
            int seekElement = 29 * 8;
            raf.seek(seekElement);
            raf.writeDouble(999.9);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            DataInputStream dis = new DataInputStream(new FileInputStream(filePath));
            double max = 0;
            double sum = 0;
            for(int i = 0; i < 60;i++){
                double current = dis.readDouble();
                sum += current;
                if(current > max) max = current;
            }
            System.out.println("Max: " + max);
            System.out.println("AVG: " + (sum/60));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
