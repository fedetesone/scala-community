package classesandobjects.java;

public class Logger {
    private static final Logger INSTANCE = new Logger();

    private Logger() {
    }

    public static Logger getLogger() {
        return INSTANCE;
    }

    public void log(String level, String string) {
        System.out.printf("%s %s%n", level, string);
    }

    public static void main(String[] args) {
        Logger.getLogger().log("INFO", "March, no voy a mentirte");
    }
}

