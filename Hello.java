import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

public class Hello {
    public static void main(String[] args) {
        // System.out.println(test("leetcodeishiring", 4));
        // System.out.println(reverse(-2147483648));

        // System.out.println(myAtoi("20000000000000000000"));
        // System.out.println(isPalindrome(101));

        String s = "+3";
        String regex = "^([+|-]?[0-9]+){1}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);

        System.out.println(matcher.matches());
        String a = matcher.group();

        System.out.println(a);


    }

    public static boolean isPalindrome(int x) {
        if (x<0) {
            return false;
        }   
        int c = x;
        int b = 0;
        while (true) {
            int a = c%10;
            b = b * 10 +a;
            c = c/10;
            if(c == 0) {
                break;
            }
        }
        
        if (b == x) {
            return true;
        } else {
            return false;
        }
        
    }

    public static int myAtoi(String str) {
        if (str.equals("")) {
            return 0;
        }
        String num = "";
        str = str.trim();
        for (int i = 0; i < str.length(); i++) {
            if (i == 0) {
                if (isNeed(str.charAt(i))) {
                    num += str.charAt(i);
                } else {
                    return 0;
                }
            } else {
                if (isNum(str.charAt(i))) {
                    num += str.charAt(i);
                } else {
                    break;
                }
            }
        }
        System.out.println(num);
        try {
            BigInteger i = new BigInteger(num);
            if (i.compareTo(new BigInteger(String.valueOf(Integer.MAX_VALUE)))>=0) {
                return Integer.MAX_VALUE;
            } else if (i.compareTo(new BigInteger(String.valueOf(Integer.MIN_VALUE)))<=0) {
                return Integer.MIN_VALUE;
            }
            return i.intValue();
        } catch (Exception e) {
            return 0;
        }
    }

    public static boolean isNeed(char c) {
        if (c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9'
                || c == '0' || c == '-' || c == '+') {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isNum(char c) {
        if (c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9'
                || c == '0') {
            return true;
        } else {
            return false;
        }
    }

    // public static String test(String s, int numRows) {
    // String[] strings = new String[numRows];
    // for (int i= 0;i < numRows; i++) {
    // strings[i] = "";
    // }
    // int index = 0;
    // boolean isUp = false;

    // for (int i = 0; i < s.length(); i++) {
    // char nowChar = s.charAt(i);
    // strings[index] += nowChar;
    // if (isUp) {
    // index--;
    // } else {
    // index++;
    // }
    // if (index == (numRows - 1) || index == 0) {
    // isUp = !isUp;
    // }
    // }
    // String all = "";
    // for (int i = 0; i < numRows; i++) {
    // all += strings[i];
    // }
    // return all;
    // }

    // public static int reverse(int x) {
    // if(x == 0) {
    // return 0;
    // }

    // if(x <10 && x>-10) {
    // return x;
    // }
    // boolean isDa0 = x>0;
    // if (!isDa0) {
    // x = -x;
    // }

    // long xx = x;

    // try {
    // List<Long> list = new ArrayList<>();

    // while(true) {
    // long number = xx%10;
    // list.add(number);
    // xx = xx/10;
    // if(xx<10) {
    // for (int i=0;i< list.size(); i++) {
    // xx=xx+list.get(i)*pow(list.size()-i);
    // }
    // if(xx>Integer.MAX_VALUE||xx<Integer.MIN_VALUE){
    // x=0;
    // } else {
    // x = (int)xx;
    // }
    // break;
    // }
    // }
    // if (!isDa0) {
    // return -x;
    // }
    // return x;
    // } catch (Exception e){

    // }
    // return 0;
    // }

    // public static long pow(long num) {
    // long it=1;
    // for(int i=0;i<num;i++){
    // it = it*10;
    // }
    // return it;
    // }
}