package com.example.mindora;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.content.Intent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class MainActivity extends Activity implements
View.OnClickListener
{

	public void onClick(View v) {
		switch(v.getId()){
			case R.id.imageButton2:

				//インテントのインスタンス生成
				Intent intent = new Intent(MainActivity.this, MsgActivity.class);
				startActivity(intent);}
		}


    @Override
	protected void onResume() {
		// TODO 自動生成されたメソッド・スタブ
		super.onResume();
		ImageButton imageButton2 = (ImageButton)findViewById(R.id.imageButton2);
		imageButton2.setOnClickListener(this);
	}


	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
    }



}
