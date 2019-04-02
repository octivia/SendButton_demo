package com.technohack.sendbutton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton shareBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        shareBtn=findViewById(R.id.shareBtId);
        shareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent share=new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                String shareSub="Subject of the Content";
                //this is the content that will share
                String shareBody="Body of the Content";
                share.putExtra(Intent.EXTRA_SUBJECT,shareSub);  //to share the sub of the content
                //by using this method content will share
                share.putExtra(Intent.EXTRA_TEXT,shareBody);    //to the body or data of the content

                startActivity(Intent.createChooser(share,"Share Using"));

            }
        });

    }

    public void onToggle(View view){

        startActivity(new Intent(MainActivity.this,ToggleActivity.class));

    }
}
