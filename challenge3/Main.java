public class Main {
    public static void main(String[] args) {
        // Feature toggle configuration
        FeatureToggle featureToggle = new FeatureToggle();
        featureToggle.setEmailNotificationEnabled(false);

        // Initialize the NotificationService with feature toggle
        NotificationService notificationService = new NotificationService(featureToggle);

        Contact contact = new Contact("kbtg@kampus.tech", "0812345678");

        // Send a notification
        notificationService.sendNotification("Hello, Java!", contact);
    }
}