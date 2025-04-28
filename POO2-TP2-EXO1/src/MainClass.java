

public class MainClass {
	
    public static void main(String[] args) {
    	
        Notification emailNotification = new Notification(new EmailService());
        emailNotification.notifyUser("Hello via Email!");

        Notification smsNotification = new Notification(new SmsService());
        smsNotification.notifyUser("Hello via SMS!");

        Notification pushNotification = new Notification(new PushService());
        pushNotification.notifyUser("Hello via Push!");
    }
}
