package com.xinguodu.cts;

import com.xinguodu.ddiinterface.Ddi;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;
import tools.testtoolclass;

public class UmsActivity extends Activity {
	Ddi Ddi = new Ddi();
	private TextView tv;
	private TextView tv1;
	private Button bt1;
	private ScrollView scrollView;
	private Spinner spinner;
	private boolean Btflg = false;
	private boolean Thflg = true;
	private long TotalCount = 0;
	private long SucessCount = 0;
	private long Failcount = 0;
	private long SucessRate = 0;
	private TextView mTotalTextView = null;
	private TextView mSucessTextView = null;
	private TextView mFailTextView = null;
	private TextView mSucessRateTextView = null;
	private long flag = 0;
	private byte[] ipIn;
	private byte[] ipOut = new byte[200];
	private byte[] msg_summery = ByteUtils.hexString2ByteArray("12345678abcdEFBFABCDefBCabcdEFBF");

	private Thread mThread = new Thread(new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			while (Thflg) {
				if (Btflg) {
					testTek1();
					testTek2();
					testTek3();
					testTek4();
					testTek5();
					testTek6();
					testTek7();
					testTek8();
					testTek9();
					testTek10();
					testTek11();
					testTek12();
					testTek13();
					testTek14();
					testTek15();
					testTek16();
					testTek17();
					testTek18();
					testTek19();
					testTek20();
					testTek21();
					testTek22();
					testTek23();
					testTek24();
					testTek25();
					testTek26();
					testAuk1();
					testAuk2();
					testAuk3();
					testAuk4();
					testAuk5();
					testAuk6();
					testAuk7();
					testAuk8();
					testAuk9();
					testAuk9();
					// ��ȡ��ȫ��У��ֵ
					testsnCodeinfo();
					testTekinfo();
					testAukinfo();
					testterminfo();
					testmkinfo();
					// ��ȡ���������ն���Ϣ
					testcipherinfo();
					testcipherinfo0();
					// ���и���ص�
//					testcipherinfo1();
//					testcipherinfo2();
//					testcipherinfo3();
					testcipherinfo4();
					testcipherinfo5();
					testtusn();
					testAuk10();
					testAuk11();
					testAuk12();
					testAuk13();
					testAuk14();
					testTek27();
					testTek28();
					testTek35();
					testTek36();
					testTek37();
					testTek38();
					testAuk15();
					testAuk16();
					testAuk17();
					testAuk18();
					testAuk19();
					testAuk20();
					testAuk21();
					testAuk22();
					testAuk23();
					testTek39();
					testterminfo1();
					//ѹ������
					testtusn2();
					testAuk24();				
					testcipherinfo6();
					testend();
					Btflg = false;
				}
			}
		}
	});
	private Handler myHandler = new Handler() {
		public void handleMessage(Message msg) {
			String infoString = msg.obj.toString() + " ����ֵ: " + msg.arg1;
			if (infoString.contains("test")) {
				TotalCount++;
				tv.append(" " + msg.obj.toString() + "\n");
			} else {
				if (infoString.contains("ʧ��")) {
					if (flag != TotalCount) {
						Failcount++;
						flag = TotalCount;
					}
					tv1.append("   " + "test" + infoString + "\n");
				} else {
					tv.append("   " + infoString + "\n");
				}
			}
			scrollToBottom();
			SucessCount = TotalCount - Failcount;
			SucessRate = (SucessCount * 100) / TotalCount;
			mTotalTextView.setText("�ܴ���:" + TotalCount);
			mSucessTextView.setText("�ɹ�:" + SucessCount);
			mFailTextView.setText("ʧ��:" + Failcount);
			mSucessRateTextView.setText("�ɹ���:" + SucessRate + "%");
		}
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);// ȥ��������
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
		setContentView(R.layout.activity_ums);
		Ddi.ddi_ddi_sys_init();
		String data = "30303030abCDef99a1da25f1e411fea5";
		ipIn = ByteUtils.hexString2ByteArray(data);
		initview();
		mThread.start();
		run();
	}

	private void scrollToBottom() {
		scrollView.post(new Runnable() {
			public void run() {
				scrollView.smoothScrollTo(0, tv.getBottom());
			}
		});
	}

	private void myHandleDeal(String info, int ret) {
		try {
			testtoolclass.creatcsv(ret, info);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Message myMessage = myHandler.obtainMessage();
		myMessage.obj = info;
		myMessage.arg1 = ret;
		myHandler.sendMessage(myMessage);

	}

	private void initview() {
		tv = (TextView) findViewById(R.id.umstv);
		tv1 = (TextView) findViewById(R.id.umstv1);
		bt1 = (Button) findViewById(R.id.umsbt1);
		spinner = (Spinner) findViewById(R.id.umsspinner);
		scrollView = (ScrollView) findViewById(R.id.umsscrollView);
		mTotalTextView = (TextView) findViewById(R.id.umstext_total);
		mSucessTextView = (TextView) findViewById(R.id.umstext_sucess);
		mFailTextView = (TextView) findViewById(R.id.umstext_fail);
		mSucessRateTextView = (TextView) findViewById(R.id.umstext_sucess_rate);
	}

	private void run() {
		bt1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (Btflg) {
					Toast.makeText(getApplicationContext(), "�����У���ȴ�", Toast.LENGTH_SHORT).show();
//					Btflg = false;
				} else {
					Btflg = true;
				}
			}
		});
		spinner.setOnItemSelectedListener(new OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
				if (Btflg) {
					Toast.makeText(getApplicationContext(), "�����У���ȴ�", Toast.LENGTH_SHORT).show();
				} else {
					tv.setText("");
					switch (pos) {
					case 1:
						testTek1();
						break;
					case 2:
						testTek2();
						break;
					case 3:
						testTek3();
						break;
					case 4:
						testTek4();
						break;
					case 5:
						testTek5();
						break;
					case 6:
						testTek6();
						break;
					case 7:
						testTek7();
						break;
					case 8:
						testTek8();
						break;
					case 9:
						testTek9();
						break;
					case 10:
						testTek10();
						break;
					case 11:
						testTek11();
						break;
					case 12:
						testTek12();
						break;
					case 13:
						testTek13();
						break;
					case 14:
						testTek14();
						break;
					case 15:
						testTek15();
						break;
					case 16:
						testTek16();
						break;
					case 17:
						testTek17();
						break;
					case 18:
						testTek18();
						break;
					case 19:
						testTek19();
						break;
					case 20:
						testTek20();
						break;
					case 21:
						testTek21();
						break;
					case 22:
						testTek22();
						break;
					case 23:
						testTek23();
						break;
					case 24:
						testTek24();
						break;
					case 25:
						testTek25();
						break;
					case 26:
						testTek26();
						break;
					case 27:
						testAuk1();
						break;
					case 28:
						testAuk2();
						break;
					case 29:
						testAuk3();
						break;
					case 30:
						testAuk4();
						break;
					case 31:
						testAuk5();
						break;
					case 32:
						testAuk6();
						break;
					case 33:
						testAuk7();
						break;
					case 34:
						testAuk8();
						break;
					case 35:
						testAuk9();
						break;
					case 36:
						testsnCodeinfo();
						break;
					case 37:
						testTekinfo();
						break;
					case 38:
						testAukinfo();
						break;
					case 39:
						testterminfo();
						break;
					case 40:
						testmkinfo();
						break;
					case 41:
						testcipherinfo();
						break;
					case 42:
						testcipherinfo0();
						break;
					case 43:
						testcipherinfo1();
						break;
					case 44:
						testcipherinfo2();
						break;
					case 45:
						testcipherinfo3();
						break;
					case 46:
						testcipherinfo4();
						break;
					case 47:
						testcipherinfo6();
						break;
					case 48:
						testtusn();
						break;
					case 49:
						testAuk10();
						break;
					case 50:
						testAuk11();
						break;
					case 51:
						testAuk12();
						break;
					case 52:
						testAuk13();
						break;
					case 53:
						testAuk14();
						break;
					case 54:
						testTek27();
						break;
					case 55:
						testTek28();
						break;
					case 56:
						testTek35();
						break;
					case 57:
						testTek36();
						break;
					case 58:
						testTek37();
						break;
					case 59:
						testTek38();
						break;
					case 60:
						testAuk15();
						break;
					case 61:
						testAuk16();
						break;
					case 62:
						testAuk17();
						break;
					case 63:
						testAuk18();
						break;
					case 64:
						testAuk19();
						break;
					case 65:
						testAuk20();
						break;
					case 66:
						testAuk21();
						break;
					case 67:
						testAuk22();
						break;
					case 68:
						testAuk23();
						break;
					case 69:
						testTek39();
						break;
					case 70:
						testAuk24();
						break;
					case 71:
						testcipherinfo6();
						break;
					case 72:
						testterminfo1();
						break;
					case 73:
						testtusn2();
						break;

					default:
						break;
					}
				}
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// Another interface callback
			}
		});
	}

	private void testTek1() {
		myHandleDeal("testTek1����", 0);
		String m_cipher = "12345678abcdefbf";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] mk_cipher = new byte[8];
		byte[] DataOut = new byte[16];
		String data1 = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] msg_summery = ByteUtils.hexString2ByteArray(data1);
		String data2 = "23b4e1818650c0f39baab6669e063956";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk_cipher((byte) 0, (byte) 0, (byte) 2, (byte) 0, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);
		if (res1 == 0) {
			myHandleDeal("Tek��������Կ�ɹ�", res1);
			int res2 = Ddi.ddi_innerkey_des_encrypt(0, 2, 0, ipIn, msg_summery, 16, DataOut);
			String data = ByteUtils.byteArray2HexString(DataOut);
			if (res2 == 0 && data.equals(data2)) {
				myHandleDeal("����Կ���ܳɹ�", res2);
			} else {
				myHandleDeal("Tek1����Կ����ʧ��", res2);
			}
		} else {
			myHandleDeal("Tek1��������Կʧ��", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testTek2() {
		myHandleDeal("testTek2����", 0);
		String m_cipher = "12345678abcdefbf";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] mk_cipher = new byte[8];
		byte[] DataOut = new byte[16];
		String data1 = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] msg_summery = ByteUtils.hexString2ByteArray(data1);
		String data2 = "23b4e1818650c0f39baab6669e063956";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk_cipher((byte) 0, (byte) 0, (byte) 2, (byte) 0, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);
		if (res1 == 0) {
			myHandleDeal("Tek��������Կ�ɹ�", res1);
			int res2 = Ddi.ddi_innerkey_des_encrypt(0, 2, 0, ipIn, msg_summery, 16, DataOut);
			String data = ByteUtils.byteArray2HexString(DataOut);
			if (res2 == 0 && data.equals(data2)) {
				myHandleDeal("����Կ���ܳɹ�", res2);
			} else {
				myHandleDeal("Tek2����Կ����ʧ��", res2);
			}
		} else {
			myHandleDeal("Tek2��������Կʧ��", 0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testTek3() {
		myHandleDeal("testTek3����", 0);
		String m_cipher = "655EA628CF62585F";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] mk_cipher = new byte[8];
		byte[] DataOut = new byte[16];
		String data1 = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] msg_summery = ByteUtils.hexString2ByteArray(data1);
		String data2 = "8b18c930601f4ad94573f487b9406d95";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk_cipher((byte) 0, (byte) 0, (byte) 0, (byte) 0, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);
		if (res1 == 0) {
			myHandleDeal("Tek��������Կ�ɹ�", res1);
			int res2 = Ddi.ddi_innerkey_des_encrypt(0, 0, 0, ipIn, msg_summery, 16, DataOut);
			String data = ByteUtils.byteArray2HexString(DataOut);
			if (res2 == 0 && data.equals(data2)) {
				myHandleDeal("����Կ���ܳɹ�", res2);
			} else {
				myHandleDeal("Tek3����Կ����ʧ��", res2);
			}
		} else {
			myHandleDeal("Tek3��������Կʧ��", 0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testTek4() {
		myHandleDeal("testTek4����", 0);
		String m_cipher = "12345678abcdefbf";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] mk_cipher = new byte[8];
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk_cipher((byte) 0, (byte) 0, (byte) -1, (byte) 0, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);
		if (res1 == -6) {
			myHandleDeal("Tek��������Կ���Գɹ�", res1);
		} else {
			myHandleDeal("Tek4��������Կ����ʧ��", 0);
		}
		int res2 = Ddi.ddi_innerkey_update_mk_cipher((byte) 0, (byte) 0, (byte) 150, (byte) 0, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);
		if (res2 == -6) {
			myHandleDeal("Tek��������Կ���Գɹ�", res2);
		} else {
			myHandleDeal("Tek4��������Կ����ʧ��", 0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testTek5() {
		myHandleDeal("testTek5����", 0);
		String m_cipher = "e168332b6c49d3c7e168332b6c49d3c7";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] mk_cipher = new byte[16];
		byte[] DataOut = new byte[16];
		String data1 = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] msg_summery = ByteUtils.hexString2ByteArray(data1);
		String data2 = "8b18c930601f4ad94573f487b9406d95";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk_cipher((byte) 1, (byte) 5, (byte) 3, (byte) 0, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);
		if (res1 == 0) {
			myHandleDeal("Tek��������Կ�ɹ�", res1);
			int res2 = Ddi.ddi_innerkey_des_encrypt(0, 3, 0, ipIn, msg_summery, 16, DataOut);
			String data = ByteUtils.byteArray2HexString(DataOut);
			if (res2 == 0 && data.equals(data2)) {
				myHandleDeal("����Կ���ܳɹ�", res2);
			} else {
				myHandleDeal("Tek5����Կ����ʧ��", res2);
			}
		} else {
			myHandleDeal("Tek5��������Կʧ��", 0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testTek6() {
		myHandleDeal("testTek6����", 0);
		String m_cipher = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] mk_cipher = new byte[16];
		byte[] DataOut = new byte[16];
		String data1 = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] msg_summery = ByteUtils.hexString2ByteArray(data1);
		String data2 = "090caab316bf3906040eb7aa45d121af";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk_cipher((byte) 1, (byte) 5, (byte) 75, (byte) 0, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);
		if (res1 == 0) {
			myHandleDeal("Tek��������Կ�ɹ�", res1);
			int res2 = Ddi.ddi_innerkey_des_encrypt(0, 75, 0, ipIn, msg_summery, 16, DataOut);
			String data = ByteUtils.byteArray2HexString(DataOut);
			if (res2 == 0 && data.equals(data2)) {
				myHandleDeal("����Կ���ܳɹ�", res2);
			} else {
				myHandleDeal("Tek6����Կ����ʧ��", res2);
			}
		} else {
			myHandleDeal("Tek6��������Կʧ��", 0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testTek7() {
		myHandleDeal("testTek7����", 0);
		String m_cipher = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] mk_cipher = new byte[16];
		byte[] DataOut = new byte[16];
		String data1 = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] msg_summery = ByteUtils.hexString2ByteArray(data1);
		String data2 = "090caab316bf3906040eb7aa45d121af";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk_cipher((byte) 1, (byte) 5, (byte) 149, (byte) 0, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);
		if (res1 == 0) {
			myHandleDeal("Tek��������Կ�ɹ�", res1);
			int res2 = Ddi.ddi_innerkey_des_encrypt(0, 149, 0, ipIn, msg_summery, 16, DataOut);
			String data = ByteUtils.byteArray2HexString(DataOut);
			if (res2 == 0 && data.equals(data2)) {
				myHandleDeal("����Կ���ܳɹ�", res2);
			} else {
				myHandleDeal("Tek7����Կ����ʧ��", res2);
			}
		} else {
			myHandleDeal("Tek7��������Կʧ��", 0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testTek8() {
		myHandleDeal("testTek8����", 0);
		String m_cipher = "8608437ce3358d46f26bd44ec748a76e";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] mk_cipher = new byte[16];
		byte[] DataOut = new byte[16];
		String data1 = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] msg_summery = ByteUtils.hexString2ByteArray(data1);
		String data2 = "e98b55112a0c8cd2b72f8cff4e79abac";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk_cipher((byte) 1, (byte) 6, (byte) 9, (byte) 0, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);
		if (res1 == 0) {
			myHandleDeal("Tek��������Կ�ɹ�", res1);
			int res2 = Ddi.ddi_innerkey_des_encrypt(0, 9, 0, ipIn, msg_summery, 16, DataOut);
			String data = ByteUtils.byteArray2HexString(DataOut);
			if (res2 == 0 && data.equals(data2)) {
				myHandleDeal("����Կ���ܳɹ�", res2);
			} else {
				myHandleDeal("Tek8����Կ����ʧ��", res2);
			}
		} else {
			myHandleDeal("Tek8��������Կʧ��", 0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testTek9() {
		myHandleDeal("testTek9����", 0);
		String m_cipher = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] mk_cipher = new byte[16];
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk_cipher((byte) 1, (byte) 5, (byte) -1, (byte) 0, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);
		if (res1 == -6) {
			myHandleDeal("Tek��������Կ�ɹ�", res1);
		} else {
			myHandleDeal("Tek9��������Կʧ��", 0);
		}
		int res2 = Ddi.ddi_innerkey_update_mk_cipher((byte) 1, (byte) 5, (byte) 150, (byte) 0, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);
		if (res2 == -6) {
			myHandleDeal("Tek��������Կ�ɹ�", res2);
		} else {
			myHandleDeal("Tek9��������Կʧ��", 0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testTek10() {
		myHandleDeal("testTek10����", 0);
		String m_cipher = "2ba94f793ebb996c2ba94f793ebb996c2ba94f793ebb996c";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] mk_cipher = new byte[24];
		byte[] DataOut = new byte[16];
		String data1 = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] msg_summery = ByteUtils.hexString2ByteArray(data1);
		String data2 = "8b18c930601f4ad94573f487b9406d95";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk_cipher((byte) 2, (byte) 7, (byte) 5, (byte) 0, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);
		if (res1 == 0) {
			myHandleDeal("Tek��������Կ�ɹ�", res1);
			int res2 = Ddi.ddi_innerkey_des_encrypt(0, 5, 0, ipIn, msg_summery, 16, DataOut);
			String data = ByteUtils.byteArray2HexString(DataOut);
			if (res2 == 0 && data.equals(data2)) {
				myHandleDeal("����Կ���ܳɹ�", res2);
			} else {
				myHandleDeal("Tek10����Կ����ʧ��", res2);
			}
		} else {
			myHandleDeal("Tek10��������Կʧ��", 0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testTek11() {
		myHandleDeal("testTek11����", 0);
		String m_cipher = "12345678abcdefbfabcdefbcabcdefbf12345678abcdefbf";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] mk_cipher = new byte[24];
		byte[] DataOut = new byte[16];
		String data1 = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] msg_summery = ByteUtils.hexString2ByteArray(data1);
		String data2 = "a42efbf08bc70132ecd20702b042fa39";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk_cipher((byte) 2, (byte) 7, (byte) 75, (byte) 0, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);

		if (res1 == 0) {
			myHandleDeal("Tek��������Կ�ɹ�", res1);
			int res2 = Ddi.ddi_innerkey_des_encrypt(0, 75, 0, ipIn, msg_summery, 16, DataOut);
			String data = ByteUtils.byteArray2HexString(DataOut);
			// Ddi.ddi_innerkey_des_encrypt(0,149,1,ipIn,msg_summery,16,DataOut)
			if (res2 == 0 && data.equals(data2)) {
				myHandleDeal("����Կ���ܳɹ�" + data, res2);
			} else {
				myHandleDeal("Tek11����Կ����ʧ��", res2);
			}
		} else {
			myHandleDeal("Tek11��������Կʧ��", 0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testTek12() {
		myHandleDeal("testTek12����", 0);
		String m_cipher = "12345678abcdefbfabcdefbcabcdefbf12345678abcdefbf";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] mk_cipher = new byte[24];
		byte[] DataOut = new byte[16];
		String data1 = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] msg_summery = ByteUtils.hexString2ByteArray(data1);
		String data2 = "531F6E2675284D30CD75345DEE7B2FEF";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk_cipher((byte) 2, (byte) 7, (byte) 149, (byte) 0, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);
		if (res1 == 0) {
			myHandleDeal("Tek��������Կ�ɹ�", res1);
			int res2 = Ddi.ddi_innerkey_des_encrypt(0, 149, 1, ipIn, msg_summery, 16, DataOut);
			String data = ByteUtils.byteArray2HexString(DataOut);
			if (res2 == 0 && data.equalsIgnoreCase(data2)) {
				myHandleDeal("����Կ���ܳɹ�", res2);
			} else {
				myHandleDeal("Tek12����Կ����ʧ��" + data, res2);
			}
		} else {
			myHandleDeal("Tek12��������Կʧ��", 0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testTek13() {
		myHandleDeal("testTek13����", 0);
		String m_cipher = "12345678abcdefbfabcdefbcabcdefbf12345678abcdefbf";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] mk_cipher = new byte[16];
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk_cipher((byte) 2, (byte) 7, (byte) -1, (byte) 0, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);
		if (res1 == -6) {
			myHandleDeal("Tek��������Կ���Գɹ�", res1);
		} else {
			myHandleDeal("Tek13��������Կ����ʧ��", 1);
		}
		int res2 = Ddi.ddi_innerkey_update_mk_cipher((byte) 2, (byte) 7, (byte) 150, (byte) 0, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);
		if (res2 == -6) {
			myHandleDeal("Tek��������Կ���Գɹ�", res2);
		} else {
			myHandleDeal("Tek13��������Կ����ʧ��", 2);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testTek14() {
		myHandleDeal("testTek14����", 0);
		String m_cipher = "33bf56239a037e9c78bb702fce39e241";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] mk_cipher = new byte[16];
		byte[] DataOut = new byte[16];
		int[] DataOut1 = new int[16];
		String data1 = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] msg_summery = ByteUtils.hexString2ByteArray(data1);
		String data2 = "68866B0BDBEDDB66E1E7E96A920197FD";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk_cipher((byte) 3, (byte) 9, (byte) 7, (byte) 0, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);
		if (res1 == 0) {
			myHandleDeal("Tek��������Կ�ɹ�", res1);
//			int res2 = Ddi.ddi_innerkey_des_encrypt(0,7,0,ipIn,msg_summery,16,DataOut);
			int res2 = Ddi.ddi_innerkey_nes_sm4_encrypt(0, 7, (byte) 0, ipIn, msg_summery, msg_summery.length, DataOut,
					DataOut1);
			String data = ByteUtils.byteArray2HexString(DataOut);
			if (res2 == 0 && data.equalsIgnoreCase(data2)) {
				myHandleDeal("����Կ���ܳɹ�", res2);
			} else {
				myHandleDeal("Tek14����Կ����ʧ��", res2);
			}
		} else {
			myHandleDeal("Tek14��������Կʧ��", 0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testTek15() {
		myHandleDeal("testTek15����", 0);
		String m_cipher = "33bf56239a037e9c78bb702fce39e241";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] mk_cipher = new byte[16];
		byte[] DataOut = new byte[16];
		int[] DataOut1 = new int[16];
		String data1 = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] msg_summery = ByteUtils.hexString2ByteArray(data1);
		String data2 = "4096684F41E8E34B9B0AEB23D8320BF3";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk_cipher((byte) 3, (byte) 9, (byte) 75, (byte) 0, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);

		if (res1 == 0) {
			myHandleDeal("Tek��������Կ�ɹ�", res1);
			int res2 = Ddi.ddi_innerkey_nes_sm4_encrypt(0, 7, (byte) 1, ipIn, msg_summery, msg_summery.length, DataOut,
					DataOut1);
			String data = ByteUtils.byteArray2HexString(DataOut);
			if (res2 == 0 && data.equalsIgnoreCase(data2)) {
				myHandleDeal("����Կ���ܳɹ�", res2);
			} else {
				myHandleDeal("Tek15����Կ����ʧ��", res2);
			}
		} else {
			myHandleDeal("Tek15��������Կʧ��", 0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testTek16() {
		myHandleDeal("testTek16����", 0);
		String m_cipher = "33bf56239a037e9c78bb702fce39e241";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] mk_cipher = new byte[16];
		byte[] DataOut = new byte[16];
		int[] DataOut1 = new int[16];
		String data1 = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] msg_summery = ByteUtils.hexString2ByteArray(data1);
		String data2 = "FFE561CA558FC907F4F68DFFEE2BC37E";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk_cipher((byte) 3, (byte) 9, (byte) 149, (byte) 1, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);
		if (res1 == 0) {
			myHandleDeal("Tek��������Կ�ɹ�", res1);
//			int res2 = Ddi.ddi_innerkey_des_encrypt(0,149,0,ipIn,msg_summery,16,DataOut);
			int res2 = Ddi.ddi_innerkey_nes_sm4_encrypt(0, 149, (byte) 0, ipIn, msg_summery, msg_summery.length,
					DataOut, DataOut1);
			String data = ByteUtils.byteArray2HexString(DataOut);
			if (res2 == 0 && data.equalsIgnoreCase(data2)) {
				myHandleDeal("����Կ���ܳɹ�", res2);
			} else {
				myHandleDeal("Tek16����Կ����ʧ��", res2);
			}
		} else {
			myHandleDeal("Tek16��������Կʧ��", 0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testTek17() {
		myHandleDeal("testTek17����", 0);
		String m_cipher = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] mk_cipher = new byte[16];
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk_cipher((byte) 3, (byte) 9, (byte) -1, (byte) 0, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);
		if (res1 == -6) {
			myHandleDeal("Tek��������Կ���Գɹ�", res1);
		} else {
			myHandleDeal("Tek17��������Կ����ʧ��", 0);
		}
		int res2 = Ddi.ddi_innerkey_update_mk_cipher((byte) 3, (byte) 9, (byte) 150, (byte) 0, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);
		if (res2 == -6) {
			myHandleDeal("Tek��������Կ���Գɹ�", res2);
		} else {
			myHandleDeal("Tek17��������Կ����ʧ��", 0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testTek18() {
		myHandleDeal("testTek18����", 0);
		String m_cipher = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] mk_cipher = new byte[16];
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk_cipher((byte) -1, (byte) 7, (byte) 149, (byte) 0, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);
		if (res1 == -6) {
			myHandleDeal("Tek��������Կ���Գɹ�", res1);
		} else {
			myHandleDeal("Tek18��������Կ����ʧ��", 1);
		}
		int res2 = Ddi.ddi_innerkey_update_mk_cipher((byte) 5, (byte) 7, (byte) 149, (byte) 0, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);
		if (res2 == -6) {
			myHandleDeal("Tek��������Կ���Գɹ�", res2);
		} else {
			myHandleDeal("Tek18��������Կ����ʧ��", 2);
		}
		int res3 = Ddi.ddi_innerkey_update_mk_cipher((byte) 1, (byte) -1, (byte) 149, (byte) 0, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);
		if (res3 == -6) {
			myHandleDeal("Tek��������Կ���Գɹ�", res3);
		} else {
			myHandleDeal("Tek18��������Կ����ʧ��", 3);
		}
		int res4 = Ddi.ddi_innerkey_update_mk_cipher((byte) 3, (byte) 10, (byte) 149, (byte) 0, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);
		if (res4 == -6) {
			myHandleDeal("Tek��������Կ���Գɹ�", res4);
		} else {
			myHandleDeal("Tek18��������Կ����ʧ��", 4);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testTek19() {
		myHandleDeal("testTek19����", 0);
		String m_cipher = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] mk_cipher = new byte[16];
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk_cipher((byte) 0, (byte) 8, (byte) 149, (byte) 0, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);
		if (res1 == -6) {
			myHandleDeal("Tek��������Կ���Գɹ�", res1);
		} else {
			myHandleDeal("Tek19��������Կ����ʧ��" + res1, 1);
		}
		int res2 = Ddi.ddi_innerkey_update_mk_cipher((byte) 1, (byte) 8, (byte) 149, (byte) 0, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);
		if (res2 == -6) {
			myHandleDeal("Tek��������Կ���Գɹ�", res2);
		} else {
			myHandleDeal("Tek19��������Կ����ʧ��" + res2, 2);
		}
		int res3 = Ddi.ddi_innerkey_update_mk_cipher((byte) 2, (byte) 8, (byte) 149, (byte) 0, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);
		if (res3 == -6) {
			myHandleDeal("Tek��������Կ���Գɹ�", res3);
		} else {
			myHandleDeal("Tek19��������Կ����ʧ��" + res3, 3);
		}
		int res4 = Ddi.ddi_innerkey_update_mk_cipher((byte) 3, (byte) 8, (byte) 149, (byte) 0, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);
		if (res4 == -6) {
			myHandleDeal("Tek��������Կ���Գɹ�", res4);
		} else {
			myHandleDeal("Tek19��������Կ����ʧ��" + res4, 4);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testTek20() {
		myHandleDeal("testTek20����", 0);
		String m_cipher = "e168332b6c49d3c7e168332b6c49d3c7";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] mk_cipher = new byte[16];
		String data2 = "160C3DD91D81A36D160C3DD91D81A36D";

		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk_cipher((byte) 1, (byte) 5, (byte) 3, (byte) 1, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);
		if (res1 == 0) {
			int res2 = Ddi.ddi_innerkey_des_encrypt(0, 3, 0, ipIn, cipher, 16, mk_cipher);
			// int res2 = Ddi.ddi_innerkey_nes_sm4_encrypt(0, 7, (byte) 0, ipIn,
			// msg_summery, msg_summery.length, DataOut,DataOut1);
			String data = ByteUtils.byteArray2HexString(mk_cipher);

			if (res2 == 0 && data.equalsIgnoreCase(data2)) {
				myHandleDeal("����Կ���ܳɹ�", res2);
			} else {
				myHandleDeal("Tek14����Կ����ʧ��", res2);
			}

		} else {
			myHandleDeal("Tek20��������Կ����ʧ��", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testTek21() {
		myHandleDeal("testTek21����", 0);
		String m_cipher = "655EA628CF62585F655EA628CF62585F";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] mk_cipher = new byte[16];
		byte[] DataOut = new byte[16];
		String data1 = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] msg_summery = ByteUtils.hexString2ByteArray(data1);
		String data2 = "8b18c930601f4ad94573f487b9406d95";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk_cipher((byte) 1, (byte) 0, (byte) 2, (byte) 0, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);
		if (res1 == 0) {
			myHandleDeal("Tek��������Կ�ɹ�", res1);
			int res2 = Ddi.ddi_innerkey_des_encrypt(0, 2, 0, ipIn, msg_summery, 16, DataOut);
			String data = ByteUtils.byteArray2HexString(DataOut);
			if (res2 == 0 && data.equals(data2)) {
				myHandleDeal("����Կ���ܳɹ�", res2);
			} else {
				myHandleDeal("Tek21����Կ����ʧ��" + res2 + "****" + data, 2);
			}
		} else {
			myHandleDeal("Tek21��������Կʧ��", 1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testTek22() {
		myHandleDeal("testTek22����", 0);
		String m_cipher = "655EA628CF62585F655EA628CF62585F655EA628CF62585F";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] mk_cipher = new byte[24];
		byte[] DataOut = new byte[16];
		String data1 = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] msg_summery = ByteUtils.hexString2ByteArray(data1);
		String data2 = "8b18c930601f4ad94573f487b9406d95";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk_cipher((byte) 2, (byte) 0, (byte) 2, (byte) 0, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);
		if (res1 == 0) {
			myHandleDeal("Tek��������Կ�ɹ�", res1);
			int res2 = Ddi.ddi_innerkey_des_encrypt(0, 2, 0, ipIn, msg_summery, 16, DataOut);
			String data = ByteUtils.byteArray2HexString(DataOut);
			if (res2 == 0 && data.equals(data2)) {
				myHandleDeal("����Կ���ܳɹ�", res2);
			} else {
				myHandleDeal("Tek22����Կ����ʧ��" + res2 + "****" + data, 2);
			}
		} else {
			myHandleDeal("Tek22��������Կʧ��", 1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testTek23() {
		myHandleDeal("testTek23����", 0);
		String m_cipher = "e168332b6c49d3c7";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] mk_cipher = new byte[8];
		byte[] DataOut = new byte[16];
		String data1 = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] msg_summery = ByteUtils.hexString2ByteArray(data1);
		String data2 = "8b18c930601f4ad94573f487b9406d95";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk_cipher((byte) 0, (byte) 5, (byte) 75, (byte) 0, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);
		if (res1 == 0) {
			myHandleDeal("Tek��������Կ�ɹ�", res1);
			int res2 = Ddi.ddi_innerkey_des_encrypt(0, 75, 0, ipIn, msg_summery, 16, DataOut);
			String data = ByteUtils.byteArray2HexString(DataOut);
			if (res2 == 0 && data.equals(data2)) {
				myHandleDeal("����Կ���ܳɹ�", res2);
			} else {
				myHandleDeal("Tek23����Կ����ʧ��", 2);
			}
		} else {
			myHandleDeal("Tek23��������Կʧ��", 1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testTek24() {
		myHandleDeal("testTek24����", 0);
		String m_cipher = "e168332b6c49d3c7e168332b6c49d3c7e168332b6c49d3c7";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] mk_cipher = new byte[24];
		byte[] DataOut = new byte[16];
		String data1 = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] msg_summery = ByteUtils.hexString2ByteArray(data1);
		String data2 = "8b18c930601f4ad94573f487b9406d95";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk_cipher((byte) 2, (byte) 5, (byte) 75, (byte) 0, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);
		if (res1 == 0) {
			myHandleDeal("Tek��������Կ�ɹ�", res1);
			int res2 = Ddi.ddi_innerkey_des_encrypt(0, 75, 0, ipIn, msg_summery, 16, DataOut);
			String data = ByteUtils.byteArray2HexString(DataOut);
			if (res2 == 0 && data.equals(data2)) {
				myHandleDeal("����Կ���ܳɹ�", res2);
			} else {
				myHandleDeal("Tek24����Կ����ʧ��", 2);
			}
		} else {
			myHandleDeal("Tek24��������Կʧ��", 1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testTek25() {
		myHandleDeal("testTek25����", 0);
		String m_cipher = "e168332b6c49d3c7e168332b6c49d3c7";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] mk_cipher = new byte[16];
		byte[] DataOut = new byte[16];
		String data1 = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] msg_summery = ByteUtils.hexString2ByteArray(data1);
		int[] DataOut1 = new int[16];
		String data2 = "E052D4F2179F3E65F820CCE622A6F026";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk_cipher((byte) 3, (byte) 5, (byte) 75, (byte) 0, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);
		if (res1 == 0) {
			myHandleDeal("Tek��������Կ�ɹ�", res1);
			int res2 = Ddi.ddi_innerkey_nes_sm4_encrypt(0, 75, (byte) 1, ipIn, msg_summery, msg_summery.length, DataOut,
					DataOut1);
			String data = ByteUtils.byteArray2HexString(DataOut);
			if (res2 == 0 && data.equalsIgnoreCase(data2)) {
				myHandleDeal("����Կ���ܳɹ�", res2);
			} else {
				myHandleDeal("Tek25����Կ����ʧ��", 2);
			}
		} else {
			myHandleDeal("Tek25��������Կʧ��", 1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testTek26() {
		myHandleDeal("testTek26����", 0);
		String m_cipher = "33bf56239a037e9c78bb702fce39e241";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] mk_cipher = new byte[16];
		byte[] DataOut = new byte[16];
		String data1 = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] msg_summery = ByteUtils.hexString2ByteArray(data1);
		String data2 = "04a93599649ec88614497d0f48594ac8";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk_cipher((byte) 1, (byte) 9, (byte) 149, (byte) 0, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);
		if (res1 == 0) {
			myHandleDeal("Tek��������Կ�ɹ�", res1);
			int res2 = Ddi.ddi_innerkey_des_encrypt(0, 149, 0, ipIn, msg_summery, 16, DataOut);
			String data = ByteUtils.byteArray2HexString(DataOut);
			if (res2 == 0 && data.equals(data2)) {
				myHandleDeal("����Կ���ܳɹ�", res2);
			} else {
				myHandleDeal("Tek26����Կ����ʧ��", 2);
			}
		} else {
			myHandleDeal("Tek26��������Կʧ��", 1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testTek27() {
		myHandleDeal("testTek27����", 0);
		String m_cipher = "e168332b6c49d3c7e168332b6c49d3c7";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] mk_cipher = new byte[16];
		byte[] DataOut = new byte[16];
		String data1 = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] msg_summery = ByteUtils.hexString2ByteArray(data1);
		String data2 = "FC56F78B33B59C47C7EBD8D3D6C1425E";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk_cipher((byte) 1, (byte) 5, (byte) 3, (byte) 1, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);
		if (res1 == 0) {
			myHandleDeal("Tek��������Կ�ɹ�", res1);
			int res2 = Ddi.ddi_innerkey_des_encrypt(0, 3, 0, ipIn, msg_summery, 16, DataOut);
			String data = ByteUtils.byteArray2HexString(DataOut);
			if (res2 == 0 && data.equalsIgnoreCase(data2)) {
				myHandleDeal("����Կ���ܳɹ�", res2);
			} else {
				myHandleDeal("Tek5����Կ����ʧ��", res2);
			}
		} else {
			myHandleDeal("Tek5��������Կʧ��", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testTek28() {
		myHandleDeal("testTek28����", 0);
		String m_cipher = "2ba94f793ebb996c2ba94f793ebb996c2ba94f793ebb996c";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] mk_cipher = new byte[24];
		byte[] DataOut = new byte[16];
		String data1 = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] msg_summery = ByteUtils.hexString2ByteArray(data1);
		String data2 = "79221A744718775F0CAAA8E4E2716BD2";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk_cipher((byte) 2, (byte) 7, (byte) 5, (byte) 1, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);
		if (res1 == 0) {
			myHandleDeal("Tek��������Կ�ɹ�", res1);
			int res2 = Ddi.ddi_innerkey_des_encrypt(0, 5, 0, ipIn, msg_summery, 16, DataOut);
			String data = ByteUtils.byteArray2HexString(DataOut);
			if (res2 == 0 && data.equalsIgnoreCase(data2)) {
				myHandleDeal("����Կ���ܳɹ�", res2);
			} else {
				myHandleDeal("Tek10����Կ����ʧ��", res2);
			}
		} else {
			myHandleDeal("Tek10��������Կʧ��", 0);
		}
		Ddi.ddi_innerkey_close();
	}

	// TEK AES128 ���ܹ�����Կ
	private void testTek29() {
		myHandleDeal("testTek29����", 0);
		String m_cipher = "2ba94f793ebb996c2ba94f793ebb996c2ba94f793ebb996c";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] mk_cipher = new byte[16];
		byte[] DataOut = new byte[16];
		String data1 = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] msg_summery = ByteUtils.hexString2ByteArray(data1);
		String data2 = "79221A744718775F0CAAA8E4E2716BD2";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk_cipher((byte) 4, (byte) 7, (byte) 5, (byte) 1, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);
		if (res1 == 0) {
			myHandleDeal("Tek��������Կ�ɹ�", res1);
			int res2 = Ddi.ddi_innerkey_des_encrypt(0, 5, 0, ipIn, msg_summery, 16, DataOut);
			String data = ByteUtils.byteArray2HexString(DataOut);
			if (res2 == 0 && data.equalsIgnoreCase(data2)) {
				myHandleDeal("����Կ���ܳɹ�", res2);
			} else {
				myHandleDeal("Tek10����Կ����ʧ��", res2);
			}
		} else {
			myHandleDeal("Tek10��������Կʧ��", 0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testTek30() {
		myHandleDeal("testTek30����", 0);
		String m_cipher = "2ba94f793ebb996c2ba94f793ebb996c2ba94f793ebb996c";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] mk_cipher = new byte[16];
		byte[] DataOut = new byte[16];
		String data1 = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] msg_summery = ByteUtils.hexString2ByteArray(data1);
		String data2 = "79221A744718775F0CAAA8E4E2716BD2";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk_cipher((byte) 4, (byte) 7, (byte) 5, (byte) 0, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);
		if (res1 == 0) {
			myHandleDeal("Tek��������Կ�ɹ�", res1);
			int res2 = Ddi.ddi_innerkey_des_encrypt(0, 5, 0, ipIn, msg_summery, 16, DataOut);
			String data = ByteUtils.byteArray2HexString(DataOut);
			if (res2 == 0 && data.equalsIgnoreCase(data2)) {
				myHandleDeal("����Կ���ܳɹ�", res2);
			} else {
				myHandleDeal("Tek10����Կ����ʧ��", res2);
			}
		} else {
			myHandleDeal("Tek10��������Կʧ��", 0);
		}
		Ddi.ddi_innerkey_close();
	}

	// TEK AES192 ���ܹ�����Կ
	private void testTek31() {
		myHandleDeal("testTek31����", 0);
		String m_cipher = "2ba94f793ebb996c2ba94f793ebb996c2ba94f793ebb996c";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] mk_cipher = new byte[16];
		byte[] DataOut = new byte[16];
		String data1 = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] msg_summery = ByteUtils.hexString2ByteArray(data1);
		String data2 = "79221A744718775F0CAAA8E4E2716BD2";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk_cipher((byte) 5, (byte) 7, (byte) 5, (byte) 0, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);
		if (res1 == 0) {
			myHandleDeal("Tek��������Կ�ɹ�", res1);
			int res2 = Ddi.ddi_innerkey_des_encrypt(0, 5, 0, ipIn, msg_summery, 16, DataOut);
			String data = ByteUtils.byteArray2HexString(DataOut);
			if (res2 == 0 && data.equalsIgnoreCase(data2)) {
				myHandleDeal("����Կ���ܳɹ�", res2);
			} else {
				myHandleDeal("Tek10����Կ����ʧ��", res2);
			}
		} else {
			myHandleDeal("Tek10��������Կʧ��", 0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testTek32() {
		myHandleDeal("testTek31����", 0);
		String m_cipher = "2ba94f793ebb996c2ba94f793ebb996c2ba94f793ebb996c";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] mk_cipher = new byte[16];
		byte[] DataOut = new byte[16];
		String data1 = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] msg_summery = ByteUtils.hexString2ByteArray(data1);
		String data2 = "79221A744718775F0CAAA8E4E2716BD2";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk_cipher((byte) 5, (byte) 7, (byte) 5, (byte) 1, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);
		if (res1 == 0) {
			myHandleDeal("Tek��������Կ�ɹ�", res1);
			int res2 = Ddi.ddi_innerkey_des_encrypt(0, 5, 0, ipIn, msg_summery, 16, DataOut);
			String data = ByteUtils.byteArray2HexString(DataOut);
			if (res2 == 0 && data.equalsIgnoreCase(data2)) {
				myHandleDeal("����Կ���ܳɹ�", res2);
			} else {
				myHandleDeal("Tek10����Կ����ʧ��", res2);
			}
		} else {
			myHandleDeal("Tek10��������Կʧ��", 0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testTek33() {
		myHandleDeal("testTek31����", 0);
		String m_cipher = "2ba94f793ebb996c2ba94f793ebb996c2ba94f793ebb996c";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] mk_cipher = new byte[16];
		byte[] DataOut = new byte[16];
		String data1 = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] msg_summery = ByteUtils.hexString2ByteArray(data1);
		String data2 = "79221A744718775F0CAAA8E4E2716BD2";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk_cipher((byte) 6, (byte) 7, (byte) 5, (byte) 1, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);
		if (res1 == 0) {
			myHandleDeal("Tek��������Կ�ɹ�", res1);
			int res2 = Ddi.ddi_innerkey_des_encrypt(0, 5, 0, ipIn, msg_summery, 16, DataOut);
			String data = ByteUtils.byteArray2HexString(DataOut);
			if (res2 == 0 && data.equalsIgnoreCase(data2)) {
				myHandleDeal("����Կ���ܳɹ�", res2);
			} else {
				myHandleDeal("Tek10����Կ����ʧ��", res2);
			}
		} else {
			myHandleDeal("Tek10��������Կʧ��", 0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testTek34() {
		myHandleDeal("testTek31����", 0);
		String m_cipher = "2ba94f793ebb996c2ba94f793ebb996c2ba94f793ebb996c";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] mk_cipher = new byte[16];
		byte[] DataOut = new byte[16];
		String data1 = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] msg_summery = ByteUtils.hexString2ByteArray(data1);
		String data2 = "79221A744718775F0CAAA8E4E2716BD2";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk_cipher((byte) 6, (byte) 7, (byte) 5, (byte) 0, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);
		if (res1 == 0) {
			myHandleDeal("Tek��������Կ�ɹ�", res1);
			int res2 = Ddi.ddi_innerkey_des_encrypt(0, 5, 0, ipIn, msg_summery, 16, DataOut);
			String data = ByteUtils.byteArray2HexString(DataOut);
			if (res2 == 0 && data.equalsIgnoreCase(data2)) {
				myHandleDeal("����Կ���ܳɹ�", res2);
			} else {
				myHandleDeal("Tek10����Կ����ʧ��", res2);
			}
		} else {
			myHandleDeal("Tek10��������Կʧ��", 0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testTek35() {
		myHandleDeal("testTek35����", 0);
		String m_cipher = "33bf56239a037e9c78bb702fce39e241";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] mk_cipher = new byte[16];
		byte[] DataOut = new byte[16];
		int[] DataOut1 = new int[16];
		String data1 = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] msg_summery = ByteUtils.hexString2ByteArray(data1);
		String data2 = "68866B0BDBEDDB66E1E7E96A920197FD";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk_cipher((byte) 3, (byte) 9, (byte) 7, (byte) 0, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);
		if (res1 == 0) {
			myHandleDeal("Tek��������Կ�ɹ�", res1);
			int res2 = Ddi.ddi_innerkey_des_encrypt(0, 7, 0, ipIn, msg_summery, 16, DataOut);
//			int res2 = Ddi.ddi_innerkey_nes_sm4_encrypt(0, 7, (byte) 0, ipIn, msg_summery, msg_summery.length, DataOut,DataOut1);
			String data = ByteUtils.byteArray2HexString(DataOut);
			if (res2 == -6) {
				myHandleDeal("����Կ���ܳɹ�", 0);
			} else {
				myHandleDeal("Tek14����Կ����ʧ��", res2);
			}
		} else {
			myHandleDeal("Tek14��������Կʧ��", 0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testTek36() {
		myHandleDeal("testTek36����", 0);
		String m_cipher = "33bf56239a037e9c78bb702fce39e241";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] mk_cipher = new byte[16];
		byte[] DataOut = new byte[16];
		int[] DataOut1 = new int[16];
		String data1 = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] msg_summery = ByteUtils.hexString2ByteArray(data1);
		String data2 = "3F5FA2A00276FCD4F05467B241CC737A";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk_cipher((byte) 3, (byte) 9, (byte) 149, (byte) 1, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);
		if (res1 == 0) {
			myHandleDeal("Tek��������Կ�ɹ�", res1);
//			int res2 = Ddi.ddi_innerkey_des_encrypt(0,149,0,ipIn,msg_summery,16,DataOut);
			int res2 = Ddi.ddi_innerkey_nes_sm4_encrypt(0, 149, (byte) 1, ipIn, msg_summery, msg_summery.length,
					DataOut, DataOut1);
			String data = ByteUtils.byteArray2HexString(DataOut);
			if (res2 == 0 && data.equalsIgnoreCase(data2)) {
				myHandleDeal("����Կ���ܳɹ�", res2);
			} else {
				myHandleDeal("Tek16����Կ����ʧ��", res2);
			}
		} else {
			myHandleDeal("Tek16��������Կʧ��", 0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testTek37() {
		myHandleDeal("testTek37����", 0);
		String m_cipher = "12345678abcdefbf";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] mk_cipher = new byte[8];
		byte[] DataOut = new byte[16];
		String data1 = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] msg_summery = ByteUtils.hexString2ByteArray(data1);
		String data2 = "9A7DE41BABF862D4BF1C1D4F7B7CFA89";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk_cipher((byte) 0, (byte) 0, (byte) 2, (byte) 1, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);
		if (res1 == 0) {
			myHandleDeal("Tek��������Կ�ɹ�", res1);
			int res2 = Ddi.ddi_innerkey_des_encrypt(0, 2, 0, ipIn, msg_summery, 16, DataOut);
			String data = ByteUtils.byteArray2HexString(DataOut);
			if (res2 == 0 && data.equalsIgnoreCase(data2)) {
				myHandleDeal("����Կ���ܳɹ�", res2);
			} else {
				myHandleDeal("Tek1����Կ����ʧ��", res2);
			}
		} else {
			myHandleDeal("Tek1��������Կʧ��", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testTek38() {
		myHandleDeal("testTek38����", 0);
		String m_cipher = "12345678abcdefbfabcdefbcabcdefbf12345678abcdefbf";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] mk_cipher = new byte[24];
		byte[] DataOut = new byte[16];
		String data1 = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] msg_summery = ByteUtils.hexString2ByteArray(data1);
		String data2 = "F98CE6AB186C3039973B9F8C3F7F0F68";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk_cipher((byte) 2, (byte) 7, (byte) 149, (byte) 1, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);
		if (res1 == 0) {
			myHandleDeal("Tek��������Կ�ɹ�", res1);
			int res2 = Ddi.ddi_innerkey_des_encrypt(0, 149, 1, ipIn, msg_summery, 16, DataOut);
			String data = ByteUtils.byteArray2HexString(DataOut);
			if (res2 == 0 && data.equalsIgnoreCase(data2)) {
				myHandleDeal("����Կ���ܳɹ�", res2);
			} else {
				myHandleDeal("Tek12����Կ����ʧ��" + data, res2);
			}
		} else {
			myHandleDeal("Tek12��������Կʧ��", 0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testTek39() {
		myHandleDeal("testTek39����", 0);
		String m_cipher = "12345678abcdefbf";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] mk_cipher = new byte[8];
		byte[] DataOut = new byte[16];
		String data1 = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] msg_summery = ByteUtils.hexString2ByteArray(data1);
		String data2 = "23b4e1818650c0f39baab6669e063956";
		Ddi.ddi_innerkey_open();
		int res2 = Ddi.ddi_innerkey_update_mk_cipher((byte) 0, (byte) 0, (byte) 2, (byte) 0, ipIn, cipher,
				cipher.length, (byte) 0, mk_cipher);
		myHandleDeal("TEK��������Կ��ʱ" + res2, 0);
		long begin = System.currentTimeMillis();
		for (int i = 0; i < 500; i++) {
			int res1 = Ddi.ddi_innerkey_update_mk_cipher((byte) 0, (byte) 0, (byte) 2, (byte) 0, ipIn, cipher,
					cipher.length, (byte) 0, mk_cipher);
		}
		long end = System.currentTimeMillis();
		long current = end - begin;
		myHandleDeal("TEK��������Կ��ʱ" + current, 0);
		Ddi.ddi_innerkey_close();
	}

	// /*
	// * TEK��������Կ04 aes
	// */
	// @Test
	// public void testTek16(){
	// String m_cipher = "12345678abcdefbfabcdefbcabcdefbf";
	// byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
	// byte[] mk_cipher = new byte[16];
	// Ddi.ddi_innerkey_open();
	// assertEquals("0",-6,
	// Ddi.ddi_innerkey_update_mk_cipher((byte)3,(byte)1,(byte)-1,(byte)0,ipIn,cipher,cipher.length,(byte)0,mk_cipher));
	// assertEquals("0",-6,
	// Ddi.ddi_innerkey_update_mk_cipher((byte)3,(byte)1,(byte)150,(byte)0,ipIn,cipher,cipher.length,(byte)0,mk_cipher));
	// Ddi.ddi_innerkey_close();
	// }
	private void testend() {
		
//		myHandleDeal("82��83��Ҫ�ֿ�����ʧ��",-99);
		Thread thread = new Thread(new  Runnable() {
			public void run() {
				myHandleDeal("runall���Խ���", 0);
				
			}
		});
		thread.setDaemon(true);
		thread.start();
	}

	private void testAuk1() {
		myHandleDeal("testAuk1����", 0);
		String m_cipher = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] DataOut = new byte[16];
		byte[] DataOut1 = new byte[16];
		String data = "8b18c930601f4ad94573f487b9406d95";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_auk_data_process((byte) 1, (byte) 0, (byte) 0, 2, (byte) 0, ipIn, cipher, cipher.length,
				DataOut);
		String data1 = ByteUtils.byteArray2HexString(DataOut);
		if (res1 == 0 && data1.equals(data)) {
			myHandleDeal("Auk���ܳɹ�", res1);
			int res2 = Ddi.ddi_auk_data_process((byte) 0, (byte) 0, (byte) 0, 2, (byte) 0, ipIn, DataOut,
					DataOut.length, DataOut1);
			String data2 = ByteUtils.byteArray2HexString(DataOut1);
			if (res2 == 0 && data2.equals(m_cipher)) {
				myHandleDeal("Auk���ܳɹ�", res2);
			} else {
				myHandleDeal("Auk1����ʧ��", 2);
			}
		} else {
			myHandleDeal("Auk1����ʧ��", 1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testAuk2() {
		myHandleDeal("testAuk2����", 0);
		String m_cipher = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] DataOut = new byte[16];
		byte[] DataOut1 = new byte[16];
		String data = "1b4990374f1ef88a5da4e00c740d5aac";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_auk_data_process((byte) 1, (byte) 1, (byte) 5, 2, (byte) 0, ipIn, cipher, cipher.length,
				DataOut);
		String data1 = ByteUtils.byteArray2HexString(DataOut);
		if (res1 == 0 && data1.equals(data)) {
			myHandleDeal("Auk���ܳɹ�", res1);
			int res2 = Ddi.ddi_auk_data_process((byte) 0, (byte) 1, (byte) 5, 2, (byte) 0, ipIn, DataOut,
					DataOut.length, DataOut1);
			String data2 = ByteUtils.byteArray2HexString(DataOut1);
			if (res2 == 0 && data2.equals(m_cipher)) {
				myHandleDeal("Auk���ܳɹ�", res2);
			} else {
				myHandleDeal("Auk2����ʧ��", 2);
			}
		} else {
			myHandleDeal("Auk2����ʧ��", 1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testAuk3() {
		myHandleDeal("testAuk3����", 0);
		String m_cipher = "abcd03e3f01234560122334fedacbdef12345678abcdef1a";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] DataOut = new byte[24];
		byte[] DataOut1 = new byte[24];
		String data = "ef417f969a808f7d9e20953c79d9a1901b7ee11f10259474";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_auk_data_process((byte) 1, (byte) 2, (byte) 6, 2, (byte) 0, ipIn, cipher, cipher.length,
				DataOut);
		String data1 = ByteUtils.byteArray2HexString(DataOut);
		if (res1 == 0 && data1.equals(data)) {
			myHandleDeal("Auk���ܳɹ�", res1);
			int res2 = Ddi.ddi_auk_data_process((byte) 0, (byte) 2, (byte) 6, 2, (byte) 0, ipIn, DataOut,
					DataOut.length, DataOut1);
			String data2 = ByteUtils.byteArray2HexString(DataOut1);
			if (res2 == 0 && data2.equals(m_cipher)) {
				myHandleDeal("Auk���ܳɹ�", res2);
			} else {
				myHandleDeal("Auk3����ʧ��", 2);
			}
		} else {
			myHandleDeal("Auk3����ʧ��", 1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testAuk4() {
		myHandleDeal("testAuk4����", 0);
		String m_cipher = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] DataOut = new byte[16];
		byte[] DataOut1 = new byte[16];
		String data = "81323bf0cc8ce7270d828a7f913e8ffb";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_auk_data_process((byte) 1, (byte) 3, (byte) 9, 2, (byte) 0, ipIn, cipher, cipher.length,
				DataOut);
		String data1 = ByteUtils.byteArray2HexString(DataOut);
		if (res1 == 0 && data1.equals(data)) {
			myHandleDeal("Auk���ܳɹ�", res1);
			int res2 = Ddi.ddi_auk_data_process((byte) 0, (byte) 3, (byte) 9, 2, (byte) 0, ipIn, DataOut,
					DataOut.length, DataOut1);
			String data2 = ByteUtils.byteArray2HexString(DataOut1);
			if (res2 == 0 && data2.equals(m_cipher)) {
				myHandleDeal("Auk���ܳɹ�", res2);
			} else {
				myHandleDeal("Auk4����ʧ��" + res2, 2);
			}
		} else {
			myHandleDeal("Auk4����ʧ��", 1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testAuk5() {
		myHandleDeal("testAuk5����", 0);
		String m_cipher = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] DataOut = new byte[16];
		byte[] DataOut1 = new byte[16];
		String data = "a1dd252aa6d6144c140a544691723c60";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_auk_data_process((byte) 1, (byte) 3, (byte) 8, 2, (byte) 1, ipIn, cipher, cipher.length,
				DataOut);
		String data1 = ByteUtils.byteArray2HexString(DataOut);
		if (res1 == 0 && data1.equals(data)) {
			myHandleDeal("Auk���ܳɹ�", res1);
			int res2 = Ddi.ddi_auk_data_process((byte) 0, (byte) 3, (byte) 8, 2, (byte) 1, ipIn, DataOut,
					DataOut.length, DataOut1);
			String data2 = ByteUtils.byteArray2HexString(DataOut1);
			if (res2 == 0 && data2.equals(m_cipher)) {
				myHandleDeal("Auk���ܳɹ�", res2);
			} else {
				myHandleDeal("Auk5����ʧ��", 2);
			}
		} else {
			myHandleDeal("Auk5����ʧ��" + res1, 1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testAuk6() {
		String m_cipher = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] DataOut = new byte[16];
		byte[] DataOut1 = new byte[16];
		String data1 = "c1d4bd6ce905b3fc1e340002ca134e78";
		String data2 = "2dbae08c965c843fef7d7eb2804c85a5";
		String data3 = "9d082e46427f40248ce29ded28fc89bd";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_auk_data_process((byte) 1, (byte) 1, (byte) 7, 2, (byte) 0, ipIn, cipher, cipher.length,
				DataOut);
		String data4 = ByteUtils.byteArray2HexString(DataOut);
		if (res1 == 0 && data4.equals(data1)) {
			myHandleDeal("Auk���ܳɹ�", res1);
			int res2 = Ddi.ddi_auk_data_process((byte) 0, (byte) 1, (byte) 7, 2, (byte) 0, ipIn, DataOut,
					DataOut.length, DataOut1);
			String data5 = ByteUtils.byteArray2HexString(DataOut1);
			if (res2 == 0 && data5.equals(m_cipher)) {
				myHandleDeal("Auk���ܳɹ�", res2);
			} else {
				myHandleDeal("Auk6����ʧ��", 2);
			}
		} else {
			myHandleDeal("Auk6����ʧ��" + res1 + "==" + data4, 1);
		}
		int res3 = Ddi.ddi_auk_data_process((byte) 1, (byte) 1, (byte) 7, 0, (byte) 0, ipIn, cipher, cipher.length,
				DataOut);
		String data6 = ByteUtils.byteArray2HexString(DataOut);
		if (res3 == 0 && data6.equals(data2)) {
			myHandleDeal("Auk���ܳɹ�", res3);
			int res4 = Ddi.ddi_auk_data_process((byte) 0, (byte) 1, (byte) 7, 0, (byte) 0, ipIn, DataOut,
					DataOut.length, DataOut1);
			String data7 = ByteUtils.byteArray2HexString(DataOut1);
			if (res4 == 0 && data7.equals(m_cipher)) {
				myHandleDeal("Auk���ܳɹ�", res4);
			} else {
				myHandleDeal("Auk6����ʧ��", 4);
			}
		} else {
			myHandleDeal("Auk6����ʧ��" + res3 + "==" + data6, 3);
		}
		int res5 = Ddi.ddi_auk_data_process((byte) 1, (byte) 1, (byte) 7, 1, (byte) 0, ipIn, cipher, cipher.length,
				DataOut);
		String data8 = ByteUtils.byteArray2HexString(DataOut);
		if (res5 == 0 && data8.equals(data3)) {
			myHandleDeal("Auk���ܳɹ�", res5);
			int res6 = Ddi.ddi_auk_data_process((byte) 0, (byte) 1, (byte) 7, 1, (byte) 0, ipIn, DataOut,
					DataOut.length, DataOut1);
			String data9 = ByteUtils.byteArray2HexString(DataOut1);
			if (res6 == 0 && data9.equals(m_cipher)) {
				myHandleDeal("Auk���ܳɹ�", res6);
			} else {
				myHandleDeal("Auk6����ʧ��", 6);
			}
		} else {
			myHandleDeal("Auk6����ʧ��" + res5 + "==" + data8, 5);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testAuk7() {
		myHandleDeal("testAuk7����", 0);
		String m_cipher = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] DataOut = new byte[16];
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_auk_data_process((byte) -1, (byte) 3, (byte) 8, 0, (byte) 1, ipIn, cipher, cipher.length,
				DataOut);
		if (res1 == -6) {
			myHandleDeal("Auk���ܲ��Գɹ�", res1);
		} else {
			myHandleDeal("Auk7���ܲ���ʧ��", 1);
		}
		int res2 = Ddi.ddi_auk_data_process((byte) 2, (byte) 3, (byte) 8, 0, (byte) 1, ipIn, cipher, cipher.length,
				DataOut);
		if (res2 == -6) {
			myHandleDeal("Auk���ܲ��Գɹ�", res2);
		} else {
			myHandleDeal("Auk7���ܲ���ʧ��", 2);
		}
		int res3 = Ddi.ddi_auk_data_process((byte) 1, (byte) -1, (byte) 8, 0, (byte) 1, ipIn, cipher, cipher.length,
				DataOut);
		if (res3 == -6) {
			myHandleDeal("Auk���ܲ��Գɹ�", res3);
		} else {
			myHandleDeal("Auk7���ܲ���ʧ��", 3);
		}
		int res4 = Ddi.ddi_auk_data_process((byte) 1, (byte) 5, (byte) 8, 0, (byte) 1, ipIn, cipher, cipher.length,
				DataOut);
		if (res4 == -6) {
			myHandleDeal("Auk���ܲ��Գɹ�", res4);
		} else {
			myHandleDeal("Auk7���ܲ���ʧ��", 4);
		}
		int res5 = Ddi.ddi_auk_data_process((byte) 0, (byte) 3, (byte) 10, 2, (byte) 1, ipIn, DataOut, DataOut.length,
				DataOut);
		if (res5 == -6) {
			myHandleDeal("Auk���ܲ��Գɹ�", res5);
		} else {
			myHandleDeal("Auk7���ܲ���ʧ��", 5);
		}
		int res6 = Ddi.ddi_auk_data_process((byte) 0, (byte) 3, (byte) 10, 2, (byte) 3, ipIn, DataOut, DataOut.length,
				DataOut);
		if (res6 == -6) {
			myHandleDeal("Auk���ܲ��Գɹ�", res6);
		} else {
			myHandleDeal("Auk7���ܲ���ʧ��", 6);
		}
		int res7 = Ddi.ddi_auk_data_process((byte) 0, (byte) 3, (byte) -1, 2, (byte) 1, ipIn, DataOut, DataOut.length,
				DataOut);
		if (res7 == -6) {
			myHandleDeal("Auk���ܲ��Գɹ�", res7);
		} else {
			myHandleDeal("Auk7���ܲ���ʧ��", 7);
		}
		int res8 = Ddi.ddi_auk_data_process((byte) 0, (byte) 3, (byte) 8, 3, (byte) 1, ipIn, DataOut, DataOut.length,
				DataOut);
		if (res8 == -6) {// �쳣ֵ���سɹ�
			myHandleDeal("Auk���ܲ��Գɹ�", res8);
		} else {
			myHandleDeal("Auk7���ܲ���ʧ��" + res8, 8);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testAuk8() {
		myHandleDeal("testAuk8����", 0);
		String m_cipher = "";
		for (int i = 0; i < 32; i++) {
			m_cipher = m_cipher + "12345678abcdefbfabcdefbcabcdefbf";
		}
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] DataOut = new byte[512];
		byte[] DataOut1 = new byte[512];
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_auk_data_process((byte) 1, (byte) 1, (byte) 7, 2, (byte) 0, ipIn, cipher, cipher.length,
				DataOut);
		if (res1 == 0) {
			myHandleDeal("Auk���ܳɹ�", res1);
			int res2 = Ddi.ddi_auk_data_process((byte) 0, (byte) 1, (byte) 7, 2, (byte) 0, ipIn, DataOut,
					DataOut.length, DataOut1);
			String data1 = ByteUtils.byteArray2HexString(DataOut1);
			if (res2 == 0 && data1.equals(m_cipher)) {
				myHandleDeal("Auk���ܳɹ�", res2);
			} else {
				myHandleDeal("Auk8����ʧ��", 2);
			}
		} else {
			myHandleDeal("Auk8����ʧ��" + res1, 1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testAuk9() {
		myHandleDeal("testAuk9����", 0);
		String m_cipher = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] DataOut = new byte[16];
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_auk_data_process((byte) 1, (byte) 2, (byte) 1, 0, (byte) 1, ipIn, cipher, cipher.length,
				DataOut);
		if (res1 == -6) {
			myHandleDeal("Auk���ܲ��Գɹ�", res1);
		} else {
			myHandleDeal("Auk9���ܲ���ʧ��" + res1, 1);
		}
		int res2 = Ddi.ddi_auk_data_process((byte) 0, (byte) 3, (byte) 1, 0, (byte) 1, ipIn, cipher, cipher.length,
				DataOut);
		if (res2 == -6) {
			myHandleDeal("Auk���ܲ��Գɹ�", res2);
		} else {
			myHandleDeal("Auk9���ܲ���ʧ��" + res2, 2);
		}
		Ddi.ddi_innerkey_close();
	}

	// ģʽΪcbc N5�ϻ�ûʵ�֣�N5S��OK��
	private void testAuk10() {
		myHandleDeal("testAuk10����", 0);
		String m_cipher = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] DataOut = new byte[16];
		byte[] DataOut1 = new byte[16];
		String data = "53E5A6F058D8AB2DAC1ABB37C4D2F710";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_auk_data_process((byte) 1, (byte) 0, (byte) 0, 2, (byte) 1, ipIn, cipher, cipher.length,
				DataOut);
		String data1 = ByteUtils.byteArray2HexString(DataOut);
		if (res1 == 0 && data1.equalsIgnoreCase(data)) {
			myHandleDeal("Auk���ܳɹ�", res1);
			int res2 = Ddi.ddi_auk_data_process((byte) 0, (byte) 0, (byte) 0, 2, (byte) 1, ipIn, DataOut,
					DataOut.length, DataOut1);
			String data2 = ByteUtils.byteArray2HexString(DataOut1);
			if (res2 == 0 && data2.equals(m_cipher)) {
				myHandleDeal("Auk���ܳɹ�", res2);
			} else {
				myHandleDeal("Auk10����ʧ��", res2);
			}
		} else {
			myHandleDeal("Auk10����ʧ��" + data1, res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testAuk11() {
		myHandleDeal("testAuk11����", 0);
		String m_cipher = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] DataOut = new byte[16];
		byte[] DataOut1 = new byte[16];
		String data = "E4D24271A04A72C8090E16E7ED308E3C";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_auk_data_process((byte) 1, (byte) 1, (byte) 5, 2, (byte) 1, ipIn, cipher, cipher.length,
				DataOut);
		String data1 = ByteUtils.byteArray2HexString(DataOut);
		if (res1 == 0 && data1.equalsIgnoreCase(data)) {
			myHandleDeal("Auk���ܳɹ�", res1);
			int res2 = Ddi.ddi_auk_data_process((byte) 0, (byte) 1, (byte) 5, 2, (byte) 1, ipIn, DataOut,
					DataOut.length, DataOut1);
			String data2 = ByteUtils.byteArray2HexString(DataOut1);
			if (res2 == 0 && data2.equalsIgnoreCase(m_cipher)) {
				myHandleDeal("Auk���ܳɹ�", res2);
			} else {
				myHandleDeal("Auk11����ʧ��", 2);
			}
		} else {
			myHandleDeal("Auk11����ʧ��" + res1, 1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testAuk12() {
		myHandleDeal("testAuk12����", 0);
		String m_cipher = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] DataOut = new byte[16];
		byte[] DataOut1 = new byte[16];
		String data = "53E5A6F058D8AB2DAC1ABB37C4D2F710";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_auk_data_process((byte) 1, (byte) 0, (byte) 0, 1, (byte) 1, ipIn, cipher, cipher.length,
				DataOut);
		String data1 = ByteUtils.byteArray2HexString(DataOut);
		if (res1 == -6) {
			myHandleDeal("Auk���ܳɹ�", res1);
			int res2 = Ddi.ddi_auk_data_process((byte) 0, (byte) 0, (byte) 0, 0, (byte) 1, ipIn, DataOut,
					DataOut.length, DataOut1);
			String data2 = ByteUtils.byteArray2HexString(DataOut1);
			if (res2 == -6) {
				myHandleDeal("Auk���ܳɹ�", res2);
			} else {
				myHandleDeal("Auk10����ʧ��", res2);
			}
		} else {
			myHandleDeal("Auk10����ʧ��" + data1, res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testAuk13() {
		myHandleDeal("testAuk13����", 0);
		String m_cipher = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] DataOut = new byte[16];
		byte[] DataOut1 = new byte[16];
		String data = "E4D24271A04A72C8090E16E7ED308E3C";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_auk_data_process((byte) 1, (byte) 1, (byte) 5, 3, (byte) 1, ipIn, cipher, cipher.length,
				DataOut);
		String data1 = ByteUtils.byteArray2HexString(DataOut);
		if (res1 == -6) {
			myHandleDeal("Auk���ܳɹ�", res1);
			int res2 = Ddi.ddi_auk_data_process((byte) 2, (byte) 1, (byte) 5, 1, (byte) 1, ipIn, DataOut,
					DataOut.length, DataOut1);
			String data2 = ByteUtils.byteArray2HexString(DataOut1);
			if (res2 == -6) {
				myHandleDeal("Auk���ܳɹ�", res2);
			} else {
				myHandleDeal("Auk13����ʧ��", 2);
			}
		} else {
			myHandleDeal("Auk13����ʧ��" + res1, 1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testAuk14() {
		myHandleDeal("testAuk14����", 0);
		String m_cipher = "abcd03e3f01234560122334fedacbdef12345678abcdef1a";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] DataOut = new byte[24];
		byte[] DataOut1 = new byte[24];
		String data = "46469149515B3E2E157A5FB7EDD169B2F6F19C97CBF4268F";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_auk_data_process((byte) 1, (byte) 2, (byte) 6, 2, (byte) 1, ipIn, cipher, cipher.length,
				DataOut);
		String data1 = ByteUtils.byteArray2HexString(DataOut);
		if (res1 == 0 && data1.equalsIgnoreCase(data)) {
			myHandleDeal("Auk���ܳɹ�", res1);
			int res2 = Ddi.ddi_auk_data_process((byte) 0, (byte) 2, (byte) 6, 2, (byte) 1, ipIn, DataOut,
					DataOut.length, DataOut1);
			String data2 = ByteUtils.byteArray2HexString(DataOut1);
			if (res2 == 0 && data2.equals(m_cipher)) {
				myHandleDeal("Auk���ܳɹ�", res2);
			} else {
				myHandleDeal("Auk14����ʧ��" + data2, res2);
			}
		} else {
			myHandleDeal("Auk14����ʧ��" + data1, res1);
		}
		Ddi.ddi_innerkey_close();
	}

	// AES-192 CBC ģʽ
	private void testAuk15() {
		myHandleDeal("testAuk15����", 0);
		String m_cipher = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] DataOut = new byte[16];
		byte[] DataOut1 = new byte[16];
		String data = "E4D24271A04A72C8090E16E7ED308E3C";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_auk_data_process((byte) 1, (byte) 4, (byte) 5, 2, (byte) 1, ipIn, cipher, cipher.length,
				DataOut);
		String data1 = ByteUtils.byteArray2HexString(DataOut);
		if (res1 == -6) {
			myHandleDeal("Auk���ܳɹ�", res1);
			int res2 = Ddi.ddi_auk_data_process((byte) 0, (byte) 4, (byte) 5, 2, (byte) 1, ipIn, DataOut,
					DataOut.length, DataOut1);
			String data2 = ByteUtils.byteArray2HexString(DataOut1);
			if (res2 == -6) {
				myHandleDeal("Auk���ܳɹ�", res2);
			} else {
				myHandleDeal("Auk11����ʧ��", 2);
			}
		} else {
			myHandleDeal("Auk11����ʧ��", 1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testAuk16() {
		myHandleDeal("testAuk16����", 0);
		String m_cipher = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] DataOut = new byte[16];
		byte[] DataOut1 = new byte[16];
		String data = "E4D24271A04A72C8090E16E7ED308E3C";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_auk_data_process((byte) 1, (byte) 4, (byte) 5, 2, (byte) 0, ipIn, cipher, cipher.length,
				DataOut);
		String data1 = ByteUtils.byteArray2HexString(DataOut);
		if (res1 == -6) {
			myHandleDeal("Auk���ܳɹ�", res1);
			int res2 = Ddi.ddi_auk_data_process((byte) 0, (byte) 4, (byte) 5, 2, (byte) 0, ipIn, DataOut,
					DataOut.length, DataOut1);
			String data2 = ByteUtils.byteArray2HexString(DataOut1);
			if (res2 == -6) {
				myHandleDeal("Auk���ܳɹ�", res2);
			} else {
				myHandleDeal("Auk11����ʧ��", 2);
			}
		} else {
			myHandleDeal("Auk11����ʧ��", 1);
		}
		Ddi.ddi_innerkey_close();
	}

	// AES-192 ECB
	private void testAuk17() {
		myHandleDeal("testAuk16����", 0);
		String m_cipher = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] DataOut = new byte[24];
		byte[] DataOut1 = new byte[24];
		String data = "E4D24271A04A72C8090E16E7ED308E3C";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_auk_data_process((byte) 1, (byte) 5, (byte) 5, 2, (byte) 0, ipIn, cipher, cipher.length,
				DataOut);
		String data1 = ByteUtils.byteArray2HexString(DataOut);
		if (res1 == -6) {
			myHandleDeal("Auk���ܳɹ�", res1);
			int res2 = Ddi.ddi_auk_data_process((byte) 0, (byte) 5, (byte) 5, 2, (byte) 0, ipIn, DataOut,
					DataOut.length, DataOut1);
			String data2 = ByteUtils.byteArray2HexString(DataOut1);
			if (res2 == -6) {
				myHandleDeal("Auk���ܳɹ�", res2);
			} else {
				myHandleDeal("Auk11����ʧ��", 2);
			}
		} else {
			myHandleDeal("Auk11����ʧ��", 1);
		}
		Ddi.ddi_innerkey_close();
	}

	//
	private void testAuk18() {
		myHandleDeal("testAuk16����", 0);
		String m_cipher = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] DataOut = new byte[24];
		byte[] DataOut1 = new byte[24];
		String data = "E4D24271A04A72C8090E16E7ED308E3C";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_auk_data_process((byte) 1, (byte) 5, (byte) 5, 2, (byte) 1, ipIn, cipher, cipher.length,
				DataOut);
		String data1 = ByteUtils.byteArray2HexString(DataOut);
		if (res1 == -6) {
			myHandleDeal("Auk���ܳɹ�", res1);
			int res2 = Ddi.ddi_auk_data_process((byte) 0, (byte) 5, (byte) 5, 2, (byte) 1, ipIn, DataOut,
					DataOut.length, DataOut1);
			String data2 = ByteUtils.byteArray2HexString(DataOut1);
			if (res2 == -6) {
				myHandleDeal("Auk���ܳɹ�" + res1 + res2, res2);
			} else {
				myHandleDeal("Auk11����ʧ��", 2);
			}
		} else {
			myHandleDeal("Auk11����ʧ��" + res1, 1);
		}
		Ddi.ddi_innerkey_close();
	}

	// AES-256
	private void testAuk19() {
		myHandleDeal("testAuk16����", 0);
		String m_cipher = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] DataOut = new byte[32];
		byte[] DataOut1 = new byte[32];
		String data = "E4D24271A04A72C8090E16E7ED308E3C";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_auk_data_process((byte) 1, (byte) 6, (byte) 5, 2, (byte) 1, ipIn, cipher, cipher.length,
				DataOut);
		String data1 = ByteUtils.byteArray2HexString(DataOut);
		if (res1 == -6) {
			myHandleDeal("Auk���ܳɹ�", res1);
			int res2 = Ddi.ddi_auk_data_process((byte) 0, (byte) 6, (byte) 5, 2, (byte) 1, ipIn, DataOut,
					DataOut.length, DataOut1);
			String data2 = ByteUtils.byteArray2HexString(DataOut1);
			if (res2 == -6) {
				myHandleDeal("Auk���ܳɹ�", res2);
			} else {
				myHandleDeal("Auk11����ʧ��", 2);
			}
		} else {
			myHandleDeal("Auk11����ʧ��", 1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testAuk20() {
		myHandleDeal("testAuk16����", 0);
		String m_cipher = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] DataOut = new byte[32];
		byte[] DataOut1 = new byte[32];
		String data = "E4D24271A04A72C8090E16E7ED308E3C";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_auk_data_process((byte) 1, (byte) 6, (byte) 5, 2, (byte) 0, ipIn, cipher, cipher.length,
				DataOut);
		String data1 = ByteUtils.byteArray2HexString(DataOut);
		if (res1 == -6) {
			myHandleDeal("Auk���ܳɹ�", res1);
			int res2 = Ddi.ddi_auk_data_process((byte) 0, (byte) 6, (byte) 5, 2, (byte) 0, ipIn, DataOut,
					DataOut.length, DataOut1);
			String data2 = ByteUtils.byteArray2HexString(DataOut1);
			if (res2 == -6) {
				myHandleDeal("Auk���ܳɹ�", res2);
			} else {
				myHandleDeal("Auk11����ʧ��", 2);
			}
		} else {
			myHandleDeal("Auk11����ʧ��", 1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testAuk21() {
		myHandleDeal("testAuk5����", 0);
		String m_cipher = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] DataOut = new byte[16];
		byte[] DataOut1 = new byte[16];
		String data = "a1dd252aa6d6144c140a544691723c60";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_auk_data_process((byte) 1, (byte) 3, (byte) 8, 0, (byte) 1, ipIn, cipher, cipher.length,
				DataOut);
		String data1 = ByteUtils.byteArray2HexString(DataOut);
		if (res1 == -6) {
			myHandleDeal("Auk���ܳɹ�", res1);
			int res2 = Ddi.ddi_auk_data_process((byte) 0, (byte) 3, (byte) 8, 1, (byte) 1, ipIn, DataOut,
					DataOut.length, DataOut1);
			String data2 = ByteUtils.byteArray2HexString(DataOut1);
			if (res2 == -6) {
				myHandleDeal("Auk���ܳɹ�", res2);
			} else {
				myHandleDeal("Auk5����ʧ��", 2);
			}
		} else {
			myHandleDeal("Auk5����ʧ��" + res1, 1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testAuk22() {
		myHandleDeal("testAuk22����", 0);
		String m_cipher = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] DataOut = new byte[16];
		byte[] DataOut1 = new byte[16];
		String data1 = "D7DB85174F7392C33B5995DEB7B5113F";
		String data2 = "AF57E0754724B3833BBD1677D47D41AA";
		String data3 = "7537C0D80C4BEB88E2D3D2BA375478DE";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_auk_data_process((byte) 1, (byte) 1, (byte) 7, 2, (byte) 1, ipIn, cipher, cipher.length,
				DataOut);
		String data4 = ByteUtils.byteArray2HexString(DataOut);
		if (res1 == 0 && data4.equalsIgnoreCase(data1)) {
			myHandleDeal("Auk���ܳɹ�", res1);
			int res2 = Ddi.ddi_auk_data_process((byte) 0, (byte) 1, (byte) 7, 2, (byte) 1, ipIn, DataOut,
					DataOut.length, DataOut1);
			String data5 = ByteUtils.byteArray2HexString(DataOut1);
			if (res2 == 0 && data5.equals(m_cipher)) {
				myHandleDeal("Auk���ܳɹ�", res2);
			} else {
				myHandleDeal("Auk22����ʧ��", 2);
			}
		} else {
			myHandleDeal("Auk22����ʧ��" + res1 + "**" + data4, 1);
		}
		int res3 = Ddi.ddi_auk_data_process((byte) 1, (byte) 1, (byte) 7, 0, (byte) 1, ipIn, cipher, cipher.length,
				DataOut);
		String data6 = ByteUtils.byteArray2HexString(DataOut);
		if (res3 == 0 && data6.equalsIgnoreCase(data2)) {
			myHandleDeal("Auk���ܳɹ�", res3);
			int res4 = Ddi.ddi_auk_data_process((byte) 0, (byte) 1, (byte) 7, 0, (byte) 1, ipIn, DataOut,
					DataOut.length, DataOut1);
			String data7 = ByteUtils.byteArray2HexString(DataOut1);
			if (res4 == 0 && data7.equals(m_cipher)) {
				myHandleDeal("Auk���ܳɹ�", res4);
			} else {
				myHandleDeal("Auk22����ʧ��", 4);
			}
		} else {
			myHandleDeal("Auk22����ʧ��" + res3 + "**" + data6, 3);
		}
		int res5 = Ddi.ddi_auk_data_process((byte) 1, (byte) 1, (byte) 7, 1, (byte) 1, ipIn, cipher, cipher.length,
				DataOut);
		String data8 = ByteUtils.byteArray2HexString(DataOut);
		if (res5 == 0 && data8.equalsIgnoreCase(data3)) {
			myHandleDeal("Auk���ܳɹ�", res5);
			int res6 = Ddi.ddi_auk_data_process((byte) 0, (byte) 1, (byte) 7, 1, (byte) 1, ipIn, DataOut,
					DataOut.length, DataOut1);
			String data9 = ByteUtils.byteArray2HexString(DataOut1);
			if (res6 == 0 && data9.equals(m_cipher)) {
				myHandleDeal("Auk���ܳɹ�", res6);
			} else {
				myHandleDeal("Auk22����ʧ��", 6);
			}
		} else {
			myHandleDeal("Auk22����ʧ��" + res5 + "**" + data8, 5);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testAuk23() {
		myHandleDeal("testAuk23����", 0);
		String m_cipher = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
		byte[] DataOut = new byte[16];
		byte[] DataOut1 = new byte[16];
		String data = "8b18c930601f4ad94573f487b9406d95";
		Ddi.ddi_innerkey_open();
		int res3 = Ddi.ddi_auk_data_process((byte) 1, (byte) 0, (byte) 0, 2, (byte) 0, ipIn, cipher, cipher.length,
				DataOut);
		int res4 = Ddi.ddi_auk_data_process((byte) 0, (byte) 0, (byte) 0, 2, (byte) 0, ipIn, DataOut, DataOut.length,
				DataOut1);
		myHandleDeal("AUK���ܺͽ�����ʱ" + res3 + res4, 0);
		long begin = System.currentTimeMillis();
		for (int i = 0; i < 500; i++) {
			int res1 = Ddi.ddi_auk_data_process((byte) 1, (byte) 0, (byte) 0, 2, (byte) 0, ipIn, cipher, cipher.length,
					DataOut);
			int res2 = Ddi.ddi_auk_data_process((byte) 0, (byte) 0, (byte) 0, 2, (byte) 0, ipIn, DataOut,
					DataOut.length, DataOut1);
		}
		long end = System.currentTimeMillis();
		long current = end - begin;
		myHandleDeal("AUK���ܺͽ�����ʱ" + current, 0);
		Ddi.ddi_innerkey_close();
	}

	private void testAuk24() {
		myHandleDeal("testAuk24����", 0);
		Thread mThread = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 3000; i++) {
					String m_cipher = "12345678abcdefbfabcdefbcabcdefbf";
					byte[] cipher = ByteUtils.hexString2ByteArray(m_cipher);
					byte[] DataOut = new byte[16];
					byte[] DataOut1 = new byte[16];
					String data = "8b18c930601f4ad94573f487b9406d95";
					Ddi.ddi_innerkey_open();
					int res1 = Ddi.ddi_auk_data_process((byte) 1, (byte) 0, (byte) 0, 2, (byte) 0, ipIn, cipher,
							cipher.length, DataOut);
					String data1 = ByteUtils.byteArray2HexString(DataOut);
					if (res1 == 0 && data1.equals(data)) {
						myHandleDeal("Auk24���ܳɹ�" + i + "��", res1);
						int res2 = Ddi.ddi_auk_data_process((byte) 0, (byte) 0, (byte) 0, 2, (byte) 0, ipIn, DataOut,
								DataOut.length, DataOut1);
						String data2 = ByteUtils.byteArray2HexString(DataOut1);
						if (res2 == 0 && data2.equals(m_cipher)) {
							myHandleDeal("Auk24���ܳɹ�" + i + "��", res2);
						} else {
							myHandleDeal("Auk24����ʧ��" + i + "��" + data2, 2);
						}
					} else {
						myHandleDeal("Auk24����ʧ��" + i + "��", 1);
					}
				}
			}
		});
		mThread.start();
		try {
			mThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// ��ȡ��ȫ��У��ֵ
	private void testsnCodeinfo() {
		myHandleDeal("testsnCodeinfo����", 0);
		byte[] snCode = new byte[6];
		String data = "000002f35df0";
		int res1 = Ddi.ddi_get_sncode_info(snCode, 6);
		String data1 = ByteUtils.byteArray2HexString(snCode);
		if (res1 == 0 && data1.equals(data)) {
			myHandleDeal("��ȡ��ȫ��У��ֵ�ɹ�", res1);
		} else {
			myHandleDeal("snCodeinfo��ȡ��ȫ��У��ֵʧ��" + res1 + data1, 1);
		}
	}

	private void testTekinfo() {
		myHandleDeal("testTekinfo����", 0);
		byte[] lpOut = new byte[128];
		byte[] num = new byte[1];
		String data = "010040826a58010302f35df00105caaaaf4d010602f35df00107ac1b605c010902f35df0";
		int res1 = Ddi.ddi_get_key_info(lpOut, num, 1);
		String str = ByteUtils.byteArray2HexString(lpOut);
		String data2 = str.substring(0, 72);
		Log.v("111111", data2);
		if (res1 == 0 && data2.equals(data)) {
			myHandleDeal("��ȡTEKУ��ֵ�ɹ�", res1);
		} else {
			myHandleDeal("Tekinfo��ȡTEKУ��ֵʧ��" + data2, res1);
		}
	}

	private void testAukinfo() {
		myHandleDeal("testAukinfo����", 0);
		byte[] lpOut = new byte[42];// 010304f3f569
		byte[] num = new byte[1];
		String data = "020040826a58020302f35df00205caaaaf4d0206ac1b605c020702f35df002085f833fc7020902f35df0";
		int res1 = Ddi.ddi_get_key_info(lpOut, num, 2);
		String data2 = ByteUtils.byteArray2HexString(lpOut);
//		String data2 = str.substring(0,96);
		Log.v("111111", data2);
		if (res1 == 0 && data2.equals(data)) {
			myHandleDeal("��ȡAUKУ��ֵ�ɹ�", res1);
		} else {
			myHandleDeal("Aukinfo��ȡAUKУ��ֵʧ��" + data2, res1);
		}
	}

	private void testmkinfo() {
		// 06��ʾ��������ݳ��ȣ�����������ͱ���12
		// 00000006030082e136650000000000000000000000000000000000000000000000000000000000000000000000000000
		myHandleDeal("testmkinfo����", 0);
		byte[] lpOut = new byte[128];// 010304f3f569
		byte[] num = new byte[1];
		String data = "0000000603095dce56800000000000000000000000000000000000000000000000000000000000000000000000000000";
		int res1 = Ddi.ddi_get_key_info(lpOut, num, 3);
		String str = ByteUtils.byteArray2HexString(lpOut);
		String data2 = str.substring(0, 96);
		Log.v("111111", data2);
		if (res1 == 0 && data2.equals(data)) {
			myHandleDeal("��ȡ����ԿУ��ֵ�ɹ�", res1);
		} else {
			myHandleDeal("mkinfo��ȡ����ԿУ��ֵʧ��" + data2, 1);
		}
	}

	// ��ȡ���������ն���Ϣ
	private void testterminfo() {
		myHandleDeal("testterminfo����", 0);
		byte[] lpOut = new byte[148];
		byte[] lpOut1 = new byte[20];
		int res1 = Ddi.ddi_sys_read_dsn(lpOut1);
		if (res1 == 0) {
			myHandleDeal("��ȡ����ųɹ�", res1);
			String data1 = "00000404" + ByteUtils.asciiByteArray2String(lpOut1);
			String data2 = ByteUtils.asciiByteArray2String(lpOut1);
			int res2 = Ddi.ddi_get_pci_unipay_terminfo(lpOut, 0);
			String str3 = ByteUtils.byteArray2HexString(lpOut);
			Log.v("123456", str3);
			String str1 = ByteUtils.asciiByteArray2String(ByteUtils.getSubByteArray(lpOut, 45, 28));
			String str2 = ByteUtils.asciiByteArray2String(ByteUtils.getSubByteArray(lpOut, 45, 20));
			if (res2 == 0 && str1.equals(data1)) {
				myHandleDeal("terminfo��ȡ�ն���Ϣ�ɹ�", res2);
			} else if (res2 == 8 && str2.equals(data2)) {
				myHandleDeal("terminfo��ȡ�ն���Ϣ�ɹ�", res2);
			} else {
				myHandleDeal("terminfo��ȡ�ն���Ϣʧ��", 2);
			}
		} else {
			myHandleDeal("terminfo��ȡ�����ʧ��", 1);
		}
	}

	private void testterminfo1() {
		myHandleDeal("testterminfo1����", 0);
		byte[] lpOut = new byte[64];
		byte[] lpOut1 = new byte[20];
		int res1 = Ddi.ddi_sys_read_dsn(lpOut1);
		if (res1 == 0) {
			myHandleDeal("terminfo1��ȡ����ųɹ�", res1);
			String data1 = "0100000000008c00010b473331303030303030303300000000000000000006303030303034000002303400001330303030303430344733313030303030303033";
			int res2 = Ddi.ddi_get_pci_unipay_terminfo(lpOut, 0);
			String str3 = ByteUtils.byteArray2HexString(lpOut);
			Log.v("123456", str3);

			if (res2 == 0 && str3.equals(data1)) {
				myHandleDeal("terminfo1��ȡ�ն���Ϣ�ɹ�", res2);
			} else {
				myHandleDeal("terminfo1��ȡ�ն���Ϣʧ��" + str3, res2);
			}
		} else {
			myHandleDeal("terminfo1��ȡ�����ʧ��", res1);

		}
	}

	// ���㰲ȫ�����Ľӿ� ��ȡ����������Ϣ
	private void testcipherinfo() {
		myHandleDeal("testcipherinfo����", 0);
		String factor = "313335323535";
		byte[] rand_factor = ByteUtils.hexString2ByteArray(factor);
		byte[] cipher_info = new byte[8];
		byte[] cipher_info_len = new byte[4];
		String data = "eefd00B1";
		int res1 = Ddi.ddi_get_pci_unipay_cipher_info(rand_factor, rand_factor.length, cipher_info, cipher_info_len, 0);
		String data2 = ByteUtils.asciiByteArray2String(cipher_info);
		// B1037B48
		// 8D8DC803
		if (res1 == 0 && data.equalsIgnoreCase(data2)) {
			myHandleDeal("��ȡ����������Ϣ�ɹ�", res1);
		} else if (res1 == 2) {
			myHandleDeal("terminfo��ȡ�ն���Ϣʧ��", 1);
		} else if (res1 == 3) {
			myHandleDeal("terminfo���ն˱��ʧ��", 2);
		} else if (res1 == 4) {
			myHandleDeal("terminfo��������ʧ��", 3);
		} else {
			myHandleDeal("terminfo��ȡ����������Ϣʧ��" + res1 + data2, 4);
		}
	}

	private void testcipherinfo6() {
		myHandleDeal("testcipherinfo6����", 0);
		// ���¹�����Կ
		String key1 = "3131313131313131";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x00, 149, innerkey1, 8);
		if (res0 == 0) {
			myHandleDeal("DES��������Կ�ɹ�", res0);

		} else {
			myHandleDeal("DES��������Կʧ��", res0);

		}
		Thread mThread = new Thread(new Runnable() {
			public void run() {
				String key2 = "3232323232323232";
				byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
				byte[] DataOutinfo6 = new byte[16];
				String data0 = "9BEEF8C7E4DF322C97C5C0E7FA05B40A";
				byte[] msg_summery1 = ByteUtils.hexString2ByteArray("85e9d210105327171927e8303ef028e1");
				// ��ȡ��ȫ������
				String factor = "313335323535";
				byte[] rand_factor = ByteUtils.hexString2ByteArray(factor);
				byte[] cipher_info = new byte[8];
				byte[] cipher_info_len = new byte[4];
				String data = "eefd00B1";
				for (int i = 0; i < 1028; i++) {
					int res1 = Ddi.ddi_get_pci_unipay_cipher_info(rand_factor, rand_factor.length, cipher_info,
							cipher_info_len, 0);
					String data2 = ByteUtils.asciiByteArray2String(cipher_info);
					// B1037B48
					// 8D8DC803
					if (res1 == 0 && data.equalsIgnoreCase(data2)) {
						myHandleDeal("��ȡ����������Ϣ�ɹ�" + i + "��", res1);
					} else if (res1 == 2) {
						myHandleDeal("terminfo��ȡ�ն���Ϣʧ��" + i + "��", 1);
					} else if (res1 == 3) {
						myHandleDeal("terminfo���ն˱��ʧ��" + i + "��", 2);
					} else if (res1 == 4) {
						myHandleDeal("terminfo��������ʧ��" + i + "��", 3);
					} else {
						myHandleDeal("terminfo��ȡ����������Ϣʧ��" + i + "��" + res1 + data2, 4);
					}
					int res8 = Ddi.ddi_innerkey_update_wk((byte) 0x00, 149, 0, 1, ipIn, innerkey2, 8, ipOut, 8);
					if (res8 == 0) {
						myHandleDeal("���¹�����Կ�ɹ�" + i + "��", res8);
						int res5 = Ddi.ddi_innerkey_des_encrypt(1, 0, 0, ipIn, msg_summery, 16, DataOutinfo6);// ������Կ����
						String data1 = ByteUtils.byteArray2HexString(DataOutinfo6);
						if (res5 == 0 && data1.equalsIgnoreCase(data0)) {
							myHandleDeal("������Կ���ܳɹ�" + i + "��", res5);
						} else {
							myHandleDeal("������Կ����ʧ��" + i + "��" + data1, res5);
						}
					} else {
						myHandleDeal("���¹�����Կʧ��" + i + "��", res8);
					}
				}
			}
		});
		mThread.start();
		try {
			mThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// ��������mode=0
	private void testcipherinfo0() {
		myHandleDeal("testcipherinfo0����", 0);
		String factor = "313335323535";
		byte[] rand_factor = ByteUtils.hexString2ByteArray(factor);
		byte[] cipher_info = new byte[8];
		byte[] cipher_info_len = new byte[4];
		int res1 = Ddi.ddi_get_pci_unipay_cipher_info(rand_factor, rand_factor.length, cipher_info, cipher_info_len, 1);
		if (res1 == 0) {
			myHandleDeal("cipherinfo0����������ʧ��", 1);
		} else if (res1 == 1) {
			myHandleDeal("cipherinfo0���Գɹ�", res1);
		} else if (res1 == 4) {
			myHandleDeal("cipherinfo0��������ʧ��", 2);
		} else {
			myHandleDeal("cipherinfo0����ʧ��", 3);
		}
	}

	private void testcipherinfo1() {
		myHandleDeal("testcipherinfo1����", 0);
		String factor = "A12345678A12345678A12345678A1234";
		byte[] rand_factor = ByteUtils.hexString2ByteArray(factor);
		byte[] cipher_info = new byte[16];
		byte[] cipher_info_len = new byte[4];
		String data = "ea75d9ae94782801d987e22d3eae5fc0";
		int res1 = Ddi.ddi_get_pci_unipay_cipher_info(rand_factor, rand_factor.length, cipher_info, cipher_info_len, 1);
		String data2 = ByteUtils.byteArray2HexString(cipher_info);
		if (res1 == 0 && data.equals(data2)) {
			myHandleDeal("���и�SM4���ܳɹ�", res1);
		} else if (res1 == 1) {
			myHandleDeal("cipherinfo1����ʧ��", 1);
		} else if (res1 == 4) {
			myHandleDeal("cipherinfo1��������ʧ��", 2);
		} else {
			myHandleDeal("cipherinfo1����ʧ��", 3);
		}
	}

	private void testcipherinfo2() {
		myHandleDeal("testcipherinfo2����", 0);
		String factor = "12365445664565624563214562155665";
		byte[] rand_factor = ByteUtils.hexString2ByteArray(factor);
		byte[] cipher_info = new byte[16];
		byte[] cipher_info_len = new byte[4];
		String data = "4c6b9b1ba609df36d62b448f48296eed";
		int res1 = Ddi.ddi_get_pci_unipay_cipher_info(rand_factor, rand_factor.length, cipher_info, cipher_info_len, 1);
		String data2 = ByteUtils.byteArray2HexString(cipher_info);
		if (res1 == 0 && data.equals(data2)) {
			myHandleDeal("���и�SM4���ܳɹ�", res1);
		} else if (res1 == 1) {
			myHandleDeal("cipherinfo2����ʧ��", 1);
		} else if (res1 == 4) {
			myHandleDeal("cipherinfo2��������ʧ��", 2);
		} else {
			myHandleDeal("cipherinfo2����ʧ��", 3);
		}
	}

	private void testcipherinfo3() {
		myHandleDeal("testcipherinfo3����", 0);
		String factor = "aabbccddeeffbbaaccddffeebbddffaa";
		byte[] rand_factor = ByteUtils.hexString2ByteArray(factor);
		byte[] cipher_info = new byte[16];
		byte[] cipher_info_len = new byte[4];
		String data = "2151c81b19c101dc01e6d99e67b7e043";
		int res1 = Ddi.ddi_get_pci_unipay_cipher_info(rand_factor, rand_factor.length, cipher_info, cipher_info_len, 1);
		String data2 = ByteUtils.byteArray2HexString(cipher_info);
		if (res1 == 0 && data.equals(data2)) {
			myHandleDeal("���и�SM4���ܳɹ�", res1);
		} else if (res1 == 1) {
			myHandleDeal("cipherinfo3����ʧ��", 1);
		} else if (res1 == 4) {
			myHandleDeal("cipherinfo3��������ʧ��", 2);
		} else {
			myHandleDeal("cipherinfo3����ʧ��", 3);
		}
	}

	private void testcipherinfo4() {
		myHandleDeal("testcipherinfo4����", 0);
		String factor = "aabbccddeeffbbaaccddffeebbddff";
		byte[] rand_factor = ByteUtils.hexString2ByteArray(factor);
		byte[] cipher_info = new byte[16];
		byte[] cipher_info_len = new byte[4];
		int res1 = Ddi.ddi_get_pci_unipay_cipher_info(rand_factor, rand_factor.length, cipher_info, cipher_info_len, 1);
		if (res1 == 0) {
			myHandleDeal("cipherinfo4����������ʧ��", 1);
		} else if (res1 == 1) {
			myHandleDeal("cipherinfo4���Գɹ�", res1);
		} else if (res1 == 4) {
			myHandleDeal("cipherinfo4��������ʧ��", 2);
		} else {
			myHandleDeal("cipherinfo4����ʧ��", 3);
		}
	}

	private void testcipherinfo5() {
		myHandleDeal("testcipherinfo5����", 0);
		String factor = "A12345678A12345678A12345678A1234";
		byte[] rand_factor = ByteUtils.hexString2ByteArray(factor);
		byte[] cipher_info = new byte[16];
		byte[] cipher_info_len = new byte[4];
		int res1 = Ddi.ddi_get_pci_unipay_cipher_info(rand_factor, rand_factor.length, cipher_info, cipher_info_len, 0);
		if (res1 == 0) {
			myHandleDeal("cipherinfo5����������ʧ��", 1);
		} else if (res1 == 1) {
			myHandleDeal("cipherinfo5���Գɹ�", res1);
		} else {
			myHandleDeal("cipherinfo5����ʧ��", 3);
		}
	}

	private void testtusn() {
		myHandleDeal("testtusn����", 0);
		byte[] data = new byte[64];
		byte[] datalen = new byte[4];
		byte[] lpOut1 = new byte[56];
		int res1 = Ddi.ddi_sys_read_dsn(lpOut1);
		myHandleDeal("��ȡ����ųɹ�", res1);
		byte[] lpOut2 = new byte[64];
		int res2 = Ddi.ddi_sys_read_dsn(lpOut2);
		myHandleDeal("��ȡ����ųɹ�", res2);
		if (res1 == 0 || res2 == 0) {
			myHandleDeal("��ȡ����ųɹ�", res1);
			String data1 = "00000404" + ByteUtils.asciiByteArray2String(lpOut1);
			String data2 = ByteUtils.asciiByteArray2String(lpOut2);
			int res3 = Ddi.ddi_read_tusn_sn(data, datalen);
			String str = ByteUtils.asciiByteArray2String(data);
			if (res3 == 0 && str.equals(data1)) {
				myHandleDeal("��ȡTUSN�ɹ�" + str, res1);
			} else if (res3 == 0 && str.equals(data2)) {
				myHandleDeal("��ȡTUSN�ɹ�", res1);
			} else {
				myHandleDeal("tusn��ȡTUSNʧ��" + res3 + "**" + data2, 2);
			}
		} else {
			myHandleDeal("tusn��ȡ�����ʧ��", 1);
		}

	}

	private void testtusn2() {
		Runnable runnable = new Runnable() {
			public void run() {
				myHandleDeal("testtusn2����", 0);
				byte[] data = new byte[64];
				byte[] datalen = new byte[4];
				byte[] lpOut1 = new byte[56];
				for (int i = 0; i < 1026; i++) {
					int res1 = Ddi.ddi_sys_read_dsn(lpOut1);
					if (res1 == 0) {
						myHandleDeal("tusn2��ȡ����ųɹ�"+i+"..." + ByteUtils.asciiByteArray2String(lpOut1), res1);
					} else {
						myHandleDeal("tusn2��ȡ�����ʧ��"+i+"...", res1);
					}
					String data1 = "00000404" + ByteUtils.asciiByteArray2String(lpOut1);
					//			String data2 = ByteUtils.asciiByteArray2String(lpOut2);
					int res3 = Ddi.ddi_read_tusn_sn(data, datalen);
					String str = ByteUtils.asciiByteArray2String(data);
					if (res3 == 0 && str.equals(data1)) {
						myHandleDeal("tusn2��ȡTUSN�ɹ�"+i+"..." + str, res1);
					} else {
						myHandleDeal("tusn2��ȡTUSNʧ��"+i+"..." + str, res3);
					}
				}
			}
		};
		 Thread thread = new Thread(runnable);
		 try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void testreadtusn1() {
		myHandleDeal("testreadtusn1����", 0);
		byte[] data = new byte[64];
		byte[] datalen = new byte[4];
		byte[] lpOut1 = new byte[56];
		int res1 = Ddi.ddi_mes_read_hw_tusn();
		if (res1 == 0) {

		} else {

		}
		myHandleDeal("readtusn1��ȡ����ųɹ�", res1);

	}

}
