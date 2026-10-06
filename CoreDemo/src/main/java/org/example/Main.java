package org.example;

import org.example.NotificationService.EmailService;
import org.example.NotificationService.NotificationService;
import org.example.NotificationService.PopupService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NotificationService notification=new PopupService();
        OrderService order =new OrderService(notification);

        order.placeOrder();

    }

}