package com.example.yaredbezu.myapplication3;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.InputType;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout =new LinearLayout(this);

        layout.setGravity(Gravity.TOP);
        layout.setOrientation(LinearLayout.VERTICAL);
        //layout.animate();
        //title
        TextView lable1 =new TextView(this);
        lable1.setBackgroundColor(Color.GREEN);
        lable1.setText("Title");
        lable1.setTextColor(Color.BLUE);
        EditText input1 =new EditText(this);
        input1.setBackgroundColor(Color.GREEN);
        input1.setInputType(InputType.TYPE_CLASS_TEXT);
        layout.addView(lable1);
        layout.addView(input1);//input1.setText("Header");
        //body
        TextView lable2 =new TextView(this);
        lable2.setBackgroundColor(Color.YELLOW);
        lable2.setText("Body");
        lable2.setTextColor(Color.BLUE);
        EditText input2 =new EditText(this);
        input2.setBackgroundColor(Color.YELLOW);
        input2.setInputType(InputType.TYPE_CLASS_TEXT);
        layout.addView(lable2);
        layout.addView(input2);
        //close remark |summery
        TextView lable3 =new TextView(this);
        lable3.setBackgroundColor(Color.RED);
        lable3.setText("close remark |summery");
        lable3.setTextColor(Color.BLUE);
        EditText input3 =new EditText(this);
        input3.setBackgroundColor(Color.RED);
        input3.setInputType(InputType.TYPE_CLASS_TEXT);
        layout.addView(lable3);
        layout.addView(input3);


        setContentView(layout);
        LinearLayout.LayoutParams paramsexamples=new LinearLayout.LayoutParams(100,25);
        //lable1.setLayoutParams(paramsexamples);
    }
}
