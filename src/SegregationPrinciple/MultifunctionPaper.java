package SegregationPrinciple;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class MultifunctionPaper implements IMultifunctional {
    @Override
    public void print() {
        System.out.println("Printing a Document");
    }

    @Override
    public void scan() {
        System.out.println("Scanning a Document");
    }

    @Override
    public void phone() {
        throw new NotImplementedException();
        //System.out.println("Working as a Phone");
    }

    @Override
    public void fax() {
        throw new NotImplementedException();
        //System.out.println("Faxing a document");
    }
}
