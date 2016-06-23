/* $$ This file has been instrumented by Clover 4.0.6#20150918095238309 $$ */package com.example.sample.rest;

import com.codahale.metrics.ConsoleReporter;
import com.codahale.metrics.JmxReporter;
import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.servlets.MetricsServlet;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

/**
 * Starts Jetty server on PORT 4080.
 */
public class Server {public static class __CLR4_0_699ipsp1zl3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0076\u0069\u0073\u0068\u0079\u006f\u006f\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u002f\u0067\u0069\u0074\u002f\u0065\u0078\u0061\u006d\u0070\u006c\u0065\u002d\u006a\u0061\u0076\u0061\u0063\u006f\u0064\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1466709648129L,8589935092L,44,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Logger logger = LoggerFactory.getLogger(Server.class);
    private static final JmxReporter jmxReporter = JmxReporter.forRegistry(MetricsReporter.getInstance()).build();
    private static final ConsoleReporter consoleReporter =
        ConsoleReporter.forRegistry(MetricsReporter.getInstance()).build();

    private static org.eclipse.jetty.server.Server server = null;

    private static final int PORT = 4080;

    public static void startServer() throws Exception {try{__CLR4_0_699ipsp1zl3.R.inc(9);
        __CLR4_0_699ipsp1zl3.R.inc(10);HttpServletDispatcher dispatcher = new HttpServletDispatcher();
        __CLR4_0_699ipsp1zl3.R.inc(11);ServletHolder holder = new ServletHolder(dispatcher);
        __CLR4_0_699ipsp1zl3.R.inc(12);holder.setInitParameter("javax.ws.rs.Application", RestApplication.class.getName());

        __CLR4_0_699ipsp1zl3.R.inc(13);ServletContextHandler servletContextHandler = new ServletContextHandler();
        __CLR4_0_699ipsp1zl3.R.inc(14);servletContextHandler.setInitParameter("resteasy.servlet.mapping.prefix", "/");
        __CLR4_0_699ipsp1zl3.R.inc(15);servletContextHandler.addServlet(holder, "/*");

        // Add Dropwizard HTTP MetricsServlet
        __CLR4_0_699ipsp1zl3.R.inc(16);servletContextHandler.addServlet(MetricsServlet.class, "/metrics");

        __CLR4_0_699ipsp1zl3.R.inc(17);servletContextHandler.addEventListener(new MetricsServlet.ContextListener() {
            @Override
            protected MetricRegistry getMetricRegistry() {try{__CLR4_0_699ipsp1zl3.R.inc(18);
                __CLR4_0_699ipsp1zl3.R.inc(19);return MetricsReporter.getInstance();
            }finally{__CLR4_0_699ipsp1zl3.R.flushNeeded();}}

            @Override
            protected TimeUnit getRateUnit() {try{__CLR4_0_699ipsp1zl3.R.inc(20);
                __CLR4_0_699ipsp1zl3.R.inc(21);return TimeUnit.SECONDS;
            }finally{__CLR4_0_699ipsp1zl3.R.flushNeeded();}}

            @Override
            protected TimeUnit getDurationUnit() {try{__CLR4_0_699ipsp1zl3.R.inc(22);
                __CLR4_0_699ipsp1zl3.R.inc(23);return TimeUnit.MILLISECONDS;
            }finally{__CLR4_0_699ipsp1zl3.R.flushNeeded();}}
        });

        __CLR4_0_699ipsp1zl3.R.inc(24);HandlerList handlers = new HandlerList();
        __CLR4_0_699ipsp1zl3.R.inc(25);handlers.setHandlers(new Handler[]{servletContextHandler});

        __CLR4_0_699ipsp1zl3.R.inc(26);server = new org.eclipse.jetty.server.Server(PORT);
        __CLR4_0_699ipsp1zl3.R.inc(27);server.setHandler(handlers);

        __CLR4_0_699ipsp1zl3.R.inc(28);server.start();
        __CLR4_0_699ipsp1zl3.R.inc(29);logger.info("Listening on PORT " + PORT);

        // Dropwizard JMX Reporter
        __CLR4_0_699ipsp1zl3.R.inc(30);jmxReporter.start();
        __CLR4_0_699ipsp1zl3.R.inc(31);logger.info("Started reporter " + jmxReporter.getClass().getName());

        // Dropwizard Console Reporter
        __CLR4_0_699ipsp1zl3.R.inc(32);consoleReporter.start(1, TimeUnit.MINUTES); // should expose values every minute
        __CLR4_0_699ipsp1zl3.R.inc(33);logger.info("Started reporter " + consoleReporter.getClass().getName());
    }finally{__CLR4_0_699ipsp1zl3.R.flushNeeded();}}

    public static void stopServer() throws Exception {try{__CLR4_0_699ipsp1zl3.R.inc(34);
        __CLR4_0_699ipsp1zl3.R.inc(35);if ((((server != null)&&(__CLR4_0_699ipsp1zl3.R.iget(36)!=0|true))||(__CLR4_0_699ipsp1zl3.R.iget(37)==0&false))) {{
            __CLR4_0_699ipsp1zl3.R.inc(38);server.stop();
        }

        }__CLR4_0_699ipsp1zl3.R.inc(39);server = null;
    }finally{__CLR4_0_699ipsp1zl3.R.flushNeeded();}}

    public static boolean isServerRunning() {try{__CLR4_0_699ipsp1zl3.R.inc(40);
        __CLR4_0_699ipsp1zl3.R.inc(41);return server != null;
    }finally{__CLR4_0_699ipsp1zl3.R.flushNeeded();}}

    public static void main(String... args) throws Exception {try{__CLR4_0_699ipsp1zl3.R.inc(42);
        __CLR4_0_699ipsp1zl3.R.inc(43);startServer();
    }finally{__CLR4_0_699ipsp1zl3.R.flushNeeded();}}
}
