package com.example.observer;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class giCaseService implements CaseSubject {
    private List<CaseObserver> observers = new ArrayList<>();

    // Add observer
    @Override
    public void addObserver(CaseObserver observer) {
        if (observer != null && !observers.contains(observer)) {
            observers.add(observer);
            System.out.println("Observer added: " + observer.getClass().getSimpleName());
        }
    }

    // Remove observer
    @Override
    public void removeObserver(CaseObserver observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
            System.out.println("Observer removed: " + observer.getClass().getSimpleName());
        }
    }

    // Notify all observers when a case is created
    @Override
    public void notifyObservers(Case caseCreationEvent) {
        System.out.println("Notifying all observers for case: " + caseCreationEvent);
        for (CaseObserver observer : observers) {
            observer.update(caseCreationEvent);
            System.out.println("Observer created: " + observer.getClass().getSimpleName());
        }
       /*
        System.out.println("Notifying all observers for case: " + caseCreationEvent);
        for (CaseObserver observer : observers) {
            // Example conditional logic based on caseType
            if ("Compliance".equals(caseCreationEvent.getCaseType()) && observer instanceof ComplianceObserver) {
                observer.update(caseCreationEvent);
            } else if ("Notification".equals(caseCreationEvent.getCaseType()) && observer instanceof NotificationObserver) {
                observer.update(caseCreationEvent);
            }
        }
        */
    }


    // Create a case
    public void createCase(Case caseCreationEvent) {
        // Case creation logic here
        System.out.println("Case created: " + caseCreationEvent);
        notifyObservers(caseCreationEvent);
    }
}
