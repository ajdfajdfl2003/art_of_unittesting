package com.practice.angus;

public class LogAnalyzer {
    public boolean IsValidLogFileName(String fileName) {
        if (!fileName.toUpperCase().endsWith(".SLF")) {
            return false;
        }
        return true;
    }
}
