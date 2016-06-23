/* $$ This file has been instrumented by Clover 4.0.6#20150918095238309 $$ */package com.example.sample.rest.services;

import com.codahale.metrics.MetricRegistry;
import com.example.sample.rest.MetricsReporter;

import java.util.concurrent.TimeUnit;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Defines Sample Rest API.
 *
 * curl http://localhost:4080/ping
 */

@Path("/")
public class SampleResource {public static class __CLR4_0_61818ipsp1zlc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0076\u0069\u0073\u0068\u0079\u006f\u006f\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u002f\u0067\u0069\u0074\u002f\u0065\u0078\u0061\u006d\u0070\u006c\u0065\u002d\u006a\u0061\u0076\u0061\u0063\u006f\u0064\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1466709648129L,8589935092L,53,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final String CLICHED_MESSAGE = "Pong!";

    private com.codahale.metrics.Meter pingGet;

    private com.codahale.metrics.Timer pingResponseTimer;

    public SampleResource() {try{__CLR4_0_61818ipsp1zlc.R.inc(44);
        __CLR4_0_61818ipsp1zlc.R.inc(45);this.pingGet = MetricsReporter.getInstance().meter(MetricRegistry.name(SampleResource.class, "ping_get"));
        __CLR4_0_61818ipsp1zlc.R.inc(46);this.pingResponseTimer =
            MetricsReporter.getInstance().timer(MetricRegistry.name(SampleResource.class, "pig_get_time"));
    }finally{__CLR4_0_61818ipsp1zlc.R.flushNeeded();}}

    @GET
    @Path("/ping")
    @Produces("text/plain")
    public String getPing() {try{__CLR4_0_61818ipsp1zlc.R.inc(47);
        __CLR4_0_61818ipsp1zlc.R.inc(48);long st = System.currentTimeMillis();
        __CLR4_0_61818ipsp1zlc.R.inc(49);pingGet.mark();
        __CLR4_0_61818ipsp1zlc.R.inc(50);long et = System.currentTimeMillis();
        __CLR4_0_61818ipsp1zlc.R.inc(51);pingResponseTimer.update(et - st, TimeUnit.MILLISECONDS);
        __CLR4_0_61818ipsp1zlc.R.inc(52);return CLICHED_MESSAGE;
    }finally{__CLR4_0_61818ipsp1zlc.R.flushNeeded();}}
}
