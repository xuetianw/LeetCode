package IBM;

public class Leetcode12 {

    class Solution {
        public String intToRoman(int num) {
            StringBuilder result = new StringBuilder();
            if (num >= 1000) {
                int dividor = num / 1000;
                int divident = num % 1000;
                for (int i = 0; i< dividor; i++) {
                    result.append("M");
                }
                num %= 1000;
            }
            //num is less than 1000
            if (num >= 900) {
                result.append("CM");
                num -= 900;
            }
            // num is less than 900
            if (num >= 500){
                int dividor = num / 500;
                int divident = num % 500;
                for (int i = 0; i< dividor; i++) {
                    result.append("D");
                }
                num = divident;
            }
            if (num >= 400) {
                result.append("CD");
                num -= 400;
            }
            if (num >= 100) {
                int dividor = num / 100;
                int divident = num % 100;
                for (int i = 0; i< dividor; i++) {
                    result.append("C");
                }
                num %= 100;
            }

            if (num >= 90) {
                result.append("XC");
                num -= 90;
            }

            if (num >= 50) {
                result.append("L");
                num -= 50;
            }
            if (num >= 40) {
                result.append("XL");
                num -= 40;
            }

            if (num >= 10) {
                int dividor = num / 10;
                int divident = num % 10;
                for (int i = 0; i< dividor; i++) {
                    result.append("X");
                }
                num %= 10;
            }
            if (num == 9) {
                result.append("IX");
                num -= 9;
            }
            if (num >= 5) {
                result.append("V");
                num -= 5;
            }
            if (num >= 4) {
                result.append("IV");
                num -= 4;
            }

            if (num >= 1) {
                for (int i = 0; i < num; i++) {
                    result.append("I");
                }
            }
            return result.toString();
        }
    }
}
