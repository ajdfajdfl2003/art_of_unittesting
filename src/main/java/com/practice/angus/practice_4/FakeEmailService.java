package com.practice.angus.practice_4;

public class FakeEmailService implements IEmailService {

    private EmailInfo emailInfo;

    @Override
    public void SendEmail(EmailInfo emailInfo) {
        this.emailInfo = emailInfo;
    }

    public EmailInfo getEmailInfo() {
        return emailInfo;
    }
}
