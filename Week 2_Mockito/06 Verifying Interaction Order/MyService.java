package com.example.test;

public class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public void runSequence() {
        api.initialize();
        api.process();
        api.shutdown();
    }
}
