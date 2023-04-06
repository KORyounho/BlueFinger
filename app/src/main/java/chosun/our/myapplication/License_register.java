package chosun.our.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class License_register extends AppCompatActivity {

    private Button btn_regi;
    String var1;
    String var2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_license_register);

        btn_regi = findViewById(R.id.license_regi);
        btn_regi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(License_register.this, ReginsterActivity.class);
                startActivity(intent);
            }
        });
    }
}