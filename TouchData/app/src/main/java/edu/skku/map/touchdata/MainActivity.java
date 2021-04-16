package edu.skku.map.touchdata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.gesture.GestureOverlayView;
import android.os.Bundle;
import android.os.Environment;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {
    //객체 선언
    View view1;
    ScrollView scrollView1;
    TextView textView1;
    GestureDetector detector; //무슨 제스쳐를 했는지 감지
    double start=0;
    double end=0;
    double gap=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED);
//        setContentView(R.layout.activity_main);
        MyPainter mp = new MyPainter(this);
        setContentView(mp);
        mp.setBackgroundDrawable(getResources().getDrawable(R.drawable.picture1));


    }

}