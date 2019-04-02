package com.technohack.sendbutton;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class ToggleActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private ToggleButton toggleButton;
    private ConstraintLayout constraintLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle);

        toggleButton=findViewById(R.id.toggleButton);
        constraintLayout=findViewById(R.id.layoutId);

        toggleButton.setOnCheckedChangeListener(this);  //to tell the listener that which button we are going to listen

    }
    //onCheckedChangedListener will check that is there button toggled or not

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        if(b){
            constraintLayout.setBackgroundColor(Color.BLACK);
        }else{
            constraintLayout.setBackgroundColor(Color.WHITE);
        }

    }

}
