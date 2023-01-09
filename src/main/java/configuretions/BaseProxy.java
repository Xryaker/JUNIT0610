package configuretions;

import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.core.har.Har;
import net.lightbody.bmp.core.har.HarEntry;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class BaseProxy extends BaseClass{
    public static BrowserMobProxyServer serverBase;
    @BeforeClass
    static public void startProxy(){
        serverBase.newHar("youtube");
        ConfigUserAgens.createUserAgent(USERAGENT.ANDROIDEN,serverBase);
    }
    @AfterClass
    static public void stopProxy() throws IOException {
        String timeStamp = new SimpleDateFormat("MMdd_HHmmss").format(Calendar.getInstance().getTime());
        Har har = serverBase.getHar();
        har.writeTo(new File("site"+timeStamp+".har"));
// Some code here ... (close browser, stop server)
        serverBase.stop();
        for (HarEntry entry : har.getLog().getEntries()) {
          //  System.out.println(entry);
//            System.out.print(" "+entry.getTimings().getWait());
//            System.out.println(" "+entry.getTimings().getReceive());
            //System.out.println(" "+entry.getRequest().getUrl());

        }

    }
}
