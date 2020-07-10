package com.lody.virtual.client;

import com.lody.virtual.helper.utils.VLog;


/**
 * Dynamic Instrumentation of Apps
 */
public class FridaGadget {

    private static final String TAG = FridaGadget.class.getSimpleName();

    static {
        try {
            /*
                Loads the frida gadget library in each of the guest apps.
                The name of the library can be any arbitrary name. You can
                rename this and the corresponding .so file in
                VirtualApp/app/libs/<arch>/*.so
             */
            System.loadLibrary("gadget");
        } catch (Throwable e) {
            VLog.e(TAG, VLog.getStackTraceString(e));
        }
    }

    public static void init(){
        VLog.d(TAG, "Init Frida Gadget");
    }
}
