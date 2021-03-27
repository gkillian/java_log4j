// https://stackoverflow.com/questions/14162100/convert-a-classpath-filename-to-a-real-filename

import java.net.URL;
import java.net.URI;
import java.io.File;

class FindCP
{
    public static void main(String[] args)
    {
        if(args.length != 1)
        {
            System.out.println("useage:  PROG <filename>");
            System.exit(0);
        }

        String resource = args[0];

        System.out.println("searching for [" + resource + "] in CLASSPATH");

        URL url = Thread.currentThread().getContextClassLoader().getResource( resource );
        if( url == null )
        {
            throw new RuntimeException( "Cannot find resource on classpath: '" + resource + "'" );
        }
        String file = url.getFile();
        System.out.println(file);
        String nativeFilename = new File(file).getPath();
        System.out.println("NATIVE PATH: " + nativeFilename);
    }
}

/*
 * Note for Windows: in the example above, the actual result will be
 *
 * "/C:/workspace/project/target/classes/info.properties"
 * If you need a more Windows-like path (i.e. "C:\workspace\..."), use:
 *
 * String nativeFilename = new File(file).getPath();
 */
