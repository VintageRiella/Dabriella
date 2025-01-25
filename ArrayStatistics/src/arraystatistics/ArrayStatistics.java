/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraystatistics;

/**
 *
 * @author USER
 */
import java.util.Arrays;

public class ArrayStatistics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        double[] data = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}; // Example data

        // Calculate mean
        double sum = 0;
        for (double num : data) {
            sum += num;
        }
        double mean = sum / data.length;
        System.out.println("Mean: " + mean);

        // Calculate median
        Arrays.sort(data);
        double median;
        if (data.length % 2 == 0) {
            median = (data[data.length / 2 - 1] + data[data.length / 2]) / 2.0;
        } else {
            median = data[data.length / 2];
        }
        System.out.println("Median: " + median);

        // Calculate standard deviation
        double varianceSum = 0;
        for (double num : data) {
            varianceSum += Math.pow(num - mean, 2);
        }
        double standardDeviation = Math.sqrt(varianceSum / data.length);
        System.out.println("Standard Deviation: " + standardDeviation);
    }
}

    
    

