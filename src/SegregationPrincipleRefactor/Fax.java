package SegregationPrincipleRefactor;

public class Fax implements IMultifunctionalComm {
    @Override
    public void phone() {
        System.out.println("Doing a Call");
    }

    @Override
    public void fax() {
        System.out.println("Faxing a document");
    }
}
