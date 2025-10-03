package com.dry.service.impl;

public class NotificationServiceImpl {

    private boolean isValidString(String value){
        if(value == null || value.isEmpty()) {
            return false;
        }
        return true;
    }

    public void sendEmail(String to, String subject, String body) {

        if(!isValidString(to)) {
            return;
        }
        System.out.printf("Sending email to: %s%nSubject: %s%nBody: %s%n", to, subject, body);
    }

    public void sendSms(String phone, String message) {
        if (!isValidString(phone)) {
            System.out.println("Invalid phone number");
            return;
        }
        System.out.printf("Sending SMS to: %s%nMessage: %s%n", phone, message);

    }

    public void sendPush(String deviceToken, String message) {
        if (!isValidString(deviceToken)) {
            System.out.println("Invalid device token");
            return;
        }
        System.out.printf("Sending Push Notification to: %s%nMessage: %s%n", deviceToken, message);
    }
}