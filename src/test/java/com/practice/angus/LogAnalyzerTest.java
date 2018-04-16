package com.practice.angus;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class LogAnalyzerTest {
    private final String fileName;
    private final boolean expected;

    @Parameterized.Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"filewithgoodextension.slf", true},
                {"filewithgoodextension.SLF", true},
                {"filewithbadextension.foo", false},
        });
    }

    public LogAnalyzerTest(String fileName, boolean expected) {
        this.fileName = fileName;
        this.expected = expected;
    }

    @Test
    public void IsValidFileName_VariousExtension_ChecksThem() {
        LogAnalyzer analyzer = new LogAnalyzer();
        boolean result = analyzer.IsValidLogFileName(this.fileName);
        assertEquals(this.expected, result);
    }
}
