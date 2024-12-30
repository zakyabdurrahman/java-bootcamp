package com.martabak;

public class Hello {
    public static void main(String ar[]) {
        int random = 1;
        String[] cannons = {"Napoelon"};




        String colonel = "Hitler";
        String s1 = "Jawa";
        String s2 = "Jawa";
        //use stringbuilder to concat to save memory

        StringBuffer mutable = new StringBuffer("Phiraka");
        mutable.replace(0, mutable.length(), "Phirako");
        Printer printer = new Printer();
        Printer printer2 = new Printer();
        s1 = " Adalah Kunci";
        System.out.println(printer.hashCode());
        System.out.println(printer2.hashCode());




    }
}
