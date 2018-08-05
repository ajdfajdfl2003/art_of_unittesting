package com.practice.angus.practice_4;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LogAnalyzerTest {
    @Test
    public void Analyze_TooShortFileName_CallsWebService() {
        FakeWebService mockService = new FakeWebService();
        LogAnalyzer log = new LogAnalyzer(mockService);

        String tooShortFileName = "abc.ext";
        log.analyze(tooShortFileName);

        assertThat(mockService.getLastError()).isEqualTo("Filename too short:abc.ext");
    }

    @Test
    public void Analyze_WebServiceThrows_SendsEmail() {
        FakeWebService stubService = new FakeWebService();
        stubService.setToThrow(new Exception("fake exception"));

        FakeEmailService mockEmail = new FakeEmailService();

        LogAnalyzer log = new LogAnalyzer(stubService, mockEmail);

        String tooShortFileName = "abc.ext";
        log.analyze(tooShortFileName);

        EmailInfo expectedEmailInfo =
                new EmailInfo("fake exception", "someone@somewhere.com", "can't log");

        assertThat(mockEmail.getEmailInfo()).isEqualToComparingFieldByField(expectedEmailInfo);
    }
}