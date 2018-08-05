package com.practice.angus.practice_4;

public class EmailInfo {
    private final String subject;
    private final String to;
    private final String body;

    public EmailInfo(String body, String to, String subject) {
        this.body = body;
        this.to = to;
        this.subject = subject;
    }
}
