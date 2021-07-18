package newInstance;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class MyFileInputStream extends FileInputStream implements Cloneable{

    public  MyFileInputStream(File file) throws FileNotFoundException {
        super( file);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
