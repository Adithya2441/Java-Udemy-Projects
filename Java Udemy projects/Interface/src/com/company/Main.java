package com.company;

public class Main {

    public static void main(String[] args) {
        ITelephone timsPhone;
        timsPhone = new DeskPhone(123456789);
        timsPhone.powerOn();
        timsPhone.callPhone(123456789);
        timsPhone.answer();

        timsPhone = new MobilePhone(23455689);
        timsPhone.callPhone(2331234);
        timsPhone.answer();
    }
}
