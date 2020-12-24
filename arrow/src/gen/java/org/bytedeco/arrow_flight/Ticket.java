// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_flight;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.arrow_flight.*;


/** \brief Data structure providing an opaque identifier or credential to use
 *  when requesting a data stream with the DoGet RPC */
@Namespace("arrow::flight") @Properties(inherit = org.bytedeco.arrow.presets.arrow_flight.class)
public class Ticket extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Ticket() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Ticket(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Ticket(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Ticket position(long position) {
        return (Ticket)super.position(position);
    }
    @Override public Ticket getPointer(long i) {
        return new Ticket(this).position(position + i);
    }

  public native @StdString String ticket(); public native Ticket ticket(String setter);

  public native @Cast("bool") boolean Equals(@Const @ByRef Ticket other);

  
  

  /** \brief Get the wire-format representation of this type.
   * 
   *  Useful when interoperating with non-Flight systems (e.g. REST
   *  services) that may want to return Flight types. */
  
  ///
  public native @ByVal Status SerializeToString(@StdString @Cast({"char*", "std::string*"}) BytePointer out);

  /** \brief Parse the wire-format representation of this type.
   * 
   *  Useful when interoperating with non-Flight systems (e.g. REST
   *  services) that may want to return Flight types. */
  public static native @ByVal Status Deserialize(@StdString String serialized, Ticket out);
  public static native @ByVal Status Deserialize(@StdString BytePointer serialized, Ticket out);
}