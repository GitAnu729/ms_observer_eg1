package com.example.observer;

public interface CaseSubject {
    void addObserver(CaseObserver observer);
    void removeObserver(CaseObserver observer);
    void notifyObservers(Case caseCreationEvent);
}
