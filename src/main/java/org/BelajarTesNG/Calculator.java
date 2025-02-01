package org.BelajarTesNG;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Calculator {
    private static final DecimalFormat decfor = new DecimalFormat("0.00");

    public static int add(int a, int b){
        return a+b;
    }

    public static int subtract(int a, int b){
        return a-b;
    }

    public static int multiplication(int a, int b){
        return a*b;
    }

    public static int Modulo(int a, int b){
        return a%b;
    }

    public static double divided(double a, double b){
        double result = a/b;
        decfor.format(result);
        decfor.setRoundingMode(RoundingMode.HALF_EVEN);
        return result;
    }

    public static double bmi(double tinggi_meter, double berat_kg){
        double result = berat_kg/(tinggi_meter * tinggi_meter);
        decfor.format(result);
        decfor.setRoundingMode(RoundingMode.HALF_EVEN);
        return result;
    }
}
