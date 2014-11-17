package com.example.mindora;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.content.Intent;

public class MsgActivity extends Activity implements
View.OnClickListener
{

	public void onClick(View v) {
		switch(v.getId()){
			case R.id.button1:
				//インテントのインスタンス生成
				Intent intent = new Intent(MsgActivity.this, MsoActivity.class);
				//次画面のアクティビティ起動
				startActivity(intent);}

		}




	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.w_sentaku);
	}




	@Override
	protected void onResume() {
		// TODO 自動生成されたメソッド・スタブ
		super.onResume();
		//ボタンをIDで探してボタン変数を作る
		Button button1 = (Button)findViewById(R.id.button1);
		//ボタン変数にれすなーを登録
		button1.setOnClickListener(this);

	}


}