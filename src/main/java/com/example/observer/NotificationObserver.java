package com.example.observer;

import org.springframework.stereotype.Component;
@Component
public class NotificationObserver implements CaseObserver{
    @Override
    public void update(Case caseCreationEvent) {
        // Logic for sending
        System.out.println("Notification observer is called for created case");
        System.out.println("Notification sent for case " + caseCreationEvent);
    }
}
