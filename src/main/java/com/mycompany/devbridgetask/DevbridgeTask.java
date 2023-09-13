/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.devbridgetask;

/**
 *
 * @author Gurar
 */
public class DevbridgeTask {
    
    public static void printBonusDatesBetween(int fromYear, int toYear) {
        if (fromYear > toYear) {
            System.out.println("fromYear must be less than or equal to toYear");
            return;
        }
        int maxDay = 31;
        for (int year = fromYear; year <= toYear; year++) {
            for (int month = 1; month <= 12; month++) {
                if ( month == 4 || month == 6 || month == 9 || month == 11 ) {
                    maxDay = 30;
                } else if ( month == 2 ) {
                    maxDay = 28;
                }
                for (int day = 1; day <= maxDay; day++) {
                    
                    String monthStr = (month < 10 ? "0" + Integer.toString(month) : Integer.toString(month));
                    String dayStr = (day < 10 ? "0" + Integer.toString(day) : Integer.toString(day));
                    
                    String date = Integer.toString(year) + monthStr + dayStr;
                    
                    StringBuilder newStr = new StringBuilder();
                    newStr.append(date);
                    newStr.reverse();
                    
                    String reversedDate = newStr.toString();
                    
                    if (date.equals(reversedDate)) {
                        System.out.println(year + "-" + monthStr + "-" + dayStr); 
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        printBonusDatesBetween(2010, 2023);
    }
}
