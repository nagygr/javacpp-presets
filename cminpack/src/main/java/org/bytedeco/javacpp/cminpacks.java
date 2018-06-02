// Targeted by JavaCPP version 1.4.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.openblas.*;

public class cminpacks extends org.bytedeco.javacpp.presets.cminpacks {
    static { Loader.load(); }

// Parsed from cminpack.h

/* Header file for cminpack, by Frederic Devernay.
   The documentation for all functions can be found in the file
   minpack-documentation.txt from the distribution, or in the source
   code of each function. */

// #ifndef __CMINPACK_H__
// #define __CMINPACK_H__

/* The default floating-point type is "double" for C/C++ and "float" for CUDA,
   but you can change this by defining one of the following symbols when
   compiling the library, and before including cminpack.h when using it:
   __cminpack_long_double__ for long double (requires compiler support)
   __cminpack_double__ for double
   __cminpack_float__ for float
   __cminpack_half__ for half from the OpenEXR library (in this case, you must
                     compile cminpack with a C++ compiler)
*/
// #ifdef __cminpack_long_double__
// #endif

// #ifdef __cminpack_double__
// #endif

// #ifdef __cminpack_float__
// #define __cminpack_real__ float
// #endif

// #ifdef __cminpack_half__
// #endif

// #ifdef __cplusplus
// #endif /* __cplusplus */

//  #define CMINPACK_EXPORT

// #if defined(__CUDA_ARCH__) || defined(__CUDACC__)
// #else
// #define __cminpack_attr__
// #ifndef __cminpack_real__
// #endif
// #define __cminpack_type_fcn_nn__        typedef int (*cminpack_func_nn)
// #define __cminpack_type_fcnder_nn__     typedef int (*cminpack_funcder_nn)
// #define __cminpack_type_fcn_mn__        typedef int (*cminpack_func_mn)
// #define __cminpack_type_fcnder_mn__     typedef int (*cminpack_funcder_mn)
// #define __cminpack_type_fcnderstr_mn__  typedef int (*cminpack_funcderstr_mn)
// #define __cminpack_decl_fcn_nn__        cminpack_func_nn fcn_nn,
// #define __cminpack_decl_fcnder_nn__     cminpack_funcder_nn fcnder_nn,
// #define __cminpack_decl_fcn_mn__        cminpack_func_mn fcn_mn,
// #define __cminpack_decl_fcnder_mn__     cminpack_funcder_mn fcnder_mn,
// #define __cminpack_decl_fcnderstr_mn__  cminpack_funcderstr_mn fcnderstr_mn,
// #define __cminpack_param_fcn_nn__       fcn_nn,
// #define __cminpack_param_fcnder_nn__    fcnder_nn,
// #define __cminpack_param_fcn_mn__       fcn_mn,
// #define __cminpack_param_fcnder_mn__    fcnder_mn,
// #define __cminpack_param_fcnderstr_mn__ fcnderstr_mn,
// #endif

// #ifdef __cminpack_double__
// #endif

// #ifdef __cminpack_long_double__
// #endif

// #ifdef __cminpack_float__
// #define __cminpack_func__(func) s ## func
// #endif

// #ifdef __cminpack_half__
// #endif

/* Declarations for minpack */

/* Function types: */
/* The first argument can be used to store extra function parameters, thus */
/* avoiding the use of global variables. */
/* the iflag parameter is input-only (with respect to the FORTRAN */
/*  version), the output iflag value is the return value of the function. */
/* If iflag=0, the function shoulkd just print the current values (see */
/* the nprint parameters below). */
  
/* for hybrd1 and hybrd: */
/*         calculate the functions at x and */
/*         return this vector in fvec. */
/* return a negative value to terminate hybrd1/hybrd */
public static class cminpack_func_nn extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    cminpack_func_nn(Pointer p) { super(p); }
    protected cminpack_func_nn() { allocate(); }
    private native void allocate();
    public native int call(Pointer p, int n, @Const FloatPointer x, FloatPointer fvec, int iflag );
}

/* for hybrj1 and hybrj */
/*         if iflag = 1 calculate the functions at x and */
/*         return this vector in fvec. do not alter fjac. */
/*         if iflag = 2 calculate the jacobian at x and */
/*         return this matrix in fjac. do not alter fvec. */
/* return a negative value to terminate hybrj1/hybrj */
public static class cminpack_funcder_nn extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    cminpack_funcder_nn(Pointer p) { super(p); }
    protected cminpack_funcder_nn() { allocate(); }
    private native void allocate();
    public native int call(Pointer p, int n, @Const FloatPointer x, FloatPointer fvec, FloatPointer fjac,
                                  int ldfjac, int iflag );
}

/* for lmdif1 and lmdif */
/*         calculate the functions at x and */
/*         return this vector in fvec. */
/*         if iflag = 1 the result is used to compute the residuals. */
/*         if iflag = 2 the result is used to compute the Jacobian by finite differences. */
/*         Jacobian computation requires exactly n function calls with iflag = 2. */
/* return a negative value to terminate lmdif1/lmdif */
public static class cminpack_func_mn extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    cminpack_func_mn(Pointer p) { super(p); }
    protected cminpack_func_mn() { allocate(); }
    private native void allocate();
    public native int call(Pointer p, int m, int n, @Const FloatPointer x, FloatPointer fvec,
                               int iflag );
}

/* for lmder1 and lmder */
/*         if iflag = 1 calculate the functions at x and */
/*         return this vector in fvec. do not alter fjac. */
/*         if iflag = 2 calculate the jacobian at x and */
/*         return this matrix in fjac. do not alter fvec. */
/* return a negative value to terminate lmder1/lmder */
public static class cminpack_funcder_mn extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    cminpack_funcder_mn(Pointer p) { super(p); }
    protected cminpack_funcder_mn() { allocate(); }
    private native void allocate();
    public native int call(Pointer p, int m, int n, @Const FloatPointer x, FloatPointer fvec,
                                  FloatPointer fjac, int ldfjac, int iflag );
}

/* for lmstr1 and lmstr */
/*         if iflag = 1 calculate the functions at x and */
/*         return this vector in fvec. */
/*         if iflag = i calculate the (i-1)-st row of the */
/*         jacobian at x and return this vector in fjrow. */
/* return a negative value to terminate lmstr1/lmstr */
public static class cminpack_funcderstr_mn extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    cminpack_funcderstr_mn(Pointer p) { super(p); }
    protected cminpack_funcderstr_mn() { allocate(); }
    private native void allocate();
    public native int call(Pointer p, int m, int n, @Const FloatPointer x, FloatPointer fvec,
                                     FloatPointer fjrow, int iflag );
}






/* MINPACK functions: */
/* the info parameter was removed from most functions: the return */
/* value of the function is used instead. */
/* The argument 'p' can be used to store extra function parameters, thus */
/* avoiding the use of global variables. You can also think of it as a */
/* 'this' pointer a la C++. */

/* find a zero of a system of N nonlinear functions in N variables by
   a modification of the Powell hybrid method (Jacobian calculated by
   a forward-difference approximation) */
public static native int shybrd1( cminpack_func_nn fcn_nn, 
	       Pointer p, int n, FloatPointer x, FloatPointer fvec, float tol,
	       FloatPointer wa, int lwa );
public static native int shybrd1( cminpack_func_nn fcn_nn, 
	       Pointer p, int n, FloatBuffer x, FloatBuffer fvec, float tol,
	       FloatBuffer wa, int lwa );
public static native int shybrd1( cminpack_func_nn fcn_nn, 
	       Pointer p, int n, float[] x, float[] fvec, float tol,
	       float[] wa, int lwa );

/* find a zero of a system of N nonlinear functions in N variables by
   a modification of the Powell hybrid method (Jacobian calculated by
   a forward-difference approximation, more general). */
public static native int shybrd( cminpack_func_nn fcn_nn,
	      Pointer p, int n, FloatPointer x, FloatPointer fvec, float xtol, int maxfev,
	      int ml, int mu, float epsfcn, FloatPointer diag, int mode,
	      float factor, int nprint, IntPointer nfev,
	      FloatPointer fjac, int ldfjac, FloatPointer r, int lr, FloatPointer qtf,
	      FloatPointer wa1, FloatPointer wa2, FloatPointer wa3, FloatPointer wa4);
public static native int shybrd( cminpack_func_nn fcn_nn,
	      Pointer p, int n, FloatBuffer x, FloatBuffer fvec, float xtol, int maxfev,
	      int ml, int mu, float epsfcn, FloatBuffer diag, int mode,
	      float factor, int nprint, IntBuffer nfev,
	      FloatBuffer fjac, int ldfjac, FloatBuffer r, int lr, FloatBuffer qtf,
	      FloatBuffer wa1, FloatBuffer wa2, FloatBuffer wa3, FloatBuffer wa4);
public static native int shybrd( cminpack_func_nn fcn_nn,
	      Pointer p, int n, float[] x, float[] fvec, float xtol, int maxfev,
	      int ml, int mu, float epsfcn, float[] diag, int mode,
	      float factor, int nprint, int[] nfev,
	      float[] fjac, int ldfjac, float[] r, int lr, float[] qtf,
	      float[] wa1, float[] wa2, float[] wa3, float[] wa4);
  
/* find a zero of a system of N nonlinear functions in N variables by
   a modification of the Powell hybrid method (user-supplied Jacobian) */
public static native int shybrj1( cminpack_funcder_nn fcnder_nn, Pointer p, int n, FloatPointer x,
	       FloatPointer fvec, FloatPointer fjac, int ldfjac, float tol,
	       FloatPointer wa, int lwa );
public static native int shybrj1( cminpack_funcder_nn fcnder_nn, Pointer p, int n, FloatBuffer x,
	       FloatBuffer fvec, FloatBuffer fjac, int ldfjac, float tol,
	       FloatBuffer wa, int lwa );
public static native int shybrj1( cminpack_funcder_nn fcnder_nn, Pointer p, int n, float[] x,
	       float[] fvec, float[] fjac, int ldfjac, float tol,
	       float[] wa, int lwa );
          
/* find a zero of a system of N nonlinear functions in N variables by
   a modification of the Powell hybrid method (user-supplied Jacobian,
   more general) */
public static native int shybrj( cminpack_funcder_nn fcnder_nn, Pointer p, int n, FloatPointer x,
	      FloatPointer fvec, FloatPointer fjac, int ldfjac, float xtol,
	      int maxfev, FloatPointer diag, int mode, float factor,
	      int nprint, IntPointer nfev, IntPointer njev, FloatPointer r,
	      int lr, FloatPointer qtf, FloatPointer wa1, FloatPointer wa2,
	      FloatPointer wa3, FloatPointer wa4 );
public static native int shybrj( cminpack_funcder_nn fcnder_nn, Pointer p, int n, FloatBuffer x,
	      FloatBuffer fvec, FloatBuffer fjac, int ldfjac, float xtol,
	      int maxfev, FloatBuffer diag, int mode, float factor,
	      int nprint, IntBuffer nfev, IntBuffer njev, FloatBuffer r,
	      int lr, FloatBuffer qtf, FloatBuffer wa1, FloatBuffer wa2,
	      FloatBuffer wa3, FloatBuffer wa4 );
public static native int shybrj( cminpack_funcder_nn fcnder_nn, Pointer p, int n, float[] x,
	      float[] fvec, float[] fjac, int ldfjac, float xtol,
	      int maxfev, float[] diag, int mode, float factor,
	      int nprint, int[] nfev, int[] njev, float[] r,
	      int lr, float[] qtf, float[] wa1, float[] wa2,
	      float[] wa3, float[] wa4 );

/* minimize the sum of the squares of nonlinear functions in N
   variables by a modification of the Levenberg-Marquardt algorithm
   (Jacobian calculated by a forward-difference approximation) */
public static native int slmdif1( cminpack_func_mn fcn_mn,
	       Pointer p, int m, int n, FloatPointer x, FloatPointer fvec, float tol,
	       IntPointer iwa, FloatPointer wa, int lwa );
public static native int slmdif1( cminpack_func_mn fcn_mn,
	       Pointer p, int m, int n, FloatBuffer x, FloatBuffer fvec, float tol,
	       IntBuffer iwa, FloatBuffer wa, int lwa );
public static native int slmdif1( cminpack_func_mn fcn_mn,
	       Pointer p, int m, int n, float[] x, float[] fvec, float tol,
	       int[] iwa, float[] wa, int lwa );

/* minimize the sum of the squares of nonlinear functions in N
   variables by a modification of the Levenberg-Marquardt algorithm
   (Jacobian calculated by a forward-difference approximation, more
   general) */
public static native int slmdif( cminpack_func_mn fcn_mn,
	      Pointer p, int m, int n, FloatPointer x, FloatPointer fvec, float ftol,
	      float xtol, float gtol, int maxfev, float epsfcn,
	      FloatPointer diag, int mode, float factor, int nprint,
	      IntPointer nfev, FloatPointer fjac, int ldfjac, IntPointer ipvt,
	      FloatPointer qtf, FloatPointer wa1, FloatPointer wa2, FloatPointer wa3,
	      FloatPointer wa4 );
public static native int slmdif( cminpack_func_mn fcn_mn,
	      Pointer p, int m, int n, FloatBuffer x, FloatBuffer fvec, float ftol,
	      float xtol, float gtol, int maxfev, float epsfcn,
	      FloatBuffer diag, int mode, float factor, int nprint,
	      IntBuffer nfev, FloatBuffer fjac, int ldfjac, IntBuffer ipvt,
	      FloatBuffer qtf, FloatBuffer wa1, FloatBuffer wa2, FloatBuffer wa3,
	      FloatBuffer wa4 );
public static native int slmdif( cminpack_func_mn fcn_mn,
	      Pointer p, int m, int n, float[] x, float[] fvec, float ftol,
	      float xtol, float gtol, int maxfev, float epsfcn,
	      float[] diag, int mode, float factor, int nprint,
	      int[] nfev, float[] fjac, int ldfjac, int[] ipvt,
	      float[] qtf, float[] wa1, float[] wa2, float[] wa3,
	      float[] wa4 );

/* minimize the sum of the squares of nonlinear functions in N
   variables by a modification of the Levenberg-Marquardt algorithm
   (user-supplied Jacobian) */
public static native int slmder1( cminpack_funcder_mn fcnder_mn,
	       Pointer p, int m, int n, FloatPointer x, FloatPointer fvec, FloatPointer fjac,
	       int ldfjac, float tol, IntPointer ipvt,
	       FloatPointer wa, int lwa );
public static native int slmder1( cminpack_funcder_mn fcnder_mn,
	       Pointer p, int m, int n, FloatBuffer x, FloatBuffer fvec, FloatBuffer fjac,
	       int ldfjac, float tol, IntBuffer ipvt,
	       FloatBuffer wa, int lwa );
public static native int slmder1( cminpack_funcder_mn fcnder_mn,
	       Pointer p, int m, int n, float[] x, float[] fvec, float[] fjac,
	       int ldfjac, float tol, int[] ipvt,
	       float[] wa, int lwa );

/* minimize the sum of the squares of nonlinear functions in N
   variables by a modification of the Levenberg-Marquardt algorithm
   (user-supplied Jacobian, more general) */
public static native int slmder( cminpack_funcder_mn fcnder_mn,
	      Pointer p, int m, int n, FloatPointer x, FloatPointer fvec, FloatPointer fjac,
	      int ldfjac, float ftol, float xtol, float gtol,
	      int maxfev, FloatPointer diag, int mode, float factor,
	      int nprint, IntPointer nfev, IntPointer njev, IntPointer ipvt,
	      FloatPointer qtf, FloatPointer wa1, FloatPointer wa2, FloatPointer wa3,
	      FloatPointer wa4 );
public static native int slmder( cminpack_funcder_mn fcnder_mn,
	      Pointer p, int m, int n, FloatBuffer x, FloatBuffer fvec, FloatBuffer fjac,
	      int ldfjac, float ftol, float xtol, float gtol,
	      int maxfev, FloatBuffer diag, int mode, float factor,
	      int nprint, IntBuffer nfev, IntBuffer njev, IntBuffer ipvt,
	      FloatBuffer qtf, FloatBuffer wa1, FloatBuffer wa2, FloatBuffer wa3,
	      FloatBuffer wa4 );
public static native int slmder( cminpack_funcder_mn fcnder_mn,
	      Pointer p, int m, int n, float[] x, float[] fvec, float[] fjac,
	      int ldfjac, float ftol, float xtol, float gtol,
	      int maxfev, float[] diag, int mode, float factor,
	      int nprint, int[] nfev, int[] njev, int[] ipvt,
	      float[] qtf, float[] wa1, float[] wa2, float[] wa3,
	      float[] wa4 );

/* minimize the sum of the squares of nonlinear functions in N
   variables by a modification of the Levenberg-Marquardt algorithm
   (user-supplied Jacobian, minimal storage) */
public static native int slmstr1( cminpack_funcderstr_mn fcnderstr_mn, Pointer p, int m, int n,
	       FloatPointer x, FloatPointer fvec, FloatPointer fjac, int ldfjac,
	       float tol, IntPointer ipvt, FloatPointer wa, int lwa );
public static native int slmstr1( cminpack_funcderstr_mn fcnderstr_mn, Pointer p, int m, int n,
	       FloatBuffer x, FloatBuffer fvec, FloatBuffer fjac, int ldfjac,
	       float tol, IntBuffer ipvt, FloatBuffer wa, int lwa );
public static native int slmstr1( cminpack_funcderstr_mn fcnderstr_mn, Pointer p, int m, int n,
	       float[] x, float[] fvec, float[] fjac, int ldfjac,
	       float tol, int[] ipvt, float[] wa, int lwa );

/* minimize the sum of the squares of nonlinear functions in N
   variables by a modification of the Levenberg-Marquardt algorithm
   (user-supplied Jacobian, minimal storage, more general) */
public static native int slmstr(  cminpack_funcderstr_mn fcnderstr_mn, Pointer p, int m,
	      int n, FloatPointer x, FloatPointer fvec, FloatPointer fjac,
	      int ldfjac, float ftol, float xtol, float gtol,
	      int maxfev, FloatPointer diag, int mode, float factor,
	      int nprint, IntPointer nfev, IntPointer njev, IntPointer ipvt,
	      FloatPointer qtf, FloatPointer wa1, FloatPointer wa2, FloatPointer wa3,
	      FloatPointer wa4 );
public static native int slmstr(  cminpack_funcderstr_mn fcnderstr_mn, Pointer p, int m,
	      int n, FloatBuffer x, FloatBuffer fvec, FloatBuffer fjac,
	      int ldfjac, float ftol, float xtol, float gtol,
	      int maxfev, FloatBuffer diag, int mode, float factor,
	      int nprint, IntBuffer nfev, IntBuffer njev, IntBuffer ipvt,
	      FloatBuffer qtf, FloatBuffer wa1, FloatBuffer wa2, FloatBuffer wa3,
	      FloatBuffer wa4 );
public static native int slmstr(  cminpack_funcderstr_mn fcnderstr_mn, Pointer p, int m,
	      int n, float[] x, float[] fvec, float[] fjac,
	      int ldfjac, float ftol, float xtol, float gtol,
	      int maxfev, float[] diag, int mode, float factor,
	      int nprint, int[] nfev, int[] njev, int[] ipvt,
	      float[] qtf, float[] wa1, float[] wa2, float[] wa3,
	      float[] wa4 );
 
public static native void schkder( int m, int n, @Const FloatPointer x, FloatPointer fvec, FloatPointer fjac,
	       int ldfjac, FloatPointer xp, FloatPointer fvecp, int mode,
	       FloatPointer err  );
public static native void schkder( int m, int n, @Const FloatBuffer x, FloatBuffer fvec, FloatBuffer fjac,
	       int ldfjac, FloatBuffer xp, FloatBuffer fvecp, int mode,
	       FloatBuffer err  );
public static native void schkder( int m, int n, @Const float[] x, float[] fvec, float[] fjac,
	       int ldfjac, float[] xp, float[] fvecp, int mode,
	       float[] err  );

public static native float sdpmpar( int i );

public static native float senorm( int n, @Const FloatPointer x );
public static native float senorm( int n, @Const FloatBuffer x );
public static native float senorm( int n, @Const float[] x );

/* compute a forward-difference approximation to the m by n jacobian
   matrix associated with a specified problem of m functions in n
   variables. */
public static native int sfdjac2(cminpack_func_mn fcn_mn,
	     Pointer p, int m, int n, FloatPointer x, @Const FloatPointer fvec, FloatPointer fjac,
	     int ldfjac, float epsfcn, FloatPointer wa);
public static native int sfdjac2(cminpack_func_mn fcn_mn,
	     Pointer p, int m, int n, FloatBuffer x, @Const FloatBuffer fvec, FloatBuffer fjac,
	     int ldfjac, float epsfcn, FloatBuffer wa);
public static native int sfdjac2(cminpack_func_mn fcn_mn,
	     Pointer p, int m, int n, float[] x, @Const float[] fvec, float[] fjac,
	     int ldfjac, float epsfcn, float[] wa);

/* compute a forward-difference approximation to the n by n jacobian
   matrix associated with a specified problem of n functions in n
   variables. if the jacobian has a banded form, then function
   evaluations are saved by only approximating the nonzero terms. */
public static native int sfdjac1(cminpack_func_nn fcn_nn,
	     Pointer p, int n, FloatPointer x, @Const FloatPointer fvec, FloatPointer fjac, int ldfjac,
	     int ml, int mu, float epsfcn, FloatPointer wa1,
	     FloatPointer wa2);
public static native int sfdjac1(cminpack_func_nn fcn_nn,
	     Pointer p, int n, FloatBuffer x, @Const FloatBuffer fvec, FloatBuffer fjac, int ldfjac,
	     int ml, int mu, float epsfcn, FloatBuffer wa1,
	     FloatBuffer wa2);
public static native int sfdjac1(cminpack_func_nn fcn_nn,
	     Pointer p, int n, float[] x, @Const float[] fvec, float[] fjac, int ldfjac,
	     int ml, int mu, float epsfcn, float[] wa1,
	     float[] wa2);

/* compute inverse(JtJ) after a run of lmdif or lmder. The covariance matrix is obtained
   by scaling the result by enorm(y)**2/(m-n). If JtJ is singular and k = rank(J), the
   pseudo-inverse is computed, and the result has to be scaled by enorm(y)**2/(m-k). */
public static native void scovar(int n, FloatPointer r, int ldr, 
           @Const IntPointer ipvt, float tol, FloatPointer wa);
public static native void scovar(int n, FloatBuffer r, int ldr, 
           @Const IntBuffer ipvt, float tol, FloatBuffer wa);
public static native void scovar(int n, float[] r, int ldr, 
           @Const int[] ipvt, float tol, float[] wa);

/* covar1 estimates the variance-covariance matrix:
   C = sigma**2 (JtJ)**+
   where (JtJ)**+ is the inverse of JtJ or the pseudo-inverse of JtJ (in case J does not have full rank),
   and sigma**2 = fsumsq / (m - k)
   where fsumsq is the residual sum of squares and k is the rank of J.
   The function returns 0 if J has full rank, else the rank of J.
*/
public static native int scovar1(int m, int n, float fsumsq, FloatPointer r, int ldr, 
                           @Const IntPointer ipvt, float tol, FloatPointer wa);
public static native int scovar1(int m, int n, float fsumsq, FloatBuffer r, int ldr, 
                           @Const IntBuffer ipvt, float tol, FloatBuffer wa);
public static native int scovar1(int m, int n, float fsumsq, float[] r, int ldr, 
                           @Const int[] ipvt, float tol, float[] wa);

/* internal MINPACK subroutines */
public static native void sdogleg(int n, @Const FloatPointer r, int lr, 
             @Const FloatPointer diag, @Const FloatPointer qtb, float delta, FloatPointer x, 
             FloatPointer wa1, FloatPointer wa2);
public static native void sdogleg(int n, @Const FloatBuffer r, int lr, 
             @Const FloatBuffer diag, @Const FloatBuffer qtb, float delta, FloatBuffer x, 
             FloatBuffer wa1, FloatBuffer wa2);
public static native void sdogleg(int n, @Const float[] r, int lr, 
             @Const float[] diag, @Const float[] qtb, float delta, float[] x, 
             float[] wa1, float[] wa2);
public static native void sqrfac(int m, int n, FloatPointer a, int lda, int pivot, IntPointer ipvt, int lipvt, FloatPointer rdiag,
            FloatPointer acnorm, FloatPointer wa);
public static native void sqrfac(int m, int n, FloatBuffer a, int lda, int pivot, IntBuffer ipvt, int lipvt, FloatBuffer rdiag,
            FloatBuffer acnorm, FloatBuffer wa);
public static native void sqrfac(int m, int n, float[] a, int lda, int pivot, int[] ipvt, int lipvt, float[] rdiag,
            float[] acnorm, float[] wa);
public static native void sqrsolv(int n, FloatPointer r, int ldr, 
             @Const IntPointer ipvt, @Const FloatPointer diag, @Const FloatPointer qtb, FloatPointer x, 
             FloatPointer sdiag, FloatPointer wa);
public static native void sqrsolv(int n, FloatBuffer r, int ldr, 
             @Const IntBuffer ipvt, @Const FloatBuffer diag, @Const FloatBuffer qtb, FloatBuffer x, 
             FloatBuffer sdiag, FloatBuffer wa);
public static native void sqrsolv(int n, float[] r, int ldr, 
             @Const int[] ipvt, @Const float[] diag, @Const float[] qtb, float[] x, 
             float[] sdiag, float[] wa);
public static native void sqform(int m, int n, FloatPointer q, int ldq, FloatPointer wa);
public static native void sqform(int m, int n, FloatBuffer q, int ldq, FloatBuffer wa);
public static native void sqform(int m, int n, float[] q, int ldq, float[] wa);
public static native void sr1updt(int m, int n, FloatPointer s, int ls, @Const FloatPointer u, FloatPointer v, FloatPointer w, IntPointer sing);
public static native void sr1updt(int m, int n, FloatBuffer s, int ls, @Const FloatBuffer u, FloatBuffer v, FloatBuffer w, IntBuffer sing);
public static native void sr1updt(int m, int n, float[] s, int ls, @Const float[] u, float[] v, float[] w, int[] sing);
public static native void sr1mpyq(int m, int n, FloatPointer a, int lda, @Const FloatPointer v, @Const FloatPointer w);
public static native void sr1mpyq(int m, int n, FloatBuffer a, int lda, @Const FloatBuffer v, @Const FloatBuffer w);
public static native void sr1mpyq(int m, int n, float[] a, int lda, @Const float[] v, @Const float[] w);
public static native void slmpar(int n, FloatPointer r, int ldr, 
            @Const IntPointer ipvt, @Const FloatPointer diag, @Const FloatPointer qtb, float delta, 
            FloatPointer par, FloatPointer x, FloatPointer sdiag, FloatPointer wa1, 
            FloatPointer wa2);
public static native void slmpar(int n, FloatBuffer r, int ldr, 
            @Const IntBuffer ipvt, @Const FloatBuffer diag, @Const FloatBuffer qtb, float delta, 
            FloatBuffer par, FloatBuffer x, FloatBuffer sdiag, FloatBuffer wa1, 
            FloatBuffer wa2);
public static native void slmpar(int n, float[] r, int ldr, 
            @Const int[] ipvt, @Const float[] diag, @Const float[] qtb, float delta, 
            float[] par, float[] x, float[] sdiag, float[] wa1, 
            float[] wa2);
public static native void srwupdt(int n, FloatPointer r, int ldr, 
             @Const FloatPointer w, FloatPointer b, FloatPointer alpha, FloatPointer cos, 
             FloatPointer sin);
public static native void srwupdt(int n, FloatBuffer r, int ldr, 
             @Const FloatBuffer w, FloatBuffer b, FloatBuffer alpha, FloatBuffer cos, 
             FloatBuffer sin);
public static native void srwupdt(int n, float[] r, int ldr, 
             @Const float[] w, float[] b, float[] alpha, float[] cos, 
             float[] sin);
// #ifdef __cplusplus
// #endif /* __cplusplus */


// #endif /* __CMINPACK_H__ */


}
