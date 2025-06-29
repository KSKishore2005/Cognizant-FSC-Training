package com.example.test;

public class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String getUser(int id) {
        return api.getUserById(id);
    }
}
