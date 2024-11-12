package com.example.observer;
import org.springframework.stereotype.Component;

@Component
public class ComplianceObserver implements CaseObserver {
    @Override
    public void update(Case caseCreationEvent) {
        // Logic for handling case in the Compliance Service
        System.out.println("Compliance observer is called for created case");
        System.out.println("Compliance service notified of case: " + caseCreationEvent);
    }
}
