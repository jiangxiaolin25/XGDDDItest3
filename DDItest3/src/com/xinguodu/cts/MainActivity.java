package com.xinguodu.cts;


import java.io.FileNotFoundException;
import java.io.IOException;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
//import exceltool.POIexcelwrite;
import tools.testtoolclass;

public class MainActivity extends Activity {

	private Button dukpt;
	private Button nkey;
	private Button printpre;
	private Button nkeyG;
	private Button ums;
	private Button xt;
	private Button arithmetic;
//	public POIexcelwrite mycreatexl;
	public static String model;// ��ȡ�����Ļ�����N5��N6��
	public static String version;// ��ȡ�ն˵�ϵͳ�汾 ��5.1.1 ��7.1.2

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);// ȥ��������
		setContentView(R.layout.activity_main);
		dukpt = (Button) findViewById(R.id.button1);
		nkey = (Button) findViewById(R.id.button2);
		nkeyG = (Button) findViewById(R.id.button3);
		printpre = (Button) findViewById(R.id.button4);
		ums = (Button) findViewById(R.id.button5);
		xt = (Button) findViewById(R.id.button6);
		arithmetic = (Button) findViewById(R.id.button7);
		model = android.os.Build.MODEL;
//		Log.v("TAG", model);
		version = Build.VERSION.RELEASE;
		// ����һ���ĵ�
				try {
					testtoolclass.creattitle();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		play();
	}

	private void play() {
		// TODO Auto-generated method stub
		dukpt.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, DukptActivity.class);

				MainActivity.this.startActivity(intent);
			}
		});

		nkey.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, NewinnerkeycaseActivity.class);
				MainActivity.this.startActivity(intent);
			}
		});

		nkeyG.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, InnerkeycaseGroupActivity.class);
				MainActivity.this.startActivity(intent);
			}
		});
		ums.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, UmsActivity.class);
				MainActivity.this.startActivity(intent);
			}
		});

		printpre.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, PrintActivity.class);
				MainActivity.this.startActivity(intent);
			}
		});

		xt.setOnClickListener(new OnClickListener() {	

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, XitongActivity.class);
				MainActivity.this.startActivity(intent);
			}
		});
		arithmetic.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, arithmeticActivity.class);
				MainActivity.this.startActivity(intent);
			}
		});
	}

}
