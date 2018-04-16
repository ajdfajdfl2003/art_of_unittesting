package com.practice.angus;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LogAnalyzerTest {
    @Test
    public void IsValidFileName_GoodExtensionUppercase_ReturnsTrue() {
        LogAnalyzer analyzer = new LogAnalyzer();
        boolean result = analyzer.IsValidLogFileName("filewithgoodextension.SLF");
        assertTrue(result);
    }

    @Test
    public void IsValidFileName_BadExtension_ReturnsFalse() {
        LogAnalyzer analyzer = new LogAnalyzer();
        boolean result = analyzer.IsValidLogFileName("filewithbadextension.foo");
        assertFalse(result);
    }
}
