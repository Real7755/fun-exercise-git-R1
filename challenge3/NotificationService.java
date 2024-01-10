public class NotificationService {
    private final FeatureToggle featureToggle;

    public NotificationService(FeatureToggle featureToggle) {
        this.featureToggle = featureToggle;
    }

    public void sendNotification(String message, Contact contact) {
        if (featureToggle.isEmailNotificationEnabled()) {
            System.out.println("Email notification feature toggle is ENABLED");
            sendEmailNotification(message, contact.getEmail());
        } else {
            System.out.println("Email notification feature toggle is DISABLED");
            sendSMSNotification(message, contact.getPhoneNumber());
        }
    }

    private void sendEmailNotification(String message, String email) {
        // Logic for sending an email notification
        System.out.println("Sending email to " + email + ": " + message);
    }

    private void sendSMSNotification(String message, String phoneNumber) {
        // Logic for sending an SMS notification
        System.out.println("Sending SMS to " + phoneNumber + ": " + message);
    }
}