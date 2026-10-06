package org.example;

import org.example.NotificationService.NotificationService;

public class OrderService {

    private NotificationService notification;

    public OrderService(NotificationService notification) {
        this.notification = notification;
    }

    public void placeOrder() {
        System.out.println("Order Placed");
        notification.sendNotification();
    }
}