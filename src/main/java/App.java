import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class App {
    private static Logger logger = Logger.getLogger(App.class);

    public static void main(String[] args) {

        logWithDomConfigurator("test");

    }


    public static void logWithDomConfigurator(String parameter) {
        DOMConfigurator.configure("loggerConfig.xml");

        logger.debug("This is debug : " + parameter);
        logger.info("This is info : " + parameter);
        logger.warn("This is warn : " + parameter);
        logger.error("This is error : " + parameter);
    }
}
