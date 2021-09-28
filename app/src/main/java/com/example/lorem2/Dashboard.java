package com.example.lorem2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dashboard extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        button = (Button) findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennewrequest();
            }
        });

        button = (Button) findViewById(R.id.button5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencreateaccount();
            }
        });
    }

    private void opencreateaccount() {
        Intent intent = new Intent(Dashboard.this,CreateAccountActivity.class);
        startActivity(intent);
    }

    public void opennewrequest(){
        Intent intent = new Intent(Dashboard.this,newrequest.class);
        startActivity(intent);


    }
}
