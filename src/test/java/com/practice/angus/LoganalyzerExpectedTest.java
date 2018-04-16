package com.practice.angus;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LoganalyzerExpectedTest {
    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void IsValidFileName_EmptyFileName_ThrowsException() {
        LogAnalyzer analyzer = new LogAnalyzer();

        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("filename has to be provided.");

        analyzer.IsValidLogFileName("");
    }
}
