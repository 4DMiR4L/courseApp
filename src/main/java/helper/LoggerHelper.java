package helper;


import java.util.logging.Logger;

public class LoggerHelper {

    private static final Logger log = LoggerFactory.getLogger(LoggerHelper.class);

    public static void info(String message) {
        log.info(message);
    }

    public static void error(String message) {
        log.error(message);
    }

    public static void warn(String message) {
        log.warn(message);
    }

    public static void debug(String message) {
        log.debug(message);
    }
}
