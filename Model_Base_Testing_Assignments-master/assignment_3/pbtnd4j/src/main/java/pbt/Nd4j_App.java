package pbt;

import com.pholser.junit.quickcheck.When;
import com.pholser.junit.quickcheck.generator.*;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import com.sun.org.apache.xpath.internal.operations.Equals;
import org.junit.Test;
import static org.hamcrest.number.OrderingComparison.*;
import static org.hamcrest.number.OrderingComparison.greaterThanOrEqualTo;
import static org.junit.Assert.*;
import static org.junit.Assume.assumeThat;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.api.ops.impl.transforms.custom.EqualTo;
import org.nd4j.linalg.api.ops.impl.transforms.custom.GreaterThan;
import org.nd4j.linalg.api.ops.impl.transforms.custom.GreaterThanOrEqual;
import org.nd4j.linalg.api.ops.impl.transforms.custom.LessThanOrEqual;
import org.nd4j.linalg.factory.Nd4j;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.MessageFormat;
import java.util.concurrent.TimeUnit;

@RunWith(JUnitQuickcheck.class)
public class Nd4j_App {
 //@Property public void testaftertranspose(@InRange(min = "0", max = "50") int nRows, @InRange(min = "0", max = "50") int nColumns) { //fails, could be interesting


    //1
    @Property
    public void testtranspose_shape(@InRange(min = "2", max = "50") int nRows, @InRange(min = "2", max = "50") int nColumns) {

        INDArray testmatrixx = Nd4j.rand(nRows, nColumns);
        assertEquals(testmatrixx.rows(), testmatrixx.transpose().columns());
        assertEquals(testmatrixx.columns(), testmatrixx.transpose().rows());
    }

    //2
    @Property
    public void testscalaradd(@When(satisfies = "#_ >= 0") double scalarNum,
                              @InRange(min = "1", max = "50") int nRows,
                              @InRange(min = "1", max = "50") int nColumns) {
        INDArray testmatrixx = Nd4j.ones(nRows, nColumns);
        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < nColumns; j++) {
                assertThat(testmatrixx.add(scalarNum).getDouble(i, j), greaterThanOrEqualTo((testmatrixx.getDouble(i, j))));
            }
        }
    }

    //3
    @Property
    public void testscalaradd_neg(@When(satisfies = "#_ < 0") int scalarNum,
                                  @InRange(min = "1", max = "50") int nRows,
                                  @InRange(min = "1", max = "50") int nColumns) {
        INDArray testmatrixx = Nd4j.ones(nRows, nColumns);
        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < nColumns; j++) {
                assertThat(testmatrixx.add(scalarNum).getDouble(i, j), lessThanOrEqualTo((testmatrixx.getDouble(i, j))));
            }
        }
    }
    //4

    @Property
    public void testtranspose_element(@InRange(min = "2", max = "50") int nRows,
                                      @InRange(min = "2", max = "50") int nColumns) {
        INDArray testmatrixx = Nd4j.rand(nRows, nColumns);
        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < nColumns; j++) {
                Double beforetranspose = (Double) testmatrixx.getDouble(i, j);
                Double aftertranspose = (Double) testmatrixx.transpose().getDouble(j, i);
                assertEquals(aftertranspose, (beforetranspose));
            }
        }
    }

    //5
    @Property
    public void testscalaraddsum(@When(satisfies = "#_ >= 0") double scalarNum,
                                 @InRange(min = "1", max = "50") int nRows,
                                 @InRange(min = "1", max = "50") int nColumns) {
        INDArray testmatrixx = Nd4j.ones(nRows, nColumns);
        Double beforeadd = (Double) testmatrixx.sumNumber();
        Double afteradd = (Double) testmatrixx.add(scalarNum).sumNumber();
        assertThat(afteradd, greaterThanOrEqualTo(beforeadd));
    }


    //6
    @Property
    public void testscalarsub(@When(satisfies = "#_ >= 0") double scalarNum,
                              @InRange(min = "1", max = "50") int nRows,
                              @InRange(min = "1", max = "50") int nColumns) {
        INDArray testmatrixx = Nd4j.ones(nRows, nColumns);
        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < nColumns; j++) {
                assertThat(testmatrixx.sub(scalarNum).getDouble(i, j), lessThanOrEqualTo((testmatrixx.getDouble(i, j))));
            }
        }
    }


    //7
    @Property
    public void testscalarsub_neg(@When(satisfies = "#_ < 0") int scalarNum,
                                  @InRange(min = "1", max = "50") int nRows,
                                  @InRange(min = "1", max = "50") int nColumns) {
        INDArray testmatrixx = Nd4j.ones(nRows, nColumns);
        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < nColumns; j++) {
                assertThat(testmatrixx.sub(scalarNum).getDouble(i, j), greaterThanOrEqualTo((testmatrixx.getDouble(i, j))));
            }
        }
    }


    //8
    @Property
    public void testscalarsubsum(@When(satisfies = "#_ >= 0") double scalarNum,
                                 @InRange(min = "1", max = "50") int nRows,
                                 @InRange(min = "1", max = "50") int nColumns) {
        INDArray testmatrixx = Nd4j.ones(nRows, nColumns);
        Double beforesub = (Double) testmatrixx.sumNumber();
        Double aftersub = (Double) testmatrixx.sub(scalarNum).sumNumber();
        assertThat(aftersub, lessThanOrEqualTo(beforesub));
    }
}