package com.example.observer;

public class Case {
    private String caseId;
    private String caseType;
    private String customerId;

    // Constructor
    public Case(String caseId, String caseType, String customerId) {
        this.caseId = caseId;
        this.caseType = caseType;
        this.customerId = customerId;
    }

    // Getter for caseId
    public String getCaseId() {
        return caseId;
    }

    // Setter for caseId
    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    // Getter for caseType
    public String getCaseType() {
        return caseType;
    }

    // Setter for caseType
    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    // Getter for customerId
    public String getCustomerId() {
        return customerId;
    }

    // Setter for customerId
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Case{" +
                "caseId='" + caseId + '\'' +
                ", caseType='" + caseType + '\'' +
                ", customerId='" + customerId + '\'' +
                '}';
    }
}
