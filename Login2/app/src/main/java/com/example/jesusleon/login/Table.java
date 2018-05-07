package com.example.jesusleon.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Table extends AppCompatActivity implements View.OnClickListener {
    Button r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
        r =(Button)this.findViewById(R.id.r);
        r.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        finish();
    }
}
