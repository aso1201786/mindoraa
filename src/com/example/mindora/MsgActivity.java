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
				//�C���e���g�̃C���X�^���X����
				Intent intent = new Intent(MsgActivity.this, MsoActivity.class);
				//����ʂ̃A�N�e�B�r�e�B�N��
				startActivity(intent);}

		}




	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.w_sentaku);
	}




	@Override
	protected void onResume() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		super.onResume();
		//�{�^����ID�ŒT���ă{�^���ϐ������
		Button button1 = (Button)findViewById(R.id.button1);
		//�{�^���ϐ��ɂꂷ�ȁ[��o�^
		button1.setOnClickListener(this);

	}


}