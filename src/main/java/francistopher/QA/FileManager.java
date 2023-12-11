package francistopher.QA;

import java.io.File;

/** Each file manager is responsible for the questioning of a single file **/
public class FileManager {

    private String fileName;
    private File file;

    public FileManager(String fileName) {
        this.setFileName(fileName);
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public boolean createFileObject() {
        try {
            File newFile = new File(this.fileName);
            this.setFile(newFile);
            return true;
        } catch (Throwable e) {
            System.out.println("File " + this.fileName + " was unable to be created!");
            return false;
        }
    }

    public void setFile(File file) {
        this.file = file;
    }

    public File getFile() {
        return this.file;
    }

}
