package com.practice.angus.practice_3;

public class FileExtensionManager implements IExtensionManager {
    public boolean IsValid(String fileName) {
        if (fileName.isEmpty()) {
            throw new IllegalArgumentException("filename has to be provided.");
        }

        if (!fileName.toUpperCase().endsWith(".SLF")) {
            return false;
        }
        return true;
    }
}
