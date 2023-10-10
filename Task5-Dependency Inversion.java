
interface Notification {
    void sendNotification();
}

class EmailNotification implements Notification {
    public void sendNotification() {
        System.out.println("Sending an email notification");
    }
}

class SMSNotification implements Notification {
    public void sendNotification() {
        System.out.println("Sending an SMS notification");
    }
}


class NotificationService {
    private Notification notification;

    public NotificationService(Notification notification) {
        this.notification = notification;
    }

    public void send() {
        notification.sendNotification();
    }
}

public class Main {
    public static void main(String[] args) {
        
        Notification emailNotification = new EmailNotification();
        Notification smsNotification = new SMSNotification();

        NotificationService emailService = new NotificationService(emailNotification);
        NotificationService smsService = new NotificationService(smsNotification);

        emailService.send(); 
        smsService.send(); 
    }
}
