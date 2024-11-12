package com.example.observer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cases")
public class CaseController {
    @Autowired
    private CaseService caseService;

    @Autowired
    private ComplianceObserver complianceObserver;

    @Autowired
    private NotificationObserver notificationObserver;

    @PostMapping("/create")
    public String createCase(@RequestBody Case caseCreationEvent) {
        System.out.println("API Call: /create - Case details: " + caseCreationEvent);
        caseService.createCase(caseCreationEvent);
        return "Case created and observers notified";
    }

    // POST method to add an observer
    @PostMapping("/addObserver")
    public String addObserver(@RequestParam String observerType) {
        System.out.println("API Call: /addObserver - Observer type: " + observerType);
        switch (observerType.toLowerCase()) {
            case "compliance":
                caseService.addObserver(complianceObserver);
                return "ComplianceObserver added.";
            case "notification":
                caseService.addObserver(notificationObserver);
                return "NotificationObserver added.";
            default:
                return "Invalid observer type.";
        }
    }

    // POST method to remove an observer
    @PostMapping("/removeObserver")
    public String removeObserver(@RequestParam String observerType) {
        System.out.println("API Call: /removeObserver - Observer type: " + observerType);
        switch (observerType.toLowerCase()) {
            case "compliance":
                caseService.removeObserver(complianceObserver);
                return "ComplianceObserver removed.";
            case "notification":
                caseService.removeObserver(notificationObserver);
                return "NotificationObserver removed.";
            default:
                return "Invalid observer type.";
        }
    }
}
