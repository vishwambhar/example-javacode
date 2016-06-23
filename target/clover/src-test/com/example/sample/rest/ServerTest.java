/* $$ This file has been instrumented by Clover 4.0.6#20150918095238309 $$ */package com.example.sample.rest;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.ws.rs.core.Response;

public class ServerTest {static class __CLR4_0_61h1hipsoh1el{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0076\u0069\u0073\u0068\u0079\u006f\u006f\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u002f\u0067\u0069\u0074\u002f\u0065\u0078\u0061\u006d\u0070\u006c\u0065\u002d\u006a\u0061\u0076\u0061\u0063\u006f\u0064\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1466708670809L,8589935092L,69,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Before
    public void setup() throws Exception {try{__CLR4_0_61h1hipsoh1el.R.inc(53);
        __CLR4_0_61h1hipsoh1el.R.inc(54);start();
    }finally{__CLR4_0_61h1hipsoh1el.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_0_61h1hipsoh1el.R.inc(55);
        __CLR4_0_61h1hipsoh1el.R.inc(56);Server.stopServer();
    }finally{__CLR4_0_61h1hipsoh1el.R.flushNeeded();}}

    @Test
    public void testGetPing() throws Exception {__CLR4_0_61h1hipsoh1el.R.globalSliceStart(getClass().getName(),57);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_0_65gnpmr1l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_0_61h1hipsoh1el.R.rethrow($CLV_t2$);}finally{__CLR4_0_61h1hipsoh1el.R.globalSliceEnd(getClass().getName(),"com.example.sample.rest.ServerTest.testGetPing",__CLR4_0_6_TEST_NAME_SNIFFER.getTestName(),57,$CLV_p$,$CLV_t$);}}private void  __CLR4_0_65gnpmr1l() throws Exception{try{__CLR4_0_61h1hipsoh1el.R.inc(57);
        __CLR4_0_61h1hipsoh1el.R.inc(58);ResteasyClient client = new ResteasyClientBuilder().build();
        __CLR4_0_61h1hipsoh1el.R.inc(59);ResteasyWebTarget target = client.target("http://localhost:4080/ping");
        __CLR4_0_61h1hipsoh1el.R.inc(60);Response response = target.request().get();
        __CLR4_0_61h1hipsoh1el.R.inc(61);String result = response.readEntity(String.class);
        __CLR4_0_61h1hipsoh1el.R.inc(62);Assert.assertEquals("Pong!", result);
        __CLR4_0_61h1hipsoh1el.R.inc(63);response.close();
    }finally{__CLR4_0_61h1hipsoh1el.R.flushNeeded();}}

    @Test
    public void testServerStop() throws Exception {__CLR4_0_61h1hipsoh1el.R.globalSliceStart(getClass().getName(),64);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_0_6xa8gou1s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_0_61h1hipsoh1el.R.rethrow($CLV_t2$);}finally{__CLR4_0_61h1hipsoh1el.R.globalSliceEnd(getClass().getName(),"com.example.sample.rest.ServerTest.testServerStop",__CLR4_0_6_TEST_NAME_SNIFFER.getTestName(),64,$CLV_p$,$CLV_t$);}}private void  __CLR4_0_6xa8gou1s() throws Exception{try{__CLR4_0_61h1hipsoh1el.R.inc(64);
        __CLR4_0_61h1hipsoh1el.R.inc(65);Server.stopServer();
        __CLR4_0_61h1hipsoh1el.R.inc(66);Assert.assertFalse(Server.isServerRunning());
    }finally{__CLR4_0_61h1hipsoh1el.R.flushNeeded();}}

    private void start() throws Exception {try{__CLR4_0_61h1hipsoh1el.R.inc(67);
        __CLR4_0_61h1hipsoh1el.R.inc(68);Server.main();
    }finally{__CLR4_0_61h1hipsoh1el.R.flushNeeded();}}
}