// Generated by GraphWalker (http://www.graphwalker.org)
package com.mbt.nd4jtesting;

import org.graphwalker.java.annotation.Model;
import org.graphwalker.java.annotation.Vertex;
import org.graphwalker.java.annotation.Edge;

@Model(file = "com/mbt/nd4jtesting/nd4j_model.graphml")
public interface nd4j_model {

    @Vertex()
    void rowplusone_4x4();

    @Edge()
    void e_colvector_sub();

    @Edge()
    void e_add_ones_to_upper_row();

    @Vertex()
    void randomT_4x4();

    @Edge()
    void e_add_randomnumbers();

    @Edge()
    void e_scalar_div();

    @Edge()
    void e_rowvector_add();

    @Edge()
    void e_sub_itself();

    @Vertex()
    void scalaradd_4x4();

    @Edge()
    void e_scalar_sub();

    @Vertex()
    void random_4x4();

    @Vertex()
    void inverse_4x4();

    @Edge()
    void e_sub_ones_from_upper_row();

    @Edge()
    void e_scalar_mul();

    @Edge()
    void e_transpose();

    @Edge()
    void e_colvector_add();

    @Vertex()
    void duprandom_4x4();

    @Edge()
    void e_duplicate();

    @Edge()
    void e_sub_100();

    @Vertex()
    void zero_4x4();

    @Vertex()
    void rowplusoneT_4x4();

    @Edge()
    void e_rowvector_sub();

    @Edge()
    void e_add_one();

    @Vertex()
    void rowvectoradd_4x4();

    @Edge()
    void e_start();

    @Edge()
    void e_sub_ones_left_col();

    @Vertex()
    void incrementto100_4x4();

    @Edge()
    void e_inverse();

    @Vertex()
    void scalarmul_4x4();

    @Edge()
    void e_scalar_add();

    @Vertex()
    void colvectoradd_4x4();
}