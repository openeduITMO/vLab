package vlab.server_java;

import org.springframework.context.support.GenericXmlApplicationContext;
import rlcp.server.Server;

/**
 * Main class for RLCP-server starting.
 *
 * @author Eugene Efimchick
 */
public class Starter {

    /**
     * Defines applicable logic modules, configuration path and starts RLCP-server
     */
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:vlab/server_java/java-server-config.xml");
        context.refresh();

        context.getBean("server", Server.class).startServer();
    }
}
