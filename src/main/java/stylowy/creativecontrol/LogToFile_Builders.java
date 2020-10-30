package stylowy.creativecontrol;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LogToFile_Builders {
        public void logToFile(String message)
        {
            CreativeControl plugin = CreativeControl.GetInstance();
            try
            {
                File dataFolder = plugin.getDataFolder();
                if(!dataFolder.exists())
                {
                    dataFolder.mkdir();
                }

                File saveTo = new File(dataFolder, "builders.txt");
                if (!saveTo.exists())
                {
                    saveTo.createNewFile();
                }


                FileWriter fw = new FileWriter(saveTo, true);

                PrintWriter pw = new PrintWriter(fw);

                pw.println(message);

                pw.flush();

                pw.close();

            } catch (IOException e)
            {

                e.printStackTrace();

            }

        }
    }
