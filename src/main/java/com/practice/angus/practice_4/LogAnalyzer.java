package com.practice.angus.practice_4;

public class LogAnalyzer {
    private IEmailService email;
    private IWebService service;

    public LogAnalyzer(IWebService service) {
        this.service = service;
    }

    public LogAnalyzer(IWebService service, IEmailService email) {
        this.service = service;
        this.email = email;
    }

    public void analyze(String fileName) {
        if (fileName.length() < 8) {
            try {
                service.LogError("Filename too short:" + fileName);
            } catch (Exception e) {
                email.SendEmail(new EmailInfo(e.getMessage(), "someone@somewhere.com", "can't log"));
            }
        }
    }
}
