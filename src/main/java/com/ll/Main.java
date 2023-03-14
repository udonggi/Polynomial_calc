package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        System.out.println(Calc.run("10 + 5 * 2"));

    }
}

//class Polynomial {
//    String numbers;
//    Polynomial(String numbers){
//        this.numbers = numbers;
//    }
//
//    public int calc(){
//        int result = 0;
//        numbers = numbers.replaceAll(" ", "");
//
//        for(int i = 0 ; i < numbers.length(); i ++){
//            if(Character.isDigit(numbers.charAt(i))){
//                if(Character.isDigit(numbers.charAt(i+1))){
//                    int a = numbers.charAt(i) - '0';
//                    int b = numbers.charAt(i+1) - '0';
//                    result = 10 * a + b;
//                }
//                else{
//                    result = numbers.charAt(i) - '0';
//                }
//            }
//            else{
//                result += numbers.charAt(i+1) - '0';
//                break;
//            }
//        }
//        return result;
//    }
//}