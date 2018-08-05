package com.practice.angus.practice_4;

public class LogAnalyzer {
    private IWebService service;

    public LogAnalyzer(IWebService service) {
        this.service = service;
    }

    public void analyze(String fileName) {
        if (fileName.length() < 8) {
            try {
                service.LogError("Filename too short:" + fileName);
            } catch (Exception e) {
                email.SendEnail("a", "subject", e.getMessage());
            }
        }
    }
}
