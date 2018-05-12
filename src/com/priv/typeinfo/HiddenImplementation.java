package com.priv.typeinfo;

import com.priv.typeinfo.interfacea.A;
import com.priv.typeinfo.packageaccess.HiddenC;

import java.lang.reflect.Method;

public class HiddenImplementation {
    public static void main(String[] args) throws Exception {
        A a = HiddenC.makeA();
        a.f();
        System.out.println(a.getClass().getSimpleName());
        // Complie error: cannot find symbol 'C':
        /* if (a instanceof C) {
            C c = (C)a;
            c.g();
        } */
        // Oops! Reflection still allow us to call g():
        callHiddenMethod(a, "g");
        // And even methods that are less accessible!
        callHiddenMethod(a, "u");
        callHiddenMethod(a, "v");
        callHiddenMethod(a, "w");
    }

    static void callHiddenMethod(Object a, String methodName) throws Exception {
        Method g = a.getClass().getDeclaredMethod(methodName);
        g.setAccessible(true);
        g.invoke(a);
    }
}
