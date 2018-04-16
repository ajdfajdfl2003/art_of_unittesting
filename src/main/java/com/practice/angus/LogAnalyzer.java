package com.practice.angus;

public class LogAnalyzer {
    public boolean IsValidLogFileName(String fileName) {
        if (fileName.isEmpty()) {
            throw new IllegalArgumentException("filename has to be provided.");
        }

        if (!fileName.toUpperCase().endsWith(".SLF")) {
            return false;
        }
        return true;
    }
}
