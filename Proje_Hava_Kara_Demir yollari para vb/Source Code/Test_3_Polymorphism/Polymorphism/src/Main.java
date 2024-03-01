public class Main {
    public static void main(String[] args) {
        EmailLogger logger = new EmailLogger();
        logger.Log("Log mesajı");

        DatabaseLogger databaseLogger = new DatabaseLogger();
        databaseLogger.Log("ABC");
    }
}