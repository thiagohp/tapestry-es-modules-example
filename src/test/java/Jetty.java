import org.apache.tapestry5.test.JettyRunner;

public class Jetty {
    
    public static void main(String[] args) throws Exception {
        final int httpPort = 8080;
        final int httpsPort = 8443;
        JettyRunner runner = new JettyRunner("src/main/webapp", "/", httpPort, httpsPort);
        runner.start();
    }

}
