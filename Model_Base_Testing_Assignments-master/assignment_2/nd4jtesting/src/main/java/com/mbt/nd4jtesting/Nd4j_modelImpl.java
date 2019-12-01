package com.mbt.nd4jtesting;

import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.graphwalker.core.condition.*;
import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.Edge;
import org.graphwalker.java.annotation.GraphWalker;
import org.graphwalker.core.condition.EdgeCoverage;
import org.graphwalker.core.generator.RandomPath;
import org.graphwalker.core.generator.WeightedRandomPath;
import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.Vertex;
import org.graphwalker.java.test.TestBuilder;
import org.graphwalker.java.test.TestExecutionException;
import org.graphwalker.java.test.TestExecutor;
import org.junit.Test;

import static org.hamcrest.number.OrderingComparison.greaterThan;
import static org.hamcrest.number.OrderingComparison.greaterThanOrEqualTo;
import static org.junit.Assert.*;
import static org.junit.Assume.assumeThat;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.runner.RunWith;


import static org.junit.Assert.*;

import org.graphwalker.core.condition.TimeDuration;
import org.graphwalker.core.generator.AStarPath;
import org.junit.runner.RunWith;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.MessageFormat;
import java.util.concurrent.TimeUnit;

@GraphWalker(value = "random(edge_coverage(100))", start = "e_start")
@RunWith(JUnitQuickcheck.class)
public class Nd4j_modelImpl extends ExecutionContext implements nd4j_model {
    public final static Path MODEL_PATH = Paths.get("com/mbt/nd4jtesting/nd4j_model.graphml");
    private Adapter nd4jtestingAdapter;
    private int nRows = 4;
    private int nColumns = 4;
    private INDArray zeromatrix = Nd4j.zeros(nRows, nColumns);
    private INDArray dummytranspose = Nd4j.ones(1, nColumns);  // stores column
    private INDArray testmatrixmodel = Nd4j.zeros(nRows, nColumns);


    private INDArray testtransposepbt = Nd4j.zeros(nRows, nColumns);
    private INDArray testaddpbt1 = Nd4j.zeros(nRows, nColumns);
    private INDArray testaddpbt2 = Nd4j.zeros(nRows, nColumns);


    @Override
    public void e_start() {
        System.out.println("Running: e_start");
        nd4jtestingAdapter = new Adapter();
    }


    @Override
    public void e_transpose() {
        testmatrixmodel = nd4jtestingAdapter.getTestmatrix();
        dummytranspose = testmatrixmodel.getRow(0);
        nd4jtestingAdapter.transpose();

    }

    @Override
    public void e_sub_itself() {
        nd4jtestingAdapter.subMatrixFromItself();
    }

    @Override
    public void e_add_ones_to_upper_row() {
        nd4jtestingAdapter.addOneToUpperRow();
    }

    @Override
    public void e_sub_ones_left_col() {
        nd4jtestingAdapter.subOneToLeftColumn();
    }

    @Override
    public void e_add_randomnumbers() {
        nd4jtestingAdapter.addRandomNumber();
    }

    @Override
    public void e_sub_ones_from_upper_row() {
        nd4jtestingAdapter.subOneFromUpperRow();
    }

    @Override
    public void e_scalar_div() {
        nd4jtestingAdapter.scalarDiv();
    }

    @Override
    public void e_scalar_mul() {
        nd4jtestingAdapter.scalarMul();
    }


    @Override
    public void e_scalar_add() {
        testaddpbt1 = nd4jtestingAdapter.getTestmatrix();
        nd4jtestingAdapter.scalarAdd();
        testaddpbt2 = nd4jtestingAdapter.getTestmatrix();
    }

    @Override
    public void e_scalar_sub() {
        nd4jtestingAdapter.scalarSub();
    }

    @Override
    public void e_rowvector_add() {
        nd4jtestingAdapter.rowVectorAdd();
    }

    @Override
    public void e_rowvector_sub() {
        nd4jtestingAdapter.rowVectorSub();
    }

    @Override
    public void rowvectoradd_4x4() {
        System.out.println("State: rowvectoradd_4x4");
    }

    @Override
    public void e_colvector_sub() {
        nd4jtestingAdapter.colVectorSub();
    }

    @Override
    public void e_colvector_add() {
        nd4jtestingAdapter.colVectorAdd();
    }


    @Override
    public void colvectoradd_4x4() {
        System.out.println("State: colvectoradd_4x4");
    }


    /*
    @Override
    public void e_vstack() { nd4jtestingAdapter.evstack();}
    @Override
    public void zero_2x2() {System.out.println("State: zero_2x2"); }

    @Override
    public void zeroH_2x4(){System.out.println("State: zeroH_2x4"); }

    @Override
    public void e_hstack() {nd4jtestingAdapter.ehstack(); }

    */

    @Override
    public void inverse_4x4() {
        System.out.println("State: inverse_4x4");
    }

    @Override
    public void e_inverse() {
        nd4jtestingAdapter.inverse();
    }

    @Override
    public void duprandom_4x4() {

        System.out.println("State: duprandom_4x4");
    }

    @Override
    public void e_duplicate() {
        nd4jtestingAdapter.duplicate();
    }

    @Override
    public void scalaradd_4x4() {

        System.out.println("State: scalaradd_4x4");
    }

    @Override
    public void scalarmul_4x4() {
        System.out.println("State: scalarmul_4x4");
    }


    @Override
    public void rowplusone_4x4() {
        System.out.println("State: rowplusone_4x4");
    }

    @Override
    public void randomT_4x4() {
        System.out.println("State: randomT_4x4");
    }

    @Override
    public void zero_4x4() {
        System.out.println("State: zero_4x4");
        assertEquals("testmatrix is supposed to be the zeromatrix in state zero_4x4, but it's not!!", zeromatrix, nd4jtestingAdapter.getTestmatrix());
        //assertEquals("we are different!!", 0,1);
    }

    @Override
    public void random_4x4() {
        System.out.println("State: random_4x4");
    }

    @Override
    public void rowplusoneT_4x4() {
        System.out.println("State: rowplusoneT_4x4");
        testtransposepbt = nd4jtestingAdapter.getTestmatrix();
        assertEquals("transpose failure!", dummytranspose, nd4jtestingAdapter.getTestmatrix().getColumn(0));
    }

    @Override
    public void e_sub_100() {
        nd4jtestingAdapter.subHundred();
    }

    @Override
    public void e_add_one() {
        nd4jtestingAdapter.addOne();
    }

    @Override
    public void incrementto100_4x4() {
        System.out.println("State: incrementto100_4x4");
    }

    @Test
    public void functionalTest() {
        TestExecutor testExecutor = new TestExecutor(getClass());
        try {
            testExecutor.execute(false);
        } catch (TestExecutionException e) {
            System.err.println(e.getStackTrace());
        }
    }

    @Test
    public void smokeTest() {
        new TestBuilder()
                .setModel(MODEL_PATH)
                .setContext(new Nd4j_modelImpl())
                .setPathGenerator(new AStarPath(new ReachedVertex("incrementto100_4x4")))
                .setStart("e_start")
                .execute();
    }

    @Test
    public void stabilityTest() {
        new TestBuilder()
                .setModel(MODEL_PATH)
                .setContext(new Nd4j_modelImpl())
                .setPathGenerator(new RandomPath(new TimeDuration(30, TimeUnit.SECONDS)))
                .setStart("e_start")
                .execute();
    }

    @Test
    public void weightedRandEdgeCovTest() {
        new TestBuilder()
                .setModel(MODEL_PATH)
                .setContext(new Nd4j_modelImpl())
                .setPathGenerator(new WeightedRandomPath(new EdgeCoverage(100)))
                .setStart("e_start")
                .execute();
    }

    @Test
    public void weightedRandVertexCovTest() {
        new TestBuilder()
                .setModel(MODEL_PATH)
                .setContext(new Nd4j_modelImpl())
                .setPathGenerator(new WeightedRandomPath(new VertexCoverage(100)))
                .setStart("e_start")
                .execute();
    }

    @Test
    public void RandEdgeCovTest() {
        new TestBuilder()
                .setModel(MODEL_PATH)
                .setContext(new Nd4j_modelImpl())
                .setPathGenerator(new RandomPath(new EdgeCoverage(100)))
                .setStart("e_start")
                .execute();
    }

    @Test
    public void RandVertexCovTest() {
        new TestBuilder()
                .setModel(MODEL_PATH)
                .setContext(new Nd4j_modelImpl())
                .setPathGenerator(new RandomPath(new VertexCoverage(100)))
                .setStart("e_start")
                .execute();
    }

    /*Property Based Testing*/


    @Property //1
    public void testbeforetranspose() {
        try {
            assertEquals(4, testmatrixmodel.columns());
            assertEquals(4, testmatrixmodel.rows());
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }

    @Property //2
    public void testaftertranspose() {
        try {
            assertEquals(4, testtransposepbt.columns());
            assertEquals(4, testtransposepbt.rows());
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }

    @Property  //3
    public void testcomparetranspose() {
        try {
            assertEquals(testmatrixmodel.rows(), testtransposepbt.columns());
            assertEquals(testmatrixmodel.columns(), testtransposepbt.rows());
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }

    @Property //4
    public void testelementstranspose() {
        try {
            for (int i = 0; i < nRows; i++) {
                assertEquals(testmatrixmodel.getRow(i), testtransposepbt.getColumn(i));
            }
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }

    @Property   //5
    public void testindividualelementstranspose() {
        try {
            for (int i = 0; i < nRows; i++) {
                for (int j = 0; j < nColumns; j++) {
                    assertEquals(testmatrixmodel.getScalar(i, j), testtransposepbt.getScalar(j, i));
                }
            }
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }

    @Property(trials = 2)  //6
    public void testscalaradd_individualele() {
        try {
            for (int i = 0; i < nRows; i++) {
                for (int j = 0; j < nColumns; j++) {
                    assertThat("due to mutation, elements fail to be greater after addition",
                            testaddpbt2.getInt(i,j), greaterThanOrEqualTo(testaddpbt1.getInt(i,j)));
                }}
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }

@Property(trials = 2)  //7
public void testscalaradd_totalsum() {
    try {
        Double beforeadd = (Double) testaddpbt1.sumNumber();
        Double afteradd = (Double) testaddpbt2.sumNumber();
        assertThat("due to mutation, the total sum of elements fails to be greater after addition",
                afteradd, greaterThanOrEqualTo(beforeadd));

    } catch (Exception e) {
        e.printStackTrace(System.err);
    }
}



}
