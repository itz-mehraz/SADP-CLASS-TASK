public class Task1 {
    public void login(String userName, String password) {
        // Login Services
    }

    public static void main(String[] args) {
        EmailService eService = new EmailService();
        eService.sendEmail("DEMO", "DEMO", "DEMO");
    }
}

class EmailService {
    public void sendEmail(String to, String subject, String body) {
        System.out.println("Email Service!");
    }
}
