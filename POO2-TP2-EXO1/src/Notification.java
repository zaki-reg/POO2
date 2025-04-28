
public class Notification {
    private NotificationService service;

    public Notification(NotificationService service) {
        this.service = service;
    }

    public void notifyUser(String message) {
        service.sendMessage(message);
    }
}
