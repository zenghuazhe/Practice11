package com.example.practice11;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AnotherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        Intent intent=getIntent();
        String name=intent.getStringExtra("name");
        Integer age=intent.getIntExtra("age", 666);
        Toast.makeText(this,name+age,Toast.LENGTH_LONG).show();

        Button button=(Button)findViewById(R.id.but_2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=getIntent();
                String name=intent.getStringExtra("name");
                Integer age=intent.getIntExtra("age", 666);
                intent.putExtra("result","结果:"+name+" 数据"+age);
                setResult(0,intent);
                finish();
            }
        });

    }

}

