package com.xinguodu.cts;


import com.xinguodu.ddiinterface.Ddi;
import com.xinguodu.ddiinterface.struct.StrHkey;
import com.xinguodu.ddiinterface.struct.StrKeyTAKpara;
import com.xinguodu.ddiinterface.struct.StrTkey;

import android.R.integer;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;
import tools.testtoolclass;

public class InnerkeycaseGroupActivity extends Activity {

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
	private byte[] ipIn;
	private byte[] ipOut;
	private int[] leOut;
	private byte[] uId;
	private StrHkey mStrHkey;
	private StrKeyTAKpara mStrKeyTAKpara;
	private byte[] ipOut2;
	private byte group;
	private byte group1;
	private byte[] msg_summery;
	private static String mInfo[] = new String[35];
	private long flag = 0;
	ParaEntity paraEntity = paraEntity = new ParaEntity();

	private Thread mThread = new Thread(new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			while (Thflg) {
				if (Btflg) {
					testgroup1();
					testgroup2();
					testgroup3();
					testgroup4();
					testgroup5();
					testgroup6();
					testgroup7();
					testgroup8();
					testgroup9();
					testgroup10();
					testgroup11();
					testgroup12();
					testgroup13();
					testgroup14();
					testgroup15();
					testgroup16();
					testgroup17();
					testgroup18();
					testgroup19();
					testgroup20();
					testgroup21();
					testgroup22();
					// ѭ�����������Ĺ�����Կ
					testgroup23();
					testgroup24();
					testgroup25();
					testgroup26();
					testgroup27();
					testgroup28();
					testgroup29();
					testgroup30();
					testgroup31();
					testgroup32();
					testgroup33();
					testgroup34();
					testgroup35();
					testgroup36();
					testgroup37();
					testgroup38();
					testgroup39();
					testgroup40();
					testgroup41();
					testgroup42();
					testgroup43();
					testgroup44();
					testgroup45();
					testgroup46();
					testgroup47();
					testgroup48();
					testgroup49();
					testgroup50();
					testgroup51();
					testgroup52();
					testgroup53();
					testgroup54();
					testgroup55();
					testgroup56();
					testgroup57();
					testgroup58();
					testgroup59();
					testgroup60();
					testgroup61();
					testgroup62();
					testgroup63();
					testgroup64();
					testgroup65();
					testgroup66();
					testgroup67();
					testgroup68();
					testgroup69();
					testgroup70();
					testgroup71();
					testgroup72();
					testgroup73();
					testgroup74();
					testgroup75();
					testgroup76();
					testgroup77();
					testgroup78();
					testgroup79();
					testgroup80();
					testgroup81();
//					testgroup82();
//					testgroup83();
					testgroup85();
					testgroup86();
					testgroup87();
					testgroup88();
					testgroup89();
					testgroup90();
//					�Ǽ��SM2��Կ����׿�˲�֧��
//					testgroup91();
					// �Ͻӿڲ�֧��
//		ben			testgroup92();
//		ben		    testgroup93();
					testgroup94();
					testgroup95();
					testgroup96();
					testgroup97();
					testgroup98();
					testgroup99();
					testgroup100();
					testgroup101();
					testgroup102();
					testgroup103();
					testgroup104();
					testgroup105();
					testgroup106();
					testgroup107();
					testgroup108();
					testgroup109();
					testgroup110();
					testgroup111();
					testgroup112();
					testgroup113();
//					testgroup114();
//					testgroup115();
//					testgroup116();
					// ֧�ֵĻ��� N5��N5S��F900,N86
					if (MainActivity.model.equalsIgnoreCase("N5") | MainActivity.model.equalsIgnoreCase("F900")| MainActivity.model.equalsIgnoreCase("EF900")
							| MainActivity.model.equalsIgnoreCase("N86")) {
						// �˻����ݼ���
						testgroup117();
						testgroup118();
						testgroup119();
						testgroup120();
						testgroup121();
						testgroup122();
						testgroup123();
					} else {
						myHandleDeal("�ն�:" + MainActivity.model + "��֧������Ϊ�˻����ݼ��ܲ���ʧ��", -99);
					}
					// �������ݳ���2048
					// ֧�ֵ��ն�N5s��N6,N86
					if ((MainActivity.model.equalsIgnoreCase("N5") && MainActivity.version.equalsIgnoreCase("7.1.2"))
							| MainActivity.model.equalsIgnoreCase("N6") | MainActivity.model.equalsIgnoreCase("F900")
							| MainActivity.model.equalsIgnoreCase("N86")| MainActivity.model.equalsIgnoreCase("EF900")) {
						testgroup124();
						testgroup125();
						testgroup126();
						testgroup127();
						testgroup128();
						testgroup129();
						testgroup130();
						testgroup131();
						// ѹ������
						testgroup132();

					} else {
						myHandleDeal("�ն�:" + MainActivity.model + "��֧������Ϊ2048����ʧ��", -99);
					}

					testgroup133();
					// MAC CBC ��X9.19������Ŀ��֧��  F900��EF900����֧��
					if (MainActivity.model.equalsIgnoreCase("F900")||MainActivity.model.equalsIgnoreCase("EF900")) {
						myHandleDeal("�ն�:" + MainActivity.model + "��֧��MAC CBC ��X9.19����ʧ��", -99);
					}else {
						testgroup135();
						testgroup136();
						testgroup137();
						testgroup138();
						testgroup139();
						testgroup140();
						testgroup141();
						testgroup142();
						testgroup143();
						testgroup144();
						testgroup145();
						// ѹ������
						testgroup146();
					}
					
					//�ýӿ�ֻ��F900֧�֣�������Ŀ��֧�ְٶȻ���License���ع���
					if (MainActivity.model.equalsIgnoreCase("N6")||MainActivity.model.equalsIgnoreCase("F900")||MainActivity.model.equalsIgnoreCase("N86")||
							(MainActivity.model.equalsIgnoreCase("N5") && MainActivity.version.equalsIgnoreCase("7.1.2"))) {
						testgroup147();
						testgroup148();
						testgroup150();
						testgroup151();
//						ѹ������
						testgroup149();
					}else {
						myHandleDeal("�ն�:" + MainActivity.model + "��֧�ְٶȻ���License���ع��ܲ���ʧ��", -99);
					}
					// ѹ�����Է������//ѹ��������Ҫ��ʱ��ʹ�ü���
					// �����㷨��������
					testgroup82();
					testgroup83();
					testgroup84();
					testgroup91();
					testgroup114();
					testgroup115();
					testgroup134();
					testgroup116();
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
		setContentView(R.layout.activity_innerkeycase_group);
		String data = "30303030abCDef99a1da25f1e411fea5";
		ipIn = ByteUtils.hexString2ByteArray(data);
		ipOut = new byte[200];
		mStrHkey = new StrHkey();
		mStrKeyTAKpara = new StrKeyTAKpara();
		leOut = new int[1];
		uId = ByteUtils.hexString2ByteArray("abcd");
		ipOut2 = new byte[32];
		group = 0x00;
		group1 = 0x01;
		String data2 = "12345678abcdEFBFABCDefBCabcdEFBF";
		msg_summery = ByteUtils.hexString2ByteArray(data2);
		Ddi.ddi_ddi_sys_init();
		initview();
		mThread.start();
		run();
	}

	private void initview() {
		tv = (TextView) findViewById(R.id.nkeygtv);
		tv1 = (TextView) findViewById(R.id.nkeygtv1);
		bt1 = (Button) findViewById(R.id.nkeygbt1);
		spinner = (Spinner) findViewById(R.id.nkeygspinner);
		scrollView = (ScrollView) findViewById(R.id.nkeygscrollView);
		mTotalTextView = (TextView) findViewById(R.id.nkeygtext_total);
		mSucessTextView = (TextView) findViewById(R.id.nkeygtext_sucess);
		mFailTextView = (TextView) findViewById(R.id.nkeygtext_fail);
		mSucessRateTextView = (TextView) findViewById(R.id.nkeygtext_sucess_rate);
	}

	private void run() {
		// TODO Auto-generated method stub
		bt1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (Btflg) {
					Toast.makeText(getApplicationContext(), "�����У���ȴ�", Toast.LENGTH_SHORT).show();
					// Btflg = false;
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
						testgroup1();
						break;
					case 2:
						testgroup2();
						break;
					case 3:
						testgroup3();
						break;
					case 4:
						testgroup4();
						break;
					case 5:
						testgroup5();
						break;
					case 6:
						testgroup6();
						break;
					case 7:
						testgroup7();
						break;
					case 8:
						testgroup8();
						break;
					case 9:
						testgroup9();
						break;
					case 10:
						testgroup10();
						break;
					case 11:
						testgroup11();
						break;
					case 12:
						testgroup12();
						break;
					case 13:
						testgroup13();
						break;
					case 14:
						testgroup14();
						break;
					case 15:
						testgroup15();
						break;
					case 16:
						testgroup16();
						break;
					case 17:
						testgroup17();
						break;
					case 18:
						testgroup18();
						break;
					case 19:
						testgroup19();
						break;
					case 20:
						testgroup20();
						break;
					case 21:
						testgroup21();
						break;
					case 22:
						testgroup22();
						break;
					case 23:
						testgroup23();
						break;
					case 24:
						testgroup24();
						break;
					case 25:
						testgroup25();
						break;
					case 26:
						testgroup26();
						break;
					case 27:
						testgroup27();
						break;
					case 28:
						testgroup28();
						break;
					case 29:
						testgroup29();
						break;
					case 30:
						testgroup30();
						break;
					case 31:
						testgroup31();
						break;
					case 32:
						testgroup32();
						break;
					case 33:
						testgroup33();
						break;
					case 34:
						testgroup34();
						break;
					case 35:
						testgroup35();
						break;
					case 36:
						testgroup36();
						break;
					case 37:
						testgroup37();
						break;
					case 38:
						testgroup38();
						break;
					case 39:
						testgroup39();
						break;
					case 40:
						testgroup40();
						break;
					case 41:
						testgroup41();
						break;
					case 42:
						testgroup42();
						break;
					case 43:
						testgroup43();
						break;
					case 44:
						testgroup44();
						break;
					case 45:
						testgroup45();
						break;
					case 46:
						testgroup46();
						break;
					case 47:
						testgroup47();
						break;
					case 48:
						testgroup48();
						break;
					case 49:
						testgroup49();
						break;
					case 50:
						testgroup50();
						break;
					case 51:
						testgroup51();
						break;
					case 52:
						testgroup52();
						break;
					case 53:
						testgroup53();
						break;
					case 54:
						testgroup54();
						break;
					case 55:
						testgroup55();
						break;
					case 56:
						testgroup56();
						break;
					case 57:
						testgroup57();
						break;
					case 58:
						testgroup58();
						break;
					case 59:
						testgroup59();
						break;
					case 60:
						testgroup60();
						break;
					case 61:
						testgroup61();
						break;
					case 62:
						testgroup62();
						break;
					case 63:
						testgroup63();
						break;
					case 64:
						testgroup64();
						break;
					case 65:
						testgroup65();
						break;
					case 66:
						testgroup66();
						break;
					case 67:
						testgroup67();
						break;
					case 68:
						testgroup68();
						break;
					case 69:
						testgroup69();
						break;
					case 70:
						testgroup70();
						break;
					case 71:
						testgroup71();
						break;
					case 72:
						testgroup72();
						break;
					case 73:
						testgroup73();
						break;
					case 74:
						testgroup74();
						break;
					case 75:
						testgroup75();
						break;
					case 76:
						testgroup76();
						break;
					case 77:
						testgroup77();
						break;
					case 78:
						testgroup78();
						break;
					case 79:
						testgroup79();
						break;
					case 80:
						testgroup80();
						break;
					case 81:
						testgroup81();
						break;
					case 82:
						testgroup82();
						break;
					case 83:
						testgroup83();
						break;
					case 84:
						testgroup84();
						break;
					case 85:
						testgroup85();
						break;
					case 86:
						testgroup86();
						break;
					case 87:
						testgroup87();
						break;
					case 88:
						testgroup88();
						break;
					case 89:
						testgroup89();
						break;
					case 90:
						testgroup90();
						break;
					case 91:
						testgroup91();
						break;
					case 92:
						testgroup92();
						break;
					case 93:
						testgroup93();
						break;
					case 94:
						testgroup94();
						break;
					case 95:
						testgroup95();
						break;
					case 96:
						testgroup96();
						break;
					case 97:
						testgroup97();
						break;
					case 98:
						testgroup98();
						break;
					case 99:
						testgroup99();
						break;
					case 100:
						testgroup100();
						break;
					case 101:
						testgroup101();
						break;
					case 102:
						testgroup102();
						break;
					case 103:
						testgroup103();
						break;
					case 104:
						testgroup104();
						break;
					case 105:
						testgroup105();
						break;
					case 106:
						testgroup106();
						break;
					case 107:
						testgroup107();
						break;
					case 108:
						testgroup108();
						break;
					case 109:
						testgroup109();
						break;
					case 110:
						testgroup110();
						break;
					case 111:
						testgroup111();
						break;
					case 112:
						testgroup112();
						break;
					case 113:
						testgroup113();
						break;
					case 114:
						testgroup114();
						break;
					case 115:
						testgroup115();
						break;
					case 116:
						testgroup116();
						break;
					case 117:
						testgroup117();
						break;
					case 118:
						testgroup118();
						break;
					case 119:
						testgroup119();
						break;
					case 120:
						testgroup120();
						break;
					case 121:
						testgroup121();
						break;
					case 122:
						testgroup122();
						break;
					case 123:
						testgroup123();
						break;
					case 124:
						testgroup124();
						break;
					case 125:
						testgroup125();
						break;
					case 126:
						testgroup126();
						break;
					case 127:
						testgroup127();
						break;
					case 128:
						testgroup128();
						break;
					case 129:
						testgroup129();
						break;
					case 130:
						testgroup130();
						break;
					case 131:
						testgroup131();
						break;
					case 132:
						testgroup132();
						break;
					case 133:
						testgroup133();
						break;
					case 134:
						testgroup134();
						break;
					case 135:
						testgroup135();
						break;
					case 136:
						testgroup136();
						break;
					case 137:
						testgroup137();
						break;
					case 138:
						testgroup138();
						break;
					case 139:
						testgroup139();
						break;
					case 140:
						testgroup140();
						break;
					case 141:
						testgroup141();
						break;
					case 142:
						testgroup142();
						break;
					case 143:
						testgroup143();
						break;
					case 144:
						testgroup144();
						break;
					case 145:
						testgroup145();
						break;
					case 146:
						testgroup146();
						break;
					case 147:
						testgroup147();
						break;
					case 148:
						testgroup148();
						break;
					case 149:
						testgroup149();
						break;
					case 150:
						testgroup150();
						break;
					case 151:
						testgroup151();
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

//��������Կ
	private void testgroup1() {
		myHandleDeal("testgroup1����", 0);
		String key1 = "3131313131313131";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		String key3 = "56248AAAAAAAAAAA9999efBCabcdEFBF12345678abcdE3131";
		byte[] innerkey3 = ByteUtils.hexString2ByteArray(key3);
		String key4 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey4 = ByteUtils.hexString2ByteArray(key4);
		String key5 = "A12345678A12345678A12345678A1231";
		byte[] innerkey5 = ByteUtils.hexString2ByteArray(key5);
		String key6 = "A12345678A12345678A12345678A1234ABCDEF0123456731";
		byte[] innerkey6 = ByteUtils.hexString2ByteArray(key6);
		String key7 = "A12345678A12345678A12345678A1234ABCDEF012345678ABDECF09876542331";
		byte[] innerkey7 = ByteUtils.hexString2ByteArray(key7);
		byte[] DataOut = new byte[16];
		String data0 = "8b18c930601f4ad94573f487b9406d95";
		String data1 = "8e98da9f1499660dab384cf18e353e25";
		String data2 = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] msg_summery1 = ByteUtils.hexString2ByteArray("8e98da9f1499660dab384cf18e353e25");
		Ddi.ddi_innerkey_open();
		int res0 = -99;
		for (int i = 0; i < 51; i++) {
			res0 = Ddi.ddi_innerkey_update_mk((byte) 0x00, 149, innerkey1, 8);
			int res7 = Ddi.ddi_innerkey_update_mk((byte) 0x00, 0, innerkey1, 8);
			int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 1, innerkey2, 16);
			int res2 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 75, innerkey3, 24);
			int res3 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 0, innerkey4, 16);
			int res4 = Ddi.ddi_innerkey_update_mk((byte) 0x04, 77, innerkey5, 16);
			int res5 = Ddi.ddi_innerkey_update_mk((byte) 0x05, 0, innerkey6, 24);
			int res6 = Ddi.ddi_innerkey_update_mk((byte) 0x06, 148, innerkey7, 32);
			res0 = res7 + res1 + res2 + res3 + res4 + res5 + res6;
			if (MainActivity.model.equalsIgnoreCase("N3")) {
				if (res7==0&&res1==0&&res2==0&&res3==0&&res4==-6&&res5==-6&&res6==-6) {
					myHandleDeal("N3��������Կ�ɹ�" + res7 + res1 + res2 + res3 + res4 + res5 + res6, 0);

				} else {
					myHandleDeal("N5��������Կʧ��" + res7 + res1 + res2 + res3 + res4 + res5 + res6, 0);
				}
				
			}
			if (res0 == 0) {
				myHandleDeal(MainActivity.model+"��������Կ�ɹ�" + res7 + res1 + res2 + res3 + res4 + res5 + res6, 0);
			} else {
				myHandleDeal(MainActivity.model+"��������Կʧ��" + res7 + res1 + res2 + res3 + res4 + res5 + res6, 0);
			}
		}
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = -99;
			for (int i = 0; i < 51; i++) {
				res1 = Ddi.ddi_innerkey_update_wk((byte) 0x00, 149, 0, 1, ipIn, innerkey2, 8, ipOut, 8);
			}
			int res2 = -99;
			for (int k = 0; k < 51; k++) {
				res2 = Ddi.ddi_innerkey_des_encrypt(0, 149, 0, ipIn, msg_summery, 16, DataOut);// ����Կ����
			}
			String data = ByteUtils.byteArray2HexString(DataOut);
			if (res2 == 0 && data.equals(data0)) {
				myHandleDeal("����Կ���ܳɹ�", res2);
			} else {
				myHandleDeal("group1����Կ����ʧ��res2", res2);
			}
			int res3 = Ddi.ddi_innerkey_delete_key(0, 149);
			if (res3 == 0) {
				myHandleDeal("ɾ������Կ�ɹ�", res3);
				int res4 = Ddi.ddi_innerkey_des_encrypt(0, 149, 0, ipIn, msg_summery, 16, DataOut);
				if (res4 == -6) {
					myHandleDeal("����Կ���ܲ��Գɹ�", res4);
				} else {
					myHandleDeal("group1����Կ���ܲ���ʧ��", res4);
				}
			} else {
				myHandleDeal("group1ɾ������Կʧ��", res3);
			}
			if (res1 == 0) {
				myHandleDeal("���¹�����Կ�ɹ�", res1);
				int res5 = -99;
				for (int j = 0; j < 51; j++) {
					res5 = Ddi.ddi_innerkey_des_encrypt(1, 0, 0, ipIn, msg_summery, 16, DataOut);// ������Կ����
				}
				data = ByteUtils.byteArray2HexString(DataOut);
				if (res5 == 0) {
					myHandleDeal("������Կ���ܳɹ�", res5);
				} else {
					myHandleDeal("group1������Կ����ʧ��res5" + data, res5);
				}
				int res6 = Ddi.ddi_innerkey_des_decrypt(1, 0, 0, 0, ipIn, msg_summery1, 16, DataOut);// ������Կ����
				data = ByteUtils.byteArray2HexString(DataOut);
				if (res6 == 0) {
					myHandleDeal("������Կ���ܳɹ�", res6);
				} else {
					myHandleDeal("group1������Կ����ʧ��res6" + data, res6);
				}
				int res7 = Ddi.ddi_innerkey_delete_key(1, 0);
				if (res7 == 0) {
					myHandleDeal("ɾ��������Կ�ɹ�", res7);
					int res8 = Ddi.ddi_innerkey_des_encrypt(1, 0, 0, ipIn, msg_summery, 16, DataOut);
					if (res8 == -6) {
						myHandleDeal("������Կ���ܲ��Գɹ�", res8);
					} else {
						myHandleDeal("group1������Կ���ܲ���ʧ��", res8);
					}
				} else {
					myHandleDeal("group1ɾ��������Կʧ��", res7);
				}
			} else {
				myHandleDeal("group1���¹�����Կʧ��", res1);
			}

		} else {
			myHandleDeal("group1��������Կʧ��", res0);
		}

	}

	private void testgroup2() {
		myHandleDeal("testgroup2����", 0);
		String key1 = "ABCDefBCabcdEFBFABCDefBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "AAAAAAAAAAAAAAAAABCDefBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 152, innerkey1, 16);
		if (res1 == -6) {
			myHandleDeal("��������Կ���Գɹ�", res1);
		} else {
			myHandleDeal("group2��������Կ����ʧ��", res1);
		}
		int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 152, 2, 1, ipIn, innerkey2, 16, ipOut, 16);
		if (res2 == -6) {
			myHandleDeal("���¹�����Կ���Գɹ�", res2);
		} else {
			myHandleDeal("group2���¹�����Կ����ʧ��", res2);
		}
		int res3 = Ddi.ddi_innerkey_des_encrypt(0, 152, 0, ipIn, msg_summery, 16, ipOut);
		if (res3 == -6) {
			myHandleDeal("����Կ���ܲ��Գɹ�", res3);
		} else {
			myHandleDeal("group2����Կ���ܲ���ʧ��", res3);
		}
		int res4 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 149, innerkey1, 16);
		if (res4 == 0) {
			myHandleDeal("��������Կ�ɹ�", res4);
		} else {
			myHandleDeal("group2��������Կʧ��", res4);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup3() {
		myHandleDeal("testgroup3����", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
		if (res1 == 0) {
			myHandleDeal("��������Կ�ɹ�", res1);
			int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 0, 1, ipIn, innerkey2, 16, ipOut, 16);
			if (res2 == 0) {
				myHandleDeal("���¹�����Կ�ɹ�", res1);
			} else {
				myHandleDeal("group3���¹�����Կʧ��", res1);
			}
		} else {
			myHandleDeal("group3��������Կʧ��", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup4() {
		myHandleDeal("testgroup4����", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		byte[] DataOut = new byte[16];
		String data0 = "dcd85e8c5c75c140983409d9b77e6211";
		String data1 = "1c78121c6bb0223d79aa17998eb9603e";
		String data2 = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] msg_summery1 = ByteUtils.hexString2ByteArray("1C78121C6BB0223D79AA17998EB9603E");
		Ddi.ddi_innerkey_open();
		int res0 = -99;
		for (int i = 0; i < 50; i++) {
			res0 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 0, innerkey1, 16);
		}
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = -99;
			for (int i = 0; i < 50; i++) {
				res1 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 0, 0, 0, ipIn, innerkey2, 16, ipOut, 16);
			}
			int res2 = -99;
			for (int k = 0; k < 50; k++) {
				res2 = Ddi.ddi_innerkey_nes_sm4_encrypt(0, 0, (byte) 0x00, ipIn, msg_summery, 16, DataOut, leOut);// ����Կ����
			}
			String data = ByteUtils.byteArray2HexString(DataOut);
			if (res2 == 0 && data.equals(data0)) {
				myHandleDeal("����Կ���ܳɹ�", res2);
			} else {
				myHandleDeal("group4����Կ����ʧ��", res2);
			}
			int res3 = Ddi.ddi_innerkey_delete_key(0, 0);
			if (res3 == 0) {
				myHandleDeal("ɾ������Կ�ɹ�", res3);
				int res4 = Ddi.ddi_innerkey_nes_sm4_encrypt(0, 0, (byte) 0x00, ipIn, msg_summery, 16, DataOut, leOut);
				if (res4 == -6) {
					myHandleDeal("����Կ���ܲ��Գɹ�", res4);
				} else {
					myHandleDeal("group4����Կ���ܲ���ʧ��", res4);
				}
			} else {
				myHandleDeal("group4ɾ������Կʧ��", res3);
			}
			if (res1 == 0) {
				myHandleDeal("���¹�����Կ�ɹ�", res1);
				int res5 = -99;
				for (int j = 0; j < 50; j++) {
					res5 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, 0, (byte) 0x00, ipIn, msg_summery, 16, DataOut, leOut);// ������Կ����
				}
				data = ByteUtils.byteArray2HexString(DataOut);
				if (res5 == 0 && data.equals(data1)) {
					myHandleDeal("������Կ���ܳɹ�", res5);
				} else {
					myHandleDeal("group4������Կ����ʧ��", res5);
				}
				int res6 = Ddi.ddi_innerkey_nes_sm4_decrypt(1, 0, 0, (byte) 0x00, ipIn, msg_summery1, 16, DataOut,
						leOut);// ������Կ����
				data = ByteUtils.byteArray2HexString(DataOut);
				if (res6 == 0 && data.equals(data2)) {
					myHandleDeal("������Կ���ܳɹ�", res6);
				} else {
					myHandleDeal("group4������Կ����ʧ��", res6);
				}
				int res7 = Ddi.ddi_innerkey_delete_key(1, 0);
				if (res7 == 0) {
					myHandleDeal("ɾ��������Կ�ɹ�", res7);
					int res8 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, 0, (byte) 0x00, ipIn, msg_summery, 16, DataOut,
							leOut);
					if (res8 == -6) {
						myHandleDeal("������Կ���ܲ��Գɹ�", res8);
					} else {
						myHandleDeal("group4������Կ���ܲ���ʧ��", res8);
					}
				} else {
					myHandleDeal("group4ɾ��������Կʧ��", res7);
				}
			} else {
				myHandleDeal("group4���¹�����Կʧ��", res1);
			}

		} else {
			myHandleDeal("group4��������Կʧ��", res0);
		}

	}

	private void testgroup5() {
		myHandleDeal("testgroup5����", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 75, innerkey1, 16);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 75, 225, 1, ipIn, innerkey2, 16, ipOut, 16);
			if (res1 == 0) {
				myHandleDeal("���¹�����Կ�ɹ�", res1);
			} else {
				myHandleDeal("group5���¹�����Կʧ��", res1);
			}

		} else {
			myHandleDeal("group5��������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup6() {
		myHandleDeal("testgroup6����", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x01, -1, innerkey1, 16);
		if (res0 == -6) {
			myHandleDeal("��������Կ���Գɹ�", res0);
		} else {
			myHandleDeal("group6��������Կ����ʧ��", res0);
		}
		int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x01, -1, 0, 1, ipIn, innerkey2, 16, ipOut, 16);
		if (res1 == -6) {
			myHandleDeal("���¹�����Կ���Գɹ�", res1);
		} else {
			myHandleDeal("group6���¹�����Կ����ʧ��", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup7() {
		myHandleDeal("testgroup7����", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, -1, 1, ipIn, innerkey2, 16, ipOut, 16);
			if (res1 == -6) {
				myHandleDeal("���¹�����Կ���Գɹ�", res1);
			} else {
				myHandleDeal("group7���¹�����Կ����ʧ��", res1);
			}
		} else {
			myHandleDeal("group7��������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup8() {
		myHandleDeal("testgroup8����", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 149, innerkey1, 16);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 0, 1, ipIn, innerkey2, 16, ipOut, 16);
			if (res1 == 0) {
				myHandleDeal("���¹�����Կ�ɹ�", res1);
			} else {
				myHandleDeal("group8���¹�����Կʧ��", res1);
			}
		} else {
			myHandleDeal("group8��������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup9() {
		myHandleDeal("testgroup9����", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 1, innerkey1, 16);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 1, 450, 1, ipIn, innerkey2, 16, ipOut, 16);
			if (res1 == -6) {
				myHandleDeal("���¹�����Կ���Գɹ�", res1);
			} else {
				myHandleDeal("group9���¹�����Կ����ʧ��", res1);
			}
		} else {
			myHandleDeal("group9��������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup10() {
		myHandleDeal("testgroup10����", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		byte[] DataOut = new byte[16];
		String data0 = "4e168484e5c1c1d6380012839d2d766f";
		String data1 = "85e9d210105327171927e8303ef028e1";
		String data2 = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] msg_summery1 = ByteUtils.hexString2ByteArray("85e9d210105327171927e8303ef028e1");
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 149, innerkey1, 16);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 149, 449, 0, ipIn, innerkey2, 16, ipOut, 16);
			int res2 = Ddi.ddi_innerkey_des_encrypt(0, 149, 0, ipIn, msg_summery, 16, DataOut);// ����Կ����
			String data = ByteUtils.byteArray2HexString(DataOut);
			if (res2 == 0 && data.equals(data0)) {
				myHandleDeal("����Կ���ܳɹ�", res2);
			} else {
				myHandleDeal("group10����Կ����ʧ��", res2);
			}
			int res3 = Ddi.ddi_innerkey_delete_key(0, 149);
			if (res3 == 0) {
				myHandleDeal("ɾ������Կ�ɹ�", res3);
				int res4 = Ddi.ddi_innerkey_des_encrypt(0, 149, 0, ipIn, msg_summery, 16, DataOut);
				String data3 = ByteUtils.byteArray2HexString(DataOut);
				if (res4 == -6) {
					myHandleDeal("����Կ���ܲ��Գɹ�", res4);
				} else {
					myHandleDeal("group10ɾ����Կ������Կ���ܲ���ʧ��"+data3, res4);
				}
			} else {
				myHandleDeal("group10ɾ������Կʧ��", res3);
			}
			if (res1 == 0) {
				myHandleDeal("���¹�����Կ�ɹ�", res1);
				int res5 = Ddi.ddi_innerkey_des_encrypt(1, 449, 0, ipIn, msg_summery, 16, DataOut);// ������Կ����
				data = ByteUtils.byteArray2HexString(DataOut);
				if (res5 == 0 && data.equals(data1)) {
					myHandleDeal("������Կ���ܳɹ�", res5);
				} else {
					myHandleDeal("group10������Կ����ʧ��", res5);
				}
				int res6 = Ddi.ddi_innerkey_des_decrypt(1, 449, 0, 0, ipIn, msg_summery1, 16, DataOut);// ������Կ����
				data = ByteUtils.byteArray2HexString(DataOut);
				if (res6 == 0 && data.equals(data2)) {
					myHandleDeal("������Կ���ܳɹ�", res6);
				} else {
					myHandleDeal("group10������Կ����ʧ��", res6);

				}
				int res7 = Ddi.ddi_innerkey_delete_key(1, 449);
				if (res7 == 0) {
					myHandleDeal("ɾ��������Կ�ɹ�", res7);
					int res8 = Ddi.ddi_innerkey_des_encrypt(1, 449, 0, ipIn, msg_summery, 16, DataOut);
					if (res8 == -6) {
						myHandleDeal("������Կ���ܲ��Գɹ�", res8);
					} else {
						myHandleDeal("group10������Կ���ܲ���ʧ��", res8);
					}
				} else {
					myHandleDeal("group10ɾ��������Կʧ��", res7);
				}
			} else {
				myHandleDeal("group10���¹�����Կʧ��", res1);
			}

		} else {
			myHandleDeal("group10��������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	// �����ӵ� ���¹�����ԿIVΪ1
	private void testgroup51() {
		myHandleDeal("testgroup51����", 0);
		String key1 = "3131313131313131";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "3232323232323232";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		byte[] DataOut = new byte[16];
		String data0 = "9BEEF8C7E4DF322C97C5C0E7FA05B40A";
		byte[] msg_summery1 = ByteUtils.hexString2ByteArray("85e9d210105327171927e8303ef028e1");
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x00, 149, innerkey1, 8);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x00, 149, 0, 1, ipIn, innerkey2, 8, ipOut, 8);
			if (res1 == 0) {
				myHandleDeal("���¹�����Կ�ɹ�", res1);
				int res5 = Ddi.ddi_innerkey_des_encrypt(1, 0, 0, ipIn, msg_summery, 16, DataOut);// ������Կ����
				String data = ByteUtils.byteArray2HexString(DataOut);
				if (res5 == 0 && data.equalsIgnoreCase(data0)) {
					myHandleDeal("���¹�����Կ���ܳɹ�", res5);
				} else {
					myHandleDeal("���¹�����Կ����ʧ��" + data, res5);
				}
			} else {
				myHandleDeal("���¹�����Կʧ��", res1);
			}
		}
	}

//	// �����ӵ� SM4���¹�����ԿIV=0
	private void testgroup52() {
		myHandleDeal("testgroup52����", 0);
		String key4 = "ffffffffFFFFFFFFffffffffFFFFFFFF";
		byte[] innerkey4 = ByteUtils.hexString2ByteArray(key4);
		byte[] DataOut = new byte[16];
		String data0 = "EC2E4096473E89AFBD46ADD315411E50";
		byte[] msg_summery1 = ByteUtils.hexString2ByteArray("85e9d210105327171927e8303ef028e1");
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 0, innerkey4, 16);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 0, 0, 0, ipIn, innerkey4, 16, ipOut, 16);
			if (res1 == 0) {
				myHandleDeal("���¹�����Կ�ɹ�", res1);
				int res5 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, 0, (byte) 0, ipIn, innerkey4, innerkey4.length, DataOut,
						leOut);// ������Կ����
				String data = ByteUtils.byteArray2HexString(DataOut);
				if (res5 == 0 && data.equalsIgnoreCase(data0)) {
					myHandleDeal("group52���¹�����Կ���ܳɹ�", res5);
				} else {
					myHandleDeal("group52���¹�����Կ����ʧ��" + data, res5);
				}
			} else {
				myHandleDeal("group52���¹�����Կʧ��", res1);
			}
		}
	}
	//�Զ����
//	private void testgroup52() {
//		myHandleDeal("testgroup52����", 0);
//		//16λ
//		String key4 = "ffffffffFFFFFFFFffffffffFFFFFFFF";
//		byte[] innerkey4 = ByteUtils.hexString2ByteArray(key4);
//		//24λ
////		String key4 = "ffffffffFFFFFFFFffffffffFFFFFFFF3131313131313131";
////		byte[] innerkey4 = ByteUtils.hexString2ByteArray(key4);
//		//8λ
////		String key4 = "3131313131313131";
////		byte[] innerkey4 = ByteUtils.hexString2ByteArray(key4);
//		byte[] DataOut = new byte[16];
//		String data0 = "EC2E4096473E89AFBD46ADD315411E50";
//		byte[] msg_summery1 = ByteUtils.hexString2ByteArray("85e9d210105327171927e8303ef028e1");
//		Ddi.ddi_innerkey_open();
////		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 0, innerkey4, 16);
////		if (res0 == 0) {
////			myHandleDeal("��������Կ�ɹ�", res0);
////		}else {
////			myHandleDeal("��������Կʧ��", res0);
////		}
//		//IV =30303030abCDef99a1da25f1e411fea5
//		int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 56, 449, 0, ipIn, innerkey4, innerkey4.length, ipOut, innerkey4.length);
//		if (res1 == 0) {
//			myHandleDeal("���¹�����Կ�ɹ�", res1);
//
//			int res5 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, 0, (byte) 0, ipIn, innerkey4, innerkey4.length, DataOut,
//					leOut);// ������Կ����
//			String data = ByteUtils.byteArray2HexString(DataOut);
//			if (res5 == 0 && data.equalsIgnoreCase(data0)) {
//				myHandleDeal("group52���¹�����Կ���ܳɹ�", res5);
//			} else {
//				myHandleDeal("group52���¹�����Կ����ʧ��" + data, res5);
//			}
//		} else {
//			myHandleDeal("group52���¹�����Կʧ��", res1);
//		}
//	}

	// ������ ����AES-128������Կ��IV=0
	private void testgroup53() {
		myHandleDeal("testgroup53����", 0);
		String key1 = "A12345678A12345678A12345678A1234";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "A12345678A12345678A12345678A1234";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		String plain = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] m_plain = ByteUtils.hexString2ByteArray(plain);
		byte[] cipher = new byte[16];
		byte[] cipher1 = new byte[16];
		String data = "7B0EE5CBF353412449F580C49FC82865";
		byte[] m_data = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x04, 77, innerkey1, 16);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x04, 77, 225, 0, ipIn, innerkey2, 16, innerkey1, 16);
			if (res1 == 0) {
				myHandleDeal("���¹�����Կ���ܳɹ�", res1);
				int res2 = Ddi.ddi_innerkey_aes_encrypt(1, 225, (byte) 0, ipIn, m_plain, m_plain.length, cipher);
				String data1 = ByteUtils.byteArray2HexString(cipher);
				if (res2 == 0 && data1.equalsIgnoreCase(data)) {
					myHandleDeal("������Կ���ܳɹ�", res2);
					int res3 = Ddi.ddi_innerkey_aes_decrypt(1, 225, 1, (byte) 0, ipIn, m_data, m_data.length, cipher1);
					String data2 = ByteUtils.byteArray2HexString(cipher1);
					if (res3 == 0 && data2.equalsIgnoreCase(plain)) {
						myHandleDeal("������Կ���ܳɹ�", res3);
					} else {
						myHandleDeal("group53������Կ����ʧ��" + data2, res3);
					}
				} else {
					myHandleDeal("group53������Կ����ʧ��" + data1, res2);
				}
			} else {
				myHandleDeal("group53���¹�����Կʧ��", res1);
			}
		} else {
			myHandleDeal("group53��������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	// �����ӵ� ������������Կ���ȴ���
	private void testgroup54() {
		myHandleDeal("testgroup54����", 0);
		// DES ����7
		String key1 = "31313131313131";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF31";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		String key3 = "56248AAAAAAAAAAA9999efBCabcdEFBF12345678abcdE";
		byte[] innerkey3 = ByteUtils.hexString2ByteArray(key3);
		String key4 = "56248AAAAAAAAAAA9999efBCabcdEFBF31";
		byte[] innerkey4 = ByteUtils.hexString2ByteArray(key4);
		String key5 = "A12345678A12345678A12345678A12";
		byte[] innerkey5 = ByteUtils.hexString2ByteArray(key5);
		String key6 = "A12345678A12345678A12345678A1234ABCDEF01234567";
		byte[] innerkey6 = ByteUtils.hexString2ByteArray(key6);
		String key7 = "A12345678A12345678A12345678A1234ABCDEF012345678ABDECF098765423";
		byte[] innerkey7 = ByteUtils.hexString2ByteArray(key7);
		String plain = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] m_plain = ByteUtils.hexString2ByteArray(plain);
		byte[] cipher = new byte[16];
		Ddi.ddi_innerkey_open();
		// ����DES����Կ���ȴ���
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x00, 0, innerkey1, 8);
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 1, innerkey2, 17);
		int res2 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 75, innerkey3, 24);
		int res3 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 0, innerkey4, 17);
		int res4 = Ddi.ddi_innerkey_update_mk((byte) 0x04, 77, innerkey5, 16);
		int res5 = Ddi.ddi_innerkey_update_mk((byte) 0x05, 0, innerkey6, 24);
		int res6 = Ddi.ddi_innerkey_update_mk((byte) 0x06, 149, innerkey7, 32);
		int res7 = Ddi.ddi_innerkey_des_encrypt(0, 1, 0, ipIn, m_plain, 16, cipher);
		String byteArray2HexString = ByteUtils.byteArray2HexString(cipher);

		if (res0 == -12 && res1 == -6 && res2 == -12 && res3 == -6 && res4 == -12 && res5 == -12 && res6 == -12) {
			myHandleDeal("group54���Գɹ�", 0);
		} else {
			myHandleDeal("group54����ʧ��" + res0 + res1 + res2 + res3 + res4 + res5 + res6 + byteArray2HexString, res0);
		}

		Ddi.ddi_innerkey_close();
	}

	// �����ӵ� �������й�����Կ���ȴ���
	private void testgroup55() {
		myHandleDeal("testgroup55����", 0);
		// DES ����7
		String key1 = "3131313131313131";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		String key3 = "56248AAAAAAAAAAA9999efBCabcdEFBF12345678abcdE3131";
		byte[] innerkey3 = ByteUtils.hexString2ByteArray(key3);
		String key4 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey4 = ByteUtils.hexString2ByteArray(key4);
		String key5 = "A12345678A12345678A12345678A1231";
		byte[] innerkey5 = ByteUtils.hexString2ByteArray(key5);
		String key6 = "A12345678A12345678A12345678A1234ABCDEF0123456731";
		byte[] innerkey6 = ByteUtils.hexString2ByteArray(key6);
		String key7 = "A12345678A12345678A12345678A1234ABCDEF012345678ABDECF09876542331";
		byte[] innerkey7 = ByteUtils.hexString2ByteArray(key7);
		// ���¹�����Կ
		// ��һλ
		String key8 = "31313131313131";
		byte[] innerkey8 = ByteUtils.hexString2ByteArray(key8);
		// ��һλ
		String key9 = "56248AAAAAAAAAAA9999efBCabcdEFBF31";
		byte[] innerkey9 = ByteUtils.hexString2ByteArray(key9);
		// ��һλ
		String key10 = "56248AAAAAAAAAAA9999efBCabcdEFBF12345678abcdE3";
		byte[] innerkey10 = ByteUtils.hexString2ByteArray(key10);
		// ��һλ
		String key11 = "56248AAAAAAAAAAA9999efBCabcdEFBF31";
		byte[] innerkey11 = ByteUtils.hexString2ByteArray(key11);
		// ��һλ
		String key12 = "A12345678A12345678A12345678A12";
		byte[] innerkey12 = ByteUtils.hexString2ByteArray(key12);
		// ��һλ
		String key13 = "A12345678A12345678A12345678A1234ABCDEF012345678ABDECF09876542331";
		byte[] innerkey13 = ByteUtils.hexString2ByteArray(key13);
		// ��һλ
		String key14 = "A12345678A12345678A12345678A1234ABCDEF012345678ABDECF098765423";
		byte[] innerkey14 = ByteUtils.hexString2ByteArray(key14);
		String plain = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] m_plain = ByteUtils.hexString2ByteArray(plain);
		byte[] cipher = new byte[16];
		Ddi.ddi_innerkey_open();
		// ����DES����Կ���ȴ���
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x00, 0, innerkey1, 8);
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 1, innerkey2, 16);
		int res2 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 75, innerkey3, 24);
		int res3 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 2, innerkey4, 16);
		int res4 = Ddi.ddi_innerkey_update_mk((byte) 0x04, 77, innerkey5, 16);
		int res5 = Ddi.ddi_innerkey_update_mk((byte) 0x05, 58, innerkey6, 24);
		int res6 = Ddi.ddi_innerkey_update_mk((byte) 0x06, 149, innerkey7, 32);
		int res = res0 + res1 + res2 + res3 + res4 + res5 + res6;
		// ���¹�����Կ
		int res7 = Ddi.ddi_innerkey_update_wk((byte) 0x00, 0, 0, 1, ipIn, innerkey8, 8, ipOut, 8);
		//
		int res8 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 1, 449, 0, ipIn, innerkey9, 16, ipOut, 16);
		int res9 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 75, 225, 1, ipIn, innerkey10, 24, ipOut, 24);
		int res10 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 2, 449, 1, ipIn, innerkey11, 16, ipOut, 16);
		int res11 = Ddi.ddi_innerkey_update_wk((byte) 0x04, 77, 448, 1, ipIn, innerkey12, 16, ipOut, 16);
		// ������¹�����Կ��Ҫ32������
		int res12 = Ddi.ddi_innerkey_update_wk((byte) 0x05, 58, 225, 0, ipIn, innerkey13, 32, ipOut, 32);
		int res13 = Ddi.ddi_innerkey_update_wk((byte) 0x06, 149, 447, 1, ipIn, innerkey14, 32, ipOut, 32);

		if (res == 0 && res7 == -12 && res8 == 0 && res9 == -12 && res10 == 0 && res11 == -12 && res12 == 0
				&& res13 == -12) {
			myHandleDeal("group55���Գɹ�", res);
		} else {
			myHandleDeal("group55���¹�����Կʧ��" + res + res7 + res8 + res9 + res10 + res11 + res12 + res13, res13);
		}

		Ddi.ddi_innerkey_close();
	}

	private void testgroup56() {
		myHandleDeal("testgroup56����", 0);
		String key1 = "3131313131313131";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		String key3 = "56248AAAAAAAAAAA9999efBCabcdEFBF12345678abcdE3131";
		byte[] innerkey3 = ByteUtils.hexString2ByteArray(key3);
		String key4 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey4 = ByteUtils.hexString2ByteArray(key4);
		String key5 = "A12345678A12345678A12345678A1231";
		byte[] innerkey5 = ByteUtils.hexString2ByteArray(key5);
		String key6 = "A12345678A12345678A12345678A1234ABCDEF0123456731";
		byte[] innerkey6 = ByteUtils.hexString2ByteArray(key6);
		String key7 = "A12345678A12345678A12345678A1234ABCDEF012345678ABDECF09876542331";
		byte[] innerkey7 = ByteUtils.hexString2ByteArray(key7);
		byte[] DataOut = new byte[16];
		byte[] DataOut1 = new byte[8];
		String data0 = "2991FCFB578BE74B3759327E4058E81B";
		String data1 = "89AD2858A2902A1127DE9FEAEB110E29";
		String data2 = "5BB3F8E0BCEE48309F262BBF422D05D5";
		byte[] msg_summery1 = ByteUtils.hexString2ByteArray("8e98da9f1499660dab384cf18e353e25");
		Ddi.ddi_innerkey_open();
		int res7 = Ddi.ddi_innerkey_update_mk((byte) 0x00, 0, innerkey1, 8);
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 1, innerkey2, 16);
		int res2 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 75, innerkey3, 24);
		int res3 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 100, innerkey4, 16);
		int res4 = Ddi.ddi_innerkey_update_mk((byte) 0x04, 77, innerkey5, 16);
		int res5 = Ddi.ddi_innerkey_update_mk((byte) 0x05, 149, innerkey6, 24);
		int res6 = Ddi.ddi_innerkey_update_mk((byte) 0x06, 99, innerkey7, 32);
		int res0 = res7 + res1 + res2 + res3 + res4 + res5 + res6;
		if (res0 == 0) {
			myHandleDeal("group56��������Կ�ɹ�", res0);
			int res8 = Ddi.ddi_innerkey_nes_sm4_encrypt(0, 1, (byte) 0, ipIn, innerkey2, innerkey2.length, DataOut1,
					leOut);
			int res9 = Ddi.ddi_innerkey_nes_sm4_decrypt(0, 1, 148, (byte) 0, ipIn, DataOut, DataOut.length, ipOut,
					leOut);
			String byteArray2HexString1 = ByteUtils.byteArray2HexString(DataOut);
			int res10 = Ddi.ddi_innerkey_nes_sm4_encrypt(0, 100, (byte) 0, ipIn, innerkey5, innerkey5.length, DataOut,
					leOut);
			int res11 = Ddi.ddi_innerkey_nes_sm4_decrypt(0, 100, 148, (byte) 0, ipIn, DataOut, DataOut.length, ipOut,
					leOut);
			String byteArray2HexString2 = ByteUtils.byteArray2HexString(DataOut);
			int res13 = Ddi.ddi_innerkey_nes_sm4_encrypt(0, 77, (byte) 0, ipIn, innerkey5, innerkey5.length, DataOut,
					leOut);
			int res14 = Ddi.ddi_innerkey_nes_sm4_decrypt(0, 77, 148, (byte) 0, ipIn, DataOut, DataOut.length, ipOut,
					leOut);
			String byteArray2HexString3 = ByteUtils.byteArray2HexString(DataOut);
			if (res8 == -6 && res9 == -6 && res10 == 0 && res11 == 0 && byteArray2HexString2.equalsIgnoreCase(data1)
					&& res13 == -6 && res14 == -6) {
				myHandleDeal("group56SM4�ӽ��ܳɹ�", res9);

			} else {
				myHandleDeal("SM4�ӽ���ʧ��" + res8 + res9 + res10 + res11 + res13 + res14, res9);

			}
			int res15 = Ddi.ddi_innerkey_nes_sm4_encrypt(0, 0, (byte) 0, ipIn, innerkey5, innerkey5.length, DataOut,
					leOut);
			int res16 = Ddi.ddi_innerkey_nes_sm4_encrypt(0, 75, (byte) 0, ipIn, innerkey5, innerkey5.length, DataOut,
					leOut);
			int res17 = Ddi.ddi_innerkey_nes_sm4_encrypt(0, 149, (byte) 0, ipIn, innerkey5, innerkey5.length, DataOut,
					leOut);
			int res18 = Ddi.ddi_innerkey_nes_sm4_encrypt(0, 99, (byte) 0, ipIn, innerkey5, innerkey5.length, DataOut,
					leOut);
			if (res15 == -6 && res16 == -6 && res17 == -6 && res18 == -6) {
				myHandleDeal("group56SM4�ӽ��ܳɹ�", 0);

			} else {
				myHandleDeal("group56SM4SM4�ӽ���ʧ��" + res15 + res16 + res17 + res18, res18);

			}
		} else {
			myHandleDeal("group1��������Կʧ��" + res7 + res1 + res2 + res3 + res4 + res5 + res6, res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup57() {
		myHandleDeal("testgroup57����", 0);
		String key1 = "3131313131313131";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		String key3 = "56248AAAAAAAAAAA9999efBCabcdEFBF12345678abcdE3131";
		byte[] innerkey3 = ByteUtils.hexString2ByteArray(key3);
		String key4 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey4 = ByteUtils.hexString2ByteArray(key4);
		String key5 = "A12345678A12345678A12345678A1231";
		byte[] innerkey5 = ByteUtils.hexString2ByteArray(key5);
		String key6 = "A12345678A12345678A12345678A1234ABCDEF0123456731";
		byte[] innerkey6 = ByteUtils.hexString2ByteArray(key6);
		String key7 = "A12345678A12345678A12345678A1234ABCDEF012345678ABDECF09876542331";
		byte[] innerkey7 = ByteUtils.hexString2ByteArray(key7);
		byte[] DataOut = new byte[16];
		String data0 = "6AF42BF7E0EB0023899893FA5EAD3068";
		String data1 = "7AC56706E12F6C58B3435E4D57B22224";
		String data2 = "FF1C242E95023C50FDDFF62713EDFF46";
		byte[] msg_summery1 = ByteUtils.hexString2ByteArray("8e98da9f1499660dab384cf18e353e25");
		Ddi.ddi_innerkey_open();
		int res7 = Ddi.ddi_innerkey_update_mk((byte) 0x00, 0, innerkey1, 8);
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 1, innerkey2, 16);
		int res2 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 75, innerkey3, 24);
		int res3 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 100, innerkey4, 16);
		int res4 = Ddi.ddi_innerkey_update_mk((byte) 0x04, 77, innerkey5, 16);
		int res5 = Ddi.ddi_innerkey_update_mk((byte) 0x05, 149, innerkey6, 24);
		int res6 = Ddi.ddi_innerkey_update_mk((byte) 0x06, 99, innerkey7, 32);
		int res0 = res7 + res1 + res2 + res3 + res4 + res5 + res6;
		if (res0 == 0) {
			myHandleDeal("group57��������Կ�ɹ�", res0);
			int res8 = Ddi.ddi_innerkey_nes_sm4_encrypt(0, 1, (byte) 1, ipIn, innerkey2, innerkey2.length, DataOut,
					leOut);
			int res9 = Ddi.ddi_innerkey_nes_sm4_decrypt(0, 1, 148, (byte) 1, ipIn, DataOut, DataOut.length, ipOut,
					leOut);
			String byteArray2HexString1 = ByteUtils.byteArray2HexString(DataOut);
			int res10 = Ddi.ddi_innerkey_nes_sm4_encrypt(0, 100, (byte) 1, ipIn, innerkey5, innerkey5.length, DataOut,
					leOut);
			int res11 = Ddi.ddi_innerkey_nes_sm4_decrypt(0, 100, 148, (byte) 1, ipIn, DataOut, DataOut.length, ipOut,
					leOut);
			String byteArray2HexString2 = ByteUtils.byteArray2HexString(DataOut);
			int res13 = Ddi.ddi_innerkey_nes_sm4_encrypt(0, 77, (byte) 1, ipIn, innerkey5, innerkey5.length, DataOut,
					leOut);
			int res14 = Ddi.ddi_innerkey_nes_sm4_decrypt(0, 77, 148, (byte) 1, ipIn, DataOut, DataOut.length, ipOut,
					leOut);
			String byteArray2HexString3 = ByteUtils.byteArray2HexString(DataOut);
			if (res8 == -6 && res9 == -6 && res10 == 0 && res11 == 0 && byteArray2HexString2.equalsIgnoreCase(data1)
					&& res13 == -6 && res14 == -6) {
				myHandleDeal("group57�ӽ��ܳɹ�", res9);

			} else {
				myHandleDeal("SM4�ӽ���ʧ��" + res8 + res9 + res10 + res11 + res13 + res14, res9);

			}
			int res15 = Ddi.ddi_innerkey_nes_sm4_encrypt(0, 0, (byte) 1, ipIn, innerkey5, innerkey5.length, DataOut,
					leOut);
			int res16 = Ddi.ddi_innerkey_nes_sm4_encrypt(0, 75, (byte) 1, ipIn, innerkey5, innerkey5.length, DataOut,
					leOut);
			int res17 = Ddi.ddi_innerkey_nes_sm4_encrypt(0, 149, (byte) 1, ipIn, innerkey5, innerkey5.length, DataOut,
					leOut);
			int res18 = Ddi.ddi_innerkey_nes_sm4_encrypt(0, 99, (byte) 1, ipIn, innerkey5, innerkey5.length, DataOut,
					leOut);
			if (res15 == -6 && res16 == -6 && res17 == -6 && res18 == -6) {
				myHandleDeal("group57�ӽ��ܳɹ�", 0);

			} else {
				myHandleDeal("SM4�ӽ���ʧ��" + res15 + res16 + res17 + res18, res18);

			}
		} else {
			myHandleDeal("group1��������Կʧ��" + res7 + res1 + res2 + res3 + res4 + res5 + res6, res0);
		}
		Ddi.ddi_innerkey_close();
	}

	// SM4������Կ�ӽ���
	private void testgroup58() {
		myHandleDeal("testgroup58����", 0);
		String key1 = "3131313131313131";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		String key3 = "56248AAAAAAAAAAA9999efBCabcdEFBF12345678abcdE313";
		byte[] innerkey3 = ByteUtils.hexString2ByteArray(key3);
		String key4 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey4 = ByteUtils.hexString2ByteArray(key4);
		String key5 = "A12345678A12345678A12345678A1231";
		byte[] innerkey5 = ByteUtils.hexString2ByteArray(key5);
		String key6 = "A12345678A12345678A12345678A1234ABCDEF0123456731";
		byte[] innerkey6 = ByteUtils.hexString2ByteArray(key6);
		String key7 = "A12345678A12345678A12345678A1234ABCDEF012345678ABDECF09876542331";
		byte[] innerkey7 = ByteUtils.hexString2ByteArray(key7);
		String key8 = "A12345678A12345678A12345678A1234ABCDEF012345678ABDECF09876542344";
		byte[] innerkey8 = ByteUtils.hexString2ByteArray(key8);
		byte[] DataOut = new byte[16];
		String data0 = "D4168D1BF109ACE2C5D4048BCE048591";
		String data1 = "37D960A41B0D83CCD30CAE06581F174D";
		String data2 = "04DD342EC1CF7C3EBAAA7EF4D492D08C";
		byte[] msg_summery1 = ByteUtils.hexString2ByteArray("8e98da9f1499660dab384cf18e353e25");
		Ddi.ddi_innerkey_open();
		Ddi.ddi_innerkey_update_mk((byte) 0x00, 0, innerkey1, 8);
		int res7 = Ddi.ddi_innerkey_update_wk((byte) 0x00, 0, 0, 0, ipIn, innerkey2, 8, ipOut, 8);
		Ddi.ddi_innerkey_update_mk((byte) 0x01, 1, innerkey2, 16);
		int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 1, 75, 0, ipIn, innerkey2, 16, ipOut, 16);
		Ddi.ddi_innerkey_update_mk((byte) 0x02, 75, innerkey3, 24);
		int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 75, 225, 0, ipIn, innerkey3, 24, ipOut, 24);
		Ddi.ddi_innerkey_update_mk((byte) 0x03, 100, innerkey4, 16);
		int res3 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 100, 100, 0, ipIn, innerkey2, 16, ipOut, 16);
		Ddi.ddi_innerkey_update_mk((byte) 0x04, 77, innerkey5, 16);
		int res4 = Ddi.ddi_innerkey_update_wk((byte) 0x04, 77, 99, 0, ipIn, innerkey2, 16, ipOut, 16);
		Ddi.ddi_innerkey_update_mk((byte) 0x05, 149, innerkey6, 24);
		int res5 = Ddi.ddi_innerkey_update_wk((byte) 0x05, 149, 448, 0, ipIn, innerkey8, 32, ipOut, 32);
		Ddi.ddi_innerkey_update_mk((byte) 0x06, 99, innerkey7, 32);
		int res6 = Ddi.ddi_innerkey_update_wk((byte) 0x06, 99, 449, 0, ipIn, innerkey8, 32, ipOut, 32);
		int res0 = res7 + res1 + res2 + res3 + res4 + res5 + res6;
		if (res0 == 0) {
			myHandleDeal("group56���¹�����Կ�ɹ�", res0);
			int res8 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, 75, (byte) 0, ipIn, innerkey2, innerkey2.length, DataOut,
					leOut);
			int res9 = Ddi.ddi_innerkey_nes_sm4_decrypt(1, 75, 148, (byte) 0, ipIn, DataOut, DataOut.length, ipOut,
					leOut);
			String byteArray2HexString1 = ByteUtils.byteArray2HexString(DataOut);
			int res10 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, 100, (byte) 0, ipIn, innerkey5, innerkey5.length, DataOut,
					leOut);
			int res11 = Ddi.ddi_innerkey_nes_sm4_decrypt(1, 100, 148, (byte) 0, ipIn, DataOut, DataOut.length, ipOut,
					leOut);
			String byteArray2HexString2 = ByteUtils.byteArray2HexString(DataOut);
			int res13 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, 99, (byte) 0, ipIn, innerkey5, innerkey5.length, DataOut,
					leOut);
			int res14 = Ddi.ddi_innerkey_nes_sm4_decrypt(1, 99, 148, (byte) 0, ipIn, DataOut, DataOut.length, ipOut,
					leOut);
			String byteArray2HexString3 = ByteUtils.byteArray2HexString(DataOut);

			if (res9 == -6 && res10 == 0 && res11 == 0 && byteArray2HexString2.equalsIgnoreCase(data1) && res13 == -6
					&& res14 == -6) {
				myHandleDeal("group58SM4�ӽ��ܳɹ�", res9);

			} else {
				myHandleDeal("SM4�ӽ���ʧ��" + res7 + res9 + res10 + res11 + res13 + res14, res9);
				myHandleDeal("SM4�ӽ���ʧ��" + "==" + byteArray2HexString1 + "==" + byteArray2HexString2 + "=="
						+ byteArray2HexString3, res9);

			}
			int res15 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, 0, (byte) 0, ipIn, innerkey5, innerkey5.length, DataOut,
					leOut);
			int res16 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, 225, (byte) 0, ipIn, innerkey5, innerkey5.length, DataOut,
					leOut);
			int res17 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, 448, (byte) 0, ipIn, innerkey5, innerkey5.length, DataOut,
					leOut);
			int res18 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, 449, (byte) 0, ipIn, innerkey5, innerkey5.length, DataOut,
					leOut);
			if (res15 == -6 && res16 == -6 && res17 == -6 && res18 == -6) {
				myHandleDeal("group58SM4�ӽ��ܳɹ�", 0);

			} else {
				myHandleDeal("SM4�ӽ���ʧ��" + res15 + res16 + res17 + res18, res18);

			}
		} else {
			myHandleDeal("group1���¹�����Կʧ��" + res7 + res1 + res2 + res3 + res4 + res5 + res6, res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup59() {
		myHandleDeal("testgroup59����", 0);
		String key1 = "3131313131313131";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		String key3 = "56248AAAAAAAAAAA9999efBCabcdEFBF12345678abcdE313";
		byte[] innerkey3 = ByteUtils.hexString2ByteArray(key3);
		String key4 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey4 = ByteUtils.hexString2ByteArray(key4);
		String key5 = "A12345678A12345678A12345678A1231";
		byte[] innerkey5 = ByteUtils.hexString2ByteArray(key5);
		String key6 = "A12345678A12345678A12345678A1234ABCDEF0123456731";
		byte[] innerkey6 = ByteUtils.hexString2ByteArray(key6);
		String key7 = "A12345678A12345678A12345678A1234ABCDEF012345678ABDECF09876542331";
		byte[] innerkey7 = ByteUtils.hexString2ByteArray(key7);
		String key8 = "A12345678A12345678A12345678A1234ABCDEF012345678ABDECF09876542344";
		byte[] innerkey8 = ByteUtils.hexString2ByteArray(key8);
		byte[] DataOut = new byte[16];
		String data0 = "7B2DE211F68F4541242AF59F344BF26C";
		String data1 = "AEA62F21BB79034C660ED60EFFD0F80F";
		String data2 = "B15D4B6965198A91CCABF5B34F634C7E";
		byte[] msg_summery1 = ByteUtils.hexString2ByteArray("8e98da9f1499660dab384cf18e353e25");
		Ddi.ddi_innerkey_open();
		Ddi.ddi_innerkey_update_mk((byte) 0x00, 0, innerkey1, 8);
		int res7 = Ddi.ddi_innerkey_update_wk((byte) 0x00, 0, 0, 0, ipIn, innerkey2, 8, ipOut, 8);
		Ddi.ddi_innerkey_update_mk((byte) 0x01, 1, innerkey2, 16);
		int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 1, 75, 0, ipIn, innerkey2, 16, ipOut, 16);
		Ddi.ddi_innerkey_update_mk((byte) 0x02, 75, innerkey3, 24);
		int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 75, 225, 0, ipIn, innerkey3, 24, ipOut, 24);
		Ddi.ddi_innerkey_update_mk((byte) 0x03, 100, innerkey4, 16);
		int res3 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 100, 100, 0, ipIn, innerkey2, 16, ipOut, 16);
		Ddi.ddi_innerkey_update_mk((byte) 0x04, 77, innerkey5, 16);
		int res4 = Ddi.ddi_innerkey_update_wk((byte) 0x04, 77, 99, 0, ipIn, innerkey2, 16, ipOut, 16);
		Ddi.ddi_innerkey_update_mk((byte) 0x05, 149, innerkey6, 24);
		int res5 = Ddi.ddi_innerkey_update_wk((byte) 0x05, 149, 448, 0, ipIn, innerkey8, 32, ipOut, 32);
		Ddi.ddi_innerkey_update_mk((byte) 0x06, 99, innerkey7, 32);
		int res6 = Ddi.ddi_innerkey_update_wk((byte) 0x06, 99, 449, 0, ipIn, innerkey8, 32, ipOut, 32);
		int res0 = res7 + res1 + res2 + res3 + res4 + res5 + res6;
		if (res0 == 0) {
			myHandleDeal("group56���¹�����Կ�ɹ�", res0);
			// ������Կ���ģ�58DAD7224B1CC6B504DB93AF981D0BAC
			int res8 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, 75, (byte) 1, ipIn, innerkey2, innerkey2.length, DataOut,
					leOut);
			int res9 = Ddi.ddi_innerkey_nes_sm4_decrypt(1, 75, 148, (byte) 1, ipIn, DataOut, DataOut.length, ipOut,
					leOut);
			String byteArray2HexString1 = ByteUtils.byteArray2HexString(DataOut);
			// ������Կ���ģ�0C0347F95FFB5F61E734E6A36E273E04
			int res10 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, 100, (byte) 1, ipIn, innerkey5, innerkey5.length, DataOut,
					leOut);
			int res11 = Ddi.ddi_innerkey_nes_sm4_decrypt(1, 100, 148, (byte) 1, ipIn, DataOut, DataOut.length, ipOut,
					leOut);
			String byteArray2HexString2 = ByteUtils.byteArray2HexString(DataOut);
			// ������Կ���ģ�CBAFD264D221EC69F43D95483877B583
			int res13 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, 99, (byte) 1, ipIn, innerkey5, innerkey5.length, DataOut,
					leOut);
			int res14 = Ddi.ddi_innerkey_nes_sm4_decrypt(1, 99, 148, (byte) 1, ipIn, DataOut, DataOut.length, ipOut,
					leOut);
			String byteArray2HexString3 = ByteUtils.byteArray2HexString(DataOut);

			if (res8 == -6 && res9 == -6 && res10 == 0 && res11 == 0 && byteArray2HexString2.equalsIgnoreCase(data1)
					&& res13 == -6 && res14 == -6) {
				myHandleDeal("group56SM4�ӽ��ܳɹ�", res9);

			} else {
				myHandleDeal("SM4�ӽ���ʧ��" + res7 + res9 + res10 + res11 + res13 + res14, res9);
				myHandleDeal("SM4�ӽ���ʧ��" + "==" + byteArray2HexString1 + "==" + byteArray2HexString2 + "=="
						+ byteArray2HexString3, res9);

			}
			int res15 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, 0, (byte) 1, ipIn, innerkey5, innerkey5.length, DataOut,
					leOut);
			int res16 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, 225, (byte) 1, ipIn, innerkey5, innerkey5.length, DataOut,
					leOut);
			int res17 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, 448, (byte) 1, ipIn, innerkey5, innerkey5.length, DataOut,
					leOut);
			int res18 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, 449, (byte) 1, ipIn, innerkey5, innerkey5.length, DataOut,
					leOut);
			if (res15 == -6 && res16 == -6 && res17 == -6 && res18 == -6) {
				myHandleDeal("group59SM4�ӽ��ܳɹ�", 0);

			} else {
				myHandleDeal("SM4�ӽ���ʧ��" + res15 + res16 + res17 + res18, res18);

			}
		} else {
			myHandleDeal("group1���¹�����Կʧ��" + res7 + res1 + res2 + res3 + res4 + res5 + res6, res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup60() {
		myHandleDeal("testgroup60����", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		String data = "9235C9791D2AD415D70C674B6ECB194F";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] DataOut = new byte[16];
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_delete_key(0, 1);
		if (res0 == 0) {
			myHandleDeal("ɾ������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
			if (res1 == 0) {
				myHandleDeal("��������Կ���Գɹ�", res1);
				int res2 = Ddi.ddi_innerkey_des_decrypt(0, 0, 1, 1, ipIn, innerkey1, 16, ipOut);
				if (res2 == 0) {
					myHandleDeal("����Կ���ܳɹ�", res2);
					int res3 = Ddi.ddi_innerkey_des_encrypt(0, 1, 1, ipIn, innerkey1, 16, DataOut);
					String data1 = ByteUtils.byteArray2HexString(DataOut);
					if (res3 == 0 && data1.equalsIgnoreCase(data)) {
						myHandleDeal("����Կ���ܳɹ�", res3);
					} else {
						myHandleDeal("group60����Կ����ʧ��" + data1, res3);
					}
				} else {
					myHandleDeal("group60����Կ����ʧ��", res2);
				}
			} else {
				myHandleDeal("group60��������Կ����ʧ��", res1);
			}
		} else {
			myHandleDeal("group60ɾ������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
		
	}

	private void testgroup61() {
		myHandleDeal("testgroup61����", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF12345678abcdEFBF";
		String data = "0C7C1C0045D30B8294D146DB904C6A0B56C497A6C832AB1E";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] DataOut = new byte[24];
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_delete_key(0, 1);
		if (res0 == 0) {
			myHandleDeal("ɾ������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 0, innerkey1, 24);
			if (res1 == 0) {
				myHandleDeal("��������Կ���Գɹ�", res1);
				int res2 = Ddi.ddi_innerkey_des_decrypt(0, 0, 1, 1, ipIn, innerkey1, 24, ipOut);
				if (res2 == 0) {
					myHandleDeal("����Կ���ܳɹ�", res2);
					int res3 = Ddi.ddi_innerkey_des_encrypt(0, 1, 1, ipIn, innerkey1, 24, DataOut);
					String data1 = ByteUtils.byteArray2HexString(DataOut);
					if (res3 == 0 && data1.equalsIgnoreCase(data)) {
						myHandleDeal("����Կ���ܳɹ�", res3);
					} else {
						myHandleDeal("group61����Կ����ʧ��", res3);
					}
				} else {
					myHandleDeal("group61����Կ����ʧ��", res2);
				}
			} else {
				myHandleDeal("group61��������Կ����ʧ��", res1);
			}
		} else {
			myHandleDeal("group61ɾ������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup62() {
		myHandleDeal("testgroup62����", 0);
		String key1 = "12345678abcdEFBF";
		String data = "24FCC3DE711A4251";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] DataOut = new byte[8];
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_delete_key(0, 1);
		if (res0 == 0) {
			myHandleDeal("ɾ������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x00, 0, innerkey1, 8);
			if (res1 == 0) {
				myHandleDeal("��������Կ���Գɹ�", res1);
				int res2 = Ddi.ddi_innerkey_des_decrypt(0, 0, 1, 1, ipIn, innerkey1, 8, ipOut);
				if (res2 == 0) {
					myHandleDeal("����Կ���ܳɹ�", res2);
					int res3 = Ddi.ddi_innerkey_des_encrypt(0, 1, 1, ipIn, innerkey1, 8, DataOut);
					String data1 = ByteUtils.byteArray2HexString(DataOut);
					if (res3 == 0 && data1.equalsIgnoreCase(data)) {
						myHandleDeal("����Կ���ܳɹ�", res3);
					} else {
						myHandleDeal("group62����Կ����ʧ��", res3);
					}
				} else {
					myHandleDeal("group62����Կ����ʧ��", res2);
				}
			} else {
				myHandleDeal("group62��������Կ����ʧ��", res1);
			}
		} else {
			myHandleDeal("group62ɾ������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
	}
    //2020.05.19 N5S �������������Ϊ4096
	// 2019.10.22 ������Կ����ӿ�(DES,SM4,AES)��DUKPT���ݼ��ܼ�MAC�������������������ݳ����޸�Ϊ2048;
	// DES�㷨 ����ԿECB��CBCģʽ���ܺͽ������ݳ���2048
	private void testgroup124() {
	
		
		//2048
		myHandleDeal("testgroup124����", 0);
		String key1 = "3131313131313131";
		String key2 = "3131313131313131";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(ParaEntity.dataString2048);
//		byte[] innerkey2 = ByteUtils.hexString2ByteArray(ParaEntity.dataString16);
//		byte[] innerkey2 = ByteUtils.hexString2ByteArray(ParaEntity.dataString512);
		byte[] innerkey3 = ByteUtils.hexString2ByteArray(key1);
		
		byte[] ipOut1 = new byte[2048];
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_delete_key(0, 1);
		if (res0 == 0) {
			myHandleDeal("group124ɾ������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x00, 0, innerkey1, 8);
			if (res1 == 0) {
				myHandleDeal("group124��������Կ���Գɹ�", res1);
				int res6 = Ddi.ddi_innerkey_update_wk((byte) 0x00, 0, 449, 1, ipIn, innerkey3, 8, ipOut, 8);
				myHandleDeal("group124CBC���¹�����Կ�ɹ�", res6);
				// DES CBC
				int res2 = Ddi.ddi_innerkey_des_decrypt(1, 449, 1, 1, ipIn, innerkey2, innerkey2.length, ipOut1);
				if (res2 == 0) {
					myHandleDeal("group124CBC����Կ���ܳɹ�", res2);
					int res3 = Ddi.ddi_innerkey_des_encrypt(1, 449, 1, ipIn, ipOut1, ipOut1.length, ipOut1);
					String data1 = ByteUtils.byteArray2HexString(ipOut1);
					if (res3 == 0 && data1.equalsIgnoreCase(ParaEntity.dataString2048)) {
						myHandleDeal("group124CBC����Կ���ܳɹ�", res3);
					} else {
						myHandleDeal("group124CBC����Կ����ʧ��", res3);
					}
				} else {
					myHandleDeal("group124CBC����Կ����ʧ��", res2);
				}
				// DES ECB
				int res4 = Ddi.ddi_innerkey_des_decrypt(1, 449, 1, 0, ipIn, innerkey2, innerkey2.length, ipOut1);
				if (res4 == 0) {
					myHandleDeal("group124ECB����Կ���ܳɹ�", res4);
					int res5 = Ddi.ddi_innerkey_des_encrypt(1, 449, 0, ipIn, ipOut1, ipOut1.length, ipOut1);
					String data1 = ByteUtils.byteArray2HexString(ipOut1);
					if (res5 == 0 && data1.equalsIgnoreCase(ParaEntity.dataString2048)) {
						myHandleDeal("group124ECB����Կ���ܳɹ�", res5);
					} else {
						myHandleDeal("group124ECB����Կ����ʧ��", res5);
					}
				} else {
					myHandleDeal("group124ECB����Կ����ʧ��", res4);
				}
				
			} else {
				myHandleDeal("group124��������Կ����ʧ��", res1);
			}
		} else {
			myHandleDeal("group124ɾ������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
		
	}

	// 2DES�㷨 ����ԿECB��CBCģʽ���ܺͽ������ݳ���2048
	private void testgroup125() {
		
		
	
		
		//4096
		myHandleDeal("testgroup125����", 0);
		String key1 = "31313131313131313131313131313131";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(ParaEntity.dataString2048);
		
		byte[] ipOut1 = new byte[2048];
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_delete_key(0, 1);
		if (res0 == 0) {
			myHandleDeal("group125ɾ������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
			int res6 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 0, 0, ipIn, innerkey1, 16, ipOut, 16);
			if (res1 == 0 && res6 == 0) {
				myHandleDeal("group125��������Կ�͹�����Կ���Գɹ�", res1);
				// DES CBC
				int res2 = Ddi.ddi_innerkey_des_decrypt(1, 0, 1, 1, ipIn, innerkey2, innerkey2.length, ipOut1);
				if (res2 == 0) {
					myHandleDeal("group125CBC����Կ���ܳɹ�", res2);
					int res3 = Ddi.ddi_innerkey_des_encrypt(1, 0, 1, ipIn, ipOut1, ipOut1.length, ipOut1);
					String data1 = ByteUtils.byteArray2HexString(ipOut1);
					if (res3 == 0 && data1.equalsIgnoreCase(ParaEntity.dataString2048)) {
						myHandleDeal("group125CBC����Կ���ܳɹ�", res3);
					} else {
						myHandleDeal("group125CBC����Կ����ʧ��", res3);
					}
				} else {
					myHandleDeal("group125CBC����Կ����ʧ��", res2);
				}
				// DES ECB
				int res4 = Ddi.ddi_innerkey_des_decrypt(1, 0, 1, 0, ipIn, innerkey2, innerkey2.length, ipOut1);
				if (res4 == 0) {
					myHandleDeal("group125ECB����Կ���ܳɹ�", res4);
					int res5 = Ddi.ddi_innerkey_des_encrypt(1, 0, 0, ipIn, ipOut1, ipOut1.length, ipOut1);
					String data1 = ByteUtils.byteArray2HexString(ipOut1);
					if (res5 == 0 && data1.equalsIgnoreCase(ParaEntity.dataString2048)) {
						myHandleDeal("group125ECB����Կ���ܳɹ�", res5);
					} else {
						myHandleDeal("group125ECB����Կ����ʧ��", res5);
					}
				} else {
					myHandleDeal("group125ECB����Կ����ʧ��", res4);
				}
				
			} else {
				myHandleDeal("group125��������Կ����ʧ��", res1);
			}
		} else {
			myHandleDeal("group125ɾ������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	// 3DES�㷨 ����ԿECB��CBCģʽ���ܺͽ������ݳ���2048
	private void testgroup126() {
	
//
		
		//2048
		myHandleDeal("testgroup126����", 0);
		String key1 = "313131313131313131313131313131313131313131313131";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(ParaEntity.dataString2048);
		
		byte[] ipOut1 = new byte[2048];
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_delete_key(0, 1);
		if (res0 == 0) {
			myHandleDeal("group126ɾ������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 0, innerkey1, 24);
			int res6 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 0, 250, 0, ipIn, innerkey1, innerkey1.length, ipOut, 24);
			if (res1 == 0 && res6 == 0) {
				myHandleDeal("group126��������Կ���Գɹ�", res1);
				// DES CBC
				int res2 = Ddi.ddi_innerkey_des_decrypt(1, 250, 1, 1, ipIn, innerkey2, innerkey2.length, ipOut1);
				if (res2 == 0) {
					myHandleDeal("group126CBC����Կ���ܳɹ�", res2);
					int res3 = Ddi.ddi_innerkey_des_encrypt(1, 250, 1, ipIn, ipOut1, ipOut1.length, ipOut1);
					String data1 = ByteUtils.byteArray2HexString(ipOut1);
					if (res3 == 0 && data1.equalsIgnoreCase(ParaEntity.dataString2048)) {
						myHandleDeal("group126CBC����Կ���ܳɹ�", res3);
					} else {
						myHandleDeal("group126CBC����Կ����ʧ��", res3);
					}
				} else {
					myHandleDeal("group126CBC����Կ����ʧ��", res2);
				}
				// DES ECB
				int res4 = Ddi.ddi_innerkey_des_decrypt(1, 250, 1, 0, ipIn, innerkey2, innerkey2.length, ipOut1);
				if (res4 == 0) {
					myHandleDeal("group126ECB����Կ���ܳɹ�", res4);
					int res5 = Ddi.ddi_innerkey_des_encrypt(1, 250, 0, ipIn, ipOut1, ipOut1.length, ipOut1);
					String data1 = ByteUtils.byteArray2HexString(ipOut1);
					if (res5 == 0 && data1.equalsIgnoreCase(ParaEntity.dataString2048)) {
						myHandleDeal("group126ECB����Կ���ܳɹ�", res5);
					} else {
						myHandleDeal("group126ECB����Կ����ʧ��", res5);
					}
				} else {
					myHandleDeal("group126ECB����Կ����ʧ��", res4);
				}
				
			} else {
				myHandleDeal("group126��������Կ����ʧ��", res1);
			}
		} else {
			myHandleDeal("group126ɾ������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	// SM4�㷨 ����ԿECB��CBCģʽ���ܺͽ������ݳ���2048
	private void testgroup127() {
	
		//2048
		myHandleDeal("testgroup127����", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		String data = "30303030abCDef9930303030abCDef99";
		byte[] ipIn = ByteUtils.hexString2ByteArray(data);
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(ParaEntity.dataString2048);
//		byte[] innerkey2 = ByteUtils.hexString2ByteArray(ParaEntity.dataString504);
		byte[] ipOut1 = new byte[2048];
		
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_delete_key(0, 1);
		if (res0 == 0) {
			myHandleDeal("group127ɾ������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 149, innerkey1, 16);
			int res6 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 149, 253, 0, ipIn, innerkey1, innerkey1.length, ipOut,
					16);
			if (res1 == 0 && res6 == 0) {
				myHandleDeal("group127��������Կ���Գɹ�", res1);
				// SM4 CBC
				int res2 = Ddi.ddi_innerkey_nes_sm4_decrypt(1, 253, 1, (byte) 0x01, ipIn, innerkey2, innerkey2.length,
						ipOut1, leOut);
				if (res2 == 0) {
					myHandleDeal("group127CBC����Կ���ܳɹ�", res2);
					int res3 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, 253, (byte) 0x01, ipIn, ipOut1, ipOut1.length,
							ipOut1, leOut);
					String data2 = ByteUtils.byteArray2HexString(ipOut1);
					
					if (res3 == 0 && data2.equalsIgnoreCase(ParaEntity.dataString2048)) {
						myHandleDeal("group127CBC����Կ���ܳɹ�", res3);
					} else {
						myHandleDeal("group127CBC����Կ����ʧ��", res3);
					}
				} else {
					myHandleDeal("group127CBC����Կ����ʧ��", res2);
				}
				// SM4 ECB
				int res4 = Ddi.ddi_innerkey_nes_sm4_decrypt(1, 253, 1, (byte) 0x01, ipIn, innerkey2, innerkey2.length,
						ipOut1, leOut);
				if (res4 == 0) {
					myHandleDeal("group127ECB����Կ���ܳɹ�", res4);
					int res5 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, 253, (byte) 0x01, ipIn, ipOut1, ipOut1.length,
							ipOut1, leOut);
					String data2 = ByteUtils.byteArray2HexString(ipOut1);
					if (res5 == 0 && data2.equalsIgnoreCase(ParaEntity.dataString2048)) {
						myHandleDeal("group127ECB����Կ���ܳɹ�", res5);
					} else {
						myHandleDeal("group127ECB����Կ����ʧ��", res5);
					}
				} else {
					myHandleDeal("group127ECB����Կ����ʧ��", res4);
				}
			} else {
				myHandleDeal("group127��������Կʧ��", res1);
			}
		} else {
			myHandleDeal("group127ɾ������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	// AES128�㷨 ����ԿECB��CBCģʽ���ܺͽ������ݳ���2048
	private void testgroup128() {
		
		//2048
		myHandleDeal("testgroup128����", 0);
		String key1 = "A12345678A12345678A12345678A1234";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
//		String plain = "12345678abcdEFBFABCDefBCabcdEFBF";
		byte[] m_plain = ByteUtils.hexString2ByteArray(ParaEntity.dataString2048);
		byte[] cipher = new byte[2048];
		byte[] cipher1 = new byte[2048];
//		String data = "ffed87779636b4674ea3e9339b7f488a";
//		String data1 = "030161a242b0ee460d81bd9249cd763e";
//		byte[] m_data = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x04, 0, innerkey1, 16);
		int res6 = Ddi.ddi_innerkey_update_wk((byte) 0x04, 0, 300, 0, ipIn, innerkey1, innerkey1.length, ipOut, 16);
		if (res0 == 0 && res6 == 0) {
			myHandleDeal("group128��������Կ�ɹ�", res0);
			// AES ECB
			int res1 = Ddi.ddi_innerkey_aes_encrypt(1, 300, (byte) 0, ipIn, m_plain, m_plain.length, cipher);
			if (res1 == 0) {
				myHandleDeal("group128ECB����Կ���ܳɹ�", res1);
				int res3 = Ddi.ddi_innerkey_aes_decrypt(1, 300, 1, (byte) 0, ipIn, cipher, cipher.length, cipher1);
				String data2 = ByteUtils.byteArray2HexString(cipher1);
//				String data3 = data2.substring(0, 4096);
				if (res3 == 0 && data2.equalsIgnoreCase(ParaEntity.dataString2048)) {
					myHandleDeal("group128ECB����Կ���ܳɹ�", res3);
					
				} else {
					myHandleDeal("group128ECB����Կ����ʧ��" + data2, res3);
					
				}
			} else {
				myHandleDeal("group128ECB����Կ����ʧ��", res1);
			}
			// AES-128 CBC
			int res4 = Ddi.ddi_innerkey_aes_encrypt(1, 300, (byte) 1, ipIn, m_plain, m_plain.length, cipher);
			if (res4 == 0) {
				myHandleDeal("group128CBC����Կ���ܳɹ�", res4);
				int res3 = Ddi.ddi_innerkey_aes_decrypt(1, 300, 1, (byte) 1, ipIn, cipher, cipher.length, cipher1);
				String data2 = ByteUtils.byteArray2HexString(cipher1);
				if (res3 == 0 && data2.equalsIgnoreCase(ParaEntity.dataString2048)) {
					myHandleDeal("group128CBC����Կ���ܳɹ�", res3);
					
				} else {
					myHandleDeal("group128CBC����Կ����ʧ��", res3);
					
				}
			} else {
				myHandleDeal("group128CBC����Կ����ʧ��", res4);
			}
			
		} else {
			myHandleDeal("group28��������Կʧ��", res0);
		}
		
		Ddi.ddi_innerkey_close();
	}

	// AES192�㷨 ����ԿECB��CBCģʽ���ܺͽ������ݳ���2048
	private void testgroup129() {
		//4096
//		myHandleDeal("testgroup129����", 0);
//		String key1 = "A12345678A12345678A12345678A123422444AABCDEF2312";
//		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
//		String key2 = "A12345678A12345678A12345678A1234ABCDEF012345678ABDECF09876542344";
//		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
////		String plain = "12345678abcdEFBFABCDefBCabcdEFBF";
//		byte[] m_plain = ByteUtils.hexString2ByteArray(ParaEntity.dataString2048);
//		byte[] cipher = new byte[2048];
//		byte[] cipher1 = new byte[2048];
////		String data = "ffed87779636b4674ea3e9339b7f488a";
////		String data1 = "030161a242b0ee460d81bd9249cd763e";
////		byte[] m_data = ByteUtils.hexString2ByteArray(data);
//		Ddi.ddi_innerkey_open();
//		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x05, 0, innerkey1, 24);
//		int res6 = Ddi.ddi_innerkey_update_wk((byte) 0x05, 0, 400, 1, ipIn, innerkey2, innerkey2.length, ipOut, 32);
//		if (res0 == 0 && res6 == 0) {
//			myHandleDeal("group129��������Կ�ɹ�", res0);
//			// AES ECB
//			int res1 = Ddi.ddi_innerkey_aes_encrypt(1, 400, (byte) 0, ipIn, m_plain, m_plain.length, cipher);
//			if (res1 == 0) {
//				myHandleDeal("group129ECB����Կ���ܳɹ�", res1);
//				int res3 = Ddi.ddi_innerkey_aes_decrypt(1, 400, 1, (byte) 0, ipIn, cipher, cipher.length, cipher1);
//				String data2 = ByteUtils.byteArray2HexString(cipher1);
////				String data3 = data2.substring(0, 4096);
//				if (res3 == 0 && data2.equalsIgnoreCase(ParaEntity.dataString2048)) {
//					myHandleDeal("group129ECB����Կ���ܳɹ�", res3);
//
//				} else {
//					myHandleDeal("group129ECB����Կ����ʧ��" + data2, res3);
//
//				}
//			} else {
//				myHandleDeal("group129ECB����Կ����ʧ��", res1);
//			}
//			// AES-128 CBC
//			int res4 = Ddi.ddi_innerkey_aes_encrypt(1, 400, (byte) 1, ipIn, m_plain, m_plain.length, cipher);
//			if (res4 == 0) {
//				myHandleDeal("group129CBC����Կ���ܳɹ�", res4);
//				int res3 = Ddi.ddi_innerkey_aes_decrypt(1, 400, 1, (byte) 1, ipIn, cipher, cipher.length, cipher1);
//				String data2 = ByteUtils.byteArray2HexString(cipher1);
//				if (res3 == 0 && data2.equalsIgnoreCase(ParaEntity.dataString2048)) {
//					myHandleDeal("group129CBC����Կ���ܳɹ�", res3);
//
//				} else {
//					myHandleDeal("group129CBC����Կ����ʧ��", res3);
//
//				}
//			} else {
//				myHandleDeal("group129CBC����Կ����ʧ��", res4);
//			}
//
//		} else {
//			myHandleDeal("group129��������Կʧ��", res0);
//		}
//
//		Ddi.ddi_innerkey_close();
		
		//2048
		myHandleDeal("testgroup129����", 0);
		String key1 = "A12345678A12345678A12345678A123422444AABCDEF2312";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "A12345678A12345678A12345678A1234ABCDEF012345678ABDECF09876542344";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
//		String plain = "12345678abcdEFBFABCDefBCabcdEFBF";
		byte[] m_plain = ByteUtils.hexString2ByteArray(ParaEntity.dataString2048);
		byte[] cipher = new byte[2048];
		byte[] cipher1 = new byte[2048];
//		String data = "ffed87779636b4674ea3e9339b7f488a";
//		String data1 = "030161a242b0ee460d81bd9249cd763e";
//		byte[] m_data = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x05, 0, innerkey1, 24);
		int res6 = Ddi.ddi_innerkey_update_wk((byte) 0x05, 0, 400, 1, ipIn, innerkey2, innerkey2.length, ipOut, 32);
		if (res0 == 0 && res6 == 0) {
			myHandleDeal("group129��������Կ�ɹ�", res0);
			// AES ECB
			int res1 = Ddi.ddi_innerkey_aes_encrypt(1, 400, (byte) 0, ipIn, m_plain, m_plain.length, cipher);
			if (res1 == 0) {
				myHandleDeal("group129ECB����Կ���ܳɹ�", res1);
				int res3 = Ddi.ddi_innerkey_aes_decrypt(1, 400, 1, (byte) 0, ipIn, cipher, cipher.length, cipher1);
				String data2 = ByteUtils.byteArray2HexString(cipher1);
//				String data3 = data2.substring(0, 4096);
				if (res3 == 0 && data2.equalsIgnoreCase(ParaEntity.dataString2048)) {
					myHandleDeal("group129ECB����Կ���ܳɹ�", res3);
					
				} else {
					myHandleDeal("group129ECB����Կ����ʧ��" + data2, res3);
					
				}
			} else {
				myHandleDeal("group129ECB����Կ����ʧ��", res1);
			}
			// AES-128 CBC
			int res4 = Ddi.ddi_innerkey_aes_encrypt(1, 400, (byte) 1, ipIn, m_plain, m_plain.length, cipher);
			if (res4 == 0) {
				myHandleDeal("group129CBC����Կ���ܳɹ�", res4);
				int res3 = Ddi.ddi_innerkey_aes_decrypt(1, 400, 1, (byte) 1, ipIn, cipher, cipher.length, cipher1);
				String data2 = ByteUtils.byteArray2HexString(cipher1);
				if (res3 == 0 && data2.equalsIgnoreCase(ParaEntity.dataString2048)) {
					myHandleDeal("group129CBC����Կ���ܳɹ�", res3);
					
				} else {
					myHandleDeal("group129CBC����Կ����ʧ��", res3);
					
				}
			} else {
				myHandleDeal("group129CBC����Կ����ʧ��", res4);
			}
			
		} else {
			myHandleDeal("group129��������Կʧ��", res0);
		}
		
		Ddi.ddi_innerkey_close();
	}

	// AES256�㷨 ����ԿECB��CBCģʽ���ܺͽ������ݳ���2048
	private void testgroup130() {
		
		//2048
		myHandleDeal("testgroup130����", 0);
		String key1 = "A12345678A12345678A12345678A1234ABCDEF012345678ABDECF09876542344";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
//		String plain = "12345678abcdEFBFABCDefBCabcdEFBF";
		byte[] m_plain = ByteUtils.hexString2ByteArray(ParaEntity.dataString2048);
		byte[] cipher = new byte[2048];
		byte[] cipher1 = new byte[2048];
//		String data = "ffed87779636b4674ea3e9339b7f488a";
//		String data1 = "030161a242b0ee460d81bd9249cd763e";
//		byte[] m_data = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x06, 0, innerkey1, 32);
		int res6 = Ddi.ddi_innerkey_update_wk((byte) 0x06, 0, 300, 0, ipIn, innerkey1, innerkey1.length, ipOut, 32);
		if (res0 == 0 && res6 == 0) {
			myHandleDeal("group130��������Կ�ɹ�", res0);
			// AES ECB
			int res1 = Ddi.ddi_innerkey_aes_encrypt(1, 300, (byte) 0, ipIn, m_plain, m_plain.length, cipher);
			if (res1 == 0) {
				myHandleDeal("group130ECB����Կ���ܳɹ�", res1);
				int res3 = Ddi.ddi_innerkey_aes_decrypt(1, 300, 1, (byte) 0, ipIn, cipher, cipher.length, cipher1);
				String data2 = ByteUtils.byteArray2HexString(cipher1);
//				String data3 = data2.substring(0, 4096);
				if (res3 == 0 && data2.equalsIgnoreCase(ParaEntity.dataString2048)) {
					myHandleDeal("group130ECB����Կ���ܳɹ�", res3);
				} else {
					myHandleDeal("group130ECB����Կ����ʧ��" + data2, res3);
				}
			} else {
				myHandleDeal("group130ECB����Կ����ʧ��", res1);
			}
			// AES-128 CBC
			int res4 = Ddi.ddi_innerkey_aes_encrypt(1, 300, (byte) 1, ipIn, m_plain, m_plain.length, cipher);
			if (res4 == 0) {
				myHandleDeal("group130CBC����Կ���ܳɹ�", res4);
				int res3 = Ddi.ddi_innerkey_aes_decrypt(1, 300, 1, (byte) 1, ipIn, cipher, cipher.length, cipher1);
				String data2 = ByteUtils.byteArray2HexString(cipher1);
				if (res3 == 0 && data2.equalsIgnoreCase(ParaEntity.dataString2048)) {
					myHandleDeal("group130CBC����Կ���ܳɹ�", res3);
					
				} else {
					myHandleDeal("group130CBC����Կ����ʧ��", res3);
					
				}
			} else {
				myHandleDeal("group130CBC����Կ����ʧ��", res4);
			}
			
		} else {
			myHandleDeal("group130��������Կʧ��", res0);
		}
		
		Ddi.ddi_innerkey_close();
	}

	// AES256�㷨 ����ԿECB��CBCģʽ���ܺͽ������ݳ��ȴ���2048
	private void testgroup131() {
	
		//2048
		myHandleDeal("testgroup131����", 0);
		String key1 = "A12345678A12345678A12345678A1234ABCDEF012345678ABDECF09876542344";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
//		String plain = "12345678abcdEFBFABCDefBCabcdEFBF";
		byte[] m_plain = ByteUtils.hexString2ByteArray(ParaEntity.dataString2056);
		byte[] cipher = new byte[2056];
		byte[] cipher1 = new byte[2056];
//		String data = "ffed87779636b4674ea3e9339b7f488a";
//		String data1 = "030161a242b0ee460d81bd9249cd763e";
//		byte[] m_data = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x06, 0, innerkey1, 32);
		int res6 = Ddi.ddi_innerkey_update_wk((byte) 0x06, 0, 300, 0, ipIn, innerkey1, innerkey1.length, ipOut, 32);
		if (res0 == 0 && res6 == 0) {
			myHandleDeal("group131��������Կ�ɹ�", res0);
			// AES ECB
			int res1 = Ddi.ddi_innerkey_aes_encrypt(1, 300, (byte) 0, ipIn, m_plain, m_plain.length, cipher);
			if (res1 == -6) {
				myHandleDeal("group131ECB����Կ���ܳɹ�", res1);
				int res3 = Ddi.ddi_innerkey_aes_decrypt(1, 300, 1, (byte) 0, ipIn, cipher, cipher.length, cipher1);
				
//				String data3 = data2.substring(0, 4096);
				if (res3 == -6) {
					myHandleDeal("group131ECB����Կ���ܳɹ�", res3);
				} else {
					myHandleDeal("group131ECB����Կ����ʧ��", res3);
				}
			} else {
				myHandleDeal("group131ECB����Կ����ʧ��", res1);
			}
			// AES-128 CBC
			int res4 = Ddi.ddi_innerkey_aes_encrypt(1, 300, (byte) 1, ipIn, m_plain, m_plain.length, cipher);
			if (res4 == -6) {
				myHandleDeal("group131CBC����Կ���ܳɹ�", res4);
				int res3 = Ddi.ddi_innerkey_aes_decrypt(1, 300, 1, (byte) 1, ipIn, cipher, cipher.length, cipher1);
				
				if (res3 == -6) {
					myHandleDeal("group131CBC����Կ���ܳɹ�", res3);
					
				} else {
					myHandleDeal("group131CBC����Կ����ʧ��", res3);
					
				}
			} else {
				myHandleDeal("group131CBC����Կ����ʧ��", res4);
			}
			
		} else {
			myHandleDeal("group131��������Կʧ��", res0);
		}
		
		Ddi.ddi_innerkey_close();
	}

	// 3DES�㷨 ����ԿECB��CBCģʽ���ܺͽ������ݳ���2048ѭ��ѹ������200��
	private void testgroup132() {
		myHandleDeal("testgroup132����", 0);
		String key1 = "313131313131313131313131313131313131313131313131";
		final byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		final byte[] innerkey2 = ByteUtils
				.hexString2ByteArray(paraEntity.get2048(paraEntity.dataString2048));
		final byte[] ipOut1 = new byte[2048];
		Runnable runnable1 = new Runnable() {
			public void run() {
				//
				for (int i = 0; i < 200; i++) {
					Ddi.ddi_innerkey_open();
					int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 133, innerkey1, 24);
					int res6 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 133, 333, 0, ipIn, innerkey1, innerkey1.length,
							ipOut, 24);
					if (res1 == 0 && res6 == 0) {
						myHandleDeal("group132��������Կ���Գɹ�" + i, res1);
						// DES CBC
						int res2 = Ddi.ddi_innerkey_des_decrypt(1, 333, 1, 1, ipIn, innerkey2, innerkey2.length,
								ipOut1);
						if (res2 == 0) {
							myHandleDeal("group132CBC����Կ���ܳɹ�" + i, res2);
							int res3 = Ddi.ddi_innerkey_des_encrypt(1, 333, 1, ipIn, ipOut1, ipOut1.length, ipOut1);
							String data1 = ByteUtils.byteArray2HexString(ipOut1);
							if (res3 == 0 && data1.equalsIgnoreCase(ParaEntity.dataString2048)) {
								myHandleDeal("group132CBC����Կ���ܳɹ�" + i, res3);
							} else {
								myHandleDeal("group132CBC����Կ����ʧ��" + i, res3);
							}
						} else {
							myHandleDeal("group132CBC����Կ����ʧ��" + i, res2);
						}
						// DES ECB
						int res4 = Ddi.ddi_innerkey_des_decrypt(1, 333, 1, 0, ipIn, innerkey2, innerkey2.length,
								ipOut1);
						if (res4 == 0) {
							myHandleDeal("group132ECB����Կ���ܳɹ�" + i, res4);
							int res5 = Ddi.ddi_innerkey_des_encrypt(1, 333, 0, ipIn, ipOut1, ipOut1.length, ipOut1);
							String data1 = ByteUtils.byteArray2HexString(ipOut1);
							if (res5 == 0 && data1.equalsIgnoreCase(ParaEntity.dataString2048)) {
								myHandleDeal("group132ECB����Կ���ܳɹ�" + i, res5);
							} else {
								myHandleDeal("group132ECB����Կ����ʧ��" + i, res5);
							}
						} else {
							myHandleDeal("group132ECB����Կ����ʧ��" + i, res4);
						}

					} else {
						myHandleDeal("group132��������Կ����ʧ��" + i, res1);
					}
					Ddi.ddi_innerkey_close();
				}
//	
			}
		};
		Thread group132 = new Thread(runnable1);
		group132.start();
		try {
			group132.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	//9��	����ddi_pinpad_getchkvalue
 /***
  * int keytype ��ֵ
  * #define KEYTYPE_MK        0x00000000   0
#define KEYTYPE_WK            0x00000001   1
#define KEYTYPE_BDK           0x00000010   16
#define KEYTYPE_KSN           0x00000011   17
#define KEYTYPE_SC_KEY        0x00000020   32
#define KEYTYPE_CT_EKEY       0x00000021   33
#define KEYTYPE_CT_AKEY       0x00000022   34
 * 
 *///��ȡ����Կ�͹�����Կ��KCVֵ
	private void testgroup133() {
		myHandleDeal("testgroup133����", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		String key3 = "21DFA7";
		String key4 = "B6ABEB";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		byte[] output = new byte[3];
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
		if (res0 == 0) {
			myHandleDeal("group133��������Կ�ɹ�", res0);
			//������Կ���ģ�7BC659AAA8FD94477B4C94EA63C416D4
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 0, 0, ipIn, innerkey2, 16, ipOut, 16);
			if (res1 == 0) {
				myHandleDeal("group133���¹�����Կ���Գɹ�", res1);
			} else {
				myHandleDeal("group133���¹�����Կ����ʧ��", res1);
			}
			int res2 = Ddi.ddi_pinpad_getchkvalue(0, 0, 0, 0, leOut,output);
			String byteArray2HexString = ByteUtils.byteArray2HexString(output);
			if (res2  == 0 && key3.equalsIgnoreCase(byteArray2HexString)) {
				myHandleDeal("group133����ԿKCV�ɹ�" , res2);
			} else {
				myHandleDeal("group133����ԿKCVʧ��"+byteArray2HexString, res2);
			}
			int res3 = Ddi.ddi_pinpad_getchkvalue(0, 1, 0, 0, leOut,output);
			String byteArray2HexString2 = ByteUtils.byteArray2HexString(output);
			if (res3  == 0 && byteArray2HexString2.equalsIgnoreCase(key4)) {
				myHandleDeal("group133������ԿKCV�ɹ�"  , res3);
			} else {
				myHandleDeal("group133������ԿKCVʧ��"+byteArray2HexString2, res3);
			}
		} else {
			myHandleDeal("group133��������Կʧ��", res0);
		}

	}
	//ͬһ���������ظ�ע�벻ͬ����Կ����
	private void testgroup134() {
		myHandleDeal("testgroup134����", 0);
//		myHandleDeal("testgroup134��ʼִ����", -99);
		//16���ֽڳ���
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF";
		final byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		//8���ֽڳ���
		String key2 = "56248AAAAAAAAAAa";
		final byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		//24���ֽڳ���
		String key3 = "12345678abcdEFBFABCDefBCabcdEFBF9999efBCabcdEFBF";
		final String data = "4FF940847C9059ABA3FB28ACC694AC9B";
		final byte[] innerkey3 = ByteUtils.hexString2ByteArray(key3);
		//32���ֽڳ�������
		String key4 = "ffffffffFFFFFFFFffffffffFFFFFFFF56248AAAAAAAAAAA9999efBCabcdEFBF";
		final byte[] innerkey4 = ByteUtils.hexString2ByteArray(key4);
		final byte[] cipher = new byte[16];
		Thread group13 = new Thread(new Runnable() {
			public void run() {
				//1026
				for (int i = 0; i < 1026; i++) {
					Ddi.ddi_innerkey_open();
					int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x00, 0, innerkey2, innerkey2.length);
					if (res1 == 0) {
						myHandleDeal("group134����DES����Կ�ɹ�" + i, res1);
					} else {
						myHandleDeal("group134����DES����Կʧ��" + i, res1);
					}
//					myHandleDeal("group134���߳̿�ʼ��" + i, -99);
					
					int res2 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, innerkey1.length);
					if (res2 == 0) {
						myHandleDeal("group134����DES-16����Կ�ɹ�" + i, res2);
					} else {
						myHandleDeal("group134����DES-16����Կʧ��" + i, res2);
					}
					int res3 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 0, innerkey3, innerkey3.length);
					if (res3 == 0) {
						myHandleDeal("group134����DES-24����Կ�ɹ�" + i, res3);
					} else {
						myHandleDeal("group134����DES-24����Կʧ��" + i, res3);
					}
					int res4 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 0, innerkey1, innerkey1.length);
					if (res4 == 0) {
						myHandleDeal("group134����SM4����Կ�ɹ�" + i, res4);
					} else {
						myHandleDeal("group134����SM4����Կʧ��" + i, res4);
					}
					if (!MainActivity.model.equalsIgnoreCase("N3")) {
						int res5 = Ddi.ddi_innerkey_update_mk((byte) 0x04, 0, innerkey1, 16);
						if (res5 == 0) {
							myHandleDeal("group134����AES-128����Կ�ɹ�" + i, res5);
						} else {
							myHandleDeal("group134����AES-128����Կʧ��" + i, res5);
						}
						int res6 = Ddi.ddi_innerkey_update_mk((byte) 0x05, 0, innerkey4, 24);
						if (res6 == 0) {
							myHandleDeal("group134����AES-192����Կ�ɹ�", res6);
						} else {
							myHandleDeal("group134����AES-192����Կʧ��", res6);
						}
						int res7 = Ddi.ddi_innerkey_update_mk((byte) 0x06, 0, innerkey4, 32);
						if (res7 == 0) {
							myHandleDeal("group134����AES-256����Կ�ɹ�", res7);
						} else {
							myHandleDeal("group134����AES-256����Կʧ��", res7);
						}

						int res8 = Ddi.ddi_innerkey_aes_encrypt(0, 0, (byte) 1, ipIn, innerkey1, innerkey1.length,
								cipher);
						String data2 = ByteUtils.byteArray2HexString(cipher);
						if (res8 == 0 && data2.equalsIgnoreCase(data)) {
							myHandleDeal("group134����Կ���ܳɹ�", res8);
						} else {
							myHandleDeal("group134����Կ����ʧ��" + data2, res8);
						}
					} else {
						//				myHandleDeal("�ն�"+MainActivity.model+"��֧��AES�㷨", -99);
						Log.v("TAG", "�ն�" + MainActivity.model + "��֧��AES�㷨");

					}
					//30303030abCDef99a1da25f1e411fea5 ipIn
					int res9 = Ddi.ddi_innerkey_aes_decrypt(0, 0, 1, (byte) 1, ipIn, innerkey1, innerkey1.length,cipher);
					if (res9 == 0) {
						myHandleDeal("group134����Կ���ܳɹ�", res9);
					} else {
						myHandleDeal("group134����Կ����ʧ��", res9);
					}
					Ddi.ddi_innerkey_close();
				}
			}
		});
		group13.start();
		try {
			group13.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//2020.03.24N3�������ӵײ�ʹ��������Կ����X9.19��CBC MAC�Ĺ��ܣ�ʵ����������Կ���ƽӿ���;
	//ʹ��SMARt���߽��м���,
	//CBC ��ʵ������ԿDES�������ݺ�ȥ����8�ֽ�����
	//����N3û�����㷨���֣�SM4Ҳ��֧�ֵģ�����N5S�ǲ�֧�ֵ�
	//2DES��CBC �������   ������С����31
	private void testgroup135() {
		myHandleDeal("testgroup135����", 0);
		String key1 = "31313131313131313131313131313131";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "00000000000000000000000000000000";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		//04��CBC 05 X9.19
		String data = "04"+"00000000"+"C1010000"+"01000000"+"31";
		//�쳣��������
//		String data = "04"+"00000000"+"C1010000"+"28000000"+"01234567890123456789012345678901234567890123456789012345678901234567890123456789";
		byte[] lParam = ByteUtils.hexString2ByteArray(data);
		int[] wplen=new int[1];
		byte[] wParam=new byte[8];
//		int lplen=14;
		String MACdata="6d5faeeb9547ab1c";
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 149, innerkey1, innerkey1.length);
		if (res0 == 0) {
			myHandleDeal("group135��������Կ�ɹ�", res0);
			//ECB  ������Կ���ģ�A032C89A44E8ABE6A032C89A44E8ABE6
			//IV��30303030abCDef99a1da25f1e411fea5
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 149, 449, 0, ipIn, innerkey2, innerkey2.length, ipOut, innerkey2.length);
			if (res1 ==0) {
				myHandleDeal("group135���¹�����Կ���Գɹ�", res1);
			} else {
				myHandleDeal("group135���¹�����Կ����ʧ��", res1);
			}
			//9�ǹ̶���
			int res2 = Ddi.ddi_innerkey_ioctl_for_java(9, lParam.length, lParam, wplen, wParam);
			String byteArray2HexString2 = ByteUtils.byteArray2HexString(wParam);
			if (res2==0&&byteArray2HexString2.equalsIgnoreCase(MACdata)) {
				myHandleDeal("group135��DESCBC��ʽ����MAC�ɹ�", res2);
			} else {
				Log.v("TAG", byteArray2HexString2);
				myHandleDeal("group135��DESCBC��ʽ����MACʧ��"+byteArray2HexString2, res2);

			}
		} else {
			myHandleDeal("group17��������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
		
		
//		
	}
	// 2DES ECB  X9.19  �������  ��������Ϊ1������
	private void testgroup136() {
		myHandleDeal("testgroup136����", 0);
//		String key1 = "ABCD03E3F01234560122334FEDACBDEF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(paraEntity.dataString16);
//		String key2 = "ABCD03E3F01234560122334FEDACBDEF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(paraEntity.dataString16);
//		String data = "05"+"00000000"+"C1010000"+"01000000"+paraEntity.dataString1;
		//�쳣��������
		String data = "05"+"00000000"+"C1010000"+"01000000"+paraEntity.dataString1;
		byte[] lParam = ByteUtils.hexString2ByteArray(data);
		int[] wplen=new int[1];
		byte[] wParam=new byte[8];
//		int lplen=14;
		String MACdata="F2BE4D438212276D";
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 149, innerkey1, innerkey1.length);
		if (res0 == 0) {
			myHandleDeal("group136��������Կ�ɹ�", res0);
			//������Կ���ģ�E87D34C84BA3964C0C991CC21657065A
			//IV��30303030abCDef99a1da25f1e411fea5
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 149, 449, 0, ipIn, innerkey2, innerkey2.length, ipOut, innerkey2.length);
			if (res1 ==0) {
				myHandleDeal("group136���¹�����Կ���Գɹ�", res1);
			} else {
				myHandleDeal("group136���¹�����Կ����ʧ��", res1);
			}
			int res2 = Ddi.ddi_innerkey_ioctl_for_java(9, lParam.length, lParam, wplen, wParam);
			String byteArray2HexString2 = ByteUtils.byteArray2HexString(wParam);
			if (res2==0&&byteArray2HexString2.equalsIgnoreCase(MACdata)) {
				myHandleDeal("group136��DESX9.19��ʽ����MAC�ɹ�", res2);
			} else {
				Log.v("TAG", byteArray2HexString2);
				myHandleDeal("group136��DESX9.19��ʽ����MACʧ��"+byteArray2HexString2, res2);
				
			}
		} else {
			myHandleDeal("group136��������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
	}
	
	// 2DES X9.19 ��������Ϊ��16������  ��С����
	private void testgroup137() {
		myHandleDeal("testgroup137����", 0);
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(paraEntity.dataString16);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(paraEntity.dataString16);
		String data = "05000000000100000010000000"+paraEntity.dataString16;
		byte[] lParam = ByteUtils.hexString2ByteArray(data);
		int[] wplen=new int[1];
		byte[] wParam=new byte[8];
//		int lplen=14;
		String MACdata="81F386FAE9B4EA3A";
		String MACdata1="c8d341E7F75A79D3";
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 149, innerkey1, innerkey1.length);
		if (res0 == 0) {
			myHandleDeal("group137��������Կ�ɹ�", res0);
			//������Կ����CBC��D84D04F8E06E79D5A7541F21E645320C
			//������Կ����ECB��E87D34C84BA3964C0C991CC21657065A
			
			//IV��30303030abCDef99a1da25f1e411fea5
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 149, 1, 1, ipIn, innerkey2, innerkey2.length, ipOut, innerkey2.length);
			if (res1 ==0) {
				myHandleDeal("group137���¹�����Կ���Գɹ�", res1);
			} else {
				myHandleDeal("group137���¹�����Կ����ʧ��", res1);
			}
			int res2 = Ddi.ddi_innerkey_ioctl_for_java(9, lParam.length, lParam, wplen, wParam);
			String byteArray2HexString2 = ByteUtils.byteArray2HexString(wParam);
			switch (MainActivity.model) {
			case "N3":
				if (res2==0&&byteArray2HexString2.equalsIgnoreCase(MACdata)) {
					myHandleDeal("N3group137��DESX9.19��ʽ����MAC�ɹ�"+byteArray2HexString2, res2);
				} else  {
					Log.v("TAG", byteArray2HexString2);
					myHandleDeal("N3group137��DESX9.19��ʽ����MACʧ��"+byteArray2HexString2, res2);
				}
				break;
			case "N5":
				if (res2==0&&byteArray2HexString2.equalsIgnoreCase(MACdata1)) {
					myHandleDeal("N5Sgroup137��DESX9.19��ʽ����MAC�ɹ�"+byteArray2HexString2, res2);
				} else  {
					Log.v("TAG", byteArray2HexString2);
					myHandleDeal("N5Sgroup137��DESX9.19��ʽ����MACʧ��"+byteArray2HexString2, res2);
				}
				break;
			case "N86":
				if (res2==0&&byteArray2HexString2.equalsIgnoreCase(MACdata1)) {
					myHandleDeal("N5Sgroup137��DESX9.19��ʽ����MAC�ɹ�"+byteArray2HexString2, res2);
				} else  {
					Log.v("TAG", byteArray2HexString2);
					myHandleDeal("N5Sgroup137��DESX9.19��ʽ����MACʧ��"+byteArray2HexString2, res2);
				}
				break;

			default:
				break;
			}
		} else {
			myHandleDeal("group137��������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
	}
	
	// 2DES ECB  X9.19  �������  ��������Ϊ2049������
		private void testgroup138() {
//			Log.v("TAG", "testgroup138");
			
			myHandleDeal("testgroup138����", 0);
//			String key1 = "ABCD03E3F01234560122334FEDACBDEF";
			byte[] innerkey1 = ByteUtils.hexString2ByteArray(paraEntity.dataString16);
//			String key2 = "ABCD03E3F01234560122334FEDACBDEF";
			byte[] innerkey2 = ByteUtils.hexString2ByteArray(paraEntity.dataString16);
			String data = "0500000000C101000001080000"+paraEntity.dataString2049;
			byte[] lParam = ByteUtils.hexString2ByteArray(data);
			int[] wplen=new int[1];
			byte[] wParam=new byte[8];
//			int lplen=14;
			String MACdata="5B060746C10D8E43";
			Ddi.ddi_innerkey_open();
			int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 149, innerkey1, innerkey1.length);
			if (res0 == 0) {
				myHandleDeal("group138��������Կ�ɹ�", res0);
				//������Կ���ģ�E87D34C84BA3964C0C991CC21657065A
				//IV��30303030abCDef99a1da25f1e411fea5
				int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 149, 449, 0, ipIn, innerkey2, innerkey2.length, ipOut, innerkey2.length);
				if (res1 ==0) {
					myHandleDeal("group138���¹�����Կ���Գɹ�", res1);
				} else {
					myHandleDeal("group138���¹�����Կ����ʧ��", res1);
				}
				int res2 = Ddi.ddi_innerkey_ioctl_for_java(9, lParam.length, lParam, wplen, wParam);
				String byteArray2HexString2 = ByteUtils.byteArray2HexString(wParam);
				if (res2==0&&byteArray2HexString2.equalsIgnoreCase(MACdata)) {
					Log.v("TAG", byteArray2HexString2);
					myHandleDeal("group138��DESX9.19��ʽ����MAC�ɹ�", res2);
				} else {
					Log.v("TAG", byteArray2HexString2);
					myHandleDeal("group138��DESX9.19��ʽ����MACʧ��"+byteArray2HexString2, res2);
					
				}
			} else {
				myHandleDeal("group138��������Կʧ��", res0);
			}
			Ddi.ddi_innerkey_close();
		}
		// DES CBC    ��С����  ��������Ϊ2056������
		private void testgroup139() {
			myHandleDeal("testgroup139����", 0);
//			String key1 = "31313131313131313131313131313131";
			byte[] innerkey1 = ByteUtils.hexString2ByteArray(paraEntity.dataString8);
//			String key2 = "00000000000000000000000000000000";
			byte[] innerkey2 = ByteUtils.hexString2ByteArray(paraEntity.dataString8);
			//04��CBC 05 X9.19
			String data = "04"+"00000000"+"00000000"+"08080000"+paraEntity.dataString2056;
			byte[] lParam = ByteUtils.hexString2ByteArray(data);
			int[] wplen=new int[1];
			byte[] wParam=new byte[8];
//			int lplen=14;
			String MACdata="609B5B881D61622C";
			Ddi.ddi_innerkey_open();
			int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x00, 149, innerkey1, innerkey1.length);
			if (res0 == 0) {
				myHandleDeal("group139��������Կ�ɹ�", res0);
		
				//ECB  ������Կ���ģ�6D0A7ECC98A019A6
				//IV��30303030abCDef99a1da25f1e411fea5
				int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x00, 149, 0, 0, ipIn, innerkey2, innerkey2.length, ipOut, innerkey2.length);
				if (res1 ==0) {
					myHandleDeal("group139���¹�����Կ���Գɹ�", res1);
				} else {
					myHandleDeal("group139���¹�����Կ����ʧ��", res1);
				}
				//9�ǹ̶���
				int res2 = Ddi.ddi_innerkey_ioctl_for_java(9, lParam.length, lParam, wplen, wParam);
				String byteArray2HexString2 = ByteUtils.byteArray2HexString(wParam);
				if (res2==0&&byteArray2HexString2.equalsIgnoreCase(MACdata)) {
					myHandleDeal("group139��DESCBC��ʽ����MAC�ɹ�", res2);
				} else {
					Log.v("TAG", byteArray2HexString2);
					myHandleDeal("group139��DESCBC��ʽ����MACʧ��"+byteArray2HexString2, res2);
				}
			} else {
				myHandleDeal("group139��������Կʧ��", res0);
			}
			Ddi.ddi_innerkey_close();
		}
	
		// 3DES CBC    �м�225����  ��������Ϊ24������
		private void testgroup140() {
			myHandleDeal("testgroup140����", 0);
//			String key1 = "31313131313131313131313131313131";
			byte[] innerkey1 = ByteUtils.hexString2ByteArray(paraEntity.dataString24);
//			String key2 = "00000000000000000000000000000000";
			byte[] innerkey2 = ByteUtils.hexString2ByteArray(paraEntity.dataString24);
			//04��CBC 05 X9.19  
			String data = "04"+"00000000"+"E1000000"+"18000000"+paraEntity.dataString24;
			
			byte[] lParam = ByteUtils.hexString2ByteArray(data);
			int[] wplen=new int[1];
			byte[] wParam=new byte[8];
//			int lplen=14;
			String MACdata="75F67E9CDA2D6CA0";
			Ddi.ddi_innerkey_open();
			int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 149, innerkey1, innerkey1.length);
			if (res0 == 0) {
				myHandleDeal("group140��������Կ�ɹ�", res0);
				//ECB  ������Կ���ģ�05A79FDE57EE5DC8CADC235ECD47784DCAF6E655ECACD7C3
				//IV��30303030abCDef99a1da25f1e411fea5
				int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 149, 225, 0, ipIn, innerkey2, innerkey2.length, ipOut, innerkey2.length);
				if (res1 ==0) {
					myHandleDeal("group140���¹�����Կ���Գɹ�", res1);
				} else {
					myHandleDeal("group140���¹�����Կ����ʧ��", res1);
				}
				//9�ǹ̶���
				int res2 = Ddi.ddi_innerkey_ioctl_for_java(9, lParam.length, lParam, wplen, wParam);
				String byteArray2HexString2 = ByteUtils.byteArray2HexString(wParam);
				if (res2==0&&byteArray2HexString2.equalsIgnoreCase(MACdata)) {
					myHandleDeal("group140��DESCBC��ʽ����MAC�ɹ�", res2);
				} else {
					Log.v("TAG", byteArray2HexString2);
					myHandleDeal("group140��DESCBC��ʽ����MACʧ��"+byteArray2HexString2, res2);
				}
			} else {
				myHandleDeal("group140��������Կʧ��", res0);
			}
			Ddi.ddi_innerkey_close();
		}
		
		// SM4 ECB  X9.19  �������  ��������Ϊ1������
		private void testgroup141() {
			myHandleDeal("testgroup141����", 0);
//			String key1 = "ABCD03E3F01234560122334FEDACBDEF";
			byte[] innerkey1 = ByteUtils.hexString2ByteArray(paraEntity.dataString16);
//			String key2 = "ABCD03E3F01234560122334FEDACBDEF";
			byte[] innerkey2 = ByteUtils.hexString2ByteArray(paraEntity.dataString16);
//		
			String data = "05"+"00000000"+"C1010000"+"01000000"+paraEntity.dataString1;
			byte[] lParam = ByteUtils.hexString2ByteArray(data);
			int[] wplen=new int[1];
			byte[] wParam=new byte[8];
//			int lplen=14;
			String MACdata="7EB66B869F70C039";
			Ddi.ddi_innerkey_open();
			int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 149, innerkey1, innerkey1.length);
			if (res0 == 0) {
				myHandleDeal("group141��������Կ�ɹ�", res0);
				//������Կ���ģ�535374A0B82442CC4043FFA4845C5E05
				//IV��30303030abCDef99a1da25f1e411fea5
				int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 149, 449, 0, ipIn, innerkey2, innerkey2.length, ipOut, innerkey2.length);
				if (res1 ==0) {
					myHandleDeal("group141���¹�����Կ���Գɹ�", res1);
				} else {
					myHandleDeal("group141���¹�����Կ����ʧ��", res1);
				}
				int res2 = Ddi.ddi_innerkey_ioctl_for_java(9, lParam.length, lParam, wplen, wParam);
				String byteArray2HexString2 = ByteUtils.byteArray2HexString(wParam);
				switch (MainActivity.model) {
				case "N3":
					if (res2==0&&byteArray2HexString2.equalsIgnoreCase(MACdata)) {
						myHandleDeal("N3group141��DESX9.19��ʽ����MAC�ɹ�", res2);
					} else {
						Log.v("TAG", byteArray2HexString2);
						myHandleDeal("N3group141��DESX9.19��ʽ����MACʧ��"+byteArray2HexString2, res2);
						
					}
					break;
				case "N5":
					if (MainActivity.version.equalsIgnoreCase("7.1.2")) {
						if (res2 == -6) {
							myHandleDeal("N5group141��DESX9.19��ʽ����MAC�ɹ�", res2);
						} else {
							Log.v("TAG", byteArray2HexString2);
							myHandleDeal("N5group141��DESX9.19��ʽ����MACʧ��" + byteArray2HexString2, res2);

						} 
					}else {
						if (res2==0&&byteArray2HexString2.equalsIgnoreCase(MACdata)) {
							myHandleDeal("N3group141��DESX9.19��ʽ����MAC�ɹ�", res2);
						} else {
							Log.v("TAG", byteArray2HexString2);
							myHandleDeal("N3group141��DESX9.19��ʽ����MACʧ��"+byteArray2HexString2, res2);
							
						}
						
						
					}
					break;

				default:
					
					break;
				}
				
			} else {
				myHandleDeal("group141��������Կʧ��", res0);
			}
			Ddi.ddi_innerkey_close();
		}
		
		// SM4 CBC  �������  ��������Ϊ1������
				private void testgroup142() {
					myHandleDeal("testgroup142����", 0);
//					String key1 = "ABCD03E3F01234560122334FEDACBDEF";
					byte[] innerkey1 = ByteUtils.hexString2ByteArray(paraEntity.dataString16);
//					String key2 = "ABCD03E3F01234560122334FEDACBDEF";
					byte[] innerkey2 = ByteUtils.hexString2ByteArray(paraEntity.dataString16);
					String data = "04"+"00000000"+"C1010000"+"10000000"+paraEntity.dataString16;
					byte[] lParam = ByteUtils.hexString2ByteArray(data);
					int[] wplen=new int[1];
					byte[] wParam=new byte[8];
//					int lplen=14;
					String MACdata="C8C2ECCD319D0145";
					Ddi.ddi_innerkey_open();
					int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 149, innerkey1, innerkey1.length);
					if (res0 == 0) {
						myHandleDeal("group142��������Կ�ɹ�", res0);
						//������Կ���ģ�535374A0B82442CC4043FFA4845C5E05
						//IV��30303030abCDef99a1da25f1e411fea5
						int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 149, 449, 0, ipIn, innerkey2, innerkey2.length, ipOut, innerkey2.length);
						if (res1 ==0) {
							myHandleDeal("group142���¹�����Կ���Գɹ�", res1);
						} else {
							myHandleDeal("group142���¹�����Կ����ʧ��", res1);
						}
						int res2 = Ddi.ddi_innerkey_ioctl_for_java(9, lParam.length, lParam, wplen, wParam);
						String byteArray2HexString2 = ByteUtils.byteArray2HexString(wParam);
						switch (MainActivity.model) {
						case "N3":
							if (res2==0&&byteArray2HexString2.equalsIgnoreCase(MACdata)) {
								myHandleDeal("N3group142��DESX9.19��ʽ����MAC�ɹ�", res2);
							} else {
								Log.v("TAG", byteArray2HexString2);
								myHandleDeal("N3group142��DESX9.19��ʽ����MACʧ��"+byteArray2HexString2, res2);
							}
							break;
						case "N5":
							if (MainActivity.version.equalsIgnoreCase("7.1.2")) {
								//��Ϊ֧���㷨ʶ��
								if (res2 == -6) {
									myHandleDeal("N5group142��DESX9.19��ʽ����MAC�ɹ�", res2);
								} else {
									Log.v("TAG", byteArray2HexString2);
									myHandleDeal("N5group142��DESX9.19��ʽ����MACʧ��" + byteArray2HexString2, res2);
								}
							}
							else {
								if (res2==0&&byteArray2HexString2.equalsIgnoreCase(MACdata)) {
									myHandleDeal("N3group142��DESX9.19��ʽ����MAC�ɹ�", res2);
								} else {
									Log.v("TAG", byteArray2HexString2);
									myHandleDeal("N3group142��DESX9.19��ʽ����MACʧ��"+byteArray2HexString2, res2);
								}
							}
							break;
						case "N6":
							if (res2==-6) {
								myHandleDeal("N3group142��DESX9.19��ʽ����MAC�ɹ�", res2);
							} else {
								Log.v("TAG", byteArray2HexString2);
								myHandleDeal("N3group142��DESX9.19��ʽ����MACʧ��"+byteArray2HexString2, res2);
							}
							break;
						case "N86":
							if (res2==-6) {
								myHandleDeal("N3group142��DESX9.19��ʽ����MAC�ɹ�", res2);
							} else {
								Log.v("TAG", byteArray2HexString2);
								myHandleDeal("N3group142��DESX9.19��ʽ����MACʧ��"+byteArray2HexString2, res2);
							}
							break;
						default:
							myHandleDeal("group142��DESX9.19��ʽ����MACʧ��", -99);
							break;
						}
					} else {
						myHandleDeal("group142��������Կʧ��", res0);
					}
					Ddi.ddi_innerkey_close();
				}
				
				// �쳣���� DES ECB  X9.19  �������  ��������Ϊ2049������
				private void testgroup143() {
					myHandleDeal("testgroup143����", 0);
//					String key1 = "ABCD03E3F01234560122334FEDACBDEF";
					byte[] innerkey1 = ByteUtils.hexString2ByteArray(paraEntity.dataString8);
//					String key2 = "ABCD03E3F01234560122334FEDACBDEF";
					byte[] innerkey2 = ByteUtils.hexString2ByteArray(paraEntity.dataString8);
					String data = "0500000000C101000001080000"+paraEntity.dataString2049;
					byte[] lParam = ByteUtils.hexString2ByteArray(data);
					int[] wplen=new int[1];
					byte[] wParam=new byte[8];
//					int lplen=14;
					String MACdata="5B060746C10D8E43";
					Ddi.ddi_innerkey_open();
					int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x00, 149, innerkey1, innerkey1.length);
					if (res0 == 0) {
						myHandleDeal("group143��������Կ�ɹ�", res0);
						//������Կ���ģ�E87D34C84BA3964C0C991CC21657065A
						//IV��30303030abCDef99a1da25f1e411fea5
						int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x00, 149, 449, 0, ipIn, innerkey2, innerkey2.length, ipOut, innerkey2.length);
						if (res1 ==0) {
							myHandleDeal("group143���¹�����Կ���Գɹ�", res1);
						} else {
							myHandleDeal("group143���¹�����Կ����ʧ��", res1);
						}
						int res2 = Ddi.ddi_innerkey_ioctl_for_java(9, lParam.length, lParam, wplen, wParam);
						String byteArray2HexString2 = ByteUtils.byteArray2HexString(wParam);
						if (res2==-6) {
							myHandleDeal("group143��DESX9.19��ʽ����MAC�ɹ�", res2);
						} else {
							Log.v("TAG", byteArray2HexString2);
							myHandleDeal("group143��DESX9.19��ʽ����MACʧ��"+byteArray2HexString2, res2);
							
						}
					} else {
						myHandleDeal("group143��������Կʧ��", res0);
					}
					Ddi.ddi_innerkey_close();
				}
				
				// 3DES CBC    �м�225����  ��������Ϊ2056������
				private void testgroup144() {
					myHandleDeal("testgroup144����", 0);
					String key1 = "31313131313131313131313131313131";
					byte[] innerkey1 = ByteUtils.hexString2ByteArray(paraEntity.dataString16);
					String key2 = "00000000000000000000000000000000";
					byte[] innerkey2 = ByteUtils.hexString2ByteArray(paraEntity.dataString16);
					//04��CBC 05 X9.19
					String data = "04"+"00000000"+"C0010000"+"01080000"+paraEntity.dataString2049;
					//�쳣��������
//					String data = "04"+"00000000"+"C1010000"+"28000000"+"01234567890123456789012345678901234567890123456789012345678901234567890123456789";
					byte[] lParam = ByteUtils.hexString2ByteArray(data);
					int[] wplen=new int[1];
					byte[] wParam=new byte[8];
					byte[] DataOut=new byte[16];
					
//					int lplen=14;
					String MACdata="9D9719192C8B63B9";
					Ddi.ddi_innerkey_open();
					int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 149, innerkey1, innerkey1.length);
					if (res0 == 0) {
						myHandleDeal("group144��������Կ�ɹ�", res0);
						//ECB  ������Կ���ģ�E87D34C84BA3964C0C991CC21657065A
						//IV��30303030abCDef99a1da25f1e411fea5
						int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 149, 448, 0, ipIn, innerkey2, innerkey2.length, ipOut, innerkey2.length);
						if (res1 ==0) {
							
//							int res5 = Ddi.ddi_innerkey_des_encrypt(1, 449, 0, ipIn, innerkey2, 16, DataOut);// ������Կ����
//							String data1 = ByteUtils.byteArray2HexString(DataOut);
//							if (res5 == 0 && data1.equalsIgnoreCase(key1)) {
//								myHandleDeal("group144���¹�����Կ���ܳɹ�", res5);
//							} else {
//								myHandleDeal("group144���¹�����Կ����ʧ��" + data1, res5);
//							}
							
							
							myHandleDeal("group144���¹�����Կ���Գɹ�", res1);
						} else {
							myHandleDeal("group144���¹�����Կ����ʧ��", res1);
						}
						//9�ǹ̶���
						int res2 = Ddi.ddi_innerkey_ioctl_for_java(9, lParam.length, lParam, wplen, wParam);
						String byteArray2HexString2 = ByteUtils.byteArray2HexString(wParam);
						if (res2==0&&byteArray2HexString2.equalsIgnoreCase(MACdata)) {
							myHandleDeal("group144��DESCBC��ʽ����MAC�ɹ�", res2);
						} else {
							Log.v("TAG", byteArray2HexString2);
							myHandleDeal("group144��DESCBC��ʽ����MACʧ��"+byteArray2HexString2, res2);

						}
					} else {
						myHandleDeal("group144��������Կʧ��", res0);
					}
					Ddi.ddi_innerkey_close();
					
					
//					
				}
				//��ͬ��Կ��X9.19����MAC  ����Ϊ2056
				private void testgroup145() {
					myHandleDeal("testgroup145����", 0);
					String key1 = "31313131313131313131313131313131";
					byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
//					String key2 = "00000000000000000000000000000000";
					byte[] innerkey2 = ByteUtils.hexString2ByteArray(key1);
					//04��CBC 05 X9.19
					String data = "05"+"00000000"+"C1010000"+"08080000"+paraEntity.dataString2056;
					//�쳣��������
//					String data = "04"+"00000000"+"C1010000"+"28000000"+"01234567890123456789012345678901234567890123456789012345678901234567890123456789";
					byte[] lParam = ByteUtils.hexString2ByteArray(data);
					int[] wplen=new int[1];
					byte[] wParam=new byte[8];
					byte[] DataOut=new byte[16];
					
//					int lplen=14;
					String MACdata="609B5B881D61622C";
					Ddi.ddi_innerkey_open();
					int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 149, innerkey1, innerkey1.length);
					if (res0 == 0) {
						myHandleDeal("group145��������Կ�ɹ�", res0);
						//ECB  ������Կ���ģ�E87D34C84BA3964C0C991CC21657065A
						//IV��30303030abCDef99a1da25f1e411fea5
						int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 149, 449, 0, ipIn, innerkey2, innerkey2.length, ipOut, innerkey2.length);
						if (res1 ==0) {
							
//							int res5 = Ddi.ddi_innerkey_des_encrypt(1, 449, 0, ipIn, innerkey2, 16, DataOut);// ������Կ����
//							String data1 = ByteUtils.byteArray2HexString(DataOut);
//							if (res5 == 0 && data1.equalsIgnoreCase(key1)) {
//								myHandleDeal("group145���¹�����Կ���ܳɹ�", res5);
//							} else {
//								myHandleDeal("group145���¹�����Կ����ʧ��" + data1, res5);
//							}
							
							
							myHandleDeal("group145���¹�����Կ���Գɹ�", res1);
						} else {
							myHandleDeal("group145���¹�����Կ����ʧ��", res1);
						}
						//9�ǹ̶���
						int res2 = Ddi.ddi_innerkey_ioctl_for_java(9, lParam.length, lParam, wplen, wParam);
						String byteArray2HexString2 = ByteUtils.byteArray2HexString(wParam);
						if (res2==0&&byteArray2HexString2.equalsIgnoreCase(MACdata)) {
							myHandleDeal("group145��DESCBC��ʽ����MAC�ɹ�", res2);
						} else {
							Log.v("TAG", byteArray2HexString2);
							myHandleDeal("group145��DESCBC��ʽ����MACʧ��"+byteArray2HexString2, res2);

						}
					} else {
						myHandleDeal("group145��������Կʧ��", res0);
					}
					Ddi.ddi_innerkey_close();
					
					
//					
				}
				
	private void testgroup146() {
		myHandleDeal("testgroup146����", 0);
//					String key1 = "31313131313131313131313131313131";
		Thread thread = new Thread(new Runnable() {
			public void run() {
				byte[] innerkey1 = ByteUtils.hexString2ByteArray(paraEntity.dataString8);
//							String key2 = "00000000000000000000000000000000";
				byte[] innerkey2 = ByteUtils.hexString2ByteArray(paraEntity.dataString8);
				// 04��CBC 05 X9.19
				String data = "04" + "00000000" + "00000000" + "08080000" + paraEntity.dataString2056;
				byte[] lParam = ByteUtils.hexString2ByteArray(data);
				int[] wplen = new int[1];
				byte[] wParam = new byte[8];
//							int lplen=14;
				String MACdata = "609B5B881D61622C";

				for (int i = 0; i < 100; i++) {
					Ddi.ddi_innerkey_open();
					int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x00, 149, innerkey1, innerkey1.length);
					if (res0 == 0) {
						myHandleDeal("group146��������Կ�ɹ�", res0);

						// ECB ������Կ���ģ�6D0A7ECC98A019A6
						// IV��30303030abCDef99a1da25f1e411fea5
						int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x00, 149, 0, 0, ipIn, innerkey2, innerkey2.length,
								ipOut, innerkey2.length);
						if (res1 == 0) {
							myHandleDeal("group146���¹�����Կ���Գɹ�", res1);
						} else {
							myHandleDeal("group146���¹�����Կ����ʧ��", res1);
						}
						// 9�ǹ̶���
						int res2 = Ddi.ddi_innerkey_ioctl_for_java(9, lParam.length, lParam, wplen, wParam);
						String byteArray2HexString2 = ByteUtils.byteArray2HexString(wParam);
						if (res2 == 0 && byteArray2HexString2.equalsIgnoreCase(MACdata)) {
							myHandleDeal("group146��DESCBC��ʽ����MAC�ɹ�", res2);
						} else {
							Log.v("TAG", byteArray2HexString2);
							myHandleDeal("group146��DESCBC��ʽ����MACʧ��" + byteArray2HexString2, res2);
						}
					} else {
						myHandleDeal("group146��������Կʧ��", res0);
					}
					Ddi.ddi_innerkey_close();
				}
			}
		});
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	//F900���ӰٶȻ���License���ع���    �������32
	private void testgroup147() {
		myHandleDeal("testgroup1147����", 0);
//		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF9999efBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(paraEntity.dataString32);
		byte[] innerkey2 = new byte[innerkey1.length];
		int[] in=new int[1];
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_write_custom_info(6,innerkey1,innerkey1.length);
		if (res0 == 0) {
			myHandleDeal("group1147д���ݳɹ�", res0);
			int res1 = Ddi.ddi_read_custom_info(6,innerkey2,in);
			String byteArray2HexString2 = ByteUtils.byteArray2HexString(innerkey2);
			if (res1 == 0&&byteArray2HexString2.equalsIgnoreCase(paraEntity.dataString32)) {
				myHandleDeal("group1147��ȡ���ݲ��Գɹ�"+byteArray2HexString2, res1);
			} else {
				myHandleDeal("group1147��ȡ���ݲ���ʧ��"+byteArray2HexString2, res1);
			}
		} else {
			myHandleDeal("group1147д����ʧ��", res0);
		}
	}
	//��С���� 1
	private void testgroup148() {
		myHandleDeal("testgroup1148����", 0);
//		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF9999efBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(paraEntity.dataString1);
		byte[] innerkey2 = new byte[innerkey1.length];
		int[] in=new int[1];
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_write_custom_info(6,innerkey1,innerkey1.length);
		if (res0 == 0) {
			myHandleDeal("group1148д���ݳɹ�", res0);
			int res1 = Ddi.ddi_read_custom_info(6,innerkey2,in);
			String byteArray2HexString2 = ByteUtils.byteArray2HexString(innerkey2);
			if (res1 == 0&&byteArray2HexString2.equalsIgnoreCase(paraEntity.dataString1)) {
				myHandleDeal("group1148��ȡ���ݲ��Գɹ�", res1);
			} else {
				myHandleDeal("group1148��ȡ���ݲ���ʧ��", res1);
			}
		} else {
			myHandleDeal("group1148д����ʧ��", res0);
		}
	}
	
	private void testgroup149() {
		myHandleDeal("testgroup1149����", 0);
//		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF9999efBCabcdEFBF";
		final byte[] innerkey1 = ByteUtils.hexString2ByteArray(paraEntity.dataString32);
		final byte[] innerkey2 = new byte[innerkey1.length];
		final int[] in=new int[1];
		Thread thread = new Thread(	new Runnable() {
			public void run() {
				for (int i = 0; i < 200; i++) {
					Ddi.ddi_innerkey_open();
					int res0 = Ddi.ddi_write_custom_info(6, innerkey1, innerkey1.length);
					if (res0 == 0) {
						myHandleDeal("group1149д���ݳɹ�"+i, res0);
						int res1 = Ddi.ddi_read_custom_info(6, innerkey2, in);
						String byteArray2HexString2 = ByteUtils.byteArray2HexString(innerkey2);
						if (res1 == 0 && byteArray2HexString2.equalsIgnoreCase(paraEntity.dataString32)) {
							myHandleDeal("group149��ȡ���ݲ��Գɹ�"+i, res1);
						} else {
							myHandleDeal("group149��ȡ���ݲ���ʧ��"+i, res1);
						}
					} else {
						myHandleDeal("group1149д����ʧ��"+i, res0);
					}
					Ddi.ddi_innerkey_close();
				}
				
			}
		});
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void testgroup150() {
		myHandleDeal("testgroup150����", 0);
//		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF9999efBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(paraEntity.dataString32);
		byte[] innerkey2 = new byte[innerkey1.length];
		int[] in=new int[1];
		for (int i = 0; i < 7; i++) {
			if (i==5) {
				//��Ϊ5ֻ����ϵͳ�ڲ�ʹ�ã�Ӧ���ǲ��ܲ�����
				Ddi.ddi_innerkey_open();
				int res0 = Ddi.ddi_write_custom_info(i, innerkey1, innerkey1.length);
				if (res0 == -5) {
					Log.v("TAG", ""+5);
					myHandleDeal("group150д���ݳɹ�" + i, res0);
				
				} else {
					myHandleDeal("group150д����ʧ��" + i, res0);
				}
				Ddi.ddi_innerkey_close();
			}		
		    if (i==6) {
		    	Log.v("TAG", ""+6);
				Ddi.ddi_innerkey_open();
				int res0 = Ddi.ddi_write_custom_info(i, innerkey1, innerkey1.length);
				if (res0 == 0) {
					myHandleDeal("group150д���ݳɹ�" + i, res0);
					int res1 = Ddi.ddi_read_custom_info(i, innerkey2, in);
					String byteArray2HexString2 = ByteUtils.byteArray2HexString(innerkey2);
					if (res1 == 0 && byteArray2HexString2
							.equalsIgnoreCase(paraEntity.dataString32)) {
						myHandleDeal("group150��ȡ���ݲ��Գɹ�" + i, res1);
					} else {
						myHandleDeal("group150��ȡ���ݲ���ʧ��" + i + "..." + byteArray2HexString2, res1);
					}
					
				} else {
					myHandleDeal("group150д����ʧ��" + i, res0);
				}
				Ddi.ddi_innerkey_close();
			}
		    
		    if (i!=5&&i!=6) {
				Log.v("TAG", "" + i + 5);
				Ddi.ddi_innerkey_open();
				int res0 = Ddi.ddi_write_custom_info(i, innerkey1, innerkey1.length);
				if (res0 == 0) {
					myHandleDeal("group150д���ݳɹ�" + i, res0);
					int res1 = Ddi.ddi_read_custom_info(i, innerkey2, in);
					String byteArray2HexString2 = ByteUtils.byteArray2HexString(innerkey2);
					if (res1 == 0 && byteArray2HexString2
							.equalsIgnoreCase("3131313131313131ABCD03E3F01234560122334FEDACBDEF1234567800000000")) {
						myHandleDeal("group150��ȡ���ݲ��Գɹ�" + i, res1);
					} else {
						myHandleDeal("group150��ȡ���ݲ���ʧ��" + i + "..." + byteArray2HexString2, res1);
					}
				} else {
					myHandleDeal("group150д����ʧ��" + i, res0);
				}
				Ddi.ddi_innerkey_close();
			}
			
		}
	}
	private void testgroup151() {
		myHandleDeal("testgroup151����", 0);
//		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF9999efBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(paraEntity.dataString1);
		byte[] innerkey2 = new byte[innerkey1.length];
		int[] in=new int[1];
		for (int i = 0; i < 7; i++) {
			if (i==5) {
				Ddi.ddi_innerkey_open();
				int res0 = Ddi.ddi_write_custom_info(i, innerkey1, innerkey1.length);
				if (res0 == -5) {
					myHandleDeal("group151д���ݳɹ�"+i, res0);
					
				} else {
					myHandleDeal("group151д����ʧ��"+i, res0);
				}
				Ddi.ddi_innerkey_close();
			}else {
				Ddi.ddi_innerkey_open();
				int res0 = Ddi.ddi_write_custom_info(i, innerkey1, innerkey1.length);
				if (res0 == 0) {
					myHandleDeal("group151д���ݳɹ�"+i, res0);
					int res1 = Ddi.ddi_read_custom_info(i, innerkey2, in);
					String byteArray2HexString2 = ByteUtils.byteArray2HexString(innerkey2);
					if (res1 == 0
							&& byteArray2HexString2.equalsIgnoreCase(paraEntity.dataString1 )) {
						myHandleDeal("group151��ȡ���ݲ��Գɹ�"+i, res1);
					} else {
						myHandleDeal("group151��ȡ���ݲ���ʧ��"+i+"..."+byteArray2HexString2, res1);
					}
				} else {
					myHandleDeal("group151д����ʧ��"+i, res0);
				}
				Ddi.ddi_innerkey_close();
				
			}
			
		}
	}

	
				
		

	private void testgroup63() {
		myHandleDeal("testgroup63����", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF9999efBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 149, innerkey1, 24);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 149, 0, 1, ipIn, innerkey2, 24, ipOut, 24);
			int res6 = Ddi.ddi_innerkey_des_encrypt(1, 0, 1, ipIn, msg_summery, 16, innerkey2);
			int res7 = Ddi.ddi_innerkey_des_encrypt(1, 0, 1, ipIn, innerkey1, 16, innerkey2);
			myHandleDeal("��������Կ�ɹ�", res0);
			if (res1 == 0) {
				myHandleDeal("���¹�����Կ���Գɹ�" + res6 + res7, res1);
				long begin = System.currentTimeMillis();
				for (int i = 0; i < 500; i++) {
					int res4 = Ddi.ddi_innerkey_des_encrypt(1, 0, 1, ipIn, msg_summery, 16, innerkey2);
					int res5 = Ddi.ddi_innerkey_des_encrypt(1, 0, 1, ipIn, innerkey1, 16, innerkey2);
				}
				long end = System.currentTimeMillis();
				long current = end - begin;
				myHandleDeal("DES����ʱ��Ϊ" + current + "��", 0);
			} else {
				myHandleDeal("group63���¹�����Կ����ʧ��", res1);
			}
		} else {
			myHandleDeal("group63��������Կʧ��", res0);
		}

	}

	private void testgroup64() {
		myHandleDeal("testgroup64����", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF9999efBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 149, innerkey1, 24);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 149, 0, 1, ipIn, innerkey2, 24, ipOut, 24);
			if (res1 == 0) {
				myHandleDeal("���¹�����Կ���Գɹ�", res1);
				long begin = System.currentTimeMillis();
				for (int i = 0; i < 500; i++) {
					int res4 = Ddi.ddi_innerkey_des_encrypt(1, 0, 0, ipIn, msg_summery, 16, innerkey2);
					int res5 = Ddi.ddi_innerkey_des_encrypt(1, 0, 0, ipIn, innerkey1, 16, innerkey2);
				}
				long end = System.currentTimeMillis();
				long current = end - begin;
				myHandleDeal("DES����ʱ��Ϊ" + current + "��", 0);
			} else {
				myHandleDeal("group64���¹�����Կ����ʧ��", res1);
			}
		} else {
			myHandleDeal("group64��������Կʧ��", res0);
		}

	}

	private void testgroup65() {
		myHandleDeal("testgroup65����", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 100, innerkey1, 16);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 100, 100, 0, ipIn, innerkey2, 16, ipOut, 16);
			if (res1 == 0) {
				myHandleDeal("���¹�����Կ���Գɹ�", res1);
				long begin = System.currentTimeMillis();
				for (int i = 0; i < 500; i++) {
					int res10 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, 100, (byte) 0, ipIn, innerkey1, innerkey1.length,
							innerkey2, leOut);
					int res11 = Ddi.ddi_innerkey_nes_sm4_decrypt(1, 100, 148, (byte) 0, ipIn, innerkey2,
							innerkey2.length, ipOut, leOut);
				}
				long end = System.currentTimeMillis();
				long current = end - begin;
				myHandleDeal("SM4����ʱ��Ϊ" + current + "��", 0);
			} else {
				myHandleDeal("group13���¹�����Կ����ʧ��", res1);
			}
		} else {
			myHandleDeal("group13��������Կʧ��", res0);
		}

	}

	private void testgroup66() {
		myHandleDeal("testgroup66����", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 100, innerkey1, 16);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 100, 100, 0, ipIn, innerkey1, 16, ipOut, 16);
			if (res1 == 0) {
				myHandleDeal("���¹�����Կ���Գɹ�", res1);
				long begin = System.currentTimeMillis();
				int res12 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, 100, (byte) 1, ipIn, innerkey1, innerkey1.length,
						innerkey2, leOut);
				int res13 = Ddi.ddi_innerkey_nes_sm4_decrypt(1, 100, 148, (byte) 1, ipIn, innerkey2, 16, ipOut, leOut);
				myHandleDeal("���¹�����Կ���Գɹ�" + res12 + res13, res1);
				for (int i = 0; i < 500; i++) {
					int res10 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, 100, (byte) 1, ipIn, innerkey1, innerkey1.length,
							innerkey2, leOut);
					int res11 = Ddi.ddi_innerkey_nes_sm4_decrypt(1, 100, 148, (byte) 1, ipIn, innerkey2, 16, ipOut,
							leOut);
				}
				long end = System.currentTimeMillis();
				long current = end - begin;
				if (current>6563+(6563*0.05)) {
					myHandleDeal("SM4����ʱ��ɹ�" + current + "��", 0);
				} else {
					myHandleDeal("SM4����ʱ��ʧ��" + current + "��", -1);
				}
				
			} else {
				myHandleDeal("group66���¹�����Կ����ʧ��", res1);
			}
		} else {
			myHandleDeal("group66��������Կʧ��", res0);
		}

	}

	private void testgroup67() {
		myHandleDeal("testgroup67����", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		byte[] data = new byte[16];
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x04, 100, innerkey1, 16);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x04, 100, 100, 0, ipIn, innerkey2, 16, ipOut, 16);
			if (res1 == 0) {
				myHandleDeal("���¹�����Կ���Գɹ�", res1);
				long begin = System.currentTimeMillis();
				int res6 = Ddi.ddi_innerkey_aes_encrypt(1, 100, (byte) 1, ipIn, innerkey1, innerkey1.length, data);
				int res7 = Ddi.ddi_innerkey_aes_decrypt(1, 100, 1, (byte) 1, ipIn, innerkey1, 16, data);
				myHandleDeal("���¹�����Կ���Գɹ�" + res6 + res7, res1);
				for (int i = 0; i < 500; i++) {
					int res4 = Ddi.ddi_innerkey_aes_encrypt(1, 100, (byte) 1, ipIn, innerkey1, innerkey1.length,
							innerkey2);
					int res5 = Ddi.ddi_innerkey_aes_decrypt(1, 100, 1, (byte) 1, ipIn, innerkey2, innerkey2.length,
							innerkey2);
				}
				long end = System.currentTimeMillis();
				long current = end - begin;
				myHandleDeal("AES����ʱ��Ϊ" + current + "��", 0);
			} else {
				myHandleDeal("group67���¹�����Կ����ʧ��", res1);
			}
		} else {
			myHandleDeal("group67��������Կʧ��", res0);
		}

	}

	private void testgroup68() {
		myHandleDeal("testgroup68����", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 100, innerkey1, 16);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 100, 100, 0, ipIn, innerkey2, 16, ipOut, 16);
			if (res1 == 0) {
				myHandleDeal("���¹�����Կ���Գɹ�", res1);
				long begin = System.currentTimeMillis();
				for (int i = 0; i < 500; i++) {
					int res4 = Ddi.ddi_innerkey_aes_encrypt(1, 100, (byte) 0, ipIn, innerkey1, innerkey1.length,
							innerkey2);
					int res5 = Ddi.ddi_innerkey_aes_decrypt(1, 100, 1, (byte) 0, ipIn, innerkey2, innerkey2.length,
							innerkey2);
				}
				long end = System.currentTimeMillis();
				long current = end - begin;
				myHandleDeal("AES����ʱ��Ϊ" + current + "��", 0);
			} else {
				myHandleDeal("group68���¹�����Կ����ʧ��", res1);
			}
		} else {
			myHandleDeal("group68��������Կʧ��", res0);
		}

	}

	private void testgroup69() {
		myHandleDeal("testgroup69����", 0);
		long begin = System.currentTimeMillis();
		for (int i = 0; i < 50; i++) {
			Ddi.ddi_innerkey_open();
			Ddi.ddi_innerkey_close();
		}
		long end = System.currentTimeMillis();
		long current = end - begin;
		myHandleDeal("�ظ�����50�κ��ʱ" + current + "����", 0);

	}

	private void testgroup70() {
		myHandleDeal("testgroup70����", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x08, 100, innerkey1, 16);
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 150, innerkey1, 16);

		if (res0 == -6 && res1 == -6) {
			myHandleDeal("����Կ�쳣���Գɹ�", 0);
		} else {
			myHandleDeal("����Կ�쳣����ʧ��", res0);

		}

	}

	private void testgroup71() {
		myHandleDeal("testgroup71����", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 100, innerkey1, 16);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res5 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 10, 100, 0, ipIn, innerkey2, 16, ipOut, 16);
			int res4 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 100, 100, 2, ipIn, innerkey2, 16, ipOut, 16);
			int res3 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 100, 450, 0, ipIn, innerkey2, 16, ipOut, 16);
			int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x08, 100, 100, 0, ipIn, innerkey2, 16, ipOut, 16);

			if (res2 == -6 && res3 == -6 && res4 == -6) {
				myHandleDeal("group13���¹�����Կ���Գɹ�", 0);
			} else {
				myHandleDeal("group13���¹�����Կ����ʧ��", res2);
			}
		} else {
			myHandleDeal("group13��������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup72() {
		myHandleDeal("testgroup72����", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF9999efBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		String key3 = "56248AAAAAAAAAAA9999efBCabcdEFBF32";
		byte[] innerkey3 = ByteUtils.hexString2ByteArray(key3);
		String key4 = "56248AAAAAAAAAAA9999efBCabcdEF";
		byte[] innerkey4 = ByteUtils.hexString2ByteArray(key4);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 149, innerkey1, 24);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 149, 0, 1, ipIn, innerkey2, 24, ipOut, 24);
			if (res1 == 0) {
				myHandleDeal("���¹�����Կ���Գɹ�", res1);

				int res8 = Ddi.ddi_innerkey_des_encrypt(1, 0, 2, ipIn, msg_summery, 16, innerkey2);
				int res10 = Ddi.ddi_innerkey_des_encrypt(1, 0, 1, innerkey3, msg_summery, 16, innerkey2);
				int res11 = Ddi.ddi_innerkey_des_encrypt(1, 0, 1, innerkey4, msg_summery, 16, innerkey2);
				int res7 = Ddi.ddi_innerkey_des_encrypt(1, 150, 0, ipIn, msg_summery, 16, innerkey2);
				int res6 = Ddi.ddi_innerkey_des_encrypt(2, 0, 0, ipIn, msg_summery, 16, innerkey2);
				int res9 = Ddi.ddi_innerkey_des_decrypt(1, 0, 0, 1, ipIn, innerkey1, 16, innerkey1);
				int res16 = Ddi.ddi_innerkey_des_decrypt(1, 0, 0, 1, innerkey3, innerkey1, 16, innerkey1);
				int res17 = Ddi.ddi_innerkey_des_decrypt(1, 0, 0, 1, innerkey4, innerkey1, 16, innerkey1);
				int res15 = Ddi.ddi_innerkey_des_decrypt(1, 0, 0, -1, ipIn, innerkey1, 16, innerkey1);
				int res14 = Ddi.ddi_innerkey_des_decrypt(1, 0, -1, 1, ipIn, innerkey1, 16, innerkey1);
				int res13 = Ddi.ddi_innerkey_des_decrypt(1, -1, 0, 1, ipIn, innerkey1, 16, innerkey1);
				int res12 = Ddi.ddi_innerkey_des_decrypt(-1, 0, 0, 1, ipIn, innerkey1, 16, innerkey1);

				// int res5 = Ddi.ddi_innerkey_des_encrypt(1, 0, 0, ipIn, innerkey1, 16,
				// innerkey2);
//					int res12 = Ddi.ddi_innerkey_des_encrypt(1, 0, -1, ipIn, innerkey1, 16, innerkey2);
//					int res11 = Ddi.ddi_innerkey_des_encrypt(1, -1, 0, ipIn, innerkey1, 16, innerkey2);
//					int res10 = Ddi.ddi_innerkey_des_encrypt(-1, 0, 0, ipIn, innerkey1, 16, innerkey2);

			} else {
				myHandleDeal("group13���¹�����Կ����ʧ��", res1);
			}
		} else {
			myHandleDeal("group13��������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup73() {
		myHandleDeal("testgroup73����", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		String key3 = "56248AAAAAAAAAAA9999efBCabcdEFBF32";
		byte[] innerkey3 = ByteUtils.hexString2ByteArray(key3);
		String key4 = "56248AAAAAAAAAAA9999efBCabcdEF";
		byte[] innerkey4 = ByteUtils.hexString2ByteArray(key4);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 100, innerkey1, 16);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 100, 100, 0, ipIn, innerkey2, 16, ipOut, 16);
			if (res1 == 0) {
				myHandleDeal("���¹�����Կ���Գɹ�", res1);

				int res11 = Ddi.ddi_innerkey_aes_encrypt(1, 100, (byte) 1, innerkey4, innerkey1, innerkey1.length,
						innerkey2);
				int res10 = Ddi.ddi_innerkey_aes_encrypt(1, 100, (byte) 1, innerkey3, innerkey1, innerkey1.length,
						innerkey2);
				int res9 = Ddi.ddi_innerkey_aes_encrypt(1, 100, (byte) 0, ipIn, innerkey1, innerkey1.length, innerkey2);
				int res8 = Ddi.ddi_innerkey_aes_encrypt(1, 100, (byte) 2, ipIn, innerkey1, innerkey1.length, innerkey2);
				int res7 = Ddi.ddi_innerkey_aes_encrypt(1, -1, (byte) 0, ipIn, innerkey1, innerkey1.length, innerkey2);
				int res6 = Ddi.ddi_innerkey_aes_encrypt(2, 100, (byte) 0, ipIn, innerkey1, innerkey1.length, innerkey2);
				// ����
				int res17 = Ddi.ddi_innerkey_aes_decrypt(1, 100, 1, (byte) 1, innerkey4, innerkey2, innerkey2.length,
						innerkey2);
				int res16 = Ddi.ddi_innerkey_aes_decrypt(1, 100, 1, (byte) 1, innerkey3, innerkey2, innerkey2.length,
						innerkey2);
				int res15 = Ddi.ddi_innerkey_aes_decrypt(1, 100, 1, (byte) 2, ipIn, innerkey2, innerkey2.length,
						innerkey2);
				int res14 = Ddi.ddi_innerkey_aes_decrypt(1, 100, 150, (byte) 0, ipIn, innerkey2, innerkey2.length,
						innerkey2);
				int res13 = Ddi.ddi_innerkey_aes_decrypt(1, 450, 1, (byte) 0, ipIn, innerkey2, innerkey2.length,
						innerkey2);
				int res12 = Ddi.ddi_innerkey_aes_decrypt(-1, 100, 1, (byte) 0, ipIn, innerkey2, innerkey2.length,
						innerkey2);

			} else {
				myHandleDeal("group13���¹�����Կ����ʧ��", res1);
			}
		} else {
			myHandleDeal("group13��������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup74() {
		myHandleDeal("testgroup74����", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		String key3 = "56248AAAAAAAAAAA9999efBCabcdEFBF32";
		byte[] innerkey3 = ByteUtils.hexString2ByteArray(key3);
		String key4 = "56248AAAAAAAAAAA9999efBCabcdEF";
		byte[] innerkey4 = ByteUtils.hexString2ByteArray(key4);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 100, innerkey1, 16);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 100, 100, 0, ipIn, innerkey1, 16, ipOut, 16);
			if (res1 == 0) {
				myHandleDeal("���¹�����Կ���Գɹ�", res1);

				int res10 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, 100, (byte) 1, ipIn, innerkey1, innerkey1.length,
						innerkey2, leOut);
				int res16 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, 100, (byte) 1, innerkey4, innerkey1, innerkey1.length,
						innerkey2, leOut);
				int res15 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, 100, (byte) 1, innerkey3, innerkey1, innerkey1.length,
						innerkey2, leOut);
				int res14 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, 100, (byte) 2, ipIn, innerkey1, innerkey1.length,
						innerkey2, leOut);
				int res13 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, -1, (byte) 1, ipIn, innerkey1, innerkey1.length,
						innerkey2, leOut);
				int res12 = Ddi.ddi_innerkey_nes_sm4_encrypt(2, 100, (byte) 1, ipIn, innerkey1, innerkey1.length,
						innerkey2, leOut);
				int res11 = Ddi.ddi_innerkey_nes_sm4_decrypt(1, 100, 148, (byte) 1, ipIn, innerkey2, innerkey2.length,
						ipOut, leOut);
				int res22 = Ddi.ddi_innerkey_nes_sm4_decrypt(1, 100, 148, (byte) 1, innerkey4, innerkey2,
						innerkey2.length, ipOut, leOut);
				int res21 = Ddi.ddi_innerkey_nes_sm4_decrypt(1, 100, 148, (byte) 1, innerkey3, innerkey2,
						innerkey2.length, ipOut, leOut);
				int res20 = Ddi.ddi_innerkey_nes_sm4_decrypt(1, 100, 148, (byte) -1, ipIn, innerkey2, innerkey2.length,
						ipOut, leOut);
				int res19 = Ddi.ddi_innerkey_nes_sm4_decrypt(1, 100, -1, (byte) 1, ipIn, innerkey2, innerkey2.length,
						ipOut, leOut);
				int res18 = Ddi.ddi_innerkey_nes_sm4_decrypt(1, 450, 148, (byte) 1, ipIn, innerkey2, innerkey2.length,
						ipOut, leOut);
				int res17 = Ddi.ddi_innerkey_nes_sm4_decrypt(-1, 100, 148, (byte) 1, ipIn, innerkey2, innerkey2.length,
						ipOut, leOut);

			} else {
				myHandleDeal("group13���¹�����Կ����ʧ��", res1);
			}
		} else {
			myHandleDeal("group13��������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup75() {
		myHandleDeal("testgroup75����", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 100, innerkey1, 16);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 100, 100, 0, ipIn, innerkey1, 16, ipOut, 16);
			if (res1 == 0) {
				myHandleDeal("���¹�����Կ���Գɹ�", res1);
				int res6 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 100, innerkey1, 16);

				long begin = System.currentTimeMillis();
				for (int i = 0; i < 100; i++) {
					int res2 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 100, innerkey1, 16);
				}
				long end = System.currentTimeMillis();
				long current = end - begin;
				myHandleDeal("SM4��������Կʱ��Ϊ" + current + "��", 0);
			} else {
				myHandleDeal("group75���¹�����Կ����ʧ��", res1);
			}
		} else {
			myHandleDeal("group75��������Կʧ��", res0);
		}

	}

	private void testgroup76() {
		myHandleDeal("testgroup76����", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res2 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 100, innerkey1, 16);
		int res3 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 100, 100, 0, ipIn, innerkey1, 16, ipOut, 16);
		myHandleDeal("SM4���¹�����Կʱ��Ϊ" + res2 + res3, 0);
		long begin = System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 100, innerkey1, 16);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 100, 100, 0, ipIn, innerkey1, 16, ipOut, 16);
		}
		long end = System.currentTimeMillis();
		long current = end - begin;
		myHandleDeal("SM4���¹�����Կʱ��Ϊ" + current + "��", 0);

	}

	private void testgroup77() {

		myHandleDeal("testgroup77����", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res2 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
		myHandleDeal("SM4���¹�����Կʱ��Ϊ" + res2, 0);
		long begin = System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
		}
		long end = System.currentTimeMillis();
		long current = end - begin;
		myHandleDeal("DES��������Կʱ��Ϊ" + current + "��", 0);

	}

	private void testgroup78() {
		myHandleDeal("testgroup78����", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();

		int res2 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
		int res3 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 0, 1, ipIn, innerkey2, 16, ipOut, 16);
		myHandleDeal("SM4���¹�����Կʱ��Ϊ" + res2 + res3, 0);

		long begin = System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
			int res4 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 0, 1, ipIn, innerkey2, 16, ipOut, 16);
		}
		long end = System.currentTimeMillis();
		long current = end - begin;
		myHandleDeal("DES���¹�����Կʱ��Ϊ" + current + "��", 0);

	}

	private void testgroup79() {
		myHandleDeal("testgroup79����", 0);
		String key4 = "ffffffffFFFFFFFFffffffffFFFFFFFF";
		byte[] innerkey4 = ByteUtils.hexString2ByteArray(key4);
		byte[] DataOut = new byte[16];
		String data0 = "A16B6B2A2883D0CBE09797DAFB64B3D3";
		String data12 = "980E47DEA2A7AC679A7962966D0777FD";
		byte[] msg_summery1 = ByteUtils.hexString2ByteArray("85e9d210105327171927e8303ef028e1");
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 0, innerkey4, 16);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 0, 0, 0, ipIn, innerkey4, 16, ipOut, 16);
			// ���� ��32D00D9AC34566540D2A291DEB71932A
			if (res1 == 0) {
				myHandleDeal("���¹�����Կ�ɹ�", res1);
				int res5 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, 0, (byte) 1, ipIn, innerkey4, innerkey4.length, DataOut,
						leOut);// ������Կ����
				String data = ByteUtils.byteArray2HexString(DataOut);
				if (res5 == 0 && data.equalsIgnoreCase(data0)) {
					myHandleDeal("group79���¹�����Կ���ܳɹ�", res5);
					int res6 = Ddi.ddi_innerkey_nes_sm4_decrypt(1, 0, 1, (byte) 0x01, ipIn, innerkey4, 16, DataOut,
							leOut);
					String data1 = ByteUtils.byteArray2HexString(DataOut);
					if (res6 == 0 && data1.equalsIgnoreCase(data12)) {
						myHandleDeal("SM4CBCģʽ���ܳɹ�", 0);

					} else {
						myHandleDeal("SM4CBCģʽ����ʧ��" + data1, res6);

					}
				} else {
					myHandleDeal("group79���¹�����Կ����ʧ��" + data, res5);
				}
			} else {
				myHandleDeal("group79���¹�����Կʧ��", res1);
			}
		}
	}

	private void testgroup80() {
		myHandleDeal("testgroup80����", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "E4811916DB85D0E6B69C770C5194D8F5";
		String key3 = "F27554F758331A1348B993EEA095AB72";
		String key4 = "9E2A3B102BB987128D518BDE548AE12B";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		byte[] output = new byte[16];
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 122, innerkey1, 16);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 122, 2, 1, ipIn, innerkey2, 16, ipOut, 16);
			// ������DA903DA712448A3F69543784EE829115
			//  IV��30303030abCDef99a1da25f1e411fea5
			if (res1 == 0) {
				myHandleDeal("���¹�����Կ���Գɹ�", res1);
			} else {
				myHandleDeal("group80���¹�����Կ����ʧ��", res1);
			}
			int res2 = Ddi.ddi_innerkey_des_decrypt(1, 2, 1, 1, ipIn, innerkey1, 16, output);
			// 2019.3.11������ӵ�����
			
			String byteArray2HexString = ByteUtils.byteArray2HexString(output);
			
			if (res2 == 0 && key3.equalsIgnoreCase(byteArray2HexString)) {
				myHandleDeal("DES������Կ���ܳɹ�" + res2, res2);
				int res34 = Ddi.ddi_innerkey_des_encrypt(1, 2, 1, ipIn, innerkey2, 16, output); 
				String byteArray2HexString4 = ByteUtils.byteArray2HexString(output);
				if (res34 == 0 && key4.equalsIgnoreCase(byteArray2HexString4)) {
					myHandleDeal("DES������Կ���ܳɹ�", res34);
				} else {
					myHandleDeal("DES������Կ����ʧ��" + byteArray2HexString4, res34);
				}
			} else {
				myHandleDeal("group80������Կ����ʧ��"+byteArray2HexString, res2);
			}
		} else {
			myHandleDeal("group80��������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup81() {
		myHandleDeal("testgroup81����", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF9999efBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		byte[] iv = null;
		Ddi.ddi_innerkey_open();

		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 149, innerkey1, 24);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x00, 149, 0, 1, ipIn, innerkey2, 8, ipOut, 8);
			if (res1 == 0) {
				myHandleDeal("���¹�����Կ���Գɹ�", res1);
				int res3 = Ddi.ddi_innerkey_delete_key(1, 2);
				if (res3 == 0) {
					myHandleDeal("ɾ��������Կ���Գɹ�", res1);
				}
				int res89 = Ddi.ddi_innerkey_des_decrypt(1, 2, 1, 1, iv, msg_summery, 16, ipOut);
				if (res89 == -6) {
					myHandleDeal("DES���ܲ��Գɹ�", res89);
				} else {
					myHandleDeal("innerkeysingleDES���ܲ���ʧ��89", res89);
				}
			} else {
				myHandleDeal("group81���¹�����Կ����ʧ��", res1);
			}
		} else {
			myHandleDeal("group81��������Կʧ��", res0);
		}

	}

	private void testgroup82() {
		myHandleDeal("testgroup82����", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF9999efBCabcdEFBF";
		final byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		final byte[] iv = null;

		Thread mThread = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 150; i++) {
					int res6 = Ddi.ddi_innerkey_open();
					if (res6 == 0) {
						myHandleDeal("group82���豸�ɹ�" + i, res6);
					} else {
						myHandleDeal("group82���豸ʧ��" + i, res6);
					}
					int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x02, i, innerkey1, 24);
					if (res0 == 0) {
						myHandleDeal("group82��������Կ�ɹ�", res0);
						Ddi.ddi_innerkey_open();
						int res89 = Ddi.ddi_innerkey_des_decrypt(0, i, 1, 1, iv, msg_summery, 16, ipOut);
						if (res89 == 0) {
							myHandleDeal("group82DES����Կ��Կ���Գɹ�" + i, res89);
						} else {
							myHandleDeal("group82DES����Կ��Կ����ʧ��" + i, res89);

						}
						Ddi.ddi_innerkey_open();
						int res3 = Ddi.ddi_innerkey_delete_key(0, i);
						if (res3 == 0) {
							myHandleDeal("group82ɾ������Կ���Գɹ�" + i, res3);

						} else {
							myHandleDeal("group82ɾ������Կ����ʧ��" + i, res3);
						}
					} else {
						myHandleDeal("group82��������Կʧ��" + i, res0);
					}
					int res23 = Ddi.ddi_innerkey_close();
					if (res23 == 0) {
						myHandleDeal("group82�ر��豸�ɹ�", res23);
					} else {
						myHandleDeal("group82�ر��豸ʧ��", res23);
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

	private void testgroup83() {
		myHandleDeal("testgroup83����", 0);
		String key4 = "ffffffffFFFFFFFFffffffffFFFFFFFF";
		final byte[] innerkey4 = ByteUtils.hexString2ByteArray(key4);
		final byte[] DataOut = new byte[16];
		final String data0 = "EC2E4096473E89AFBD46ADD315411E50";
		byte[] msg_summery1 = ByteUtils.hexString2ByteArray("85e9d210105327171927e8303ef028e1");
			Thread mThread = new Thread(new Runnable() {
				public void run() {
					Ddi.ddi_innerkey_open();
					int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 0, innerkey4, 16);
					if (res0 == 0) {
						myHandleDeal("��������Կ�ɹ�", res0);
					for (int i = 0; i < 450; i++) {
						int res6 = Ddi.ddi_innerkey_open();
						if (res6 == 0) {
							myHandleDeal("group83���豸�ɹ�" + i, res6);
						} else {
							myHandleDeal("group83���豸ʧ��" + i, res6);
						}
						Ddi.ddi_innerkey_open();
						int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 0, i, 0, ipIn, innerkey4, 16, ipOut, 16);
						if (res1 == 0) {
							myHandleDeal("group83���¹�����Կ�ɹ�" + i, res1);
							Ddi.ddi_innerkey_open();
							int res5 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, i, (byte) 0, ipIn, innerkey4,
									innerkey4.length, DataOut, leOut);// ������Կ����
							String data = ByteUtils.byteArray2HexString(DataOut);
							if (res5 == 0 && data.equalsIgnoreCase(data0)) {
								myHandleDeal("group83���¹�����Կ���ܳɹ�" + i, res5);
							} else {
								myHandleDeal("group83���¹�����Կ����ʧ��" + data, res5);
							}
							Ddi.ddi_innerkey_open();
							int res3 = Ddi.ddi_innerkey_delete_key(1, i);
							if (res3 == 0) {
								myHandleDeal("group83ɾ��������Կ���Գɹ�" + i, res3);

							} else {
								myHandleDeal("group83ɾ��������Կ����ʧ��" + i, res3);
							}

						}
						int res7 = Ddi.ddi_innerkey_close();
						if (res7 == 0) {
							myHandleDeal("group83�ر��豸�ɹ�" + i, res7);
						} else {
							myHandleDeal("group83�ر��豸ʧ��" + i, res7);
						}
					}
					} else {
						myHandleDeal("group83���¹�����Կʧ��", res0);
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

	private void testgroup84() {
		myHandleDeal("testgroup84����", 0);

		Thread mThread = new Thread(new Runnable() {
			public void run() {
				// ����Կ����
				String key1 = "31313131313131313131313131313131";
				byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
				String data0 = "8B18C930601F4AD94573F487B9406D95";
				// SM4
				String data1 = "9BDB471AE492209DE66C55BBFA939486";
				// AES
				String key3 = "A12345678A12345678A12345678A1234";
				byte[] innerkey3 = ByteUtils.hexString2ByteArray(key3);
				String key2 = "FFED87779636B4674EA3E9339B7F488A";
				// DUKPT
				byte[] m_initkey1 = ByteUtils.hexString2ByteArray(ParaEntity.initkey1);
				byte[] m_initksn = ByteUtils.hexString2ByteArray(ParaEntity.initksn);
				byte[] iv = ByteUtils.hexString2ByteArray(ParaEntity.ivt);
				byte[] m_plain = ByteUtils.hexString2ByteArray(ParaEntity.plain);
				byte[] m_plain1 = ByteUtils.hexString2ByteArray(ParaEntity.plain1);
				byte[] cipher = new byte[24];
				String key4 = "f1acee231d370a171543cd366bb731349eeacd6590270b43";

				// SM2
				byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey);
				byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey);
				// byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
				byte[] DataOut = new byte[16];
//				byte[] msg_summery1 = ByteUtils.hexString2ByteArray("85e9d210105327171927e8303ef028e1");
				Ddi.ddi_innerkey_open();
				for (int i = 0; i < 1000; i++) {
					int res6 = Ddi.ddi_innerkey_open();
					if (res6 == 0) {
						myHandleDeal("group84���豸�ɹ�" + i, res6);
					} else {
						myHandleDeal("group84���豸ʧ��" + i, res6);
					}
					// DES����
					int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 143, innerkey1, 16);
					if (res0 == 0) {
						myHandleDeal("DES��������Կ�ɹ�" + i + "��", res0);
						// 12345678abcdEFBFABCDefBCabcdEFBF==msg_summery
						int res5 = Ddi.ddi_innerkey_des_encrypt(0, 143, 0, ipIn, msg_summery, 16, DataOut);// ����ԿDES����
						String data = ByteUtils.byteArray2HexString(DataOut);
						if (res5 == 0 && data.equalsIgnoreCase(data0)) {
							myHandleDeal("DES����ԿDES���ܳɹ�" + i + "��", res5);
						} else {
							myHandleDeal("DES����ԿDES����ʧ��" + i + "��" + data, res5);
						}

					} else {
						myHandleDeal("DES��������Կʧ��" + i + "��", res0);
					}
					// SM4����
					Ddi.ddi_innerkey_open();
					int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 145, innerkey1, 16);
					if (res1 == 0) {
						myHandleDeal("SM4��������Կ�ɹ�" + i + "��", res1);
						// 12345678abcdEFBFABCDefBCabcdEFBF==msg_summery
						int res5 = Ddi.ddi_innerkey_nes_sm4_encrypt(0, 145, (byte) 0, ipIn, msg_summery, 16, DataOut,
								leOut);// ����ԿSM4����
						String data = ByteUtils.byteArray2HexString(DataOut);
						if (res5 == 0 && data.equalsIgnoreCase(data1)) {
							myHandleDeal("SM4����Կ���ܳɹ�" + i + "��", res5);
						} else {
							myHandleDeal("SM4����Կ����ʧ��" + i + "��" + data, res5);
						}

					} else {
						myHandleDeal("SM4��������Կʧ��" + i + "��", res1);
					}
					// AES����
					Ddi.ddi_innerkey_open();
					int res4 = Ddi.ddi_innerkey_update_mk((byte) 0x04, 77, innerkey3, 16);
					if (res4 == 0) {
						myHandleDeal("AES��������Կ�ɹ�" + i + "��", res4);
						// 12345678abcdEFBFABCDefBCabcdEFBF==msg_summery
						int res5 = Ddi.ddi_innerkey_aes_encrypt(0, 77, (byte) 0, ipIn, msg_summery, 16, DataOut);// ����ԿAES����
						String data = ByteUtils.byteArray2HexString(DataOut);
						if (res5 == 0 && data.equalsIgnoreCase(key2)) {
							myHandleDeal("AES����Կ���ܳɹ�" + i + "��", res5);
						} else {
							myHandleDeal("AES����Կ����ʧ��" + i + "��" + data, res5);
						}
					} else {
						myHandleDeal("AES��������Կʧ��" + i + "��", res4);
					}

					// DUKPT����

					res1 = Ddi.ddi_dukpt_open();
					int res7 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 0, 2, m_initkey1, (byte) 0x10, m_initksn,
							(byte) 0xa);
					if (res7 == 0) {
						myHandleDeal("dukptע����Կ�ɹ�" + i + "��", res7);
						// 12345678abcdEFBFABCDefBCabcdEFBF==msg_summery
						int res5 = Ddi.ddi_dukpt_encrypt(0, 0, (byte) 0, iv, 0, m_plain, m_plain.length, cipher);// ����ԿAES����
						String data = ByteUtils.byteArray2HexString(cipher);
						if (res5 == 0 && data.equalsIgnoreCase(key4)) {
							myHandleDeal("dukpt����Կ���ܳɹ�" + i + "��", res5);
						} else {
							myHandleDeal("dukpt����Կ����ʧ��" + i + "��" + data, res5);
						}
					} else {
						myHandleDeal("dukpt��������Կʧ��" + i + "��", res7);
					}
					Ddi.ddi_dukpt_close();

					// SM2�ӽ���
					Ddi.ddi_innerkey_open();
					int res9 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, 0, puk, prk);
					if (res9 == 0) {
						myHandleDeal("SM2������Կ�ɹ�" + i + "��", res9);

					} else {
						myHandleDeal("SM2������Կʧ��" + i + "��", res9);
					}
					int res13 = Ddi.ddi_innerkey_close();
					if (res13 == 0) {
						myHandleDeal("group84�ر��豸�ɹ�" + i, res13);
					} else {
						myHandleDeal("group84�ر��豸ʧ��" + i, res13);
					}

				}
			}
		});
//		mThrea
		mThread.start();
		try {
			mThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void testgroup11() {
		myHandleDeal("testgroup11����", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		String key3 = "CA02764FC025A3907E926B112EF27CC2";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		byte[] output = new byte[16];
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 122, innerkey1, 16);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 122, 2, 1, ipIn, innerkey2, 16, ipOut, 16);
			if (res1 == 0) {
				myHandleDeal("group11���¹�����Կ���Գɹ�", res1);
			} else {
				myHandleDeal("group11���¹�����Կ����ʧ��", res1);
			}
			int res2 = Ddi.ddi_innerkey_des_encrypt(0, 122, 0, ipIn, msg_summery, 16, ipOut);
			// 2019.3.11������ӵ�����
			//12345678abcdEFBFABCDefBCabcdEFBF=msg_summery
			//CBC������4BF6699A03307BDE2D681E40C96EBC7E
			//ECB������7BC659AAA8FD94477B4C94EA63C416D4
			int res3 = Ddi.ddi_innerkey_des_encrypt(1, 2, 1, ipIn, msg_summery, 16, output);
			String byteArray2HexString = ByteUtils.byteArray2HexString(output);

			if (res2 + res3 == 0 && key3.equalsIgnoreCase(byteArray2HexString)) {
				myHandleDeal("group11������Կ���ܳɹ�" + res2 + ":" + res3, res2);
			} else {
				myHandleDeal("group11������Կ����ʧ��"+byteArray2HexString, res2);
			}
		} else {
			myHandleDeal("group11��������Կʧ��", res0);
		}

	}

	private void testgroup12() {
		myHandleDeal("testgroup12����", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF78abcdEFBFABCDef";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF78abcdEFBFABCDef";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 75, innerkey1, 24);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 75, 225, 1, ipIn, innerkey2, 24, ipOut, 24);
			if (res1 == 0) {
				myHandleDeal("���¹�����Կ���Գɹ�", res1);
			} else {
				myHandleDeal("group12���¹�����Կ����ʧ��", res1);
			}
		} else {
			myHandleDeal("group12��������Կʧ��", res0);
		}

	}

	private void testgroup13() {
		myHandleDeal("testgroup13����", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF9999efBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 149, innerkey1, 24);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 149, 0, 1, ipIn, innerkey2, 24, ipOut, 24);
			if (res1 == 0) {
				myHandleDeal("���¹�����Կ���Գɹ�", res1);
			} else {
				myHandleDeal("group13���¹�����Կ����ʧ��", res1);
			}
		} else {
			myHandleDeal("group13��������Կʧ��", res0);
		}

	}

	private void testgroup14() {
		
//		myHandleDeal("testgroup14����", 0);
//		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF9999efBCabcdEFBF";
//		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
//		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF9999efBCabcdEFBF";
//		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
//		byte[] DataOut = new byte[16];
//		String data0 = "12345678ABCDEFBFABCDEFBCABCDEFBF";
//		String data1 = "b6e958b66fd472c33a5a0448751d375f";
//		String data2 = "70D491E984995FA2C2CCA25FD5F9BAE3";
//		byte[] msg_summery1 = ByteUtils.hexString2ByteArray("70D491E984995FA2C2CCA25FD5F9BAE3");
//		Ddi.ddi_innerkey_open();
//		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 149, innerkey1, 24);
//		if (res0 == 0) {
//			myHandleDeal("��������Կ�ɹ�", res0);
//			//������Կ���ģ�9C8B1648927397EB0F5C8A72C0C917E30F5C8A72C0C917E3
//			//ipin:30303030abCDef99a1da25f1e411fea5
//			//msg_summery=12345678abcdEFBFABCDefBCabcdEFBF
//			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 149, 449, 0, ipIn, innerkey2, 24, ipOut, 24);
//			int res2 = Ddi.ddi_innerkey_des_encrypt(0, 149, 1, ipIn, msg_summery, 16, DataOut);// ����Կ����
//			String data = ByteUtils.byteArray2HexString(DataOut);
//			if (res2 == 0 && data.equals(data1)) {
//				myHandleDeal("����Կ���ܳɹ�", res2);
//			} else {
//				myHandleDeal("group14����Կ����ʧ��"+data, res2);
//			}
////			int res3 = Ddi.ddi_innerkey_delete_key(0, 149);
////			if (res3 == 0) {
////				myHandleDeal("ɾ������Կ�ɹ�", res3);
////				int res4 = Ddi.ddi_innerkey_des_encrypt(0, 149, 0, ipIn, msg_summery, 16, DataOut);
////				if (res4 == -6) {
////					myHandleDeal("����Կ���ܲ��Գɹ�", res4);
////				} else {
////					myHandleDeal("group14����Կ���ܲ���ʧ��", res4);
////				}
////			} else {
////				myHandleDeal("group14ɾ������Կʧ��", res3);
////			}
//			if (res1 == 0) {
//				myHandleDeal("���¹�����Կ�ɹ�", res1);
//				int res5 = Ddi.ddi_innerkey_des_encrypt(1, 449, 1, ipIn, msg_summery, 16, DataOut);// ������Կ����
//				data = ByteUtils.byteArray2HexString(DataOut);
//				if (res5 == 0 && data.equalsIgnoreCase(data2)) {
//					myHandleDeal("������Կ���ܳɹ�", res5);
//				} else {
//					myHandleDeal("group14������Կ����ʧ��" + data, res5);
//				}
//				int res6 = Ddi.ddi_innerkey_des_decrypt(1, 449, 0, 0, ipIn, msg_summery1, 16, DataOut);// ������Կ����
//				data = ByteUtils.byteArray2HexString(DataOut);
//				if (res6 == 0 && data.equalsIgnoreCase(data0)) {
//					myHandleDeal("������Կ���ܳɹ�", res6);
//				} else {
//					myHandleDeal("group14������Կ����ʧ��" + data, res6);
//				}
//				int res7 = Ddi.ddi_innerkey_delete_key(1, 449);
////				if (res7 == 0) {
////					myHandleDeal("ɾ��������Կ�ɹ�", res7);
////					int res8 = Ddi.ddi_innerkey_des_encrypt(1, 449, 0, ipIn, msg_summery, 16, DataOut);
////					if (res8 == -6) {
////						myHandleDeal("������Կ���ܲ��Գɹ�", res8);
////					} else {
////						myHandleDeal("group14������Կ���ܲ���ʧ��", res8);
////					}
////				} else {
////					myHandleDeal("group14ɾ��������Կʧ��", res7);
////				}
//			} else {
//				myHandleDeal("group14���¹�����Կʧ��", res1);
//			}
//
//		} else {
//			myHandleDeal("group14��������Կʧ��", res0);
//		}
		
		
		myHandleDeal("testgroup14����", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF9999efBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		byte[] DataOut = new byte[16];
		String data0 = "12345678ABCDEFBFABCDEFBCABCDEFBF";
		String data1 = "b6e958b66fd472c33a5a0448751d375f";
		String data2 = "70D491E984995FA2C2CCA25FD5F9BAE3";
		byte[] msg_summery1 = ByteUtils.hexString2ByteArray("70D491E984995FA2C2CCA25FD5F9BAE3");
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 149, innerkey1, 24);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			//������Կ���ģ�9C8B1648927397EB0F5C8A72C0C917E30F5C8A72C0C917E3
			//ipin:30303030abCDef99a1da25f1e411fea5
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 149, 449, 1, ipIn, innerkey2, 24, ipOut, 24);
			int res2 = Ddi.ddi_innerkey_des_encrypt(0, 149, 0, ipIn, msg_summery, 16, DataOut);// ����Կ����
			String data = ByteUtils.byteArray2HexString(DataOut);
			if (res2 == 0 && data.equals(data1)) {
				myHandleDeal("����Կ���ܳɹ�", res2);
			} else {
				myHandleDeal("group14����Կ����ʧ��"+data, res2);
			}
			int res3 = Ddi.ddi_innerkey_delete_key(0, 149);
			if (res3 == 0) {
				myHandleDeal("ɾ������Կ�ɹ�", res3);
				int res4 = Ddi.ddi_innerkey_des_encrypt(0, 149, 0, ipIn, msg_summery, 16, DataOut);
				if (res4 == -6) {
					myHandleDeal("����Կ���ܲ��Գɹ�", res4);
				} else {
					myHandleDeal("group14����Կ���ܲ���ʧ��", res4);
				}
			} else {
				myHandleDeal("group14ɾ������Կʧ��", res3);
			}
			if (res1 == 0) {
				myHandleDeal("���¹�����Կ�ɹ�", res1);
				int res5 = Ddi.ddi_innerkey_des_encrypt(1, 449, 0, ipIn, msg_summery, 16, DataOut);// ������Կ����
				data = ByteUtils.byteArray2HexString(DataOut);
				if (res5 == 0 && data.equalsIgnoreCase(data2)) {
					myHandleDeal("������Կ���ܳɹ�", res5);
				} else {
					myHandleDeal("group14������Կ����ʧ��" + data, res5);
				}
				int res6 = Ddi.ddi_innerkey_des_decrypt(1, 449, 0, 0, ipIn, msg_summery1, 16, DataOut);// ������Կ����
				data = ByteUtils.byteArray2HexString(DataOut);
				if (res6 == 0 && data.equalsIgnoreCase(data0)) {
					myHandleDeal("������Կ���ܳɹ�", res6);
				} else {
					myHandleDeal("group14������Կ����ʧ��" + data, res6);
				}
				int res7 = Ddi.ddi_innerkey_delete_key(1, 449);
				if (res7 == 0) {
					myHandleDeal("ɾ��������Կ�ɹ�", res7);
					int res8 = Ddi.ddi_innerkey_des_encrypt(1, 449, 0, ipIn, msg_summery, 16, DataOut);
					if (res8 == -6) {
						myHandleDeal("������Կ���ܲ��Գɹ�", res8);
					} else {
						myHandleDeal("group14������Կ���ܲ���ʧ��", res8);
					}
				} else {
					myHandleDeal("group14ɾ��������Կʧ��", res7);
				}
			} else {
				myHandleDeal("group14���¹�����Կʧ��", res1);
			}
			
		} else {
			myHandleDeal("group14��������Կʧ��", res0);
		}
		
	}

	private void testgroup15() {
		

		myHandleDeal("testgroup15����", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 149, innerkey1, 16);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 149, 449, 1, ipIn, innerkey2, 16, ipOut, 16);
			if (res1 == 0) {
				myHandleDeal("���¹�����Կ���Գɹ�", res1);
			} else {
				myHandleDeal("group15���¹�����Կ����ʧ��", res1);
			}
		} else {
			myHandleDeal("group15��������Կʧ��", res0);
		}
	}

	private void testgroup16() {
		myHandleDeal("testgroup16����", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 149, innerkey1, 16);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x00, 149, 449, 1, ipIn, innerkey2, 8, ipOut, 8);
			if (res1 == 0) {
				myHandleDeal("���¹�����Կ���Գɹ�", res1);
			} else {
				myHandleDeal("group16���¹�����Կ����ʧ��", res1);
			}
		} else {
			myHandleDeal("group16��������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup17() {
		myHandleDeal("testgroup17����", 0);
		String key1 = "12345678abcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x00, 149, innerkey1, 8);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 149, 449, 1, ipIn, innerkey2, 16, ipOut, 16);
			if (res1 == -6) {
				myHandleDeal("���¹�����Կ���Գɹ�", res1);
			} else {
				myHandleDeal("group17���¹�����Կ����ʧ��", res1);
			}
		} else {
			myHandleDeal("group17��������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup18() {
		myHandleDeal("testgroup18����", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF12345678abcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 149, innerkey1, 24);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 149, 449, 1, ipIn, innerkey2, 16, ipOut, 16);
			// int res1 =
			// Ddi.ddi_innerkey_update_wk((byte)0x00,2,0,0,ipIn,innerkey,8,ipOut,8);
			if (res1 == 0) {
				myHandleDeal("���¹�����Կ�ɹ�", res1);
			} else {
				myHandleDeal("group18���¹�����Կʧ��", res1);
			}
		} else {
			myHandleDeal("group18��������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
//		 byte[] innerkey = new byte[512];
//		
//		 byte[] innerkey3 = new byte[512];
//	myHandleDeal("testgroup18����",0);
//	String key1 = "12345678abcdEFBFABCDefBCabcdEFBF12345678abcdEFBF";
//	byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
//	String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
//	byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
//	Ddi.ddi_innerkey_open();
//	int res0 = Ddi.ddi_innerkey_update_mk((byte)0x02,2,innerkey3,24);
//	if(res0==0){
//		myHandleDeal("��������Կ�ɹ�",res0);
//		
//		int res1 = Ddi.ddi_innerkey_update_wk((byte)0x00,2,0,0,ipIn,innerkey,8,ipOut,8); 
//		if(res1==0){
//			myHandleDeal("���¹�����Կ�ɹ�",res1);	
//		}else{
//			myHandleDeal("group18���¹�����Կʧ��",res1);
//		}
//		int res3=Ddi.ddi_innerkey_des_decrypt(1,0,0,1,ipIn,msg_summery,16,ipOut);
//		if (res3==0) {
//			myHandleDeal("group18DES���ܳɹ�",res3);
//		}else {
//			myHandleDeal("group18DES����ʧ��",res3);
//		}
//		
//	}else{
//		myHandleDeal("group18��������Կʧ��",res0);
//	}
//	Ddi.ddi_innerkey_close();

	}

	private void testgroup19() {
		myHandleDeal("testgroup19����", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF12345678abcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 149, innerkey1, 24);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 149, 449, 1, ipIn, innerkey2, 16, ipOut, 16);
			if (res1 == -6) {
				myHandleDeal("���¹�����Կ���Գɹ�", res1);
			} else {
				myHandleDeal("group19���¹�����Կ����ʧ��", res1);
			}
		} else {
			myHandleDeal("group19��������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup20() {
		myHandleDeal("testgroup20����", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 149, innerkey1, 16);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 149, 449, 1, ipIn, innerkey2, 16, ipOut, 16);
			if (res1 == -6) {
				myHandleDeal("���¹�����Կ���Գɹ�", res1);
			} else {
				myHandleDeal("group20���¹�����Կ����ʧ��", res1);
			}
		} else {
			myHandleDeal("group20��������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup21() {
		myHandleDeal("testgroup21����", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		byte[] DataOut = new byte[16];
		String data0 = "b371174560c98380602f258ff0e3005e";
		String data1 = "3982d88e9ca18dae03f46b05a041ff77";
		String data2 = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] msg_summery1 = ByteUtils.hexString2ByteArray("3982d88e9ca18dae03f46b05a041ff77");
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 149, innerkey1, 16);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 149, 449, 1, ipIn, innerkey2, 16, ipOut, 16);
			int res2 = Ddi.ddi_innerkey_nes_sm4_encrypt(0, 149, (byte) 0x01, ipIn, msg_summery, 16, DataOut, leOut);// ����Կ����
			String data = ByteUtils.byteArray2HexString(DataOut);
			if (res2 == 0 && data.equals(data0)) {
				myHandleDeal("����Կ���ܳɹ�", res2);
			} else {
				myHandleDeal("group21����Կ����ʧ��", res2);
			}
			int res3 = Ddi.ddi_innerkey_delete_key(0, 149);
			if (res3 == 0) {
				myHandleDeal("ɾ������Կ�ɹ�", res3);
				int res4 = Ddi.ddi_innerkey_nes_sm4_encrypt(0, 149, (byte) 0x01, ipIn, msg_summery, 16, DataOut, leOut);
				if (res4 == -6) {
					myHandleDeal("����Կ���ܲ��Գɹ�", res4);
				} else {
					myHandleDeal("group21����Կ���ܲ���ʧ��", res4);
				}
			} else {
				myHandleDeal("group21ɾ������Կʧ��", res3);
			}
			if (res1 == 0) {
				myHandleDeal("���¹�����Կ�ɹ�", res1);
				int res5 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, 449, (byte) 0x01, ipIn, msg_summery, 16, DataOut, leOut);// ������Կ����
				data = ByteUtils.byteArray2HexString(DataOut);
				if (res5 == 0 && data.equals(data1)) {
					myHandleDeal("������Կ���ܳɹ�", res5);
				} else {
					myHandleDeal("group21������Կ����ʧ��", res5);
				}
				int res6 = Ddi.ddi_innerkey_nes_sm4_decrypt(1, 449, 0, (byte) 0x01, ipIn, msg_summery1, 16, DataOut,
						leOut);// ������Կ����
				data = ByteUtils.byteArray2HexString(DataOut);
				if (res6 == 0 && data.equals(data2)) {
					myHandleDeal("������Կ���ܳɹ�", res6);
				} else {
					myHandleDeal("group21������Կ����ʧ��", res6);
				}
				int res7 = Ddi.ddi_innerkey_delete_key(1, 449);
				if (res7 == 0) {
					myHandleDeal("ɾ��������Կ�ɹ�", res7);
					int res8 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, 449, (byte) 0x01, ipIn, msg_summery, 16, DataOut,
							leOut);
					if (res8 == -6) {
						myHandleDeal("������Կ���ܲ��Գɹ�", res8);
					} else {
						myHandleDeal("group21������Կ���ܲ���ʧ��", res8);
					}
				} else {
					myHandleDeal("group21ɾ��������Կʧ��", res7);
				}
			} else {
				myHandleDeal("group21���¹�����Կʧ��", res1);
			}

		} else {
			myHandleDeal("group21��������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup22() {
		myHandleDeal("testgroup22����", 0);
		String key1 = "12345678abcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		String key3 = "56248AAAAAAAAAAA9999efBCabcdEFBF12345678abcdEFBF";
		byte[] innerkey3 = ByteUtils.hexString2ByteArray(key3);
		String key4 = "ffffffffFFFFFFFFffffffffFFFFFFFF";
		byte[] innerkey4 = ByteUtils.hexString2ByteArray(key4);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x00, 0, innerkey1, 8);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x00, 0, 0, 1, ipIn, innerkey1, 8, ipOut, 8);
			if (res1 == 0) {
				myHandleDeal("���¹�����Կ���Գɹ�", res1);
			} else {
				myHandleDeal("group22���¹�����Կ����ʧ��", res1);
			}
		} else {
			myHandleDeal("group22��������Կʧ��", res0);
		}
		int res2 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 1, innerkey2, 16);
		if (res2 == 0) {
			myHandleDeal("��������Կ�ɹ�", res2);
			int res3 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 1, 1, 1, ipIn, innerkey2, 16, ipOut, 16);
			if (res3 == 0) {
				myHandleDeal("���¹�����Կ���Գɹ�", res3);
			} else {
				myHandleDeal("group22���¹�����Կ����ʧ��", res3);
			}
		} else {
			myHandleDeal("group22��������Կʧ��", res2);
		}
		int res5 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 75, innerkey3, 24);
		if (res5 == 0) {
			myHandleDeal("��������Կ�ɹ�", res5);
			int res6 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 75, 225, 1, ipIn, innerkey3, 24, ipOut, 24);
			if (res6 == 0) {
				myHandleDeal("���¹�����Կ���Գɹ�", res6);
			} else {
				myHandleDeal("group22���¹�����Կ����ʧ��", res6);
			}
		} else {
			myHandleDeal("group22��������Կʧ��", res5);
		}
		int res7 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 149, innerkey4, 16);
		if (res7 == 0) {
			myHandleDeal("��������Կ�ɹ�", res7);
			int res8 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 149, 449, 1, ipIn, innerkey4, 16, ipOut, 16);
			if (res8 == 0) {
				myHandleDeal("���¹�����Կ���Գɹ�", res8);
			} else {
				myHandleDeal("group22���¹�����Կ����ʧ��", res8);
			}
		} else {
			myHandleDeal("group22��������Կʧ��", res7);
		}
		int res9 = Ddi.ddi_innerkey_delete_key(0, 0);
		if (res9 == 0) {
			myHandleDeal("ɾ����Կ�ɹ�", res9);
		} else {
			myHandleDeal("group22ɾ����Կʧ��", res9);
		}
		int res10 = Ddi.ddi_innerkey_delete_key(0, 1);
		if (res10 == 0) {
			myHandleDeal("ɾ����Կ�ɹ�", res10);
		} else {
			myHandleDeal("group22ɾ����Կʧ��", res10);
		}
		int res11 = Ddi.ddi_innerkey_delete_key(0, 75);
		if (res11 == 0) {
			myHandleDeal("ɾ����Կ�ɹ�", res11);
		} else {
			myHandleDeal("group22ɾ����Կʧ��", res11);
		}
		int res12 = Ddi.ddi_innerkey_delete_key(0, 149);
		if (res12 == 0) {
			myHandleDeal("ɾ����Կ�ɹ�", res12);
		} else {
			myHandleDeal("group22ɾ����Կʧ��", res12);
		}
		int res13 = Ddi.ddi_innerkey_delete_key(0, 150);
		if (res13 == -6) {
			myHandleDeal("ɾ����Կ���Գɹ�", res13);
		} else {
			myHandleDeal("group22ɾ����Կ����ʧ��", res13);
		}
		int res14 = Ddi.ddi_innerkey_delete_key(1, 0);
		if (res14 == 0) {
			myHandleDeal("ɾ����Կ�ɹ�", res14);
		} else {
			myHandleDeal("group22ɾ����Կʧ��", res14);
		}
		int res15 = Ddi.ddi_innerkey_delete_key(1, 1);
		if (res15 == 0) {
			myHandleDeal("ɾ����Կ�ɹ�", res15);
		} else {
			myHandleDeal("group22ɾ����Կʧ��", res15);
		}
		int res16 = Ddi.ddi_innerkey_delete_key(1, 225);
		if (res16 == 0) {
			myHandleDeal("ɾ����Կ�ɹ�", res16);
		} else {
			myHandleDeal("group22ɾ����Կʧ��", res16);
		}
		int res17 = Ddi.ddi_innerkey_delete_key(1, 449);
		if (res17 == 0) {
			myHandleDeal("ɾ����Կ�ɹ�", res17);
		} else {
			myHandleDeal("group22ɾ����Կʧ��", res17);
		}
		int res18 = Ddi.ddi_innerkey_delete_key(1, 450);
		if (res18 == -6) {
			myHandleDeal("ɾ����Կ�ɹ�", res18);
		} else {
			myHandleDeal("group22ɾ����Կʧ��", res18);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup23() {
		myHandleDeal("testgroup23����", 0);
		String key1 = "12345678abcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		String key3 = "56248AAAAAAAAAAA9999efBCabcdEFBF12345678abcdEFBF";
		byte[] innerkey3 = ByteUtils.hexString2ByteArray(key3);
		String key4 = "ffffffffFFFFFFFFffffffffFFFFFFFF";
		byte[] innerkey4 = ByteUtils.hexString2ByteArray(key4);
		String key5 = "ffffffffFFFFFFFFffffffffFFFFFFFF56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey5 = ByteUtils.hexString2ByteArray(key5);
		String pubkey = "77422EEC40F85BCD4B45AD2C81538FD74039ADBE5F7DCD906729B4E996BA09AFF4DF324FD5342DD885531D9C1B06378823B361C7BCCBD1BC4B935DFAD4A3B200";
		String prikey = "162130C960520EC227C6547D7921C77BE67B4AA47BE0C0247EEE18A54FFCC8F4";
		byte[] puk = ByteUtils.hexString2ByteArray(pubkey);
		byte[] prk = ByteUtils.hexString2ByteArray(prikey);
		Ddi.ddi_innerkey_open();
		for (int i = 0; i < 150; i++) {
			int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x00, i, innerkey1, 8);
			if (res1 == 0) {
				myHandleDeal("��������Կ�ɹ�", res1);
//				Log.v("testgroup23", "" + i);
			} else {
				myHandleDeal("group23��������Կʧ��1" + i, res1);
			}
			int res2 = Ddi.ddi_innerkey_update_mk((byte) 0x01, i, innerkey2, 16);
			if (res2 == 0) {
				myHandleDeal("��������Կ�ɹ�", res2);
			} else {
				myHandleDeal("group23��������Կʧ��2" + i, res2);
			}
			int res3 = Ddi.ddi_innerkey_update_mk((byte) 0x02, i, innerkey3, 24);
			if (res3 == 0) {
				myHandleDeal("��������Կ�ɹ�", res3);
			} else {
				myHandleDeal("group23��������Կʧ��3" + i, res3);
			}
			int res4 = Ddi.ddi_innerkey_update_mk((byte) 0x03, i, innerkey4, 16);
			if (res4 == 0) {
				myHandleDeal("��������Կ�ɹ�", res4);
			} else {
				myHandleDeal("group23��������Կʧ��4" + i, res4);
			}
			int res5 = Ddi.ddi_innerkey_update_mk((byte) 0x04, i, innerkey4, 16);
			if (res5 == 0) {
				myHandleDeal("��������Կ�ɹ�", res5);
			} else {
				myHandleDeal("group23��������Կʧ��5" + i, res5);
			}
			int res6 = Ddi.ddi_innerkey_update_mk((byte) 0x05, i, innerkey3, 24);
			if (res6 == 0) {
				myHandleDeal("��������Կ�ɹ�", res6);
			} else {
				myHandleDeal("group23��������Կʧ��5" + i, res6);
			}
			int res7 = Ddi.ddi_innerkey_update_mk((byte) 0x06, i, innerkey5, 32);
			if (res7 == 0) {
				myHandleDeal("��������Կ�ɹ�", res7);
			} else {
				myHandleDeal("group23��������Կʧ��7" + i, res7);
			}
		}
		for (int j = 0; j < 450; j++) {
			Ddi.ddi_innerkey_update_mk((byte) 0x00, 0, innerkey1, 8);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x00, 0, j, 0, ipIn, innerkey1, 8, ipOut, 200);
			if (res1 == 0) {
				myHandleDeal("���¹�����Կ�ɹ�", res1);
			} else {
				myHandleDeal("1group23���¹�����Կʧ��1" + j, res1);
			}
			Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey2, 16);
			int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, j, 0, ipIn, innerkey2, 16, ipOut, 200);
			if (res2 == 0) {
				myHandleDeal("���¹�����Կ�ɹ�", res2);
			} else {
				myHandleDeal("group23���¹�����Կʧ��2" + j, res2);
			}
			Ddi.ddi_innerkey_update_mk((byte) 0x02, 0, innerkey3, 24);
			int res3 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 0, j, 0, ipIn, innerkey3, 24, ipOut, 200);
			if (res3 == 0) {
				myHandleDeal("���¹�����Կ�ɹ�", res3);
			} else {
				myHandleDeal("group23���¹�����Կʧ��3" + j, res3);
			}
			Ddi.ddi_innerkey_update_mk((byte) 0x03, 0, innerkey4, 16);
			int res4 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 0, j, 1, ipIn, innerkey4, 16, ipOut, 16);
			if (res4 == 0) {
				myHandleDeal("���¹�����Կ�ɹ�", res4);
			} else {
				myHandleDeal("group23���¹�����Կʧ��4" + j, res4);
			}
			Ddi.ddi_innerkey_update_mk((byte) 0x04, 0, innerkey4, 16);
			int res5 = Ddi.ddi_innerkey_update_wk((byte) 0x04, 0, j, 1, ipIn, innerkey4, 16, ipOut, 16);
			if (res5 == 0) {
				myHandleDeal("���¹�����Կ�ɹ�", res5);
			} else {
				myHandleDeal("group23���¹�����Կʧ��5" + j, res5);
			}
			Ddi.ddi_innerkey_update_mk((byte) 0x05, 0, innerkey3, 24);
			int res6 = Ddi.ddi_innerkey_update_wk((byte) 0x05, 0, j, 1, ipIn, innerkey5, 32, ipOut, 32);
			if (res6 == 0) {
				myHandleDeal("���¹�����Կ�ɹ�", res6);
			} else {
				myHandleDeal("group23���¹�����Կʧ��6" + j, res6);
			}
			Ddi.ddi_innerkey_update_mk((byte) 0x06, 0, innerkey5, 32);
			int res7 = Ddi.ddi_innerkey_update_wk((byte) 0x06, 0, j, 1, ipIn, innerkey5, 32, ipOut, 32);
			if (res7 == 0) {
				myHandleDeal("���¹�����Կ�ɹ�", res7);
				
			} else {
				myHandleDeal("group23���¹�����Կʧ��7" + j, res7);
			}
		}
		for (int k = 0; k < 16; k++) {
			int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(4, k, puk, prk);
			if (res1 == 0) {
				myHandleDeal("����SM2��Կ�ɹ�", res1);
			} else {
				myHandleDeal("group23����SM2��Կʧ��4" + k, res1);
			}
			int res2 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, k, puk, prk);
			if (res2 == 0) {
				myHandleDeal("����SM2��Կ�ɹ�", res2);
			} else {
				myHandleDeal("group23����SM2��Կʧ��3" + k, res2);
			}
			int res3 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(0, k, puk, prk);
			if (res3 == 0) {
				myHandleDeal("����SM2��Կ�ɹ�", res3);
			} else {
				myHandleDeal("group23����SM2��Կʧ��0" + k, res3);
			}
			int res4 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(1, k, puk, prk);
			if (res4 == 0) {
				myHandleDeal("����SM2��Կ�ɹ�", res4);
			} else {
				myHandleDeal("group23����SM2��Կʧ��1" + k, res4);
			}
			int res5 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(2, k, puk, prk);
			if (res5 == -6) {
				myHandleDeal("����SM2��Կ�ɹ�", res5);
			} else {
				myHandleDeal("group23����SM2��Կʧ��2" + k, res5);
			}
		}

	}

	private void testgroup24() {
		myHandleDeal("testgroup24����", 0);
		String key1 = "12345678abcdEFBF";
		String data = "4fb631748a286e19";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] DataOut = new byte[8];
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_delete_key(0, 1);
		if (res0 == 0) {
			myHandleDeal("ɾ������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x00, 0, innerkey1, 8);
			if (res1 == 0) {
				myHandleDeal("��������Կ���Գɹ�", res1);
				int res2 = Ddi.ddi_innerkey_des_decrypt(0, 0, 1, 0, ipIn, innerkey1, 8, ipOut);
				if (res2 == 0) {
					myHandleDeal("����Կ���ܳɹ�", res2);
					int res3 = Ddi.ddi_innerkey_des_encrypt(0, 1, 0, ipIn, innerkey1, 8, DataOut);
					String data1 = ByteUtils.byteArray2HexString(DataOut);
					if (res3 == 0 && data1.equals(data)) {
						myHandleDeal("����Կ���ܳɹ�", res3);
					} else {
						myHandleDeal("group24����Կ����ʧ��", res3);
					}
				} else {
					myHandleDeal("group24����Կ����ʧ��", res2);
				}
			} else {
				myHandleDeal("group24��������Կ����ʧ��", res1);
			}
		} else {
			myHandleDeal("group24ɾ������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
	}
	
	

	private void testgroup25() {
		myHandleDeal("testgroup25����", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		String data = "f6c578676d4b1aa5d659a05a53eb7f4f";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] DataOut = new byte[16];
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_delete_key(0, 1);
		if (res0 == 0) {
			myHandleDeal("ɾ������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
			if (res1 == 0) {
				myHandleDeal("��������Կ���Գɹ�", res1);
				int res2 = Ddi.ddi_innerkey_des_decrypt(0, 0, 1, 0, ipIn, innerkey1, 16, ipOut);
				if (res2 == 0) {
					myHandleDeal("����Կ���ܳɹ�", res2);
					int res3 = Ddi.ddi_innerkey_des_encrypt(0, 1, 0, ipIn, innerkey1, 16, DataOut);
					String data1 = ByteUtils.byteArray2HexString(DataOut);
					if (res3 == 0 && data1.equals(data)) {
						myHandleDeal("����Կ���ܳɹ�", res3);
					} else {
						myHandleDeal("group25����Կ����ʧ��", res3);
					}
				} else {
					myHandleDeal("group25����Կ����ʧ��", res2);
				}
			} else {
				myHandleDeal("group25��������Կ����ʧ��", res1);
			}
		} else {
			myHandleDeal("group25ɾ������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup26() {
		myHandleDeal("testgroup26����", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF12345678abcdEFBF";
		String data = "c7f9bc762b357ffa01916de29c8193333de0a04ff317d291";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] DataOut = new byte[24];
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_delete_key(0, 1);
		if (res0 == 0) {
			myHandleDeal("ɾ������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 0, innerkey1, 24);
			if (res1 == 0) {
				myHandleDeal("��������Կ���Գɹ�", res1);
				int res2 = Ddi.ddi_innerkey_des_decrypt(0, 0, 1, 0, ipIn, innerkey1, 24, ipOut);
				if (res2 == 0) {
					myHandleDeal("����Կ���ܳɹ�", res2);
					int res3 = Ddi.ddi_innerkey_des_encrypt(0, 1, 0, ipIn, innerkey1, 24, DataOut);
					String data1 = ByteUtils.byteArray2HexString(DataOut);
					if (res3 == 0 && data1.equals(data)) {
						myHandleDeal("����Կ���ܳɹ�", res3);
					} else {
						myHandleDeal("group26����Կ����ʧ��", res3);
					}
				} else {
					myHandleDeal("group26����Կ����ʧ��", res2);
				}
			} else {
				myHandleDeal("group26��������Կ����ʧ��", res1);
			}
		} else {
			myHandleDeal("group26ɾ������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup27() {
		myHandleDeal("testgroup27����", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		String data1 = "6c8250ec502abeeb53436650887b7969";
		String data = "30303030abCDef9930303030abCDef99";
		byte[] ipIn = ByteUtils.hexString2ByteArray(data);
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] ipOut1 = new byte[16];
		byte[] ipOut2 = new byte[16];
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_delete_key(0, 0);
		if (res0 == 0) {
			myHandleDeal("ɾ������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 0, innerkey1, 16);
			if (res1 == 0) {
				myHandleDeal("��������Կ�ɹ�", res1);
				int res2 = Ddi.ddi_innerkey_nes_sm4_decrypt(0, 0, 1, (byte) 0x01, ipIn, msg_summery, 16, ipOut1, leOut);
				if (res2 == 0) {
					myHandleDeal("����Կ���ܳɹ�", res2);
					int res3 = Ddi.ddi_innerkey_nes_sm4_encrypt(0, 1, (byte) 0x01, ipIn, msg_summery, 16, ipOut2,
							leOut);
					String data2 = ByteUtils.byteArray2HexString(ipOut2);
					if (res3 == 0 && data2.equals(data1)) {
						myHandleDeal("����Կ���ܳɹ�", res3);
					} else {
						myHandleDeal("group27����Կ����ʧ��", res3);
					}
				} else {
					myHandleDeal("group27����Կ����ʧ��", res2);
				}
			} else {
				myHandleDeal("group27��������Կʧ��", res1);
			}
		} else {
			myHandleDeal("group27ɾ������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup28() {
		myHandleDeal("testgroup28����", 0);
		String key1 = "A12345678A12345678A12345678A1234";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String plain = "12345678abcdEFBFABCDefBCabcdEFBF";
		byte[] m_plain = ByteUtils.hexString2ByteArray(plain);
		byte[] cipher = new byte[16];
		byte[] cipher1 = new byte[16];
		String data = "ffed87779636b4674ea3e9339b7f488a";
		String data1 = "030161a242b0ee460d81bd9249cd763e";
		byte[] m_data = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x04, 0, innerkey1, 16);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_aes_encrypt(0, 0, (byte) 0, ipIn, m_plain, m_plain.length, cipher);
			String data2 = ByteUtils.byteArray2HexString(cipher);
			if (res1 == 0 && data2.equals(data)) {
				myHandleDeal("����Կ���ܳɹ�", res1);
			} else {
				myHandleDeal("group28����Կ����ʧ��", res1);
			}
		} else {
			myHandleDeal("group28��������Կʧ��", res0);
		}
		int res2 = Ddi.ddi_innerkey_delete_key(0, 1);
		if (res2 == 0) {
			myHandleDeal("ɾ������Կ�ɹ�", res2);
			int res3 = Ddi.ddi_innerkey_aes_decrypt(0, 0, 1, (byte) 0, ipIn, m_data, m_data.length, cipher);
			if (res3 == 0) {
				myHandleDeal("����Կ���ܳɹ�", res3);
				int res4 = Ddi.ddi_innerkey_aes_encrypt(0, 1, (byte) 0, ipIn, m_plain, m_plain.length, cipher1);
				String data3 = ByteUtils.byteArray2HexString(cipher1);
				if (res4 == 0 && data3.equals(data1)) {
					myHandleDeal("����Կ���ܳɹ�", res4);
				} else {
					myHandleDeal("group28����Կ����ʧ��", res4);
				}
			} else {
				myHandleDeal("group28����Կ����ʧ��", res3);
			}
		} else {
			myHandleDeal("group28ɾ������Կʧ��", res2);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup29() {
		myHandleDeal("testgroup29����", 0);
		String key1 = "A12345678A12345678A12345678A1234";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String plain = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] m_plain = ByteUtils.hexString2ByteArray(plain);
		byte[] cipher = new byte[16];
		String data = "3946152f13498dcdf145582843e7b891";
		// 3a51892bec9281fa2094d43cc4c24faa
		byte[] m_data = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x04, 0, innerkey1, 16);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_aes_encrypt(0, 0, (byte) 1, ipIn, m_plain, m_plain.length, cipher);
			String data2 = ByteUtils.byteArray2HexString(cipher);
//			Log.d("1111111111", data2);
			if (res1 == 0 && data2.equals(data)) {
				myHandleDeal("����Կ���ܳɹ�", res1);
			} else {
				myHandleDeal("group29����Կ����ʧ��", res1);
			}
		} else {
			myHandleDeal("group29��������Կʧ��", res0);
		}
		int res2 = Ddi.ddi_innerkey_aes_decrypt(0, 0, 1, (byte) 1, ipIn, m_data, m_data.length, cipher);
		if (res2 == 0) {
			myHandleDeal("����Կ���ܳɹ�", res2);
		} else {
			myHandleDeal("group29����Կ����ʧ��", res2);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup30() {
		myHandleDeal("testgroup30����", 0);
		String key1 = "A12345678A12345678A12345678A123422444AABCDEF2312";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String plain = "12345678abcdEFBFABCDefBCabcdEFBF";
		byte[] m_plain = ByteUtils.hexString2ByteArray(plain);
		byte[] cipher = new byte[16];
		String data = "24ac73a99d9068f08fc079d016b43c79";
		byte[] m_data = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x05, 77, innerkey1, 24);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_aes_encrypt(0, 77, (byte) 1, ipIn, m_plain, m_plain.length, cipher);
			String data2 = ByteUtils.byteArray2HexString(cipher);
			if (res1 == 0 && data2.equals(data)) {
				myHandleDeal("����Կ���ܳɹ�", res1);
			} else {
				myHandleDeal("group30����Կ����ʧ��", res1);
			}
		} else {
			myHandleDeal("group30��������Կʧ��", res0);
		}
		int res2 = Ddi.ddi_innerkey_aes_decrypt(0, 77, 1, (byte) 1, ipIn, m_data, m_data.length, cipher);
		if (res2 == 0) {
			myHandleDeal("����Կ���ܳɹ�", res2);
		} else {
			myHandleDeal("group30����Կ����ʧ��", res2);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup31() {
		myHandleDeal("testgroup31����", 0);
		String key1 = "A12345678A12345678A12345678A1234ABCDEF012345678ABDECF09876542344";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String plain = "12345678abcdEFBFABCDefBCabcdEFBF";
		byte[] m_plain = ByteUtils.hexString2ByteArray(plain);
		byte[] cipher = new byte[16];
		String data = "0de0f149f9232c62c47bef3a42a3589b";
		byte[] m_data = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x06, 149, innerkey1, 32);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_aes_encrypt(0, 149, (byte) 1, ipIn, m_plain, m_plain.length, cipher);
			String data2 = ByteUtils.byteArray2HexString(cipher);
			if (res1 == 0 && data2.equals(data)) {
				myHandleDeal("����Կ���ܳɹ�", res1);
			} else {
				myHandleDeal("group31����Կ����ʧ��", res1);
			}
		} else {
			myHandleDeal("group31��������Կʧ��", res0);
		}
		int res2 = Ddi.ddi_innerkey_aes_decrypt(0, 0, 1, (byte) 1, ipIn, m_data, m_data.length, cipher);
		if (res2 == 0) {
			myHandleDeal("����Կ���ܳɹ�", res2);
		} else {
			myHandleDeal("group31����Կ����ʧ��", res2);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup32() {
		myHandleDeal("testgroup32����", 0);
		String key1 = "A12345678A12345678A12345678A1234ABCDEF012345678ABDECF09876542344";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "A12345678A12345678A12345678A1234ABCDEF012345678ABDECF09876542344";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		String plain = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] m_plain = ByteUtils.hexString2ByteArray(plain);
		byte[] cipher = new byte[16];
		byte[] cipher1 = new byte[16];
		String data = "51fb0c0a668d60a8f774c9f422e37ccb";
		byte[] m_data = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x06, 0, innerkey1, 32);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x06, 0, 0, 1, ipIn, innerkey2, 32, innerkey1, 32);
			if (res1 == 0) {
				myHandleDeal("���¹�����Կ���ܳɹ�", res1);
				int res2 = Ddi.ddi_innerkey_aes_encrypt(1, 0, (byte) 1, ipIn, m_plain, m_plain.length, cipher);
				String data1 = ByteUtils.byteArray2HexString(cipher);
				if (res2 == 0 && data1.equals(data)) {
					myHandleDeal("������Կ���ܳɹ�", res2);
					int res3 = Ddi.ddi_innerkey_aes_decrypt(1, 0, 1, (byte) 1, ipIn, m_data, m_data.length, cipher1);
					String data2 = ByteUtils.byteArray2HexString(cipher1);
					if (res3 == 0 && data2.equals(plain)) {
						myHandleDeal("������Կ���ܳɹ�", res3);
					} else {
						myHandleDeal("group32������Կ����ʧ��", res3);
					}
				} else {
					myHandleDeal("group32������Կ����ʧ��", res2);
				}
			} else {
				myHandleDeal("group32���¹�����Կʧ��", res1);
			}
		} else {
			myHandleDeal("group32��������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup33() {
		myHandleDeal("testgroup33����", 0);
		String key1 = "A12345678A12345678A12345678A1234ABCDEF012345678ABDECF09876542344";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "A12345678A12345678A12345678A1234ABCDEF012345678ABDECF09876542344";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		String plain = "12345678abcdefbfabcdefbcabcdefbffbefdcbafbefdcba3a09f46b6cd0bc1c";
		byte[] m_plain = ByteUtils.hexString2ByteArray(plain);
		byte[] cipher = new byte[32];
		byte[] cipher1 = new byte[32];
		String data = "956f4bbb54d1cc4985d15af59f225382e368968b4ea6c1614ee532056959f2e7";
		byte[] m_data = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x06, 77, innerkey1, 32);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x06, 77, 225, 0, ipIn, innerkey2, 32, innerkey1, 32);
			if (res1 == 0) {
				myHandleDeal("���¹�����Կ���ܳɹ�", res1);
				int res2 = Ddi.ddi_innerkey_aes_encrypt(1, 225, (byte) 0, ipIn, m_plain, m_plain.length, cipher);
				String data1 = ByteUtils.byteArray2HexString(cipher);
				if (res2 == 0 && data1.equals(data)) {
					myHandleDeal("������Կ���ܳɹ�", res2);
					int res3 = Ddi.ddi_innerkey_aes_decrypt(1, 225, 1, (byte) 0, ipIn, m_data, m_data.length, cipher1);
					String data2 = ByteUtils.byteArray2HexString(cipher1);
					if (res3 == 0 && data2.equals(plain)) {
						myHandleDeal("������Կ���ܳɹ�", res3);
					} else {
						myHandleDeal("group33������Կ����ʧ��", res3);
					}
				} else {
					myHandleDeal("group33������Կ����ʧ��", res2);
				}
			} else {
				myHandleDeal("group33���¹�����Կʧ��", res1);
			}
		} else {
			myHandleDeal("group33��������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup34() {
		myHandleDeal("testgroup34����", 0);
		String key1 = "A12345678A12345678A12345678A1234ABCDEF012345678ABDECF09876542344";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "A12345678A12345678A12345678A1234ABCDEF012345678ABDECF09876542344";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		String plain = "12345678abcdefbfabcdefbcabcdefbffbefdcbafbefdcba3a09f46b6cd0bc1c";
		byte[] m_plain = ByteUtils.hexString2ByteArray(plain);
		byte[] cipher = new byte[32];
		byte[] cipher1 = new byte[32];
		String data = "956f4bbb54d1cc4985d15af59f225382e368968b4ea6c1614ee532056959f2e7";
		byte[] m_data = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x06, 77, innerkey1, 32);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x06, 77, 225, 0, ipIn, innerkey2, 32, innerkey1, 32);
			if (res1 == 0) {
				myHandleDeal("���¹�����Կ���ܳɹ�", res1);
				int res2 = Ddi.ddi_innerkey_aes_encrypt(1, 225, (byte) 0, ipIn, m_plain, m_plain.length, cipher);
				String data1 = ByteUtils.byteArray2HexString(cipher);
				if (res2 == 0 && data1.equals(data)) {
					myHandleDeal("������Կ���ܳɹ�", res2);
					int res3 = Ddi.ddi_innerkey_aes_decrypt(1, 225, 1, (byte) 0, ipIn, m_data, m_data.length, cipher1);
					String data2 = ByteUtils.byteArray2HexString(cipher1);
					if (res3 == 0 && data2.equals(plain)) {
						myHandleDeal("������Կ���ܳɹ�", res3);
					} else {
						myHandleDeal("group34������Կ����ʧ��", res3);
					}
				} else {
					myHandleDeal("group34������Կ����ʧ��", res2);
				}
			} else {
				myHandleDeal("group34���¹�����Կʧ��", res1);
			}
		} else {
			myHandleDeal("group34��������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup35() {
		myHandleDeal("testgroup35����", 0);
		String key1 = "A12345678A12345678A12345678A1234ABCDEF012345678ABDECF09876542344";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "A12345678A12345678A12345678A1234ABCDEF012345678ABDECF09876542344";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		String plain = "12345678abcdefbfabcdefbcabcdefbf846f13c5c8ba472a11dd0f9115ec645aabcdefbcabcdefbf846f13c5c8ba472a";
		byte[] m_plain = ByteUtils.hexString2ByteArray(plain);
		byte[] cipher = new byte[48];
		byte[] cipher1 = new byte[48];
		String data = "d93a2663903de0e2995b0b7fc004900a9119dc5879d9ae3d92eed5840fd224c0a0175e78af3bff5dbf0c7acbd5e28381";
		byte[] m_data = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x06, 149, innerkey1, 32);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x06, 149, 449, 1, ipIn, innerkey2, 32, innerkey1, 32);
			if (res1 == 0) {
				myHandleDeal("���¹�����Կ���ܳɹ�", res1);
				int res2 = Ddi.ddi_innerkey_aes_encrypt(1, 449, (byte) 0, ipIn, m_plain, m_plain.length, cipher);
				String data1 = ByteUtils.byteArray2HexString(cipher);
				if (res2 == 0 && data1.equals(data)) {
					myHandleDeal("������Կ���ܳɹ�", res2);
					int res3 = Ddi.ddi_innerkey_aes_decrypt(1, 449, 1, (byte) 0, ipIn, m_data, m_data.length, cipher1);
					String data2 = ByteUtils.byteArray2HexString(cipher1);
					if (res3 == 0 && data2.equals(plain)) {
						myHandleDeal("������Կ���ܳɹ�", res3);
					} else {
						myHandleDeal("group35������Կ����ʧ��", res3);
					}
				} else {
					myHandleDeal("group35������Կ����ʧ��", res2);
				}
			} else {
				myHandleDeal("group35���¹�����Կʧ��", res1);
			}
		} else {
			myHandleDeal("group35��������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup36() {
		myHandleDeal("testgroup36����", 0);
		String key1 = "A12345678A12345678A12345678A1234ABCDEF012345678A";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
//		String key1 = "A12345678A12345678A12345678A1234ABCDEF012345678ABDECF09876542344";
//		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "A12345678A12345678A12345678A1234ABCDEF012345678ABDECF09876542344";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		String plain = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] m_plain = ByteUtils.hexString2ByteArray(plain);
		byte[] cipher = new byte[16];
//		byte[] cipher1 = new byte[32];
		String data = "B33DB9DDB428E937DF406A268D3C9398";
		String data6 = "22046648000000260A17CA4D4FDC111A";
		byte[] m_data = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x05, 0, innerkey1, 24);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x05, 0, 0, 0, ipIn, innerkey2, 32, innerkey2, 32);
			// ������Կ���ģ�E4D9646EB1EECBC9D2693E1F58B464729793FD1A822B07C7F27A37FEA444497B
			if (res1 == 0) {
				myHandleDeal("���¹�����Կ���ܳɹ�", res1);
				int res2 = Ddi.ddi_innerkey_aes_encrypt(1, 0, (byte) 0, ipIn, m_plain, m_plain.length, cipher);

				String data1 = ByteUtils.byteArray2HexString(cipher);
				if (res2 == 0 && data1.equalsIgnoreCase(data)) {
					myHandleDeal("������Կ���ܳɹ�", res2);
					int res3 = Ddi.ddi_innerkey_aes_decrypt(1, 0, 1, (byte) 1, ipIn, m_data, m_data.length, cipher);
					String data2 = ByteUtils.byteArray2HexString(cipher);
					if (res3 == 0 && data2.equalsIgnoreCase(data6)) {
						myHandleDeal("������Կ���ܳɹ�", res3);
					} else {
						myHandleDeal("group36������Կ����ʧ��" + data6, res3);
					}
				} else {
					myHandleDeal("group36������Կ����ʧ��" + data1, res2);
				}
			} else {
				myHandleDeal("group36���¹�����Կʧ��", res1);
			}
		} else {
			myHandleDeal("group36��������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup37() {
		myHandleDeal("testgroup37����", 0);
		String key1 = "A12345678A12345678A12345678A1234ABCDEF012345678A";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "A12345678A12345678A12345678A1234ABCDEF012345678ABDECF09876542344";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		String plain = "12345678abcdefbfabcdefbcabcdefbffbefdcbafbefdcba3a09f46b6cd0bc1c";
		byte[] m_plain = ByteUtils.hexString2ByteArray(plain);
		byte[] cipher = new byte[32];
		byte[] cipher1 = new byte[32];
		String data = "B33DB9DDB428E937DF406A268D3C9398D69A832AA7D2E0E7082E47C10E9CD994";
		byte[] m_data = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x05, 77, innerkey1, 24);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x05, 77, 225, 0, ipIn, innerkey2, 32, innerkey2, 32);
			// ������Կ���ģ�E4D9646EB1EECBC9D2693E1F58B464729793FD1A822B07C7 F27A37FEA444497B
			if (res1 == 0) {
				myHandleDeal("���¹�����Կ���ܳɹ�", res1);
				int res2 = Ddi.ddi_innerkey_aes_encrypt(1, 225, (byte) 0, ipIn, m_plain, m_plain.length, cipher);
				String data1 = ByteUtils.byteArray2HexString(cipher);
				if (res2 == 0 && data1.equalsIgnoreCase(data)) {
					myHandleDeal("������Կ���ܳɹ�", res2);
					int res3 = Ddi.ddi_innerkey_aes_decrypt(1, 225, 1, (byte) 0, ipIn, m_data, m_data.length, cipher1);
					String data2 = ByteUtils.byteArray2HexString(cipher1);
					if (res3 == 0 && data2.equals(plain)) {
						myHandleDeal("������Կ���ܳɹ�", res3);
					} else {
						myHandleDeal("group37������Կ����ʧ��", res3);
					}
				} else {
					myHandleDeal("group37������Կ����ʧ��" + data1, res2);
				}
			} else {
				myHandleDeal("group37���¹�����Կʧ��", res1);
			}
		} else {
			myHandleDeal("group37��������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup38() {
		myHandleDeal("testgroup38����", 0);
		String key1 = "A12345678A12345678A12345678A1234ABCDEF012345678A";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "A12345678A12345678A12345678A1234ABCDEF012345678ABDECF09876542344";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		String plain = "12345678abcdefbfabcdefbcabcdefbf846f13c5c8ba472a11dd0f9115ec645aabcdefbcabcdefbf846f13c5c8ba472a";
		byte[] m_plain = ByteUtils.hexString2ByteArray(plain);
		byte[] cipher = new byte[48];
		byte[] cipher1 = new byte[48];
		String data = "676E367AED07DFB334188F8738D9DD3A1C51A1BE7354E02A6F86DCB9CF0939D71AD01363442C21DE622D804D0A24F571";
		byte[] m_data = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x05, 149, innerkey1, 24);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x05, 149, 449, 1, ipIn, innerkey2, 32, innerkey2, 32);
			// ������Կ���ģ�D4E9545E1A23245073B31BEEBCA59AD736B0B87D08393391
			if (res1 == 0) {
				myHandleDeal("���¹�����Կ���ܳɹ�", res1);
				int res2 = Ddi.ddi_innerkey_aes_encrypt(1, 449, (byte) 1, ipIn, m_plain, m_plain.length, cipher);
				String data1 = ByteUtils.byteArray2HexString(cipher);
				if (res2 == 0 && data1.equalsIgnoreCase(data)) {
					myHandleDeal("������Կ���ܳɹ�", res2);
					int res3 = Ddi.ddi_innerkey_aes_decrypt(1, 449, 1, (byte) 1, ipIn, m_data, m_data.length, cipher1);
					String data2 = ByteUtils.byteArray2HexString(cipher1);
					if (res3 == 0 && data2.equals(plain)) {
						myHandleDeal("������Կ���ܳɹ�", res3);
					} else {
						myHandleDeal("group38������Կ����ʧ��", res3);
					}
				} else {
					myHandleDeal("group38������Կ����ʧ��" + data1, res2);
				}
			} else {
				myHandleDeal("group38���¹�����Կʧ��", res1);
			}
		} else {
			myHandleDeal("group38��������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup39() {
		myHandleDeal("testgroup39����", 0);
		String key1 = "A12345678A12345678A12345678A1234";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "A12345678A12345678A12345678A1234";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		String plain = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] m_plain = ByteUtils.hexString2ByteArray(plain);
		byte[] cipher = new byte[16];
		byte[] cipher1 = new byte[16];
		String data = "69cf80cf897b74c59db4ebffd9ee2d02";
		byte[] m_data = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x04, 0, innerkey1, 16);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x04, 0, 0, 1, ipIn, innerkey2, 16, innerkey2, 16);
			if (res1 == 0) {
				myHandleDeal("���¹�����Կ���ܳɹ�", res1);
				int res2 = Ddi.ddi_innerkey_aes_encrypt(1, 0, (byte) 1, ipIn, m_plain, m_plain.length, cipher);
				String data1 = ByteUtils.byteArray2HexString(cipher);
				if (res2 == 0 && data1.equals(data)) {
					myHandleDeal("������Կ���ܳɹ�", res2);
					int res3 = Ddi.ddi_innerkey_aes_decrypt(1, 0, 1, (byte) 1, ipIn, m_data, m_data.length, cipher1);
					String data2 = ByteUtils.byteArray2HexString(cipher1);
					if (res3 == 0 && data2.equals(plain)) {
						myHandleDeal("������Կ���ܳɹ�", res3);
					} else {
						myHandleDeal("group39������Կ����ʧ��", res3);
					}
				} else {
					myHandleDeal("group39������Կ����ʧ��", res2);
				}
			} else {
				myHandleDeal("group39���¹�����Կʧ��", res1);
			}
		} else {
			myHandleDeal("group39��������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup40() {
		myHandleDeal("testgroup40����", 0);
		String key1 = "A12345678A12345678A12345678A1234";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "A12345678A12345678A12345678A1234";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		String plain = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] m_plain = ByteUtils.hexString2ByteArray(plain);
		byte[] cipher = new byte[16];
		byte[] cipher1 = new byte[16];
		String data = "4c009f51bd7274ca038c4aac95ab7e98";
		byte[] m_data = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x04, 77, innerkey1, 16);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x04, 77, 225, 1, ipIn, innerkey2, 16, innerkey1, 16);
			if (res1 == 0) {
				myHandleDeal("���¹�����Կ���ܳɹ�", res1);
				int res2 = Ddi.ddi_innerkey_aes_encrypt(1, 225, (byte) 0, ipIn, m_plain, m_plain.length, cipher);
				String data1 = ByteUtils.byteArray2HexString(cipher);
				if (res2 == 0 && data1.equals(data)) {
					myHandleDeal("������Կ���ܳɹ�", res2);
					int res3 = Ddi.ddi_innerkey_aes_decrypt(1, 225, 1, (byte) 0, ipIn, m_data, m_data.length, cipher1);
					String data2 = ByteUtils.byteArray2HexString(cipher1);
					if (res3 == 0 && data2.equals(plain)) {
						myHandleDeal("������Կ���ܳɹ�", res3);
					} else {
						myHandleDeal("group40������Կ����ʧ��", res3);
					}
				} else {
					myHandleDeal("group40������Կ����ʧ��", res2);
				}
			} else {
				myHandleDeal("group40���¹�����Կʧ��", res1);
			}
		} else {
			myHandleDeal("group40��������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup41() {
		myHandleDeal("testgroup41����", 0);
		String key1 = "A12345678A12345678A12345678A1234";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "A12345678A12345678A12345678A1234";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		String plain = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] m_plain = ByteUtils.hexString2ByteArray(plain);
		byte[] cipher = new byte[16];
		byte[] cipher1 = new byte[16];
		String data = "69cf80cf897b74c59db4ebffd9ee2d02";
		byte[] m_data = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x04, 149, innerkey1, 16);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x04, 149, 449, 1, ipIn, innerkey2, 16, innerkey1, 16);
			if (res1 == 0) {
				myHandleDeal("���¹�����Կ���ܳɹ�", res1);
				int res2 = Ddi.ddi_innerkey_aes_encrypt(1, 449, (byte) 1, ipIn, m_plain, m_plain.length, cipher);
				String data1 = ByteUtils.byteArray2HexString(cipher);
				if (res2 == 0 && data1.equals(data)) {
					myHandleDeal("������Կ���ܳɹ�", res2);
					int res3 = Ddi.ddi_innerkey_aes_decrypt(1, 449, 1, (byte) 1, ipIn, m_data, m_data.length, cipher1);
					String data2 = ByteUtils.byteArray2HexString(cipher1);
					if (res3 == 0 && data2.equals(plain)) {
						myHandleDeal("������Կ���ܳɹ�", res3);
					} else {
						myHandleDeal("group41������Կ����ʧ��", res3);
					}
				} else {
					myHandleDeal("group41������Կ����ʧ��", res2);
				}
			} else {
				myHandleDeal("group41���¹�����Կʧ��", res1);
			}
		} else {
			myHandleDeal("group41��������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup42() {
		myHandleDeal("testgroup42����", 0);
		String plain = "12345678abcdEFBFABCDefBCabcdEFBF";
		byte[] m_plain = ByteUtils.hexString2ByteArray(plain);
		byte[] cipher = new byte[16];
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_delete_key(0, 2);
		if (res0 == 0) {
			myHandleDeal("ɾ������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_aes_encrypt(0, 2, (byte) 1, ipIn, m_plain, m_plain.length, cipher);
			if (res1 == -6) {
				myHandleDeal("����Կ���ܲ��Գɹ�", res1);
			} else {
				myHandleDeal("group42����Կ���ܲ���ʧ��", res1);
			}
			int res2 = Ddi.ddi_innerkey_aes_decrypt(0, 2, 1, (byte) 1, ipIn, m_plain, m_plain.length, cipher);
			if (res2 == -6) {
				myHandleDeal("����Կ���ܲ��Գɹ�", res2);
			} else {
				myHandleDeal("group42����Կ���ܲ���ʧ��", res2);
			}
		} else {
			myHandleDeal("group42ɾ������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup43() {
		myHandleDeal("testgroup43����", 0);
		String plain = "12345678abcdEFBFABCDefBCabcdEFBF";
		byte[] m_plain = ByteUtils.hexString2ByteArray(plain);
		byte[] cipher = new byte[16];
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_delete_key(1, 3);
		if (res0 == 0) {
			myHandleDeal("ɾ��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_aes_encrypt(1, 3, (byte) 1, ipIn, m_plain, m_plain.length, cipher);
			if (res1 == -6) {
				myHandleDeal("������Կ���ܲ��Գɹ�", res1);
			} else {
				myHandleDeal("group43������Կ���ܲ���ʧ��", res1);
			}
			int res2 = Ddi.ddi_innerkey_aes_decrypt(1, 3, 1, (byte) 1, ipIn, m_plain, m_plain.length, cipher);
			if (res2 == -6) {
				myHandleDeal("������Կ���ܲ��Գɹ�", res2);
			} else {
				myHandleDeal("group43������Կ���ܲ���ʧ��", res2);
			}
		} else {
			myHandleDeal("group43ɾ��������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup44() {
		myHandleDeal("testgroup44����", 0);
		String plain = "12345678abcdEFBFABCDefBCabcdEFBF";
		byte[] m_plain = ByteUtils.hexString2ByteArray(plain);
		byte[] cipher = new byte[16];
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_aes_encrypt(1, 450, (byte) 1, ipIn, m_plain, m_plain.length, cipher);
		if (res0 == -6) {
			myHandleDeal("����Խ�޲��Գɹ�", res0);
		} else {
			myHandleDeal("group44����Խ�޲���ʧ��", res0);
		}
		int res1 = Ddi.ddi_innerkey_aes_decrypt(1, 450, 1, (byte) 1, ipIn, m_plain, m_plain.length, cipher);
		if (res1 == -6) {
			myHandleDeal("����Խ�޲��Գɹ�", res1);
		} else {
			myHandleDeal("group44����Խ�޲���ʧ��", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	// DES CBC encrypt test
	private void testgroup45() {
		myHandleDeal("testgroup45����", 0);
		String key1 = "3131313131313131";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "53E5A6F058D8AB2DAC1ABB37C4D2F710";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		String key3 = "3232323232323232";
		String key4 = "273CED780C27ADC2F653F87554E69E3A";
		byte[] innerkey3 = ByteUtils.hexString2ByteArray(key3);
		byte[] DataOut = new byte[16];
		byte[] DataOut1 = new byte[16];
		Ddi.ddi_innerkey_open();
		int res0 = -99;
		res0 = Ddi.ddi_innerkey_update_mk((byte) 0x00, 149, innerkey1, 8);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_des_encrypt(0, 149, 1, ipIn, msg_summery, 16, DataOut);
			String byteArray2HexString = ByteUtils.byteArray2HexString(DataOut);
			if (res1 == 0 && byteArray2HexString.equalsIgnoreCase(key2)) {
				myHandleDeal("DESCBC����Կ������ȷ", res1);
				int res3 = Ddi.ddi_innerkey_update_wk((byte) 0x00, 149, 0, 1, ipIn, innerkey3, 8, ipOut, 8);
				int res4 = Ddi.ddi_innerkey_des_encrypt(1, 0, 1, ipIn, msg_summery, 16, DataOut);
				String byteArray2HexString1 = ByteUtils.byteArray2HexString(DataOut);
				if (res3 + res4 == 0 && byteArray2HexString1.equalsIgnoreCase(key4)) {
					myHandleDeal("DESCBC������Կ���ܳɹ�", res4);
				} else {
					myHandleDeal("DESCBC������Կ����ʧ��", res4);
				}

			} else {
				myHandleDeal("DESCBC����Կ����ʧ��" + byteArray2HexString, res1);
			}
		} else {
			myHandleDeal("group1��������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup46() {
		myHandleDeal("testgroup46����", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "B589ACBB1125FAD7D75976E744195BAC";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		byte[] DataOut = new byte[16];
		Ddi.ddi_innerkey_open();
		int res0 = -99;
		res0 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 149, innerkey1, 16);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_des_encrypt(0, 149, 1, ipIn, msg_summery, 16, DataOut);
			String byteArray2HexString = ByteUtils.byteArray2HexString(DataOut);
			if (res1 == 0 && byteArray2HexString.equalsIgnoreCase(key2)) {
				myHandleDeal("DESCBC������ȷ", res1);

			} else {
				myHandleDeal("DESCBC����ʧ��" + byteArray2HexString, res1);
			}
		} else {
			myHandleDeal("group1��������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup47() {
		myHandleDeal("testgroup47����", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF78abcdEFBFABCDef";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "23EB67FAD71574F7B2B9BDB9AC67E5FD";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		byte[] DataOut = new byte[16];
		Ddi.ddi_innerkey_open();
		int res0 = -99;
		res0 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 149, innerkey1, 24);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_des_encrypt(0, 149, 1, ipIn, msg_summery, 16, DataOut);
			String byteArray2HexString = ByteUtils.byteArray2HexString(DataOut);
			if (res1 == 0 && byteArray2HexString.equalsIgnoreCase(key2)) {
				myHandleDeal("DESCBC������ȷ", res1);

			} else {
				myHandleDeal("DESCBC����ʧ��" + byteArray2HexString, res1);
			}
		} else {
			myHandleDeal("group1��������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup48() {
		myHandleDeal("testgroup13����", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF9999efBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF9999efBCabcdEFBF";
		String key3 = "81931E1AB3D3A7D19EAFF08B4EF9DDB8";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		byte[] DataOut = new byte[16];
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 149, innerkey1, 24);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 149, 0, 1, ipIn, innerkey2, 24, ipOut, 24);
			if (res1 == 0) {
				myHandleDeal("���¹�����Կ���Գɹ�", res1);
				int res2 = Ddi.ddi_innerkey_des_encrypt(1, 0, 1, ipIn, msg_summery, 16, DataOut);
				String byteArray2HexString = ByteUtils.byteArray2HexString(DataOut);
				if (res2 == 0 && byteArray2HexString.equalsIgnoreCase(key3)) {
					myHandleDeal("group48���¹�����Կ���Գɹ�", res2);
				} else {
					myHandleDeal("group48���¹�����Կʧ��", res2);
				}
			} else {
				myHandleDeal("group48���¹�����Կ����ʧ��", res1);
			}
		} else {
			myHandleDeal("group48��������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup49() {
		myHandleDeal("testgroup49����", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF9999efBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF9999efBCabcdEFBF";
		String key3 = "81931E1AB3D3A7D19EAFF08B4EF9DD";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		String key4 = "81931E1AB3D3A7D19EAFF08B4EF9DD12135656";
		byte[] innerkey4 = ByteUtils.hexString2ByteArray(key4);
		byte[] innerkey3 = ByteUtils.hexString2ByteArray(key3);
		byte[] DataOut = new byte[16];
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 149, innerkey1, 24);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 149, 0, 1, ipIn, innerkey2, 24, ipOut, 24);
			int res5 = Ddi.ddi_innerkey_des_encrypt(0, 149, 1, ipIn, innerkey3, 16, DataOut);
			int res6 = Ddi.ddi_innerkey_des_encrypt(0, 149, 1, ipIn, innerkey4, 16, DataOut);
			if (res1 == 0) {
				myHandleDeal("���¹�����Կ���Գɹ�" + res5 + res6, res1);
				int res2 = Ddi.ddi_innerkey_des_encrypt(1, 0, 1, ipIn, innerkey3, 16, DataOut);
				int res3 = Ddi.ddi_innerkey_des_encrypt(1, 0, 1, ipIn, innerkey4, 19, DataOut);
				if (res2 == -12 && res3 == -6) {
					myHandleDeal("group49���¹�����Կ���Գɹ�", res2);
				} else {
					myHandleDeal("group49���¹�����Կʧ��" + res3, res2);
				}
			} else {
				myHandleDeal("group49���¹�����Կ����ʧ��", res1);
			}
		} else {
			myHandleDeal("group49��������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup50() {
		myHandleDeal("testgroup13����", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF9999efBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF9999efBCabcdEFBF";
		String key3 = "81931E1AB3D3A7D19EAFF08B4EF9DDB8";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		byte[] DataOut = new byte[16];
		byte[] DataOut1 = null;
		String iNPString = "12345678912345678912345678912222";
		byte[] in = ByteUtils.hexString2ByteArray(iNPString);
		String iNPString1 = "ABCDABCDEFABCDABCDEFABCDABCDEFDD";
		byte[] in1 = ByteUtils.hexString2ByteArray(iNPString);
		String iNPString2 = "ABCDABCDEFABCD";
		byte[] in2 = ByteUtils.hexString2ByteArray(iNPString);

		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 149, innerkey1, 24);
		if (res0 == 0) {
			myHandleDeal("��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 149, 0, 1, ipIn, innerkey2, 24, ipOut, 24);
			if (res1 == 0) {
				myHandleDeal("���¹�����Կ���Գɹ�", res1);
				int res2 = Ddi.ddi_innerkey_des_encrypt(1, 0, 1, DataOut1, msg_summery, 16, DataOut);
				String byteArray2HexString1 = ByteUtils.byteArray2HexString(DataOut);
				// IV����8�ֽ� ȫ����
				int res3 = Ddi.ddi_innerkey_des_encrypt(1, 0, 1, in, msg_summery, 16, DataOut);
				//// IV����8�ֽ� ȫ��ĸ
				int res4 = Ddi.ddi_innerkey_des_encrypt(1, 0, 1, in1, msg_summery, 16, DataOut);
				// IVС����8�ֽ� ȫ��ĸ
				int res5 = Ddi.ddi_innerkey_des_encrypt(1, 0, 1, in2, msg_summery, 16, DataOut);
				String byteArray2HexString2 = ByteUtils.byteArray2HexString(DataOut);
				String byteArray2HexString = ByteUtils.byteArray2HexString(DataOut);
				if (res2 == 0 && res3 == 0 && res4 == 0 && res5 == 0) {
					myHandleDeal("group50���¹�����Կ���Գɹ�", res2);
				} else {
					myHandleDeal("group50���¹�����Կʧ��" + res2 + res3 + res4 + res5 + byteArray2HexString2 + "==="
							+ byteArray2HexString1, res2);
				}
			} else {
				myHandleDeal("group50���¹�����Կ����ʧ��", res1);
			}
		} else {
			myHandleDeal("group50��������Կʧ��", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	// ��ȡ������Կ�汾
	private void testgroup85() {
		myHandleDeal("testgroup85��", 0);

		String key1 = "563230313731323132303031";
		byte[] innerkey1 = new byte[12];
//		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF9999efBCabcdEFBF";
//		String key3 = "81931E1AB3D3A7D19EAFF08B4EF9DDB8";
//		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);

//		byte[] DataOut = new byte[16];
		int res1 = Ddi.ddi_innerkey_open();
		if (res1 == 0) {
			myHandleDeal("group85�򿪽ӿڳɹ�", res1);
		}
		int res0 = Ddi.ddi_innerkey_ioctl_getVer(innerkey1);
		String byteArray2HexString = ByteUtils.byteArray2HexString(innerkey1);
//		Log.v("1111", byteArray2HexString);
		if (res0 == 0 && byteArray2HexString.equalsIgnoreCase(key1)) {
			myHandleDeal("group85��ȡ������Կ�汾�ɹ�", res0);
		} else {
			myHandleDeal("group85��ȡ������Կ�汾ʧ��" + byteArray2HexString, res0);
		}

	}

	// ��ȡ������Կ�汾
	private void testgroup86() {
		myHandleDeal("testgroup86����", 0);
		String key1 = "5639384452303430313830383232303032";
		byte[] innerkey1 = new byte[17];
//		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF9999efBCabcdEFBF";
//		String key3 = "81931E1AB3D3A7D19EAFF08B4EF9DDB8";
//		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
//		byte[] DataOut = new byte[16];
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_iccpsam_ioctl_getVer(innerkey1);
		String byteArray2HexString = ByteUtils.byteArray2HexString(innerkey1);
		if (res0 == 0 && byteArray2HexString.equalsIgnoreCase(key1)) {
			myHandleDeal("group86��ȡ������Կ�汾�ɹ�", res0);
//			Log.v("1111", byteArray2HexString);

		} else {
			myHandleDeal("group86��ȡ������Կ�汾ʧ��" + byteArray2HexString, res0);
		}
		Ddi.ddi_innerkey_close();
	}

	// û�򿪽ӿڽ��в��� ��ȡ�汾��Ϣ
	private void testgroup87() {
		myHandleDeal("testgroup87��", 0);
		Ddi.ddi_innerkey_open();

		String key1 = "5632303137313231323030310000000000";
		byte[] innerkey1 = new byte[17];
//		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF9999efBCabcdEFBF";
//		String key3 = "81931E1AB3D3A7D19EAFF08B4EF9DDB8";
//		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);

//		byte[] DataOut = new byte[16];

		int res0 = Ddi.ddi_innerkey_ioctl_getVer(innerkey1);
		String byteArray2HexString = ByteUtils.byteArray2HexString(innerkey1);
//		Log.v("111111", byteArray2HexString);
		if (res0 == 0 && byteArray2HexString.equalsIgnoreCase(key1)) {
			myHandleDeal("group87��ȡ������Կ�汾�ɹ�", res0);
		} else {
			myHandleDeal("group87��ȡ������Կ�汾ʧ��" + byteArray2HexString, res0);
		}
		Ddi.ddi_innerkey_close();

	}

	// �ӿ�δ�� �����Կ����Կ�Ƿ����
	private void testgroup88() {
		myHandleDeal("testgroup88����", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		Ddi.ddi_innerkey_open();
		int res9 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
		int res10 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 149, innerkey1, 16);
		int res8 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 0, 0, ipIn, innerkey1, 16, ipOut, 16);
		int res7 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 149, 449, 0, ipIn, innerkey1, 16, ipOut, 16);
		int res0 = Ddi.ddi_innerkey_ioctl_key_check(0, 0);
		int res2 = Ddi.ddi_innerkey_ioctl_key_check(0, 149);
		if (res0 == 0 && res2 == 0) {
			myHandleDeal("����Կ���ɹ�88", res0);
			int res1 = Ddi.ddi_innerkey_ioctl_key_check(1, 0);
			int res4 = Ddi.ddi_innerkey_ioctl_key_check(1, 449);
			if (res1 == 0 && res4 == 0) {
				myHandleDeal("���¹�����Կ���Գɹ�88", res1);
			} else {
				myHandleDeal("group48���¹�����Կ����ʧ��88", res1);
			}
		} else {
			myHandleDeal("����Կ���ʧ��88", res0);
		}
		Ddi.ddi_innerkey_close();

	}

	// �����Կ�洢����������
	private void testgroup89() {
		myHandleDeal("testgroup89����", 0);

		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
//		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF9999efBCabcdEFBF";
//		String key3 = "81931E1AB3D3A7D19EAFF08B4EF9DDB8";
//		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
//		byte[] DataOut = new byte[16];

		Ddi.ddi_innerkey_open();
		int res9 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
		int res10 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 149, innerkey1, 16);
		int res8 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 0, 0, ipIn, innerkey1, 16, ipOut, 16);
		int res7 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 149, 449, 0, ipIn, innerkey1, 16, ipOut, 16);
		if (res9 == 0 && res10 == 0) {
			myHandleDeal("group89��������Կ�ɹ�89" + res10, res9);
		} else {
			myHandleDeal("group89��������Կ���ʧ��89" + res10, res9);

		}
		int res0 = Ddi.ddi_innerkey_ioctl_key_check(0, -1);
		int res2 = Ddi.ddi_innerkey_ioctl_key_check(0, 150);
		if (res0 == -1 && res2 == -1) {
			myHandleDeal("group89����Կ���ɹ�89", res0);
			int res1 = Ddi.ddi_innerkey_ioctl_key_check(1, -1);
			int res4 = Ddi.ddi_innerkey_ioctl_key_check(1, 450);
			if (res1 == -1 && res4 == -1) {
				myHandleDeal("group89���¹�����Կ���Գɹ�89" + res4, res1);
			} else {
				myHandleDeal("group89���¹�����Կ����ʧ��89" + res4, res1);
			}
		} else {
			myHandleDeal("group89����Կ���ʧ��89" + res2, res0);
		}
		Ddi.ddi_innerkey_close();
	}

	// �������Կ�͹�����Կ�����������С������Կ�Ƿ����
	private void testgroup113() {
		myHandleDeal("testgroup113����", 0);

		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
//		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF9999efBCabcdEFBF";
//		String key3 = "81931E1AB3D3A7D19EAFF08B4EF9DDB8";
//		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
//		byte[] DataOut = new byte[16];

		Ddi.ddi_innerkey_open();
		int res9 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
		int res10 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 149, innerkey1, 16);
		int res8 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 0, 0, ipIn, innerkey1, 16, ipOut, 16);
		int res7 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 149, 449, 0, ipIn, innerkey1, 16, ipOut, 16);
		if (res9 == 0 && res10 == 0 && res8 == 0 && res7 == 0) {
			myHandleDeal("��������Կ�͹�����Կ�ɹ�113" + res10, res9);
		} else {
			myHandleDeal("��������Կ�͹�����Կʧ��113" + res10, res9);
		}
		int res0 = Ddi.ddi_innerkey_ioctl_key_check(0, 0);
		int res2 = Ddi.ddi_innerkey_ioctl_key_check(0, 149);
		if (res0 == 0 && res2 == 0) {
			myHandleDeal("����Կ���ɹ�113", res0);
			int res1 = Ddi.ddi_innerkey_ioctl_key_check(1, 0);
			int res4 = Ddi.ddi_innerkey_ioctl_key_check(1, 449);
			if (res1 == 0 && res4 == 0) {
				myHandleDeal("������Կ���ɹ�113", res1);
			} else {
				myHandleDeal("������Կ���ʧ��113", res1);
			}
		} else {
			myHandleDeal("����Կ���ʧ��113", res0);
		}

	}

	// �������Կ�͹�����Կ�����������С������Կ�Ƿ����
	private void testgroup114() {

		myHandleDeal("testgroup114����", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		final byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		Runnable runnable = new Runnable() {
			public void run() {
				// String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF9999efBCabcdEFBF";
				// String key3 = "81931E1AB3D3A7D19EAFF08B4EF9DDB8";
				// byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
				// byte[] DataOut = new byte[16];
				for (int i = 0; i < 500; i++) {
					int ddi_innerkey_open = Ddi.ddi_innerkey_close();
					if (ddi_innerkey_open == 0) {
						myHandleDeal("group114��رճɹ�" + i, 0);
					} else {
						myHandleDeal("group114��رճɹ�" + i, 0);
					}
				}
				int res9 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
				if (res9 == 0) {
					myHandleDeal("group114��ɹ�", 0);
				} else {
					myHandleDeal("group114��ʧ��", res9);
				}
				for (int i = 0; i < 100; i++) {
					int ddi_innerkey_open = Ddi.ddi_innerkey_open();
					if (ddi_innerkey_open == 0) {
						myHandleDeal("group114��رճɹ�" + i, 0);
					} else {
						myHandleDeal("group114��رճɹ�" + i, 0);
					}
				}
				Ddi.ddi_innerkey_open();
				int res10 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 149, innerkey1, 16);
				int res8 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 0, 0, ipIn, innerkey1, 16, ipOut, 16);
				int res7 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 149, 449, 0, ipIn, innerkey1, 16, ipOut, 16);
				if (res9 == 0 && res10 == 0 && res8 == 0 && res7 == 0) {
					myHandleDeal("group114��������Կ�͹�����Կ�ɹ�114" + res10, res9);
				} else {
					myHandleDeal("group114��������Կ�͹�����Կʧ��114" + res10, res9);
				}
				int res0 = Ddi.ddi_innerkey_ioctl_key_check(0, 0);
				int res2 = Ddi.ddi_innerkey_ioctl_key_check(0, 149);
				if (res0 == 0 && res2 == 0) {
					myHandleDeal("group114����Կ���ɹ�114", res0);
					int res1 = Ddi.ddi_innerkey_ioctl_key_check(1, 0);
					int res4 = Ddi.ddi_innerkey_ioctl_key_check(1, 449);
					if (res1 == 0 && res4 == 0) {
						myHandleDeal("group114���¹�����Կ���Գɹ�114", res1);
					} else {
						myHandleDeal("group114���¹�����Կ����ʧ��114", res1);
					}
				} else {
					myHandleDeal("group114����Կ���ʧ��114", res0);
				}
			}
		};
		Thread group114 = new Thread(runnable);
		group114.start();
		try {
			group114.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void testgroup115() {
		myHandleDeal("testgroup115����", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF";
		final byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		String key3 = "CA02764FC025A3907E926B112EF27CC2";
		final byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		byte[] output = new byte[16];

		Thread nthread = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 300; i++) {
					Ddi.ddi_innerkey_open();
					int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x22, 122, innerkey1, 16);
					if (res0 == -6) {
						myHandleDeal("group115��������Կ�ɹ�" + i, res0);
						int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x22, 122, 2, 1, ipIn, innerkey2, 16, ipOut, 16);
						if (res1 == -6) {
							myHandleDeal("group115���¹�����Կ���Գɹ�" + i, res1);
						} else {
							myHandleDeal("group115���¹�����Կ����ʧ��" + i, res1);
						}
					} else {
						myHandleDeal("group115��������Կʧ��" + i, res0);

					}
				}
			}
		});
		nthread.start();
		try {
			nthread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void testgroup116() {
		myHandleDeal("testgroup116����", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF";
		final byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		String key3 = "CA02764FC025A3907E926B112EF27CC2";
		final byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		byte[] output = new byte[16];

		Thread nthread = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 300; i++) {
					Ddi.ddi_innerkey_open();
					int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x88, 122, innerkey1, 16);
					if (res0 == -6) {
						myHandleDeal("group116��������Կ�ɹ�" + i, res0);
						int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x88, 122, 2, 1, ipIn, innerkey2, 16, ipOut, 16);
						if (res1 == -6) {
							myHandleDeal("group116���¹�����Կ���Գɹ�" + i, res1);
						} else {
							myHandleDeal("group116���¹�����Կ����ʧ��" + i, res1);
						}
					} else {
						myHandleDeal("group116��������Կʧ��" + i, res0);

					}
				}
			}
		});
		nthread.start();
		try {
			mThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/***
	 * ��Ҫ�����������ڼ����û����� �˻�����
	 * 
	 * @param mode       ���ֶ�Ԥ��8��bit������ÿ��bitֵ�������ܵ��㷨�ͼ���ģʽ��ECB��CBC��������� ecb_mode =
	 *                   ((mode&0x01) == 0) ? (ECB_MODE):(CBC_MODE);
	 *                   ��ʾֵΪ1���Ǹ�bit��Ҳ���ǵ�һ��bit,���Ϊ0��ʾECB��Ϊ1��ʾCBC algtype =
	 *                   ((mode&0x04) == 0) ? (DUKPT_ALGTYPE):(DES_ALGTYPE);
	 *                   ��ʾֵΪ4���Ǹ�bit��Ҳ���ǵ�3��bit,���Ϊ0��ʾDUKPT��Ϊ1��ʾDES
	 *                   request_mode=((mode&0x10)==0) ?
	 *                   (REQUEST_MODE):(RESPONSE_MODE);
	 *                   ��ʾֵΪ16���Ǹ�bit��Ҳ���ǵ�5��bit,���Ϊ0��ʾREQUEST_MODE��Ϊ1��ʾRESPONSE_MODE
	 *                   ���磺ECB��DUKPT�㷨��REQUEST_MODE ��ômode�����ֵΪ��0+0+0=0
	 *                   �����CBC��DES��RESPONSE_MODE 1+4+16=21
	 * @param groupindex �ڼ��ܷ�ʽ��DUKPT������²Ż����ã������DES�㷨��Ч
	 * @param keyindex   ������Կ������
	 * @param account    �������ݣ���
	 * @param accountlen �������ݳ���
	 * @param iv         IVֵ���ɵ�һ��������mode�����Ƿ��������
	 * @param cipher     �����˻����ݺ󷵻ص�ֵ
	 * @return
	 * 
	 * 		public static native int ddi_innerkey_account_encrypt(int mode, int
	 *         groupindex, int keyindex, byte[]account, int accountlen, byte[]iv,
	 *         byte[]cipher); ��ز���������123Ϊֹ��DUKpt��ص���DUKPT����
	 *
	 */

	// ECB/CBC ��DES
	private void testgroup117() {
		myHandleDeal("testgroup117����", 0);
		String key1 = "3131313131313131";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "3232323232323232";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		byte[] DataOut = new byte[16];
		String data0 = "9BEEF8C7E4DF322C97C5C0E7FA05B40A";
		String data1 = "273CED780C27ADC2F653F87554E69E3A";
		byte[] msg_summery1 = ByteUtils.hexString2ByteArray("85e9d210105327171927e8303ef028e1");
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x00, 149, innerkey1, 8);
		if (res0 == 0) {
			myHandleDeal("group117��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x00, 149, 0, 1, ipIn, innerkey2, 8, ipOut, 8);
			if (res1 == 0) {
				myHandleDeal("group117���¹�����Կ�ɹ�", res1);
				// ������Կ���ģ�B3A7256E60B66590
				// ipin=30303030abCDef99a1da25f1e411fea5
				// msg_summery=12345678abcdEFBFABCDefBCabcdEFBF
				// ECB ģʽ
				int res5 = Ddi.ddi_innerkey_account_encrypt(4, 0, 0, msg_summery, 16, ipIn, DataOut);
				String data = ByteUtils.byteArray2HexString(DataOut);
				// CBC ģʽ
				int res6 = Ddi.ddi_innerkey_account_encrypt(5, 0, 0, msg_summery, 16, ipIn, DataOut);
				String data2 = ByteUtils.byteArray2HexString(DataOut);

				if (res5 == 0 && data.equalsIgnoreCase(data0) && res6 == 0 && data2.equalsIgnoreCase(data1)) {
					myHandleDeal("group117�����˻��ɹ�", res5);
				} else {
					myHandleDeal("group117�����˻�ʧ��" + data, res5);
				}
			} else {
				myHandleDeal("group117���¹�����Կʧ��", res1);
			}
		}
	}

	// //ECB/CBC ˫DES
	private void testgroup118() {
		myHandleDeal("testgroup118����", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		byte[] DataOut = new byte[16];
		String data1 = "CA02764FC025A3907E926B112EF27CC2";
		String data0 = "56B0C624FE8F0F4F0A8AAEF233823CC4";
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
		if (res0 == 0) {
			myHandleDeal("group118��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 449, 1, ipIn, innerkey2, 16, ipOut, 16);
			if (res1 == 0) {
				myHandleDeal("group118���¹�����Կ���Գɹ�", res1);
				// ������Կ���ģ�4BF6699A03307BDE2D681E40C96EBC7E
				// ipin=30303030abCDef99a1da25f1e411fea5
				// msg_summery=12345678abcdEFBFABCDefBCabcdEFBF
				// ECB ģʽ
				int res5 = Ddi.ddi_innerkey_account_encrypt(4, 0, 449, msg_summery, 16, ipIn, DataOut);
				String data = ByteUtils.byteArray2HexString(DataOut);
				// CBC ģʽ
				int res6 = Ddi.ddi_innerkey_account_encrypt(5, 0, 449, msg_summery, 16, ipIn, DataOut);
				String data2 = ByteUtils.byteArray2HexString(DataOut);
				if (res5 == 0 && data.equalsIgnoreCase(data0) && res6 == 0 && data2.equalsIgnoreCase(data1)) {
					myHandleDeal("group118�����˻��ɹ�", res5);
				} else {
					myHandleDeal("group118�����˻�ʧ��" + data, res5);
				}
			} else {
				myHandleDeal("group118���¹�����Կ����ʧ��", res1);
			}

		} else {
			myHandleDeal("group118��������Կʧ��", res0);
		}

	}

	// //ECB/CBC ��DES
	private void testgroup119() {
		myHandleDeal("testgroup119����", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF78abcdEFBFABCDef";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF78abcdEFBFABCDef";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		byte[] DataOut = new byte[16];
		String data1 = "BB93377A8252238CFEB2BE3AAB77FC82";
		String data0 = "542E22C8735A676FF31D6DF386330565";
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 75, innerkey1, 24);
		if (res0 == 0) {
			myHandleDeal("group119��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 75, 225, 1, ipIn, innerkey2, 24, ipOut, 24);
			if (res1 == 0) {
				myHandleDeal("group119���¹�����Կ���Գɹ�", res1);
				// ������Կ���ģ�AFE25AE54AA57E6F89E25694FA26E33D50D5CD8469257880
				// ipin=30303030abCDef99a1da25f1e411fea5
				// msg_summery=12345678abcdEFBFABCDefBCabcdEFBF
				// ECB ģʽ
				int res5 = Ddi.ddi_innerkey_account_encrypt(4, 20, 225, msg_summery, 16, ipIn, DataOut);
				String data = ByteUtils.byteArray2HexString(DataOut);
				// CBC ģʽ
				int res6 = Ddi.ddi_innerkey_account_encrypt(5, 60, 225, msg_summery, 16, ipIn, DataOut);
				String data2 = ByteUtils.byteArray2HexString(DataOut);
				if (res5 == 0 && data.equalsIgnoreCase(data0) && res6 == 0 && data2.equalsIgnoreCase(data1)) {
					myHandleDeal("group119�����˻��ɹ�", res5);
				} else {
					myHandleDeal("group119�����˻�ʧ��" + data, res5);
				}

			} else {
				myHandleDeal("group119���¹�����Կ����ʧ��", res1);
			}
		} else {
			myHandleDeal("group119��������Կʧ��", res0);
		}

	}

	// ��Ӧ������������
	private void testgroup120() {
		myHandleDeal("testgroup120����", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF78abcdEFBFABCDef";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF78abcdEFBFABCDef";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		byte[] DataOut = new byte[16];
//		String data1="BB93377A8252238CFEB2BE3AAB77FC82";
//		String data0="542E22C8735A676FF31D6DF386330565";
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 75, innerkey1, 24);
		if (res0 == 0) {
			myHandleDeal("group120��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 75, 225, 1, ipIn, innerkey2, 24, ipOut, 24);
			if (res1 == 0) {
				myHandleDeal("group120���¹�����Կ���Գɹ�", res1);
				// ������Կ���ģ�AFE25AE54AA57E6F89E25694FA26E33D50D5CD8469257880
				// ipin=30303030abCDef99a1da25f1e411fea5
				// msg_summery=12345678abcdEFBFABCDefBCabcdEFBF
				// ECB ģʽ
				int res7 = Ddi.ddi_innerkey_delete_key(1, 225);
				if (res7 == 0) {
					myHandleDeal("group120ɾ��������Կ�ɹ�", res7);
				}
				int res5 = Ddi.ddi_innerkey_account_encrypt(4, 20, 225, msg_summery, 16, ipIn, DataOut);
				// CBC ģʽ
				int res6 = Ddi.ddi_innerkey_account_encrypt(5, 60, 225, msg_summery, 16, ipIn, DataOut);
				if (res5 == -6 && res6 == -6) {
					myHandleDeal("group120�����˻��ɹ�", res5);
				} else {
					myHandleDeal("group120�����˻�ʧ��", res5);
				}

			} else {
				myHandleDeal("group120���¹�����Կ����ʧ��", res1);
			}
		} else {
			myHandleDeal("group120��������Կʧ��", res0);
		}

	}

	// �쳣����
	private void testgroup121() {
		myHandleDeal("testgroup121����", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF78abcdEFBFABCDef";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF78abcdEFBFABCDef";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		byte[] DataOut = new byte[16];
		String data1 = "BB93377A8252238CFEB2BE3AAB77FC82";
		String data0 = "542E22C8735A676FF31D6DF386330565";
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 75, innerkey1, 24);
		if (res0 == 0) {
			myHandleDeal("group121��������Կ�ɹ�", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 75, 225, 1, ipIn, innerkey2, 24, ipOut, 24);
			if (res1 == 0) {
				myHandleDeal("group121���¹�����Կ���Գɹ�", res1);
				// ������Կ���ģ�AFE25AE54AA57E6F89E25694FA26E33D50D5CD8469257880
				// ipin=30303030abCDef99a1da25f1e411fea5
				// msg_summery=12345678abcdEFBFABCDefBCabcdEFBF
				// ECB ģʽ
				int res5 = Ddi.ddi_innerkey_account_encrypt(6, 20, 225, msg_summery, 16, ipIn, DataOut);
				String data = ByteUtils.byteArray2HexString(DataOut);
				int res7 = Ddi.ddi_innerkey_account_encrypt(12, 149, 225, msg_summery, 16, ipIn, DataOut);
				String data3 = ByteUtils.byteArray2HexString(DataOut);
				int res8 = Ddi.ddi_innerkey_account_encrypt(14, 0, 225, msg_summery, 16, ipIn, DataOut);
				String data4 = ByteUtils.byteArray2HexString(DataOut);
				int res9 = Ddi.ddi_innerkey_account_encrypt(20, 449, 225, msg_summery, 16, ipIn, DataOut);
				String data5 = ByteUtils.byteArray2HexString(DataOut);
				int res10 = Ddi.ddi_innerkey_account_encrypt(30, 30, 225, msg_summery, 16, ipIn, DataOut);
				String data6 = ByteUtils.byteArray2HexString(DataOut);
				// CBC ģʽ
				int res6 = Ddi.ddi_innerkey_account_encrypt(7, 60, 225, msg_summery, 16, ipIn, DataOut);
				String data2 = ByteUtils.byteArray2HexString(DataOut);
				int res11 = Ddi.ddi_innerkey_account_encrypt(13, 60, 225, msg_summery, 16, ipIn, DataOut);
				String data7 = ByteUtils.byteArray2HexString(DataOut);
				int res12 = Ddi.ddi_innerkey_account_encrypt(15, 60, 225, msg_summery, 16, ipIn, DataOut);
				String data8 = ByteUtils.byteArray2HexString(DataOut);
				int res13 = Ddi.ddi_innerkey_account_encrypt(21, 60, 225, msg_summery, 16, ipIn, DataOut);
				String data9 = ByteUtils.byteArray2HexString(DataOut);
				int res14 = Ddi.ddi_innerkey_account_encrypt(31, 60, 225, msg_summery, 16, ipIn, DataOut);
				String data10 = ByteUtils.byteArray2HexString(DataOut);
				int res15 = res5 + res6 + res7 + res8 + res9 + res10 + res11 + res12 + res13 + res14;
				if (res15 == 0 && data.equalsIgnoreCase(data0) && data3.equalsIgnoreCase(data0)
						&& data4.equalsIgnoreCase(data0) && data5.equalsIgnoreCase(data0)
						&& data6.equalsIgnoreCase(data0) && data2.equalsIgnoreCase(data1)
						&& data7.equalsIgnoreCase(data1) && data8.equalsIgnoreCase(data1)
						&& data9.equalsIgnoreCase(data1) && data10.equalsIgnoreCase(data1)) {
					myHandleDeal("group121�����˻��ɹ�", res15);
				} else {
					myHandleDeal("group121�����˻�ʧ��", res15);
				}
			} else {
				myHandleDeal("group121���¹�����Կ����ʧ��", res1);
			}
		} else {
			myHandleDeal("group121��������Կʧ��", res0);
		}

	}

	// //�������ݳ�����С1
	private void testgroup122() {
		myHandleDeal("testgroup122����", 0);
//		if (MainActivity.model.equalsIgnoreCase("N5")|MainActivity.model.equalsIgnoreCase("F900")) {
			String key1 = "12345678abcdEFBFABCDefBCabcdEFBF78abcdEFBFABCDef";
			byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
			String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF78abcdEFBFABCDef";
			byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
			String key3 = "3131313131313131";
			byte[] innerkey3 = ByteUtils.hexString2ByteArray(key3);
			byte[] DataOut = new byte[8];
			String data1 = "9504BD1209D0B7BD";
			String data0 = "07655A17544D79B6";
			Ddi.ddi_innerkey_open();
			int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 75, innerkey1, 24);
			if (res0 == 0) {
				myHandleDeal("group122��������Կ�ɹ�", res0);
				int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 75, 225, 1, ipIn, innerkey2, 24, ipOut, 24);
				if (res1 == 0) {
					myHandleDeal("group122���¹�����Կ���Գɹ�", res1);
					// ������Կ���ģ�AFE25AE54AA57E6F89E25694FA26E33D50D5CD8469257880
					// ipin=30303030abCDef99a1da25f1e411fea5
					// msg_summery=12345678abcdEFBFABCDefBCabcdEFBF
					// ECB ģʽ
					int res5 = Ddi.ddi_innerkey_account_encrypt(4, 20, 225, innerkey3, innerkey3.length, ipIn, DataOut);
					String data = ByteUtils.byteArray2HexString(DataOut);
					// CBC ģʽ
					int res6 = Ddi.ddi_innerkey_account_encrypt(5, 60, 225, innerkey3, innerkey3.length, ipIn, DataOut);
					String data2 = ByteUtils.byteArray2HexString(DataOut);
					if (res5 == 0 && data.equalsIgnoreCase(data0) && res6 == 0 && data2.equalsIgnoreCase(data1)) {
						myHandleDeal("group122�����˻��ɹ�", res5);
					} else {
						myHandleDeal("group122�����˻�ʧ��" + data, res5);
					}
				} else {
					myHandleDeal("group122���¹�����Կ����ʧ��", res1);
				}
			} else {
				myHandleDeal("group122��������Կʧ��", res0);
			}
//		} else {
//			myHandleDeal("group122����ʧ��" + MainActivity.model + "��֧�ּ��ܿ����˻�����", -99);
//		}

	}

	// //�������ݳ������504
	private void testgroup123() {
		myHandleDeal("testgroup123����", 0);
//		if (MainActivity.model.equalsIgnoreCase("N5")|MainActivity.model.equalsIgnoreCase("F900")) {
			String key1 = "12345678abcdEFBFABCDefBCabcdEFBF78abcdEFBFABCDef";
			byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
			String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF78abcdEFBFABCDef";
			byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
			byte[] innerkey3 = ByteUtils.hexString2ByteArray(ParaEntity.dataString504);
			byte[] DataOut = new byte[504];
			String data1 = "274D184C540814810DE67AB9E4AFEC0C94C35C2347D4638254C76BEF0503313A2471EF2BD11CD8CDC9E36B1B24A152051167D774E1216367DD63CB84F3C07F70F98228DEDE57E9040FA691F47AFC55BAE43F254FC1A4772D10DAA2C181B486C2CF259F7D37F1210407941E0B1C498B627A51B530F267A420C5F4A231784238735046739B46F0B17D45FD22FAEC26744B07FCBE2A6A8FD873EE90EF6681836F1B1B850E1F0C6058FD97543ED5119A139AA7C78C1A6309E2B39077BA90B179CCDAC98F0222F5CDAA462076A260745402E6C2D821E8FDDF883A09318A8277D2BB4DC870721F3A88204313AF8079D09757C65025DA3D2073C2E34CD2A349006870ECB0AF7B15E895D726092DC9D1C302F7676E580368BE2B3A27026BC3C62D35F696D8190A2EDBD2E5C28A72468BD77346D402E7140C24372EE53542A7DBCC2C5A751F47EB6989888021011FCA76A56537D7D6AEE2688FBA90CFB47859BFD28885BB408328877523B4D97D25904DF10D035AF871F8DB76FCD91FC4CBA20CB3DD2C11E3EDA5C1F8FD5F8258F3B65CE0A6D4BBB567E02BB3BAF46C143252C48144C31497B58A1AD90156D3AAE1F967FCFB20476DC5BA1512A8EE392F0AB8FED81009EF6AB37343A382307F51E5155FB81DEEB6A18272F43CF14BA84B30289C92369607897ADA70D127AB5C4F4E6C7641DD9BD9798B16567EB7A0B8";
			String data0 = "9C6A7B56F793352D90B89BA266C2B5C98D7BBA4FD22F6CE89C6A7B56F793352D90B89BA266C2B5C98D7BBA4FD22F6CE89C6A7B56F793352D90B89BA266C2B5C98D7BBA4FD22F6CE89C6A7B56F793352D90B89BA266C2B5C98D7BBA4FD22F6CE89C6A7B56F793352D90B89BA266C2B5C98D7BBA4FD22F6CE89C6A7B56F793352D90B89BA266C2B5C98D7BBA4FD22F6CE89C6A7B56F793352D90B89BA266C2B5C98D7BBA4FD22F6CE89C6A7B56F793352D90B89BA266C2B5C98D7BBA4FD22F6CE89C6A7B56F793352D90B89BA266C2B5C98D7BBA4FD22F6CE89C6A7B56F793352D90B89BA266C2B5C98D7BBA4FD22F6CE89C6A7B56F793352D90B89BA266C2B5C98D7BBA4FD22F6CE89C6A7B56F793352D90B89BA266C2B5C98D7BBA4FD22F6CE89C6A7B56F793352D90B89BA266C2B5C98D7BBA4FD22F6CE89C6A7B56F793352D90B89BA266C2B5C98D7BBA4FD22F6CE89C6A7B56F793352D90B89BA266C2B5C98D7BBA4FD22F6CE89C6A7B56F793352D90B89BA266C2B5C98D7BBA4FD22F6CE89C6A7B56F793352D90B89BA266C2B5C98D7BBA4FD22F6CE89C6A7B56F793352D90B89BA266C2B5C98D7BBA4FD22F6CE89C6A7B56F793352D90B89BA266C2B5C98D7BBA4FD22F6CE89C6A7B56F793352D90B89BA266C2B5C98D7BBA4FD22F6CE89C6A7B56F793352D90B89BA266C2B5C98D7BBA4FD22F6CE8";
			Ddi.ddi_innerkey_open();
			int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 75, innerkey1, 24);
			if (res0 == 0) {
				myHandleDeal("group123��������Կ�ɹ�", res0);
				int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 75, 225, 1, ipIn, innerkey2, 24, ipOut, 24);
				if (res1 == 0) {
					myHandleDeal("group123���¹�����Կ���Գɹ�", res1);
					// ������Կ���ģ�AFE25AE54AA57E6F89E25694FA26E33D50D5CD8469257880
					// ipin=30303030abCDef99a1da25f1e411fea5
					// msg_summery=12345678abcdEFBFABCDefBCabcdEFBF
					// ECB ģʽ
					int res5 = Ddi.ddi_innerkey_account_encrypt(4, 20, 225, innerkey3, 504, ipIn, DataOut);
					String data = ByteUtils.byteArray2HexString(DataOut);
					// CBC ģʽ
					int res6 = Ddi.ddi_innerkey_account_encrypt(5, 60, 225, innerkey3, 504, ipIn, DataOut);
					String data2 = ByteUtils.byteArray2HexString(DataOut);
					if (res5 == 0 && data.equalsIgnoreCase(data0) && res6 == 0 && data2.equalsIgnoreCase(data1)) {
						myHandleDeal("group123�����˻��ɹ�", res5);
					} else {
						myHandleDeal("group123�����˻�ʧ��" + data, res5);
					}

				} else {
					myHandleDeal("group123���¹�����Կ����ʧ��", res1);
				}
			} else {
				myHandleDeal("group123��������Կʧ��", res0);
			}
//		} else {
//			myHandleDeal("group123����ʧ��" + MainActivity.model + "��֧�ּ��ܿ����˻�����", -99);
//		}

	}

	// ��������û����Կ��������
	private void testgroup90() {
		myHandleDeal("testgroup90����", 0);

		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
//		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF9999efBCabcdEFBF";
//		String key3 = "81931E1AB3D3A7D19EAFF08B4EF9DDB8";
//		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
//		byte[] DataOut = new byte[16];

		Ddi.ddi_innerkey_open();

		int res0 = Ddi.ddi_innerkey_delete_key(0, 149);
		int res2 = Ddi.ddi_innerkey_ioctl_key_check(0, 149);
		if (res0 == 0 && res2 == -1) {
			myHandleDeal("����Կ���ɹ�90" + res2, res0);
			int res1 = Ddi.ddi_innerkey_delete_key(1, 449);
			int res4 = Ddi.ddi_innerkey_ioctl_key_check(1, 449);
			if (res1 == 0 && res4 == -1) {
				myHandleDeal("���¹�����Կ���Գɹ�90" + res4, res1);
			} else {
				myHandleDeal("���¹�����Կ����ʧ��90" + res4, res1);
			}
		} else {
			myHandleDeal("����Կ���ʧ��90" + res2, res0);
		}
		Ddi.ddi_innerkey_close();
	}

	// ���SM2��Կ�ĺϷ���
	private void testgroup91() {
		myHandleDeal("testgroup91����", 0);

		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF";
		final byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		Runnable runnable = new Runnable() {
			public void run() {
				for (int i = 0; i < 200; i++) {
					int res = Ddi.ddi_innerkey_open();
					if (res == 0) {
						myHandleDeal("group91���豸�ɹ�" + i, res);
						int res2 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 149, innerkey1, 16);
						if (res2 == 0) {
							myHandleDeal("group91��������Կ�ɹ�" + i, res2);

						} else {
							myHandleDeal("group91��������Կʧ��" + i, res2);

						}
					} else {
						myHandleDeal("group91���豸ʧ��" + i, res);
					}
					int res1 = Ddi.ddi_innerkey_close();
					if (res1 == 0) {
						myHandleDeal("group91�ر��豸�ɹ�" + i, res);
						int res3 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 149, innerkey1, 16);
						if (res3 == 0) {
							myHandleDeal("group91��������Կ�ɹ�" + i, res3);

						} else {
							myHandleDeal("group91��������Կʧ��" + i, res3);

						}

					} else {
						myHandleDeal("group91�ر��豸ʧ��" + i, res);
					}
				}
			}
		};
		Thread group91 = new Thread(runnable);
		group91.start();
		try {
			group91.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	// ���SM2˽Կ�ĺϷ���
	private void testgroup92() {
		myHandleDeal("testgroup92����", 0);
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(1, 0, puk, prk);
		if (res1 == 0) {
			myHandleDeal("group92����SM2��˽Կ�ɹ�", res1);
			int res0 = Ddi.ddi_innerkey_ioctl(2, 1, 0);
//			int res2 = Ddi.ddi_innerkey_ioctl(2, 0, 1);
			if (res0 == 0) {
				myHandleDeal("group92��˽Կ���ɹ�", res0);
			} else {
				myHandleDeal("group92��˽Կ���ʧ��", res0);
			}
		} else {
			myHandleDeal("group92����SM2��˽Կʧ��", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	// ����Ӧ������û����Կ
	private void testgroup93() {
		myHandleDeal("testgroup93����", 0);
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_nes_sm2_delete_key(0);
		if (res1 == 0) {
			myHandleDeal("group93ɾ��SM2��˽Կ�ɹ�", res1);
			int res0 = Ddi.ddi_innerkey_ioctl(2, 1, 0);
			int res2 = Ddi.ddi_innerkey_ioctl(2, 0, 0);
			if (res0 == -6 && res2 == -6) {
				myHandleDeal("group93��˽Կ���ɹ�" + res2, res0);
			} else {
				myHandleDeal("group93��˽Կ���ʧ��" + res2, res0);
			}
		} else {
			myHandleDeal("group93����SM2��˽Կʧ��", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	// strhkey ����Կ ��ʵ������16�ֽڵ�ǰ8���ֽڼ���һ������encrypt ����Կ��С���� ǰ�벿��
	private void testgroup94() {
		myHandleDeal("testgroup94����", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		String data = "f6c578676d4b1aa5d659a05a53eb7f4f";
		String result = "9EE2FB87BFAB59BD982A01AFA7A04C36";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
		if (res1 == 0) {
			myHandleDeal("group94��������Կ�ɹ�", res1);
			// ������Կ����
			mStrHkey.setArea(0);
			// ������Կ����
			mStrHkey.setIndex(0);
			// ������Կǰ�󲿷�����
			mStrHkey.setHalf(0);
			// ���ô���������
			mStrHkey.setIndata(innerkey2);
			// ���ô��������ݵĳ���
			mStrHkey.setLen(16);
			int res0 = Ddi.ddi_innerkey_ioctl_hkey_encrypt(mStrHkey);
			byte[] outdata = mStrHkey.getOutdata();
			String byteArray2HexString = ByteUtils.byteArray2HexString(outdata);
			if (res0 == 0 && result.equalsIgnoreCase(byteArray2HexString)) {
				myHandleDeal("group94����Կ���ɹ�", res0);
			} else {
				myHandleDeal("group94����Կ���ʧ��" + byteArray2HexString, res0);
			}
		} else {
			myHandleDeal("group94��������Կʧ��", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	// strhkey ����Կ ��ʵ������16�ֽڵ�ǰ8���ֽڼ���һ������encrypt ����Կ������� ��벿�ּ���
	private void testgroup108() {
		myHandleDeal("testgroup108����", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		String data = "f6c578676d4b1aa5d659a05a53eb7f4f";
		String result = "4DAA8FB26465A2A086DDEB7A1BF8E1BD";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 149, innerkey1, 16);
		if (res1 == 0) {
			myHandleDeal("group108��������Կ�ɹ�", res1);
			// ������Կ����
			mStrHkey.setArea(0);
			// ������Կ����
			mStrHkey.setIndex(149);
			// ������Կǰ�󲿷�����
			mStrHkey.setHalf(1);
			// ���ô���������
			mStrHkey.setIndata(innerkey2);
			// ���ô��������ݵĳ���
			mStrHkey.setLen(16);
			int res0 = Ddi.ddi_innerkey_ioctl_hkey_encrypt(mStrHkey);
			byte[] outdata = mStrHkey.getOutdata();
			String byteArray2HexString = ByteUtils.byteArray2HexString(outdata);
			if (res0 == 0 && result.equalsIgnoreCase(byteArray2HexString)) {
				myHandleDeal("group108����Կ���ɹ�", res0);
			} else {
				myHandleDeal("group108����Կ���ʧ��" + byteArray2HexString, res0);
			}
		} else {
			myHandleDeal("group108��������Կʧ��", res1);
		}

	}

	//// strhkey ����Կ ��ʵ������16�ֽڵ�ǰ8���ֽڼ���һ������encrypt ��Ӧ������Կû������ ��벿�ּ���
	private void testgroup109() {
		myHandleDeal("testgroup109����", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		String data = "f6c578676d4b1aa5d659a05a53eb7f4f";
		String result = "4DAA8FB26465A2A086DDEB7A1BF8E1BD";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 149, innerkey1, 16);
		if (res1 == 0) {
			myHandleDeal("group109��������Կ�ɹ�", res1);
			// ������Կ����
			mStrHkey.setArea(0);
			// ������Կ����
			int res5 = Ddi.ddi_innerkey_delete_key(0, 149);
			if (res5 == 0) {
				myHandleDeal("group109ɾ��������Կ�ɹ�", res5);
			} else {
				myHandleDeal("group109ɾ��������Կʧ��", res5);
			}
			mStrHkey.setIndex(149);
			// ������Կǰ�󲿷�����
			mStrHkey.setHalf(1);
			// ���ô���������
			mStrHkey.setIndata(innerkey2);
			// ���ô��������ݵĳ���
			mStrHkey.setLen(16);
			int res0 = Ddi.ddi_innerkey_ioctl_hkey_encrypt(mStrHkey);
			byte[] outdata = mStrHkey.getOutdata();
			String byteArray2HexString = ByteUtils.byteArray2HexString(outdata);
			if (res0 == -6) {
				myHandleDeal("group109����Կ���ɹ�", res0);
			} else {
				myHandleDeal("group109����Կ���ʧ��" + byteArray2HexString, res0);
			}
		} else {
			myHandleDeal("group109��������Կʧ��", res1);
		}

	}

	// strhkey ������Կ ��ʵ������16�ֽڵ�ǰ8���ֽڼ���һ������encrypt ������Կ ��С���� ��벿��
	private void testgroup95() {
		myHandleDeal("testgroup95����", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		String data = "f6c578676d4b1aa5d659a05a53eb7f4f";
		String result = "2C3D50F7F0DCB19FEBF23DA0F54F1459";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
		if (res1 == 0) {
			// ������1A01A6525A47A662 C6DEE7B27B73C4D8
			myHandleDeal("group95��������Կ�ɹ�", res1);
			int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 0, 0, ipIn, innerkey2, 16, ipOut, 16);
			if (res2 == 0) {
				myHandleDeal("group95���¹�����Կ�ɹ�", res2);
			} else {
				myHandleDeal("group95���¹�����Կʧ��", res2);
			}
			// ������Կ����
			mStrHkey.setArea(1);
			// ������Կ����
			mStrHkey.setIndex(0);
			// ������Կǰ�󲿷�����
			mStrHkey.setHalf(1);
			// ���ô���������
			mStrHkey.setIndata(innerkey2);
			// ���ô��������ݵĳ���
			mStrHkey.setLen(16);
			int res0 = Ddi.ddi_innerkey_ioctl_hkey_encrypt(mStrHkey);
			byte[] outdata = mStrHkey.getOutdata();
			String byteArray2HexString = ByteUtils.byteArray2HexString(outdata);
			if (res0 == 0 && result.equalsIgnoreCase(byteArray2HexString)) {
				myHandleDeal("group95������Կ��Կ���ɹ�", res0);
			} else {
				myHandleDeal("group95������Կ���ʧ��" + byteArray2HexString, res0);
			}
		} else {
			myHandleDeal("group95��������Կʧ��", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	// strhkey ������Կ ��ʵ������16�ֽڵ�ǰ8���ֽڼ���һ������encrypt ��Ӧ������Կ ��С����û����Կ ��벿��
	private void testgroup110() {
		myHandleDeal("testgroup110����", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		String data = "f6c578676d4b1aa5d659a05a53eb7f4f";
		String result = "2C3D50F7F0DCB19FEBF23DA0F54F1459";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
		if (res1 == 0) {
			// ������1A01A6525A47A662 C6DEE7B27B73C4D8
			myHandleDeal("group95��������Կ�ɹ�", res1);
			int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 0, 0, ipIn, innerkey2, 16, ipOut, 16);
			if (res2 == 0) {
				myHandleDeal("group110���¹�����Կ�ɹ�", res2);
			} else {
				myHandleDeal("group110���¹�����Կʧ��", res2);
			}
			// ������Կ����
			mStrHkey.setArea(1);
			// ������Կ����
			int res5 = Ddi.ddi_innerkey_delete_key(1, 0);
			if (res5 == 0) {
				myHandleDeal("group110ɾ��������Կ�ɹ�", res5);
			} else {
				myHandleDeal("group110ɾ��������Կʧ��", res5);
			}
			mStrHkey.setIndex(0);
			// ������Կǰ�󲿷�����
			mStrHkey.setHalf(1);
			// ���ô���������
			mStrHkey.setIndata(innerkey2);
			// ���ô��������ݵĳ���
			mStrHkey.setLen(16);
			
			int res0 = Ddi.ddi_innerkey_ioctl_hkey_encrypt(mStrHkey);
			byte[] outdata = mStrHkey.getOutdata();
			String byteArray2HexString = ByteUtils.byteArray2HexString(outdata);
			if (res0 == -6) {
				myHandleDeal("group110����Կ���ɹ�", res0);
			} else {
				myHandleDeal("group110����Կ���ʧ��" + byteArray2HexString, res0);
			}
		} else {
			myHandleDeal("group110��������Կʧ��", res1);
		}

	}

	// //strhkey ������Կ ��ʵ������16�ֽڵ�ǰ8���ֽڼ���һ������encrypt ������Կ ������� ǰ�벿��
	private void testgroup107() {
		myHandleDeal("testgroup107����", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		String data = "f6c578676d4b1aa5d659a05a53eb7f4f";
		String result = "31BCD0DDDE95B5127087FE1A4A456853";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
		if (res1 == 0) {
			// ������1A01A6525A47A662 C6DEE7B27B73C4D8
			myHandleDeal("group107��������Կ�ɹ�", res1);
			int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 449, 0, ipIn, innerkey2, 16, ipOut, 16);
			if (res2 == 0) {
				myHandleDeal("group107���¹�����Կ�ɹ�", res2);
			} else {
				myHandleDeal("group95���¹�����Կʧ��", res2);
			}
			// ������Կ����
			mStrHkey.setArea(1);
			// ������Կ����
			mStrHkey.setIndex(449);
			// ������Կǰ�󲿷�����
			mStrHkey.setHalf(0);
			// ���ô���������
			mStrHkey.setIndata(innerkey2);
			// ���ô��������ݵĳ���
			mStrHkey.setLen(16);
			int res0 = Ddi.ddi_innerkey_ioctl_hkey_encrypt(mStrHkey);
			byte[] outdata = mStrHkey.getOutdata();
			String byteArray2HexString = ByteUtils.byteArray2HexString(outdata);
			if (res0 == 0 && result.equalsIgnoreCase(byteArray2HexString)) {
				myHandleDeal("group95����Կ���ɹ�", res0);
			} else {
				myHandleDeal("group95����Կ���ʧ��" + byteArray2HexString, res0);
			}
		} else {
			myHandleDeal("group95��������Կʧ��", res1);
		}

	}

	// ��Ӧ����û����Կ
	private void testgroup96() {
		myHandleDeal("testgroup96����", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		String data = "f6c578676d4b1aa5d659a05a53eb7f4f";
		String result = "2C3D50F7F0DCB19FEBF23DA0F54F1459";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
		if (res1 == 0) {
			myHandleDeal("group96��������Կ�ɹ�", res1);
			int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 10, 0, ipIn, innerkey2, 16, ipOut, 16);
			if (res2 == 0) {
				myHandleDeal("group96���¹�����Կ�ɹ�", res2);
			} else {
				myHandleDeal("group96���¹�����Կʧ��", res2);
			}
			// ������Կ����
			mStrHkey.setArea(1);
			// ������Կ����
			int res5 = Ddi.ddi_innerkey_delete_key(1, 9);
			if (res5 == 0) {
				myHandleDeal("group103ɾ��������Կ�ɹ�", res5);
			} else {
				myHandleDeal("group103ɾ��������Կʧ��", res5);
			}
			mStrHkey.setIndex(9);
			// ������Կǰ�󲿷�����
			mStrHkey.setHalf(1);
			// ���ô���������
			mStrHkey.setIndata(innerkey2);
			// ���ô��������ݵĳ���
			mStrHkey.setLen(16);
			int res0 = Ddi.ddi_innerkey_ioctl_hkey_encrypt(mStrHkey);
			byte[] outdata = mStrHkey.getOutdata();
			String byteArray2HexString = ByteUtils.byteArray2HexString(outdata);
			if (res0 == -6) {
				myHandleDeal("group96����Կ���ɹ�", res0);
			} else {
				myHandleDeal("group96����Կ���ʧ��" + byteArray2HexString, res0);
			}
		} else {
			myHandleDeal("group96��������Կʧ��", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	// ������Կ���ܺ󲿷� �������
	private void testgroup97() {
		myHandleDeal("testgroup97����", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		String data = "f6c578676d4b1aa5d659a05a53eb7f4f";
		String result = "7A43C6AA6602E3AEF92D540A87E0C2B4";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
		if (res1 == 0) {
			// ������Կ�����ģ�1A01A6525A47A662 C6DEE7B27B73C4D8
			myHandleDeal("group97��������Կ�ɹ�", res1);
			int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 449, 0, ipIn, innerkey2, 16, ipOut, 16);
			if (res2 == 0) {
				myHandleDeal("group97���¹�����Կ�ɹ�", res2);
			} else {
				myHandleDeal("group97���¹�����Կʧ��", res2);
			}
			// ������Կ����
			mStrHkey.setArea(1);
			// ������Կ����
			mStrHkey.setIndex(449);
			// ������Կǰ�󲿷�����
			mStrHkey.setHalf(1);
			// ���ô���������
			mStrHkey.setIndata(innerkey2);
			// ���ô��������ݵĳ���
			mStrHkey.setLen(16);
			int res0 = Ddi.ddi_innerkey_ioctl_hkey_decrypt(mStrHkey);
			byte[] outdata = mStrHkey.getOutdata();
			String byteArray2HexString = ByteUtils.byteArray2HexString(outdata);
			if (res0 == 0 && byteArray2HexString.equalsIgnoreCase(result)) {
				myHandleDeal("group97����Կ���ɹ�", res0);
			} else {
				myHandleDeal("group97����Կ���ʧ��" + byteArray2HexString, res0);
			}
		} else {
			myHandleDeal("group97��������Կʧ��", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	// ������Կ����ǰ���� ��С����
	private void testgroup105() {
		myHandleDeal("testgroup105����", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		String data = "f6c578676d4b1aa5d659a05a53eb7f4f";
		String result = "58A9B19DB9D524CCABA7B1911862B395";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
		if (res1 == 0) {
			// ������Կ�����ģ�1A01A6525A47A662 C6DEE7B27B73C4D8
			myHandleDeal("group105��������Կ�ɹ�", res1);
			int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 0, 0, ipIn, innerkey2, 16, ipOut, 16);
			if (res2 == 0) {
				myHandleDeal("group105���¹�����Կ�ɹ�", res2);
			} else {
				myHandleDeal("group105���¹�����Կʧ��", res2);
			}
			// ������Կ����
			mStrHkey.setArea(1);
			// ������Կ����
			mStrHkey.setIndex(0);
			// ������Կǰ�󲿷�����
			mStrHkey.setHalf(0);
			// ���ô���������
			mStrHkey.setIndata(innerkey2);
			// ���ô��������ݵĳ���
			mStrHkey.setLen(16);
			int res0 = Ddi.ddi_innerkey_ioctl_hkey_decrypt(mStrHkey);
			byte[] outdata = mStrHkey.getOutdata();
			String byteArray2HexString = ByteUtils.byteArray2HexString(outdata);
			if (res0 == 0 && byteArray2HexString.equalsIgnoreCase(result)) {
				myHandleDeal("group105����Կ���ɹ�", res0);
			} else {
				myHandleDeal("group105����Կ���ʧ��" + byteArray2HexString, res0);
			}
		} else {
			myHandleDeal("group105��������Կʧ��", res1);
		}

	}

	// ��Ӧ������Կ����ǰ���� ��С����û����Կ
	private void testgroup112() {
		myHandleDeal("testgroup112����", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		String data = "f6c578676d4b1aa5d659a05a53eb7f4f";
		String result = "31BCD0DDDE95B5127087FE1A4A456853";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
		if (res1 == 0) {
			// ������Կ�����ģ�1A01A6525A47A662C6DEE7B27B73C4D8
			myHandleDeal("group112��������Կ�ɹ�", res1);
			int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 0, 0, ipIn, innerkey2, 16, ipOut, 16);
			if (res2 == 0) {
				myHandleDeal("group112���¹�����Կ�ɹ�", res2);
			} else {
				myHandleDeal("group112���¹�����Կʧ��", res2);
			}
			// ������Կ����
			mStrHkey.setArea(1);
			// ������Կ����
			int res5 = Ddi.ddi_innerkey_delete_key(1, 0);
			if (res5 == 0) {
				myHandleDeal("group110ɾ��������Կ�ɹ�", res5);
			} else {
				myHandleDeal("group110ɾ��������Կʧ��", res5);
			}
			mStrHkey.setIndex(0);
			// ������Կǰ�󲿷�����
			mStrHkey.setHalf(0);
			// ���ô���������
			mStrHkey.setIndata(innerkey2);
			// ���ô��������ݵĳ���
			mStrHkey.setLen(16);
			int res0 = Ddi.ddi_innerkey_ioctl_hkey_decrypt(mStrHkey);
			byte[] outdata = mStrHkey.getOutdata();
			String byteArray2HexString = ByteUtils.byteArray2HexString(outdata);
			if (res0 == -6) {
				myHandleDeal("group112����Կ���ɹ�", res0);
			} else {
				myHandleDeal("group112����Կ���ʧ��" + byteArray2HexString, res0);
			}
		} else {
			myHandleDeal("group112��������Կʧ��", res1);
		}

	}

	// strhkey ����Կ ��ʵ������16�ֽڵ�ǰ8���ֽڼ���һ������decrypt ��С����Կ ����Կǰ����
	private void testgroup98() {
		myHandleDeal("testgroup98����", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		String data = "f6c578676d4b1aa5d659a05a53eb7f4f";
		String result = "5BC81521647FBD41D016E3B03BEA43C7";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		// ����Կ���ģ�
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
		if (res1 == 0) {
			myHandleDeal("group98��������Կ�ɹ�", res1);
			// ������Կ����
			mStrHkey.setArea(0);
			// ������Կ����
			mStrHkey.setIndex(0);
			// ������Կǰ�󲿷�����
			mStrHkey.setHalf(0);
			// ���ô���������
			mStrHkey.setIndata(innerkey2);
			// ���ô��������ݵĳ���
			mStrHkey.setLen(16);
			int res0 = Ddi.ddi_innerkey_ioctl_hkey_decrypt(mStrHkey);
			byte[] outdata = mStrHkey.getOutdata();
			String byteArray2HexString = ByteUtils.byteArray2HexString(outdata);
			if (res0 == 0 && result.equalsIgnoreCase(byteArray2HexString)) {
				myHandleDeal("group98����Կ���ɹ�", res0);
			} else {
				myHandleDeal("group98����Կ���ʧ��" + byteArray2HexString, res0);
			}
		} else {
			myHandleDeal("group98��������Կʧ��", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	// strhkey ����Կ ��ʵ������16�ֽڵ�ǰ8���ֽڼ���һ������decrypt �������Կ ����Կ�󲿷�
	private void testgroup106() {
		myHandleDeal("testgroup106����", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";// 9999efBCabcdEFBF
		String data = "f6c578676d4b1aa5d659a05a53eb7f4f";
		String result = "BEA6218875A3F662696EBCF0ADBFE124";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		// ����Կ���ģ�
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 149, innerkey1, 16);
		if (res1 == 0) {
			myHandleDeal("group106��������Կ�ɹ�", res1);
			// ������Կ����
			mStrHkey.setArea(0);
			// ������Կ����
			mStrHkey.setIndex(149);
			// ������Կǰ�󲿷�����
			mStrHkey.setHalf(1);
			// ���ô���������
			mStrHkey.setIndata(innerkey2);
			// ���ô��������ݵĳ���
			mStrHkey.setLen(16);
			int res0 = Ddi.ddi_innerkey_ioctl_hkey_decrypt(mStrHkey);
			byte[] outdata = mStrHkey.getOutdata();
			String byteArray2HexString = ByteUtils.byteArray2HexString(outdata);
			if (res0 == 0 && result.equalsIgnoreCase(byteArray2HexString)) {
				myHandleDeal("group106����Կ���ɹ�", res0);
			} else {
				myHandleDeal("group106����Կ���ʧ��" + byteArray2HexString, res0);
			}
		} else {
			myHandleDeal("group106��������Կʧ��", res1);
		}

	}

	// strhkey ����Կ ��ʵ������16�ֽڵ�ǰ8���ֽڼ���һ������decrypt �������Կû����Կ ����Կ�󲿷ֽ���
	private void testgroup111() {
		myHandleDeal("testgroup111����", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		String data = "f6c578676d4b1aa5d659a05a53eb7f4f";
		String result = "5BC81521647FBD41D016E3B03BEA43C7";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		// ����Կ���ģ�
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 149, innerkey1, 16);
		if (res1 == 0) {
			myHandleDeal("group111��������Կ�ɹ�", res1);
			// ������Կ����
			mStrHkey.setArea(0);
			// ������Կ����
			int res5 = Ddi.ddi_innerkey_delete_key(0, 149);
			if (res5 == 0) {
				myHandleDeal("group110ɾ��������Կ�ɹ�", res5);
			} else {
				myHandleDeal("group110ɾ��������Կʧ��", res5);
			}
			mStrHkey.setIndex(149);
			// ������Կǰ�󲿷�����
			mStrHkey.setHalf(1);
			// ���ô���������
			mStrHkey.setIndata(innerkey2);
			// ���ô��������ݵĳ���
			mStrHkey.setLen(16);
			int res0 = Ddi.ddi_innerkey_ioctl_hkey_decrypt(mStrHkey);
			byte[] outdata = mStrHkey.getOutdata();
			String byteArray2HexString = ByteUtils.byteArray2HexString(outdata);
			if (res0 == -6) {
				myHandleDeal("group106����Կ���ɹ�", res0);
			} else {
				myHandleDeal("group106����Կ���ʧ��" + byteArray2HexString, res0);
			}
		} else {
			myHandleDeal("group106��������Կʧ��", res1);
		}

	}

	// strhkey ������Կ���ܹ�����Կ
	private void testgroup99() {
		myHandleDeal("testgroup99����", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		String data = "f6c578676d4b1aa5d659a05a53eb7f4f";
		String result = "7A43C6AA6602E3AEF92D540A87E0C2B4";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
		if (res1 == 0) {
			// ������Կ�����ģ�1A01A6525A47A662C6DEE7B27B73C4D8
			myHandleDeal("group99��������Կ�ɹ�", res1);
			int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 0, 0, ipIn, innerkey2, 16, ipOut, 16);
			int res3 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 1, 0, ipIn, innerkey1, 16, ipOut, 16);
			if (res2 == 0 && res3 == 0) {
				myHandleDeal("group99���¹�����Կ�ɹ�", res2);
			} else {
				myHandleDeal("group99���¹�����Կʧ��", res2);
			}
			// ������Կ����
			mStrKeyTAKpara.setArea(1);
			// ���ü��ܺ󱣴����Կ
			mStrKeyTAKpara.setSaveIndex(2);
			// ����ʹ�õĹ�����Կ
			mStrKeyTAKpara.setSourceIndex(0);
			// ���ñ����ܵĹ�����Կ
			mStrKeyTAKpara.setTargetIndex(1);

			int res0 = Ddi.ddi_innerkey_ioctl_tak_encryptTak(mStrKeyTAKpara);

			if (res0 == 0) {
				myHandleDeal("group99����Կ���ɹ�", res0);
			} else {
				myHandleDeal("group99����Կ���ʧ��", res0);
			}
		} else {
			myHandleDeal("group99��������Կʧ��", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	// ���е���������һ��
	private void testgroup100() {
		myHandleDeal("testgroup100����", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		String data = "f6c578676d4b1aa5d659a05a53eb7f4f";
		String result = "7A43C6AA6602E3AEF92D540A87E0C2B4";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
		if (res1 == 0) {
			// ������Կ�����ģ�1A01A6525A47A662C6DEE7B27B73C4D8
			myHandleDeal("group100��������Կ�ɹ�", res1);
			int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 10, 0, ipIn, innerkey2, 16, ipOut, 16);
			int res3 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 11, 0, ipIn, innerkey1, 16, ipOut, 16);
			if (res2 == 0 && res3 == 0) {
				myHandleDeal("group100���¹�����Կ�ɹ�", res2);
			} else {
				myHandleDeal("group100���¹�����Կʧ��", res2);
			}
			// ������Կ����
			mStrKeyTAKpara.setArea(1);
			// ���ü��ܺ󱣴����Կ
			mStrKeyTAKpara.setSaveIndex(10);
			// ����ʹ�õĹ�����Կ
			mStrKeyTAKpara.setSourceIndex(10);
			// ���ñ����ܵĹ�����Կ
			mStrKeyTAKpara.setTargetIndex(10);

			int res0 = Ddi.ddi_innerkey_ioctl_tak_encryptTak(mStrKeyTAKpara);

			if (res0 == 0) {
				myHandleDeal("group100����Կ���ɹ�", res0);
			} else {
				myHandleDeal("group100����Կ���ʧ��", res0);
			}
		} else {
			myHandleDeal("group100��������Կʧ��", res1);
		}

	}

	// ָ����Կ����Ϊ����Կ
	private void testgroup101() {
		myHandleDeal("testgroup101����", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		String data = "f6c578676d4b1aa5d659a05a53eb7f4f";
		String result = "7A43C6AA6602E3AEF92D540A87E0C2B4";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
		if (res1 == 0) {
			// ������Կ�����ģ�1A01A6525A47A662C6DEE7B27B73C4D8
			myHandleDeal("group100��������Կ�ɹ�", res1);
			int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 10, 0, ipIn, innerkey2, 16, ipOut, 16);
			int res3 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 11, 0, ipIn, innerkey1, 16, ipOut, 16);
			if (res2 == 0 && res3 == 0) {
				myHandleDeal("group101���¹�����Կ�ɹ�", res2);
			} else {
				myHandleDeal("group101���¹�����Կʧ��", res2);
			}
			// ������Կ����
			mStrKeyTAKpara.setArea(0);
			// ���ü��ܺ󱣴����Կ
			mStrKeyTAKpara.setSaveIndex(15);
			// ����ʹ�õĹ�����Կ
			mStrKeyTAKpara.setSourceIndex(10);
			// ���ñ����ܵĹ�����Կ
			mStrKeyTAKpara.setTargetIndex(11);

			int res0 = Ddi.ddi_innerkey_ioctl_tak_encryptTak(mStrKeyTAKpara);

			if (res0 == -6) {
				myHandleDeal("group101����Կ���ɹ�", res0);
			} else {
				myHandleDeal("group101����Կ���ʧ��", res0);
			}
		} else {
			myHandleDeal("group101��������Կʧ��", res1);
		}

	}

	// ʹ�ü��ܵĹ�����Կ������
	private void testgroup102() {
		myHandleDeal("testgroup102����", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		String data = "f6c578676d4b1aa5d659a05a53eb7f4f";
		String result = "7A43C6AA6602E3AEF92D540A87E0C2B4";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
		if (res1 == 0) {
			// ������Կ�����ģ�1A01A6525A47A662C6DEE7B27B73C4D8
			myHandleDeal("group102��������Կ�ɹ�", res1);
			int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 10, 0, ipIn, innerkey2, 16, ipOut, 16);
			int res3 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 11, 0, ipIn, innerkey1, 16, ipOut, 16);
			if (res2 == 0 && res3 == 0) {
				myHandleDeal("group102���¹�����Կ�ɹ�", res2);
			} else {
				myHandleDeal("group102���¹�����Կʧ��", res2);
			}
			// ������Կ����
			mStrKeyTAKpara.setArea(1);
			// ���ü��ܺ󱣴����Կ
			mStrKeyTAKpara.setSaveIndex(15);
			// ����ʹ�õĹ�����Կ
			int res5 = Ddi.ddi_innerkey_delete_key(1, 10);
			if (res5 == 0) {
				myHandleDeal("group102ɾ��������Կ�ɹ�", res5);
			} else {
				myHandleDeal("group102ɾ��������Կʧ��", res5);

			}

			mStrKeyTAKpara.setSourceIndex(10);
			// ���ñ����ܵĹ�����Կ
			mStrKeyTAKpara.setTargetIndex(11);

			int res0 = Ddi.ddi_innerkey_ioctl_tak_encryptTak(mStrKeyTAKpara);

			if (res0 == -6) {
				myHandleDeal("group102����Կ���ɹ�", res0);
			} else {
				myHandleDeal("group102����Կ���ʧ��", res0);
			}
		} else {
			myHandleDeal("group102��������Կʧ��", res1);
		}

	}

	// ʹ�ñ����ܵĹ�����Կ������
	private void testgroup103() {
		myHandleDeal("testgroup103����", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		String data = "f6c578676d4b1aa5d659a05a53eb7f4f";
		String result = "7A43C6AA6602E3AEF92D540A87E0C2B4";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
		if (res1 == 0) {
			// ������Կ�����ģ�1A01A6525A47A662C6DEE7B27B73C4D8
			myHandleDeal("group103��������Կ�ɹ�", res1);
			int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 10, 0, ipIn, innerkey2, 16, ipOut, 16);
			int res3 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 11, 0, ipIn, innerkey1, 16, ipOut, 16);
			if (res2 == 0 && res3 == 0) {
				myHandleDeal("group103���¹�����Կ�ɹ�", res2);
			} else {
				myHandleDeal("group103���¹�����Կʧ��", res2);
			}
			// ������Կ����
			mStrKeyTAKpara.setArea(1);
			// ���ü��ܺ󱣴����Կ
			mStrKeyTAKpara.setSaveIndex(15);
			// ����ʹ�õĹ�����Կ
			mStrKeyTAKpara.setSourceIndex(10);
			// ���ñ����ܵĹ�����Կ
			int res5 = Ddi.ddi_innerkey_delete_key(1, 11);
			if (res5 == 0) {
				myHandleDeal("group103ɾ��������Կ�ɹ�", res5);
			} else {
				myHandleDeal("group103ɾ��������Կʧ��", res5);

			}
			mStrKeyTAKpara.setTargetIndex(11);

			int res0 = Ddi.ddi_innerkey_ioctl_tak_encryptTak(mStrKeyTAKpara);

			if (res0 == -6) {
				myHandleDeal("group103����Կ���ɹ�", res0);
			} else {
				myHandleDeal("group103����Կ���ʧ��", res0);
			}
		} else {
			myHandleDeal("group103��������Կʧ��", res1);
		}

	}

	// ������Կ���ܹ�����Կ ��Կ����Ϊ���
	private void testgroup104() {
		myHandleDeal("testgroup104����", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		String data = "f6c578676d4b1aa5d659a05a53eb7f4f";
		String result = "7A43C6AA6602E3AEF92D540A87E0C2B4";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
		if (res1 == 0) {
			// ������Կ�����ģ�1A01A6525A47A662C6DEE7B27B73C4D8
			myHandleDeal("group104��������Կ�ɹ�", res1);
			int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 449, 0, ipIn, innerkey2, 16, ipOut, 16);
			int res3 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 448, 0, ipIn, innerkey1, 16, ipOut, 16);
			if (res2 == 0 && res3 == 0) {
				myHandleDeal("group104���¹�����Կ�ɹ�", res2);
			} else {
				myHandleDeal("group104���¹�����Կʧ��", res2);
			}
			// ������Կ����
			mStrKeyTAKpara.setArea(1);
			// ���ü��ܺ󱣴����Կ
			mStrKeyTAKpara.setSaveIndex(447);
			// ����ʹ�õĹ�����Կ
			mStrKeyTAKpara.setSourceIndex(448);
			// ���ñ����ܵĹ�����Կ
			mStrKeyTAKpara.setTargetIndex(449);

			int res0 = Ddi.ddi_innerkey_ioctl_tak_encryptTak(mStrKeyTAKpara);

			if (res0 == 0) {
				myHandleDeal("group104����Կ���ɹ�", res0);
			} else {
				myHandleDeal("group104����Կ���ʧ��", res0);
			}
		} else {
			myHandleDeal("group104��������Կʧ��", res1);
		}

	}

}
