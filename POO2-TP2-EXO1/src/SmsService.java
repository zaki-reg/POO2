public class SmsService implements NotificationService {
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}