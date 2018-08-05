package com.practice.angus.practice_4;

public class FakeWebService implements IWebService {
    private String lastError;

    @Override
    public void LogError(String message) {
        lastError = message;
    }

    public String getLastError() {
        return lastError;
    }
}
