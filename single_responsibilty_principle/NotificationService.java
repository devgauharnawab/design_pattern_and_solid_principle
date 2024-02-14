package single_responsibilty_principle;

public class NotificationService {
    public void sendOTP(String medium) {
        if (medium.equals("email")) {
            // Write email related logic
            // Use JavaMailSenderAPI to send OTP through email
            System.out.println("OTP sent via email.");
        }
        if(medium.equals("mobile")) {
            // Write logic using Twilio API to send OTP through mobile
            System.out.println("OTP sent via mobile.");
        }
    }
}
