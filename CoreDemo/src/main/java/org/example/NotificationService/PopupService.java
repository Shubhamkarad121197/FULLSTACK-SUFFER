package org.example.NotificationService;

public class PopupService implements NotificationService{
    @Override
    public void sendNotification(){
        System.out.println("Popup Notification Sent");
    }
}
