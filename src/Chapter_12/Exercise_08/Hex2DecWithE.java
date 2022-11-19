package Chapter_12.Exercise_08;

import java.util.Scanner;

public class Hex2DecWithE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a hex number like string ");
        String hex = input.nextLine();

        try {
            System.out.println("The demical value of " + hex + " is " + hexToDemical(hex.toUpperCase()));
        } catch (HexFormatExeption ex) {
            System.out.println(ex.getMessage());
        }
    }


    public static int hexToDemical(String hex) throws HexFormatExeption {
        int demical = 0;
        for (int i = 0; i < hex.length(); i++) {
            if (!(hex.charAt(i) >= '0' && hex.charAt(i) <= '9') || !(hex.charAt(i) >= 'A' && hex.charAt(i) <= 'Z'))
                throw new HexFormatExeption(hex);
            demical = demical * 16 + hexCharToDecimal(hex.charAt(i));
        }
        return demical;
    }
    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else // ch is '0', '1', ..., or '9'
            return ch - '0';
    }



    }

