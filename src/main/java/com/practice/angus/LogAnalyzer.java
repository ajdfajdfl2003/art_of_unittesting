package com.practice.angus;

public class LogAnalyzer {
    public boolean IsValidLogFileName(String fileName) {
        FileExtensionManager mgr = new FileExtensionManager();
        return mgr.IsValid(fileName);
    }
}
