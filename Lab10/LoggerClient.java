
public class LoggerClient {
    public static void main(String[] args) {
        LogContext context = new LogContext();
        context.logMessage("This is an information.", LogLevel.INFO);
        context.logMessage("This is a debug information.", LogLevel.DEBUG);
        context.logMessage("This is an error information.", LogLevel.ERROR);
    }
}
