// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.gandiva;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.gandiva.*;


/** \brief Selection Vector : vector of indices in a row-batch for a selection,
 *  backed by an arrow-array. */
@Namespace("gandiva") @Properties(inherit = org.bytedeco.arrow.presets.gandiva.class)
public class SelectionVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SelectionVector(Pointer p) { super(p); }


  public enum Mode {
    MODE_NONE(0),
    MODE_UINT16(1),
    MODE_UINT32(2),
    MODE_UINT64(3),
    MODE_MAX(MODE_UINT64); // dummy

      public final int value;
      private Mode(int v) { this.value = v; }
      private Mode(Mode e) { this.value = e.value; }
      public Mode intern() { for (Mode e : values()) if (e.value == value) return e; return this; }
      @Override public String toString() { return intern().name(); }
  }
  @MemberGetter public static native int kNumModes();
  public static final int kNumModes = kNumModes();
  @MemberGetter public static native Mode kAllModes(int i);
  @MemberGetter public static native @Cast("gandiva::SelectionVector::Mode*") IntPointer kAllModes();

  /** Get the value at a given index. */
  public native @Cast("uint64_t") long GetIndex(@Cast("int64_t") long index);

  /** Set the value at a given index. */
  public native void SetIndex(@Cast("int64_t") long index, @Cast("uint64_t") long value);

  // Get the max supported value in the selection vector.
  public native @Cast("uint64_t") long GetMaxSupportedValue();

  /** The maximum slots (capacity) of the selection vector. */
  public native @Cast("int64_t") long GetMaxSlots();

  /** The number of slots (size) of the selection vector. */
  public native @Cast("int64_t") long GetNumSlots();

  /** Set the number of slots in the selection vector. */
  public native void SetNumSlots(@Cast("int64_t") long num_slots);

  /** Convert to arrow-array. */
  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::Array>"}) Array ToArray();

  /** Get the underlying arrow buffer. */
  public native @ByRef ArrowBuffer GetBuffer();

  /** Mode of SelectionVector */
  
  ///
  public native Mode GetMode();

  /** \brief populate selection vector for all the set bits in the bitmap.
   * 
   *  @param bitmap [in] the bitmap
   *  @param bitmap_size [in] size of the bitmap in bytes
   *  @param max_bitmap_index [in] max valid index in bitmap (can be lesser than
   *             capacity in the bitmap, due to alignment/padding). */
  
  ///
  public native @ByVal Status PopulateFromBitMap(@Cast("const uint8_t*") BytePointer bitmap, @Cast("int64_t") long bitmap_size,
                              @Cast("int64_t") long max_bitmap_index);
  public native @ByVal Status PopulateFromBitMap(@Cast("const uint8_t*") ByteBuffer bitmap, @Cast("int64_t") long bitmap_size,
                              @Cast("int64_t") long max_bitmap_index);
  public native @ByVal Status PopulateFromBitMap(@Cast("const uint8_t*") byte[] bitmap, @Cast("int64_t") long bitmap_size,
                              @Cast("int64_t") long max_bitmap_index);

  /** \brief make selection vector with int16 type records.
   * 
   *  @param max_slots [in] max number of slots
   *  @param buffer [in] buffer sized to accommodate max_slots
   *  @param selection_vector [out] selection vector backed by 'buffer' */
  public static native @ByVal Status MakeInt16(@Cast("int64_t") long max_slots, @SharedPtr ArrowBuffer buffer,
                            @SharedPtr SelectionVector selection_vector);

  /** @param max_slots [in] max number of slots
   *  @param pool [in] memory pool to allocate buffer
   *  @param selection_vector [out] selection vector backed by a buffer allocated from the
   *               pool. */
  
  ///
  public static native @ByVal Status MakeInt16(@Cast("int64_t") long max_slots, MemoryPool pool,
                            @SharedPtr SelectionVector selection_vector);

  /** \brief creates a selection vector with pre populated buffer.
   * 
   *  @param num_slots [in] size of the selection vector
   *  @param buffer [in] pre-populated buffer
   *  @param selection_vector [out] selection vector backed by 'buffer' */
  
  ///
  public static native @ByVal Status MakeImmutableInt16(@Cast("int64_t") long num_slots,
                                     @SharedPtr ArrowBuffer buffer,
                                     @SharedPtr SelectionVector selection_vector);

  /** \brief make selection vector with int32 type records.
   * 
   *  @param max_slots [in] max number of slots
   *  @param buffer [in] buffer sized to accommodate max_slots
   *  @param selection_vector [out] selection vector backed by 'buffer' */
  
  ///
  public static native @ByVal Status MakeInt32(@Cast("int64_t") long max_slots, @SharedPtr ArrowBuffer buffer,
                            @SharedPtr SelectionVector selection_vector);

  /** \brief make selection vector with int32 type records.
   * 
   *  @param max_slots [in] max number of slots
   *  @param pool [in] memory pool to allocate buffer
   *  @param selection_vector [out] selection vector backed by a buffer allocated from the
   *              pool. */
  
  ///
  public static native @ByVal Status MakeInt32(@Cast("int64_t") long max_slots, MemoryPool pool,
                            @SharedPtr SelectionVector selection_vector);

  /** \brief creates a selection vector with pre populated buffer.
   * 
   *  @param num_slots [in] size of the selection vector
   *  @param buffer [in] pre-populated buffer
   *  @param selection_vector [out] selection vector backed by 'buffer' */
  
  ///
  public static native @ByVal Status MakeImmutableInt32(@Cast("int64_t") long num_slots,
                                     @SharedPtr ArrowBuffer buffer,
                                     @SharedPtr SelectionVector selection_vector);

  /** \brief make selection vector with int64 type records.
   * 
   *  @param max_slots [in] max number of slots
   *  @param buffer [in] buffer sized to accommodate max_slots
   *  @param selection_vector [out] selection vector backed by 'buffer' */
  
  ///
  public static native @ByVal Status MakeInt64(@Cast("int64_t") long max_slots, @SharedPtr ArrowBuffer buffer,
                            @SharedPtr SelectionVector selection_vector);

  /** \brief make selection vector with int64 type records.
   * 
   *  @param max_slots [in] max number of slots
   *  @param pool [in] memory pool to allocate buffer
   *  @param selection_vector [out] selection vector backed by a buffer allocated from the
   *              pool. */
  public static native @ByVal Status MakeInt64(@Cast("int64_t") long max_slots, MemoryPool pool,
                            @SharedPtr SelectionVector selection_vector);
}