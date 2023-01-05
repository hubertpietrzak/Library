package org.example.library.io.file;

import org.example.library.model.Library;

public interface FileManager {
    Library importData();
    void exportData(Library library);
}