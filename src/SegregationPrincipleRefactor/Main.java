package SegregationPrincipleRefactor;

import SegregationPrinciple.MultifunctionPaper;

public class Main {
    public static void main(String[] args) {
        Fax fax = new Fax();
        System.out.println("--- Fax ---");
        fax.phone();
        fax.fax();

        MultifunctionPaper multifunctionPaper = new MultifunctionPaper();
        System.out.println("--- MultifunctionalPaper ---");
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
