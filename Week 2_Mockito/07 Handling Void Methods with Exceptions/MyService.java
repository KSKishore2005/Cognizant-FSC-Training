package com.example.test;

public class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public void performRiskyAction() {
        api.riskyOperation();  // This may throw an exception
    }
}
