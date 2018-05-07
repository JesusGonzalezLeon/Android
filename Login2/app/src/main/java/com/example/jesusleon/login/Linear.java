package com.example.jesusleon.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Linear extends AppCompatActivity implements View.OnClickListener {
Button regresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);
        regresar=(Button)this.findViewById(R.id.regresa);
        regresar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        finish();
    }
}
