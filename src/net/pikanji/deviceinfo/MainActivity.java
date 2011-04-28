
package net.pikanji.deviceinfo;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        TextView textView = (TextView) findViewById(R.id.text_view);
        textView.setText(getDeviceInfo());
    }

    private String getDeviceInfo() {
        int sdk_int = Build.VERSION.SDK_INT;
        boolean above8 = (sdk_int >= 8);
        boolean above9 = (sdk_int >= 9);
        String newLine = System.getProperty("line.separator");

        String info = "";
        info += "BOARD: " + Build.BOARD + newLine;
        if (above8) {
            info += "BOOTLOADER: " + Build.BOOTLOADER + newLine;
        }
        info += "BRAND: " + Build.BRAND + newLine;
        info += "CPU_ABI: " + Build.CPU_ABI + newLine;
        if (above8) {
            info += "CPU_ABI2: " + Build.CPU_ABI2 + newLine;
        }
        info += "DEVICE: " + Build.DEVICE + newLine;
        info += "DISPLAY: " + Build.DISPLAY + newLine;
        info += "FINGERPRINT: " + Build.FINGERPRINT + newLine;
        if (above8) {
            info += "HARDWARE: " + Build.HARDWARE + newLine;
        }
        info += "HOST: " + Build.HOST + newLine;
        info += "ID: " + Build.ID + newLine;
        info += "MANUFACTURER: " + Build.MANUFACTURER + newLine;
        info += "MODEL: " + Build.MODEL + newLine;
        info += "PRODUCT: " + Build.PRODUCT + newLine;
        if (above8) {
            info += "RADIO: " + Build.RADIO + newLine;
        }
        if (above9) {
            info += "SERIAL: " + Build.SERIAL + newLine;
        }
        info += "TAGS: " + Build.TAGS + newLine;
        info += "TIME: " + Build.TIME + newLine;
        info += "TYPE: " + Build.TYPE + newLine;
        info += "USER: " + Build.USER + newLine;

        info += "--- Build.VERSION ---" + newLine;
        info += "CODENAME: " + Build.VERSION.CODENAME + newLine;
        info += "INCREMENTAL: " + Build.VERSION.INCREMENTAL + newLine;
        info += "RELEASE: " + Build.VERSION.RELEASE + newLine;
        info += "SDK: " + Build.VERSION.SDK + newLine;
        info += "SDK_INT: " + Build.VERSION.SDK_INT + newLine;

        return info;
    }
}
