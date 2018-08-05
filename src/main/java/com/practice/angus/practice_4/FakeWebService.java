package com.practice.angus.practice_4;

public class FakeWebService implements IWebService {
    private String lastError;
    private Exception toThrow;

    @Override
    public void LogError(String message) throws Exception {
        if (toThrow != null) {
            throw toThrow;
        }
        lastError = message;
    }

    public void setToThrow(Exception toThrow) {
        this.toThrow = toThrow;
    }

    public String getLastError() {
        return lastError;
    }
}
