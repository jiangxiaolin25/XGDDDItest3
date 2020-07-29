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
					// 循环所有索引的工作秘钥
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
//					是检测SM2秘钥，安卓端不支持
//					testgroup91();
					// 老接口不支持
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
					// 支持的机型 N5，N5S，F900,N86
					if (MainActivity.model.equalsIgnoreCase("N5") | MainActivity.model.equalsIgnoreCase("F900")| MainActivity.model.equalsIgnoreCase("EF900")
							| MainActivity.model.equalsIgnoreCase("N86")) {
						// 账户数据加密
						testgroup117();
						testgroup118();
						testgroup119();
						testgroup120();
						testgroup121();
						testgroup122();
						testgroup123();
					} else {
						myHandleDeal("终端:" + MainActivity.model + "不支持数据为账户数据加密测试失败", -99);
					}
					// 加密数据长度2048
					// 支持的终端N5s，N6,N86
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
						// 压力测试
						testgroup132();

					} else {
						myHandleDeal("终端:" + MainActivity.model + "不支持数据为2048测试失败", -99);
					}

					testgroup133();
					// MAC CBC 和X9.19所有项目都支持  F900和EF900还不支持
					if (MainActivity.model.equalsIgnoreCase("F900")||MainActivity.model.equalsIgnoreCase("EF900")) {
						myHandleDeal("终端:" + MainActivity.model + "不支持MAC CBC 和X9.19测试失败", -99);
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
						// 压力测试
						testgroup146();
					}
					
					//该接口只有F900支持，其他项目不支持百度活体License下载功能
					if (MainActivity.model.equalsIgnoreCase("N6")||MainActivity.model.equalsIgnoreCase("F900")||MainActivity.model.equalsIgnoreCase("N86")||
							(MainActivity.model.equalsIgnoreCase("N5") && MainActivity.version.equalsIgnoreCase("7.1.2"))) {
						testgroup147();
						testgroup148();
						testgroup150();
						testgroup151();
//						压力测试
						testgroup149();
					}else {
						myHandleDeal("终端:" + MainActivity.model + "不支持百度活体License下载功能测试失败", -99);
					}
					// 压力测试放在最后//压力测试需要的时候使用即可
					// 多种算法交替运行
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
			String infoString = msg.obj.toString() + " 返回值: " + msg.arg1;
			if (infoString.contains("test")) {
				TotalCount++;
				tv.append(" " + msg.obj.toString() + "\n");
			} else {
				if (infoString.contains("失败")) {
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
			mTotalTextView.setText("总次数:" + TotalCount);
			mSucessTextView.setText("成功:" + SucessCount);
			mFailTextView.setText("失败:" + Failcount);
			mSucessRateTextView.setText("成功率:" + SucessRate + "%");
		}
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);// 去掉标题栏
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
					Toast.makeText(getApplicationContext(), "测试中，请等待", Toast.LENGTH_SHORT).show();
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
					Toast.makeText(getApplicationContext(), "测试中，请等待", Toast.LENGTH_SHORT).show();
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
		
//		myHandleDeal("82和83需要分开测试失败",-99);
		Thread thread = new Thread(new  Runnable() {
			public void run() {
				myHandleDeal("runall测试结束", 0);
				
			}
		});
		thread.setDaemon(true);
		thread.start();
	}

//更新主密钥
	private void testgroup1() {
		myHandleDeal("testgroup1测试", 0);
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
					myHandleDeal("N3更新主密钥成功" + res7 + res1 + res2 + res3 + res4 + res5 + res6, 0);

				} else {
					myHandleDeal("N5更新主密钥失败" + res7 + res1 + res2 + res3 + res4 + res5 + res6, 0);
				}
				
			}
			if (res0 == 0) {
				myHandleDeal(MainActivity.model+"更新主密钥成功" + res7 + res1 + res2 + res3 + res4 + res5 + res6, 0);
			} else {
				myHandleDeal(MainActivity.model+"更新主密钥失败" + res7 + res1 + res2 + res3 + res4 + res5 + res6, 0);
			}
		}
		if (res0 == 0) {
			myHandleDeal("更新主密钥成功", res0);
			int res1 = -99;
			for (int i = 0; i < 51; i++) {
				res1 = Ddi.ddi_innerkey_update_wk((byte) 0x00, 149, 0, 1, ipIn, innerkey2, 8, ipOut, 8);
			}
			int res2 = -99;
			for (int k = 0; k < 51; k++) {
				res2 = Ddi.ddi_innerkey_des_encrypt(0, 149, 0, ipIn, msg_summery, 16, DataOut);// 主密钥加密
			}
			String data = ByteUtils.byteArray2HexString(DataOut);
			if (res2 == 0 && data.equals(data0)) {
				myHandleDeal("主密钥加密成功", res2);
			} else {
				myHandleDeal("group1主密钥加密失败res2", res2);
			}
			int res3 = Ddi.ddi_innerkey_delete_key(0, 149);
			if (res3 == 0) {
				myHandleDeal("删除主密钥成功", res3);
				int res4 = Ddi.ddi_innerkey_des_encrypt(0, 149, 0, ipIn, msg_summery, 16, DataOut);
				if (res4 == -6) {
					myHandleDeal("主密钥加密测试成功", res4);
				} else {
					myHandleDeal("group1主密钥加密测试失败", res4);
				}
			} else {
				myHandleDeal("group1删除主密钥失败", res3);
			}
			if (res1 == 0) {
				myHandleDeal("更新工作密钥成功", res1);
				int res5 = -99;
				for (int j = 0; j < 51; j++) {
					res5 = Ddi.ddi_innerkey_des_encrypt(1, 0, 0, ipIn, msg_summery, 16, DataOut);// 工作密钥加密
				}
				data = ByteUtils.byteArray2HexString(DataOut);
				if (res5 == 0) {
					myHandleDeal("工作密钥加密成功", res5);
				} else {
					myHandleDeal("group1工作密钥加密失败res5" + data, res5);
				}
				int res6 = Ddi.ddi_innerkey_des_decrypt(1, 0, 0, 0, ipIn, msg_summery1, 16, DataOut);// 工作密钥解密
				data = ByteUtils.byteArray2HexString(DataOut);
				if (res6 == 0) {
					myHandleDeal("工作密钥解密成功", res6);
				} else {
					myHandleDeal("group1工作密钥解密失败res6" + data, res6);
				}
				int res7 = Ddi.ddi_innerkey_delete_key(1, 0);
				if (res7 == 0) {
					myHandleDeal("删除工作密钥成功", res7);
					int res8 = Ddi.ddi_innerkey_des_encrypt(1, 0, 0, ipIn, msg_summery, 16, DataOut);
					if (res8 == -6) {
						myHandleDeal("工作密钥加密测试成功", res8);
					} else {
						myHandleDeal("group1工作密钥加密测试失败", res8);
					}
				} else {
					myHandleDeal("group1删除工作密钥失败", res7);
				}
			} else {
				myHandleDeal("group1更新工作密钥失败", res1);
			}

		} else {
			myHandleDeal("group1更新主密钥失败", res0);
		}

	}

	private void testgroup2() {
		myHandleDeal("testgroup2测试", 0);
		String key1 = "ABCDefBCabcdEFBFABCDefBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "AAAAAAAAAAAAAAAAABCDefBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 152, innerkey1, 16);
		if (res1 == -6) {
			myHandleDeal("更新主密钥测试成功", res1);
		} else {
			myHandleDeal("group2更新主密钥测试失败", res1);
		}
		int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 152, 2, 1, ipIn, innerkey2, 16, ipOut, 16);
		if (res2 == -6) {
			myHandleDeal("更新工作密钥测试成功", res2);
		} else {
			myHandleDeal("group2更新工作密钥测试失败", res2);
		}
		int res3 = Ddi.ddi_innerkey_des_encrypt(0, 152, 0, ipIn, msg_summery, 16, ipOut);
		if (res3 == -6) {
			myHandleDeal("主密钥加密测试成功", res3);
		} else {
			myHandleDeal("group2主密钥加密测试失败", res3);
		}
		int res4 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 149, innerkey1, 16);
		if (res4 == 0) {
			myHandleDeal("更新主密钥成功", res4);
		} else {
			myHandleDeal("group2更新主密钥失败", res4);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup3() {
		myHandleDeal("testgroup3测试", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
		if (res1 == 0) {
			myHandleDeal("更新主密钥成功", res1);
			int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 0, 1, ipIn, innerkey2, 16, ipOut, 16);
			if (res2 == 0) {
				myHandleDeal("更新工作密钥成功", res1);
			} else {
				myHandleDeal("group3更新工作密钥失败", res1);
			}
		} else {
			myHandleDeal("group3更新主密钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup4() {
		myHandleDeal("testgroup4测试", 0);
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
			myHandleDeal("更新主密钥成功", res0);
			int res1 = -99;
			for (int i = 0; i < 50; i++) {
				res1 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 0, 0, 0, ipIn, innerkey2, 16, ipOut, 16);
			}
			int res2 = -99;
			for (int k = 0; k < 50; k++) {
				res2 = Ddi.ddi_innerkey_nes_sm4_encrypt(0, 0, (byte) 0x00, ipIn, msg_summery, 16, DataOut, leOut);// 主密钥加密
			}
			String data = ByteUtils.byteArray2HexString(DataOut);
			if (res2 == 0 && data.equals(data0)) {
				myHandleDeal("主密钥加密成功", res2);
			} else {
				myHandleDeal("group4主密钥加密失败", res2);
			}
			int res3 = Ddi.ddi_innerkey_delete_key(0, 0);
			if (res3 == 0) {
				myHandleDeal("删除主密钥成功", res3);
				int res4 = Ddi.ddi_innerkey_nes_sm4_encrypt(0, 0, (byte) 0x00, ipIn, msg_summery, 16, DataOut, leOut);
				if (res4 == -6) {
					myHandleDeal("主密钥加密测试成功", res4);
				} else {
					myHandleDeal("group4主密钥加密测试失败", res4);
				}
			} else {
				myHandleDeal("group4删除主密钥失败", res3);
			}
			if (res1 == 0) {
				myHandleDeal("更新工作密钥成功", res1);
				int res5 = -99;
				for (int j = 0; j < 50; j++) {
					res5 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, 0, (byte) 0x00, ipIn, msg_summery, 16, DataOut, leOut);// 工作密钥加密
				}
				data = ByteUtils.byteArray2HexString(DataOut);
				if (res5 == 0 && data.equals(data1)) {
					myHandleDeal("工作密钥加密成功", res5);
				} else {
					myHandleDeal("group4工作密钥加密失败", res5);
				}
				int res6 = Ddi.ddi_innerkey_nes_sm4_decrypt(1, 0, 0, (byte) 0x00, ipIn, msg_summery1, 16, DataOut,
						leOut);// 工作密钥解密
				data = ByteUtils.byteArray2HexString(DataOut);
				if (res6 == 0 && data.equals(data2)) {
					myHandleDeal("工作密钥解密成功", res6);
				} else {
					myHandleDeal("group4工作密钥解密失败", res6);
				}
				int res7 = Ddi.ddi_innerkey_delete_key(1, 0);
				if (res7 == 0) {
					myHandleDeal("删除工作密钥成功", res7);
					int res8 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, 0, (byte) 0x00, ipIn, msg_summery, 16, DataOut,
							leOut);
					if (res8 == -6) {
						myHandleDeal("工作密钥加密测试成功", res8);
					} else {
						myHandleDeal("group4工作密钥加密测试失败", res8);
					}
				} else {
					myHandleDeal("group4删除工作密钥失败", res7);
				}
			} else {
				myHandleDeal("group4更新工作密钥失败", res1);
			}

		} else {
			myHandleDeal("group4更新主密钥失败", res0);
		}

	}

	private void testgroup5() {
		myHandleDeal("testgroup5测试", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 75, innerkey1, 16);
		if (res0 == 0) {
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 75, 225, 1, ipIn, innerkey2, 16, ipOut, 16);
			if (res1 == 0) {
				myHandleDeal("更新工作密钥成功", res1);
			} else {
				myHandleDeal("group5更新工作密钥失败", res1);
			}

		} else {
			myHandleDeal("group5更新主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup6() {
		myHandleDeal("testgroup6测试", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x01, -1, innerkey1, 16);
		if (res0 == -6) {
			myHandleDeal("更新主密钥测试成功", res0);
		} else {
			myHandleDeal("group6更新主密钥测试失败", res0);
		}
		int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x01, -1, 0, 1, ipIn, innerkey2, 16, ipOut, 16);
		if (res1 == -6) {
			myHandleDeal("更新工作密钥测试成功", res1);
		} else {
			myHandleDeal("group6更新工作密钥测试失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup7() {
		myHandleDeal("testgroup7测试", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
		if (res0 == 0) {
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, -1, 1, ipIn, innerkey2, 16, ipOut, 16);
			if (res1 == -6) {
				myHandleDeal("更新工作密钥测试成功", res1);
			} else {
				myHandleDeal("group7更新工作密钥测试失败", res1);
			}
		} else {
			myHandleDeal("group7更新主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup8() {
		myHandleDeal("testgroup8测试", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 149, innerkey1, 16);
		if (res0 == 0) {
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 0, 1, ipIn, innerkey2, 16, ipOut, 16);
			if (res1 == 0) {
				myHandleDeal("更新工作密钥成功", res1);
			} else {
				myHandleDeal("group8更新工作密钥失败", res1);
			}
		} else {
			myHandleDeal("group8更新主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup9() {
		myHandleDeal("testgroup9测试", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 1, innerkey1, 16);
		if (res0 == 0) {
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 1, 450, 1, ipIn, innerkey2, 16, ipOut, 16);
			if (res1 == -6) {
				myHandleDeal("更新工作密钥测试成功", res1);
			} else {
				myHandleDeal("group9更新工作密钥测试失败", res1);
			}
		} else {
			myHandleDeal("group9更新主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup10() {
		myHandleDeal("testgroup10测试", 0);
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
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 149, 449, 0, ipIn, innerkey2, 16, ipOut, 16);
			int res2 = Ddi.ddi_innerkey_des_encrypt(0, 149, 0, ipIn, msg_summery, 16, DataOut);// 主密钥加密
			String data = ByteUtils.byteArray2HexString(DataOut);
			if (res2 == 0 && data.equals(data0)) {
				myHandleDeal("主密钥加密成功", res2);
			} else {
				myHandleDeal("group10主密钥加密失败", res2);
			}
			int res3 = Ddi.ddi_innerkey_delete_key(0, 149);
			if (res3 == 0) {
				myHandleDeal("删除主密钥成功", res3);
				int res4 = Ddi.ddi_innerkey_des_encrypt(0, 149, 0, ipIn, msg_summery, 16, DataOut);
				String data3 = ByteUtils.byteArray2HexString(DataOut);
				if (res4 == -6) {
					myHandleDeal("主密钥加密测试成功", res4);
				} else {
					myHandleDeal("group10删除秘钥后主密钥加密测试失败"+data3, res4);
				}
			} else {
				myHandleDeal("group10删除主密钥失败", res3);
			}
			if (res1 == 0) {
				myHandleDeal("更新工作密钥成功", res1);
				int res5 = Ddi.ddi_innerkey_des_encrypt(1, 449, 0, ipIn, msg_summery, 16, DataOut);// 工作密钥加密
				data = ByteUtils.byteArray2HexString(DataOut);
				if (res5 == 0 && data.equals(data1)) {
					myHandleDeal("工作密钥加密成功", res5);
				} else {
					myHandleDeal("group10工作密钥加密失败", res5);
				}
				int res6 = Ddi.ddi_innerkey_des_decrypt(1, 449, 0, 0, ipIn, msg_summery1, 16, DataOut);// 工作密钥解密
				data = ByteUtils.byteArray2HexString(DataOut);
				if (res6 == 0 && data.equals(data2)) {
					myHandleDeal("工作密钥解密成功", res6);
				} else {
					myHandleDeal("group10工作密钥解密失败", res6);

				}
				int res7 = Ddi.ddi_innerkey_delete_key(1, 449);
				if (res7 == 0) {
					myHandleDeal("删除工作密钥成功", res7);
					int res8 = Ddi.ddi_innerkey_des_encrypt(1, 449, 0, ipIn, msg_summery, 16, DataOut);
					if (res8 == -6) {
						myHandleDeal("工作密钥加密测试成功", res8);
					} else {
						myHandleDeal("group10工作密钥加密测试失败", res8);
					}
				} else {
					myHandleDeal("group10删除工作密钥失败", res7);
				}
			} else {
				myHandleDeal("group10更新工作密钥失败", res1);
			}

		} else {
			myHandleDeal("group10更新主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	// 新增加的 跟新工作秘钥IV为1
	private void testgroup51() {
		myHandleDeal("testgroup51测试", 0);
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
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x00, 149, 0, 1, ipIn, innerkey2, 8, ipOut, 8);
			if (res1 == 0) {
				myHandleDeal("更新工作秘钥成功", res1);
				int res5 = Ddi.ddi_innerkey_des_encrypt(1, 0, 0, ipIn, msg_summery, 16, DataOut);// 工作密钥加密
				String data = ByteUtils.byteArray2HexString(DataOut);
				if (res5 == 0 && data.equalsIgnoreCase(data0)) {
					myHandleDeal("更新工作秘钥加密成功", res5);
				} else {
					myHandleDeal("更新工作秘钥加密失败" + data, res5);
				}
			} else {
				myHandleDeal("更新工作秘钥失败", res1);
			}
		}
	}

//	// 新增加的 SM4更新工作秘钥IV=0
	private void testgroup52() {
		myHandleDeal("testgroup52测试", 0);
		String key4 = "ffffffffFFFFFFFFffffffffFFFFFFFF";
		byte[] innerkey4 = ByteUtils.hexString2ByteArray(key4);
		byte[] DataOut = new byte[16];
		String data0 = "EC2E4096473E89AFBD46ADD315411E50";
		byte[] msg_summery1 = ByteUtils.hexString2ByteArray("85e9d210105327171927e8303ef028e1");
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 0, innerkey4, 16);
		if (res0 == 0) {
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 0, 0, 0, ipIn, innerkey4, 16, ipOut, 16);
			if (res1 == 0) {
				myHandleDeal("更新工作秘钥成功", res1);
				int res5 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, 0, (byte) 0, ipIn, innerkey4, innerkey4.length, DataOut,
						leOut);// 工作密钥加密
				String data = ByteUtils.byteArray2HexString(DataOut);
				if (res5 == 0 && data.equalsIgnoreCase(data0)) {
					myHandleDeal("group52更新工作秘钥加密成功", res5);
				} else {
					myHandleDeal("group52更新工作秘钥加密失败" + data, res5);
				}
			} else {
				myHandleDeal("group52更新工作秘钥失败", res1);
			}
		}
	}
	//自定义的
//	private void testgroup52() {
//		myHandleDeal("testgroup52测试", 0);
//		//16位
//		String key4 = "ffffffffFFFFFFFFffffffffFFFFFFFF";
//		byte[] innerkey4 = ByteUtils.hexString2ByteArray(key4);
//		//24位
////		String key4 = "ffffffffFFFFFFFFffffffffFFFFFFFF3131313131313131";
////		byte[] innerkey4 = ByteUtils.hexString2ByteArray(key4);
//		//8位
////		String key4 = "3131313131313131";
////		byte[] innerkey4 = ByteUtils.hexString2ByteArray(key4);
//		byte[] DataOut = new byte[16];
//		String data0 = "EC2E4096473E89AFBD46ADD315411E50";
//		byte[] msg_summery1 = ByteUtils.hexString2ByteArray("85e9d210105327171927e8303ef028e1");
//		Ddi.ddi_innerkey_open();
////		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 0, innerkey4, 16);
////		if (res0 == 0) {
////			myHandleDeal("更新主密钥成功", res0);
////		}else {
////			myHandleDeal("更新主密钥失败", res0);
////		}
//		//IV =30303030abCDef99a1da25f1e411fea5
//		int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 56, 449, 0, ipIn, innerkey4, innerkey4.length, ipOut, innerkey4.length);
//		if (res1 == 0) {
//			myHandleDeal("更新工作秘钥成功", res1);
//
//			int res5 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, 0, (byte) 0, ipIn, innerkey4, innerkey4.length, DataOut,
//					leOut);// 工作密钥加密
//			String data = ByteUtils.byteArray2HexString(DataOut);
//			if (res5 == 0 && data.equalsIgnoreCase(data0)) {
//				myHandleDeal("group52更新工作秘钥加密成功", res5);
//			} else {
//				myHandleDeal("group52更新工作秘钥加密失败" + data, res5);
//			}
//		} else {
//			myHandleDeal("group52更新工作秘钥失败", res1);
//		}
//	}

	// 新增的 更新AES-128工作秘钥，IV=0
	private void testgroup53() {
		myHandleDeal("testgroup53测试", 0);
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
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x04, 77, 225, 0, ipIn, innerkey2, 16, innerkey1, 16);
			if (res1 == 0) {
				myHandleDeal("更新工作密钥加密成功", res1);
				int res2 = Ddi.ddi_innerkey_aes_encrypt(1, 225, (byte) 0, ipIn, m_plain, m_plain.length, cipher);
				String data1 = ByteUtils.byteArray2HexString(cipher);
				if (res2 == 0 && data1.equalsIgnoreCase(data)) {
					myHandleDeal("工作密钥加密成功", res2);
					int res3 = Ddi.ddi_innerkey_aes_decrypt(1, 225, 1, (byte) 0, ipIn, m_data, m_data.length, cipher1);
					String data2 = ByteUtils.byteArray2HexString(cipher1);
					if (res3 == 0 && data2.equalsIgnoreCase(plain)) {
						myHandleDeal("工作密钥解密成功", res3);
					} else {
						myHandleDeal("group53工作密钥解密失败" + data2, res3);
					}
				} else {
					myHandleDeal("group53工作密钥加密失败" + data1, res2);
				}
			} else {
				myHandleDeal("group53更新工作密钥失败", res1);
			}
		} else {
			myHandleDeal("group53更新主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	// 新增加的 更新所有主密钥长度错误
	private void testgroup54() {
		myHandleDeal("testgroup54测试", 0);
		// DES 长度7
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
		// 更新DES主秘钥长度错误
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
			myHandleDeal("group54测试成功", 0);
		} else {
			myHandleDeal("group54测试失败" + res0 + res1 + res2 + res3 + res4 + res5 + res6 + byteArray2HexString, res0);
		}

		Ddi.ddi_innerkey_close();
	}

	// 新增加的 更新所有工作秘钥长度错误
	private void testgroup55() {
		myHandleDeal("testgroup55测试", 0);
		// DES 长度7
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
		// 跟新工作秘钥
		// 少一位
		String key8 = "31313131313131";
		byte[] innerkey8 = ByteUtils.hexString2ByteArray(key8);
		// 多一位
		String key9 = "56248AAAAAAAAAAA9999efBCabcdEFBF31";
		byte[] innerkey9 = ByteUtils.hexString2ByteArray(key9);
		// 少一位
		String key10 = "56248AAAAAAAAAAA9999efBCabcdEFBF12345678abcdE3";
		byte[] innerkey10 = ByteUtils.hexString2ByteArray(key10);
		// 多一位
		String key11 = "56248AAAAAAAAAAA9999efBCabcdEFBF31";
		byte[] innerkey11 = ByteUtils.hexString2ByteArray(key11);
		// 少一位
		String key12 = "A12345678A12345678A12345678A12";
		byte[] innerkey12 = ByteUtils.hexString2ByteArray(key12);
		// 多一位
		String key13 = "A12345678A12345678A12345678A1234ABCDEF012345678ABDECF09876542331";
		byte[] innerkey13 = ByteUtils.hexString2ByteArray(key13);
		// 少一位
		String key14 = "A12345678A12345678A12345678A1234ABCDEF012345678ABDECF098765423";
		byte[] innerkey14 = ByteUtils.hexString2ByteArray(key14);
		String plain = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] m_plain = ByteUtils.hexString2ByteArray(plain);
		byte[] cipher = new byte[16];
		Ddi.ddi_innerkey_open();
		// 更新DES主秘钥长度错误
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x00, 0, innerkey1, 8);
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 1, innerkey2, 16);
		int res2 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 75, innerkey3, 24);
		int res3 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 2, innerkey4, 16);
		int res4 = Ddi.ddi_innerkey_update_mk((byte) 0x04, 77, innerkey5, 16);
		int res5 = Ddi.ddi_innerkey_update_mk((byte) 0x05, 58, innerkey6, 24);
		int res6 = Ddi.ddi_innerkey_update_mk((byte) 0x06, 149, innerkey7, 32);
		int res = res0 + res1 + res2 + res3 + res4 + res5 + res6;
		// 更新工作秘钥
		int res7 = Ddi.ddi_innerkey_update_wk((byte) 0x00, 0, 0, 1, ipIn, innerkey8, 8, ipOut, 8);
		//
		int res8 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 1, 449, 0, ipIn, innerkey9, 16, ipOut, 16);
		int res9 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 75, 225, 1, ipIn, innerkey10, 24, ipOut, 24);
		int res10 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 2, 449, 1, ipIn, innerkey11, 16, ipOut, 16);
		int res11 = Ddi.ddi_innerkey_update_wk((byte) 0x04, 77, 448, 1, ipIn, innerkey12, 16, ipOut, 16);
		// 这里更新工作秘钥需要32个长度
		int res12 = Ddi.ddi_innerkey_update_wk((byte) 0x05, 58, 225, 0, ipIn, innerkey13, 32, ipOut, 32);
		int res13 = Ddi.ddi_innerkey_update_wk((byte) 0x06, 149, 447, 1, ipIn, innerkey14, 32, ipOut, 32);

		if (res == 0 && res7 == -12 && res8 == 0 && res9 == -12 && res10 == 0 && res11 == -12 && res12 == 0
				&& res13 == -12) {
			myHandleDeal("group55测试成功", res);
		} else {
			myHandleDeal("group55更新工作秘钥失败" + res + res7 + res8 + res9 + res10 + res11 + res12 + res13, res13);
		}

		Ddi.ddi_innerkey_close();
	}

	private void testgroup56() {
		myHandleDeal("testgroup56测试", 0);
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
			myHandleDeal("group56跟新主密钥成功", res0);
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
				myHandleDeal("group56SM4加解密成功", res9);

			} else {
				myHandleDeal("SM4加解密失败" + res8 + res9 + res10 + res11 + res13 + res14, res9);

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
				myHandleDeal("group56SM4加解密成功", 0);

			} else {
				myHandleDeal("group56SM4SM4加解密失败" + res15 + res16 + res17 + res18, res18);

			}
		} else {
			myHandleDeal("group1更新主密钥失败" + res7 + res1 + res2 + res3 + res4 + res5 + res6, res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup57() {
		myHandleDeal("testgroup57测试", 0);
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
			myHandleDeal("group57跟新主密钥成功", res0);
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
				myHandleDeal("group57加解密成功", res9);

			} else {
				myHandleDeal("SM4加解密失败" + res8 + res9 + res10 + res11 + res13 + res14, res9);

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
				myHandleDeal("group57加解密成功", 0);

			} else {
				myHandleDeal("SM4加解密失败" + res15 + res16 + res17 + res18, res18);

			}
		} else {
			myHandleDeal("group1更新主密钥失败" + res7 + res1 + res2 + res3 + res4 + res5 + res6, res0);
		}
		Ddi.ddi_innerkey_close();
	}

	// SM4工作秘钥加解密
	private void testgroup58() {
		myHandleDeal("testgroup58测试", 0);
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
			myHandleDeal("group56跟新工作密钥成功", res0);
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
				myHandleDeal("group58SM4加解密成功", res9);

			} else {
				myHandleDeal("SM4加解密失败" + res7 + res9 + res10 + res11 + res13 + res14, res9);
				myHandleDeal("SM4加解密失败" + "==" + byteArray2HexString1 + "==" + byteArray2HexString2 + "=="
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
				myHandleDeal("group58SM4加解密成功", 0);

			} else {
				myHandleDeal("SM4加解密失败" + res15 + res16 + res17 + res18, res18);

			}
		} else {
			myHandleDeal("group1更新工作秘钥失败" + res7 + res1 + res2 + res3 + res4 + res5 + res6, res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup59() {
		myHandleDeal("testgroup59测试", 0);
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
			myHandleDeal("group56跟新工作密钥成功", res0);
			// 工作秘钥明文：58DAD7224B1CC6B504DB93AF981D0BAC
			int res8 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, 75, (byte) 1, ipIn, innerkey2, innerkey2.length, DataOut,
					leOut);
			int res9 = Ddi.ddi_innerkey_nes_sm4_decrypt(1, 75, 148, (byte) 1, ipIn, DataOut, DataOut.length, ipOut,
					leOut);
			String byteArray2HexString1 = ByteUtils.byteArray2HexString(DataOut);
			// 工作秘钥明文：0C0347F95FFB5F61E734E6A36E273E04
			int res10 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, 100, (byte) 1, ipIn, innerkey5, innerkey5.length, DataOut,
					leOut);
			int res11 = Ddi.ddi_innerkey_nes_sm4_decrypt(1, 100, 148, (byte) 1, ipIn, DataOut, DataOut.length, ipOut,
					leOut);
			String byteArray2HexString2 = ByteUtils.byteArray2HexString(DataOut);
			// 工作秘钥明文：CBAFD264D221EC69F43D95483877B583
			int res13 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, 99, (byte) 1, ipIn, innerkey5, innerkey5.length, DataOut,
					leOut);
			int res14 = Ddi.ddi_innerkey_nes_sm4_decrypt(1, 99, 148, (byte) 1, ipIn, DataOut, DataOut.length, ipOut,
					leOut);
			String byteArray2HexString3 = ByteUtils.byteArray2HexString(DataOut);

			if (res8 == -6 && res9 == -6 && res10 == 0 && res11 == 0 && byteArray2HexString2.equalsIgnoreCase(data1)
					&& res13 == -6 && res14 == -6) {
				myHandleDeal("group56SM4加解密成功", res9);

			} else {
				myHandleDeal("SM4加解密失败" + res7 + res9 + res10 + res11 + res13 + res14, res9);
				myHandleDeal("SM4加解密失败" + "==" + byteArray2HexString1 + "==" + byteArray2HexString2 + "=="
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
				myHandleDeal("group59SM4加解密成功", 0);

			} else {
				myHandleDeal("SM4加解密失败" + res15 + res16 + res17 + res18, res18);

			}
		} else {
			myHandleDeal("group1更新工作秘钥失败" + res7 + res1 + res2 + res3 + res4 + res5 + res6, res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup60() {
		myHandleDeal("testgroup60测试", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		String data = "9235C9791D2AD415D70C674B6ECB194F";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] DataOut = new byte[16];
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_delete_key(0, 1);
		if (res0 == 0) {
			myHandleDeal("删除主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
			if (res1 == 0) {
				myHandleDeal("更新主密钥测试成功", res1);
				int res2 = Ddi.ddi_innerkey_des_decrypt(0, 0, 1, 1, ipIn, innerkey1, 16, ipOut);
				if (res2 == 0) {
					myHandleDeal("主密钥解密成功", res2);
					int res3 = Ddi.ddi_innerkey_des_encrypt(0, 1, 1, ipIn, innerkey1, 16, DataOut);
					String data1 = ByteUtils.byteArray2HexString(DataOut);
					if (res3 == 0 && data1.equalsIgnoreCase(data)) {
						myHandleDeal("主密钥加密成功", res3);
					} else {
						myHandleDeal("group60主密钥加密失败" + data1, res3);
					}
				} else {
					myHandleDeal("group60主密钥解密失败", res2);
				}
			} else {
				myHandleDeal("group60更新主密钥测试失败", res1);
			}
		} else {
			myHandleDeal("group60删除主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
		
	}

	private void testgroup61() {
		myHandleDeal("testgroup61测试", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF12345678abcdEFBF";
		String data = "0C7C1C0045D30B8294D146DB904C6A0B56C497A6C832AB1E";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] DataOut = new byte[24];
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_delete_key(0, 1);
		if (res0 == 0) {
			myHandleDeal("删除主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 0, innerkey1, 24);
			if (res1 == 0) {
				myHandleDeal("更新主密钥测试成功", res1);
				int res2 = Ddi.ddi_innerkey_des_decrypt(0, 0, 1, 1, ipIn, innerkey1, 24, ipOut);
				if (res2 == 0) {
					myHandleDeal("主密钥解密成功", res2);
					int res3 = Ddi.ddi_innerkey_des_encrypt(0, 1, 1, ipIn, innerkey1, 24, DataOut);
					String data1 = ByteUtils.byteArray2HexString(DataOut);
					if (res3 == 0 && data1.equalsIgnoreCase(data)) {
						myHandleDeal("主密钥加密成功", res3);
					} else {
						myHandleDeal("group61主密钥加密失败", res3);
					}
				} else {
					myHandleDeal("group61主密钥解密失败", res2);
				}
			} else {
				myHandleDeal("group61更新主密钥测试失败", res1);
			}
		} else {
			myHandleDeal("group61删除主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup62() {
		myHandleDeal("testgroup62测试", 0);
		String key1 = "12345678abcdEFBF";
		String data = "24FCC3DE711A4251";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] DataOut = new byte[8];
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_delete_key(0, 1);
		if (res0 == 0) {
			myHandleDeal("删除主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x00, 0, innerkey1, 8);
			if (res1 == 0) {
				myHandleDeal("更新主密钥测试成功", res1);
				int res2 = Ddi.ddi_innerkey_des_decrypt(0, 0, 1, 1, ipIn, innerkey1, 8, ipOut);
				if (res2 == 0) {
					myHandleDeal("主密钥解密成功", res2);
					int res3 = Ddi.ddi_innerkey_des_encrypt(0, 1, 1, ipIn, innerkey1, 8, DataOut);
					String data1 = ByteUtils.byteArray2HexString(DataOut);
					if (res3 == 0 && data1.equalsIgnoreCase(data)) {
						myHandleDeal("主密钥加密成功", res3);
					} else {
						myHandleDeal("group62主密钥加密失败", res3);
					}
				} else {
					myHandleDeal("group62主密钥解密失败", res2);
				}
			} else {
				myHandleDeal("group62更新主密钥测试失败", res1);
			}
		} else {
			myHandleDeal("group62删除主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}
    //2020.05.19 N5S 增加最大传输数据为4096
	// 2019.10.22 内置密钥运算接口(DES,SM4,AES)、DUKPT数据加密及MAC计算最大输入待运算数据长度修改为2048;
	// DES算法 主密钥ECB和CBC模式加密和解密数据长度2048
	private void testgroup124() {
	
		
		//2048
		myHandleDeal("testgroup124测试", 0);
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
			myHandleDeal("group124删除主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x00, 0, innerkey1, 8);
			if (res1 == 0) {
				myHandleDeal("group124更新主密钥测试成功", res1);
				int res6 = Ddi.ddi_innerkey_update_wk((byte) 0x00, 0, 449, 1, ipIn, innerkey3, 8, ipOut, 8);
				myHandleDeal("group124CBC更新工作秘钥成功", res6);
				// DES CBC
				int res2 = Ddi.ddi_innerkey_des_decrypt(1, 449, 1, 1, ipIn, innerkey2, innerkey2.length, ipOut1);
				if (res2 == 0) {
					myHandleDeal("group124CBC主密钥解密成功", res2);
					int res3 = Ddi.ddi_innerkey_des_encrypt(1, 449, 1, ipIn, ipOut1, ipOut1.length, ipOut1);
					String data1 = ByteUtils.byteArray2HexString(ipOut1);
					if (res3 == 0 && data1.equalsIgnoreCase(ParaEntity.dataString2048)) {
						myHandleDeal("group124CBC主密钥加密成功", res3);
					} else {
						myHandleDeal("group124CBC主密钥加密失败", res3);
					}
				} else {
					myHandleDeal("group124CBC主密钥解密失败", res2);
				}
				// DES ECB
				int res4 = Ddi.ddi_innerkey_des_decrypt(1, 449, 1, 0, ipIn, innerkey2, innerkey2.length, ipOut1);
				if (res4 == 0) {
					myHandleDeal("group124ECB主密钥解密成功", res4);
					int res5 = Ddi.ddi_innerkey_des_encrypt(1, 449, 0, ipIn, ipOut1, ipOut1.length, ipOut1);
					String data1 = ByteUtils.byteArray2HexString(ipOut1);
					if (res5 == 0 && data1.equalsIgnoreCase(ParaEntity.dataString2048)) {
						myHandleDeal("group124ECB主密钥加密成功", res5);
					} else {
						myHandleDeal("group124ECB主密钥加密失败", res5);
					}
				} else {
					myHandleDeal("group124ECB主密钥解密失败", res4);
				}
				
			} else {
				myHandleDeal("group124更新主密钥测试失败", res1);
			}
		} else {
			myHandleDeal("group124删除主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
		
	}

	// 2DES算法 主密钥ECB和CBC模式加密和解密数据长度2048
	private void testgroup125() {
		
		
	
		
		//4096
		myHandleDeal("testgroup125测试", 0);
		String key1 = "31313131313131313131313131313131";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(ParaEntity.dataString2048);
		
		byte[] ipOut1 = new byte[2048];
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_delete_key(0, 1);
		if (res0 == 0) {
			myHandleDeal("group125删除主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
			int res6 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 0, 0, ipIn, innerkey1, 16, ipOut, 16);
			if (res1 == 0 && res6 == 0) {
				myHandleDeal("group125更新主密钥和工作秘钥测试成功", res1);
				// DES CBC
				int res2 = Ddi.ddi_innerkey_des_decrypt(1, 0, 1, 1, ipIn, innerkey2, innerkey2.length, ipOut1);
				if (res2 == 0) {
					myHandleDeal("group125CBC主密钥解密成功", res2);
					int res3 = Ddi.ddi_innerkey_des_encrypt(1, 0, 1, ipIn, ipOut1, ipOut1.length, ipOut1);
					String data1 = ByteUtils.byteArray2HexString(ipOut1);
					if (res3 == 0 && data1.equalsIgnoreCase(ParaEntity.dataString2048)) {
						myHandleDeal("group125CBC主密钥加密成功", res3);
					} else {
						myHandleDeal("group125CBC主密钥加密失败", res3);
					}
				} else {
					myHandleDeal("group125CBC主密钥解密失败", res2);
				}
				// DES ECB
				int res4 = Ddi.ddi_innerkey_des_decrypt(1, 0, 1, 0, ipIn, innerkey2, innerkey2.length, ipOut1);
				if (res4 == 0) {
					myHandleDeal("group125ECB主密钥解密成功", res4);
					int res5 = Ddi.ddi_innerkey_des_encrypt(1, 0, 0, ipIn, ipOut1, ipOut1.length, ipOut1);
					String data1 = ByteUtils.byteArray2HexString(ipOut1);
					if (res5 == 0 && data1.equalsIgnoreCase(ParaEntity.dataString2048)) {
						myHandleDeal("group125ECB主密钥加密成功", res5);
					} else {
						myHandleDeal("group125ECB主密钥加密失败", res5);
					}
				} else {
					myHandleDeal("group125ECB主密钥解密失败", res4);
				}
				
			} else {
				myHandleDeal("group125更新主密钥测试失败", res1);
			}
		} else {
			myHandleDeal("group125删除主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	// 3DES算法 主密钥ECB和CBC模式加密和解密数据长度2048
	private void testgroup126() {
	
//
		
		//2048
		myHandleDeal("testgroup126测试", 0);
		String key1 = "313131313131313131313131313131313131313131313131";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(ParaEntity.dataString2048);
		
		byte[] ipOut1 = new byte[2048];
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_delete_key(0, 1);
		if (res0 == 0) {
			myHandleDeal("group126删除主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 0, innerkey1, 24);
			int res6 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 0, 250, 0, ipIn, innerkey1, innerkey1.length, ipOut, 24);
			if (res1 == 0 && res6 == 0) {
				myHandleDeal("group126更新主密钥测试成功", res1);
				// DES CBC
				int res2 = Ddi.ddi_innerkey_des_decrypt(1, 250, 1, 1, ipIn, innerkey2, innerkey2.length, ipOut1);
				if (res2 == 0) {
					myHandleDeal("group126CBC主密钥解密成功", res2);
					int res3 = Ddi.ddi_innerkey_des_encrypt(1, 250, 1, ipIn, ipOut1, ipOut1.length, ipOut1);
					String data1 = ByteUtils.byteArray2HexString(ipOut1);
					if (res3 == 0 && data1.equalsIgnoreCase(ParaEntity.dataString2048)) {
						myHandleDeal("group126CBC主密钥加密成功", res3);
					} else {
						myHandleDeal("group126CBC主密钥加密失败", res3);
					}
				} else {
					myHandleDeal("group126CBC主密钥解密失败", res2);
				}
				// DES ECB
				int res4 = Ddi.ddi_innerkey_des_decrypt(1, 250, 1, 0, ipIn, innerkey2, innerkey2.length, ipOut1);
				if (res4 == 0) {
					myHandleDeal("group126ECB主密钥解密成功", res4);
					int res5 = Ddi.ddi_innerkey_des_encrypt(1, 250, 0, ipIn, ipOut1, ipOut1.length, ipOut1);
					String data1 = ByteUtils.byteArray2HexString(ipOut1);
					if (res5 == 0 && data1.equalsIgnoreCase(ParaEntity.dataString2048)) {
						myHandleDeal("group126ECB主密钥加密成功", res5);
					} else {
						myHandleDeal("group126ECB主密钥加密失败", res5);
					}
				} else {
					myHandleDeal("group126ECB主密钥解密失败", res4);
				}
				
			} else {
				myHandleDeal("group126更新主密钥测试失败", res1);
			}
		} else {
			myHandleDeal("group126删除主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	// SM4算法 主密钥ECB和CBC模式加密和解密数据长度2048
	private void testgroup127() {
	
		//2048
		myHandleDeal("testgroup127测试", 0);
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
			myHandleDeal("group127删除主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 149, innerkey1, 16);
			int res6 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 149, 253, 0, ipIn, innerkey1, innerkey1.length, ipOut,
					16);
			if (res1 == 0 && res6 == 0) {
				myHandleDeal("group127更新主密钥测试成功", res1);
				// SM4 CBC
				int res2 = Ddi.ddi_innerkey_nes_sm4_decrypt(1, 253, 1, (byte) 0x01, ipIn, innerkey2, innerkey2.length,
						ipOut1, leOut);
				if (res2 == 0) {
					myHandleDeal("group127CBC主密钥解密成功", res2);
					int res3 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, 253, (byte) 0x01, ipIn, ipOut1, ipOut1.length,
							ipOut1, leOut);
					String data2 = ByteUtils.byteArray2HexString(ipOut1);
					
					if (res3 == 0 && data2.equalsIgnoreCase(ParaEntity.dataString2048)) {
						myHandleDeal("group127CBC主密钥加密成功", res3);
					} else {
						myHandleDeal("group127CBC主密钥加密失败", res3);
					}
				} else {
					myHandleDeal("group127CBC主密钥解密失败", res2);
				}
				// SM4 ECB
				int res4 = Ddi.ddi_innerkey_nes_sm4_decrypt(1, 253, 1, (byte) 0x01, ipIn, innerkey2, innerkey2.length,
						ipOut1, leOut);
				if (res4 == 0) {
					myHandleDeal("group127ECB主密钥解密成功", res4);
					int res5 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, 253, (byte) 0x01, ipIn, ipOut1, ipOut1.length,
							ipOut1, leOut);
					String data2 = ByteUtils.byteArray2HexString(ipOut1);
					if (res5 == 0 && data2.equalsIgnoreCase(ParaEntity.dataString2048)) {
						myHandleDeal("group127ECB主密钥加密成功", res5);
					} else {
						myHandleDeal("group127ECB主密钥加密失败", res5);
					}
				} else {
					myHandleDeal("group127ECB主密钥解密失败", res4);
				}
			} else {
				myHandleDeal("group127更新主密钥失败", res1);
			}
		} else {
			myHandleDeal("group127删除主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	// AES128算法 主密钥ECB和CBC模式加密和解密数据长度2048
	private void testgroup128() {
		
		//2048
		myHandleDeal("testgroup128测试", 0);
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
			myHandleDeal("group128更新主密钥成功", res0);
			// AES ECB
			int res1 = Ddi.ddi_innerkey_aes_encrypt(1, 300, (byte) 0, ipIn, m_plain, m_plain.length, cipher);
			if (res1 == 0) {
				myHandleDeal("group128ECB主密钥加密成功", res1);
				int res3 = Ddi.ddi_innerkey_aes_decrypt(1, 300, 1, (byte) 0, ipIn, cipher, cipher.length, cipher1);
				String data2 = ByteUtils.byteArray2HexString(cipher1);
//				String data3 = data2.substring(0, 4096);
				if (res3 == 0 && data2.equalsIgnoreCase(ParaEntity.dataString2048)) {
					myHandleDeal("group128ECB主密钥解密成功", res3);
					
				} else {
					myHandleDeal("group128ECB主密钥解密失败" + data2, res3);
					
				}
			} else {
				myHandleDeal("group128ECB主密钥加密失败", res1);
			}
			// AES-128 CBC
			int res4 = Ddi.ddi_innerkey_aes_encrypt(1, 300, (byte) 1, ipIn, m_plain, m_plain.length, cipher);
			if (res4 == 0) {
				myHandleDeal("group128CBC主密钥加密成功", res4);
				int res3 = Ddi.ddi_innerkey_aes_decrypt(1, 300, 1, (byte) 1, ipIn, cipher, cipher.length, cipher1);
				String data2 = ByteUtils.byteArray2HexString(cipher1);
				if (res3 == 0 && data2.equalsIgnoreCase(ParaEntity.dataString2048)) {
					myHandleDeal("group128CBC主密钥解密成功", res3);
					
				} else {
					myHandleDeal("group128CBC主密钥解密失败", res3);
					
				}
			} else {
				myHandleDeal("group128CBC主密钥加密失败", res4);
			}
			
		} else {
			myHandleDeal("group28更新主密钥失败", res0);
		}
		
		Ddi.ddi_innerkey_close();
	}

	// AES192算法 主密钥ECB和CBC模式加密和解密数据长度2048
	private void testgroup129() {
		//4096
//		myHandleDeal("testgroup129测试", 0);
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
//			myHandleDeal("group129更新主密钥成功", res0);
//			// AES ECB
//			int res1 = Ddi.ddi_innerkey_aes_encrypt(1, 400, (byte) 0, ipIn, m_plain, m_plain.length, cipher);
//			if (res1 == 0) {
//				myHandleDeal("group129ECB主密钥加密成功", res1);
//				int res3 = Ddi.ddi_innerkey_aes_decrypt(1, 400, 1, (byte) 0, ipIn, cipher, cipher.length, cipher1);
//				String data2 = ByteUtils.byteArray2HexString(cipher1);
////				String data3 = data2.substring(0, 4096);
//				if (res3 == 0 && data2.equalsIgnoreCase(ParaEntity.dataString2048)) {
//					myHandleDeal("group129ECB主密钥解密成功", res3);
//
//				} else {
//					myHandleDeal("group129ECB主密钥解密失败" + data2, res3);
//
//				}
//			} else {
//				myHandleDeal("group129ECB主密钥加密失败", res1);
//			}
//			// AES-128 CBC
//			int res4 = Ddi.ddi_innerkey_aes_encrypt(1, 400, (byte) 1, ipIn, m_plain, m_plain.length, cipher);
//			if (res4 == 0) {
//				myHandleDeal("group129CBC主密钥加密成功", res4);
//				int res3 = Ddi.ddi_innerkey_aes_decrypt(1, 400, 1, (byte) 1, ipIn, cipher, cipher.length, cipher1);
//				String data2 = ByteUtils.byteArray2HexString(cipher1);
//				if (res3 == 0 && data2.equalsIgnoreCase(ParaEntity.dataString2048)) {
//					myHandleDeal("group129CBC主密钥解密成功", res3);
//
//				} else {
//					myHandleDeal("group129CBC主密钥解密失败", res3);
//
//				}
//			} else {
//				myHandleDeal("group129CBC主密钥加密失败", res4);
//			}
//
//		} else {
//			myHandleDeal("group129更新主密钥失败", res0);
//		}
//
//		Ddi.ddi_innerkey_close();
		
		//2048
		myHandleDeal("testgroup129测试", 0);
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
			myHandleDeal("group129更新主密钥成功", res0);
			// AES ECB
			int res1 = Ddi.ddi_innerkey_aes_encrypt(1, 400, (byte) 0, ipIn, m_plain, m_plain.length, cipher);
			if (res1 == 0) {
				myHandleDeal("group129ECB主密钥加密成功", res1);
				int res3 = Ddi.ddi_innerkey_aes_decrypt(1, 400, 1, (byte) 0, ipIn, cipher, cipher.length, cipher1);
				String data2 = ByteUtils.byteArray2HexString(cipher1);
//				String data3 = data2.substring(0, 4096);
				if (res3 == 0 && data2.equalsIgnoreCase(ParaEntity.dataString2048)) {
					myHandleDeal("group129ECB主密钥解密成功", res3);
					
				} else {
					myHandleDeal("group129ECB主密钥解密失败" + data2, res3);
					
				}
			} else {
				myHandleDeal("group129ECB主密钥加密失败", res1);
			}
			// AES-128 CBC
			int res4 = Ddi.ddi_innerkey_aes_encrypt(1, 400, (byte) 1, ipIn, m_plain, m_plain.length, cipher);
			if (res4 == 0) {
				myHandleDeal("group129CBC主密钥加密成功", res4);
				int res3 = Ddi.ddi_innerkey_aes_decrypt(1, 400, 1, (byte) 1, ipIn, cipher, cipher.length, cipher1);
				String data2 = ByteUtils.byteArray2HexString(cipher1);
				if (res3 == 0 && data2.equalsIgnoreCase(ParaEntity.dataString2048)) {
					myHandleDeal("group129CBC主密钥解密成功", res3);
					
				} else {
					myHandleDeal("group129CBC主密钥解密失败", res3);
					
				}
			} else {
				myHandleDeal("group129CBC主密钥加密失败", res4);
			}
			
		} else {
			myHandleDeal("group129更新主密钥失败", res0);
		}
		
		Ddi.ddi_innerkey_close();
	}

	// AES256算法 主密钥ECB和CBC模式加密和解密数据长度2048
	private void testgroup130() {
		
		//2048
		myHandleDeal("testgroup130测试", 0);
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
			myHandleDeal("group130更新主密钥成功", res0);
			// AES ECB
			int res1 = Ddi.ddi_innerkey_aes_encrypt(1, 300, (byte) 0, ipIn, m_plain, m_plain.length, cipher);
			if (res1 == 0) {
				myHandleDeal("group130ECB主密钥加密成功", res1);
				int res3 = Ddi.ddi_innerkey_aes_decrypt(1, 300, 1, (byte) 0, ipIn, cipher, cipher.length, cipher1);
				String data2 = ByteUtils.byteArray2HexString(cipher1);
//				String data3 = data2.substring(0, 4096);
				if (res3 == 0 && data2.equalsIgnoreCase(ParaEntity.dataString2048)) {
					myHandleDeal("group130ECB主密钥解密成功", res3);
				} else {
					myHandleDeal("group130ECB主密钥解密失败" + data2, res3);
				}
			} else {
				myHandleDeal("group130ECB主密钥加密失败", res1);
			}
			// AES-128 CBC
			int res4 = Ddi.ddi_innerkey_aes_encrypt(1, 300, (byte) 1, ipIn, m_plain, m_plain.length, cipher);
			if (res4 == 0) {
				myHandleDeal("group130CBC主密钥加密成功", res4);
				int res3 = Ddi.ddi_innerkey_aes_decrypt(1, 300, 1, (byte) 1, ipIn, cipher, cipher.length, cipher1);
				String data2 = ByteUtils.byteArray2HexString(cipher1);
				if (res3 == 0 && data2.equalsIgnoreCase(ParaEntity.dataString2048)) {
					myHandleDeal("group130CBC主密钥解密成功", res3);
					
				} else {
					myHandleDeal("group130CBC主密钥解密失败", res3);
					
				}
			} else {
				myHandleDeal("group130CBC主密钥加密失败", res4);
			}
			
		} else {
			myHandleDeal("group130更新主密钥失败", res0);
		}
		
		Ddi.ddi_innerkey_close();
	}

	// AES256算法 主密钥ECB和CBC模式加密和解密数据长度大于2048
	private void testgroup131() {
	
		//2048
		myHandleDeal("testgroup131测试", 0);
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
			myHandleDeal("group131更新主密钥成功", res0);
			// AES ECB
			int res1 = Ddi.ddi_innerkey_aes_encrypt(1, 300, (byte) 0, ipIn, m_plain, m_plain.length, cipher);
			if (res1 == -6) {
				myHandleDeal("group131ECB主密钥加密成功", res1);
				int res3 = Ddi.ddi_innerkey_aes_decrypt(1, 300, 1, (byte) 0, ipIn, cipher, cipher.length, cipher1);
				
//				String data3 = data2.substring(0, 4096);
				if (res3 == -6) {
					myHandleDeal("group131ECB主密钥解密成功", res3);
				} else {
					myHandleDeal("group131ECB主密钥解密失败", res3);
				}
			} else {
				myHandleDeal("group131ECB主密钥加密失败", res1);
			}
			// AES-128 CBC
			int res4 = Ddi.ddi_innerkey_aes_encrypt(1, 300, (byte) 1, ipIn, m_plain, m_plain.length, cipher);
			if (res4 == -6) {
				myHandleDeal("group131CBC主密钥加密成功", res4);
				int res3 = Ddi.ddi_innerkey_aes_decrypt(1, 300, 1, (byte) 1, ipIn, cipher, cipher.length, cipher1);
				
				if (res3 == -6) {
					myHandleDeal("group131CBC主密钥解密成功", res3);
					
				} else {
					myHandleDeal("group131CBC主密钥解密失败", res3);
					
				}
			} else {
				myHandleDeal("group131CBC主密钥加密失败", res4);
			}
			
		} else {
			myHandleDeal("group131更新主密钥失败", res0);
		}
		
		Ddi.ddi_innerkey_close();
	}

	// 3DES算法 主密钥ECB和CBC模式加密和解密数据长度2048循环压力测试200次
	private void testgroup132() {
		myHandleDeal("testgroup132测试", 0);
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
						myHandleDeal("group132更新主密钥测试成功" + i, res1);
						// DES CBC
						int res2 = Ddi.ddi_innerkey_des_decrypt(1, 333, 1, 1, ipIn, innerkey2, innerkey2.length,
								ipOut1);
						if (res2 == 0) {
							myHandleDeal("group132CBC主密钥解密成功" + i, res2);
							int res3 = Ddi.ddi_innerkey_des_encrypt(1, 333, 1, ipIn, ipOut1, ipOut1.length, ipOut1);
							String data1 = ByteUtils.byteArray2HexString(ipOut1);
							if (res3 == 0 && data1.equalsIgnoreCase(ParaEntity.dataString2048)) {
								myHandleDeal("group132CBC主密钥加密成功" + i, res3);
							} else {
								myHandleDeal("group132CBC主密钥加密失败" + i, res3);
							}
						} else {
							myHandleDeal("group132CBC主密钥解密失败" + i, res2);
						}
						// DES ECB
						int res4 = Ddi.ddi_innerkey_des_decrypt(1, 333, 1, 0, ipIn, innerkey2, innerkey2.length,
								ipOut1);
						if (res4 == 0) {
							myHandleDeal("group132ECB主密钥解密成功" + i, res4);
							int res5 = Ddi.ddi_innerkey_des_encrypt(1, 333, 0, ipIn, ipOut1, ipOut1.length, ipOut1);
							String data1 = ByteUtils.byteArray2HexString(ipOut1);
							if (res5 == 0 && data1.equalsIgnoreCase(ParaEntity.dataString2048)) {
								myHandleDeal("group132ECB主密钥加密成功" + i, res5);
							} else {
								myHandleDeal("group132ECB主密钥加密失败" + i, res5);
							}
						} else {
							myHandleDeal("group132ECB主密钥解密失败" + i, res4);
						}

					} else {
						myHandleDeal("group132更新主密钥测试失败" + i, res1);
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
	
	//9、	增加ddi_pinpad_getchkvalue
 /***
  * int keytype 的值
  * #define KEYTYPE_MK        0x00000000   0
#define KEYTYPE_WK            0x00000001   1
#define KEYTYPE_BDK           0x00000010   16
#define KEYTYPE_KSN           0x00000011   17
#define KEYTYPE_SC_KEY        0x00000020   32
#define KEYTYPE_CT_EKEY       0x00000021   33
#define KEYTYPE_CT_AKEY       0x00000022   34
 * 
 *///获取主密钥和工作秘钥的KCV值
	private void testgroup133() {
		myHandleDeal("testgroup133测试", 0);
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
			myHandleDeal("group133更新主密钥成功", res0);
			//工作秘钥明文：7BC659AAA8FD94477B4C94EA63C416D4
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 0, 0, ipIn, innerkey2, 16, ipOut, 16);
			if (res1 == 0) {
				myHandleDeal("group133更新工作密钥测试成功", res1);
			} else {
				myHandleDeal("group133更新工作密钥测试失败", res1);
			}
			int res2 = Ddi.ddi_pinpad_getchkvalue(0, 0, 0, 0, leOut,output);
			String byteArray2HexString = ByteUtils.byteArray2HexString(output);
			if (res2  == 0 && key3.equalsIgnoreCase(byteArray2HexString)) {
				myHandleDeal("group133主密钥KCV成功" , res2);
			} else {
				myHandleDeal("group133主秘钥KCV失败"+byteArray2HexString, res2);
			}
			int res3 = Ddi.ddi_pinpad_getchkvalue(0, 1, 0, 0, leOut,output);
			String byteArray2HexString2 = ByteUtils.byteArray2HexString(output);
			if (res3  == 0 && byteArray2HexString2.equalsIgnoreCase(key4)) {
				myHandleDeal("group133工作密钥KCV成功"  , res3);
			} else {
				myHandleDeal("group133工作秘钥KCV失败"+byteArray2HexString2, res3);
			}
		} else {
			myHandleDeal("group133更新主密钥失败", res0);
		}

	}
	//同一个索引区重复注入不同的密钥类型
	private void testgroup134() {
		myHandleDeal("testgroup134测试", 0);
//		myHandleDeal("testgroup134开始执行了", -99);
		//16个字节长度
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF";
		final byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		//8个字节长度
		String key2 = "56248AAAAAAAAAAa";
		final byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		//24个字节长度
		String key3 = "12345678abcdEFBFABCDefBCabcdEFBF9999efBCabcdEFBF";
		final String data = "4FF940847C9059ABA3FB28ACC694AC9B";
		final byte[] innerkey3 = ByteUtils.hexString2ByteArray(key3);
		//32个字节长度数据
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
						myHandleDeal("group134更新DES主密钥成功" + i, res1);
					} else {
						myHandleDeal("group134更新DES主密钥失败" + i, res1);
					}
//					myHandleDeal("group134子线程开始了" + i, -99);
					
					int res2 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, innerkey1.length);
					if (res2 == 0) {
						myHandleDeal("group134更新DES-16主密钥成功" + i, res2);
					} else {
						myHandleDeal("group134更新DES-16主密钥失败" + i, res2);
					}
					int res3 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 0, innerkey3, innerkey3.length);
					if (res3 == 0) {
						myHandleDeal("group134更新DES-24主密钥成功" + i, res3);
					} else {
						myHandleDeal("group134更新DES-24主密钥失败" + i, res3);
					}
					int res4 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 0, innerkey1, innerkey1.length);
					if (res4 == 0) {
						myHandleDeal("group134更新SM4主密钥成功" + i, res4);
					} else {
						myHandleDeal("group134更新SM4主密钥失败" + i, res4);
					}
					if (!MainActivity.model.equalsIgnoreCase("N3")) {
						int res5 = Ddi.ddi_innerkey_update_mk((byte) 0x04, 0, innerkey1, 16);
						if (res5 == 0) {
							myHandleDeal("group134更新AES-128主密钥成功" + i, res5);
						} else {
							myHandleDeal("group134更新AES-128主密钥失败" + i, res5);
						}
						int res6 = Ddi.ddi_innerkey_update_mk((byte) 0x05, 0, innerkey4, 24);
						if (res6 == 0) {
							myHandleDeal("group134更新AES-192主密钥成功", res6);
						} else {
							myHandleDeal("group134更新AES-192主密钥失败", res6);
						}
						int res7 = Ddi.ddi_innerkey_update_mk((byte) 0x06, 0, innerkey4, 32);
						if (res7 == 0) {
							myHandleDeal("group134更新AES-256主密钥成功", res7);
						} else {
							myHandleDeal("group134更新AES-256主密钥失败", res7);
						}

						int res8 = Ddi.ddi_innerkey_aes_encrypt(0, 0, (byte) 1, ipIn, innerkey1, innerkey1.length,
								cipher);
						String data2 = ByteUtils.byteArray2HexString(cipher);
						if (res8 == 0 && data2.equalsIgnoreCase(data)) {
							myHandleDeal("group134主密钥加密成功", res8);
						} else {
							myHandleDeal("group134主密钥加密失败" + data2, res8);
						}
					} else {
						//				myHandleDeal("终端"+MainActivity.model+"不支持AES算法", -99);
						Log.v("TAG", "终端" + MainActivity.model + "不支持AES算法");

					}
					//30303030abCDef99a1da25f1e411fea5 ipIn
					int res9 = Ddi.ddi_innerkey_aes_decrypt(0, 0, 1, (byte) 1, ipIn, innerkey1, innerkey1.length,cipher);
					if (res9 == 0) {
						myHandleDeal("group134主密钥解密成功", res9);
					} else {
						myHandleDeal("group134主密钥解密失败", res9);
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
	//2020.03.24N3新增增加底层使用内置密钥计算X9.19和CBC MAC的功能，实现于内置密钥控制接口内;
	//使用SMARt工具进行计算,
	//CBC 其实就是秘钥DES加密数据后去后面8字节数据
	//由于N3没有做算法区分，SM4也是支持的，但是N5S是不支持的
	//2DES，CBC 最大索引   加密最小数据31
	private void testgroup135() {
		myHandleDeal("testgroup135测试", 0);
		String key1 = "31313131313131313131313131313131";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "00000000000000000000000000000000";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		//04是CBC 05 X9.19
		String data = "04"+"00000000"+"C1010000"+"01000000"+"31";
		//异常测试数据
//		String data = "04"+"00000000"+"C1010000"+"28000000"+"01234567890123456789012345678901234567890123456789012345678901234567890123456789";
		byte[] lParam = ByteUtils.hexString2ByteArray(data);
		int[] wplen=new int[1];
		byte[] wParam=new byte[8];
//		int lplen=14;
		String MACdata="6d5faeeb9547ab1c";
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 149, innerkey1, innerkey1.length);
		if (res0 == 0) {
			myHandleDeal("group135更新主密钥成功", res0);
			//ECB  工作秘钥明文：A032C89A44E8ABE6A032C89A44E8ABE6
			//IV：30303030abCDef99a1da25f1e411fea5
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 149, 449, 0, ipIn, innerkey2, innerkey2.length, ipOut, innerkey2.length);
			if (res1 ==0) {
				myHandleDeal("group135更新工作密钥测试成功", res1);
			} else {
				myHandleDeal("group135更新工作密钥测试失败", res1);
			}
			//9是固定的
			int res2 = Ddi.ddi_innerkey_ioctl_for_java(9, lParam.length, lParam, wplen, wParam);
			String byteArray2HexString2 = ByteUtils.byteArray2HexString(wParam);
			if (res2==0&&byteArray2HexString2.equalsIgnoreCase(MACdata)) {
				myHandleDeal("group135单DESCBC方式计算MAC成功", res2);
			} else {
				Log.v("TAG", byteArray2HexString2);
				myHandleDeal("group135单DESCBC方式计算MAC失败"+byteArray2HexString2, res2);

			}
		} else {
			myHandleDeal("group17更新主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
		
		
//		
	}
	// 2DES ECB  X9.19  最大索引  加密数据为1个长度
	private void testgroup136() {
		myHandleDeal("testgroup136测试", 0);
//		String key1 = "ABCD03E3F01234560122334FEDACBDEF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(paraEntity.dataString16);
//		String key2 = "ABCD03E3F01234560122334FEDACBDEF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(paraEntity.dataString16);
//		String data = "05"+"00000000"+"C1010000"+"01000000"+paraEntity.dataString1;
		//异常测试数据
		String data = "05"+"00000000"+"C1010000"+"01000000"+paraEntity.dataString1;
		byte[] lParam = ByteUtils.hexString2ByteArray(data);
		int[] wplen=new int[1];
		byte[] wParam=new byte[8];
//		int lplen=14;
		String MACdata="F2BE4D438212276D";
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 149, innerkey1, innerkey1.length);
		if (res0 == 0) {
			myHandleDeal("group136更新主密钥成功", res0);
			//工作秘钥明文：E87D34C84BA3964C0C991CC21657065A
			//IV：30303030abCDef99a1da25f1e411fea5
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 149, 449, 0, ipIn, innerkey2, innerkey2.length, ipOut, innerkey2.length);
			if (res1 ==0) {
				myHandleDeal("group136更新工作密钥测试成功", res1);
			} else {
				myHandleDeal("group136更新工作密钥测试失败", res1);
			}
			int res2 = Ddi.ddi_innerkey_ioctl_for_java(9, lParam.length, lParam, wplen, wParam);
			String byteArray2HexString2 = ByteUtils.byteArray2HexString(wParam);
			if (res2==0&&byteArray2HexString2.equalsIgnoreCase(MACdata)) {
				myHandleDeal("group136单DESX9.19方式计算MAC成功", res2);
			} else {
				Log.v("TAG", byteArray2HexString2);
				myHandleDeal("group136单DESX9.19方式计算MAC失败"+byteArray2HexString2, res2);
				
			}
		} else {
			myHandleDeal("group136更新主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}
	
	// 2DES X9.19 加密数据为个16个长度  最小索引
	private void testgroup137() {
		myHandleDeal("testgroup137测试", 0);
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
			myHandleDeal("group137更新主密钥成功", res0);
			//工作秘钥明文CBC：D84D04F8E06E79D5A7541F21E645320C
			//工作秘钥明文ECB：E87D34C84BA3964C0C991CC21657065A
			
			//IV：30303030abCDef99a1da25f1e411fea5
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 149, 1, 1, ipIn, innerkey2, innerkey2.length, ipOut, innerkey2.length);
			if (res1 ==0) {
				myHandleDeal("group137更新工作密钥测试成功", res1);
			} else {
				myHandleDeal("group137更新工作密钥测试失败", res1);
			}
			int res2 = Ddi.ddi_innerkey_ioctl_for_java(9, lParam.length, lParam, wplen, wParam);
			String byteArray2HexString2 = ByteUtils.byteArray2HexString(wParam);
			switch (MainActivity.model) {
			case "N3":
				if (res2==0&&byteArray2HexString2.equalsIgnoreCase(MACdata)) {
					myHandleDeal("N3group137单DESX9.19方式计算MAC成功"+byteArray2HexString2, res2);
				} else  {
					Log.v("TAG", byteArray2HexString2);
					myHandleDeal("N3group137单DESX9.19方式计算MAC失败"+byteArray2HexString2, res2);
				}
				break;
			case "N5":
				if (res2==0&&byteArray2HexString2.equalsIgnoreCase(MACdata1)) {
					myHandleDeal("N5Sgroup137单DESX9.19方式计算MAC成功"+byteArray2HexString2, res2);
				} else  {
					Log.v("TAG", byteArray2HexString2);
					myHandleDeal("N5Sgroup137单DESX9.19方式计算MAC失败"+byteArray2HexString2, res2);
				}
				break;
			case "N86":
				if (res2==0&&byteArray2HexString2.equalsIgnoreCase(MACdata1)) {
					myHandleDeal("N5Sgroup137单DESX9.19方式计算MAC成功"+byteArray2HexString2, res2);
				} else  {
					Log.v("TAG", byteArray2HexString2);
					myHandleDeal("N5Sgroup137单DESX9.19方式计算MAC失败"+byteArray2HexString2, res2);
				}
				break;

			default:
				break;
			}
		} else {
			myHandleDeal("group137更新主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}
	
	// 2DES ECB  X9.19  最大索引  加密数据为2049个长度
		private void testgroup138() {
//			Log.v("TAG", "testgroup138");
			
			myHandleDeal("testgroup138测试", 0);
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
				myHandleDeal("group138更新主密钥成功", res0);
				//工作秘钥明文：E87D34C84BA3964C0C991CC21657065A
				//IV：30303030abCDef99a1da25f1e411fea5
				int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 149, 449, 0, ipIn, innerkey2, innerkey2.length, ipOut, innerkey2.length);
				if (res1 ==0) {
					myHandleDeal("group138更新工作密钥测试成功", res1);
				} else {
					myHandleDeal("group138更新工作密钥测试失败", res1);
				}
				int res2 = Ddi.ddi_innerkey_ioctl_for_java(9, lParam.length, lParam, wplen, wParam);
				String byteArray2HexString2 = ByteUtils.byteArray2HexString(wParam);
				if (res2==0&&byteArray2HexString2.equalsIgnoreCase(MACdata)) {
					Log.v("TAG", byteArray2HexString2);
					myHandleDeal("group138单DESX9.19方式计算MAC成功", res2);
				} else {
					Log.v("TAG", byteArray2HexString2);
					myHandleDeal("group138单DESX9.19方式计算MAC失败"+byteArray2HexString2, res2);
					
				}
			} else {
				myHandleDeal("group138更新主密钥失败", res0);
			}
			Ddi.ddi_innerkey_close();
		}
		// DES CBC    最小索引  加密数据为2056个长度
		private void testgroup139() {
			myHandleDeal("testgroup139测试", 0);
//			String key1 = "31313131313131313131313131313131";
			byte[] innerkey1 = ByteUtils.hexString2ByteArray(paraEntity.dataString8);
//			String key2 = "00000000000000000000000000000000";
			byte[] innerkey2 = ByteUtils.hexString2ByteArray(paraEntity.dataString8);
			//04是CBC 05 X9.19
			String data = "04"+"00000000"+"00000000"+"08080000"+paraEntity.dataString2056;
			byte[] lParam = ByteUtils.hexString2ByteArray(data);
			int[] wplen=new int[1];
			byte[] wParam=new byte[8];
//			int lplen=14;
			String MACdata="609B5B881D61622C";
			Ddi.ddi_innerkey_open();
			int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x00, 149, innerkey1, innerkey1.length);
			if (res0 == 0) {
				myHandleDeal("group139更新主密钥成功", res0);
		
				//ECB  工作秘钥明文：6D0A7ECC98A019A6
				//IV：30303030abCDef99a1da25f1e411fea5
				int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x00, 149, 0, 0, ipIn, innerkey2, innerkey2.length, ipOut, innerkey2.length);
				if (res1 ==0) {
					myHandleDeal("group139更新工作密钥测试成功", res1);
				} else {
					myHandleDeal("group139更新工作密钥测试失败", res1);
				}
				//9是固定的
				int res2 = Ddi.ddi_innerkey_ioctl_for_java(9, lParam.length, lParam, wplen, wParam);
				String byteArray2HexString2 = ByteUtils.byteArray2HexString(wParam);
				if (res2==0&&byteArray2HexString2.equalsIgnoreCase(MACdata)) {
					myHandleDeal("group139单DESCBC方式计算MAC成功", res2);
				} else {
					Log.v("TAG", byteArray2HexString2);
					myHandleDeal("group139单DESCBC方式计算MAC失败"+byteArray2HexString2, res2);
				}
			} else {
				myHandleDeal("group139更新主密钥失败", res0);
			}
			Ddi.ddi_innerkey_close();
		}
	
		// 3DES CBC    中间225索引  加密数据为24个长度
		private void testgroup140() {
			myHandleDeal("testgroup140测试", 0);
//			String key1 = "31313131313131313131313131313131";
			byte[] innerkey1 = ByteUtils.hexString2ByteArray(paraEntity.dataString24);
//			String key2 = "00000000000000000000000000000000";
			byte[] innerkey2 = ByteUtils.hexString2ByteArray(paraEntity.dataString24);
			//04是CBC 05 X9.19  
			String data = "04"+"00000000"+"E1000000"+"18000000"+paraEntity.dataString24;
			
			byte[] lParam = ByteUtils.hexString2ByteArray(data);
			int[] wplen=new int[1];
			byte[] wParam=new byte[8];
//			int lplen=14;
			String MACdata="75F67E9CDA2D6CA0";
			Ddi.ddi_innerkey_open();
			int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 149, innerkey1, innerkey1.length);
			if (res0 == 0) {
				myHandleDeal("group140更新主密钥成功", res0);
				//ECB  工作秘钥明文：05A79FDE57EE5DC8CADC235ECD47784DCAF6E655ECACD7C3
				//IV：30303030abCDef99a1da25f1e411fea5
				int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 149, 225, 0, ipIn, innerkey2, innerkey2.length, ipOut, innerkey2.length);
				if (res1 ==0) {
					myHandleDeal("group140更新工作密钥测试成功", res1);
				} else {
					myHandleDeal("group140更新工作密钥测试失败", res1);
				}
				//9是固定的
				int res2 = Ddi.ddi_innerkey_ioctl_for_java(9, lParam.length, lParam, wplen, wParam);
				String byteArray2HexString2 = ByteUtils.byteArray2HexString(wParam);
				if (res2==0&&byteArray2HexString2.equalsIgnoreCase(MACdata)) {
					myHandleDeal("group140单DESCBC方式计算MAC成功", res2);
				} else {
					Log.v("TAG", byteArray2HexString2);
					myHandleDeal("group140单DESCBC方式计算MAC失败"+byteArray2HexString2, res2);
				}
			} else {
				myHandleDeal("group140更新主密钥失败", res0);
			}
			Ddi.ddi_innerkey_close();
		}
		
		// SM4 ECB  X9.19  最大索引  加密数据为1个长度
		private void testgroup141() {
			myHandleDeal("testgroup141测试", 0);
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
				myHandleDeal("group141更新主密钥成功", res0);
				//工作秘钥明文：535374A0B82442CC4043FFA4845C5E05
				//IV：30303030abCDef99a1da25f1e411fea5
				int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 149, 449, 0, ipIn, innerkey2, innerkey2.length, ipOut, innerkey2.length);
				if (res1 ==0) {
					myHandleDeal("group141更新工作密钥测试成功", res1);
				} else {
					myHandleDeal("group141更新工作密钥测试失败", res1);
				}
				int res2 = Ddi.ddi_innerkey_ioctl_for_java(9, lParam.length, lParam, wplen, wParam);
				String byteArray2HexString2 = ByteUtils.byteArray2HexString(wParam);
				switch (MainActivity.model) {
				case "N3":
					if (res2==0&&byteArray2HexString2.equalsIgnoreCase(MACdata)) {
						myHandleDeal("N3group141单DESX9.19方式计算MAC成功", res2);
					} else {
						Log.v("TAG", byteArray2HexString2);
						myHandleDeal("N3group141单DESX9.19方式计算MAC失败"+byteArray2HexString2, res2);
						
					}
					break;
				case "N5":
					if (MainActivity.version.equalsIgnoreCase("7.1.2")) {
						if (res2 == -6) {
							myHandleDeal("N5group141单DESX9.19方式计算MAC成功", res2);
						} else {
							Log.v("TAG", byteArray2HexString2);
							myHandleDeal("N5group141单DESX9.19方式计算MAC失败" + byteArray2HexString2, res2);

						} 
					}else {
						if (res2==0&&byteArray2HexString2.equalsIgnoreCase(MACdata)) {
							myHandleDeal("N3group141单DESX9.19方式计算MAC成功", res2);
						} else {
							Log.v("TAG", byteArray2HexString2);
							myHandleDeal("N3group141单DESX9.19方式计算MAC失败"+byteArray2HexString2, res2);
							
						}
						
						
					}
					break;

				default:
					
					break;
				}
				
			} else {
				myHandleDeal("group141更新主密钥失败", res0);
			}
			Ddi.ddi_innerkey_close();
		}
		
		// SM4 CBC  最大索引  加密数据为1个长度
				private void testgroup142() {
					myHandleDeal("testgroup142测试", 0);
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
						myHandleDeal("group142更新主密钥成功", res0);
						//工作秘钥明文：535374A0B82442CC4043FFA4845C5E05
						//IV：30303030abCDef99a1da25f1e411fea5
						int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 149, 449, 0, ipIn, innerkey2, innerkey2.length, ipOut, innerkey2.length);
						if (res1 ==0) {
							myHandleDeal("group142更新工作密钥测试成功", res1);
						} else {
							myHandleDeal("group142更新工作密钥测试失败", res1);
						}
						int res2 = Ddi.ddi_innerkey_ioctl_for_java(9, lParam.length, lParam, wplen, wParam);
						String byteArray2HexString2 = ByteUtils.byteArray2HexString(wParam);
						switch (MainActivity.model) {
						case "N3":
							if (res2==0&&byteArray2HexString2.equalsIgnoreCase(MACdata)) {
								myHandleDeal("N3group142单DESX9.19方式计算MAC成功", res2);
							} else {
								Log.v("TAG", byteArray2HexString2);
								myHandleDeal("N3group142单DESX9.19方式计算MAC失败"+byteArray2HexString2, res2);
							}
							break;
						case "N5":
							if (MainActivity.version.equalsIgnoreCase("7.1.2")) {
								//因为支持算法识别
								if (res2 == -6) {
									myHandleDeal("N5group142单DESX9.19方式计算MAC成功", res2);
								} else {
									Log.v("TAG", byteArray2HexString2);
									myHandleDeal("N5group142单DESX9.19方式计算MAC失败" + byteArray2HexString2, res2);
								}
							}
							else {
								if (res2==0&&byteArray2HexString2.equalsIgnoreCase(MACdata)) {
									myHandleDeal("N3group142单DESX9.19方式计算MAC成功", res2);
								} else {
									Log.v("TAG", byteArray2HexString2);
									myHandleDeal("N3group142单DESX9.19方式计算MAC失败"+byteArray2HexString2, res2);
								}
							}
							break;
						case "N6":
							if (res2==-6) {
								myHandleDeal("N3group142单DESX9.19方式计算MAC成功", res2);
							} else {
								Log.v("TAG", byteArray2HexString2);
								myHandleDeal("N3group142单DESX9.19方式计算MAC失败"+byteArray2HexString2, res2);
							}
							break;
						case "N86":
							if (res2==-6) {
								myHandleDeal("N3group142单DESX9.19方式计算MAC成功", res2);
							} else {
								Log.v("TAG", byteArray2HexString2);
								myHandleDeal("N3group142单DESX9.19方式计算MAC失败"+byteArray2HexString2, res2);
							}
							break;
						default:
							myHandleDeal("group142单DESX9.19方式计算MAC失败", -99);
							break;
						}
					} else {
						myHandleDeal("group142更新主密钥失败", res0);
					}
					Ddi.ddi_innerkey_close();
				}
				
				// 异常测试 DES ECB  X9.19  最大索引  加密数据为2049个长度
				private void testgroup143() {
					myHandleDeal("testgroup143测试", 0);
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
						myHandleDeal("group143更新主密钥成功", res0);
						//工作秘钥明文：E87D34C84BA3964C0C991CC21657065A
						//IV：30303030abCDef99a1da25f1e411fea5
						int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x00, 149, 449, 0, ipIn, innerkey2, innerkey2.length, ipOut, innerkey2.length);
						if (res1 ==0) {
							myHandleDeal("group143更新工作密钥测试成功", res1);
						} else {
							myHandleDeal("group143更新工作密钥测试失败", res1);
						}
						int res2 = Ddi.ddi_innerkey_ioctl_for_java(9, lParam.length, lParam, wplen, wParam);
						String byteArray2HexString2 = ByteUtils.byteArray2HexString(wParam);
						if (res2==-6) {
							myHandleDeal("group143单DESX9.19方式计算MAC成功", res2);
						} else {
							Log.v("TAG", byteArray2HexString2);
							myHandleDeal("group143单DESX9.19方式计算MAC失败"+byteArray2HexString2, res2);
							
						}
					} else {
						myHandleDeal("group143更新主密钥失败", res0);
					}
					Ddi.ddi_innerkey_close();
				}
				
				// 3DES CBC    中间225索引  加密数据为2056个长度
				private void testgroup144() {
					myHandleDeal("testgroup144测试", 0);
					String key1 = "31313131313131313131313131313131";
					byte[] innerkey1 = ByteUtils.hexString2ByteArray(paraEntity.dataString16);
					String key2 = "00000000000000000000000000000000";
					byte[] innerkey2 = ByteUtils.hexString2ByteArray(paraEntity.dataString16);
					//04是CBC 05 X9.19
					String data = "04"+"00000000"+"C0010000"+"01080000"+paraEntity.dataString2049;
					//异常测试数据
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
						myHandleDeal("group144更新主密钥成功", res0);
						//ECB  工作秘钥明文：E87D34C84BA3964C0C991CC21657065A
						//IV：30303030abCDef99a1da25f1e411fea5
						int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 149, 448, 0, ipIn, innerkey2, innerkey2.length, ipOut, innerkey2.length);
						if (res1 ==0) {
							
//							int res5 = Ddi.ddi_innerkey_des_encrypt(1, 449, 0, ipIn, innerkey2, 16, DataOut);// 工作密钥加密
//							String data1 = ByteUtils.byteArray2HexString(DataOut);
//							if (res5 == 0 && data1.equalsIgnoreCase(key1)) {
//								myHandleDeal("group144更新工作秘钥加密成功", res5);
//							} else {
//								myHandleDeal("group144更新工作秘钥加密失败" + data1, res5);
//							}
							
							
							myHandleDeal("group144更新工作密钥测试成功", res1);
						} else {
							myHandleDeal("group144更新工作密钥测试失败", res1);
						}
						//9是固定的
						int res2 = Ddi.ddi_innerkey_ioctl_for_java(9, lParam.length, lParam, wplen, wParam);
						String byteArray2HexString2 = ByteUtils.byteArray2HexString(wParam);
						if (res2==0&&byteArray2HexString2.equalsIgnoreCase(MACdata)) {
							myHandleDeal("group144单DESCBC方式计算MAC成功", res2);
						} else {
							Log.v("TAG", byteArray2HexString2);
							myHandleDeal("group144单DESCBC方式计算MAC失败"+byteArray2HexString2, res2);

						}
					} else {
						myHandleDeal("group144更新主密钥失败", res0);
					}
					Ddi.ddi_innerkey_close();
					
					
//					
				}
				//相同秘钥，X9.19计算MAC  数据为2056
				private void testgroup145() {
					myHandleDeal("testgroup145测试", 0);
					String key1 = "31313131313131313131313131313131";
					byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
//					String key2 = "00000000000000000000000000000000";
					byte[] innerkey2 = ByteUtils.hexString2ByteArray(key1);
					//04是CBC 05 X9.19
					String data = "05"+"00000000"+"C1010000"+"08080000"+paraEntity.dataString2056;
					//异常测试数据
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
						myHandleDeal("group145更新主密钥成功", res0);
						//ECB  工作秘钥明文：E87D34C84BA3964C0C991CC21657065A
						//IV：30303030abCDef99a1da25f1e411fea5
						int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 149, 449, 0, ipIn, innerkey2, innerkey2.length, ipOut, innerkey2.length);
						if (res1 ==0) {
							
//							int res5 = Ddi.ddi_innerkey_des_encrypt(1, 449, 0, ipIn, innerkey2, 16, DataOut);// 工作密钥加密
//							String data1 = ByteUtils.byteArray2HexString(DataOut);
//							if (res5 == 0 && data1.equalsIgnoreCase(key1)) {
//								myHandleDeal("group145更新工作秘钥加密成功", res5);
//							} else {
//								myHandleDeal("group145更新工作秘钥加密失败" + data1, res5);
//							}
							
							
							myHandleDeal("group145更新工作密钥测试成功", res1);
						} else {
							myHandleDeal("group145更新工作密钥测试失败", res1);
						}
						//9是固定的
						int res2 = Ddi.ddi_innerkey_ioctl_for_java(9, lParam.length, lParam, wplen, wParam);
						String byteArray2HexString2 = ByteUtils.byteArray2HexString(wParam);
						if (res2==0&&byteArray2HexString2.equalsIgnoreCase(MACdata)) {
							myHandleDeal("group145单DESCBC方式计算MAC成功", res2);
						} else {
							Log.v("TAG", byteArray2HexString2);
							myHandleDeal("group145单DESCBC方式计算MAC失败"+byteArray2HexString2, res2);

						}
					} else {
						myHandleDeal("group145更新主密钥失败", res0);
					}
					Ddi.ddi_innerkey_close();
					
					
//					
				}
				
	private void testgroup146() {
		myHandleDeal("testgroup146测试", 0);
//					String key1 = "31313131313131313131313131313131";
		Thread thread = new Thread(new Runnable() {
			public void run() {
				byte[] innerkey1 = ByteUtils.hexString2ByteArray(paraEntity.dataString8);
//							String key2 = "00000000000000000000000000000000";
				byte[] innerkey2 = ByteUtils.hexString2ByteArray(paraEntity.dataString8);
				// 04是CBC 05 X9.19
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
						myHandleDeal("group146更新主密钥成功", res0);

						// ECB 工作秘钥明文：6D0A7ECC98A019A6
						// IV：30303030abCDef99a1da25f1e411fea5
						int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x00, 149, 0, 0, ipIn, innerkey2, innerkey2.length,
								ipOut, innerkey2.length);
						if (res1 == 0) {
							myHandleDeal("group146更新工作密钥测试成功", res1);
						} else {
							myHandleDeal("group146更新工作密钥测试失败", res1);
						}
						// 9是固定的
						int res2 = Ddi.ddi_innerkey_ioctl_for_java(9, lParam.length, lParam, wplen, wParam);
						String byteArray2HexString2 = ByteUtils.byteArray2HexString(wParam);
						if (res2 == 0 && byteArray2HexString2.equalsIgnoreCase(MACdata)) {
							myHandleDeal("group146单DESCBC方式计算MAC成功", res2);
						} else {
							Log.v("TAG", byteArray2HexString2);
							myHandleDeal("group146单DESCBC方式计算MAC失败" + byteArray2HexString2, res2);
						}
					} else {
						myHandleDeal("group146更新主密钥失败", res0);
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
	//F900增加百度活体License下载功能    最大数据32
	private void testgroup147() {
		myHandleDeal("testgroup1147测试", 0);
//		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF9999efBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(paraEntity.dataString32);
		byte[] innerkey2 = new byte[innerkey1.length];
		int[] in=new int[1];
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_write_custom_info(6,innerkey1,innerkey1.length);
		if (res0 == 0) {
			myHandleDeal("group1147写数据成功", res0);
			int res1 = Ddi.ddi_read_custom_info(6,innerkey2,in);
			String byteArray2HexString2 = ByteUtils.byteArray2HexString(innerkey2);
			if (res1 == 0&&byteArray2HexString2.equalsIgnoreCase(paraEntity.dataString32)) {
				myHandleDeal("group1147读取数据测试成功"+byteArray2HexString2, res1);
			} else {
				myHandleDeal("group1147读取数据测试失败"+byteArray2HexString2, res1);
			}
		} else {
			myHandleDeal("group1147写数据失败", res0);
		}
	}
	//最小数据 1
	private void testgroup148() {
		myHandleDeal("testgroup1148测试", 0);
//		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF9999efBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(paraEntity.dataString1);
		byte[] innerkey2 = new byte[innerkey1.length];
		int[] in=new int[1];
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_write_custom_info(6,innerkey1,innerkey1.length);
		if (res0 == 0) {
			myHandleDeal("group1148写数据成功", res0);
			int res1 = Ddi.ddi_read_custom_info(6,innerkey2,in);
			String byteArray2HexString2 = ByteUtils.byteArray2HexString(innerkey2);
			if (res1 == 0&&byteArray2HexString2.equalsIgnoreCase(paraEntity.dataString1)) {
				myHandleDeal("group1148读取数据测试成功", res1);
			} else {
				myHandleDeal("group1148读取数据测试失败", res1);
			}
		} else {
			myHandleDeal("group1148写数据失败", res0);
		}
	}
	
	private void testgroup149() {
		myHandleDeal("testgroup1149测试", 0);
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
						myHandleDeal("group1149写数据成功"+i, res0);
						int res1 = Ddi.ddi_read_custom_info(6, innerkey2, in);
						String byteArray2HexString2 = ByteUtils.byteArray2HexString(innerkey2);
						if (res1 == 0 && byteArray2HexString2.equalsIgnoreCase(paraEntity.dataString32)) {
							myHandleDeal("group149读取数据测试成功"+i, res1);
						} else {
							myHandleDeal("group149读取数据测试失败"+i, res1);
						}
					} else {
						myHandleDeal("group1149写数据失败"+i, res0);
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
		myHandleDeal("testgroup150测试", 0);
//		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF9999efBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(paraEntity.dataString32);
		byte[] innerkey2 = new byte[innerkey1.length];
		int[] in=new int[1];
		for (int i = 0; i < 7; i++) {
			if (i==5) {
				//因为5只允许系统内部使用，应用是不能操作的
				Ddi.ddi_innerkey_open();
				int res0 = Ddi.ddi_write_custom_info(i, innerkey1, innerkey1.length);
				if (res0 == -5) {
					Log.v("TAG", ""+5);
					myHandleDeal("group150写数据成功" + i, res0);
				
				} else {
					myHandleDeal("group150写数据失败" + i, res0);
				}
				Ddi.ddi_innerkey_close();
			}		
		    if (i==6) {
		    	Log.v("TAG", ""+6);
				Ddi.ddi_innerkey_open();
				int res0 = Ddi.ddi_write_custom_info(i, innerkey1, innerkey1.length);
				if (res0 == 0) {
					myHandleDeal("group150写数据成功" + i, res0);
					int res1 = Ddi.ddi_read_custom_info(i, innerkey2, in);
					String byteArray2HexString2 = ByteUtils.byteArray2HexString(innerkey2);
					if (res1 == 0 && byteArray2HexString2
							.equalsIgnoreCase(paraEntity.dataString32)) {
						myHandleDeal("group150读取数据测试成功" + i, res1);
					} else {
						myHandleDeal("group150读取数据测试失败" + i + "..." + byteArray2HexString2, res1);
					}
					
				} else {
					myHandleDeal("group150写数据失败" + i, res0);
				}
				Ddi.ddi_innerkey_close();
			}
		    
		    if (i!=5&&i!=6) {
				Log.v("TAG", "" + i + 5);
				Ddi.ddi_innerkey_open();
				int res0 = Ddi.ddi_write_custom_info(i, innerkey1, innerkey1.length);
				if (res0 == 0) {
					myHandleDeal("group150写数据成功" + i, res0);
					int res1 = Ddi.ddi_read_custom_info(i, innerkey2, in);
					String byteArray2HexString2 = ByteUtils.byteArray2HexString(innerkey2);
					if (res1 == 0 && byteArray2HexString2
							.equalsIgnoreCase("3131313131313131ABCD03E3F01234560122334FEDACBDEF1234567800000000")) {
						myHandleDeal("group150读取数据测试成功" + i, res1);
					} else {
						myHandleDeal("group150读取数据测试失败" + i + "..." + byteArray2HexString2, res1);
					}
				} else {
					myHandleDeal("group150写数据失败" + i, res0);
				}
				Ddi.ddi_innerkey_close();
			}
			
		}
	}
	private void testgroup151() {
		myHandleDeal("testgroup151测试", 0);
//		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF9999efBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(paraEntity.dataString1);
		byte[] innerkey2 = new byte[innerkey1.length];
		int[] in=new int[1];
		for (int i = 0; i < 7; i++) {
			if (i==5) {
				Ddi.ddi_innerkey_open();
				int res0 = Ddi.ddi_write_custom_info(i, innerkey1, innerkey1.length);
				if (res0 == -5) {
					myHandleDeal("group151写数据成功"+i, res0);
					
				} else {
					myHandleDeal("group151写数据失败"+i, res0);
				}
				Ddi.ddi_innerkey_close();
			}else {
				Ddi.ddi_innerkey_open();
				int res0 = Ddi.ddi_write_custom_info(i, innerkey1, innerkey1.length);
				if (res0 == 0) {
					myHandleDeal("group151写数据成功"+i, res0);
					int res1 = Ddi.ddi_read_custom_info(i, innerkey2, in);
					String byteArray2HexString2 = ByteUtils.byteArray2HexString(innerkey2);
					if (res1 == 0
							&& byteArray2HexString2.equalsIgnoreCase(paraEntity.dataString1 )) {
						myHandleDeal("group151读取数据测试成功"+i, res1);
					} else {
						myHandleDeal("group151读取数据测试失败"+i+"..."+byteArray2HexString2, res1);
					}
				} else {
					myHandleDeal("group151写数据失败"+i, res0);
				}
				Ddi.ddi_innerkey_close();
				
			}
			
		}
	}

	
				
		

	private void testgroup63() {
		myHandleDeal("testgroup63测试", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF9999efBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 149, innerkey1, 24);
		if (res0 == 0) {
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 149, 0, 1, ipIn, innerkey2, 24, ipOut, 24);
			int res6 = Ddi.ddi_innerkey_des_encrypt(1, 0, 1, ipIn, msg_summery, 16, innerkey2);
			int res7 = Ddi.ddi_innerkey_des_encrypt(1, 0, 1, ipIn, innerkey1, 16, innerkey2);
			myHandleDeal("更新主密钥成功", res0);
			if (res1 == 0) {
				myHandleDeal("更新工作密钥测试成功" + res6 + res7, res1);
				long begin = System.currentTimeMillis();
				for (int i = 0; i < 500; i++) {
					int res4 = Ddi.ddi_innerkey_des_encrypt(1, 0, 1, ipIn, msg_summery, 16, innerkey2);
					int res5 = Ddi.ddi_innerkey_des_encrypt(1, 0, 1, ipIn, innerkey1, 16, innerkey2);
				}
				long end = System.currentTimeMillis();
				long current = end - begin;
				myHandleDeal("DES加密时间为" + current + "秒", 0);
			} else {
				myHandleDeal("group63更新工作密钥测试失败", res1);
			}
		} else {
			myHandleDeal("group63更新主密钥失败", res0);
		}

	}

	private void testgroup64() {
		myHandleDeal("testgroup64测试", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF9999efBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 149, innerkey1, 24);
		if (res0 == 0) {
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 149, 0, 1, ipIn, innerkey2, 24, ipOut, 24);
			if (res1 == 0) {
				myHandleDeal("更新工作密钥测试成功", res1);
				long begin = System.currentTimeMillis();
				for (int i = 0; i < 500; i++) {
					int res4 = Ddi.ddi_innerkey_des_encrypt(1, 0, 0, ipIn, msg_summery, 16, innerkey2);
					int res5 = Ddi.ddi_innerkey_des_encrypt(1, 0, 0, ipIn, innerkey1, 16, innerkey2);
				}
				long end = System.currentTimeMillis();
				long current = end - begin;
				myHandleDeal("DES加密时间为" + current + "秒", 0);
			} else {
				myHandleDeal("group64更新工作密钥测试失败", res1);
			}
		} else {
			myHandleDeal("group64更新主密钥失败", res0);
		}

	}

	private void testgroup65() {
		myHandleDeal("testgroup65测试", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 100, innerkey1, 16);
		if (res0 == 0) {
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 100, 100, 0, ipIn, innerkey2, 16, ipOut, 16);
			if (res1 == 0) {
				myHandleDeal("更新工作密钥测试成功", res1);
				long begin = System.currentTimeMillis();
				for (int i = 0; i < 500; i++) {
					int res10 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, 100, (byte) 0, ipIn, innerkey1, innerkey1.length,
							innerkey2, leOut);
					int res11 = Ddi.ddi_innerkey_nes_sm4_decrypt(1, 100, 148, (byte) 0, ipIn, innerkey2,
							innerkey2.length, ipOut, leOut);
				}
				long end = System.currentTimeMillis();
				long current = end - begin;
				myHandleDeal("SM4加密时间为" + current + "秒", 0);
			} else {
				myHandleDeal("group13更新工作密钥测试失败", res1);
			}
		} else {
			myHandleDeal("group13更新主密钥失败", res0);
		}

	}

	private void testgroup66() {
		myHandleDeal("testgroup66测试", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 100, innerkey1, 16);
		if (res0 == 0) {
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 100, 100, 0, ipIn, innerkey1, 16, ipOut, 16);
			if (res1 == 0) {
				myHandleDeal("更新工作密钥测试成功", res1);
				long begin = System.currentTimeMillis();
				int res12 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, 100, (byte) 1, ipIn, innerkey1, innerkey1.length,
						innerkey2, leOut);
				int res13 = Ddi.ddi_innerkey_nes_sm4_decrypt(1, 100, 148, (byte) 1, ipIn, innerkey2, 16, ipOut, leOut);
				myHandleDeal("更新工作密钥测试成功" + res12 + res13, res1);
				for (int i = 0; i < 500; i++) {
					int res10 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, 100, (byte) 1, ipIn, innerkey1, innerkey1.length,
							innerkey2, leOut);
					int res11 = Ddi.ddi_innerkey_nes_sm4_decrypt(1, 100, 148, (byte) 1, ipIn, innerkey2, 16, ipOut,
							leOut);
				}
				long end = System.currentTimeMillis();
				long current = end - begin;
				if (current>6563+(6563*0.05)) {
					myHandleDeal("SM4加密时间成功" + current + "秒", 0);
				} else {
					myHandleDeal("SM4加密时间失败" + current + "秒", -1);
				}
				
			} else {
				myHandleDeal("group66更新工作密钥测试失败", res1);
			}
		} else {
			myHandleDeal("group66更新主密钥失败", res0);
		}

	}

	private void testgroup67() {
		myHandleDeal("testgroup67测试", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		byte[] data = new byte[16];
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x04, 100, innerkey1, 16);
		if (res0 == 0) {
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x04, 100, 100, 0, ipIn, innerkey2, 16, ipOut, 16);
			if (res1 == 0) {
				myHandleDeal("更新工作密钥测试成功", res1);
				long begin = System.currentTimeMillis();
				int res6 = Ddi.ddi_innerkey_aes_encrypt(1, 100, (byte) 1, ipIn, innerkey1, innerkey1.length, data);
				int res7 = Ddi.ddi_innerkey_aes_decrypt(1, 100, 1, (byte) 1, ipIn, innerkey1, 16, data);
				myHandleDeal("更新工作密钥测试成功" + res6 + res7, res1);
				for (int i = 0; i < 500; i++) {
					int res4 = Ddi.ddi_innerkey_aes_encrypt(1, 100, (byte) 1, ipIn, innerkey1, innerkey1.length,
							innerkey2);
					int res5 = Ddi.ddi_innerkey_aes_decrypt(1, 100, 1, (byte) 1, ipIn, innerkey2, innerkey2.length,
							innerkey2);
				}
				long end = System.currentTimeMillis();
				long current = end - begin;
				myHandleDeal("AES加密时间为" + current + "秒", 0);
			} else {
				myHandleDeal("group67更新工作密钥测试失败", res1);
			}
		} else {
			myHandleDeal("group67更新主密钥失败", res0);
		}

	}

	private void testgroup68() {
		myHandleDeal("testgroup68测试", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 100, innerkey1, 16);
		if (res0 == 0) {
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 100, 100, 0, ipIn, innerkey2, 16, ipOut, 16);
			if (res1 == 0) {
				myHandleDeal("更新工作密钥测试成功", res1);
				long begin = System.currentTimeMillis();
				for (int i = 0; i < 500; i++) {
					int res4 = Ddi.ddi_innerkey_aes_encrypt(1, 100, (byte) 0, ipIn, innerkey1, innerkey1.length,
							innerkey2);
					int res5 = Ddi.ddi_innerkey_aes_decrypt(1, 100, 1, (byte) 0, ipIn, innerkey2, innerkey2.length,
							innerkey2);
				}
				long end = System.currentTimeMillis();
				long current = end - begin;
				myHandleDeal("AES加密时间为" + current + "秒", 0);
			} else {
				myHandleDeal("group68更新工作密钥测试失败", res1);
			}
		} else {
			myHandleDeal("group68更新主密钥失败", res0);
		}

	}

	private void testgroup69() {
		myHandleDeal("testgroup69测试", 0);
		long begin = System.currentTimeMillis();
		for (int i = 0; i < 50; i++) {
			Ddi.ddi_innerkey_open();
			Ddi.ddi_innerkey_close();
		}
		long end = System.currentTimeMillis();
		long current = end - begin;
		myHandleDeal("重复开关50次后耗时" + current + "毫秒", 0);

	}

	private void testgroup70() {
		myHandleDeal("testgroup70测试", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x08, 100, innerkey1, 16);
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 150, innerkey1, 16);

		if (res0 == -6 && res1 == -6) {
			myHandleDeal("主密钥异常测试成功", 0);
		} else {
			myHandleDeal("主密钥异常测试失败", res0);

		}

	}

	private void testgroup71() {
		myHandleDeal("testgroup71测试", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 100, innerkey1, 16);
		if (res0 == 0) {
			myHandleDeal("更新主密钥成功", res0);
			int res5 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 10, 100, 0, ipIn, innerkey2, 16, ipOut, 16);
			int res4 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 100, 100, 2, ipIn, innerkey2, 16, ipOut, 16);
			int res3 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 100, 450, 0, ipIn, innerkey2, 16, ipOut, 16);
			int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x08, 100, 100, 0, ipIn, innerkey2, 16, ipOut, 16);

			if (res2 == -6 && res3 == -6 && res4 == -6) {
				myHandleDeal("group13更新工作密钥测试成功", 0);
			} else {
				myHandleDeal("group13更新工作密钥测试失败", res2);
			}
		} else {
			myHandleDeal("group13更新主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup72() {
		myHandleDeal("testgroup72测试", 0);
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
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 149, 0, 1, ipIn, innerkey2, 24, ipOut, 24);
			if (res1 == 0) {
				myHandleDeal("更新工作密钥测试成功", res1);

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
				myHandleDeal("group13更新工作密钥测试失败", res1);
			}
		} else {
			myHandleDeal("group13更新主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup73() {
		myHandleDeal("testgroup73测试", 0);
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
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 100, 100, 0, ipIn, innerkey2, 16, ipOut, 16);
			if (res1 == 0) {
				myHandleDeal("更新工作密钥测试成功", res1);

				int res11 = Ddi.ddi_innerkey_aes_encrypt(1, 100, (byte) 1, innerkey4, innerkey1, innerkey1.length,
						innerkey2);
				int res10 = Ddi.ddi_innerkey_aes_encrypt(1, 100, (byte) 1, innerkey3, innerkey1, innerkey1.length,
						innerkey2);
				int res9 = Ddi.ddi_innerkey_aes_encrypt(1, 100, (byte) 0, ipIn, innerkey1, innerkey1.length, innerkey2);
				int res8 = Ddi.ddi_innerkey_aes_encrypt(1, 100, (byte) 2, ipIn, innerkey1, innerkey1.length, innerkey2);
				int res7 = Ddi.ddi_innerkey_aes_encrypt(1, -1, (byte) 0, ipIn, innerkey1, innerkey1.length, innerkey2);
				int res6 = Ddi.ddi_innerkey_aes_encrypt(2, 100, (byte) 0, ipIn, innerkey1, innerkey1.length, innerkey2);
				// 解密
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
				myHandleDeal("group13更新工作密钥测试失败", res1);
			}
		} else {
			myHandleDeal("group13更新主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup74() {
		myHandleDeal("testgroup74测试", 0);
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
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 100, 100, 0, ipIn, innerkey1, 16, ipOut, 16);
			if (res1 == 0) {
				myHandleDeal("更新工作密钥测试成功", res1);

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
				myHandleDeal("group13更新工作密钥测试失败", res1);
			}
		} else {
			myHandleDeal("group13更新主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup75() {
		myHandleDeal("testgroup75测试", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 100, innerkey1, 16);
		if (res0 == 0) {
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 100, 100, 0, ipIn, innerkey1, 16, ipOut, 16);
			if (res1 == 0) {
				myHandleDeal("更新工作密钥测试成功", res1);
				int res6 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 100, innerkey1, 16);

				long begin = System.currentTimeMillis();
				for (int i = 0; i < 100; i++) {
					int res2 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 100, innerkey1, 16);
				}
				long end = System.currentTimeMillis();
				long current = end - begin;
				myHandleDeal("SM4更新主密钥时间为" + current + "秒", 0);
			} else {
				myHandleDeal("group75更新工作密钥测试失败", res1);
			}
		} else {
			myHandleDeal("group75更新主密钥失败", res0);
		}

	}

	private void testgroup76() {
		myHandleDeal("testgroup76测试", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res2 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 100, innerkey1, 16);
		int res3 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 100, 100, 0, ipIn, innerkey1, 16, ipOut, 16);
		myHandleDeal("SM4更新工作秘钥时间为" + res2 + res3, 0);
		long begin = System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 100, innerkey1, 16);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 100, 100, 0, ipIn, innerkey1, 16, ipOut, 16);
		}
		long end = System.currentTimeMillis();
		long current = end - begin;
		myHandleDeal("SM4更新工作秘钥时间为" + current + "秒", 0);

	}

	private void testgroup77() {

		myHandleDeal("testgroup77测试", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res2 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
		myHandleDeal("SM4更新工作秘钥时间为" + res2, 0);
		long begin = System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
		}
		long end = System.currentTimeMillis();
		long current = end - begin;
		myHandleDeal("DES更新主秘钥时间为" + current + "秒", 0);

	}

	private void testgroup78() {
		myHandleDeal("testgroup78测试", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();

		int res2 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
		int res3 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 0, 1, ipIn, innerkey2, 16, ipOut, 16);
		myHandleDeal("SM4更新工作秘钥时间为" + res2 + res3, 0);

		long begin = System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
			int res4 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 0, 1, ipIn, innerkey2, 16, ipOut, 16);
		}
		long end = System.currentTimeMillis();
		long current = end - begin;
		myHandleDeal("DES更新工作秘钥时间为" + current + "秒", 0);

	}

	private void testgroup79() {
		myHandleDeal("testgroup79测试", 0);
		String key4 = "ffffffffFFFFFFFFffffffffFFFFFFFF";
		byte[] innerkey4 = ByteUtils.hexString2ByteArray(key4);
		byte[] DataOut = new byte[16];
		String data0 = "A16B6B2A2883D0CBE09797DAFB64B3D3";
		String data12 = "980E47DEA2A7AC679A7962966D0777FD";
		byte[] msg_summery1 = ByteUtils.hexString2ByteArray("85e9d210105327171927e8303ef028e1");
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 0, innerkey4, 16);
		if (res0 == 0) {
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 0, 0, 0, ipIn, innerkey4, 16, ipOut, 16);
			// 工明 ：32D00D9AC34566540D2A291DEB71932A
			if (res1 == 0) {
				myHandleDeal("更新工作秘钥成功", res1);
				int res5 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, 0, (byte) 1, ipIn, innerkey4, innerkey4.length, DataOut,
						leOut);// 工作密钥加密
				String data = ByteUtils.byteArray2HexString(DataOut);
				if (res5 == 0 && data.equalsIgnoreCase(data0)) {
					myHandleDeal("group79更新工作秘钥加密成功", res5);
					int res6 = Ddi.ddi_innerkey_nes_sm4_decrypt(1, 0, 1, (byte) 0x01, ipIn, innerkey4, 16, DataOut,
							leOut);
					String data1 = ByteUtils.byteArray2HexString(DataOut);
					if (res6 == 0 && data1.equalsIgnoreCase(data12)) {
						myHandleDeal("SM4CBC模式加密成功", 0);

					} else {
						myHandleDeal("SM4CBC模式加密失败" + data1, res6);

					}
				} else {
					myHandleDeal("group79更新工作秘钥加密失败" + data, res5);
				}
			} else {
				myHandleDeal("group79更新工作秘钥失败", res1);
			}
		}
	}

	private void testgroup80() {
		myHandleDeal("testgroup80测试", 0);
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
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 122, 2, 1, ipIn, innerkey2, 16, ipOut, 16);
			// 工明：DA903DA712448A3F69543784EE829115
			//  IV：30303030abCDef99a1da25f1e411fea5
			if (res1 == 0) {
				myHandleDeal("更新工作密钥测试成功", res1);
			} else {
				myHandleDeal("group80更新工作密钥测试失败", res1);
			}
			int res2 = Ddi.ddi_innerkey_des_decrypt(1, 2, 1, 1, ipIn, innerkey1, 16, output);
			// 2019.3.11最新添加的用例
			
			String byteArray2HexString = ByteUtils.byteArray2HexString(output);
			
			if (res2 == 0 && key3.equalsIgnoreCase(byteArray2HexString)) {
				myHandleDeal("DES工作秘钥解密成功" + res2, res2);
				int res34 = Ddi.ddi_innerkey_des_encrypt(1, 2, 1, ipIn, innerkey2, 16, output); 
				String byteArray2HexString4 = ByteUtils.byteArray2HexString(output);
				if (res34 == 0 && key4.equalsIgnoreCase(byteArray2HexString4)) {
					myHandleDeal("DES工作秘钥解密成功", res34);
				} else {
					myHandleDeal("DES工作秘钥解密失败" + byteArray2HexString4, res34);
				}
			} else {
				myHandleDeal("group80工作秘钥解密失败"+byteArray2HexString, res2);
			}
		} else {
			myHandleDeal("group80更新主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup81() {
		myHandleDeal("testgroup81测试", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF9999efBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		byte[] iv = null;
		Ddi.ddi_innerkey_open();

		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 149, innerkey1, 24);
		if (res0 == 0) {
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x00, 149, 0, 1, ipIn, innerkey2, 8, ipOut, 8);
			if (res1 == 0) {
				myHandleDeal("更新工作密钥测试成功", res1);
				int res3 = Ddi.ddi_innerkey_delete_key(1, 2);
				if (res3 == 0) {
					myHandleDeal("删除工作密钥测试成功", res1);
				}
				int res89 = Ddi.ddi_innerkey_des_decrypt(1, 2, 1, 1, iv, msg_summery, 16, ipOut);
				if (res89 == -6) {
					myHandleDeal("DES解密测试成功", res89);
				} else {
					myHandleDeal("innerkeysingleDES解密测试失败89", res89);
				}
			} else {
				myHandleDeal("group81更新工作密钥测试失败", res1);
			}
		} else {
			myHandleDeal("group81更新主密钥失败", res0);
		}

	}

	private void testgroup82() {
		myHandleDeal("testgroup82测试", 0);
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
						myHandleDeal("group82打开设备成功" + i, res6);
					} else {
						myHandleDeal("group82打开设备失败" + i, res6);
					}
					int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x02, i, innerkey1, 24);
					if (res0 == 0) {
						myHandleDeal("group82更新主密钥成功", res0);
						Ddi.ddi_innerkey_open();
						int res89 = Ddi.ddi_innerkey_des_decrypt(0, i, 1, 1, iv, msg_summery, 16, ipOut);
						if (res89 == 0) {
							myHandleDeal("group82DES主密钥密钥测试成功" + i, res89);
						} else {
							myHandleDeal("group82DES主密钥密钥测试失败" + i, res89);

						}
						Ddi.ddi_innerkey_open();
						int res3 = Ddi.ddi_innerkey_delete_key(0, i);
						if (res3 == 0) {
							myHandleDeal("group82删除主密钥测试成功" + i, res3);

						} else {
							myHandleDeal("group82删除主密钥测试失败" + i, res3);
						}
					} else {
						myHandleDeal("group82更新主密钥失败" + i, res0);
					}
					int res23 = Ddi.ddi_innerkey_close();
					if (res23 == 0) {
						myHandleDeal("group82关闭设备成功", res23);
					} else {
						myHandleDeal("group82关闭设备失败", res23);
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
		myHandleDeal("testgroup83测试", 0);
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
						myHandleDeal("更新主密钥成功", res0);
					for (int i = 0; i < 450; i++) {
						int res6 = Ddi.ddi_innerkey_open();
						if (res6 == 0) {
							myHandleDeal("group83打开设备成功" + i, res6);
						} else {
							myHandleDeal("group83打开设备失败" + i, res6);
						}
						Ddi.ddi_innerkey_open();
						int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 0, i, 0, ipIn, innerkey4, 16, ipOut, 16);
						if (res1 == 0) {
							myHandleDeal("group83更新工作秘钥成功" + i, res1);
							Ddi.ddi_innerkey_open();
							int res5 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, i, (byte) 0, ipIn, innerkey4,
									innerkey4.length, DataOut, leOut);// 工作密钥加密
							String data = ByteUtils.byteArray2HexString(DataOut);
							if (res5 == 0 && data.equalsIgnoreCase(data0)) {
								myHandleDeal("group83更新工作秘钥加密成功" + i, res5);
							} else {
								myHandleDeal("group83更新工作秘钥加密失败" + data, res5);
							}
							Ddi.ddi_innerkey_open();
							int res3 = Ddi.ddi_innerkey_delete_key(1, i);
							if (res3 == 0) {
								myHandleDeal("group83删除工作密钥测试成功" + i, res3);

							} else {
								myHandleDeal("group83删除工作密钥测试失败" + i, res3);
							}

						}
						int res7 = Ddi.ddi_innerkey_close();
						if (res7 == 0) {
							myHandleDeal("group83关闭设备成功" + i, res7);
						} else {
							myHandleDeal("group83关闭设备失败" + i, res7);
						}
					}
					} else {
						myHandleDeal("group83更新工作秘钥失败", res0);
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
		myHandleDeal("testgroup84测试", 0);

		Thread mThread = new Thread(new Runnable() {
			public void run() {
				// 主密钥明文
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
						myHandleDeal("group84打开设备成功" + i, res6);
					} else {
						myHandleDeal("group84打开设备失败" + i, res6);
					}
					// DES加密
					int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 143, innerkey1, 16);
					if (res0 == 0) {
						myHandleDeal("DES更新主密钥成功" + i + "次", res0);
						// 12345678abcdEFBFABCDefBCabcdEFBF==msg_summery
						int res5 = Ddi.ddi_innerkey_des_encrypt(0, 143, 0, ipIn, msg_summery, 16, DataOut);// 主密钥DES加密
						String data = ByteUtils.byteArray2HexString(DataOut);
						if (res5 == 0 && data.equalsIgnoreCase(data0)) {
							myHandleDeal("DES主密钥DES加密成功" + i + "次", res5);
						} else {
							myHandleDeal("DES主密钥DES加密失败" + i + "次" + data, res5);
						}

					} else {
						myHandleDeal("DES更新主密钥失败" + i + "次", res0);
					}
					// SM4加密
					Ddi.ddi_innerkey_open();
					int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 145, innerkey1, 16);
					if (res1 == 0) {
						myHandleDeal("SM4更新主密钥成功" + i + "次", res1);
						// 12345678abcdEFBFABCDefBCabcdEFBF==msg_summery
						int res5 = Ddi.ddi_innerkey_nes_sm4_encrypt(0, 145, (byte) 0, ipIn, msg_summery, 16, DataOut,
								leOut);// 主密钥SM4加密
						String data = ByteUtils.byteArray2HexString(DataOut);
						if (res5 == 0 && data.equalsIgnoreCase(data1)) {
							myHandleDeal("SM4主密钥加密成功" + i + "次", res5);
						} else {
							myHandleDeal("SM4主密钥加密失败" + i + "次" + data, res5);
						}

					} else {
						myHandleDeal("SM4更新主密钥失败" + i + "次", res1);
					}
					// AES加密
					Ddi.ddi_innerkey_open();
					int res4 = Ddi.ddi_innerkey_update_mk((byte) 0x04, 77, innerkey3, 16);
					if (res4 == 0) {
						myHandleDeal("AES更新主密钥成功" + i + "次", res4);
						// 12345678abcdEFBFABCDefBCabcdEFBF==msg_summery
						int res5 = Ddi.ddi_innerkey_aes_encrypt(0, 77, (byte) 0, ipIn, msg_summery, 16, DataOut);// 主密钥AES加密
						String data = ByteUtils.byteArray2HexString(DataOut);
						if (res5 == 0 && data.equalsIgnoreCase(key2)) {
							myHandleDeal("AES主密钥加密成功" + i + "次", res5);
						} else {
							myHandleDeal("AES主密钥加密失败" + i + "次" + data, res5);
						}
					} else {
						myHandleDeal("AES更新主密钥失败" + i + "次", res4);
					}

					// DUKPT加密

					res1 = Ddi.ddi_dukpt_open();
					int res7 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 0, 2, m_initkey1, (byte) 0x10, m_initksn,
							(byte) 0xa);
					if (res7 == 0) {
						myHandleDeal("dukpt注入密钥成功" + i + "次", res7);
						// 12345678abcdEFBFABCDefBCabcdEFBF==msg_summery
						int res5 = Ddi.ddi_dukpt_encrypt(0, 0, (byte) 0, iv, 0, m_plain, m_plain.length, cipher);// 主密钥AES加密
						String data = ByteUtils.byteArray2HexString(cipher);
						if (res5 == 0 && data.equalsIgnoreCase(key4)) {
							myHandleDeal("dukpt主密钥加密成功" + i + "次", res5);
						} else {
							myHandleDeal("dukpt主密钥加密失败" + i + "次" + data, res5);
						}
					} else {
						myHandleDeal("dukpt更新主密钥失败" + i + "次", res7);
					}
					Ddi.ddi_dukpt_close();

					// SM2加解密
					Ddi.ddi_innerkey_open();
					int res9 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, 0, puk, prk);
					if (res9 == 0) {
						myHandleDeal("SM2更新密钥成功" + i + "次", res9);

					} else {
						myHandleDeal("SM2更新密钥失败" + i + "次", res9);
					}
					int res13 = Ddi.ddi_innerkey_close();
					if (res13 == 0) {
						myHandleDeal("group84关闭设备成功" + i, res13);
					} else {
						myHandleDeal("group84关闭设备失败" + i, res13);
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
		myHandleDeal("testgroup11测试", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		String key3 = "CA02764FC025A3907E926B112EF27CC2";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		byte[] output = new byte[16];
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 122, innerkey1, 16);
		if (res0 == 0) {
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 122, 2, 1, ipIn, innerkey2, 16, ipOut, 16);
			if (res1 == 0) {
				myHandleDeal("group11更新工作密钥测试成功", res1);
			} else {
				myHandleDeal("group11更新工作密钥测试失败", res1);
			}
			int res2 = Ddi.ddi_innerkey_des_encrypt(0, 122, 0, ipIn, msg_summery, 16, ipOut);
			// 2019.3.11最新添加的用例
			//12345678abcdEFBFABCDefBCabcdEFBF=msg_summery
			//CBC工明：4BF6699A03307BDE2D681E40C96EBC7E
			//ECB工明：7BC659AAA8FD94477B4C94EA63C416D4
			int res3 = Ddi.ddi_innerkey_des_encrypt(1, 2, 1, ipIn, msg_summery, 16, output);
			String byteArray2HexString = ByteUtils.byteArray2HexString(output);

			if (res2 + res3 == 0 && key3.equalsIgnoreCase(byteArray2HexString)) {
				myHandleDeal("group11工作密钥加密成功" + res2 + ":" + res3, res2);
			} else {
				myHandleDeal("group11工作秘钥加密失败"+byteArray2HexString, res2);
			}
		} else {
			myHandleDeal("group11更新主密钥失败", res0);
		}

	}

	private void testgroup12() {
		myHandleDeal("testgroup12测试", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF78abcdEFBFABCDef";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF78abcdEFBFABCDef";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 75, innerkey1, 24);
		if (res0 == 0) {
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 75, 225, 1, ipIn, innerkey2, 24, ipOut, 24);
			if (res1 == 0) {
				myHandleDeal("更新工作密钥测试成功", res1);
			} else {
				myHandleDeal("group12更新工作密钥测试失败", res1);
			}
		} else {
			myHandleDeal("group12更新主密钥失败", res0);
		}

	}

	private void testgroup13() {
		myHandleDeal("testgroup13测试", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF9999efBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 149, innerkey1, 24);
		if (res0 == 0) {
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 149, 0, 1, ipIn, innerkey2, 24, ipOut, 24);
			if (res1 == 0) {
				myHandleDeal("更新工作密钥测试成功", res1);
			} else {
				myHandleDeal("group13更新工作密钥测试失败", res1);
			}
		} else {
			myHandleDeal("group13更新主密钥失败", res0);
		}

	}

	private void testgroup14() {
		
//		myHandleDeal("testgroup14测试", 0);
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
//			myHandleDeal("更新主密钥成功", res0);
//			//工作秘钥明文：9C8B1648927397EB0F5C8A72C0C917E30F5C8A72C0C917E3
//			//ipin:30303030abCDef99a1da25f1e411fea5
//			//msg_summery=12345678abcdEFBFABCDefBCabcdEFBF
//			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 149, 449, 0, ipIn, innerkey2, 24, ipOut, 24);
//			int res2 = Ddi.ddi_innerkey_des_encrypt(0, 149, 1, ipIn, msg_summery, 16, DataOut);// 主密钥加密
//			String data = ByteUtils.byteArray2HexString(DataOut);
//			if (res2 == 0 && data.equals(data1)) {
//				myHandleDeal("主密钥加密成功", res2);
//			} else {
//				myHandleDeal("group14主密钥加密失败"+data, res2);
//			}
////			int res3 = Ddi.ddi_innerkey_delete_key(0, 149);
////			if (res3 == 0) {
////				myHandleDeal("删除主密钥成功", res3);
////				int res4 = Ddi.ddi_innerkey_des_encrypt(0, 149, 0, ipIn, msg_summery, 16, DataOut);
////				if (res4 == -6) {
////					myHandleDeal("主密钥加密测试成功", res4);
////				} else {
////					myHandleDeal("group14主密钥加密测试失败", res4);
////				}
////			} else {
////				myHandleDeal("group14删除主密钥失败", res3);
////			}
//			if (res1 == 0) {
//				myHandleDeal("更新工作密钥成功", res1);
//				int res5 = Ddi.ddi_innerkey_des_encrypt(1, 449, 1, ipIn, msg_summery, 16, DataOut);// 工作密钥加密
//				data = ByteUtils.byteArray2HexString(DataOut);
//				if (res5 == 0 && data.equalsIgnoreCase(data2)) {
//					myHandleDeal("工作密钥加密成功", res5);
//				} else {
//					myHandleDeal("group14工作密钥加密失败" + data, res5);
//				}
//				int res6 = Ddi.ddi_innerkey_des_decrypt(1, 449, 0, 0, ipIn, msg_summery1, 16, DataOut);// 工作密钥解密
//				data = ByteUtils.byteArray2HexString(DataOut);
//				if (res6 == 0 && data.equalsIgnoreCase(data0)) {
//					myHandleDeal("工作密钥解密成功", res6);
//				} else {
//					myHandleDeal("group14工作密钥解密失败" + data, res6);
//				}
//				int res7 = Ddi.ddi_innerkey_delete_key(1, 449);
////				if (res7 == 0) {
////					myHandleDeal("删除工作密钥成功", res7);
////					int res8 = Ddi.ddi_innerkey_des_encrypt(1, 449, 0, ipIn, msg_summery, 16, DataOut);
////					if (res8 == -6) {
////						myHandleDeal("工作密钥加密测试成功", res8);
////					} else {
////						myHandleDeal("group14工作密钥加密测试失败", res8);
////					}
////				} else {
////					myHandleDeal("group14删除工作密钥失败", res7);
////				}
//			} else {
//				myHandleDeal("group14更新工作密钥失败", res1);
//			}
//
//		} else {
//			myHandleDeal("group14更新主密钥失败", res0);
//		}
		
		
		myHandleDeal("testgroup14测试", 0);
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
			myHandleDeal("更新主密钥成功", res0);
			//工作秘钥明文：9C8B1648927397EB0F5C8A72C0C917E30F5C8A72C0C917E3
			//ipin:30303030abCDef99a1da25f1e411fea5
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 149, 449, 1, ipIn, innerkey2, 24, ipOut, 24);
			int res2 = Ddi.ddi_innerkey_des_encrypt(0, 149, 0, ipIn, msg_summery, 16, DataOut);// 主密钥加密
			String data = ByteUtils.byteArray2HexString(DataOut);
			if (res2 == 0 && data.equals(data1)) {
				myHandleDeal("主密钥加密成功", res2);
			} else {
				myHandleDeal("group14主密钥加密失败"+data, res2);
			}
			int res3 = Ddi.ddi_innerkey_delete_key(0, 149);
			if (res3 == 0) {
				myHandleDeal("删除主密钥成功", res3);
				int res4 = Ddi.ddi_innerkey_des_encrypt(0, 149, 0, ipIn, msg_summery, 16, DataOut);
				if (res4 == -6) {
					myHandleDeal("主密钥加密测试成功", res4);
				} else {
					myHandleDeal("group14主密钥加密测试失败", res4);
				}
			} else {
				myHandleDeal("group14删除主密钥失败", res3);
			}
			if (res1 == 0) {
				myHandleDeal("更新工作密钥成功", res1);
				int res5 = Ddi.ddi_innerkey_des_encrypt(1, 449, 0, ipIn, msg_summery, 16, DataOut);// 工作密钥加密
				data = ByteUtils.byteArray2HexString(DataOut);
				if (res5 == 0 && data.equalsIgnoreCase(data2)) {
					myHandleDeal("工作密钥加密成功", res5);
				} else {
					myHandleDeal("group14工作密钥加密失败" + data, res5);
				}
				int res6 = Ddi.ddi_innerkey_des_decrypt(1, 449, 0, 0, ipIn, msg_summery1, 16, DataOut);// 工作密钥解密
				data = ByteUtils.byteArray2HexString(DataOut);
				if (res6 == 0 && data.equalsIgnoreCase(data0)) {
					myHandleDeal("工作密钥解密成功", res6);
				} else {
					myHandleDeal("group14工作密钥解密失败" + data, res6);
				}
				int res7 = Ddi.ddi_innerkey_delete_key(1, 449);
				if (res7 == 0) {
					myHandleDeal("删除工作密钥成功", res7);
					int res8 = Ddi.ddi_innerkey_des_encrypt(1, 449, 0, ipIn, msg_summery, 16, DataOut);
					if (res8 == -6) {
						myHandleDeal("工作密钥加密测试成功", res8);
					} else {
						myHandleDeal("group14工作密钥加密测试失败", res8);
					}
				} else {
					myHandleDeal("group14删除工作密钥失败", res7);
				}
			} else {
				myHandleDeal("group14更新工作密钥失败", res1);
			}
			
		} else {
			myHandleDeal("group14更新主密钥失败", res0);
		}
		
	}

	private void testgroup15() {
		

		myHandleDeal("testgroup15测试", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 149, innerkey1, 16);
		if (res0 == 0) {
			myHandleDeal("更新主密钥成功", res0);
			
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 149, 449, 1, ipIn, innerkey2, 16, ipOut, 16);
			if (res1 == 0) {
				myHandleDeal("更新工作密钥测试成功", res1);
			} else {
				myHandleDeal("group15更新工作密钥测试失败", res1);
			}
		} else {
			myHandleDeal("group15更新主密钥失败", res0);
		}
	}

	private void testgroup16() {
		myHandleDeal("testgroup16测试", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 149, innerkey1, 16);
		if (res0 == 0) {
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x00, 149, 449, 1, ipIn, innerkey2, 8, ipOut, 8);
			if (res1 == 0) {
				myHandleDeal("更新工作密钥测试成功", res1);
			} else {
				myHandleDeal("group16更新工作密钥测试失败", res1);
			}
		} else {
			myHandleDeal("group16更新主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup17() {
		myHandleDeal("testgroup17测试", 0);
		String key1 = "12345678abcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x00, 149, innerkey1, 8);
		if (res0 == 0) {
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 149, 449, 1, ipIn, innerkey2, 16, ipOut, 16);
			if (res1 == -6) {
				myHandleDeal("更新工作密钥测试成功", res1);
			} else {
				myHandleDeal("group17更新工作密钥测试失败", res1);
			}
		} else {
			myHandleDeal("group17更新主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup18() {
		myHandleDeal("testgroup18测试", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF12345678abcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 149, innerkey1, 24);
		if (res0 == 0) {
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 149, 449, 1, ipIn, innerkey2, 16, ipOut, 16);
			// int res1 =
			// Ddi.ddi_innerkey_update_wk((byte)0x00,2,0,0,ipIn,innerkey,8,ipOut,8);
			if (res1 == 0) {
				myHandleDeal("更新工作密钥成功", res1);
			} else {
				myHandleDeal("group18更新工作密钥失败", res1);
			}
		} else {
			myHandleDeal("group18更新主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
//		 byte[] innerkey = new byte[512];
//		
//		 byte[] innerkey3 = new byte[512];
//	myHandleDeal("testgroup18测试",0);
//	String key1 = "12345678abcdEFBFABCDefBCabcdEFBF12345678abcdEFBF";
//	byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
//	String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
//	byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
//	Ddi.ddi_innerkey_open();
//	int res0 = Ddi.ddi_innerkey_update_mk((byte)0x02,2,innerkey3,24);
//	if(res0==0){
//		myHandleDeal("更新主密钥成功",res0);
//		
//		int res1 = Ddi.ddi_innerkey_update_wk((byte)0x00,2,0,0,ipIn,innerkey,8,ipOut,8); 
//		if(res1==0){
//			myHandleDeal("更新工作密钥成功",res1);	
//		}else{
//			myHandleDeal("group18更新工作密钥失败",res1);
//		}
//		int res3=Ddi.ddi_innerkey_des_decrypt(1,0,0,1,ipIn,msg_summery,16,ipOut);
//		if (res3==0) {
//			myHandleDeal("group18DES加密成功",res3);
//		}else {
//			myHandleDeal("group18DES加密失败",res3);
//		}
//		
//	}else{
//		myHandleDeal("group18更新主密钥失败",res0);
//	}
//	Ddi.ddi_innerkey_close();

	}

	private void testgroup19() {
		myHandleDeal("testgroup19测试", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF12345678abcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 149, innerkey1, 24);
		if (res0 == 0) {
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 149, 449, 1, ipIn, innerkey2, 16, ipOut, 16);
			if (res1 == -6) {
				myHandleDeal("更新工作密钥测试成功", res1);
			} else {
				myHandleDeal("group19更新工作密钥测试失败", res1);
			}
		} else {
			myHandleDeal("group19更新主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup20() {
		myHandleDeal("testgroup20测试", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 149, innerkey1, 16);
		if (res0 == 0) {
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 149, 449, 1, ipIn, innerkey2, 16, ipOut, 16);
			if (res1 == -6) {
				myHandleDeal("更新工作密钥测试成功", res1);
			} else {
				myHandleDeal("group20更新工作密钥测试失败", res1);
			}
		} else {
			myHandleDeal("group20更新主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup21() {
		myHandleDeal("testgroup21测试", 0);
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
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 149, 449, 1, ipIn, innerkey2, 16, ipOut, 16);
			int res2 = Ddi.ddi_innerkey_nes_sm4_encrypt(0, 149, (byte) 0x01, ipIn, msg_summery, 16, DataOut, leOut);// 主密钥加密
			String data = ByteUtils.byteArray2HexString(DataOut);
			if (res2 == 0 && data.equals(data0)) {
				myHandleDeal("主密钥加密成功", res2);
			} else {
				myHandleDeal("group21主密钥加密失败", res2);
			}
			int res3 = Ddi.ddi_innerkey_delete_key(0, 149);
			if (res3 == 0) {
				myHandleDeal("删除主密钥成功", res3);
				int res4 = Ddi.ddi_innerkey_nes_sm4_encrypt(0, 149, (byte) 0x01, ipIn, msg_summery, 16, DataOut, leOut);
				if (res4 == -6) {
					myHandleDeal("主密钥加密测试成功", res4);
				} else {
					myHandleDeal("group21主密钥加密测试失败", res4);
				}
			} else {
				myHandleDeal("group21删除主密钥失败", res3);
			}
			if (res1 == 0) {
				myHandleDeal("更新工作密钥成功", res1);
				int res5 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, 449, (byte) 0x01, ipIn, msg_summery, 16, DataOut, leOut);// 工作密钥加密
				data = ByteUtils.byteArray2HexString(DataOut);
				if (res5 == 0 && data.equals(data1)) {
					myHandleDeal("工作密钥加密成功", res5);
				} else {
					myHandleDeal("group21工作密钥加密失败", res5);
				}
				int res6 = Ddi.ddi_innerkey_nes_sm4_decrypt(1, 449, 0, (byte) 0x01, ipIn, msg_summery1, 16, DataOut,
						leOut);// 工作密钥解密
				data = ByteUtils.byteArray2HexString(DataOut);
				if (res6 == 0 && data.equals(data2)) {
					myHandleDeal("工作密钥解密成功", res6);
				} else {
					myHandleDeal("group21工作密钥解密失败", res6);
				}
				int res7 = Ddi.ddi_innerkey_delete_key(1, 449);
				if (res7 == 0) {
					myHandleDeal("删除工作密钥成功", res7);
					int res8 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, 449, (byte) 0x01, ipIn, msg_summery, 16, DataOut,
							leOut);
					if (res8 == -6) {
						myHandleDeal("工作密钥加密测试成功", res8);
					} else {
						myHandleDeal("group21工作密钥加密测试失败", res8);
					}
				} else {
					myHandleDeal("group21删除工作密钥失败", res7);
				}
			} else {
				myHandleDeal("group21更新工作密钥失败", res1);
			}

		} else {
			myHandleDeal("group21更新主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup22() {
		myHandleDeal("testgroup22测试", 0);
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
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x00, 0, 0, 1, ipIn, innerkey1, 8, ipOut, 8);
			if (res1 == 0) {
				myHandleDeal("更新工作密钥测试成功", res1);
			} else {
				myHandleDeal("group22更新工作密钥测试失败", res1);
			}
		} else {
			myHandleDeal("group22更新主密钥失败", res0);
		}
		int res2 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 1, innerkey2, 16);
		if (res2 == 0) {
			myHandleDeal("更新主密钥成功", res2);
			int res3 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 1, 1, 1, ipIn, innerkey2, 16, ipOut, 16);
			if (res3 == 0) {
				myHandleDeal("更新工作密钥测试成功", res3);
			} else {
				myHandleDeal("group22更新工作密钥测试失败", res3);
			}
		} else {
			myHandleDeal("group22更新主密钥失败", res2);
		}
		int res5 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 75, innerkey3, 24);
		if (res5 == 0) {
			myHandleDeal("更新主密钥成功", res5);
			int res6 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 75, 225, 1, ipIn, innerkey3, 24, ipOut, 24);
			if (res6 == 0) {
				myHandleDeal("更新工作密钥测试成功", res6);
			} else {
				myHandleDeal("group22更新工作密钥测试失败", res6);
			}
		} else {
			myHandleDeal("group22更新主密钥失败", res5);
		}
		int res7 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 149, innerkey4, 16);
		if (res7 == 0) {
			myHandleDeal("更新主密钥成功", res7);
			int res8 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 149, 449, 1, ipIn, innerkey4, 16, ipOut, 16);
			if (res8 == 0) {
				myHandleDeal("更新工作密钥测试成功", res8);
			} else {
				myHandleDeal("group22更新工作密钥测试失败", res8);
			}
		} else {
			myHandleDeal("group22更新主密钥失败", res7);
		}
		int res9 = Ddi.ddi_innerkey_delete_key(0, 0);
		if (res9 == 0) {
			myHandleDeal("删除秘钥成功", res9);
		} else {
			myHandleDeal("group22删除秘钥失败", res9);
		}
		int res10 = Ddi.ddi_innerkey_delete_key(0, 1);
		if (res10 == 0) {
			myHandleDeal("删除秘钥成功", res10);
		} else {
			myHandleDeal("group22删除秘钥失败", res10);
		}
		int res11 = Ddi.ddi_innerkey_delete_key(0, 75);
		if (res11 == 0) {
			myHandleDeal("删除秘钥成功", res11);
		} else {
			myHandleDeal("group22删除秘钥失败", res11);
		}
		int res12 = Ddi.ddi_innerkey_delete_key(0, 149);
		if (res12 == 0) {
			myHandleDeal("删除秘钥成功", res12);
		} else {
			myHandleDeal("group22删除秘钥失败", res12);
		}
		int res13 = Ddi.ddi_innerkey_delete_key(0, 150);
		if (res13 == -6) {
			myHandleDeal("删除秘钥测试成功", res13);
		} else {
			myHandleDeal("group22删除秘钥测试失败", res13);
		}
		int res14 = Ddi.ddi_innerkey_delete_key(1, 0);
		if (res14 == 0) {
			myHandleDeal("删除秘钥成功", res14);
		} else {
			myHandleDeal("group22删除秘钥失败", res14);
		}
		int res15 = Ddi.ddi_innerkey_delete_key(1, 1);
		if (res15 == 0) {
			myHandleDeal("删除秘钥成功", res15);
		} else {
			myHandleDeal("group22删除秘钥失败", res15);
		}
		int res16 = Ddi.ddi_innerkey_delete_key(1, 225);
		if (res16 == 0) {
			myHandleDeal("删除秘钥成功", res16);
		} else {
			myHandleDeal("group22删除秘钥失败", res16);
		}
		int res17 = Ddi.ddi_innerkey_delete_key(1, 449);
		if (res17 == 0) {
			myHandleDeal("删除秘钥成功", res17);
		} else {
			myHandleDeal("group22删除秘钥失败", res17);
		}
		int res18 = Ddi.ddi_innerkey_delete_key(1, 450);
		if (res18 == -6) {
			myHandleDeal("删除秘钥成功", res18);
		} else {
			myHandleDeal("group22删除秘钥失败", res18);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup23() {
		myHandleDeal("testgroup23测试", 0);
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
				myHandleDeal("更新主密钥成功", res1);
//				Log.v("testgroup23", "" + i);
			} else {
				myHandleDeal("group23更新主密钥失败1" + i, res1);
			}
			int res2 = Ddi.ddi_innerkey_update_mk((byte) 0x01, i, innerkey2, 16);
			if (res2 == 0) {
				myHandleDeal("更新主密钥成功", res2);
			} else {
				myHandleDeal("group23更新主密钥失败2" + i, res2);
			}
			int res3 = Ddi.ddi_innerkey_update_mk((byte) 0x02, i, innerkey3, 24);
			if (res3 == 0) {
				myHandleDeal("更新主密钥成功", res3);
			} else {
				myHandleDeal("group23更新主密钥失败3" + i, res3);
			}
			int res4 = Ddi.ddi_innerkey_update_mk((byte) 0x03, i, innerkey4, 16);
			if (res4 == 0) {
				myHandleDeal("更新主密钥成功", res4);
			} else {
				myHandleDeal("group23更新主密钥失败4" + i, res4);
			}
			int res5 = Ddi.ddi_innerkey_update_mk((byte) 0x04, i, innerkey4, 16);
			if (res5 == 0) {
				myHandleDeal("更新主密钥成功", res5);
			} else {
				myHandleDeal("group23更新主密钥失败5" + i, res5);
			}
			int res6 = Ddi.ddi_innerkey_update_mk((byte) 0x05, i, innerkey3, 24);
			if (res6 == 0) {
				myHandleDeal("更新主密钥成功", res6);
			} else {
				myHandleDeal("group23更新主密钥失败5" + i, res6);
			}
			int res7 = Ddi.ddi_innerkey_update_mk((byte) 0x06, i, innerkey5, 32);
			if (res7 == 0) {
				myHandleDeal("更新主密钥成功", res7);
			} else {
				myHandleDeal("group23更新主密钥失败7" + i, res7);
			}
		}
		for (int j = 0; j < 450; j++) {
			Ddi.ddi_innerkey_update_mk((byte) 0x00, 0, innerkey1, 8);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x00, 0, j, 0, ipIn, innerkey1, 8, ipOut, 200);
			if (res1 == 0) {
				myHandleDeal("更新工作密钥成功", res1);
			} else {
				myHandleDeal("1group23更新工作密钥失败1" + j, res1);
			}
			Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey2, 16);
			int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, j, 0, ipIn, innerkey2, 16, ipOut, 200);
			if (res2 == 0) {
				myHandleDeal("更新工作密钥成功", res2);
			} else {
				myHandleDeal("group23更新工作密钥失败2" + j, res2);
			}
			Ddi.ddi_innerkey_update_mk((byte) 0x02, 0, innerkey3, 24);
			int res3 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 0, j, 0, ipIn, innerkey3, 24, ipOut, 200);
			if (res3 == 0) {
				myHandleDeal("更新工作密钥成功", res3);
			} else {
				myHandleDeal("group23更新工作密钥失败3" + j, res3);
			}
			Ddi.ddi_innerkey_update_mk((byte) 0x03, 0, innerkey4, 16);
			int res4 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 0, j, 1, ipIn, innerkey4, 16, ipOut, 16);
			if (res4 == 0) {
				myHandleDeal("更新工作密钥成功", res4);
			} else {
				myHandleDeal("group23更新工作密钥失败4" + j, res4);
			}
			Ddi.ddi_innerkey_update_mk((byte) 0x04, 0, innerkey4, 16);
			int res5 = Ddi.ddi_innerkey_update_wk((byte) 0x04, 0, j, 1, ipIn, innerkey4, 16, ipOut, 16);
			if (res5 == 0) {
				myHandleDeal("更新工作密钥成功", res5);
			} else {
				myHandleDeal("group23更新工作密钥失败5" + j, res5);
			}
			Ddi.ddi_innerkey_update_mk((byte) 0x05, 0, innerkey3, 24);
			int res6 = Ddi.ddi_innerkey_update_wk((byte) 0x05, 0, j, 1, ipIn, innerkey5, 32, ipOut, 32);
			if (res6 == 0) {
				myHandleDeal("更新工作密钥成功", res6);
			} else {
				myHandleDeal("group23更新工作密钥失败6" + j, res6);
			}
			Ddi.ddi_innerkey_update_mk((byte) 0x06, 0, innerkey5, 32);
			int res7 = Ddi.ddi_innerkey_update_wk((byte) 0x06, 0, j, 1, ipIn, innerkey5, 32, ipOut, 32);
			if (res7 == 0) {
				myHandleDeal("更新工作密钥成功", res7);
				
			} else {
				myHandleDeal("group23更新工作密钥失败7" + j, res7);
			}
		}
		for (int k = 0; k < 16; k++) {
			int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(4, k, puk, prk);
			if (res1 == 0) {
				myHandleDeal("更新SM2密钥成功", res1);
			} else {
				myHandleDeal("group23更新SM2密钥失败4" + k, res1);
			}
			int res2 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, k, puk, prk);
			if (res2 == 0) {
				myHandleDeal("更新SM2密钥成功", res2);
			} else {
				myHandleDeal("group23更新SM2密钥失败3" + k, res2);
			}
			int res3 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(0, k, puk, prk);
			if (res3 == 0) {
				myHandleDeal("更新SM2密钥成功", res3);
			} else {
				myHandleDeal("group23更新SM2密钥失败0" + k, res3);
			}
			int res4 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(1, k, puk, prk);
			if (res4 == 0) {
				myHandleDeal("更新SM2密钥成功", res4);
			} else {
				myHandleDeal("group23更新SM2密钥失败1" + k, res4);
			}
			int res5 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(2, k, puk, prk);
			if (res5 == -6) {
				myHandleDeal("更新SM2密钥成功", res5);
			} else {
				myHandleDeal("group23更新SM2密钥失败2" + k, res5);
			}
		}

	}

	private void testgroup24() {
		myHandleDeal("testgroup24测试", 0);
		String key1 = "12345678abcdEFBF";
		String data = "4fb631748a286e19";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] DataOut = new byte[8];
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_delete_key(0, 1);
		if (res0 == 0) {
			myHandleDeal("删除主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x00, 0, innerkey1, 8);
			if (res1 == 0) {
				myHandleDeal("更新主密钥测试成功", res1);
				int res2 = Ddi.ddi_innerkey_des_decrypt(0, 0, 1, 0, ipIn, innerkey1, 8, ipOut);
				if (res2 == 0) {
					myHandleDeal("主密钥解密成功", res2);
					int res3 = Ddi.ddi_innerkey_des_encrypt(0, 1, 0, ipIn, innerkey1, 8, DataOut);
					String data1 = ByteUtils.byteArray2HexString(DataOut);
					if (res3 == 0 && data1.equals(data)) {
						myHandleDeal("主密钥加密成功", res3);
					} else {
						myHandleDeal("group24主密钥加密失败", res3);
					}
				} else {
					myHandleDeal("group24主密钥解密失败", res2);
				}
			} else {
				myHandleDeal("group24更新主密钥测试失败", res1);
			}
		} else {
			myHandleDeal("group24删除主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}
	
	

	private void testgroup25() {
		myHandleDeal("testgroup25测试", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		String data = "f6c578676d4b1aa5d659a05a53eb7f4f";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] DataOut = new byte[16];
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_delete_key(0, 1);
		if (res0 == 0) {
			myHandleDeal("删除主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
			if (res1 == 0) {
				myHandleDeal("更新主密钥测试成功", res1);
				int res2 = Ddi.ddi_innerkey_des_decrypt(0, 0, 1, 0, ipIn, innerkey1, 16, ipOut);
				if (res2 == 0) {
					myHandleDeal("主密钥解密成功", res2);
					int res3 = Ddi.ddi_innerkey_des_encrypt(0, 1, 0, ipIn, innerkey1, 16, DataOut);
					String data1 = ByteUtils.byteArray2HexString(DataOut);
					if (res3 == 0 && data1.equals(data)) {
						myHandleDeal("主密钥加密成功", res3);
					} else {
						myHandleDeal("group25主密钥加密失败", res3);
					}
				} else {
					myHandleDeal("group25主密钥解密失败", res2);
				}
			} else {
				myHandleDeal("group25更新主密钥测试失败", res1);
			}
		} else {
			myHandleDeal("group25删除主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup26() {
		myHandleDeal("testgroup26测试", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF12345678abcdEFBF";
		String data = "c7f9bc762b357ffa01916de29c8193333de0a04ff317d291";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] DataOut = new byte[24];
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_delete_key(0, 1);
		if (res0 == 0) {
			myHandleDeal("删除主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 0, innerkey1, 24);
			if (res1 == 0) {
				myHandleDeal("更新主密钥测试成功", res1);
				int res2 = Ddi.ddi_innerkey_des_decrypt(0, 0, 1, 0, ipIn, innerkey1, 24, ipOut);
				if (res2 == 0) {
					myHandleDeal("主密钥解密成功", res2);
					int res3 = Ddi.ddi_innerkey_des_encrypt(0, 1, 0, ipIn, innerkey1, 24, DataOut);
					String data1 = ByteUtils.byteArray2HexString(DataOut);
					if (res3 == 0 && data1.equals(data)) {
						myHandleDeal("主密钥加密成功", res3);
					} else {
						myHandleDeal("group26主密钥加密失败", res3);
					}
				} else {
					myHandleDeal("group26主密钥解密失败", res2);
				}
			} else {
				myHandleDeal("group26更新主密钥测试失败", res1);
			}
		} else {
			myHandleDeal("group26删除主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup27() {
		myHandleDeal("testgroup27测试", 0);
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
			myHandleDeal("删除主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 0, innerkey1, 16);
			if (res1 == 0) {
				myHandleDeal("更新主密钥成功", res1);
				int res2 = Ddi.ddi_innerkey_nes_sm4_decrypt(0, 0, 1, (byte) 0x01, ipIn, msg_summery, 16, ipOut1, leOut);
				if (res2 == 0) {
					myHandleDeal("主密钥解密成功", res2);
					int res3 = Ddi.ddi_innerkey_nes_sm4_encrypt(0, 1, (byte) 0x01, ipIn, msg_summery, 16, ipOut2,
							leOut);
					String data2 = ByteUtils.byteArray2HexString(ipOut2);
					if (res3 == 0 && data2.equals(data1)) {
						myHandleDeal("主密钥加密成功", res3);
					} else {
						myHandleDeal("group27主密钥加密失败", res3);
					}
				} else {
					myHandleDeal("group27主密钥解密失败", res2);
				}
			} else {
				myHandleDeal("group27更新主密钥失败", res1);
			}
		} else {
			myHandleDeal("group27删除主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup28() {
		myHandleDeal("testgroup28测试", 0);
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
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_aes_encrypt(0, 0, (byte) 0, ipIn, m_plain, m_plain.length, cipher);
			String data2 = ByteUtils.byteArray2HexString(cipher);
			if (res1 == 0 && data2.equals(data)) {
				myHandleDeal("主密钥加密成功", res1);
			} else {
				myHandleDeal("group28主密钥加密失败", res1);
			}
		} else {
			myHandleDeal("group28更新主密钥失败", res0);
		}
		int res2 = Ddi.ddi_innerkey_delete_key(0, 1);
		if (res2 == 0) {
			myHandleDeal("删除主密钥成功", res2);
			int res3 = Ddi.ddi_innerkey_aes_decrypt(0, 0, 1, (byte) 0, ipIn, m_data, m_data.length, cipher);
			if (res3 == 0) {
				myHandleDeal("主密钥解密成功", res3);
				int res4 = Ddi.ddi_innerkey_aes_encrypt(0, 1, (byte) 0, ipIn, m_plain, m_plain.length, cipher1);
				String data3 = ByteUtils.byteArray2HexString(cipher1);
				if (res4 == 0 && data3.equals(data1)) {
					myHandleDeal("主密钥加密成功", res4);
				} else {
					myHandleDeal("group28主密钥加密失败", res4);
				}
			} else {
				myHandleDeal("group28主密钥解密失败", res3);
			}
		} else {
			myHandleDeal("group28删除主密钥失败", res2);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup29() {
		myHandleDeal("testgroup29测试", 0);
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
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_aes_encrypt(0, 0, (byte) 1, ipIn, m_plain, m_plain.length, cipher);
			String data2 = ByteUtils.byteArray2HexString(cipher);
//			Log.d("1111111111", data2);
			if (res1 == 0 && data2.equals(data)) {
				myHandleDeal("主密钥加密成功", res1);
			} else {
				myHandleDeal("group29主密钥加密失败", res1);
			}
		} else {
			myHandleDeal("group29更新主密钥失败", res0);
		}
		int res2 = Ddi.ddi_innerkey_aes_decrypt(0, 0, 1, (byte) 1, ipIn, m_data, m_data.length, cipher);
		if (res2 == 0) {
			myHandleDeal("主密钥解密成功", res2);
		} else {
			myHandleDeal("group29主密钥解密失败", res2);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup30() {
		myHandleDeal("testgroup30测试", 0);
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
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_aes_encrypt(0, 77, (byte) 1, ipIn, m_plain, m_plain.length, cipher);
			String data2 = ByteUtils.byteArray2HexString(cipher);
			if (res1 == 0 && data2.equals(data)) {
				myHandleDeal("主密钥加密成功", res1);
			} else {
				myHandleDeal("group30主密钥加密失败", res1);
			}
		} else {
			myHandleDeal("group30更新主密钥失败", res0);
		}
		int res2 = Ddi.ddi_innerkey_aes_decrypt(0, 77, 1, (byte) 1, ipIn, m_data, m_data.length, cipher);
		if (res2 == 0) {
			myHandleDeal("主密钥解密成功", res2);
		} else {
			myHandleDeal("group30主密钥解密失败", res2);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup31() {
		myHandleDeal("testgroup31测试", 0);
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
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_aes_encrypt(0, 149, (byte) 1, ipIn, m_plain, m_plain.length, cipher);
			String data2 = ByteUtils.byteArray2HexString(cipher);
			if (res1 == 0 && data2.equals(data)) {
				myHandleDeal("主密钥加密成功", res1);
			} else {
				myHandleDeal("group31主密钥加密失败", res1);
			}
		} else {
			myHandleDeal("group31更新主密钥失败", res0);
		}
		int res2 = Ddi.ddi_innerkey_aes_decrypt(0, 0, 1, (byte) 1, ipIn, m_data, m_data.length, cipher);
		if (res2 == 0) {
			myHandleDeal("主密钥解密成功", res2);
		} else {
			myHandleDeal("group31主密钥解密失败", res2);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup32() {
		myHandleDeal("testgroup32测试", 0);
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
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x06, 0, 0, 1, ipIn, innerkey2, 32, innerkey1, 32);
			if (res1 == 0) {
				myHandleDeal("更新工作密钥加密成功", res1);
				int res2 = Ddi.ddi_innerkey_aes_encrypt(1, 0, (byte) 1, ipIn, m_plain, m_plain.length, cipher);
				String data1 = ByteUtils.byteArray2HexString(cipher);
				if (res2 == 0 && data1.equals(data)) {
					myHandleDeal("工作密钥加密成功", res2);
					int res3 = Ddi.ddi_innerkey_aes_decrypt(1, 0, 1, (byte) 1, ipIn, m_data, m_data.length, cipher1);
					String data2 = ByteUtils.byteArray2HexString(cipher1);
					if (res3 == 0 && data2.equals(plain)) {
						myHandleDeal("工作密钥解密成功", res3);
					} else {
						myHandleDeal("group32工作密钥解密失败", res3);
					}
				} else {
					myHandleDeal("group32工作密钥加密失败", res2);
				}
			} else {
				myHandleDeal("group32更新工作密钥失败", res1);
			}
		} else {
			myHandleDeal("group32更新主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup33() {
		myHandleDeal("testgroup33测试", 0);
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
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x06, 77, 225, 0, ipIn, innerkey2, 32, innerkey1, 32);
			if (res1 == 0) {
				myHandleDeal("更新工作密钥加密成功", res1);
				int res2 = Ddi.ddi_innerkey_aes_encrypt(1, 225, (byte) 0, ipIn, m_plain, m_plain.length, cipher);
				String data1 = ByteUtils.byteArray2HexString(cipher);
				if (res2 == 0 && data1.equals(data)) {
					myHandleDeal("工作密钥加密成功", res2);
					int res3 = Ddi.ddi_innerkey_aes_decrypt(1, 225, 1, (byte) 0, ipIn, m_data, m_data.length, cipher1);
					String data2 = ByteUtils.byteArray2HexString(cipher1);
					if (res3 == 0 && data2.equals(plain)) {
						myHandleDeal("工作密钥解密成功", res3);
					} else {
						myHandleDeal("group33工作密钥解密失败", res3);
					}
				} else {
					myHandleDeal("group33工作密钥加密失败", res2);
				}
			} else {
				myHandleDeal("group33更新工作密钥失败", res1);
			}
		} else {
			myHandleDeal("group33更新主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup34() {
		myHandleDeal("testgroup34测试", 0);
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
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x06, 77, 225, 0, ipIn, innerkey2, 32, innerkey1, 32);
			if (res1 == 0) {
				myHandleDeal("更新工作密钥加密成功", res1);
				int res2 = Ddi.ddi_innerkey_aes_encrypt(1, 225, (byte) 0, ipIn, m_plain, m_plain.length, cipher);
				String data1 = ByteUtils.byteArray2HexString(cipher);
				if (res2 == 0 && data1.equals(data)) {
					myHandleDeal("工作密钥加密成功", res2);
					int res3 = Ddi.ddi_innerkey_aes_decrypt(1, 225, 1, (byte) 0, ipIn, m_data, m_data.length, cipher1);
					String data2 = ByteUtils.byteArray2HexString(cipher1);
					if (res3 == 0 && data2.equals(plain)) {
						myHandleDeal("工作密钥解密成功", res3);
					} else {
						myHandleDeal("group34工作密钥解密失败", res3);
					}
				} else {
					myHandleDeal("group34工作密钥加密失败", res2);
				}
			} else {
				myHandleDeal("group34更新工作密钥失败", res1);
			}
		} else {
			myHandleDeal("group34更新主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup35() {
		myHandleDeal("testgroup35测试", 0);
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
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x06, 149, 449, 1, ipIn, innerkey2, 32, innerkey1, 32);
			if (res1 == 0) {
				myHandleDeal("更新工作密钥加密成功", res1);
				int res2 = Ddi.ddi_innerkey_aes_encrypt(1, 449, (byte) 0, ipIn, m_plain, m_plain.length, cipher);
				String data1 = ByteUtils.byteArray2HexString(cipher);
				if (res2 == 0 && data1.equals(data)) {
					myHandleDeal("工作密钥加密成功", res2);
					int res3 = Ddi.ddi_innerkey_aes_decrypt(1, 449, 1, (byte) 0, ipIn, m_data, m_data.length, cipher1);
					String data2 = ByteUtils.byteArray2HexString(cipher1);
					if (res3 == 0 && data2.equals(plain)) {
						myHandleDeal("工作密钥解密成功", res3);
					} else {
						myHandleDeal("group35工作密钥解密失败", res3);
					}
				} else {
					myHandleDeal("group35工作密钥加密失败", res2);
				}
			} else {
				myHandleDeal("group35更新工作密钥失败", res1);
			}
		} else {
			myHandleDeal("group35更新主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup36() {
		myHandleDeal("testgroup36测试", 0);
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
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x05, 0, 0, 0, ipIn, innerkey2, 32, innerkey2, 32);
			// 工作秘钥明文：E4D9646EB1EECBC9D2693E1F58B464729793FD1A822B07C7F27A37FEA444497B
			if (res1 == 0) {
				myHandleDeal("更新工作密钥加密成功", res1);
				int res2 = Ddi.ddi_innerkey_aes_encrypt(1, 0, (byte) 0, ipIn, m_plain, m_plain.length, cipher);

				String data1 = ByteUtils.byteArray2HexString(cipher);
				if (res2 == 0 && data1.equalsIgnoreCase(data)) {
					myHandleDeal("工作密钥加密成功", res2);
					int res3 = Ddi.ddi_innerkey_aes_decrypt(1, 0, 1, (byte) 1, ipIn, m_data, m_data.length, cipher);
					String data2 = ByteUtils.byteArray2HexString(cipher);
					if (res3 == 0 && data2.equalsIgnoreCase(data6)) {
						myHandleDeal("工作密钥解密成功", res3);
					} else {
						myHandleDeal("group36工作密钥解密失败" + data6, res3);
					}
				} else {
					myHandleDeal("group36工作密钥加密失败" + data1, res2);
				}
			} else {
				myHandleDeal("group36更新工作密钥失败", res1);
			}
		} else {
			myHandleDeal("group36更新主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup37() {
		myHandleDeal("testgroup37测试", 0);
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
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x05, 77, 225, 0, ipIn, innerkey2, 32, innerkey2, 32);
			// 工作秘钥明文：E4D9646EB1EECBC9D2693E1F58B464729793FD1A822B07C7 F27A37FEA444497B
			if (res1 == 0) {
				myHandleDeal("更新工作密钥加密成功", res1);
				int res2 = Ddi.ddi_innerkey_aes_encrypt(1, 225, (byte) 0, ipIn, m_plain, m_plain.length, cipher);
				String data1 = ByteUtils.byteArray2HexString(cipher);
				if (res2 == 0 && data1.equalsIgnoreCase(data)) {
					myHandleDeal("工作密钥加密成功", res2);
					int res3 = Ddi.ddi_innerkey_aes_decrypt(1, 225, 1, (byte) 0, ipIn, m_data, m_data.length, cipher1);
					String data2 = ByteUtils.byteArray2HexString(cipher1);
					if (res3 == 0 && data2.equals(plain)) {
						myHandleDeal("工作密钥解密成功", res3);
					} else {
						myHandleDeal("group37工作密钥解密失败", res3);
					}
				} else {
					myHandleDeal("group37工作密钥加密失败" + data1, res2);
				}
			} else {
				myHandleDeal("group37更新工作密钥失败", res1);
			}
		} else {
			myHandleDeal("group37更新主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup38() {
		myHandleDeal("testgroup38测试", 0);
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
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x05, 149, 449, 1, ipIn, innerkey2, 32, innerkey2, 32);
			// 工作秘钥明文：D4E9545E1A23245073B31BEEBCA59AD736B0B87D08393391
			if (res1 == 0) {
				myHandleDeal("更新工作密钥加密成功", res1);
				int res2 = Ddi.ddi_innerkey_aes_encrypt(1, 449, (byte) 1, ipIn, m_plain, m_plain.length, cipher);
				String data1 = ByteUtils.byteArray2HexString(cipher);
				if (res2 == 0 && data1.equalsIgnoreCase(data)) {
					myHandleDeal("工作密钥加密成功", res2);
					int res3 = Ddi.ddi_innerkey_aes_decrypt(1, 449, 1, (byte) 1, ipIn, m_data, m_data.length, cipher1);
					String data2 = ByteUtils.byteArray2HexString(cipher1);
					if (res3 == 0 && data2.equals(plain)) {
						myHandleDeal("工作密钥解密成功", res3);
					} else {
						myHandleDeal("group38工作密钥解密失败", res3);
					}
				} else {
					myHandleDeal("group38工作密钥加密失败" + data1, res2);
				}
			} else {
				myHandleDeal("group38更新工作密钥失败", res1);
			}
		} else {
			myHandleDeal("group38更新主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup39() {
		myHandleDeal("testgroup39测试", 0);
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
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x04, 0, 0, 1, ipIn, innerkey2, 16, innerkey2, 16);
			if (res1 == 0) {
				myHandleDeal("更新工作密钥加密成功", res1);
				int res2 = Ddi.ddi_innerkey_aes_encrypt(1, 0, (byte) 1, ipIn, m_plain, m_plain.length, cipher);
				String data1 = ByteUtils.byteArray2HexString(cipher);
				if (res2 == 0 && data1.equals(data)) {
					myHandleDeal("工作密钥加密成功", res2);
					int res3 = Ddi.ddi_innerkey_aes_decrypt(1, 0, 1, (byte) 1, ipIn, m_data, m_data.length, cipher1);
					String data2 = ByteUtils.byteArray2HexString(cipher1);
					if (res3 == 0 && data2.equals(plain)) {
						myHandleDeal("工作密钥解密成功", res3);
					} else {
						myHandleDeal("group39工作密钥解密失败", res3);
					}
				} else {
					myHandleDeal("group39工作密钥加密失败", res2);
				}
			} else {
				myHandleDeal("group39更新工作密钥失败", res1);
			}
		} else {
			myHandleDeal("group39更新主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup40() {
		myHandleDeal("testgroup40测试", 0);
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
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x04, 77, 225, 1, ipIn, innerkey2, 16, innerkey1, 16);
			if (res1 == 0) {
				myHandleDeal("更新工作密钥加密成功", res1);
				int res2 = Ddi.ddi_innerkey_aes_encrypt(1, 225, (byte) 0, ipIn, m_plain, m_plain.length, cipher);
				String data1 = ByteUtils.byteArray2HexString(cipher);
				if (res2 == 0 && data1.equals(data)) {
					myHandleDeal("工作密钥加密成功", res2);
					int res3 = Ddi.ddi_innerkey_aes_decrypt(1, 225, 1, (byte) 0, ipIn, m_data, m_data.length, cipher1);
					String data2 = ByteUtils.byteArray2HexString(cipher1);
					if (res3 == 0 && data2.equals(plain)) {
						myHandleDeal("工作密钥解密成功", res3);
					} else {
						myHandleDeal("group40工作密钥解密失败", res3);
					}
				} else {
					myHandleDeal("group40工作密钥加密失败", res2);
				}
			} else {
				myHandleDeal("group40更新工作密钥失败", res1);
			}
		} else {
			myHandleDeal("group40更新主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup41() {
		myHandleDeal("testgroup41测试", 0);
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
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x04, 149, 449, 1, ipIn, innerkey2, 16, innerkey1, 16);
			if (res1 == 0) {
				myHandleDeal("更新工作密钥加密成功", res1);
				int res2 = Ddi.ddi_innerkey_aes_encrypt(1, 449, (byte) 1, ipIn, m_plain, m_plain.length, cipher);
				String data1 = ByteUtils.byteArray2HexString(cipher);
				if (res2 == 0 && data1.equals(data)) {
					myHandleDeal("工作密钥加密成功", res2);
					int res3 = Ddi.ddi_innerkey_aes_decrypt(1, 449, 1, (byte) 1, ipIn, m_data, m_data.length, cipher1);
					String data2 = ByteUtils.byteArray2HexString(cipher1);
					if (res3 == 0 && data2.equals(plain)) {
						myHandleDeal("工作密钥解密成功", res3);
					} else {
						myHandleDeal("group41工作密钥解密失败", res3);
					}
				} else {
					myHandleDeal("group41工作密钥加密失败", res2);
				}
			} else {
				myHandleDeal("group41更新工作密钥失败", res1);
			}
		} else {
			myHandleDeal("group41更新主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup42() {
		myHandleDeal("testgroup42测试", 0);
		String plain = "12345678abcdEFBFABCDefBCabcdEFBF";
		byte[] m_plain = ByteUtils.hexString2ByteArray(plain);
		byte[] cipher = new byte[16];
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_delete_key(0, 2);
		if (res0 == 0) {
			myHandleDeal("删除主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_aes_encrypt(0, 2, (byte) 1, ipIn, m_plain, m_plain.length, cipher);
			if (res1 == -6) {
				myHandleDeal("主密钥加密测试成功", res1);
			} else {
				myHandleDeal("group42主密钥加密测试失败", res1);
			}
			int res2 = Ddi.ddi_innerkey_aes_decrypt(0, 2, 1, (byte) 1, ipIn, m_plain, m_plain.length, cipher);
			if (res2 == -6) {
				myHandleDeal("主密钥加密测试成功", res2);
			} else {
				myHandleDeal("group42主密钥加密测试失败", res2);
			}
		} else {
			myHandleDeal("group42删除主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup43() {
		myHandleDeal("testgroup43测试", 0);
		String plain = "12345678abcdEFBFABCDefBCabcdEFBF";
		byte[] m_plain = ByteUtils.hexString2ByteArray(plain);
		byte[] cipher = new byte[16];
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_delete_key(1, 3);
		if (res0 == 0) {
			myHandleDeal("删除工作密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_aes_encrypt(1, 3, (byte) 1, ipIn, m_plain, m_plain.length, cipher);
			if (res1 == -6) {
				myHandleDeal("工作密钥加密测试成功", res1);
			} else {
				myHandleDeal("group43工作密钥加密测试失败", res1);
			}
			int res2 = Ddi.ddi_innerkey_aes_decrypt(1, 3, 1, (byte) 1, ipIn, m_plain, m_plain.length, cipher);
			if (res2 == -6) {
				myHandleDeal("工作密钥加密测试成功", res2);
			} else {
				myHandleDeal("group43工作密钥加密测试失败", res2);
			}
		} else {
			myHandleDeal("group43删除工作密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup44() {
		myHandleDeal("testgroup44测试", 0);
		String plain = "12345678abcdEFBFABCDefBCabcdEFBF";
		byte[] m_plain = ByteUtils.hexString2ByteArray(plain);
		byte[] cipher = new byte[16];
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_aes_encrypt(1, 450, (byte) 1, ipIn, m_plain, m_plain.length, cipher);
		if (res0 == -6) {
			myHandleDeal("索引越限测试成功", res0);
		} else {
			myHandleDeal("group44索引越限测试失败", res0);
		}
		int res1 = Ddi.ddi_innerkey_aes_decrypt(1, 450, 1, (byte) 1, ipIn, m_plain, m_plain.length, cipher);
		if (res1 == -6) {
			myHandleDeal("索引越限测试成功", res1);
		} else {
			myHandleDeal("group44索引越限测试失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	// DES CBC encrypt test
	private void testgroup45() {
		myHandleDeal("testgroup45测试", 0);
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
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_des_encrypt(0, 149, 1, ipIn, msg_summery, 16, DataOut);
			String byteArray2HexString = ByteUtils.byteArray2HexString(DataOut);
			if (res1 == 0 && byteArray2HexString.equalsIgnoreCase(key2)) {
				myHandleDeal("DESCBC主秘钥加密正确", res1);
				int res3 = Ddi.ddi_innerkey_update_wk((byte) 0x00, 149, 0, 1, ipIn, innerkey3, 8, ipOut, 8);
				int res4 = Ddi.ddi_innerkey_des_encrypt(1, 0, 1, ipIn, msg_summery, 16, DataOut);
				String byteArray2HexString1 = ByteUtils.byteArray2HexString(DataOut);
				if (res3 + res4 == 0 && byteArray2HexString1.equalsIgnoreCase(key4)) {
					myHandleDeal("DESCBC工作密钥加密成功", res4);
				} else {
					myHandleDeal("DESCBC工作密钥加密失败", res4);
				}

			} else {
				myHandleDeal("DESCBC主密钥加密失败" + byteArray2HexString, res1);
			}
		} else {
			myHandleDeal("group1更新主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup46() {
		myHandleDeal("testgroup46测试", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "B589ACBB1125FAD7D75976E744195BAC";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		byte[] DataOut = new byte[16];
		Ddi.ddi_innerkey_open();
		int res0 = -99;
		res0 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 149, innerkey1, 16);
		if (res0 == 0) {
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_des_encrypt(0, 149, 1, ipIn, msg_summery, 16, DataOut);
			String byteArray2HexString = ByteUtils.byteArray2HexString(DataOut);
			if (res1 == 0 && byteArray2HexString.equalsIgnoreCase(key2)) {
				myHandleDeal("DESCBC加密正确", res1);

			} else {
				myHandleDeal("DESCBC加密失败" + byteArray2HexString, res1);
			}
		} else {
			myHandleDeal("group1更新主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup47() {
		myHandleDeal("testgroup47测试", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF78abcdEFBFABCDef";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "23EB67FAD71574F7B2B9BDB9AC67E5FD";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		byte[] DataOut = new byte[16];
		Ddi.ddi_innerkey_open();
		int res0 = -99;
		res0 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 149, innerkey1, 24);
		if (res0 == 0) {
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_des_encrypt(0, 149, 1, ipIn, msg_summery, 16, DataOut);
			String byteArray2HexString = ByteUtils.byteArray2HexString(DataOut);
			if (res1 == 0 && byteArray2HexString.equalsIgnoreCase(key2)) {
				myHandleDeal("DESCBC加密正确", res1);

			} else {
				myHandleDeal("DESCBC加密失败" + byteArray2HexString, res1);
			}
		} else {
			myHandleDeal("group1更新主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup48() {
		myHandleDeal("testgroup13测试", 0);
		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF9999efBCabcdEFBF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF9999efBCabcdEFBF";
		String key3 = "81931E1AB3D3A7D19EAFF08B4EF9DDB8";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		byte[] DataOut = new byte[16];
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 149, innerkey1, 24);
		if (res0 == 0) {
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 149, 0, 1, ipIn, innerkey2, 24, ipOut, 24);
			if (res1 == 0) {
				myHandleDeal("更新工作密钥测试成功", res1);
				int res2 = Ddi.ddi_innerkey_des_encrypt(1, 0, 1, ipIn, msg_summery, 16, DataOut);
				String byteArray2HexString = ByteUtils.byteArray2HexString(DataOut);
				if (res2 == 0 && byteArray2HexString.equalsIgnoreCase(key3)) {
					myHandleDeal("group48更新工作密钥测试成功", res2);
				} else {
					myHandleDeal("group48更新工作密钥失败", res2);
				}
			} else {
				myHandleDeal("group48更新工作密钥测试失败", res1);
			}
		} else {
			myHandleDeal("group48更新主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup49() {
		myHandleDeal("testgroup49测试", 0);
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
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 149, 0, 1, ipIn, innerkey2, 24, ipOut, 24);
			int res5 = Ddi.ddi_innerkey_des_encrypt(0, 149, 1, ipIn, innerkey3, 16, DataOut);
			int res6 = Ddi.ddi_innerkey_des_encrypt(0, 149, 1, ipIn, innerkey4, 16, DataOut);
			if (res1 == 0) {
				myHandleDeal("更新工作密钥测试成功" + res5 + res6, res1);
				int res2 = Ddi.ddi_innerkey_des_encrypt(1, 0, 1, ipIn, innerkey3, 16, DataOut);
				int res3 = Ddi.ddi_innerkey_des_encrypt(1, 0, 1, ipIn, innerkey4, 19, DataOut);
				if (res2 == -12 && res3 == -6) {
					myHandleDeal("group49更新工作密钥测试成功", res2);
				} else {
					myHandleDeal("group49更新工作密钥失败" + res3, res2);
				}
			} else {
				myHandleDeal("group49更新工作密钥测试失败", res1);
			}
		} else {
			myHandleDeal("group49更新主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testgroup50() {
		myHandleDeal("testgroup13测试", 0);
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
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 149, 0, 1, ipIn, innerkey2, 24, ipOut, 24);
			if (res1 == 0) {
				myHandleDeal("更新工作密钥测试成功", res1);
				int res2 = Ddi.ddi_innerkey_des_encrypt(1, 0, 1, DataOut1, msg_summery, 16, DataOut);
				String byteArray2HexString1 = ByteUtils.byteArray2HexString(DataOut);
				// IV大于8字节 全数字
				int res3 = Ddi.ddi_innerkey_des_encrypt(1, 0, 1, in, msg_summery, 16, DataOut);
				//// IV大于8字节 全字母
				int res4 = Ddi.ddi_innerkey_des_encrypt(1, 0, 1, in1, msg_summery, 16, DataOut);
				// IV小于于8字节 全字母
				int res5 = Ddi.ddi_innerkey_des_encrypt(1, 0, 1, in2, msg_summery, 16, DataOut);
				String byteArray2HexString2 = ByteUtils.byteArray2HexString(DataOut);
				String byteArray2HexString = ByteUtils.byteArray2HexString(DataOut);
				if (res2 == 0 && res3 == 0 && res4 == 0 && res5 == 0) {
					myHandleDeal("group50更新工作密钥测试成功", res2);
				} else {
					myHandleDeal("group50更新工作密钥失败" + res2 + res3 + res4 + res5 + byteArray2HexString2 + "==="
							+ byteArray2HexString1, res2);
				}
			} else {
				myHandleDeal("group50更新工作密钥测试失败", res1);
			}
		} else {
			myHandleDeal("group50更新主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	// 获取内置秘钥版本
	private void testgroup85() {
		myHandleDeal("testgroup85试", 0);

		String key1 = "563230313731323132303031";
		byte[] innerkey1 = new byte[12];
//		String key2 = "56248AAAAAAAAAAA9999efBCabcdEFBF9999efBCabcdEFBF";
//		String key3 = "81931E1AB3D3A7D19EAFF08B4EF9DDB8";
//		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);

//		byte[] DataOut = new byte[16];
		int res1 = Ddi.ddi_innerkey_open();
		if (res1 == 0) {
			myHandleDeal("group85打开接口成功", res1);
		}
		int res0 = Ddi.ddi_innerkey_ioctl_getVer(innerkey1);
		String byteArray2HexString = ByteUtils.byteArray2HexString(innerkey1);
//		Log.v("1111", byteArray2HexString);
		if (res0 == 0 && byteArray2HexString.equalsIgnoreCase(key1)) {
			myHandleDeal("group85获取内置秘钥版本成功", res0);
		} else {
			myHandleDeal("group85获取内置秘钥版本失败" + byteArray2HexString, res0);
		}

	}

	// 获取内置秘钥版本
	private void testgroup86() {
		myHandleDeal("testgroup86测试", 0);
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
			myHandleDeal("group86获取内置秘钥版本成功", res0);
//			Log.v("1111", byteArray2HexString);

		} else {
			myHandleDeal("group86获取内置秘钥版本失败" + byteArray2HexString, res0);
		}
		Ddi.ddi_innerkey_close();
	}

	// 没打开接口进行测试 获取版本信息
	private void testgroup87() {
		myHandleDeal("testgroup87试", 0);
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
			myHandleDeal("group87获取内置秘钥版本成功", res0);
		} else {
			myHandleDeal("group87获取内置秘钥版本失败" + byteArray2HexString, res0);
		}
		Ddi.ddi_innerkey_close();

	}

	// 接口未打开 检测秘钥主秘钥是否存在
	private void testgroup88() {
		myHandleDeal("testgroup88测试", 0);
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
			myHandleDeal("主密钥检测成功88", res0);
			int res1 = Ddi.ddi_innerkey_ioctl_key_check(1, 0);
			int res4 = Ddi.ddi_innerkey_ioctl_key_check(1, 449);
			if (res1 == 0 && res4 == 0) {
				myHandleDeal("更新工作密钥测试成功88", res1);
			} else {
				myHandleDeal("group48更新工作密钥测试失败88", res1);
			}
		} else {
			myHandleDeal("主密钥检测失败88", res0);
		}
		Ddi.ddi_innerkey_close();

	}

	// 检查秘钥存储区索引超标
	private void testgroup89() {
		myHandleDeal("testgroup89测试", 0);

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
			myHandleDeal("group89更新主密钥成功89" + res10, res9);
		} else {
			myHandleDeal("group89更新主密钥检测失败89" + res10, res9);

		}
		int res0 = Ddi.ddi_innerkey_ioctl_key_check(0, -1);
		int res2 = Ddi.ddi_innerkey_ioctl_key_check(0, 150);
		if (res0 == -1 && res2 == -1) {
			myHandleDeal("group89主密钥检测成功89", res0);
			int res1 = Ddi.ddi_innerkey_ioctl_key_check(1, -1);
			int res4 = Ddi.ddi_innerkey_ioctl_key_check(1, 450);
			if (res1 == -1 && res4 == -1) {
				myHandleDeal("group89更新工作密钥测试成功89" + res4, res1);
			} else {
				myHandleDeal("group89更新工作密钥测试失败89" + res4, res1);
			}
		} else {
			myHandleDeal("group89主密钥检测失败89" + res2, res0);
		}
		Ddi.ddi_innerkey_close();
	}

	// 检测主密钥和工作秘钥最大索引和最小索引秘钥是否存在
	private void testgroup113() {
		myHandleDeal("testgroup113测试", 0);

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
			myHandleDeal("更新主密钥和工作秘钥成功113" + res10, res9);
		} else {
			myHandleDeal("更新主密钥和工作秘钥失败113" + res10, res9);
		}
		int res0 = Ddi.ddi_innerkey_ioctl_key_check(0, 0);
		int res2 = Ddi.ddi_innerkey_ioctl_key_check(0, 149);
		if (res0 == 0 && res2 == 0) {
			myHandleDeal("主密钥检测成功113", res0);
			int res1 = Ddi.ddi_innerkey_ioctl_key_check(1, 0);
			int res4 = Ddi.ddi_innerkey_ioctl_key_check(1, 449);
			if (res1 == 0 && res4 == 0) {
				myHandleDeal("工作密钥检测成功113", res1);
			} else {
				myHandleDeal("工作密钥检测失败113", res1);
			}
		} else {
			myHandleDeal("主密钥检测失败113", res0);
		}

	}

	// 检测主密钥和工作秘钥最大索引和最小索引秘钥是否存在
	private void testgroup114() {

		myHandleDeal("testgroup114测试", 0);
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
						myHandleDeal("group114测关闭成功" + i, 0);
					} else {
						myHandleDeal("group114测关闭成功" + i, 0);
					}
				}
				int res9 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
				if (res9 == 0) {
					myHandleDeal("group114测成功", 0);
				} else {
					myHandleDeal("group114测失败", res9);
				}
				for (int i = 0; i < 100; i++) {
					int ddi_innerkey_open = Ddi.ddi_innerkey_open();
					if (ddi_innerkey_open == 0) {
						myHandleDeal("group114测关闭成功" + i, 0);
					} else {
						myHandleDeal("group114测关闭成功" + i, 0);
					}
				}
				Ddi.ddi_innerkey_open();
				int res10 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 149, innerkey1, 16);
				int res8 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 0, 0, ipIn, innerkey1, 16, ipOut, 16);
				int res7 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 149, 449, 0, ipIn, innerkey1, 16, ipOut, 16);
				if (res9 == 0 && res10 == 0 && res8 == 0 && res7 == 0) {
					myHandleDeal("group114更新主密钥和工作秘钥成功114" + res10, res9);
				} else {
					myHandleDeal("group114更新主密钥和工作秘钥失败114" + res10, res9);
				}
				int res0 = Ddi.ddi_innerkey_ioctl_key_check(0, 0);
				int res2 = Ddi.ddi_innerkey_ioctl_key_check(0, 149);
				if (res0 == 0 && res2 == 0) {
					myHandleDeal("group114主密钥检测成功114", res0);
					int res1 = Ddi.ddi_innerkey_ioctl_key_check(1, 0);
					int res4 = Ddi.ddi_innerkey_ioctl_key_check(1, 449);
					if (res1 == 0 && res4 == 0) {
						myHandleDeal("group114更新工作密钥测试成功114", res1);
					} else {
						myHandleDeal("group114更新工作密钥测试失败114", res1);
					}
				} else {
					myHandleDeal("group114主密钥检测失败114", res0);
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
		myHandleDeal("testgroup115测试", 0);
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
						myHandleDeal("group115更新主密钥成功" + i, res0);
						int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x22, 122, 2, 1, ipIn, innerkey2, 16, ipOut, 16);
						if (res1 == -6) {
							myHandleDeal("group115更新工作密钥测试成功" + i, res1);
						} else {
							myHandleDeal("group115更新工作密钥测试失败" + i, res1);
						}
					} else {
						myHandleDeal("group115更新主密钥失败" + i, res0);

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
		myHandleDeal("testgroup116测试", 0);
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
						myHandleDeal("group116更新主密钥成功" + i, res0);
						int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x88, 122, 2, 1, ipIn, innerkey2, 16, ipOut, 16);
						if (res1 == -6) {
							myHandleDeal("group116更新工作密钥测试成功" + i, res1);
						} else {
							myHandleDeal("group116更新工作密钥测试失败" + i, res1);
						}
					} else {
						myHandleDeal("group116更新主密钥失败" + i, res0);

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
	 * 主要功能是用用于加密用户卡的 账户数据
	 * 
	 * @param mode       该字段预留8个bit，根据每个bit值决定加密的算法和加密模式（ECB和CBC）详情见下 ecb_mode =
	 *                   ((mode&0x01) == 0) ? (ECB_MODE):(CBC_MODE);
	 *                   表示值为1的那个bit，也就是第一个bit,如果为0表示ECB，为1表示CBC algtype =
	 *                   ((mode&0x04) == 0) ? (DUKPT_ALGTYPE):(DES_ALGTYPE);
	 *                   表示值为4的那个bit，也就是第3个bit,如果为0表示DUKPT，为1表示DES
	 *                   request_mode=((mode&0x10)==0) ?
	 *                   (REQUEST_MODE):(RESPONSE_MODE);
	 *                   表示值为16的那个bit，也就是第5个bit,如果为0表示REQUEST_MODE，为1表示RESPONSE_MODE
	 *                   例如：ECB，DUKPT算法，REQUEST_MODE 那么mode传入的值为：0+0+0=0
	 *                   如果是CBC，DES，RESPONSE_MODE 1+4+16=21
	 * @param groupindex 在加密方式是DUKPT的情况下才会有用，如果是DES算法无效
	 * @param keyindex   加密秘钥的索引
	 * @param account    加密数据（）
	 * @param accountlen 加密数据长度
	 * @param iv         IV值，由第一个参数的mode决定是否参与运算
	 * @param cipher     加密账户数据后返回的值
	 * @return
	 * 
	 * 		public static native int ddi_innerkey_account_encrypt(int mode, int
	 *         groupindex, int keyindex, byte[]account, int accountlen, byte[]iv,
	 *         byte[]cipher); 相关测试用例到123为止，DUKpt相关的在DUKPT里面
	 *
	 */

	// ECB/CBC 单DES
	private void testgroup117() {
		myHandleDeal("testgroup117测试", 0);
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
			myHandleDeal("group117更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x00, 149, 0, 1, ipIn, innerkey2, 8, ipOut, 8);
			if (res1 == 0) {
				myHandleDeal("group117更新工作秘钥成功", res1);
				// 工作秘钥明文：B3A7256E60B66590
				// ipin=30303030abCDef99a1da25f1e411fea5
				// msg_summery=12345678abcdEFBFABCDefBCabcdEFBF
				// ECB 模式
				int res5 = Ddi.ddi_innerkey_account_encrypt(4, 0, 0, msg_summery, 16, ipIn, DataOut);
				String data = ByteUtils.byteArray2HexString(DataOut);
				// CBC 模式
				int res6 = Ddi.ddi_innerkey_account_encrypt(5, 0, 0, msg_summery, 16, ipIn, DataOut);
				String data2 = ByteUtils.byteArray2HexString(DataOut);

				if (res5 == 0 && data.equalsIgnoreCase(data0) && res6 == 0 && data2.equalsIgnoreCase(data1)) {
					myHandleDeal("group117加密账户成功", res5);
				} else {
					myHandleDeal("group117加密账户失败" + data, res5);
				}
			} else {
				myHandleDeal("group117更新工作秘钥失败", res1);
			}
		}
	}

	// //ECB/CBC 双DES
	private void testgroup118() {
		myHandleDeal("testgroup118测试", 0);
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
			myHandleDeal("group118更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 449, 1, ipIn, innerkey2, 16, ipOut, 16);
			if (res1 == 0) {
				myHandleDeal("group118更新工作密钥测试成功", res1);
				// 工作秘钥明文：4BF6699A03307BDE2D681E40C96EBC7E
				// ipin=30303030abCDef99a1da25f1e411fea5
				// msg_summery=12345678abcdEFBFABCDefBCabcdEFBF
				// ECB 模式
				int res5 = Ddi.ddi_innerkey_account_encrypt(4, 0, 449, msg_summery, 16, ipIn, DataOut);
				String data = ByteUtils.byteArray2HexString(DataOut);
				// CBC 模式
				int res6 = Ddi.ddi_innerkey_account_encrypt(5, 0, 449, msg_summery, 16, ipIn, DataOut);
				String data2 = ByteUtils.byteArray2HexString(DataOut);
				if (res5 == 0 && data.equalsIgnoreCase(data0) && res6 == 0 && data2.equalsIgnoreCase(data1)) {
					myHandleDeal("group118加密账户成功", res5);
				} else {
					myHandleDeal("group118加密账户失败" + data, res5);
				}
			} else {
				myHandleDeal("group118更新工作密钥测试失败", res1);
			}

		} else {
			myHandleDeal("group118更新主密钥失败", res0);
		}

	}

	// //ECB/CBC 三DES
	private void testgroup119() {
		myHandleDeal("testgroup119测试", 0);
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
			myHandleDeal("group119更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 75, 225, 1, ipIn, innerkey2, 24, ipOut, 24);
			if (res1 == 0) {
				myHandleDeal("group119更新工作密钥测试成功", res1);
				// 工作秘钥明文：AFE25AE54AA57E6F89E25694FA26E33D50D5CD8469257880
				// ipin=30303030abCDef99a1da25f1e411fea5
				// msg_summery=12345678abcdEFBFABCDefBCabcdEFBF
				// ECB 模式
				int res5 = Ddi.ddi_innerkey_account_encrypt(4, 20, 225, msg_summery, 16, ipIn, DataOut);
				String data = ByteUtils.byteArray2HexString(DataOut);
				// CBC 模式
				int res6 = Ddi.ddi_innerkey_account_encrypt(5, 60, 225, msg_summery, 16, ipIn, DataOut);
				String data2 = ByteUtils.byteArray2HexString(DataOut);
				if (res5 == 0 && data.equalsIgnoreCase(data0) && res6 == 0 && data2.equalsIgnoreCase(data1)) {
					myHandleDeal("group119加密账户成功", res5);
				} else {
					myHandleDeal("group119加密账户失败" + data, res5);
				}

			} else {
				myHandleDeal("group119更新工作密钥测试失败", res1);
			}
		} else {
			myHandleDeal("group119更新主密钥失败", res0);
		}

	}

	// 对应的索引不存在
	private void testgroup120() {
		myHandleDeal("testgroup120测试", 0);
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
			myHandleDeal("group120更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 75, 225, 1, ipIn, innerkey2, 24, ipOut, 24);
			if (res1 == 0) {
				myHandleDeal("group120更新工作密钥测试成功", res1);
				// 工作秘钥明文：AFE25AE54AA57E6F89E25694FA26E33D50D5CD8469257880
				// ipin=30303030abCDef99a1da25f1e411fea5
				// msg_summery=12345678abcdEFBFABCDefBCabcdEFBF
				// ECB 模式
				int res7 = Ddi.ddi_innerkey_delete_key(1, 225);
				if (res7 == 0) {
					myHandleDeal("group120删除工作秘钥成功", res7);
				}
				int res5 = Ddi.ddi_innerkey_account_encrypt(4, 20, 225, msg_summery, 16, ipIn, DataOut);
				// CBC 模式
				int res6 = Ddi.ddi_innerkey_account_encrypt(5, 60, 225, msg_summery, 16, ipIn, DataOut);
				if (res5 == -6 && res6 == -6) {
					myHandleDeal("group120加密账户成功", res5);
				} else {
					myHandleDeal("group120加密账户失败", res5);
				}

			} else {
				myHandleDeal("group120更新工作密钥测试失败", res1);
			}
		} else {
			myHandleDeal("group120更新主密钥失败", res0);
		}

	}

	// 异常测试
	private void testgroup121() {
		myHandleDeal("testgroup121测试", 0);
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
			myHandleDeal("group121更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 75, 225, 1, ipIn, innerkey2, 24, ipOut, 24);
			if (res1 == 0) {
				myHandleDeal("group121更新工作密钥测试成功", res1);
				// 工作秘钥明文：AFE25AE54AA57E6F89E25694FA26E33D50D5CD8469257880
				// ipin=30303030abCDef99a1da25f1e411fea5
				// msg_summery=12345678abcdEFBFABCDefBCabcdEFBF
				// ECB 模式
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
				// CBC 模式
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
					myHandleDeal("group121加密账户成功", res15);
				} else {
					myHandleDeal("group121加密账户失败", res15);
				}
			} else {
				myHandleDeal("group121更新工作密钥测试失败", res1);
			}
		} else {
			myHandleDeal("group121更新主密钥失败", res0);
		}

	}

	// //加密数据长度最小1
	private void testgroup122() {
		myHandleDeal("testgroup122测试", 0);
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
				myHandleDeal("group122更新主密钥成功", res0);
				int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 75, 225, 1, ipIn, innerkey2, 24, ipOut, 24);
				if (res1 == 0) {
					myHandleDeal("group122更新工作密钥测试成功", res1);
					// 工作秘钥明文：AFE25AE54AA57E6F89E25694FA26E33D50D5CD8469257880
					// ipin=30303030abCDef99a1da25f1e411fea5
					// msg_summery=12345678abcdEFBFABCDefBCabcdEFBF
					// ECB 模式
					int res5 = Ddi.ddi_innerkey_account_encrypt(4, 20, 225, innerkey3, innerkey3.length, ipIn, DataOut);
					String data = ByteUtils.byteArray2HexString(DataOut);
					// CBC 模式
					int res6 = Ddi.ddi_innerkey_account_encrypt(5, 60, 225, innerkey3, innerkey3.length, ipIn, DataOut);
					String data2 = ByteUtils.byteArray2HexString(DataOut);
					if (res5 == 0 && data.equalsIgnoreCase(data0) && res6 == 0 && data2.equalsIgnoreCase(data1)) {
						myHandleDeal("group122加密账户成功", res5);
					} else {
						myHandleDeal("group122加密账户失败" + data, res5);
					}
				} else {
					myHandleDeal("group122更新工作密钥测试失败", res1);
				}
			} else {
				myHandleDeal("group122更新主密钥失败", res0);
			}
//		} else {
//			myHandleDeal("group122测试失败" + MainActivity.model + "不支持加密卡的账户数据", -99);
//		}

	}

	// //加密数据长度最大504
	private void testgroup123() {
		myHandleDeal("testgroup123测试", 0);
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
				myHandleDeal("group123更新主密钥成功", res0);
				int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 75, 225, 1, ipIn, innerkey2, 24, ipOut, 24);
				if (res1 == 0) {
					myHandleDeal("group123更新工作密钥测试成功", res1);
					// 工作秘钥明文：AFE25AE54AA57E6F89E25694FA26E33D50D5CD8469257880
					// ipin=30303030abCDef99a1da25f1e411fea5
					// msg_summery=12345678abcdEFBFABCDefBCabcdEFBF
					// ECB 模式
					int res5 = Ddi.ddi_innerkey_account_encrypt(4, 20, 225, innerkey3, 504, ipIn, DataOut);
					String data = ByteUtils.byteArray2HexString(DataOut);
					// CBC 模式
					int res6 = Ddi.ddi_innerkey_account_encrypt(5, 60, 225, innerkey3, 504, ipIn, DataOut);
					String data2 = ByteUtils.byteArray2HexString(DataOut);
					if (res5 == 0 && data.equalsIgnoreCase(data0) && res6 == 0 && data2.equalsIgnoreCase(data1)) {
						myHandleDeal("group123加密账户成功", res5);
					} else {
						myHandleDeal("group123加密账户失败" + data, res5);
					}

				} else {
					myHandleDeal("group123更新工作密钥测试失败", res1);
				}
			} else {
				myHandleDeal("group123更新主密钥失败", res0);
			}
//		} else {
//			myHandleDeal("group123测试失败" + MainActivity.model + "不支持加密卡的账户数据", -99);
//		}

	}

	// 索引区域没有秘钥，检查测试
	private void testgroup90() {
		myHandleDeal("testgroup90测试", 0);

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
			myHandleDeal("主密钥检测成功90" + res2, res0);
			int res1 = Ddi.ddi_innerkey_delete_key(1, 449);
			int res4 = Ddi.ddi_innerkey_ioctl_key_check(1, 449);
			if (res1 == 0 && res4 == -1) {
				myHandleDeal("更新工作密钥测试成功90" + res4, res1);
			} else {
				myHandleDeal("更新工作密钥测试失败90" + res4, res1);
			}
		} else {
			myHandleDeal("主密钥检测失败90" + res2, res0);
		}
		Ddi.ddi_innerkey_close();
	}

	// 检查SM2公钥的合法性
	private void testgroup91() {
		myHandleDeal("testgroup91测试", 0);

		String key1 = "12345678abcdEFBFABCDefBCabcdEFBF";
		final byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		Runnable runnable = new Runnable() {
			public void run() {
				for (int i = 0; i < 200; i++) {
					int res = Ddi.ddi_innerkey_open();
					if (res == 0) {
						myHandleDeal("group91打开设备成功" + i, res);
						int res2 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 149, innerkey1, 16);
						if (res2 == 0) {
							myHandleDeal("group91更新主密钥成功" + i, res2);

						} else {
							myHandleDeal("group91更新主密钥失败" + i, res2);

						}
					} else {
						myHandleDeal("group91打开设备失败" + i, res);
					}
					int res1 = Ddi.ddi_innerkey_close();
					if (res1 == 0) {
						myHandleDeal("group91关闭设备成功" + i, res);
						int res3 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 149, innerkey1, 16);
						if (res3 == 0) {
							myHandleDeal("group91更新主密钥成功" + i, res3);

						} else {
							myHandleDeal("group91更新主密钥失败" + i, res3);

						}

					} else {
						myHandleDeal("group91关闭设备失败" + i, res);
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

	// 检查SM2私钥的合法性
	private void testgroup92() {
		myHandleDeal("testgroup92测试", 0);
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(1, 0, puk, prk);
		if (res1 == 0) {
			myHandleDeal("group92更新SM2公私钥成功", res1);
			int res0 = Ddi.ddi_innerkey_ioctl(2, 1, 0);
//			int res2 = Ddi.ddi_innerkey_ioctl(2, 0, 1);
			if (res0 == 0) {
				myHandleDeal("group92公私钥检测成功", res0);
			} else {
				myHandleDeal("group92公私钥检测失败", res0);
			}
		} else {
			myHandleDeal("group92更新SM2公私钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	// 检查对应的索引没有秘钥
	private void testgroup93() {
		myHandleDeal("testgroup93测试", 0);
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_nes_sm2_delete_key(0);
		if (res1 == 0) {
			myHandleDeal("group93删除SM2公私钥成功", res1);
			int res0 = Ddi.ddi_innerkey_ioctl(2, 1, 0);
			int res2 = Ddi.ddi_innerkey_ioctl(2, 0, 0);
			if (res0 == -6 && res2 == -6) {
				myHandleDeal("group93公私钥检测成功" + res2, res0);
			} else {
				myHandleDeal("group93公私钥检测失败" + res2, res0);
			}
		} else {
			myHandleDeal("group93更新SM2公私钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	// strhkey 主秘钥 其实就是用16字节的前8个字节加密一串数据encrypt 主秘钥最小索引 前半部分
	private void testgroup94() {
		myHandleDeal("testgroup94测试", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		String data = "f6c578676d4b1aa5d659a05a53eb7f4f";
		String result = "9EE2FB87BFAB59BD982A01AFA7A04C36";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
		if (res1 == 0) {
			myHandleDeal("group94更新主密钥成功", res1);
			// 设置秘钥区域
			mStrHkey.setArea(0);
			// 设置秘钥索引
			mStrHkey.setIndex(0);
			// 设置秘钥前后部分区域
			mStrHkey.setHalf(0);
			// 设置待加密数据
			mStrHkey.setIndata(innerkey2);
			// 设置待加密数据的长度
			mStrHkey.setLen(16);
			int res0 = Ddi.ddi_innerkey_ioctl_hkey_encrypt(mStrHkey);
			byte[] outdata = mStrHkey.getOutdata();
			String byteArray2HexString = ByteUtils.byteArray2HexString(outdata);
			if (res0 == 0 && result.equalsIgnoreCase(byteArray2HexString)) {
				myHandleDeal("group94主密钥检测成功", res0);
			} else {
				myHandleDeal("group94主密钥检测失败" + byteArray2HexString, res0);
			}
		} else {
			myHandleDeal("group94更新主密钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	// strhkey 主秘钥 其实就是用16字节的前8个字节加密一串数据encrypt 主秘钥最大索引 后半部分加密
	private void testgroup108() {
		myHandleDeal("testgroup108测试", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		String data = "f6c578676d4b1aa5d659a05a53eb7f4f";
		String result = "4DAA8FB26465A2A086DDEB7A1BF8E1BD";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 149, innerkey1, 16);
		if (res1 == 0) {
			myHandleDeal("group108更新主密钥成功", res1);
			// 设置秘钥区域
			mStrHkey.setArea(0);
			// 设置秘钥索引
			mStrHkey.setIndex(149);
			// 设置秘钥前后部分区域
			mStrHkey.setHalf(1);
			// 设置待加密数据
			mStrHkey.setIndata(innerkey2);
			// 设置待加密数据的长度
			mStrHkey.setLen(16);
			int res0 = Ddi.ddi_innerkey_ioctl_hkey_encrypt(mStrHkey);
			byte[] outdata = mStrHkey.getOutdata();
			String byteArray2HexString = ByteUtils.byteArray2HexString(outdata);
			if (res0 == 0 && result.equalsIgnoreCase(byteArray2HexString)) {
				myHandleDeal("group108主密钥检测成功", res0);
			} else {
				myHandleDeal("group108主密钥检测失败" + byteArray2HexString, res0);
			}
		} else {
			myHandleDeal("group108更新主密钥失败", res1);
		}

	}

	//// strhkey 主秘钥 其实就是用16字节的前8个字节加密一串数据encrypt 对应的主密钥没有索引 后半部分加密
	private void testgroup109() {
		myHandleDeal("testgroup109测试", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		String data = "f6c578676d4b1aa5d659a05a53eb7f4f";
		String result = "4DAA8FB26465A2A086DDEB7A1BF8E1BD";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 149, innerkey1, 16);
		if (res1 == 0) {
			myHandleDeal("group109更新主密钥成功", res1);
			// 设置秘钥区域
			mStrHkey.setArea(0);
			// 设置秘钥索引
			int res5 = Ddi.ddi_innerkey_delete_key(0, 149);
			if (res5 == 0) {
				myHandleDeal("group109删除工作秘钥成功", res5);
			} else {
				myHandleDeal("group109删除工作秘钥失败", res5);
			}
			mStrHkey.setIndex(149);
			// 设置秘钥前后部分区域
			mStrHkey.setHalf(1);
			// 设置待加密数据
			mStrHkey.setIndata(innerkey2);
			// 设置待加密数据的长度
			mStrHkey.setLen(16);
			int res0 = Ddi.ddi_innerkey_ioctl_hkey_encrypt(mStrHkey);
			byte[] outdata = mStrHkey.getOutdata();
			String byteArray2HexString = ByteUtils.byteArray2HexString(outdata);
			if (res0 == -6) {
				myHandleDeal("group109主密钥检测成功", res0);
			} else {
				myHandleDeal("group109主密钥检测失败" + byteArray2HexString, res0);
			}
		} else {
			myHandleDeal("group109更新主密钥失败", res1);
		}

	}

	// strhkey 工作秘钥 其实就是用16字节的前8个字节加密一串数据encrypt 工作秘钥 最小索引 后半部分
	private void testgroup95() {
		myHandleDeal("testgroup95测试", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		String data = "f6c578676d4b1aa5d659a05a53eb7f4f";
		String result = "2C3D50F7F0DCB19FEBF23DA0F54F1459";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
		if (res1 == 0) {
			// 工明：1A01A6525A47A662 C6DEE7B27B73C4D8
			myHandleDeal("group95更新主密钥成功", res1);
			int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 0, 0, ipIn, innerkey2, 16, ipOut, 16);
			if (res2 == 0) {
				myHandleDeal("group95更新工作密钥成功", res2);
			} else {
				myHandleDeal("group95更新工作密钥失败", res2);
			}
			// 设置秘钥区域
			mStrHkey.setArea(1);
			// 设置秘钥索引
			mStrHkey.setIndex(0);
			// 设置秘钥前后部分区域
			mStrHkey.setHalf(1);
			// 设置待加密数据
			mStrHkey.setIndata(innerkey2);
			// 设置待加密数据的长度
			mStrHkey.setLen(16);
			int res0 = Ddi.ddi_innerkey_ioctl_hkey_encrypt(mStrHkey);
			byte[] outdata = mStrHkey.getOutdata();
			String byteArray2HexString = ByteUtils.byteArray2HexString(outdata);
			if (res0 == 0 && result.equalsIgnoreCase(byteArray2HexString)) {
				myHandleDeal("group95工作秘钥密钥检测成功", res0);
			} else {
				myHandleDeal("group95工作密钥检测失败" + byteArray2HexString, res0);
			}
		} else {
			myHandleDeal("group95更新主密钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	// strhkey 工作秘钥 其实就是用16字节的前8个字节加密一串数据encrypt 对应工作秘钥 最小索引没有秘钥 后半部分
	private void testgroup110() {
		myHandleDeal("testgroup110测试", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		String data = "f6c578676d4b1aa5d659a05a53eb7f4f";
		String result = "2C3D50F7F0DCB19FEBF23DA0F54F1459";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
		if (res1 == 0) {
			// 工明：1A01A6525A47A662 C6DEE7B27B73C4D8
			myHandleDeal("group95更新主密钥成功", res1);
			int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 0, 0, ipIn, innerkey2, 16, ipOut, 16);
			if (res2 == 0) {
				myHandleDeal("group110更新工作密钥成功", res2);
			} else {
				myHandleDeal("group110更新工作密钥失败", res2);
			}
			// 设置秘钥区域
			mStrHkey.setArea(1);
			// 设置秘钥索引
			int res5 = Ddi.ddi_innerkey_delete_key(1, 0);
			if (res5 == 0) {
				myHandleDeal("group110删除工作秘钥成功", res5);
			} else {
				myHandleDeal("group110删除工作秘钥失败", res5);
			}
			mStrHkey.setIndex(0);
			// 设置秘钥前后部分区域
			mStrHkey.setHalf(1);
			// 设置待加密数据
			mStrHkey.setIndata(innerkey2);
			// 设置待加密数据的长度
			mStrHkey.setLen(16);
			
			int res0 = Ddi.ddi_innerkey_ioctl_hkey_encrypt(mStrHkey);
			byte[] outdata = mStrHkey.getOutdata();
			String byteArray2HexString = ByteUtils.byteArray2HexString(outdata);
			if (res0 == -6) {
				myHandleDeal("group110主密钥检测成功", res0);
			} else {
				myHandleDeal("group110主密钥检测失败" + byteArray2HexString, res0);
			}
		} else {
			myHandleDeal("group110更新主密钥失败", res1);
		}

	}

	// //strhkey 工作秘钥 其实就是用16字节的前8个字节加密一串数据encrypt 工作秘钥 最大索引 前半部分
	private void testgroup107() {
		myHandleDeal("testgroup107测试", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		String data = "f6c578676d4b1aa5d659a05a53eb7f4f";
		String result = "31BCD0DDDE95B5127087FE1A4A456853";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
		if (res1 == 0) {
			// 工明：1A01A6525A47A662 C6DEE7B27B73C4D8
			myHandleDeal("group107更新主密钥成功", res1);
			int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 449, 0, ipIn, innerkey2, 16, ipOut, 16);
			if (res2 == 0) {
				myHandleDeal("group107更新工作密钥成功", res2);
			} else {
				myHandleDeal("group95更新工作密钥失败", res2);
			}
			// 设置秘钥区域
			mStrHkey.setArea(1);
			// 设置秘钥索引
			mStrHkey.setIndex(449);
			// 设置秘钥前后部分区域
			mStrHkey.setHalf(0);
			// 设置待加密数据
			mStrHkey.setIndata(innerkey2);
			// 设置待加密数据的长度
			mStrHkey.setLen(16);
			int res0 = Ddi.ddi_innerkey_ioctl_hkey_encrypt(mStrHkey);
			byte[] outdata = mStrHkey.getOutdata();
			String byteArray2HexString = ByteUtils.byteArray2HexString(outdata);
			if (res0 == 0 && result.equalsIgnoreCase(byteArray2HexString)) {
				myHandleDeal("group95主密钥检测成功", res0);
			} else {
				myHandleDeal("group95主密钥检测失败" + byteArray2HexString, res0);
			}
		} else {
			myHandleDeal("group95更新主密钥失败", res1);
		}

	}

	// 对应索引没有秘钥
	private void testgroup96() {
		myHandleDeal("testgroup96测试", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		String data = "f6c578676d4b1aa5d659a05a53eb7f4f";
		String result = "2C3D50F7F0DCB19FEBF23DA0F54F1459";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
		if (res1 == 0) {
			myHandleDeal("group96更新主密钥成功", res1);
			int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 10, 0, ipIn, innerkey2, 16, ipOut, 16);
			if (res2 == 0) {
				myHandleDeal("group96更新工作密钥成功", res2);
			} else {
				myHandleDeal("group96更新工作密钥失败", res2);
			}
			// 设置秘钥区域
			mStrHkey.setArea(1);
			// 设置秘钥索引
			int res5 = Ddi.ddi_innerkey_delete_key(1, 9);
			if (res5 == 0) {
				myHandleDeal("group103删除工作秘钥成功", res5);
			} else {
				myHandleDeal("group103删除工作秘钥失败", res5);
			}
			mStrHkey.setIndex(9);
			// 设置秘钥前后部分区域
			mStrHkey.setHalf(1);
			// 设置待加密数据
			mStrHkey.setIndata(innerkey2);
			// 设置待加密数据的长度
			mStrHkey.setLen(16);
			int res0 = Ddi.ddi_innerkey_ioctl_hkey_encrypt(mStrHkey);
			byte[] outdata = mStrHkey.getOutdata();
			String byteArray2HexString = ByteUtils.byteArray2HexString(outdata);
			if (res0 == -6) {
				myHandleDeal("group96主密钥检测成功", res0);
			} else {
				myHandleDeal("group96主密钥检测失败" + byteArray2HexString, res0);
			}
		} else {
			myHandleDeal("group96更新主密钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	// 工作秘钥解密后部分 最大索引
	private void testgroup97() {
		myHandleDeal("testgroup97测试", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		String data = "f6c578676d4b1aa5d659a05a53eb7f4f";
		String result = "7A43C6AA6602E3AEF92D540A87E0C2B4";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
		if (res1 == 0) {
			// 工作秘钥的明文：1A01A6525A47A662 C6DEE7B27B73C4D8
			myHandleDeal("group97更新主密钥成功", res1);
			int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 449, 0, ipIn, innerkey2, 16, ipOut, 16);
			if (res2 == 0) {
				myHandleDeal("group97更新工作密钥成功", res2);
			} else {
				myHandleDeal("group97更新工作密钥失败", res2);
			}
			// 设置秘钥区域
			mStrHkey.setArea(1);
			// 设置秘钥索引
			mStrHkey.setIndex(449);
			// 设置秘钥前后部分区域
			mStrHkey.setHalf(1);
			// 设置待加密数据
			mStrHkey.setIndata(innerkey2);
			// 设置待加密数据的长度
			mStrHkey.setLen(16);
			int res0 = Ddi.ddi_innerkey_ioctl_hkey_decrypt(mStrHkey);
			byte[] outdata = mStrHkey.getOutdata();
			String byteArray2HexString = ByteUtils.byteArray2HexString(outdata);
			if (res0 == 0 && byteArray2HexString.equalsIgnoreCase(result)) {
				myHandleDeal("group97主密钥检测成功", res0);
			} else {
				myHandleDeal("group97主密钥检测失败" + byteArray2HexString, res0);
			}
		} else {
			myHandleDeal("group97更新主密钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	// 工作秘钥解密前部分 最小索引
	private void testgroup105() {
		myHandleDeal("testgroup105测试", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		String data = "f6c578676d4b1aa5d659a05a53eb7f4f";
		String result = "58A9B19DB9D524CCABA7B1911862B395";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
		if (res1 == 0) {
			// 工作秘钥的明文：1A01A6525A47A662 C6DEE7B27B73C4D8
			myHandleDeal("group105更新主密钥成功", res1);
			int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 0, 0, ipIn, innerkey2, 16, ipOut, 16);
			if (res2 == 0) {
				myHandleDeal("group105更新工作密钥成功", res2);
			} else {
				myHandleDeal("group105更新工作密钥失败", res2);
			}
			// 设置秘钥区域
			mStrHkey.setArea(1);
			// 设置秘钥索引
			mStrHkey.setIndex(0);
			// 设置秘钥前后部分区域
			mStrHkey.setHalf(0);
			// 设置待加密数据
			mStrHkey.setIndata(innerkey2);
			// 设置待加密数据的长度
			mStrHkey.setLen(16);
			int res0 = Ddi.ddi_innerkey_ioctl_hkey_decrypt(mStrHkey);
			byte[] outdata = mStrHkey.getOutdata();
			String byteArray2HexString = ByteUtils.byteArray2HexString(outdata);
			if (res0 == 0 && byteArray2HexString.equalsIgnoreCase(result)) {
				myHandleDeal("group105主密钥检测成功", res0);
			} else {
				myHandleDeal("group105主密钥检测失败" + byteArray2HexString, res0);
			}
		} else {
			myHandleDeal("group105更新主密钥失败", res1);
		}

	}

	// 对应工作秘钥解密前部分 最小索引没有秘钥
	private void testgroup112() {
		myHandleDeal("testgroup112测试", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		String data = "f6c578676d4b1aa5d659a05a53eb7f4f";
		String result = "31BCD0DDDE95B5127087FE1A4A456853";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
		if (res1 == 0) {
			// 工作秘钥的明文：1A01A6525A47A662C6DEE7B27B73C4D8
			myHandleDeal("group112更新主密钥成功", res1);
			int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 0, 0, ipIn, innerkey2, 16, ipOut, 16);
			if (res2 == 0) {
				myHandleDeal("group112更新工作密钥成功", res2);
			} else {
				myHandleDeal("group112更新工作密钥失败", res2);
			}
			// 设置秘钥区域
			mStrHkey.setArea(1);
			// 设置秘钥索引
			int res5 = Ddi.ddi_innerkey_delete_key(1, 0);
			if (res5 == 0) {
				myHandleDeal("group110删除工作秘钥成功", res5);
			} else {
				myHandleDeal("group110删除工作秘钥失败", res5);
			}
			mStrHkey.setIndex(0);
			// 设置秘钥前后部分区域
			mStrHkey.setHalf(0);
			// 设置待加密数据
			mStrHkey.setIndata(innerkey2);
			// 设置待加密数据的长度
			mStrHkey.setLen(16);
			int res0 = Ddi.ddi_innerkey_ioctl_hkey_decrypt(mStrHkey);
			byte[] outdata = mStrHkey.getOutdata();
			String byteArray2HexString = ByteUtils.byteArray2HexString(outdata);
			if (res0 == -6) {
				myHandleDeal("group112主密钥检测成功", res0);
			} else {
				myHandleDeal("group112主密钥检测失败" + byteArray2HexString, res0);
			}
		} else {
			myHandleDeal("group112更新主密钥失败", res1);
		}

	}

	// strhkey 主秘钥 其实就是用16字节的前8个字节加密一串数据decrypt 最小主密钥 主密钥前部分
	private void testgroup98() {
		myHandleDeal("testgroup98测试", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		String data = "f6c578676d4b1aa5d659a05a53eb7f4f";
		String result = "5BC81521647FBD41D016E3B03BEA43C7";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		// 主密钥明文：
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
		if (res1 == 0) {
			myHandleDeal("group98更新主密钥成功", res1);
			// 设置秘钥区域
			mStrHkey.setArea(0);
			// 设置秘钥索引
			mStrHkey.setIndex(0);
			// 设置秘钥前后部分区域
			mStrHkey.setHalf(0);
			// 设置待加密数据
			mStrHkey.setIndata(innerkey2);
			// 设置待加密数据的长度
			mStrHkey.setLen(16);
			int res0 = Ddi.ddi_innerkey_ioctl_hkey_decrypt(mStrHkey);
			byte[] outdata = mStrHkey.getOutdata();
			String byteArray2HexString = ByteUtils.byteArray2HexString(outdata);
			if (res0 == 0 && result.equalsIgnoreCase(byteArray2HexString)) {
				myHandleDeal("group98主密钥检测成功", res0);
			} else {
				myHandleDeal("group98主密钥检测失败" + byteArray2HexString, res0);
			}
		} else {
			myHandleDeal("group98更新主密钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	// strhkey 主秘钥 其实就是用16字节的前8个字节加密一串数据decrypt 最大主密钥 主密钥后部分
	private void testgroup106() {
		myHandleDeal("testgroup106测试", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";// 9999efBCabcdEFBF
		String data = "f6c578676d4b1aa5d659a05a53eb7f4f";
		String result = "BEA6218875A3F662696EBCF0ADBFE124";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		// 主密钥明文：
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 149, innerkey1, 16);
		if (res1 == 0) {
			myHandleDeal("group106更新主密钥成功", res1);
			// 设置秘钥区域
			mStrHkey.setArea(0);
			// 设置秘钥索引
			mStrHkey.setIndex(149);
			// 设置秘钥前后部分区域
			mStrHkey.setHalf(1);
			// 设置待加密数据
			mStrHkey.setIndata(innerkey2);
			// 设置待加密数据的长度
			mStrHkey.setLen(16);
			int res0 = Ddi.ddi_innerkey_ioctl_hkey_decrypt(mStrHkey);
			byte[] outdata = mStrHkey.getOutdata();
			String byteArray2HexString = ByteUtils.byteArray2HexString(outdata);
			if (res0 == 0 && result.equalsIgnoreCase(byteArray2HexString)) {
				myHandleDeal("group106主密钥检测成功", res0);
			} else {
				myHandleDeal("group106主密钥检测失败" + byteArray2HexString, res0);
			}
		} else {
			myHandleDeal("group106更新主密钥失败", res1);
		}

	}

	// strhkey 主秘钥 其实就是用16字节的前8个字节加密一串数据decrypt 最大主密钥没有秘钥 主密钥后部分解密
	private void testgroup111() {
		myHandleDeal("testgroup111测试", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		String data = "f6c578676d4b1aa5d659a05a53eb7f4f";
		String result = "5BC81521647FBD41D016E3B03BEA43C7";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		// 主密钥明文：
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 149, innerkey1, 16);
		if (res1 == 0) {
			myHandleDeal("group111更新主密钥成功", res1);
			// 设置秘钥区域
			mStrHkey.setArea(0);
			// 设置秘钥索引
			int res5 = Ddi.ddi_innerkey_delete_key(0, 149);
			if (res5 == 0) {
				myHandleDeal("group110删除工作秘钥成功", res5);
			} else {
				myHandleDeal("group110删除工作秘钥失败", res5);
			}
			mStrHkey.setIndex(149);
			// 设置秘钥前后部分区域
			mStrHkey.setHalf(1);
			// 设置待加密数据
			mStrHkey.setIndata(innerkey2);
			// 设置待加密数据的长度
			mStrHkey.setLen(16);
			int res0 = Ddi.ddi_innerkey_ioctl_hkey_decrypt(mStrHkey);
			byte[] outdata = mStrHkey.getOutdata();
			String byteArray2HexString = ByteUtils.byteArray2HexString(outdata);
			if (res0 == -6) {
				myHandleDeal("group106主密钥检测成功", res0);
			} else {
				myHandleDeal("group106主密钥检测失败" + byteArray2HexString, res0);
			}
		} else {
			myHandleDeal("group106更新主密钥失败", res1);
		}

	}

	// strhkey 工作秘钥加密工作秘钥
	private void testgroup99() {
		myHandleDeal("testgroup99测试", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		String data = "f6c578676d4b1aa5d659a05a53eb7f4f";
		String result = "7A43C6AA6602E3AEF92D540A87E0C2B4";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
		if (res1 == 0) {
			// 工作秘钥的明文：1A01A6525A47A662C6DEE7B27B73C4D8
			myHandleDeal("group99更新主密钥成功", res1);
			int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 0, 0, ipIn, innerkey2, 16, ipOut, 16);
			int res3 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 1, 0, ipIn, innerkey1, 16, ipOut, 16);
			if (res2 == 0 && res3 == 0) {
				myHandleDeal("group99更新工作密钥成功", res2);
			} else {
				myHandleDeal("group99更新工作密钥失败", res2);
			}
			// 设置秘钥区域
			mStrKeyTAKpara.setArea(1);
			// 设置加密后保存的秘钥
			mStrKeyTAKpara.setSaveIndex(2);
			// 设置使用的工作秘钥
			mStrKeyTAKpara.setSourceIndex(0);
			// 设置被加密的工作秘钥
			mStrKeyTAKpara.setTargetIndex(1);

			int res0 = Ddi.ddi_innerkey_ioctl_tak_encryptTak(mStrKeyTAKpara);

			if (res0 == 0) {
				myHandleDeal("group99主密钥检测成功", res0);
			} else {
				myHandleDeal("group99主密钥检测失败", res0);
			}
		} else {
			myHandleDeal("group99更新主密钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	// 所有的索引都是一样
	private void testgroup100() {
		myHandleDeal("testgroup100测试", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		String data = "f6c578676d4b1aa5d659a05a53eb7f4f";
		String result = "7A43C6AA6602E3AEF92D540A87E0C2B4";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
		if (res1 == 0) {
			// 工作秘钥的明文：1A01A6525A47A662C6DEE7B27B73C4D8
			myHandleDeal("group100更新主密钥成功", res1);
			int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 10, 0, ipIn, innerkey2, 16, ipOut, 16);
			int res3 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 11, 0, ipIn, innerkey1, 16, ipOut, 16);
			if (res2 == 0 && res3 == 0) {
				myHandleDeal("group100更新工作密钥成功", res2);
			} else {
				myHandleDeal("group100更新工作密钥失败", res2);
			}
			// 设置秘钥区域
			mStrKeyTAKpara.setArea(1);
			// 设置加密后保存的秘钥
			mStrKeyTAKpara.setSaveIndex(10);
			// 设置使用的工作秘钥
			mStrKeyTAKpara.setSourceIndex(10);
			// 设置被加密的工作秘钥
			mStrKeyTAKpara.setTargetIndex(10);

			int res0 = Ddi.ddi_innerkey_ioctl_tak_encryptTak(mStrKeyTAKpara);

			if (res0 == 0) {
				myHandleDeal("group100主密钥检测成功", res0);
			} else {
				myHandleDeal("group100主密钥检测失败", res0);
			}
		} else {
			myHandleDeal("group100更新主密钥失败", res1);
		}

	}

	// 指定秘钥区域为主密钥
	private void testgroup101() {
		myHandleDeal("testgroup101测试", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		String data = "f6c578676d4b1aa5d659a05a53eb7f4f";
		String result = "7A43C6AA6602E3AEF92D540A87E0C2B4";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
		if (res1 == 0) {
			// 工作秘钥的明文：1A01A6525A47A662C6DEE7B27B73C4D8
			myHandleDeal("group100更新主密钥成功", res1);
			int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 10, 0, ipIn, innerkey2, 16, ipOut, 16);
			int res3 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 11, 0, ipIn, innerkey1, 16, ipOut, 16);
			if (res2 == 0 && res3 == 0) {
				myHandleDeal("group101更新工作密钥成功", res2);
			} else {
				myHandleDeal("group101更新工作密钥失败", res2);
			}
			// 设置秘钥区域
			mStrKeyTAKpara.setArea(0);
			// 设置加密后保存的秘钥
			mStrKeyTAKpara.setSaveIndex(15);
			// 设置使用的工作秘钥
			mStrKeyTAKpara.setSourceIndex(10);
			// 设置被加密的工作秘钥
			mStrKeyTAKpara.setTargetIndex(11);

			int res0 = Ddi.ddi_innerkey_ioctl_tak_encryptTak(mStrKeyTAKpara);

			if (res0 == -6) {
				myHandleDeal("group101主密钥检测成功", res0);
			} else {
				myHandleDeal("group101主密钥检测失败", res0);
			}
		} else {
			myHandleDeal("group101更新主密钥失败", res1);
		}

	}

	// 使用加密的工作秘钥不存在
	private void testgroup102() {
		myHandleDeal("testgroup102测试", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		String data = "f6c578676d4b1aa5d659a05a53eb7f4f";
		String result = "7A43C6AA6602E3AEF92D540A87E0C2B4";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
		if (res1 == 0) {
			// 工作秘钥的明文：1A01A6525A47A662C6DEE7B27B73C4D8
			myHandleDeal("group102更新主密钥成功", res1);
			int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 10, 0, ipIn, innerkey2, 16, ipOut, 16);
			int res3 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 11, 0, ipIn, innerkey1, 16, ipOut, 16);
			if (res2 == 0 && res3 == 0) {
				myHandleDeal("group102更新工作密钥成功", res2);
			} else {
				myHandleDeal("group102更新工作密钥失败", res2);
			}
			// 设置秘钥区域
			mStrKeyTAKpara.setArea(1);
			// 设置加密后保存的秘钥
			mStrKeyTAKpara.setSaveIndex(15);
			// 设置使用的工作秘钥
			int res5 = Ddi.ddi_innerkey_delete_key(1, 10);
			if (res5 == 0) {
				myHandleDeal("group102删除工作秘钥成功", res5);
			} else {
				myHandleDeal("group102删除工作秘钥失败", res5);

			}

			mStrKeyTAKpara.setSourceIndex(10);
			// 设置被加密的工作秘钥
			mStrKeyTAKpara.setTargetIndex(11);

			int res0 = Ddi.ddi_innerkey_ioctl_tak_encryptTak(mStrKeyTAKpara);

			if (res0 == -6) {
				myHandleDeal("group102主密钥检测成功", res0);
			} else {
				myHandleDeal("group102主密钥检测失败", res0);
			}
		} else {
			myHandleDeal("group102更新主密钥失败", res1);
		}

	}

	// 使用被加密的工作秘钥不存在
	private void testgroup103() {
		myHandleDeal("testgroup103测试", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		String data = "f6c578676d4b1aa5d659a05a53eb7f4f";
		String result = "7A43C6AA6602E3AEF92D540A87E0C2B4";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
		if (res1 == 0) {
			// 工作秘钥的明文：1A01A6525A47A662C6DEE7B27B73C4D8
			myHandleDeal("group103更新主密钥成功", res1);
			int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 10, 0, ipIn, innerkey2, 16, ipOut, 16);
			int res3 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 11, 0, ipIn, innerkey1, 16, ipOut, 16);
			if (res2 == 0 && res3 == 0) {
				myHandleDeal("group103更新工作密钥成功", res2);
			} else {
				myHandleDeal("group103更新工作密钥失败", res2);
			}
			// 设置秘钥区域
			mStrKeyTAKpara.setArea(1);
			// 设置加密后保存的秘钥
			mStrKeyTAKpara.setSaveIndex(15);
			// 设置使用的工作秘钥
			mStrKeyTAKpara.setSourceIndex(10);
			// 设置被加密的工作秘钥
			int res5 = Ddi.ddi_innerkey_delete_key(1, 11);
			if (res5 == 0) {
				myHandleDeal("group103删除工作秘钥成功", res5);
			} else {
				myHandleDeal("group103删除工作秘钥失败", res5);

			}
			mStrKeyTAKpara.setTargetIndex(11);

			int res0 = Ddi.ddi_innerkey_ioctl_tak_encryptTak(mStrKeyTAKpara);

			if (res0 == -6) {
				myHandleDeal("group103主密钥检测成功", res0);
			} else {
				myHandleDeal("group103主密钥检测失败", res0);
			}
		} else {
			myHandleDeal("group103更新主密钥失败", res1);
		}

	}

	// 工作秘钥加密工作秘钥 秘钥索引为最大
	private void testgroup104() {
		myHandleDeal("testgroup104测试", 0);
		String key1 = "56248AAAAAAAAAAA9999efBCabcdEFBF";
		String data = "f6c578676d4b1aa5d659a05a53eb7f4f";
		String result = "7A43C6AA6602E3AEF92D540A87E0C2B4";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey1, 16);
		if (res1 == 0) {
			// 工作秘钥的明文：1A01A6525A47A662C6DEE7B27B73C4D8
			myHandleDeal("group104更新主密钥成功", res1);
			int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 449, 0, ipIn, innerkey2, 16, ipOut, 16);
			int res3 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 448, 0, ipIn, innerkey1, 16, ipOut, 16);
			if (res2 == 0 && res3 == 0) {
				myHandleDeal("group104更新工作密钥成功", res2);
			} else {
				myHandleDeal("group104更新工作密钥失败", res2);
			}
			// 设置秘钥区域
			mStrKeyTAKpara.setArea(1);
			// 设置加密后保存的秘钥
			mStrKeyTAKpara.setSaveIndex(447);
			// 设置使用的工作秘钥
			mStrKeyTAKpara.setSourceIndex(448);
			// 设置被加密的工作秘钥
			mStrKeyTAKpara.setTargetIndex(449);

			int res0 = Ddi.ddi_innerkey_ioctl_tak_encryptTak(mStrKeyTAKpara);

			if (res0 == 0) {
				myHandleDeal("group104主密钥检测成功", res0);
			} else {
				myHandleDeal("group104主密钥检测失败", res0);
			}
		} else {
			myHandleDeal("group104更新主密钥失败", res1);
		}

	}

}
