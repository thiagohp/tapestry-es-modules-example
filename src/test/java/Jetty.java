import org.apache.tapestry5.test.JettyRunner;

public class Jetty {
    
    public static void main(String[] args) throws Exception {
        JettyRunner runner = new JettyRunner("src/main/webapp", "/", 8080, 8443);
        runner.start();
        
    }

}
