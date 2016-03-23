package calltaxi.bushwick.com.demoappp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import java.io.File;

public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String path = "/sdcard/android_tutorial.pdf";
        File targetFile = new File(path);
        Uri targetUri = Uri.fromFile(targetFile);

        Intent intent;
        intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(targetUri, "application/pdf");

        startActivity(intent);
    }
}