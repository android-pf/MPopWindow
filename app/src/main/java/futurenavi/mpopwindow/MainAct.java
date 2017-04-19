package futurenavi.mpopwindow;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import futurenavi.libpopwdow.PopWindow;

public class MainAct extends AppCompatActivity {
    PopWindow pw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);
        pw = new PopWindow(this, "1", "2");
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pw.show(MainAct.this);
            }
        });

        pw.callBack(new PopWindow.CallBack() {
            @Override
            public void onPopClick(String flag) {
                Log.i("WZK", "被点击的是" + flag);
            }
        });

    }
}
