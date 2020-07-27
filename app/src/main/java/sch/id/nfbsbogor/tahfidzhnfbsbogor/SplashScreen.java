package sch.id.nfbsbogor.tahfidzhnfbsbogor;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import sch.id.nfbsbogor.tahfidzhnfbsbogor.ui.login.LoginActivity;

public class SplashScreen extends AppCompatActivity {

    private int splashTime = 4000;

    private TextView tv_splashText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        tv_splashText = (TextView) findViewById(R.id.tv_splahText);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent login = new Intent(SplashScreen.this, LoginActivity.class);
                startActivity(login);
                finish();
            }
        },splashTime);

    }
}