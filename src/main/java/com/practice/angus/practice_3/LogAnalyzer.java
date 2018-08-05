package com.practice.angus.practice_3;

public class LogAnalyzer {
    public boolean IsValidLogFileName(String fileName) {
        FileExtensionManager mgr = new FileExtensionManager();
        return mgr.IsValid(fileName);
    }
}
