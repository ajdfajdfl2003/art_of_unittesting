package com.practice.angus.practice_4;

public class FakeEmailService implements IEmailService {
    private String body;
    private String subject;
    private String to;

    @Override
    public void SendEnail(String to, String subject, String body) {
        this.to = to;
        this.subject = subject;
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public String getSubject() {
        return subject;
    }

    public String getTo() {
        return to;
    }
}
