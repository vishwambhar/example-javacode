/* $$ This file has been instrumented by Clover 4.0.6#20150918095238309 $$ */package com.example.sample.rest;


import com.example.sample.rest.services.SampleResource;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class RestApplication extends Application {public static class __CLR4_0_633ipsoh1d0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0076\u0069\u0073\u0068\u0079\u006f\u006f\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u002f\u0067\u0069\u0074\u002f\u0065\u0078\u0061\u006d\u0070\u006c\u0065\u002d\u006a\u0061\u0076\u0061\u0063\u006f\u0064\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1466708670680L,8589935092L,9,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Set<Object> singletons;

    public RestApplication() throws IOException {try{__CLR4_0_633ipsoh1d0.R.inc(3);
        __CLR4_0_633ipsoh1d0.R.inc(4);Set<Object> singletons = new HashSet<>();
        __CLR4_0_633ipsoh1d0.R.inc(5);singletons.add(new SampleResource());
        __CLR4_0_633ipsoh1d0.R.inc(6);this.singletons = Collections.unmodifiableSet(singletons);
    }finally{__CLR4_0_633ipsoh1d0.R.flushNeeded();}}

    @Override
    public Set<Object> getSingletons() {try{__CLR4_0_633ipsoh1d0.R.inc(7);
        __CLR4_0_633ipsoh1d0.R.inc(8);return singletons;
    }finally{__CLR4_0_633ipsoh1d0.R.flushNeeded();}}
}