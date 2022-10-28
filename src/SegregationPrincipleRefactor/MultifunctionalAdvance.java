package SegregationPrincipleRefactor;

public class MultifunctionalAdvance implements IMultifunctionalComm, IMultifunctionalPaper {
    @Override
    public void phone() {
        System.out.println("Doing a Call");
    }

    @Override
    public void fax() {
        System.out.println("Faxing a document");
    }

    @Override
    public void print() {
        System.out.println("Printing a Document");
    }

    @Override
    public void scan() {
        System.out.println("Scaning a Document");
    }
}
