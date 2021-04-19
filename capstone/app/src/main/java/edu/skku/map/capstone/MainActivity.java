package edu.skku.map.capstone;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
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
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import edu.skku.map.capstone.MyPainter;
import edu.skku.map.capstone.R;

public class MainActivity extends AppCompatActivity {

    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.button);
        String foldername = this.getFilesDir().getAbsolutePath() +"/TestLog";
        final String filename = "DragandDrop.txt";
        try {
            File init_file = new File (foldername+"/"+filename);
            if(init_file.exists())
                init_file.delete();
        }catch (Exception e){
            Toast.makeText(getApplicationContext(), "파일 초기화 실패", Toast.LENGTH_SHORT).show();
        }

        MyPainter mp = new MyPainter(this);
        mp = (MyPainter) findViewById(R.id.mypainter);
        mp.setBackgroundDrawable(getResources().getDrawable(R.drawable.picture1));

        btn1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

            }
        });

    }

}