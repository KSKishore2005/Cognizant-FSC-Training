package com.example.test;

public class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public void doWork() {
        // performs some action, then logs
        api.logMessage("Task Completed");
    }
}
