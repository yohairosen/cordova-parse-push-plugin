package res.main;

import android.app.Application;
import org.apache.cordova.core.ParsePlugin;

public class MainApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ParsePlugin.initializeParseWithApplication(this);
    }

}
