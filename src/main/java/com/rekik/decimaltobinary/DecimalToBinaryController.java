package com.rekik.decimaltobinary;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Collections;

@Controller
public class DecimalToBinaryController {


    @RequestMapping("/")
    public String addNewDecimal(Model model)
    {
        model.addAttribute("aDecimal", new Decimal());
        return "decimalinput";
    }

    @PostMapping("/savedecimal")
    public String saveDecimal(@Valid @ModelAttribute("aDecimal") Decimal decimal, BindingResult result, Model model)

    {

        if(result.hasErrors()){
            return "decimalinput";
        }


      /*  int[] binary = new int[10];
        int[] kbinary = new int[10];
        int digit =0 ;
        int i = 0;
        while (decimal.getDecimal()!=0){

            digit=decimal.getDecimal() % 2;

            kbinary[i]=digit;

            decimal.setDecimal(decimal.getDecimal()/2);
            i++;
        }

        int k = 0;
        for (int j = i - 1; j >= 0; j--){
            binary[k] = kbinary[j];
            k++;

        }*/


        ArrayList<Integer> binary = new ArrayList<>();

        int digit =0 ;
        int i = 0;

        if(decimal.getDecimal()==0) {
                binary.add(0);
        }


            while (decimal.getDecimal() != 0) {

                digit=decimal.getDecimal() % 2;

                binary.add(i, digit);

                decimal.setDecimal(decimal.getDecimal() / 2);
                i++;
            }



       Collections.reverse(binary);

        model.addAttribute("binary", binary);

        return "binaryoutput";
    }


}
