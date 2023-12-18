import francistopher.QA.FileManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("FileManager.java tests")
public class FileManagerTests {

    private FileManager fileManager;
    private String fileName;

    @BeforeEach
    public void setUpClass() {
        this.fileName = "francistopher.txt";
        this.fileManager = new FileManager(this.fileName);
    }

    @Test
    public void testSetFileName() {
        this.fileManager.setFileName(this.fileName);
        assertEquals(this.fileName, this.fileManager.getFileName());
    }

    @Test
    public void testCreateFileObject() {
        assertTrue(this.fileManager.createFileObject());
    }

    @Test
    public void testSetGetFile() {
        File file = new File(this.fileName);
        this.fileManager.setFile(file);
        assertEquals(file, this.fileManager.getFile());
    }

}
