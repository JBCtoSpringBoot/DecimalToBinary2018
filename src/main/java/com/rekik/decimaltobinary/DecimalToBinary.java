package com.rekik.decimaltobinary;

/*A java console app as a test*/
public class DecimalToBinary {

    public static void main(String[] args) {

        int[] binary = new int[10];
        int[] kbinary = new int[10];
        int decimal = 240;
        int digit =0 ;
        int i = 0;
        while (decimal!=0){

            digit=decimal % 2;

            binary[i]=digit;

            decimal= decimal/2;
            i++;
        }

      /*  // printing binary array in reverse order
        for (int j = i - 1; j >= 0; j--){
            System.out.print(binary[j]);
    }
*/

        int k = 0;
        for (int j = i - 1; j >= 0; j--){
            kbinary[k] = binary[j];
            k++;
        }

        for(int j=0; j<k;j++){
            System.out.print(kbinary[j]);
        }

    }
}
