// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Name("arrow::TemporalScalar<arrow::Date32Type>") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class BaseBaseDate32Scalar extends Scalar {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BaseBaseDate32Scalar(Pointer p) { super(p); }


  public BaseBaseDate32Scalar(@Cast("arrow::TemporalScalar<arrow::Date32Type>::ValueType") int value, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type) { super((Pointer)null); allocate(value, type); }
  private native void allocate(@Cast("arrow::TemporalScalar<arrow::Date32Type>::ValueType") int value, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type);
}