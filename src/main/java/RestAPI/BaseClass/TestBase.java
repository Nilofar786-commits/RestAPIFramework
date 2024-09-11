package RestAPI.BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {

   public Properties pro;
    public TestBase()
    {
        try {
            pro = new Properties();
            //File f=new File("./scr/main/java/RestAPI/Config/config.properties");
           // FileInputStream fs = new FileInputStream(f);
            FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/RestAPI/Config/config.properties");
            pro.load(fs);

        }
        catch (FileNotFoundException ex)
        {
            ex.printStackTrace();
        }
        catch (IOException ie)
        {
            ie.printStackTrace();
        }

    }
}
