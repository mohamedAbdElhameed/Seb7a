package com.example.mohamedabdelhameed.seb7a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1,btn2,btn3,btn4;
    int i=0,j=0,k=0,l=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.first);
        btn2 = (Button) findViewById(R.id.second);
        btn3 = (Button) findViewById(R.id.third);
        btn4 = (Button) findViewById(R.id.fourth);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        if(v == btn1){
            i++;
            btn1.setText(i+"");
        }else if (v == btn2){
            j++;
            btn2.setText(j+"");
        }
        else if (v == btn3){
            k++;
            btn3.setText(k+"");
        }
        else{
            l++;
            btn4.setText(l+"");
        }
    }
}
