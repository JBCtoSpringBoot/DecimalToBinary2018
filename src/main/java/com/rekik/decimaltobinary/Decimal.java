package com.rekik.decimaltobinary;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Decimal {

    @NotNull
    @Min(value = 0)
    private int decimal;


    public int getDecimal() {
        return decimal;
    }

    public void setDecimal(int decimal) {
        this.decimal=decimal;
    }
}
