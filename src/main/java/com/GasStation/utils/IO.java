package com.GasStation.utils;
import java.util.Scanner;
public class IO {
    static private final Scanner scan = new Scanner(System.in);
    public static void print(Object obj){
        System.out.println(obj.toString());
    }
    public static String readString(String msg){
        System.out.println(msg);
        return scan.nextLine();
    }
    public static int readInt(String msg){
        while (true){
            try{
                System.out.println(msg);
                return Integer.parseInt(scan.nextLine());
            }catch(Exception e){
                print("Entrada errada. Digite um outro valor!");
            }
        }
    }
    public static float readFloat(String msg){
        while (true){
            try{
                System.out.println(msg);
                return Float.parseFloat(scan.nextLine());
            }catch(Exception e){
                print("Entrada errada. Digite um outro valor!");
            }
        }
    }
    public static double readDouble(String msg){
        while (true){
            try{
                System.out.println(msg);
                return Double.parseDouble(scan.nextLine());
            }catch(Exception e){
                print("Entrada errada. Digite um outro valor!");
            }
        }
    }

}