package SegregationPrinciple;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Main {
    public static void main(String[] args) {

        Fax fax = new Fax();
        System.out.println("--- Fax ---");
        fax.phone();
        fax.fax();
        fax.print();
        fax.scan();

        MultifunctionPaper multifunctionPaper = new MultifunctionPaper();
        System.out.println("--- MultifunctionalPaper ---");
        try {
            multifunctionPaper.phone();
        } catch (NotImplementedException nie){
            System.out.println("phone: " + nie.toString());
        }
        try {
            multifunctionPaper.fax();
        } catch (NotImplementedException nie){
            System.out.println("fax: " + nie.toString());
        }
        multifunctionPaper.print();
        multifunctionPaper.scan();

        MultifunctionalAdvance multifunctionalAdvance = new MultifunctionalAdvance();
        System.out.println("--- MultifunctionalAdvance ---");
        multifunctionalAdvance.phone();
        multifunctionalAdvance.fax();
        multifunctionalAdvance.print();
        multifunctionalAdvance.scan();

    }
}
