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

        assertThat(mockService.getLastError()).contains("Filename too short:abc.ext");
    }
}