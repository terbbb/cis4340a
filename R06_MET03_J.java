private void readSensitiveFile() {
  try {
    SecurityManager sm = System.getSecurityManager();
    if (sm != null) {  // Check for permission to read file
      sm.checkRead("/temp/tempFile");
    }
    // Access the file
  } catch (SecurityException se) {
    // Log exception
  }
}