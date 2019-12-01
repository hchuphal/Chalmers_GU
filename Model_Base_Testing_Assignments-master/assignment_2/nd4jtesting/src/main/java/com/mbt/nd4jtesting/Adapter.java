package com.mbt.nd4jtesting;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;
import org.nd4j.linalg.inverse.InvertMatrix;

public class Adapter {
    private int nRowsinitial = 2;
    private int nColumnsinitial = 2;
    private int nRows = 4;
    private int nColumns = 4;
    public INDArray testmatrixinitial = Nd4j.zeros(nRowsinitial, nColumnsinitial);
   // private INDArray testmatrix = Nd4j.zeros(nRows, nColumns);
    private INDArray random = Nd4j.rand(nRows,nColumns);
    private int num = 2;
   // private int testnum;
    private INDArray testrowmatrix = Nd4j.ones(1,nColumns);
    private INDArray testcolmatrix = Nd4j.ones(nRows, 1);

    private INDArray testmatrixmid = Nd4j.hstack(testmatrixinitial,testmatrixinitial);
    private INDArray testmatrix = Nd4j.vstack(testmatrixmid,testmatrixmid);







    public void addRandomNumber(){ testmatrix = testmatrix.add(random); }

    public void addOneToUpperRow(){ testmatrix.putRow(0, testmatrix.getRow(0).add(1)); }

    public void subOneFromUpperRow() { testmatrix.putColumn(0, testmatrix.getRow(0).sub(1));}

    public void transpose(){ testmatrix = testmatrix.transpose();

    }

    public void subOneToLeftColumn(){ testmatrix.putColumn(0, testmatrix.getColumn(0).sub(1)); }

    public void subMatrixFromItself(){ testmatrix = testmatrix.sub(testmatrix); }


    public void scalarDiv() {testmatrix = testmatrix.div(num);}

    public void scalarMul() {testmatrix = testmatrix.mul(num); }

    public void scalarAdd() {testmatrix = testmatrix.add(num); }

    public void scalarSub() {testmatrix = testmatrix.sub(num); }
    public void rowVectorAdd() {testmatrix = testmatrix.addRowVector(testrowmatrix); }

    public void rowVectorSub() {testmatrix = testmatrix.subRowVector(testrowmatrix); }

    public void colVectorSub() {testmatrix = testmatrix.subColumnVector(testcolmatrix); }

    public void colVectorAdd() {testmatrix = testmatrix.addColumnVector(testcolmatrix); }



    public void inverse() {testmatrix = InvertMatrix.invert(testmatrix,false);  }

    public void duplicate() {testmatrix = testmatrix.dup(); }

    public void addOne() { testmatrix = testmatrix.add(1); /*System.out.println(testmatrix);*/}

    public void subHundred() { testmatrix = testmatrix.sub(100); }



    public INDArray getTestmatrix() { return testmatrix; }




}
