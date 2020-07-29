package com.xinguodu.cts;

import javax.net.ssl.SSLException;

import com.xinguodu.ddiinterface.Ddi;

import android.R.integer;
import android.R.string;
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

public class NewinnerkeycaseActivity extends Activity {

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
	private byte[] innerkey;
	private byte[] innerkey2;
	private byte[] innerkey3;
	private byte[] ipIn;
	private byte[] ipOut;
	private int[] leOut;
	private byte[] uId;
	private byte[] ipOut2;
	private byte[] ipOut3;
	private byte[] ipOut4;
	private byte[] ipOut5;
	private byte[] ipOut6;
	private byte group;
	private byte[] mg1;
	private byte[] mg2;
	private byte[] mg3;

	private byte group1;
	public static int length = 64;
	private int star;
	private byte[] msg_summery;
	public static String mInfo[] = new String[35];
	private long flag = 0;

	private Thread mThread = new Thread(new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			while (Thflg) {
				if (Btflg) {
					testSM2update1();
					testSM2update2();
					testSM2update3();
					testSM2update4();
					testSM2update5();
					testSM2update6();
					testSM2update7();
					testSM2update8();
					testSM2update9();
					testSM2update10();
					testSM2update11();
					testSM2update12();
					testSM2update13();
					testSM2update14();
					testSM2update15();
					testSM2update16();
					testSM2update17();
					testSM2sign1();
					testSM2sign2();
					testSM2sign3();
					testSM2sign4();
					testSM2sign5();
					testSM2sign6();
					testSM2sign7();
					testSM2sign8();
					testsm3hash1();
					testsm3hash2();
					testsm3idhash1();
					testsm3idhash2();
					//7.1以后的需要用专门测试PINblock工具
					if (MainActivity.version.equalsIgnoreCase("5.1.1")) {
//						Log.v("TAG", "testpinblock1");
						testpinblock1();
						testpinblock2();
						testpinblock3();
						testpinblock4();
						testpinblock5();
						testpinblock6();
						testpinblock7();
						testpinblock8();
						testpinblock9();
						testpinblock10();
					}//捷克秘钥
						if (MainActivity.model.equalsIgnoreCase("N5")||MainActivity.model.equalsIgnoreCase("N6")||
								MainActivity.model.equalsIgnoreCase("N86")) {
							testpinpaddealcmd1();
							testpinpaddealcmd2();
							//压力测试
							testpinpaddealcmd3();
						}else {
							myHandleDeal(MainActivity.model+"测试捷克秘钥失败", -99);
						}
					testsm3hash3();
					testsm3idhash3();
					testsm3idhash4();
					//ddi_pinpad_deal_cmd  新加坡跟新主密钥 目前只有N5支持   
					//需要安装定制包和证书后才要执行
					//2020.07.03 修改 1.    优化新加坡更新KEK的时候，MK索引可以和KEK索引相同的问题; 
					if (MainActivity.model.equalsIgnoreCase("N5")) {
						testpinpaddealcmd4();
						testpinpaddealcmd5();
						testpinpaddealcmd6();
						testpinpaddealcmd7();
						testpinpaddealcmd8();
						testpinpaddealcmd9();
						testpinpaddealcmd10();
						//后面增加session KEY秘钥
						testpinpaddealcmd35();
						testpinpaddealcmd36();
						testpinpaddealcmd37();
						
					}else {
						myHandleDeal("测试失败当有修改到新加坡秘钥时才运行", -99);
					}
					testSM2update18();
					testAesupdatmk1();
					testAesupdatmk2();
					testAesupdatmk3();
					testAesupdatmk4();
					testAesupdatmk5();
					testAesupdatmk6();
					testAesupdatmk7();
					testAesupdatmk8();
					testAesupdatmk9();
					testAesupdatmk10();
					testAesupdatmk11();
					testAesupdatmk12();
					testSM2sign9();
					testSM2sign10();
					testSM2sign11();
					testSM2sign12();
					testSM2sign13();
					testSM2sign14();
					testSM2update19();
					testSM2update20();
					testSM2update21();
					testSM2update22();
					//检测嘉联公私钥
//					if (!MainActivity.model.equalsIgnoreCase("F900")) {
						//需要下载嘉联秘钥
						testpinpaddealcmd11();
						testpinpaddealcmd12();
						//需要签名的用例
						testpinpaddealcmd13();
						testpinpaddealcmd14();
//					}else {
//						myHandleDeal("终端"+MainActivity.model+"不支持检测嘉联秘钥测试失败", -99);
//					}
					testSM2update23();
					testSM2update24();
					testSM2update25();
					testSM2update26();
					testSM2update27();
					testSM2update28();
					testSM2update29();
					testSM2update30();
					testSM2update31();
					testSM2update32();
					testSM2update33();
					testSM2update34();
					//生成公私秘钥对F900，n6不支持
					if (MainActivity.model.equalsIgnoreCase("F900")|| MainActivity.model.equalsIgnoreCase("N6")||MainActivity.model.equalsIgnoreCase("EF900")) {
						
						myHandleDeal("终端"+MainActivity.model+"不支持生成公私秘钥对用例测试失败", -99);
					}else {
						testSM2update35();
						testSM2update36();
						//压力测试
						testSM2update37();
						testSM2update38();
						
					}
					testsm3hash4();
					testsm3hash5();
					testsm3idhash5();
					testsm3idhash6();
					// 交总行的时候需要执行 而且是分步执行
					if (MainActivity.model.equalsIgnoreCase("交行")) {
						//交总行SM2算法
						testpinpaddealcmd21();
						testpinpaddealcmd22();
						testpinpaddealcmd23();
						testpinpaddealcmd24();
						testpinpaddealcmd25();
						testpinpaddealcmd26();
						testpinpaddealcmd27();
						//交总行RSA算法
						testpinpaddealcmd28();
						testcustomercmddeal1();
						testcustomercmddeal2();
						testcustomercmddeal3();
						testcustomercmddeal4();
						testcustomercmddeal5();
						testcustomercmddeal6();
						testcustomercmddeal7();
					} else {
						myHandleDeal("测试失败当有修改到交总行秘钥时才运行", -99);
					}
					//香港中银计算PINblock，需要在计算pinblock的工具里面测试
				
					//压力测试
					testSM2update39();
					testinnerkeysingle();
					testend();
//		
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
		setContentView(R.layout.activity_newinnerkeycase);
		innerkey = ByteUtils.hexString2ByteArray(ParaEntity.nkeykey1);
		innerkey2 = ByteUtils.hexString2ByteArray(ParaEntity.nkeykey2);
		innerkey3 = ByteUtils.hexString2ByteArray(ParaEntity.nkeykey3);
		String data = "30303030abCDef99a1da25f1e411fea5";
		ipIn = ByteUtils.hexString2ByteArray(data);
		ipOut = new byte[200];
		leOut = new int[1];
		int[] leOut1 = new int[2048];
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
		tv = (TextView) findViewById(R.id.nkeytv);
		tv1 = (TextView) findViewById(R.id.nkeytv1);
		bt1 = (Button) findViewById(R.id.nkeybt1);
		spinner = (Spinner) findViewById(R.id.nkeyspinner);
		scrollView = (ScrollView) findViewById(R.id.nkeyscrollView);
		mTotalTextView = (TextView) findViewById(R.id.nkeytext_total);
		mSucessTextView = (TextView) findViewById(R.id.nkeytext_sucess);
		mFailTextView = (TextView) findViewById(R.id.nkeytext_fail);
		mSucessRateTextView = (TextView) findViewById(R.id.nkeytext_sucess_rate);
	}

	private void run() {
		// TODO Auto-generated method stub
		bt1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (Btflg) {
					Toast.makeText(getApplicationContext(), "测试中，请等待", Toast.LENGTH_SHORT).show();
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
					Toast.makeText(getApplicationContext(), "测试中，请等待", Toast.LENGTH_SHORT).show();
				} else {
					tv.setText("");
					switch (pos) {
					case 1:
						testSM2update1();
						break;
					case 2:
						testSM2update2();
						break;
					case 3:
						testSM2update3();
						break;
					case 4:
						testSM2update4();
						break;
					case 5:
						testSM2update5();
						break;
					case 6:
						testSM2update6();
						break;
					case 7:
						testSM2update7();
						break;
					case 8:
						testSM2update8();
						break;
					case 9:
						testSM2update9();
						break;
					case 10:
						testSM2update10();
						break;
					case 11:
						testSM2update11();
						break;
					case 12:
						testSM2update12();
						break;
					case 13:
						testSM2update13();
						break;
					case 14:
						testSM2update14();
						break;
					case 15:
						testSM2update15();
						break;
					case 16:
						testSM2update16();
						break;
					case 17:
						testSM2update17();
						break;
					case 18:
						testSM2sign1();
						break;
					case 19:
						testSM2sign2();
						break;
					case 20:
						testSM2sign3();
						break;
					case 21:
						testSM2sign4();
						break;
					case 22:
						testSM2sign5();
						break;
					case 23:
						testSM2sign6();
						break;
					case 24:
						testSM2sign7();
						break;
					case 25:
						testSM2sign8();
						break;
					case 26:
						testsm3hash1();
						break;
					case 27:
						testsm3hash2();
						break;
					case 28:
						testsm3idhash1();
						break;
					case 29:
						testsm3idhash2();
						break;
					case 30:
						testpinblock1();
						break;
					case 31:
						testpinblock2();
						break;
					case 32:
						testpinblock3();
						break;
					case 33:
						testpinblock4();
						break;
					case 34:
						testpinblock5();
						break;
					case 35:
						testpinblock6();
						break;
					case 36:
						testpinblock7();
						break;
					case 37:
						testpinblock8();
						break;
					case 38:
						testpinblock9();
						break;
					case 39:
						testpinblock10();
						break;
					case 40:
						testinnerkeysingle();
						break;
					case 41:
						testAesupdatmk1();
						break;
					case 42:
						testAesupdatmk2();
						break;
					case 43:
						testAesupdatmk3();
						break;
					case 44:
						testAesupdatmk4();
						break;
					case 45:
						testAesupdatmk5();
						break;
					case 46:
						testAesupdatmk6();
						break;
					case 47:
						testAesupdatmk7();
						break;
					case 48:
						testAesupdatmk8();
						break;
					case 49:
						testAesupdatmk9();
						break;
					case 50:
						testAesupdatmk10();
						break;
					case 51:
						testAesupdatmk11();
						break;
					case 52:
						testAesupdatmk12();
						break;
					case 53:
						testsm3hash3();
						break;
					case 54:
						testpinpaddealcmd1();
						break;
					case 55:
						testpinpaddealcmd2();
						break;
					case 56:
						testpinpaddealcmd3();
						break;
					case 57:
						testsm3idhash3();
						break;
					case 58:
						testsm3idhash4();
						break;
					case 59:
						testpinblock11();
						break;
					case 60:
						testpinpaddealcmd4();
						break;
					case 61:
						testpinpaddealcmd5();
						break;
					case 62:
						testpinpaddealcmd6();
						break;
					case 63:
						testpinpaddealcmd7();
						break;
					case 64:
						testpinpaddealcmd8();
						break;
					case 65:
						testpinpaddealcmd9();
						break;
					case 66:
						testpinpaddealcmd10();
						break;
					case 67:
						testSM2update18();
						break;
					case 68:
						testpinblock17();
						break;
					case 69:
						testSM2sign9();
						break;
					case 70:
						testSM2sign10();
						break;
					case 71:
						testpinblock18();
						break;
					case 72:
						testSM2sign11();
						break;
					case 73:
						testSM2sign12();
						break;
					case 74:
						testSM2sign13();
						break;
					case 75:
						testSM2sign14();
						break;
					case 76:
						testSM2update19();
						break;
					case 77:
						testSM2update20();
						break;
					case 78:
						testSM2update21();
						break;
					case 79:
						testSM2update22();
						break;
					case 80:
						testpinpaddealcmd11();
						break;
					case 81:
						testpinpaddealcmd12();
						break;
					case 82:
						testpinpaddealcmd13();
						break;
					case 83:
						testpinpaddealcmd14();
						break;
					case 84:
						testSM2update23();
						break;
					case 85:
						testSM2update24();
						break;
					case 86:
						testSM2update25();
						break;
					case 87:
						testSM2update26();
						break;
					case 88:
						testSM2update27();
						break;
					case 89:
						testSM2update28();
						break;
					case 90:
						testSM2update29();
						break;
					case 91:
						testSM2update30();
						break;
					case 92:
						testSM2update31();
						break;
					case 93:
						testSM2update32();
						break;
					case 94:
						testsm3hash4();
						break;
					case 95:
						testsm3hash5();
						break;
					case 96:
						testsm3idhash5();
						break;
					case 97:
						testsm3idhash6();
						break;
					case 98:
						testSM2update33();
						break;
					case 99:
						testpinpaddealcmd21();
						break;
					case 100:
						testpinpaddealcmd22();
						break;
					case 101:
						testpinpaddealcmd23();
						break;
					case 102:
						testpinpaddealcmd24();
						break;
					case 103:
						testpinpaddealcmd25();
						break;
					case 104:
						testpinpaddealcmd26();
						break;
					case 105:
						testpinpaddealcmd27();
						break;
					case 106:
						testcustomercmddeal1();
						break;
					case 107:
						testcustomercmddeal2();
						break;
					case 108:
						testcustomercmddeal3();
						break;
					case 109:
						testcustomercmddeal4();
						break;
					case 110:
						testcustomercmddeal5();
						break;
					case 111:
						testcustomercmddeal6();
						break;
					case 112:
						testcustomercmddeal7();
						break;
					case 113:
						testSM2update34();
						break;
					case 114:
						testSM2update35();
						break;
					case 115:
						testSM2update36();
						break;
					case 116:
						testSM2update37();
						break;
					case 117:
						testSM2update38();
						break;
					case 118:
						testSM2update39();
						break;
					case 119:
						testpinpaddealcmd28();
						break;
					case 120:
						testpinpaddealcmd28();
						break;
					case 121:
						testpinpaddealcmd28();
						break;
					case 122:
						testpinpaddealcmd28();
						break;
					case 123:
						testpinpaddealcmd28();
						break;
					case 124:
						testpinpaddealcmd28();
						break;
					case 125:
						testpinpaddealcmd28();
						break;
					case 126:
						testpinpaddealcmd35();
						break;
					case 127:
						testpinpaddealcmd36();
						break;
					
					case 128:
						testpinpaddealcmd37();
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

	private void testSM2update1() {
		myHandleDeal("testSM2update1测试", 0);
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey);
		byte[] pn = ByteUtils.hexString2ByteArray(ParaEntity.nkeyplain);
		byte[] ipOut4 = new byte[112];
		byte[] ipOut5 = new byte[16];
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, 0, puk, prk);
		if (res1 == 0) {
			myHandleDeal("SM2更新密钥成功", res1);
			int res2 = Ddi.ddi_innerkey_nes_sm2_encrypt(0, pn, pn.length, ipOut4, leOut);
			if (res2 == 0) {
				myHandleDeal("SM2公钥加密成功", res2);
				int res3 = Ddi.ddi_innerkey_nes_sm2_decrypt(0, ipOut4, ipOut4.length, ipOut5, leOut);
				String str = ByteUtils.byteArray2HexString(ipOut5);
				if (res3 == 0 && str.equals(ParaEntity.nkeyplain)) {
					myHandleDeal("SM2私钥解密成功", res3);
					int res4 = Ddi.ddi_innerkey_nes_sm2_delete_key(0);
					if (res4 == 0) {
						myHandleDeal("SM2删除公私钥对成功", res4);
						int res5 = Ddi.ddi_innerkey_nes_sm2_encrypt(0, pn, pn.length, ipOut, leOut);
						if (res5 == -1) {
							myHandleDeal("SM2公钥加密测试成功", res5);
						} else {
							myHandleDeal("SM2update1公钥加密测试失败", res5);
						}
						int res6 = Ddi.ddi_innerkey_nes_sm2_decrypt(0, pn, pn.length, ipOut, leOut);
						if (res6 == -1) {
							myHandleDeal("SM2私钥解密测试成功", res6);
						} else {
							myHandleDeal("SM2update1私钥解密测试失败", res6);
						}
					} else {
						myHandleDeal("SM2update1测试失败", res4);
					}
				} else {
					myHandleDeal("SM2update1私钥解密失败", res3);
				}
			} else {
				myHandleDeal("SM2update1公钥加密失败", res2);
			}
		} else {
			myHandleDeal("SM2update1更新密钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testSM2update2() {
		myHandleDeal("testSM2update2测试", 0);
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey1);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey1);
		byte[] pn = ByteUtils.hexString2ByteArray(ParaEntity.nkeyplain);
		byte[] ipOut4 = new byte[112];
		byte[] ipOut5 = new byte[16];
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, 8, puk, prk);
		if (res1 == 0) {
			myHandleDeal("SM2更新密钥成功", res1);
			int res2 = Ddi.ddi_innerkey_nes_sm2_encrypt(8, pn, pn.length, ipOut4, leOut);
			if (res2 == 0) {
				myHandleDeal("SM2公钥加密成功", res2);
				int res3 = Ddi.ddi_innerkey_nes_sm2_decrypt(8, ipOut4, ipOut4.length, ipOut5, leOut);
				String str = ByteUtils.byteArray2HexString(ipOut5);
				if (res3 == 0 && str.equals(ParaEntity.nkeyplain)) {
					myHandleDeal("SM2私钥解密成功", res3);
				} else {
					myHandleDeal("SM2update2私钥解密失败", res3);
				}
			} else {
				myHandleDeal("SM2update2公钥加密失败", res2);
			}
		} else {
			myHandleDeal("SM2update2更新密钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}
	private void testSM2update3() {
		myHandleDeal("testSM2update2测试", 0);
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey1);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey1);
		byte[] pn = ByteUtils.hexString2ByteArray(ParaEntity.nkeyplain);
		byte[] ipOut4 = new byte[112];
		byte[] ipOut5 = new byte[16];
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, 8, puk, prk);
		if (res1 == 0) {
			myHandleDeal("SM2更新密钥成功", res1);
			int res2 = Ddi.ddi_innerkey_nes_sm2_encrypt(8, pn, pn.length, ipOut4, leOut);
			if (res2 == 0) {
				myHandleDeal("SM2公钥加密成功", res2);
				int res3 = Ddi.ddi_innerkey_nes_sm2_decrypt(8, ipOut4, ipOut4.length, ipOut5, leOut);
				String str = ByteUtils.byteArray2HexString(ipOut5);
				if (res3 == 0 && str.equals(ParaEntity.nkeyplain)) {
					myHandleDeal("SM2私钥解密成功", res3);
				} else {
					myHandleDeal("SM2update2私钥解密失败", res3);
				}
			} else {
				myHandleDeal("SM2update2公钥加密失败", res2);
			}
		} else {
			myHandleDeal("SM2update2更新密钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testSM2update34() {
		myHandleDeal("testSM2update34测试", 0);
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey2);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey2);
		byte[] pn = ByteUtils.hexString2ByteArray(ParaEntity.dataString512);
		byte[] ipOut4 = new byte[608];
		byte[] ipOut5 = new byte[512];
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, 15, puk, prk);
		if (res1 == 0) {
			myHandleDeal("SM2update34SM2更新密钥成功", res1);
			int res2 = Ddi.ddi_innerkey_nes_sm2_encrypt(15, pn, pn.length, ipOut4, leOut);
			if (res2 == 0) {
				myHandleDeal("SM2update34SM2公钥加密成功", res2);
				int res3 = Ddi.ddi_innerkey_nes_sm2_decrypt(15, ipOut4, ipOut4.length, ipOut5, leOut);
				String str = ByteUtils.byteArray2HexString(ipOut5);
//				Log.v("TAG ", str);
				if (res3 == 0 && str.equalsIgnoreCase(ParaEntity.dataString512)) {
					myHandleDeal("SM2update34SM2私钥解密成功", res3);
					int res4 = Ddi.ddi_innerkey_nes_sm2_delete_key(15);
					if (res4 == 0) {
						myHandleDeal("SM2update34SM2删除公私钥对成功", res4);
						int res5 = Ddi.ddi_innerkey_nes_sm2_encrypt(15, pn, pn.length, ipOut, leOut);
						if (res5 == -1) {
							myHandleDeal("SM2update34SM2公钥加密测试成功", res5);
						} else {
							myHandleDeal("SM2update34公钥加密测试失败", res5);
						}
						int res6 = Ddi.ddi_innerkey_nes_sm2_decrypt(15, pn, pn.length, ipOut, leOut);
						if (res6 == -1) {
							myHandleDeal("SM2update34SM2私钥解密测试成功", res6);
						} else {
							myHandleDeal("SM2update34私钥解密测试失败", res6);
						}
					} else {
						myHandleDeal("SM2update34测试失败", res4);
					}
				} else {
					myHandleDeal("SM2update34私钥解密失败"+str, res3);
				}
			} else {
				myHandleDeal("SM2update34公钥加密失败", res2);
			}
		} else {
			myHandleDeal("SM2update34更新密钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}
	//生成SM2公私秘钥对
	/***
	 * 
	 */
	private void testSM2update35() {
		myHandleDeal("testSM2update35测试", 0);
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey1);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey1);
		byte[] pn = ByteUtils.hexString2ByteArray(ParaEntity.nkeyplain);
		byte[] PK = new byte[64];
		byte[] SK = new byte[32];
		byte[] ipOut4 = new byte[112];
		byte[] ipOut5 = new byte[16];
		int res5 = Ddi.ddi_sm2_gen_keypair_sw(PK,SK);
		Log.v("TAG", ByteUtils.byteArray2HexString(PK));
		Log.v("TAG", ByteUtils.byteArray2HexString(SK));
		if (res5==0) {
			myHandleDeal("SM2update35生成秘钥成功", res5);
		} else {
			myHandleDeal("SM2update35生成秘钥失败", res5);
		}
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, 8, PK, SK);
		if (res1 == 0) {
			myHandleDeal("SM2update35SM更新密钥成功", res1);
			int res2 = Ddi.ddi_innerkey_nes_sm2_encrypt(8, pn, pn.length, ipOut4, leOut);
			if (res2 == 0) {
				myHandleDeal("SM2update35SM2公钥加密成功", res2);
				int res3 = Ddi.ddi_innerkey_nes_sm2_decrypt(8, ipOut4, ipOut4.length, ipOut5, leOut);
				String str = ByteUtils.byteArray2HexString(ipOut5);
				if (res3 == 0 && str.equals(ParaEntity.nkeyplain)) {
					myHandleDeal("SM2update35SM私钥解密成功", res3);
				} else {
					myHandleDeal("SM2update35SM2update私钥解密失败", res3);
				}
			} else {
				myHandleDeal("SM2update35SM2update公钥加密失败", res2);
			}
		} else {
			myHandleDeal("SM2update35SM2update更新密钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}
	
	private void testSM2update36() {
		myHandleDeal("testSM2update36测试", 0);
//		String data = "b437e5ee8844bd03b8c921ab4375e1ead1279292849c5d2402b1e4bd9b48510bedcb12414c7471a06472835c2386c173f8246fe04a8112547a37380381093ee8";
		//
		// String data1 =
		// "53D6C890FB345C2B729A60DC7C29B4D1443EF308753C76C9103A423AA3A1355157CDB422F2BFF4F1FF50873CDC2A9361D7441FE273E59459CDC50A1ECE3C1C0A";
//		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey);
//		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey);
		byte[] id = ByteUtils.hexString2ByteArray(
				"31323334353637383132333435363738F1822030332882220987123273848292038474922838372923733011122938786352429104857384636282939382028374643837384938373736383728228737383837377327282929283839299283928283383838383838383837372827262626637363637376372828373733837380");
		byte[] pn = ByteUtils.hexString2ByteArray(ParaEntity.pn);
		byte[] ipOut4 = new byte[64];
		
//		byte[] ipOut5 = ByteUtils.hexString2ByteArray(data);
		byte[] PK = new byte[64];
		byte[] SK = new byte[32];
		int res5 = Ddi.ddi_sm2_gen_keypair_sw(PK,SK);
		Log.v("TAG", ByteUtils.byteArray2HexString(PK));
		Log.v("TAG", ByteUtils.byteArray2HexString(SK));
		if (res5==0) {
			myHandleDeal("SM2update36生成秘钥成功", res5);
			
		} else {
			myHandleDeal("SM2update36生成秘钥失败", res5);

		}
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, 0, PK, SK);
		if (res1 == 0) {
			myHandleDeal("SM2update36更新密钥成功", res1);
			
			int res2 = Ddi.ddi_innerkey_nes_sm2_sign(0, id, id.length, pn, pn.length, ipOut4);
			if (res2 == 0) {
				myHandleDeal("SM2update36签名成功", res2);
				int res3 = Ddi.ddi_innerkey_nes_sm2_verify(0, id, id.length, pn, pn.length, ipOut4);
				if (res3 == 0) {
					myHandleDeal("SM2update36验签成功", res3);
				} else {
					myHandleDeal("SM2update36验签失败", res3);
				}
			} else {
				myHandleDeal("SM2update36签名失败", res2);
			}
		} else {
			myHandleDeal("SM2update36更新密钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}
	private void testSM2update37() {
		myHandleDeal("testSM2update37测试", 0);
//		String data = "b437e5ee8844bd03b8c921ab4375e1ead1279292849c5d2402b1e4bd9b48510bedcb12414c7471a06472835c2386c173f8246fe04a8112547a37380381093ee8";
		//
		// String data1 =
		// "53D6C890FB345C2B729A60DC7C29B4D1443EF308753C76C9103A423AA3A1355157CDB422F2BFF4F1FF50873CDC2A9361D7441FE273E59459CDC50A1ECE3C1C0A";
//		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey);
//		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey);
		final byte[] id = ByteUtils.hexString2ByteArray(
				"31323334353637383132333435363738F1822030332882220987123273848292038474922838372923733011122938786352429104857384636282939382028374643837384938373736383728228737383837377327282929283839299283928283383838383838383837372827262626637363637376372828373733837380");
		final byte[] pn = ByteUtils.hexString2ByteArray(ParaEntity.pn);
		final byte[] ipOut4 = new byte[64];
		
//		byte[] ipOut5 = ByteUtils.hexString2ByteArray(data);
		final byte[] PK = new byte[64];
		final byte[] SK = new byte[32];
		Runnable runnable = new Runnable() {
			public void run() {
				for (int i = 0; i < 500; i++) {
					int res5 = Ddi.ddi_sm2_gen_keypair_sw(PK, SK);
					//			Log.v("TAG", ByteUtils.byteArray2HexString(PK));
					//			Log.v("TAG", ByteUtils.byteArray2HexString(SK));
					if (res5 == 0) {
						myHandleDeal("SM2update37生成秘钥成功" + i, res5);

					} else {
						myHandleDeal("SM2update37生成秘钥失败" + i, res5);

					}
				}
				Ddi.ddi_innerkey_open();
				int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, 0, PK, SK);
				if (res1 == 0) {
					myHandleDeal("SM2update37更新密钥成功", res1);
					int res2 = Ddi.ddi_innerkey_nes_sm2_sign(0, id, id.length, pn, pn.length, ipOut4);
					if (res2 == 0) {
						myHandleDeal("SM2update37签名成功", res2);
						int res3 = Ddi.ddi_innerkey_nes_sm2_verify(0, id, id.length, pn, pn.length, ipOut4);
						if (res3 == 0) {
							myHandleDeal("SM2update37验签成功", res3);
						} else {
							myHandleDeal("SM2update37验签失败", res3);
						}
					} else {
						myHandleDeal("SM2update37签名失败", res2);
					}
				} else {
					myHandleDeal("SM2update37更新密钥失败", res1);
				}
				Ddi.ddi_innerkey_close();
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
	
	private void testSM2update38() {
		myHandleDeal("testSM2update38测试", 0);
//		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey1);
//		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey1);
		final byte[] pn = ByteUtils.hexString2ByteArray(ParaEntity.nkeyplain);
		final byte[] PK = new byte[64];
		final byte[] SK = new byte[32];
		final byte[] ipOut4 = new byte[112];
		final byte[] ipOut5 = new byte[16];
		Runnable runnable = new Runnable() {
			public void run() {
				for (int i = 0; i < 500; i++) {
					int res5 = Ddi.ddi_sm2_gen_keypair_sw(PK, SK);
					//		Log.v("TAG", ByteUtils.byteArray2HexString(PK));
					//		Log.v("TAG", ByteUtils.byteArray2HexString(SK));
					if (res5 == 0) {
						myHandleDeal("SM2update38生成秘钥成功", res5);

					} else {
						myHandleDeal("SM2update38生成秘钥失败", res5);

					}
				}
				Ddi.ddi_innerkey_open();
				int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, 8, PK, SK);
				if (res1 == 0) {
					myHandleDeal("SM2update38SM更新密钥成功", res1);
					int res2 = Ddi.ddi_innerkey_nes_sm2_encrypt(8, pn, pn.length, ipOut4, leOut);
					if (res2 == 0) {
						myHandleDeal("SM2update38SM2公钥加密成功", res2);
						int res3 = Ddi.ddi_innerkey_nes_sm2_decrypt(8, ipOut4, ipOut4.length, ipOut5, leOut);
						String str = ByteUtils.byteArray2HexString(ipOut5);
						if (res3 == 0 && str.equals(ParaEntity.nkeyplain)) {
							myHandleDeal("SM2update38SM私钥解密成功", res3);
						} else {
							myHandleDeal("SM2update38SM2update私钥解密失败", res3);
						}
					} else {
						myHandleDeal("SM2update38SM2update公钥加密失败", res2);
					}
				} else {
					myHandleDeal("SM2update38SM2update更新密钥失败", res1);
				}
				Ddi.ddi_innerkey_close();
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
	
	private void testSM2update39() {
		
		myHandleDeal("testSM2update39测试", 0);
		final byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey);
		final byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey);
	    final byte[] pn = ByteUtils.hexString2ByteArray(ParaEntity.dataString512);
	    final byte[] id = ByteUtils.hexString2ByteArray(
				"31323334353637383132333435363738F1822030332882220987123273848292038474922838372923733011122938786352429104857384636282939382028374643837384938373736383728228737383837377327282929283839299283928283383838383838383837372827262626637363637376372828373733837380");
		final byte[] ipOut4 = new byte[608];
		final byte[] ipOut5 = new byte[512];
		final byte[] ipOut6 = new byte[64];
		Runnable runnable = new Runnable() {
			public void run() {
				Ddi.ddi_innerkey_open();
				int res1;
				for (int j = 0; j < 200; j++) {
					for (int i = 0; i < 16; i++) {
						//更新秘钥   
						//公钥：77422EEC40F85BCD4B45AD2C81538FD74039ADBE5F7DCD906729B4E996BA09AF
						//F4DF324FD5342DD885531D9C1B06378823B361C7BCCBD1BC4B935DFAD4A3B200
						//私钥：162130C960520EC227C6547D7921C77BE67B4AA47BE0C0247EEE18A54FFCC8F4
						res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, i, puk, prk);
						if (res1 == 0) {
							myHandleDeal("SM2update39更新密钥成功" + "索引" + i + "次数" + j, res1);

						} else {
							myHandleDeal("SM2update39更新密钥失败" + "索引" + i + "次数" + j, res1);
						}

						//数据加解密
						int res2 = Ddi.ddi_innerkey_nes_sm2_encrypt(i, pn, pn.length, ipOut4, leOut);
						if (res2 == 0) {
							myHandleDeal("SM2update39公钥加密成功", res2);
							int res3 = Ddi.ddi_innerkey_nes_sm2_decrypt(i, ipOut4, ipOut4.length, ipOut5, leOut);
							String str = ByteUtils.byteArray2HexString(ipOut5);
							if (res3 == 0 && str.equalsIgnoreCase(ParaEntity.dataString512)) {
								myHandleDeal("SM2update39私钥解密成功" + "索引" + i + "次数" + j, res3);

							} else {
								myHandleDeal("SM2update39私钥解密失败" + "索引" + i + "次数" + j, res3);
							}
						} else {
							myHandleDeal("SM2update39公钥加密失败" + "索引" + i + "次数" + j, res2);
						}

						//签名验签
						int res7 = Ddi.ddi_innerkey_nes_sm2_sign(i, id, id.length, pn, pn.length, ipOut6);
						if (res7 == 0) {
							myHandleDeal("SM2update39签名成功", res7);
							int res8 = Ddi.ddi_innerkey_nes_sm2_verify(i, id, id.length, pn, pn.length, ipOut6);
							if (res8 == 0) {
								myHandleDeal("SM2update39验签成功" + "索引" + i + "次数" + j, res8);
							} else {
								myHandleDeal("SM2update39验签失败" + "索引" + i + "次数" + j, res8);
							}
						} else {
							myHandleDeal("SM2update39签名失败", res7);
						}

					}
				}
				int res4 = Ddi.ddi_innerkey_nes_sm2_delete_key(0);
				if (res4 == 0) {
					myHandleDeal("SM2update39删除公私钥对成功", res4);
					int res5 = Ddi.ddi_innerkey_nes_sm2_encrypt(0, pn, pn.length, ipOut, leOut);
					if (res5 == -1) {
						myHandleDeal("SM2update39公钥加密测试成功", res5);
					} else {
						myHandleDeal("SM2update39公钥加密测试失败", res5);
					}
					int res6 = Ddi.ddi_innerkey_nes_sm2_decrypt(0, pn, pn.length, ipOut, leOut);
					if (res6 == -1) {
						myHandleDeal("SM2update39私钥解密测试成功", res6);
					} else {
						myHandleDeal("SM2update39私钥解密测试失败", res6);
					}
				} else {
					myHandleDeal("SM2update39测试失败", res4);
				}
				Ddi.ddi_innerkey_close();
			}
		};
	   Thread thread = new Thread(runnable);
	   thread.start();
	   try {
		thread.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	// 加密数据长度测试最大512
	private void testSM2update23() {
		myHandleDeal("testSM2update23测试", 0);
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey2);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey2);
		byte[] pn = ByteUtils.hexString2ByteArray(ParaEntity.dataString512);
		byte[] ipOut4 = new byte[608];// 只有这个位512位的时候是可以成功的
		byte[] ipOut5 = new byte[512];
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, 15, puk, prk);
		if (res1 == 0) {
			myHandleDeal("SM2更新密钥成功update23", res1);
			int res2 = Ddi.ddi_innerkey_nes_sm2_encrypt(15, pn, pn.length, ipOut4, leOut);
			if (res2 == 0) {
				myHandleDeal("SM2公钥加密成功update23", res2);
				int res3 = Ddi.ddi_innerkey_nes_sm2_decrypt(15, ipOut4, ipOut4.length, ipOut5, leOut);
				String str = ByteUtils.byteArray2HexString(ipOut5);
//				Log.v("costtime", str);
				if (res3 == 0 && str.equalsIgnoreCase(ParaEntity.dataString512)) {
					myHandleDeal("SM2私钥解密成功update23", res3);
					int res4 = Ddi.ddi_innerkey_nes_sm2_delete_key(15);
					if (res4 == 0) {
						myHandleDeal("SM2删除公私钥对成功update23", res4);
						int res5 = Ddi.ddi_innerkey_nes_sm2_encrypt(15, pn, pn.length, ipOut, leOut);
						if (res5 == -1) {
							myHandleDeal("SM2公钥加密测试成功update23", res5);
						} else {
							myHandleDeal("SM2update3公钥加密测试失败update23", res5);
						}
						int res6 = Ddi.ddi_innerkey_nes_sm2_decrypt(15, pn, pn.length, ipOut, leOut);
						if (res6 == -1) {
							myHandleDeal("SM2私钥解密测试成功update23", res6);
						} else {
							myHandleDeal("SM2update23私钥解密测试失败", res6);
						}
					} else {
						myHandleDeal("SM2update23测试失败", res4);
					}
				} else {
					myHandleDeal("SM2update23私钥解密失败" + str, res3);
				}
			} else {
				myHandleDeal("SM2update23公钥加密失败", res2);
			}
		} else {
			myHandleDeal("SM2update23更新密钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	// 加密数据长度测试最小1
	private void testSM2update24() {
		myHandleDeal("testSM2update24测试", 0);
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey2);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey2);
		byte[] pn = ByteUtils.hexString2ByteArray(ParaEntity.dataString1);
		byte[] ipOut4 = new byte[97];
		byte[] ipOut5 = new byte[1];
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, 15, puk, prk);
		if (res1 == 0) {
			myHandleDeal("SM2更新密钥成功update24", res1);
			int res2 = Ddi.ddi_innerkey_nes_sm2_encrypt(15, pn, pn.length, ipOut4, leOut);
			if (res2 == 0) {
				myHandleDeal("SM2公钥加密成功update24", res2);
				int res3 = Ddi.ddi_innerkey_nes_sm2_decrypt(15, ipOut4, ipOut4.length, ipOut5, leOut);
				String str = ByteUtils.byteArray2HexString(ipOut5);
				if (res3 == 0 && str.equals(ParaEntity.dataString1)) {
					myHandleDeal("SM2私钥解密成功update24", res3);
					int res4 = Ddi.ddi_innerkey_nes_sm2_delete_key(15);
					if (res4 == 0) {
						myHandleDeal("SM2删除公私钥对成功update24", res4);
						int res5 = Ddi.ddi_innerkey_nes_sm2_encrypt(15, pn, pn.length, ipOut, leOut);
						if (res5 == -1) {
							myHandleDeal("SM2公钥加密测试成功update24", res5);
						} else {
							myHandleDeal("SM2update3公钥加密测试失败update24", res5);
						}
						int res6 = Ddi.ddi_innerkey_nes_sm2_decrypt(15, pn, pn.length, ipOut, leOut);
						if (res6 == -1) {
							myHandleDeal("SM2私钥解密测试成功update24", res6);
						} else {
							myHandleDeal("SM2update24私钥解密测试失败", res6);
						}
					} else {
						myHandleDeal("SM2update24测试失败", res4);
					}
				} else {
					myHandleDeal("SM2update24私钥解密失败", res3);
				}
			} else {
				myHandleDeal("SM2update24公钥加密失败", res2);
			}
		} else {
			myHandleDeal("SM2update24更新密钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	// 加密数据长度超过最早长度2025
	private void testSM2update25() {
		myHandleDeal("testSM2update25测试", 0);
		final byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey2);
		final byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey2);
		final byte[] pn = ByteUtils.hexString2ByteArray(ParaEntity.dataString1025);
		final byte[] ipOut4 = new byte[1121];
		final byte[] ipOut5 = new byte[513];
		Ddi.ddi_innerkey_open();
		// N5S或者N6
		if (MainActivity.version.equalsIgnoreCase("7.1.2")) {
			int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, 15, puk, prk);
			if (res1 == 0) {
				myHandleDeal("SM2更新密钥成功update25", res1);
				int res2 = Ddi.ddi_innerkey_nes_sm2_encrypt(15, pn, pn.length, ipOut4, leOut);
				if (res2 == -6) {
					myHandleDeal("SM2公钥加密成功update25", res2);
					int res3 = Ddi.ddi_innerkey_nes_sm2_decrypt(15, ipOut4, ipOut4.length, ipOut5, leOut);
					String str = ByteUtils.byteArray2HexString(ipOut5);
					if (res3 == -6) {
						myHandleDeal("SM2私钥解密成功update25", res3);
						int res4 = Ddi.ddi_innerkey_nes_sm2_delete_key(15);
						if (res4 == 0) {
							myHandleDeal("SM2删除公私钥对成功update25", res4);
							int res5 = Ddi.ddi_innerkey_nes_sm2_encrypt(15, pn, pn.length, ipOut, leOut);
							if (res5 == -6) {
								myHandleDeal("SM2公钥加密测试成功update25", res5);
							} else {
								myHandleDeal("SM2update3公钥加密测试失败update25", res5);
							}
							int res6 = Ddi.ddi_innerkey_nes_sm2_decrypt(15, pn, pn.length, ipOut, leOut);
							if (res6 == -6) {
								myHandleDeal("SM2私钥解密测试成功update25", res6);
							} else {
								myHandleDeal("SM2update25私钥解密测试失败", res6);
							}
						} else {
							myHandleDeal("SM2update25测试失败", res4);
						}
					} else {
						myHandleDeal("SM2update25私钥解密失败", res3);
					}
				} else {
					myHandleDeal("SM2update25公钥加密失败", res2);
				}
			} else {
				myHandleDeal("SM2update25更新密钥失败", res1);
			}

		}
		// N5
		if (MainActivity.version.equalsIgnoreCase("5.1.1")) {
//	    	Log.v("TAG", "5.1.1");

			Runnable my = new Runnable() {
				public void run() {
					Ddi.ddi_innerkey_open();
					int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, 15, puk, prk);
					if (res1 == 0) {
						myHandleDeal("SM2更新密钥成功update25", res1);
						int res2 = Ddi.ddi_innerkey_nes_sm2_encrypt(15, pn, pn.length, ipOut4, leOut);
						if (res2 == 0) {
							myHandleDeal("SM2公钥加密成功update25", res2);
							int res3 = Ddi.ddi_innerkey_nes_sm2_decrypt(15, ipOut4, ipOut4.length, ipOut5, leOut);
							String str = ByteUtils.byteArray2HexString(ipOut5);
							if (res3 == -6) {
								myHandleDeal("SM2私钥解密成功update25", res3);
								int res4 = Ddi.ddi_innerkey_nes_sm2_delete_key(15);
								if (res4 == 0) {
									myHandleDeal("SM2删除公私钥对成功update25", res4);
									int res5 = Ddi.ddi_innerkey_nes_sm2_encrypt(15, pn, pn.length, ipOut, leOut);
									if (res5 == -6) {
										myHandleDeal("SM2公钥加密测试成功update25", res5);
									} else {
										myHandleDeal("SM2update3公钥加密测试失败update25", res5);
									}
									int res6 = Ddi.ddi_innerkey_nes_sm2_decrypt(15, pn, pn.length, ipOut, leOut);
									if (res6 == -6) {
										myHandleDeal("SM2私钥解密测试成功update25", res6);
									} else {
										myHandleDeal("SM2update25私钥解密测试失败", res6);
									}
								} else {
									myHandleDeal("SM2update25测试失败", res4);
								}
							} else {
								myHandleDeal("SM2update25私钥解密失败", res3);
							}
						} else {
							myHandleDeal("SM2update25公钥加密失败", res2);
						}
					} else {
						myHandleDeal("SM2update25更新密钥失败", res1);
					}
				}
			};
			Thread mThread = new Thread(my);
			mThread.start();

		}

		Ddi.ddi_innerkey_close();
	}

	// 索引超标
	private void testSM2update26() {
		myHandleDeal("testSM2update26测试", 0);
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey2);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey2);
		byte[] pn = ByteUtils.hexString2ByteArray(ParaEntity.dataString1025);
		byte[] ipOut4 = new byte[1121];
		byte[] ipOut5 = new byte[513];
		if (MainActivity.version.equalsIgnoreCase("7.1.2")||MainActivity.version.equalsIgnoreCase("9")) {

			Ddi.ddi_innerkey_open();
			int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, 15, puk, prk);
			if (res1 == 0) {
				myHandleDeal("SM2更新密钥成功update26", res1);
				int res2 = Ddi.ddi_innerkey_nes_sm2_encrypt(16, pn, pn.length, ipOut4, leOut);
				if (res2 == -6) {
					myHandleDeal("SM2公钥加密成功update26", res2);
					int res3 = Ddi.ddi_innerkey_nes_sm2_decrypt(-1, ipOut4, ipOut4.length, ipOut5, leOut);
					String str = ByteUtils.byteArray2HexString(ipOut5);
					if (res3 == -6) {
						myHandleDeal("SM2私钥解密成功update26", res3);
						int res4 = Ddi.ddi_innerkey_nes_sm2_delete_key(15);
						if (res4 == 0) {
							myHandleDeal("SM2删除公私钥对成功update26", res4);
							int res5 = Ddi.ddi_innerkey_nes_sm2_encrypt(15, pn, pn.length, ipOut, leOut);
							if (res5 == -6) {
								myHandleDeal("SM2公钥加密测试成功update26", res5);
							} else {
								myHandleDeal("SM2update3公钥加密测试失败update26", res5);
							}
							int res6 = Ddi.ddi_innerkey_nes_sm2_decrypt(15, pn, pn.length, ipOut, leOut);
							if (res6 == -6) {
								myHandleDeal("SM2私钥解密测试成功update26", res6);
							} else {
								myHandleDeal("SM2update26私钥解密测试失败", res6);
							}
						} else {
							myHandleDeal("SM2update26测试失败", res4);
						}
					} else {
						myHandleDeal("SM2update26私钥解密失败", res3);
					}
				} else {
					myHandleDeal("SM2update26公钥加密失败", res2);
				}
			} else {
				myHandleDeal("SM2update26更新密钥失败", res1);
			}

		}
		
		if (MainActivity.version.equalsIgnoreCase("5.1.1")) {
			Ddi.ddi_innerkey_open();
			int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, 15, puk, prk);
			if (res1 == 0) {
				myHandleDeal("SM2更新密钥成功update26", res1);
				int res2 = Ddi.ddi_innerkey_nes_sm2_encrypt(16, pn, pn.length, ipOut4, leOut);
				if (res2 == -1) {
					myHandleDeal("SM2公钥加密成功update26", res2);
					int res3 = Ddi.ddi_innerkey_nes_sm2_decrypt(-1, ipOut4, ipOut4.length, ipOut5, leOut);
					String str = ByteUtils.byteArray2HexString(ipOut5);
					if (res3 == -1) {
						myHandleDeal("SM2私钥解密成功update26", res3);
						int res4 = Ddi.ddi_innerkey_nes_sm2_delete_key(15);
						if (res4 == 0) {
							myHandleDeal("SM2删除公私钥对成功update26", res4);
							int res5 = Ddi.ddi_innerkey_nes_sm2_encrypt(15, pn, pn.length, ipOut, leOut);
							if (res5 == -1) {
								myHandleDeal("SM2公钥加密测试成功update26", res5);
							} else {
								myHandleDeal("SM2update3公钥加密测试失败update26", res5);
							}
							int res6 = Ddi.ddi_innerkey_nes_sm2_decrypt(15, pn, pn.length, ipOut, leOut);
							if (res6 == -1) {
								myHandleDeal("SM2私钥解密测试成功update26", res6);
							} else {
								myHandleDeal("SM2update26私钥解密测试失败", res6);
							}
						} else {
							myHandleDeal("SM2update26测试失败", res4);
						}
					} else {
						myHandleDeal("SM2update26私钥解密失败", res3);
					}
				} else {
					myHandleDeal("SM2update26公钥加密失败", res2);
				}
			} else {
				myHandleDeal("SM2update26更新密钥失败", res1);
			}

		}

		Ddi.ddi_innerkey_close();
	}

	private void testSM2update27() {
		myHandleDeal("testSM2update27测试", 0);
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey2);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey2);
		byte[] pn = ByteUtils.hexString2ByteArray(ParaEntity.dataString1025);
		byte[] ipOut4 = new byte[1121];
		byte[] ipOut5 = new byte[513];
		if (MainActivity.version.equalsIgnoreCase("7.1.2")|MainActivity.version.equalsIgnoreCase("9")) {
			for (int i = 0; i < 20; i++) {
				Ddi.ddi_innerkey_close();
			}
			int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, 15, puk, prk);
			if (res1 == -7 || res1 == 0) {
				myHandleDeal("SM2更新密钥成功update27", res1);
				int res2 = Ddi.ddi_innerkey_nes_sm2_encrypt(16, pn, pn.length, ipOut4, leOut);
				if (res2 == -6 || res2 == 0) {
					myHandleDeal("SM2公钥加密成功update27", res2);
					int res3 = Ddi.ddi_innerkey_nes_sm2_decrypt(-1, ipOut4, ipOut4.length, ipOut5, leOut);
					String str = ByteUtils.byteArray2HexString(ipOut5);
					if (res3 == -6 || res3 == 0) {
						myHandleDeal("SM2私钥解密成功update27", res3);
						int res4 = Ddi.ddi_innerkey_nes_sm2_delete_key(15);
						if (res4 == -7 || res4 == 0) {
							myHandleDeal("SM2删除公私钥对成功update27", res4);
							int res5 = Ddi.ddi_innerkey_nes_sm2_encrypt(15, pn, pn.length, ipOut, leOut);
							if (res5 == -6 || res5 == 0) {
								myHandleDeal("SM2公钥加密测试成功update27", res5);
							} else {
								myHandleDeal("SM2update3公钥加密测试失败update27", res5);
							}
							int res6 = Ddi.ddi_innerkey_nes_sm2_decrypt(15, pn, pn.length, ipOut, leOut);
							if (res6 == -6 || res6 == 0) {
								myHandleDeal("SM2私钥解密测试成功update27", res6);
							} else {
								myHandleDeal("SM2update27私钥解密测试失败", res6);
							}
						} else {
							myHandleDeal("SM2update27测试失败", res4);
						}
					} else {
						myHandleDeal("SM2update27私钥解密失败", res3);
					}
				} else {
					myHandleDeal("SM2update27公钥加密失败", res2);
				}
			} else {
				myHandleDeal("SM2update27更新密钥失败", res1);
			}

		}
		if (MainActivity.version.equalsIgnoreCase("5.1.1")) {
			for (int i = 0; i < 20; i++) {
				Ddi.ddi_innerkey_close();
			}
			int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, 15, puk, prk);
			if (res1 == -7 || res1 == 0) {
				myHandleDeal("SM2更新密钥成功update27", res1);
				int res2 = Ddi.ddi_innerkey_nes_sm2_encrypt(16, pn, pn.length, ipOut4, leOut);
				if (res2 == -7 || res2 == 0) {
					myHandleDeal("SM2公钥加密成功update27", res2);
					int res3 = Ddi.ddi_innerkey_nes_sm2_decrypt(-1, ipOut4, ipOut4.length, ipOut5, leOut);
					String str = ByteUtils.byteArray2HexString(ipOut5);
					if (res3 == -7 || res3 == 0) {
						myHandleDeal("SM2私钥解密成功update27", res3);
						int res4 = Ddi.ddi_innerkey_nes_sm2_delete_key(15);
						if (res4 == -7 || res4 == 0) {
							myHandleDeal("SM2删除公私钥对成功update27", res4);
							int res5 = Ddi.ddi_innerkey_nes_sm2_encrypt(15, pn, pn.length, ipOut, leOut);
							if (res5 == -7 || res5 == 0) {
								myHandleDeal("SM2公钥加密测试成功update27", res5);
							} else {
								myHandleDeal("SM2update3公钥加密测试失败update27", res5);
							}
							int res6 = Ddi.ddi_innerkey_nes_sm2_decrypt(15, pn, pn.length, ipOut, leOut);
							if (res6 == -7 || res6 == 0) {
								myHandleDeal("SM2私钥解密测试成功update27", res6);
							} else {
								myHandleDeal("SM2update27私钥解密测试失败", res6);
							}
						} else {
							myHandleDeal("SM2update27测试失败", res4);
						}
					} else {
						myHandleDeal("SM2update27私钥解密失败", res3);
					}
				} else {
					myHandleDeal("SM2update27公钥加密失败", res2);
				}
			} else {
				myHandleDeal("SM2update27更新密钥失败", res1);
			}

		}

		Ddi.ddi_innerkey_close();
	}

	// 控制内置秘钥接口检测SM2秘钥 只有公钥
	//
	private void testSM2update28() {
		myHandleDeal("testSM2update28测试", 0);
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey);
		byte[] pn = ByteUtils.hexString2ByteArray(ParaEntity.nkeyplain);
		byte[] ipOut4 = new byte[112];
		byte[] ipOut5 = new byte[16];
		for (int i = 0; i < 22; i++) {
			Ddi.ddi_innerkey_open();
		}
		int res4 = Ddi.ddi_innerkey_nes_sm2_delete_key(0);
		if (res4 == 0) {
			myHandleDeal("SM2删除公私钥对成功", res4);
		} else {
			myHandleDeal("SM2删除公私钥对失败", res4);
		}
		int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(0, 0, puk, prk);
		if (res1 == 0) {
			myHandleDeal("SM2更新密钥成功28", res1);
			
			int res2 = Ddi.ddi_innerkey_ioctl_sm2_key_check(0, 0);
			if (res2 == 0) {
				myHandleDeal("SM2公钥加密检测成功28", res2);
			} else {
				myHandleDeal("SM2公钥加密检测失败28", res2);
			}
		} else {
			myHandleDeal("SM2update28更新密钥失败28", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	// 控制内置秘钥接口检测SM2秘钥 只有私钥
	private void testSM2update29() {
		myHandleDeal("testSM2update29测试", 0);
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey);
		byte[] pn = ByteUtils.hexString2ByteArray(ParaEntity.nkeyplain);
		byte[] ipOut4 = new byte[112];
		byte[] ipOut5 = new byte[16];
		Ddi.ddi_innerkey_open();
		int res4 = Ddi.ddi_innerkey_nes_sm2_delete_key(5);
		if (res4 == 0) {
			myHandleDeal("SM2删除公私钥对成功", res4);
		} else {
			myHandleDeal("SM2删除公私钥对失败", res4);
		}
		int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(1, 5, puk, prk);
		if (res1 == 0) {
			myHandleDeal("SM2更新密钥成功29", res1);
			int res2 = Ddi.ddi_innerkey_ioctl_sm2_key_check(1, 5);
			if (res2 == 0) {
				myHandleDeal("SM2公钥加密检测成功29", res2);
			} else {
				myHandleDeal("SM2公钥加密检测失败29", res2);
			}
		} else {
			myHandleDeal("SM2update29更新密钥失败29", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	// 控制内置秘钥接口检测SM2秘钥 有公私钥
	private void testSM2update30() {
		myHandleDeal("testSM2update30测试", 0);
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey);
		byte[] pn = ByteUtils.hexString2ByteArray(ParaEntity.nkeyplain);
		byte[] ipOut4 = new byte[112];
		byte[] ipOut5 = new byte[16];
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, 15, puk, prk);
		if (res1 == 0) {
			myHandleDeal("SM2更新密钥成功30", res1);
			int res2 = Ddi.ddi_innerkey_ioctl_sm2_key_check(0, 15);
			int res3 = Ddi.ddi_innerkey_ioctl_sm2_key_check(1, 15);
			if (res2 == 0 && res3 == 0) {
				myHandleDeal("SM2公钥加密检测成功30", res2);
			} else {
				myHandleDeal("SM2公钥加密检测失败30", res2);
			}
		} else {
			myHandleDeal("SM2update1更新密钥失败30", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	// 控制内置秘钥接口检测SM2秘钥 有公私钥
	private void testSM2update31() {
		myHandleDeal("testSM2update31测试", 0);
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey);
		byte[] pn = ByteUtils.hexString2ByteArray(ParaEntity.nkeyplain);
		byte[] ipOut4 = new byte[112];
		byte[] ipOut5 = new byte[16];
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, 15, puk, prk);
		if (res1 == 0) {
			myHandleDeal("SM2更新密钥成功31", res1);
			int res2 = Ddi.ddi_innerkey_ioctl_sm2_key_check(0, 16);
			int res3 = Ddi.ddi_innerkey_ioctl_sm2_key_check(1, -1);
			if (res2 == -6 && res3 == -6) {
				myHandleDeal("SM2公钥加密检测成功31", res2);
			} else {
				myHandleDeal("SM2公钥加密检测失败31", res2);
			}
		} else {
			myHandleDeal("SM2update1更新密钥失败31", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testSM2update32() {
		myHandleDeal("testSM2update32测试", 0);
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey);
		byte[] pn = ByteUtils.hexString2ByteArray(ParaEntity.nkeyplain);
		byte[] ipOut4 = new byte[112];
		byte[] ipOut5 = new byte[16];
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_nes_sm2_delete_key(15);
		if (res1 == 0) {
			myHandleDeal("SM2删除成功32", res1);
			int res2 = Ddi.ddi_innerkey_ioctl_sm2_key_check(0, 15);
			int res3 = Ddi.ddi_innerkey_ioctl_sm2_key_check(1, 15);
			if (res2 == -1 && res3 == -1) {
				myHandleDeal("SM2公钥加密检测成功32", res2);
			} else {
				myHandleDeal("SM2公钥加密检测失败32", res2);
			}
		} else {
			myHandleDeal("SM2update1更新密钥失败32", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testSM2update33() {
		myHandleDeal("testSM2update33测试", 0);
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey);
		byte[] pn = ByteUtils.hexString2ByteArray(ParaEntity.nkeyplain);
		byte[] ipOut4 = new byte[112];
		byte[] ipOut5 = new byte[16];
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(4, 9, puk, prk);
		if (res1 == 0) {
			myHandleDeal("SM2更新密钥成功33", res1);
			int res2 = Ddi.ddi_innerkey_ioctl_sm2_key_check(1, 9);
			int res3 = Ddi.ddi_innerkey_ioctl_sm2_key_check(0, 9);
			if (res2 == 0 && res3 == 0) {
				myHandleDeal("SM2公钥加密检测成功33", res2);
			} else {
				myHandleDeal("SM2公钥加密检测失败33", res2);
			}
		} else {
			myHandleDeal("SM2update28更新密钥失败33", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testSM2update4() {
		myHandleDeal("testSM2update4测试", 0);
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey1);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey1);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, 16, puk, prk);
		if (res1 == -6) {
			myHandleDeal("SM2更新密钥测试成功", res1);
		} else {
			myHandleDeal("SM2update4更新密钥测试失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testSM2update5() {
		myHandleDeal("testSM2update5测试", 0);
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey1);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey1);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, -1, puk, prk);
		if (res1 == -6) {
			myHandleDeal("SM2更新密钥测试成功", res1);
		} else {
			myHandleDeal("SM2update5更新密钥测试失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testSM2update6() {
		myHandleDeal("testSM2update6测试", 0);
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, 0, puk, prk);
		if (res1 == 0) {
			myHandleDeal("SM2更新密钥成功", res1);
			int res2 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(0, 0, puk, prk);
			if (res2 == 0) {
				myHandleDeal("SM2更新公钥成功", res2);
				int res3 = Ddi.ddi_innerkey_nes_sm2_delete_key(0);
				if (res3 == 0) {
					myHandleDeal("SM2删除公私钥对成功", res3);
					int res4 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(0, 0, puk, prk);
					if (res4 == 0) {
						myHandleDeal("SM2更新公钥成功", res2);
					} else {
						myHandleDeal("SM2update6更新公钥失败", res2);
					}
				} else {
					myHandleDeal("SM2update6删除公私钥对失败", res3);
				}
			} else {
				myHandleDeal("SM2update6更新公钥失败", res2);
			}
		} else {
			myHandleDeal("SM2update6更新密钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testSM2update7() {
		myHandleDeal("testSM2update7测试", 0);
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, 0, puk, prk);
		if (res1 == 0) {
			myHandleDeal("SM2更新密钥成功", res1);
			int res2 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(1, 0, puk, prk);
			if (res2 == 0) {
				myHandleDeal("SM2更新私钥成功", res2);
			} else {
				myHandleDeal("SM2update7更新私钥失败", res2);
			}
		} else {
			myHandleDeal("SM2update7更新密钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testSM2update8() {
		myHandleDeal("testSM2update8测试", 0);
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkeyw);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(0, 0, puk, prk);
		if (res1 == -6) {
			myHandleDeal("SM2更新公钥成功", res1);
		} else {
			myHandleDeal("SM2update8更新公钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testSM2update9() {
		myHandleDeal("testSM2update9测试", 0);
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikeyw);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(1, 0, puk, prk);
		if (res1 == -6) {
			myHandleDeal("SM2更新私钥成功", res1);
		} else {
			myHandleDeal("SM2update9更新私钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testSM2update10() {
		myHandleDeal("testSM2update10测试", 0);
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_nes_sm2_delete_key(10);
		if (res1 == 0) {
			myHandleDeal("SM2删除公私钥对成功", res1);
			int res2 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(0, 10, puk, prk);
			if (res2 == 0) {
				myHandleDeal("SM2更新公钥成功", res2);
			} else {
				myHandleDeal("SM2update10更新公钥失败", res2);
			}
			int res3 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(0, 10, puk, prk);
			if (res3 == 0) {
				myHandleDeal("SM2更新公钥成功", res3);
			} else {
				myHandleDeal("SM2update10更新公钥失败", res3);
			}
		} else {
			myHandleDeal("SM2update10删除公私钥对失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testSM2update11() {
		myHandleDeal("testSM2update11测试", 0);
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_nes_sm2_delete_key(10);
		if (res1 == 0) {
			myHandleDeal("SM2删除公私钥对成功", res1);
			int res2 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(1, 10, puk, prk);
			if (res2 == 0) {
				myHandleDeal("SM2更新公钥成功", res2);
			} else {
				myHandleDeal("SM2update11更新公钥失败", res2);
			}
			int res3 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(1, 10, puk, prk);
			if (res3 == 0) {
				myHandleDeal("SM2更新公钥成功", res3);
			} else {
				myHandleDeal("SM2update11更新公钥失败", res3);
			}
		} else {
			myHandleDeal("SM2update11删除公私钥对失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testSM2update12() {
		myHandleDeal("testSM2update12测试", 0);
		byte[] puk = new byte[1];
		byte[] prk = new byte[1];
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(4, 6, puk, prk);
		if (res1 == 0) {
			myHandleDeal("SM2自动更新密钥成功", res1);
		} else {
			myHandleDeal("SM2update12自动更新密钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testSM2update13() {
		myHandleDeal("testSM2update13测试", 0);
		byte[] puk = new byte[112];
		byte[] prk = new byte[112];
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(4, 7, puk, prk);
		if (res1 == 0) {
			myHandleDeal("SM2自动更新密钥成功", res1);
		} else {
			myHandleDeal("SM2update13自动更新密钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testSM2update14() {
		myHandleDeal("testSM2update14测试", 0);
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(2, 10, puk, prk);
		if (res1 == -6) {
			myHandleDeal("SM2自动更新密钥测试成功", res1);
		} else {
			myHandleDeal("SM2update14自动更新密钥测试失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testSM2update15() {
		myHandleDeal("testSM2update15测试", 0);
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey3);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey3);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, 13, puk, prk);
		if (res1 == -1) {
			myHandleDeal("SM2更新密钥测试成功", res1);
		} else {
			myHandleDeal("SM2update15更新密钥测试失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testSM2update16() {
		myHandleDeal("testSM2update16测试", 0);
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey4);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey4);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, 11, puk, prk);
		if (res1 == -1) {
			myHandleDeal("SM2更新密钥测试成功", res1);
		} else {
			myHandleDeal("SM2update16更新密钥测试失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testSM2update17() {
		myHandleDeal("testSM2update17测试", 0);
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey1);
		Ddi.ddi_innerkey_open();
		Log.v("TAG", MainActivity.version);
		switch (MainActivity.version) {
		case "7.1.2":
//			Log.v("TAG", "1111");
			int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, 11, puk, prk);
			if (res1 == -6) {
				myHandleDeal(MainActivity.model + "SM2更新密钥测试成功", res1);
			} else {
				myHandleDeal(MainActivity.model + "SM2update17更新密钥测试失败", res1);
			}
			break;
		case "5.1.1":
			int res11 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, 11, puk, prk);
			if (res11 == -1) {
				myHandleDeal(MainActivity.model + "SM2更新密钥测试成功", res11);
			} else {
				myHandleDeal(MainActivity.model + "SM2update17更新密钥测试失败", res11);
			} 
			break;
		case "XgdOS1.0":
			int res111 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, 11, puk, prk);
			if (res111 == -6) {
				myHandleDeal(MainActivity.model + "SM2更新密钥测试成功", res111);
			} else {
				myHandleDeal(MainActivity.model + "SM2update17更新密钥测试失败", res111);
			}
			break;
		default:
			myHandleDeal(MainActivity.model + "SM2update17更新密钥测试失败没有匹配到测试版本", -99);
			break;
		}

		Ddi.ddi_innerkey_close();
	}

	private void testSM2update18() {
		myHandleDeal("testSM2update18测试", 0);
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey2);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey2);
		byte[] pn = ByteUtils.hexString2ByteArray("31");
		byte[] pn1 = ByteUtils.hexString2ByteArray(ParaEntity.dataString256);
		byte[] pn2 = ByteUtils.hexString2ByteArray(ParaEntity.dataString1024);
		byte[] pn3 = ByteUtils.hexString2ByteArray(ParaEntity.dataString2048);
		byte[] pn4 = ByteUtils.hexString2ByteArray(ParaEntity.dataString512);
		byte[] pn5 = ByteUtils.hexString2ByteArray(ParaEntity.dataString608);
//		byte[] ipOut4 = new byte[97];
//		byte[] ipOut5 = new byte[256];
//		byte[] ipOut6 = new byte[1024];
		byte[] ipOut7 = new byte[2048];
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, 15, puk, prk);
		if (res1 == 0) {
			myHandleDeal("SM2更新密钥成功", res1);
			int res2 = Ddi.ddi_innerkey_nes_sm2_encrypt(15, pn, pn.length, ipOut7, leOut);
			int res9 = Ddi.ddi_innerkey_nes_sm2_encrypt(15, pn1, pn1.length, ipOut7, leOut);
			int res10 = Ddi.ddi_innerkey_nes_sm2_encrypt(15, pn2, pn2.length, ipOut7, leOut);
			int res3 = Ddi.ddi_innerkey_nes_sm2_encrypt(15, pn3, pn3.length, ipOut7, leOut);
			int res4 = Ddi.ddi_innerkey_nes_sm2_encrypt(15, pn4, pn4.length, ipOut7, leOut);
//			int res0 = res2 + res3 + res4 + res9 + res10 ;
			if (res2==0&&res9==0&&res10==-6&&res3==-6&&res4==0) {
				myHandleDeal("SM2密钥加密成功", res2);
			}else {
				myHandleDeal("SM2密钥加密失败"+res2 + res3 + res4 + res9 + res10, res2);
			}
			int res5 = Ddi.ddi_innerkey_nes_sm2_decrypt(15, pn, pn.length, ipOut7, leOut);
			int res6 = Ddi.ddi_innerkey_nes_sm2_decrypt(15, pn2, pn2.length, ipOut7, leOut);
			int res7 = Ddi.ddi_innerkey_nes_sm2_decrypt(15, pn1, pn1.length, ipOut7, leOut);
			int res8 = Ddi.ddi_innerkey_nes_sm2_decrypt(15, pn3, pn3.length, ipOut7, leOut);
			int res11 = Ddi.ddi_innerkey_nes_sm2_decrypt(15, pn4, pn4.length, ipOut7, leOut);
			int res12 = Ddi.ddi_innerkey_nes_sm2_decrypt(15, pn5, pn5.length, ipOut7, leOut);
//			int res = res5 + res6 + res7 + res8 + res9;
			//因为协议的不同，所以无法进行res12无法进行解密成功
			
			
			if (res5 == -6&&res6 == -6&&res7 == -1&&res8 == -6&&res11 == -1&&res12== -1) {
				myHandleDeal("SM2公钥解密成功", res12);
			} else {
				myHandleDeal("SM2update18公钥解密失败" + res5 + res6 + res7 + res8 +res11+res12, res12);
			}
		} else {
			myHandleDeal("SM2update18更新密钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	// 更新公私钥对所有索引
	private void testSM2update19() {
		myHandleDeal("testSM2update19测试", 0);
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey);
		byte[] pn = ByteUtils.hexString2ByteArray(ParaEntity.nkeyplain);
		byte[] ipOut4 = new byte[112];
		byte[] ipOut5 = new byte[16];
		Ddi.ddi_innerkey_open();
		for (int i = 0; i < 16; i++) {

			int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, i, puk, prk);
			if (res1 == 0) {
				myHandleDeal("SM2update19更新公私钥成功" + i, res1);
			} else {
				myHandleDeal("SM2update19更新公私钥失败", res1);
			}

		}
		Ddi.ddi_innerkey_close();
	}

	private void testSM2update20() {
		myHandleDeal("testSM2update20测试", 0);
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey);
		byte[] pn = ByteUtils.hexString2ByteArray(ParaEntity.nkeyplain);
		byte[] ipOut4 = new byte[112];
		byte[] ipOut5 = new byte[16];
		Ddi.ddi_innerkey_open();
		for (int i = 0; i < 16; i++) {

			int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(0, i, puk, prk);
			if (res1 == 0) {
				myHandleDeal("SM2update20更新公私钥成功" + i, res1);

			} else {
				myHandleDeal("SM2update20更新公钥失败", res1);
			}

		}
		Ddi.ddi_innerkey_close();
	}

	private void testSM2update21() {
		myHandleDeal("testSM2update21测试", 0);
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey);
		byte[] pn = ByteUtils.hexString2ByteArray(ParaEntity.nkeyplain);
		byte[] ipOut4 = new byte[112];
		byte[] ipOut5 = new byte[16];
		Ddi.ddi_innerkey_open();
		for (int i = 0; i < 16; i++) {

			int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(1, i, puk, prk);
			if (res1 == 0) {
				myHandleDeal("SM2update21更新公私钥成功" + i, res1);

			} else {
				myHandleDeal("SM2update20更新公钥失败", res1);
			}

		}
		Ddi.ddi_innerkey_close();
	}

	private void testSM2update22() {
		myHandleDeal("testSM2update22测试", 0);
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey);
		byte[] pn = ByteUtils.hexString2ByteArray(ParaEntity.nkeyplain);
		byte[] ipOut4 = new byte[112];
		byte[] ipOut5 = new byte[16];
		Ddi.ddi_innerkey_open();
		for (int i = 0; i < 16; i++) {

			int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(4, i, puk, prk);
			if (res1 == 0) {
				myHandleDeal("SM2update22更新公私钥成功" + i, res1);

			} else {
				myHandleDeal("SM2update20更新公钥失败", res1);
			}

		}
		Ddi.ddi_innerkey_close();
	}

	private void testSM2sign1() {
		myHandleDeal("testSM2sign1测试", 0);
		String data = "9773036f01aac4753b2b740ad889994c4ab40456cdf772e9c87fdcc441bc7378467d675de6b47b9821cab63380ac3d45206a847dc4e3fc2f4ecd0226b149851f";
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey);

		byte[] id = ByteUtils.hexString2ByteArray(ParaEntity.ID);
		byte[] pn = ByteUtils.hexString2ByteArray(ParaEntity.pn);
		byte[] ipOut4 = new byte[64];
		byte[] ipOut5 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
//		Ddi.ddi_innerkey_close();
//		Ddi.ddi_innerkey_close();
//		Ddi.ddi_innerkey_close();
//		Ddi.ddi_innerkey_close();
		
		int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, 0, puk, prk);
		if (res1 == 0) {
			myHandleDeal("SM2更新密钥成功", res1);
			int res2 = Ddi.ddi_innerkey_nes_sm2_sign(0, id, id.length, pn, pn.length, ipOut4);
			if (res2 == 0) {
				myHandleDeal("SM2签名成功", res2);
				int res3 = Ddi.ddi_innerkey_nes_sm2_verify(0, id, id.length, pn, pn.length, ipOut5);
				if (res3 == 0) {
					myHandleDeal("SM2验签成功", res3);
				} else {
					myHandleDeal("SM2sign1验签失败", res3);
				}
			} else {
				myHandleDeal("SM2sign1签名失败", res2);
			}
		} else {
			myHandleDeal("SM2sign1更新密钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testSM2sign2() {
		myHandleDeal("testSM2sign2测试", 0);
		String data = "b437e5ee8844bd03b8c921ab4375e1ead1279292849c5d2402b1e4bd9b48510bedcb12414c7471a06472835c2386c173f8246fe04a8112547a37380381093ee8";
		//
		// String data1 =
		// "53D6C890FB345C2B729A60DC7C29B4D1443EF308753C76C9103A423AA3A1355157CDB422F2BFF4F1FF50873CDC2A9361D7441FE273E59459CDC50A1ECE3C1C0A";
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey);
		byte[] id = ByteUtils.hexString2ByteArray(
				"31323334353637383132333435363738F1822030332882220987123273848292038474922838372923733011122938786352429104857384636282939382028374643837384938373736383728228737383837377327282929283839299283928283383838383838383837372827262626637363637376372828373733837380");
		byte[] pn = ByteUtils.hexString2ByteArray(ParaEntity.pn);
		byte[] ipOut4 = new byte[64];
		byte[] ipOut5 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, 0, puk, prk);
		if (res1 == 0) {
			myHandleDeal("SM2更新密钥成功", res1);
			int res2 = Ddi.ddi_innerkey_nes_sm2_sign(0, id, id.length, pn, pn.length, ipOut4);
			if (res2 == 0) {
				myHandleDeal("SM2签名成功", res2);
				int res3 = Ddi.ddi_innerkey_nes_sm2_verify(0, id, id.length, pn, pn.length, ipOut4);
				if (res3 == 0) {
					myHandleDeal("SM2验签成功", res3);
				} else {
					myHandleDeal("SM2sign2验签失败", res3);
				}
			} else {
				myHandleDeal("SM2sign2签名失败", res2);
			}
		} else {
			myHandleDeal("SM2sign2更新密钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testSM2sign3() {
		myHandleDeal("testSM2sign3测试", 0);
		String data = "9773036f01aac4753b2b740ad889994c4ab40456cdf772e9c87fdcc441bc7378467d675de6b47b9821cab63380ac3d45206a847dc4e3fc2f4ecd0226b149851f";
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey);
		byte[] id = ByteUtils.hexString2ByteArray("31323334353637383132333435363737");
		byte[] pn = ByteUtils.hexString2ByteArray(ParaEntity.pn);
		byte[] ipOut4 = new byte[64];
		byte[] ipOut5 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, 0, puk, prk);
		if (res1 == 0) {
			myHandleDeal("SM2更新密钥成功", res1);
			int res2 = Ddi.ddi_innerkey_nes_sm2_sign(0, id, id.length, pn, pn.length, ipOut4);
			if (res2 == 0) {
//				String byteArray2HexString = ByteUtils.byteArray2HexString(ipOut4);
				myHandleDeal("SM2签名成功", res2);
				// Log.v("111", byteArray2HexString);
				int res3 = Ddi.ddi_innerkey_nes_sm2_verify(0, id, id.length, pn, pn.length, ipOut5);
				if (res3 == -1) {
					myHandleDeal("SM2验签测试成功", res3);
				} else {
					myHandleDeal("SM2sign3验签测试失败", res3);
				}
			} else {
				myHandleDeal("SM2sign3签名失败", res2);
			}
		} else {
			myHandleDeal("SM2sign3更新密钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testSM2sign4() {
		myHandleDeal("testSM2sign4测试", 0);
		String data = "9773036f01aac4753b2b740ad889994c4ab40456cdf772e9c87fdcc441bc7378467d675de6b47b9821cab63380ac3d45206a847dc4e3fc2f4ecd0226b149851f";
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey1);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey1);
		byte[] id = ByteUtils.hexString2ByteArray(ParaEntity.ID);
		byte[] pn = ByteUtils.hexString2ByteArray(ParaEntity.pn);
		byte[] ipOut4 = new byte[64];
		byte[] ipOut5 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, 8, puk, prk);
		if (res1 == 0) {
			myHandleDeal("SM2更新密钥成功", res1);
			int res2 = Ddi.ddi_innerkey_nes_sm2_sign(8, id, id.length, pn, pn.length, ipOut4);
			if (res2 == 0) {
				myHandleDeal("SM2签名成功", res2);
				int res3 = Ddi.ddi_innerkey_nes_sm2_verify(8, id, id.length, pn, pn.length, ipOut5);
				if (res3 == -1) {
					myHandleDeal("SM2验签测试成功", res3);
				} else {
					myHandleDeal("SM2sign4验签测试失败", res3);
				}
			} else {
				myHandleDeal("SM2sign4签名失败", res2);
			}
		} else {
			myHandleDeal("SM2sign4更新密钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testSM2sign5() {
		myHandleDeal("testSM2sign5测试", 0);
		String data = "9773036f01aac4753b2b740ad889994c4ab40456cdf772e9c87fdcc441bc7378467d675de6b47b9821cab63380ac3d45206a847dc4e3fc2f4ecd0226b149851f";
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey1);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey1);
		byte[] id = ByteUtils.hexString2ByteArray(ParaEntity.ID);
		byte[] pn = ByteUtils.hexString2ByteArray(ParaEntity.pn1);
		byte[] ipOut4 = new byte[64];
		byte[] ipOut5 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, 0, puk, prk);
		if (res1 == 0) {
			myHandleDeal("SM2更新密钥成功", res1);
			int res2 = Ddi.ddi_innerkey_nes_sm2_sign(0, id, id.length, pn, pn.length, ipOut4);
			if (res2 == 0) {
				myHandleDeal("SM2签名成功", res2);
				int res3 = Ddi.ddi_innerkey_nes_sm2_verify(0, id, id.length, pn, pn.length, ipOut5);
				if (res3 == -1) {
					myHandleDeal("SM2验签测试成功", res3);
				} else {
					myHandleDeal("SM2sign5验签测试失败", res3);
				}
			} else {
				myHandleDeal("SM2sign5签名失败", res2);
			}
		} else {
			myHandleDeal("SM2sign5更新密钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testSM2sign6() {
		myHandleDeal("testSM2sign6测试", 0);
		String data = "9773036f01aac4753b2b740ad889994c4ab40456cdf772e9c87fdcc441bc7377467d675de6b47b9821cab63380ac3d45206a847dc4e3fc2f4ecd0226b149851f";
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey1);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey1);
		byte[] id = ByteUtils.hexString2ByteArray(ParaEntity.ID);
		byte[] pn = ByteUtils.hexString2ByteArray(ParaEntity.pn1);
		byte[] ipOut4 = new byte[64];
		byte[] ipOut5 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, 0, puk, prk);
		if (res1 == 0) {
			myHandleDeal("SM2更新密钥成功", res1);
			int res2 = Ddi.ddi_innerkey_nes_sm2_sign(0, id, id.length, pn, pn.length, ipOut4);
			if (res2 == 0) {
				myHandleDeal("SM2签名成功", res2);
				int res3 = Ddi.ddi_innerkey_nes_sm2_verify(0, id, id.length, pn, pn.length, ipOut5);
				if (res3 == -1) {
					myHandleDeal("SM2验签测试成功", res3);
				} else {
					myHandleDeal("SM2sign6验签测试失败", res3);
				}
			} else {
				myHandleDeal("SM2sign6签名失败", res2);
			}
		} else {
			myHandleDeal("SM2sign6更新密钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testSM2sign7() {
		myHandleDeal("testSM2sign7测试", 0);
		String data = "9773036f01aac4753b2b740ad889994c4ab40456cdf772e9c87fdcc441bc7378467d675de6b47b9821cab63380ac3d45206a847dc4e3fc2f4ecd0226b149851e";
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey1);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey1);
		byte[] id = ByteUtils.hexString2ByteArray(ParaEntity.ID);
		byte[] pn = ByteUtils.hexString2ByteArray(ParaEntity.pn1);
		byte[] ipOut4 = new byte[64];
		byte[] ipOut5 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, 0, puk, prk);
		if (res1 == 0) {
			myHandleDeal("SM2更新密钥成功", res1);
			int res2 = Ddi.ddi_innerkey_nes_sm2_sign(0, id, id.length, pn, pn.length, ipOut4);
			if (res2 == 0) {
				myHandleDeal("SM2签名成功", res2);
				int res3 = Ddi.ddi_innerkey_nes_sm2_verify(0, id, id.length, pn, pn.length, ipOut5);
				if (res3 == -1) {
					myHandleDeal("SM2验签测试成功", res3);
				} else {
					myHandleDeal("SM2sign7验签测试失败", res3);
				}
			} else {
				myHandleDeal("SM2sign7签名失败", res2);
			}
		} else {
			myHandleDeal("SM2sign7更新密钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	/*
	 * 真实数据
	 */
	private void testSM2sign8() {
		myHandleDeal("testSM2sign8测试", 0);
		String pubkey = "E3B4D4845DC02CAB458459D4145DE11B0612AC2CA2A2E7832A05E23A1166E0A17090C10A87F494C8AA90AD74AF20A7B58D6A3A9A8A1E06B5DF6BDDEC7A03715E";
		String prikey = "";
		String plain = "A1912C499C9174493A9CA3502CA8A5DD7316997EC5D406FED8C9C98577CD9FE12747C1D7E81580E519857CC00A3F178012775245829F575E37846D342E6E26F6";
		String data = "26025D0E0D98CD287983B2237FB20878F8FE95378812EA70D259B4998347B007D0DC7FBCEA13DC8A102D495F28CB4C40057B547DAE24A4C25B2A94F56136B7F0";
		byte[] puk = ByteUtils.hexString2ByteArray(pubkey);
		byte[] prk = ByteUtils.hexString2ByteArray(prikey);
		byte[] pn = ByteUtils.hexString2ByteArray(plain);
		byte[] id = ByteUtils.string2ASCIIByteArray("TOPS");
		byte[] ipOut5 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_nes_sm2_delete_key(5);
		if (res1 == 0) {
			myHandleDeal("SM2删除密钥成功", res1);
			int res2 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(0, 5, puk, prk);
			if (res2 == 0) {
				myHandleDeal("SM2更新密钥成功", res2);
				int res3 = Ddi.ddi_innerkey_nes_sm2_verify(5, id, id.length, pn, pn.length, ipOut5);
				if (res3 == 0) {
					myHandleDeal("SM2验签测试成功", res3);
				} else {
					myHandleDeal("SM2sign8验签测试失败", res3);
				}
			} else {
				myHandleDeal("SM2sign8更新密钥失败", res2);
			}
		} else {
			myHandleDeal("SM2sign8删除密钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testSM2sign9() {
		myHandleDeal("testSM2sign9测试", 0);
		String pubkey = "E3B4D4845DC02CAB458459D4145DE11B0612AC2CA2A2E7832A05E23A1166E0A17090C10A87F494C8AA90AD74AF20A7B58D6A3A9A8A1E06B5DF6BDDEC7A03715E";
		String prikey = "";
		String plain = "A1912C499C9174493A9CA3502CA8A5DD7316997EC5D406FED8C9C98577CD9FE12747C1D7E81580E519857CC00A3F178012775245829F575E37846D342E6E26F6";
		String data = "26025D0E0D98CD287983B2237FB20878F8FE95378812EA70D259B4998347B007D0DC7FBCEA13DC8A102D495F28CB4C40057B547DAE24A4C25B2A94F56136B7F0";
		byte[] puk = ByteUtils.hexString2ByteArray(pubkey);
		byte[] prk = ByteUtils.hexString2ByteArray(prikey);
		byte[] pn = ByteUtils.hexString2ByteArray(plain);
		byte[] id = ByteUtils.string2ASCIIByteArray("TOPS");
		byte[] ipOut5 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_nes_sm2_delete_key(5);
		if (res1 == 0) {
			myHandleDeal("SM2删除密钥成功", res1);
			int res6 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(0, 5, puk, prk);
			myHandleDeal("SM2删除密钥成功" + res6, 0);
			long begin = System.currentTimeMillis();
			for (int i = 0; i < 100; i++) {
				int res2 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(0, 5, puk, prk);
			}
			long end = System.currentTimeMillis();
			long current = end - begin;
			myHandleDeal("SM2更新公钥用时" + current, 0);

		} else {
			myHandleDeal("SM2sign8删除密钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testSM2sign10() {
		myHandleDeal("testSM2sign10测试", 0);
		String pubkey = "E3B4D4845DC02CAB458459D4145DE11B0612AC2CA2A2E7832A05E23A1166E0A17090C10A87F494C8AA90AD74AF20A7B58D6A3A9A8A1E06B5DF6BDDEC7A03715E";
		String prikey = "";
		String plain = "A1912C499C9174493A9CA3502CA8A5DD7316997EC5D406FED8C9C98577CD9FE12747C1D7E81580E519857CC00A3F178012775245829F575E37846D342E6E26F6";
		String data = "26025D0E0D98CD287983B2237FB20878F8FE95378812EA70D259B4998347B007D0DC7FBCEA13DC8A102D495F28CB4C40057B547DAE24A4C25B2A94F56136B7F0";
		byte[] puk = ByteUtils.hexString2ByteArray(pubkey);
		byte[] prk = ByteUtils.hexString2ByteArray(prikey);
		byte[] pn = ByteUtils.hexString2ByteArray(plain);
		byte[] id = ByteUtils.string2ASCIIByteArray("TOPS");
		byte[] ipOut5 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_nes_sm2_delete_key(5);
		if (res1 == 0) {
			myHandleDeal("SM2sign10删除密钥成功", res1);
			int res2 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(0, 5, puk, prk);
			if (res2 == 0) {
				myHandleDeal("SM2sign10更新公钥成功", res2);

				int res6 = Ddi.ddi_innerkey_nes_sm2_verify(5, id, id.length, pn, pn.length, ipOut5);
				myHandleDeal("SM2sign10更新公钥成功" + res6, 0);
				long begin = System.currentTimeMillis();
				for (int i = 0; i < 100; i++) {
					int res3 = Ddi.ddi_innerkey_nes_sm2_verify(5, id, id.length, pn, pn.length, ipOut5);
				}
				long end = System.currentTimeMillis();
				long current = end - begin;
				myHandleDeal("SM2sign10更新公钥验签时间为" + current, 0);
			} else {
				myHandleDeal("SM2sign10更新密钥失败", res2);
			}
		} else {
			myHandleDeal("SM2sign10删除密钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testSM2sign11() {
		myHandleDeal("testSM2sign11测试", 0);
		String data = "9773036f01aac4753b2b740ad889994c4ab40456cdf772e9c87fdcc441bc7378467d675de6b47b9821cab63380ac3d45206a847dc4e3fc2f4ecd0226b149851f";
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey);
		byte[] id = ByteUtils.hexString2ByteArray(ParaEntity.ID);
		byte[] pn = ByteUtils.hexString2ByteArray(ParaEntity.pn);
		byte[] ipOut4 = new byte[64];
		byte[] ipOut5 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res = Ddi.ddi_innerkey_nes_sm2_delete_key(0);
		if (res == 0) {
			myHandleDeal("SM2删除秘钥成功", res);
			int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(1, 0, puk, prk);
			if (res1 == 0) {
				myHandleDeal("SM2更新公钥成功", res1);
				int res2 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(0, 0, puk, prk);
				if (res2 == 0) {
					myHandleDeal("SM2更新私钥成功11", res2);
				} else {
					myHandleDeal("SM2sign1更新私钥失败11", res2);
				}
			} else {
				myHandleDeal("SM2更新公钥失败11", res1);
			}
			Ddi.ddi_innerkey_close();

		} else {
			myHandleDeal("SM2删除秘钥失败", res);

		}

	}

	private void testSM2sign12() {
		myHandleDeal("testSM2sign12测试", 0);
		String data = "9773036f01aac4753b2b740ad889994c4ab40456cdf772e9c87fdcc441bc7378467d675de6b47b9821cab63380ac3d45206a847dc4e3fc2f4ecd0226b149851f";
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey);

		byte[] id = ByteUtils.hexString2ByteArray(ParaEntity.ID);
		byte[] pn = ByteUtils.hexString2ByteArray(ParaEntity.pn);
		byte[] ipOut4 = new byte[64];
		byte[] ipOut5 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res = Ddi.ddi_innerkey_nes_sm2_delete_key(0);
		if (res == 0) {
			myHandleDeal("SM2删除秘钥成功", res);
			int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(0, 0, puk, prk);
			if (res1 == 0) {
				myHandleDeal("SM2更新公钥成功", res1);
				int res2 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(1, 0, puk, prk);
				if (res2 == 0) {
					myHandleDeal("SM2更新私钥成功", res2);
				} else {
					myHandleDeal("SM2sign1更新私钥失败12", res2);
				}
			} else {
				myHandleDeal("SM2更新公钥失败12", res1);
			}
			Ddi.ddi_innerkey_close();

		} else {
			myHandleDeal("SM2删除秘钥失败", res);

		}

	}

	private void testSM2sign13() {
		myHandleDeal("testSM2sign13测试", 0);
		String data = "b437e5ee8844bd03b8c921ab4375e1ead1279292849c5d2402b1e4bd9b48510bedcb12414c7471a06472835c2386c173f8246fe04a8112547a37380381093ee8";
		//
		// String data1 =
		// "53D6C890FB345C2B729A60DC7C29B4D1443EF308753C76C9103A423AA3A1355157CDB422F2BFF4F1FF50873CDC2A9361D7441FE273E59459CDC50A1ECE3C1C0A";
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey);
		byte[] id = ByteUtils.hexString2ByteArray(
				"31323334353637383132333435363738F1822030332882220987123273848292038474922838372923733011122938786352429104857384636282939382028374643837384938373736383728228737383837377327282929283839299283928283383838383838383837372827262626637363637376372828373733837380");
		byte[] pn = ByteUtils.hexString2ByteArray(ParaEntity.pn);
		byte[] ipOut4 = new byte[64];
		byte[] ipOut5 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, 0, puk, prk);
		if (res1 == 0) {
			myHandleDeal("SM2sign2更新密钥成功", res1);
			long begin = System.currentTimeMillis();
			for (int i = 0; i < 100; i++) {
				int res2 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, 0, puk, prk);
			}
			long end = System.currentTimeMillis();
			long current = end - begin;
			myHandleDeal("SM2sign14更新公钥验签时间为" + current, 0);
		} else {
			myHandleDeal("SM2sign2更新密钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	// 签名和验签100次速度测试
	private void testSM2sign14() {
		myHandleDeal("testSM2sign14测试", 0);
		String data = "b437e5ee8844bd03b8c921ab4375e1ead1279292849c5d2402b1e4bd9b48510bedcb12414c7471a06472835c2386c173f8246fe04a8112547a37380381093ee8";
		//
		// String data1 =
		// "53D6C890FB345C2B729A60DC7C29B4D1443EF308753C76C9103A423AA3A1355157CDB422F2BFF4F1FF50873CDC2A9361D7441FE273E59459CDC50A1ECE3C1C0A";
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey);
		byte[] id = ByteUtils.hexString2ByteArray(
				"31323334353637383132333435363738F1822030332882220987123273848292038474922838372923733011122938786352429104857384636282939382028374643837384938373736383728228737383837377327282929283839299283928283383838383838383837372827262626637363637376372828373733837380");
		byte[] pn = ByteUtils.hexString2ByteArray(ParaEntity.pn);
		byte[] ipOut4 = new byte[64];
		byte[] ipOut5 = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, 0, puk, prk);
		if (res1 == 0) {
			myHandleDeal("SM2更新密钥成功", res1);
			int res2 = Ddi.ddi_innerkey_nes_sm2_sign(0, id, id.length, pn, pn.length, ipOut4);
			if (res2 == 0) {
				myHandleDeal("SM2签名成功", res2);
				int res3 = Ddi.ddi_innerkey_nes_sm2_verify(0, id, id.length, pn, pn.length, ipOut4);
				if (res3 == 0) {
					myHandleDeal("SM2验签成功" + res2 + res3, res3);
					long begin = System.currentTimeMillis();
					for (int i = 0; i < 100; i++) {
						int res6 = Ddi.ddi_innerkey_nes_sm2_sign(0, id, id.length, pn, pn.length, ipOut4);
						int res7 = Ddi.ddi_innerkey_nes_sm2_verify(0, id, id.length, pn, pn.length, ipOut4);
					}
					long end = System.currentTimeMillis();
					long current = end - begin;
					myHandleDeal("SM2sign14更新公钥验签时间为" + current, 0);
				} else {
					myHandleDeal("SM2sign14验签失败", res3);
				}
			} else {
				myHandleDeal("SM2sign14签名失败", res2);
			}
		} else {
			myHandleDeal("SM2sign14更新密钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testsm3hash1() {
		myHandleDeal("testsm3hash1测试", 0);
		// 0123456789abcdefabcdef0123456aaaaffffaaafffbbbdddeeedddf0123456789abcdefabcdef0123456aaaaffffaaafffbbbdddeeedddf0123456789abcdefabcdef0123456aaaaffffaaafffbbbdddeeedddf0123456789abcdefabcdef0123456aaaaffffaaafffbbbdddeeedddf0123456789abcdefabcdef0123456aaaaffffaaafffbbbdddeeedddf
		byte[] mg = ByteUtils.hexString2ByteArray(ParaEntity.nkeymsg);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_nes_sm3_hash((byte) 0, mg, mg.length, ipOut2);
		String data = ByteUtils.byteArray2HexString(ipOut2);
//		Log.v("1111", data);
		if (res1 == 0 && data.equals(ParaEntity.nkeyhash)) {
			myHandleDeal("SM3 分包杂凑成功", res1);
		} else {
			myHandleDeal("sm3hash1 分包杂凑失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testsm3hash2() {
		myHandleDeal("testsm3hash2测试", 0);
		byte[] mg = ByteUtils.hexString2ByteArray(ParaEntity.nkeyhashtest);
		Ddi.ddi_innerkey_open();
		Ddi.ddi_innerkey_nes_sm2_delete_key(10);
		int res1 = Ddi.ddi_innerkey_nes_sm3_hash((byte) 0x10, mg, mg.length, ipOut2);
		String data = ByteUtils.byteArray2HexString(ipOut2);
//		Log.v("1111", data);
		if (res1 == -6) {
			myHandleDeal("SM3 分包杂凑测试成功", res1);
		} else {
			myHandleDeal("sm3hash2 分包杂凑测试失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	// SM3分包杂凑 中间包是包括 每一个包都是64字节128个字符，如果剩下的就放在最后包，只有最后一包才会计算结果其他都不会计算
	private void testsm3hash3() {
		myHandleDeal("testsm3hash3测试", 0);
		byte[] mg1 = ByteUtils.hexString2ByteArray(ParaEntity.nkeyhashtest1);
		byte[] mg2 = ByteUtils.hexString2ByteArray(ParaEntity.nkeyhashtest6);
//		byte[] mg3 = ByteUtils.hexString2ByteArray(ParaEntity.nkeyhashtest3);
//		byte[] mg4 = ByteUtils.hexString2ByteArray(ParaEntity.nkeyhashtest4);
		byte[] mg5 = ByteUtils.hexString2ByteArray(ParaEntity.nkeyhashtest5);
//		Log.v("costtime","mg1...."+ ParaEntity.nkeyhashtest1);
//		Log.v("costtime","mg2...."+ ParaEntity.nkeyhashtest2);
//		Log.v("costtime","mg3...."+ ParaEntity.nkeyhashtest3);
//		Log.v("costtime","mg2...."+ ParaEntity.nkeyhashtest6);
//		Log.v("costtime","mg5...."+ ParaEntity.nkeyhashtest5);
//	    ipOut3 = new byte[128];
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_nes_sm3_hash((byte) 1, mg1, mg1.length, ipOut2);
		// String data1 = ByteUtils.byteArray2HexString(ipOut2);
//		System.arraycopy(ipOut2, 0, name, 0,ipOut2.length );
//		String data1 = ByteUtils.byteArray2HexString(name);
//		Log.v("costtime","name1..."+data1);

		int res2 = Ddi.ddi_innerkey_nes_sm3_hash((byte) 2, mg2, mg2.length, ipOut2);
		// String data2 = ByteUtils.byteArray2HexString(ipOut2);
//		System.arraycopy(ipOut2, 0, name, ipOut2.length,ipOut2.length );

//		int res3 =  Ddi.ddi_innerkey_nes_sm3_hash((byte)2,mg3,mg3.length,ipOut2);
//		int res4 =  Ddi.ddi_innerkey_nes_sm3_hash((byte)2,mg4,mg4.length,ipOut2);
		// String data3 = ByteUtils.byteArray2HexString(ipOut2);

		int res5 = Ddi.ddi_innerkey_nes_sm3_hash((byte) 3, mg5, mg5.length, ipOut2);
//		System.arraycopy(ipOut2, 0, name, ipOut2.length+ipOut2.length+ipOut2.length,ipOut2.length );
//		Log.v("costtime","mg4...."+name);
		myHandleDeal("SM3 分包最后包杂凑成功" + res2 + res1, 0);
		String data = ByteUtils.byteArray2HexString(ipOut2);
//		myHandleDeal("SM3 分包最后包杂凑成功"+data+res4+res3+res2+res1,0);
		// myHandleDeal("SM3 分包最后包杂凑成功"+data2,0);
//		Log.v("1111", data);
		if (res1 == 0 && res2 == 0 && data.equals(ParaEntity.nkeyhash)) {
			myHandleDeal("SM3 分包最后包杂凑成功" + data, res1);
		} else {
			myHandleDeal("sm3hash3 分包杂凑失败" + data, res1);
		}
		Ddi.ddi_innerkey_close();
	}

	// 没有中间包，只有最开始一包和最后一包
	private void testsm3hash4() {
		myHandleDeal("testsm3hash4测试", 0);
		byte[] mg1 = ByteUtils.hexString2ByteArray(ParaEntity.nkeyhashtest2);
//		byte[] mg2 = ByteUtils.hexString2ByteArray(ParaEntity.nkeyhashtest2);
//		byte[] mg3 = ByteUtils.hexString2ByteArray(ParaEntity.nkeyhashtest3);
//		byte[] mg4 = ByteUtils.hexString2ByteArray(ParaEntity.nkeyhashtest4);
		byte[] mg5 = ByteUtils.hexString2ByteArray(ParaEntity.nkeyhashtest3);
//		Log.v("costtime","mg1...."+ ParaEntity.nkeyhashtest2);
//		Log.v("costtime","mg2...."+ ParaEntity.nkeyhashtest2);
//		Log.v("costtime","mg3...."+ ParaEntity.nkeyhashtest3);
//		Log.v("costtime","mg4...."+ ParaEntity.nkeyhashtest3);
//		Log.v("costtime","mg5...."+ ParaEntity.nkeyhashtest5);
//	    ipOut3 = new byte[128];
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_nes_sm3_hash((byte) 1, mg1, mg1.length, ipOut2);
		// String data1 = ByteUtils.byteArray2HexString(ipOut2);
//		System.arraycopy(ipOut2, 0, name, 0,ipOut2.length );
//		String data1 = ByteUtils.byteArray2HexString(name);
//		Log.v("costtime","name1..."+data1);

//		int res2 =  Ddi.ddi_innerkey_nes_sm3_hash((byte)2,mg2,mg2.length,ipOut2);
		// String data2 = ByteUtils.byteArray2HexString(ipOut2);
//		System.arraycopy(ipOut2, 0, name, ipOut2.length,ipOut2.length );

//		int res3 =  Ddi.ddi_innerkey_nes_sm3_hash((byte)2,mg3,mg3.length,ipOut2);
//		int res4 =  Ddi.ddi_innerkey_nes_sm3_hash((byte)2,mg4,mg4.length,ipOut2);
		// String data3 = ByteUtils.byteArray2HexString(ipOut2);

		int res5 = Ddi.ddi_innerkey_nes_sm3_hash((byte) 3, mg5, mg5.length, ipOut2);
//		System.arraycopy(ipOut2, 0, name, ipOut2.length+ipOut2.length+ipOut2.length,ipOut2.length );
//		Log.v("costtime","mg4...."+name);
		myHandleDeal("SM3 分包最后包杂凑成功hash4" + res1, 0);
		String data = ByteUtils.byteArray2HexString(ipOut2);
//		myHandleDeal("SM3 分包最后包杂凑成功"+data+res4+res3+res2+res1,0);
		// myHandleDeal("SM3 分包最后包杂凑成功"+data2,0);
//		Log.v("1111", data);
		if (res1 == 0 && data.equalsIgnoreCase(ParaEntity.nkeyhash1)) {
			myHandleDeal("SM3 分包最后包杂凑成功hash4" + data, res1);
		} else {
			myHandleDeal("sm3hash3 分包杂凑失败hash4" + data, res1);
		}
		Ddi.ddi_innerkey_close();
	}

	// hash数据大于64字节
	private void testsm3hash5() {
		myHandleDeal("testsm3hash5测试", 0);
		byte[] mg1 = ByteUtils.hexString2ByteArray(ParaEntity.nkeyhashtest4);
//		byte[] mg2 = ByteUtils.hexString2ByteArray(ParaEntity.nkeyhashtest2);
//		byte[] mg3 = ByteUtils.hexString2ByteArray(ParaEntity.nkeyhashtest3);
//		byte[] mg4 = ByteUtils.hexString2ByteArray(ParaEntity.nkeyhashtest4);
		byte[] mg5 = ByteUtils.hexString2ByteArray(ParaEntity.nkeyhashtest4);
//		Log.v("costtime","mg1...."+ ParaEntity.nkeyhashtest4);
//		Log.v("costtime","mg2...."+ ParaEntity.nkeyhashtest2);
//		Log.v("costtime","mg3...."+ ParaEntity.nkeyhashtest3);
//		Log.v("costtime","mg4...."+ ParaEntity.nkeyhashtest4);
//		Log.v("costtime","mg5...."+ ParaEntity.nkeyhashtest5);
//	    ipOut3 = new byte[128];
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_nes_sm3_hash((byte) 1, mg1, mg1.length, ipOut2);
		// String data1 = ByteUtils.byteArray2HexString(ipOut2);
//		System.arraycopy(ipOut2, 0, name, 0,ipOut2.length );
//		String data1 = ByteUtils.byteArray2HexString(name);
//		Log.v("costtime","name1..."+data1);

//		int res2 =  Ddi.ddi_innerkey_nes_sm3_hash((byte)2,mg2,mg2.length,ipOut2);
		// String data2 = ByteUtils.byteArray2HexString(ipOut2);
//		System.arraycopy(ipOut2, 0, name, ipOut2.length,ipOut2.length );

//		int res3 =  Ddi.ddi_innerkey_nes_sm3_hash((byte)2,mg3,mg3.length,ipOut2);
//		int res4 =  Ddi.ddi_innerkey_nes_sm3_hash((byte)2,mg4,mg4.length,ipOut2);
		// String data3 = ByteUtils.byteArray2HexString(ipOut2);

		int res5 = Ddi.ddi_innerkey_nes_sm3_hash((byte) 3, mg5, mg5.length, ipOut2);
//		System.arraycopy(ipOut2, 0, name, ipOut2.length+ipOut2.length+ipOut2.length,ipOut2.length );
//		Log.v("costtime","mg4...."+name);
		myHandleDeal("SM3 分包最后包杂凑成功hash5" + res1, 0);
		String data = ByteUtils.byteArray2HexString(ipOut2);
//		myHandleDeal("SM3 分包最后包杂凑成功"+data+res4+res3+res2+res1,0);
		// myHandleDeal("SM3 分包最后包杂凑成功"+data2,0);
//		Log.v("1111", data);
		if (res1 == -6) {
			myHandleDeal("SM3 分包最后包杂凑成功hash5" + data, res1);
		} else {
			myHandleDeal("sm3hash5分包杂凑失败hash5" + data, res1);
		}
		Ddi.ddi_innerkey_close();
	}

	// 正常测试
	private void testsm3idhash1() {
		myHandleDeal("testsm3idhash1测试", 0);
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey1);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey1);
		byte[] id = ByteUtils.hexString2ByteArray(ParaEntity.ID);
		byte[] mg = ByteUtils.hexString2ByteArray(ParaEntity.nkeymsg);
		String data = "3a7a76965c7b6a8905d704d47a222aea839769042eab36a749e8ee561925b831";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, 0, puk, prk);
		if (res1 == 0) {
			myHandleDeal("SM2更新密钥成功", res1);
			int res2 = Ddi.ddi_innerkey_nes_sm3_id_hash(0, id, id.length, mg, mg.length, ipOut2);
			String str = ByteUtils.byteArray2HexString(ipOut2);
//			Log.v("1111", str);
			if (res2 == 0 && str.equals(data)) {
				myHandleDeal("SM3带公钥杂凑成功", res2);
			} else {
				myHandleDeal("sm3idhash1带公钥杂凑失败", res2);
			}
		} else {
			myHandleDeal("sm3idhash1更新密钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	// 公钥索引不存在
	private void testsm3idhash2() {
		myHandleDeal("testsm3idhash2测试", 0);
		byte[] id = ByteUtils.hexString2ByteArray(ParaEntity.ID);
		byte[] mg = ByteUtils.hexString2ByteArray(ParaEntity.nkeymsg);
		Ddi.ddi_innerkey_open();
		Ddi.ddi_innerkey_nes_sm2_delete_key(10);
		int res1 = Ddi.ddi_innerkey_nes_sm3_id_hash(10, id, id.length, mg, mg.length, ipOut2);

		if (MainActivity.version.equalsIgnoreCase("7.1.2")) {
			if (res1 == -1) {
				myHandleDeal(MainActivity.model + "SM3带公钥杂凑测试成功", res1);
			} else {
				myHandleDeal(MainActivity.model + "sm3idhash2带公钥杂凑测试失败", res1);
			}
		}
		if (MainActivity.version.equalsIgnoreCase("5.1.1")) {
			if (res1 == -6) {
				myHandleDeal(MainActivity.model + "SM3带公钥杂凑测试成功", res1);
			} else {
				myHandleDeal(MainActivity.model + "sm3idhash2带公钥杂凑测试失败", res1);
			}
		}
		Ddi.ddi_innerkey_close();
	}

	// 公钥索引为31异常测试
	private void testsm3idhash3() {
		myHandleDeal("testsm3idhash1测试", 0);
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey1);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey1);
		byte[] id = ByteUtils.hexString2ByteArray(ParaEntity.ID);
		byte[] mg = ByteUtils.hexString2ByteArray(ParaEntity.nkeymsg);
		String data = "3a7a76965c7b6a8905d704d47a222aea839769042eab36a749e8ee561925b831";
		Ddi.ddi_innerkey_open();

//		if (MainActivity.version.equalsIgnoreCase("7.1.2")) {
//			Log.v("TAG", "7.1.2");

		int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, 31, puk, prk);
		if (res1 == -6) {
			myHandleDeal("SM2更新密钥成功" + "返回值" + res1, 0);
			int res2 = Ddi.ddi_innerkey_nes_sm3_id_hash(31, id, id.length, mg, mg.length, ipOut2);
			if (res2 == -6) {
				myHandleDeal("SM3带公钥杂凑参数错误" + "返回值" + res2, 0);
			} else {
				myHandleDeal("sm3idhash1带公钥杂凑失败", res2);
			}
		} else {
			myHandleDeal("sm3idhash1更新密钥失败", res1);
		}

//		}
//		if (MainActivity.version.equalsIgnoreCase("5.1.1")) {
//			Log.v("TAG", "5.1.1");
//			int res1 =  Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, 31, puk, prk);
//			if(res1==-6){
//				myHandleDeal("SM2更新密钥成功"+"返回值"+res1,0);
//				int res2 = Ddi.ddi_innerkey_nes_sm3_id_hash(31,id,id.length,mg,mg.length,ipOut2);					
//				if(res2==-1){
//					myHandleDeal("SM3带公钥杂凑参数错误"+"返回值"+res2,0);
//				}else{
//					myHandleDeal("sm3idhash1带公钥杂凑失败",res2);
//				}
//			}else{
//				myHandleDeal("sm3idhash1更新密钥失败",res1);
//			}
//					
//		}

		Ddi.ddi_innerkey_close();
	}

//	 设备关闭然后调用索引加密/
	private void testsm3idhash4() {
		myHandleDeal("testsm3idhash1测试", 0);
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey1);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey1);
		byte[] id = ByteUtils.hexString2ByteArray(ParaEntity.ID);
		byte[] mg = ByteUtils.hexString2ByteArray(ParaEntity.nkeymsg);
		String data = "3a7a76965c7b6a8905d704d47a222aea839769042eab36a749e8ee561925b831";
			int res = Ddi.ddi_innerkey_open();
			if (res == 0) {
				myHandleDeal("sm3idhash4关闭设备成功", 0);
			} else {
				myHandleDeal("sm3idhash4关闭设备失败", res);
			} 
		int res3;
		
	
		myHandleDeal("sm3idhash4设备未打开res1", res);
		int res2 = Ddi.ddi_innerkey_nes_sm3_id_hash(8, id, id.length, mg, mg.length, ipOut2);
		String str = ByteUtils.byteArray2HexString(ipOut2);
		//				Log.v("1111", str);
		if (res2 == 0) {
			myHandleDeal("sm3idhash4设备未打开res2", res2);
		} else {
			myHandleDeal("sm3idhash4设备未打开失败res2", res2);
		}
		Ddi.ddi_innerkey_close();
	}

	// 最大索引
	private void testsm3idhash5() {
		myHandleDeal("testsm3idhash5测试", 0);
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey1);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey1);
		byte[] id = ByteUtils.hexString2ByteArray(ParaEntity.ID);
		byte[] mg = ByteUtils.hexString2ByteArray(ParaEntity.nkeymsg);
		String data = "3a7a76965c7b6a8905d704d47a222aea839769042eab36a749e8ee561925b831";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, 15, puk, prk);
		if (res1 == 0) {
			myHandleDeal("SM2更新密钥成功sm3idhash5", res1);
			int res2 = Ddi.ddi_innerkey_nes_sm3_id_hash(15, id, id.length, mg, mg.length, ipOut2);
			String str = ByteUtils.byteArray2HexString(ipOut2);
//				Log.v("1111", str);
			if (res2 == 0 && str.equals(data)) {
				myHandleDeal("SM3带公钥杂凑成功sm3idhash5", res2);
			} else {
				myHandleDeal("sm3idhash5带公钥杂凑失败", res2);
			}
		} else {
			myHandleDeal("sm3idhash5更新密钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	// 索引异常
	private void testsm3idhash6() {
		myHandleDeal("testsm3idhash6测试", 0);
		byte[] puk = ByteUtils.hexString2ByteArray(ParaEntity.nkeypubkey1);
		byte[] prk = ByteUtils.hexString2ByteArray(ParaEntity.nkeyprikey1);
		byte[] id = ByteUtils.hexString2ByteArray(ParaEntity.ID);
		byte[] mg = ByteUtils.hexString2ByteArray(ParaEntity.nkeymsg);
		String data = "3a7a76965c7b6a8905d704d47a222aea839769042eab36a749e8ee561925b831";
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_nes_sm2_gen_keypair(3, 15, puk, prk);
		if (res1 == 0) {
			myHandleDeal("SM2更新密钥成功sm3idhash6", res1);
			int res2 = Ddi.ddi_innerkey_nes_sm3_id_hash(16, id, id.length, mg, mg.length, ipOut2);
			String str = ByteUtils.byteArray2HexString(ipOut2);
//				Log.v("1111", str);
			if (res2 == -6) {
				myHandleDeal("SM3带公钥杂凑成功sm3idhash6", res2);
			} else {
				myHandleDeal("sm3idhash6带公钥杂凑失败", res2);
			}
		} else {
			myHandleDeal("sm3idhash6更新密钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testpinblock1() {
		myHandleDeal("testpinblock1测试", 0);
		Ddi.ddi_innerkey_open();
//		String byteArray2HexString = ByteUtils.byteArray2HexString(innerkey);
//		myHandleDeal("获取pinblock成功"+byteArray2HexString,0);
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x00, 149, innerkey, 8);
//		String byteArray2HexString1 = ByteUtils.byteArray2HexString(innerkey);
//		myHandleDeal("获取pinblock成功"+byteArray2HexString1,0);
		int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x00, 149, 0, 0, ipIn, innerkey, 8, ipOut, 8);
		myHandleDeal("获取pinblock成功" + res0 + res2, res2);

		int res1 = Ddi.ddi_innerkey_get_pinblock_encrypt((byte) 0x00, 0, (byte) 0x00, ipIn, 8, innerkey, leOut, ipOut);
		if (res1 == -99) {
			myHandleDeal("获取pinblock成功", res1);
		} else {
			myHandleDeal("pinblock1需要使用测试pin工具进行测试失败", -99);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testpinblock2() {
		myHandleDeal("testpinblock2测试", 0);
		Ddi.ddi_innerkey_open();
		Ddi.ddi_innerkey_update_mk((byte) 0x01, 149, innerkey2, 16);
		Ddi.ddi_innerkey_update_wk((byte) 0x01, 149, 0, 0, ipIn, innerkey2, 16, ipOut, 16);
		int res1 = Ddi.ddi_innerkey_get_pinblock_encrypt((byte) 0x01, 0, (byte) 0x00, ipIn, 8, innerkey2, leOut, ipOut);
		if (res1 == 0) {
			myHandleDeal("获取pinblock成功", res1);
		} else {
			myHandleDeal("pinblock2获取pinblock失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testpinblock3() {
		myHandleDeal("testpinblock3测试", 0);
		Ddi.ddi_innerkey_open();
		Ddi.ddi_innerkey_update_mk((byte) 0x02, 149, innerkey3, 24);
		Ddi.ddi_innerkey_update_wk((byte) 0x02, 149, 0, 0, ipIn, innerkey3, 24, ipOut, 24);
		int res1 = Ddi.ddi_innerkey_get_pinblock_encrypt((byte) 0x02, 0, (byte) 0x00, ipIn, 24, innerkey3, leOut,
				ipOut);
		if (res1 == 0) {
			myHandleDeal("获取pinblock成功", res1);
		} else {
			myHandleDeal("pinblock3获取pinblock失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testpinblock4() {
		myHandleDeal("testpinblock4测试", 0);
		Ddi.ddi_innerkey_open();
		Ddi.ddi_innerkey_update_mk((byte) 0x03, 149, innerkey2, 16);
		Ddi.ddi_innerkey_update_wk((byte) 0x03, 149, 0, 0, ipIn, innerkey2, 16, ipOut, 16);
		int res1 = Ddi.ddi_innerkey_get_pinblock_encrypt((byte) 0x03, 0, (byte) 0x00, ipIn, 16, innerkey2, leOut,
				ipOut);
		if (res1 == 0) {
			myHandleDeal("获取pinblock成功", res1);
		} else {
			myHandleDeal("pinblock4获取pinblock失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testpinblock5() {
		myHandleDeal("testpinblock5测试", 0);
		Ddi.ddi_innerkey_open();
		Ddi.ddi_innerkey_update_mk((byte) 0x03, 149, innerkey2, 16);
		Ddi.ddi_innerkey_update_wk((byte) 0x03, 149, 0, 0, ipIn, innerkey2, 16, ipOut, 16);
		int res1 = Ddi.ddi_innerkey_get_pinblock_encrypt((byte) 0x03, 0, (byte) 0x01, ipIn, 16, innerkey2, leOut,
				ipOut);
		if (res1 == 0) {
			myHandleDeal("获取pinblock成功", res1);
		} else {
			myHandleDeal("pinblock5获取pinblock失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testpinblock6() {
		myHandleDeal("testpinblock6测试", 0);
		Ddi.ddi_innerkey_open();
		Ddi.ddi_innerkey_update_mk((byte) 0x02, 149, innerkey3, 24);
		Ddi.ddi_innerkey_update_wk((byte) 0x02, 149, 449, 0, ipIn, innerkey3, 24, ipOut, 24);
		int res1 = Ddi.ddi_innerkey_get_pinblock_encrypt((byte) 0x02, 449, (byte) 0x00, ipIn, 24, innerkey3, leOut,
				ipOut);
		if (res1 == 0) {
			myHandleDeal("获取pinblock成功", res1);
		} else {
			myHandleDeal("pinblock6获取pinblock失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testpinblock7() {
		myHandleDeal("testpinblock7测试", 0);
		Ddi.ddi_innerkey_open();
		Ddi.ddi_innerkey_update_mk((byte) 0x01, 149, innerkey2, 16);
		Ddi.ddi_innerkey_update_wk((byte) 0x01, 149, 449, 0, ipIn, innerkey2, 16, ipOut, 16);
		int res1 = Ddi.ddi_innerkey_get_pinblock_encrypt((byte) 0x01, 449, (byte) 0x00, ipIn, 8, innerkey2, leOut,
				ipOut);
		if (res1 == 0) {
			myHandleDeal("获取pinblock成功", res1);
		} else {
			myHandleDeal("pinblock7获取pinblock失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testpinblock8() {
		myHandleDeal("testpinblock8测试", 0);
		Ddi.ddi_innerkey_open();
		Ddi.ddi_innerkey_update_mk((byte) 0x02, 149, innerkey3, 24);
		Ddi.ddi_innerkey_update_wk((byte) 0x02, 149, 449, 0, ipIn, innerkey3, 24, ipOut, 24);
		int res1 = Ddi.ddi_innerkey_get_pinblock_encrypt((byte) 0x02, 449, (byte) 0x00, ipIn, 24, innerkey3, leOut,
				ipOut);
		if (res1 == 0) {
			myHandleDeal("获取pinblock成功", res1);
		} else {
			myHandleDeal("pinblock8获取pinblock失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testpinblock9() {
		myHandleDeal("testpinblock9测试", 0);
		Ddi.ddi_innerkey_open();
		Ddi.ddi_innerkey_update_mk((byte) 0x03, 149, innerkey2, 16);
		Ddi.ddi_innerkey_update_wk((byte) 0x03, 149, 449, 0, ipIn, innerkey2, 16, ipOut, 16);
		int res1 = Ddi.ddi_innerkey_get_pinblock_encrypt((byte) 0x03, 449, (byte) 0x00, ipIn, 16, innerkey2, leOut,
				ipOut);
		if (res1 == 0) {
			myHandleDeal("获取pinblock成功", res1);
		} else {
			myHandleDeal("pinblock9获取pinblock失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testpinblock10() {
		myHandleDeal("testpinblock10测试", 0);
		Ddi.ddi_innerkey_open();
		Ddi.ddi_innerkey_update_mk((byte) 0x03, 149, innerkey2, 16);
		Ddi.ddi_innerkey_update_wk((byte) 0x03, 149, 449, 0, ipIn, innerkey2, 16, ipOut, 16);
		int res1 = Ddi.ddi_innerkey_get_pinblock_encrypt((byte) 0x03, 449, (byte) 0x01, ipIn, 16, innerkey2, leOut,
				ipOut);
		if (res1 == 0) {
			myHandleDeal("获取pinblock成功", res1);
		} else {
			myHandleDeal("pinblock10获取pinblock失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	// pinblock128-AES测试
	private void testpinblock11() {
		myHandleDeal("testpinblock11测试", 0);
		String key1 = "A12345678A12345678A12345678A1239";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "A12345678A12345678A32345678A1234";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x04, 0, innerkey1, 16);
		if (res1 == 0) {
			myHandleDeal("AES更新主密钥成功", res1);
			int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x04, 0, 0, 0, ipIn, innerkey2, 16, innerkey1, 16);
			if (res2 == 0) {
				myHandleDeal("AES更新工作密钥成功", res2);
				int res3 = Ddi.ddi_innerkey_get_pinblock_encrypt((byte) 0x04, 0, (byte) 0x00, ipIn, 16, innerkey2,
						leOut, ipOut);
				if (res3 == 0) {
					myHandleDeal("pinblock11AES128加密成功", res3);
				} else {
					myHandleDeal("pinblock11AES128加密失败" + res3, res3);
				}
			} else {
				myHandleDeal("Aesupdatmk1更新工作密钥失败", res2);
			}
		} else {
			myHandleDeal("Aesupdatmk1更新主密钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testpinblock12() {
		myHandleDeal("testpinblock12测试", 0);
		String key1 = "A12345678A12345678A12345678A1239";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "A12345678A12345678A32345678A1234";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x04, 0, innerkey1, 16);
		if (res1 == 0) {
			myHandleDeal("AES更新主密钥成功", res1);
			int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x04, 0, 0, 0, ipIn, innerkey2, 16, innerkey1, 16);
			if (res2 == 0) {
				myHandleDeal("AES更新工作密钥成功", res2);
				int res3 = Ddi.ddi_innerkey_get_pinblock_encrypt((byte) 0x04, 0, (byte) 0x01, ipIn, 16, innerkey2,
						leOut, ipOut);
				if (res3 == 0) {
					myHandleDeal("pinblock11AES128加密成功", res3);
				} else {
					myHandleDeal("pinblock11AES128加密失败" + res3, res3);
				}
			} else {
				myHandleDeal("Aesupdatmk1更新工作密钥失败", res2);
			}
		} else {
			myHandleDeal("Aesupdatmk1更新主密钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	// AES-192
	private void testpinblock13() {
		myHandleDeal("testgroup36测试", 0);
		String key1 = "A12345678A12345678A12345678A1234ABCDEF012345678A";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "A12345678A12345678A12345678A1234ABCDEF012345678A0000000000000000";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		String plain = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] m_plain = ByteUtils.hexString2ByteArray(plain);
		byte[] cipher = new byte[16];
		byte[] cipher1 = new byte[16];
		String data = "461e53672770726d3c138766679d9f43";
		byte[] m_data = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x05, 0, innerkey1, 24);
		if (res0 == 0) {
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x05, 0, 0, 1, ipIn, innerkey2, 32, innerkey1, 24);
			if (res1 == 0) {
				myHandleDeal("更新工作秘钥成功", res1);
				int res3 = Ddi.ddi_innerkey_get_pinblock_encrypt((byte) 0x05, 0, (byte) 0x01, ipIn, 16, innerkey2,
						leOut, ipOut);
				if (res3 == 0) {
					myHandleDeal("pinblock成功", res3);
				} else {
					myHandleDeal("pinblock失败", res3);

				}
			} else {
				myHandleDeal("更新工作秘钥失败", res1);

			}

		} else {
			myHandleDeal("group36更新主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testpinblock14() {
		myHandleDeal("testgroup36测试", 0);
		String key1 = "A12345678A12345678A12345678A1234ABCDEF012345678A";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "A12345678A12345678A12345678A1234ABCDEF012345678A0000000000000000";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		String plain = "12345678abcdefbfabcdefbcabcdefbf";
		byte[] m_plain = ByteUtils.hexString2ByteArray(plain);
		byte[] cipher = new byte[16];
		byte[] cipher1 = new byte[16];
		String data = "461e53672770726d3c138766679d9f43";
		byte[] m_data = ByteUtils.hexString2ByteArray(data);
		Ddi.ddi_innerkey_open();
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x05, 0, innerkey1, 24);
		if (res0 == 0) {
			myHandleDeal("更新主密钥成功", res0);
			int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x05, 0, 0, 1, ipIn, innerkey2, 32, innerkey1, 24);
			if (res1 == 0) {
				myHandleDeal("更新工作秘钥成功", res1);
				int res3 = Ddi.ddi_innerkey_get_pinblock_encrypt((byte) 0x05, 0, (byte) 0x00, ipIn, 16, innerkey2,
						leOut, ipOut);
				if (res3 == 0) {
					myHandleDeal("pinblock成功", res3);
				} else {
					myHandleDeal("pinblock失败", res3);

				}
			} else {
				myHandleDeal("更新工作秘钥失败", res1);

			}

		} else {
			myHandleDeal("group36更新主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	// AES256
	private void testpinblock15() {
		myHandleDeal("testpinblock15测试", 0);
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
				myHandleDeal("更新工作密钥成功", res1);
				int res3 = Ddi.ddi_innerkey_get_pinblock_encrypt((byte) 0x06, 225, (byte) 0x00, ipIn, 16, innerkey2,
						leOut, ipOut);
				if (res3 == 0) {
					myHandleDeal("pinblock15加密成功成功", res3);

				} else {
					myHandleDeal("pinblock15加密成功失败", res3);

				}
			} else {
				myHandleDeal("更新工作密钥失败", res1);
			}
		} else {
			myHandleDeal("group33更新主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testpinblock16() {
		myHandleDeal("testpinblock16测试", 0);
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
				myHandleDeal("更新工作密钥成功", res1);
				int res3 = Ddi.ddi_innerkey_get_pinblock_encrypt((byte) 0x06, 225, (byte) 0x01, ipIn, 16, innerkey2,
						leOut, ipOut);
				if (res3 == 0) {
					myHandleDeal("pinblock15加密成功成功", res3);

				} else {
					myHandleDeal("pinblock15加密成功失败", res3);

				}
			} else {
				myHandleDeal("更新工作密钥失败", res1);
			}
		} else {
			myHandleDeal("group33更新主密钥失败", res0);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testpinblock17() {
		myHandleDeal("testpinblock17测试", 0);
		Ddi.ddi_innerkey_open();
//		String byteArray2HexString = ByteUtils.byteArray2HexString(innerkey);
//		myHandleDeal("获取pinblock成功"+byteArray2HexString,0);
		int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x00, 149, innerkey, 8);
//		String byteArray2HexString1 = ByteUtils.byteArray2HexString(innerkey);
//		myHandleDeal("获取pinblock成功"+byteArray2HexString1,0);
		int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x00, 149, 0, 0, ipIn, innerkey, 8, ipOut, 8);
		myHandleDeal("获取pinblock成功" + res0 + res2, res2);
		int res6 = Ddi.ddi_innerkey_get_pinblock_encrypt((byte) 0x00, 0, (byte) 0x00, ipIn, 8, innerkey, leOut, ipOut);
		myHandleDeal("获取pinblock成功" + res6, 0);

		long begin = System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			int res1 = Ddi.ddi_innerkey_get_pinblock_encrypt((byte) 0x00, 0, (byte) 0x00, ipIn, 8, innerkey, leOut,
					ipOut);
		}
		long end = System.currentTimeMillis();
		long current = end - begin;
		myHandleDeal("获取pinblock用时" + current, res2);

		Ddi.ddi_innerkey_close();
	}

	private void testpinblock18() {
		myHandleDeal("testpinblock18测试", 0);
		Ddi.ddi_innerkey_open();
		Ddi.ddi_innerkey_update_mk((byte) 0x03, 149, innerkey2, 16);
		Ddi.ddi_innerkey_update_wk((byte) 0x03, 149, 0, 0, ipIn, innerkey2, 16, ipOut, 16);

		int res6 = Ddi.ddi_innerkey_get_pinblock_encrypt((byte) 0x03, 0, (byte) 0x00, ipIn, 16, innerkey2, leOut,
				ipOut);
		myHandleDeal("获取pinblock成功" + res6, 0);
		long begin = System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			int res1 = Ddi.ddi_innerkey_get_pinblock_encrypt((byte) 0x03, 0, (byte) 0x00, ipIn, 16, innerkey2, leOut,
					ipOut);
		}
		long end = System.currentTimeMillis();
		long current = end - begin;
		myHandleDeal("获取pinblock用时" + current, 0);
		Ddi.ddi_innerkey_close();
	}

	private void testinnerkeysingle() {
		myHandleDeal("testinnerkeysingle测试", 0);
//		Runnable mRunnable = new Runnable() {
//			public void run() {
				int res1 = Ddi.ddi_innerkey_open();
				if (res1 == 0) {
					myHandleDeal("打开设备成功", res1);
				} else {
					myHandleDeal("innerkeysingle打开设备失败1", res1);
				}
				int res2 = Ddi.ddi_innerkey_close();
				if (res2 == 0) {
					myHandleDeal("关闭设备成功", res2);
				} else {
					myHandleDeal("innerkeysingle关闭设备失败2", res2);
				}
				Ddi.ddi_innerkey_open();
				int res3 = Ddi.ddi_innerkey_update_mk((byte) 0x00, -1, innerkey, 8);
				if (res3 == -6) {
					myHandleDeal("更新主密钥测试成功", res3);
				} else {
					myHandleDeal("innerkeysingle更新主密钥测试失败3", res3);
				}
				int res4 = Ddi.ddi_innerkey_update_mk((byte) 0x00, 0, innerkey, 8);
				if (res4 == 0) {
					myHandleDeal("更新主密钥成功", res4);
				} else {
					myHandleDeal("innerkeysingle更新主密钥失败4", res4);
				}
				int res5 = Ddi.ddi_innerkey_update_mk((byte) 0x00, 74, innerkey, 8);
				if (res5 == 0) {
					myHandleDeal("更新主密钥成功", res5);
				} else {
					myHandleDeal("innerkeysingle更新主密钥失败5", res5);
				}
				int res6 = Ddi.ddi_innerkey_update_mk((byte) 0x00, 149, innerkey, 8);
				if (res6 == 0) {
					myHandleDeal("更新主密钥成功", res6);
				} else {
					myHandleDeal("innerkeysingle更新主密钥失败6", res6);
				}
				int res7 = Ddi.ddi_innerkey_update_mk((byte) 0x00, 150, innerkey, 8);
				if (res7 == -6) {
					myHandleDeal("更新主密钥测试成功", res7);
				} else {
					myHandleDeal("innerkeysingle更新主密钥测试失败7", res7);
				}
				int res8 = Ddi.ddi_innerkey_update_mk((byte) 0x00, 149, innerkey2, 16);
				if (res8 == -6) {
					myHandleDeal("更新主密钥测试成功", res8);
				} else {
					myHandleDeal("innerkeysingle更新主密钥测试失败8", res8);
				}
				int res9 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey2, 16);
				if (res9 == 0) {
					myHandleDeal("更新主密钥测试成功", res9);
				} else {
					myHandleDeal("innerkeysingle更新主密钥测试失败9", res9);
				}
				int res10 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 75, innerkey2, 16);
				if (res10 == 0) {
					myHandleDeal("更新主密钥成功", res10);
				} else {
					myHandleDeal("innerkeysingle更新主密钥失败10", res10);
				}
				int res11 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 149, innerkey2, 16);
				if (res11 == 0) {
					myHandleDeal("更新主密钥成功", res11);
				} else {
					myHandleDeal("innerkeysingle更新主密钥失败11", res11);
				}
				int res12 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 150, innerkey2, 16);
				if (res12 == -6) {
					myHandleDeal("更新主密钥测试成功", res12);
				} else {
					myHandleDeal("innerkeysingle更新主密钥测试失败12", res12);
				}
				int res13 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 149, innerkey, 8);
				if (res13 == -6) {
					myHandleDeal("更新主密钥测试成功", res13);
				} else {
					myHandleDeal("innerkeysingle更新主密钥测试失败13", res13);
				}
				int res14 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 0, innerkey3, 24);
				if (res14 == 0) {
					myHandleDeal("更新主密钥成功", res14);
				} else {
					myHandleDeal("innerkeysingle更新主密钥失败14", res14);
				}
				int res15 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 76, innerkey3, 24);
				if (res15 == 0) {
					myHandleDeal("更新主密钥成功", res15);
				} else {
					myHandleDeal("innerkeysingle更新主密钥失败15", res15);
				}
				int res16 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 149, innerkey3, 24);
				if (res16 == 0) {
					myHandleDeal("更新主密钥成功", res16);
				} else {
					myHandleDeal("innerkeysingle更新主密钥失败16", res16);
				}
				int res17 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 150, innerkey3, 24);
				if (res17 == -6) {
					myHandleDeal("更新主密钥测试成功", res17);
				} else {
					myHandleDeal("innerkeysingle更新主密钥测试失败17", res17);
				}
				int res18 = Ddi.ddi_innerkey_update_mk((byte) 0x02, 148, innerkey, 8);
				if (res18 == -6) {
					myHandleDeal("更新主密钥测试成功", res18);
				} else {
					myHandleDeal("innerkeysingle更新主密钥测试失败18", res18);
				}
				int res19 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 0, innerkey2, 16);
				if (res19 == 0) {
					myHandleDeal("更新主密钥成功", res19);
				} else {
					myHandleDeal("innerkeysingle更新主密钥失败19", res19);
				}
				int res20 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 0, innerkey2, 16);
				if (res20 == 0) {
					myHandleDeal("更新主密钥成功", res20);
				} else {
					myHandleDeal("innerkeysingle更新主密钥失败20", res20);
				}
				int res21 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 77, innerkey2, 16);
				if (res21 == 0) {
					myHandleDeal("更新主密钥成功", res21);
				} else {
					myHandleDeal("innerkeysingle更新主密钥失败21", res21);
				}
				int res22 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 149, innerkey2, 16);
				if (res22 == 0) {
					myHandleDeal("更新主密钥成功", res22);
				} else {
					myHandleDeal("innerkeysingle更新主密钥失败22", res22);
				}
				int res23 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 150, innerkey2, 16);
				if (res23 == -6) {
					myHandleDeal("更新主密钥测试成功", res23);
				} else {
					myHandleDeal("innerkeysingle更新主密钥测试失败23", res23);
				}
				int res24 = Ddi.ddi_innerkey_update_mk((byte) 0x03, 147, innerkey3, 24);
				if (res24 == -6) {
					myHandleDeal("更新主密钥测试成功", res24);
				} else {
					myHandleDeal("innerkeysingle更新主密钥测试失败24", res24);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x03, 0, innerkey2, 16);
				int res25 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 0, -1, 0, ipIn, innerkey2, 16, ipOut, 16);
				if (res25 == -6) {
					myHandleDeal("更新工作密钥测试成功", res25);
				} else {
					myHandleDeal("innerkeysingle更新工作密钥测试失败25", res25);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x03, 0, innerkey2, 16);
				int res26 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 0, 0, 0, ipIn, innerkey2, 16, ipOut, 16);
				if (res26 == 0) {
					myHandleDeal("更新工作密钥成功", res26);
				} else {
					myHandleDeal("innerkeysingle更新工作密钥失败26", res26);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x03, 75, innerkey2, 16);
				int res27 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 75, 225, 0, ipIn, innerkey2, 16, ipOut, 16);
				if (res27 == 0) {
					myHandleDeal("更新工作密钥成功", res27);
				} else {
					myHandleDeal("innerkeysingle更新工作密钥失败27", res27);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x03, 149, innerkey2, 16);
				int res28 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 149, 449, 0, ipIn, innerkey2, 16, ipOut, 16);
				if (res28 == 0) {
					myHandleDeal("更新工作密钥成功", res28);
				} else {
					myHandleDeal("innerkeysingle更新工作密钥失败28", res28);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x03, 0, innerkey2, 16);
				int res29 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 0, 450, 0, ipIn, innerkey2, 16, ipOut, 16);
				if (res29 == -6) {
					myHandleDeal("更新工作密钥测试成功", res29);
				} else {
					myHandleDeal("innerkeysingle更新工作密钥测试失败29", res29);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x03, 0, innerkey2, 16);
				int res30 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 0, 0, 1, ipIn, innerkey2, 16, ipOut, 16);
				if (res30 == 0) {
					myHandleDeal("更新工作密钥成功", res30);
				} else {
					myHandleDeal("innerkeysingle更新工作密钥失败30", res30);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x03, 75, innerkey2, 16);
				int res31 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 75, 225, 1, ipIn, innerkey2, 16, ipOut, 16);
				if (res31 == 0) {
					myHandleDeal("更新工作密钥成功", res31);
				} else {
					myHandleDeal("innerkeysingle更新工作密钥失败31", res31);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x03, 149, innerkey2, 16);
				int res32 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 149, 449, 1, ipIn, innerkey2, 16, ipOut, 16);
				if (res32 == 0) {
					myHandleDeal("更新工作密钥成功", res32);
				} else {
					myHandleDeal("innerkeysingle更新工作密钥失败32", res32);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x03, 149, innerkey2, 16);
				int res33 = Ddi.ddi_innerkey_update_wk((byte) 0x03, 149, 450, 1, ipIn, innerkey2, 16, ipOut, 16);
				if (res33 == -6) {
					myHandleDeal("更新工作密钥测试成功", res33);
				} else {
					myHandleDeal("innerkeysingle更新工作密钥测试失败33", res33);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x00, 0, innerkey, 8);
				int res34 = Ddi.ddi_innerkey_update_wk((byte) 0x00, 0, 0, 0, ipIn, innerkey, 8, ipOut, 8);
				if (res34 == 0) {
					myHandleDeal("更新工作密钥成功", res34);
				} else {
					myHandleDeal("innerkeysingle更新工作密钥失败34", res34);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x00, 75, innerkey, 8);
				int res35 = Ddi.ddi_innerkey_update_wk((byte) 0x00, 75, 225, 0, ipIn, innerkey, 8, ipOut, 8);
				if (res35 == 0) {
					myHandleDeal("更新工作密钥成功", res35);
				} else {
					myHandleDeal("innerkeysingle更新工作密钥失败35", res35);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x00, 149, innerkey, 8);
				int res36 = Ddi.ddi_innerkey_update_wk((byte) 0x00, 149, 449, 0, ipIn, innerkey, 8, ipOut, 8);
				if (res36 == 0) {
					myHandleDeal("更新工作密钥成功", res36);
				} else {
					myHandleDeal("innerkeysingle更新工作密钥失败36", res36);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x00, 0, innerkey, 8);
				int res37 = Ddi.ddi_innerkey_update_wk((byte) 0x00, 0, 450, 0, ipIn, innerkey, 8, ipOut, 8);
				if (res37 == -6) {
					myHandleDeal("更新工作密钥测试成功", res37);
				} else {
					myHandleDeal("innerkeysingle更新工作密钥测试失败37", res37);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x00, 0, innerkey, 8);
				int res38 = Ddi.ddi_innerkey_update_wk((byte) 0x00, 0, 0, 1, ipIn, innerkey, 8, ipOut, 8);
				if (res34 == 0) {
					myHandleDeal("更新工作密钥成功", res38);
				} else {
					myHandleDeal("innerkeysingle更新工作密钥失败38", res38);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x00, 75, innerkey, 8);
				int res39 = Ddi.ddi_innerkey_update_wk((byte) 0x00, 75, 225, 1, ipIn, innerkey, 8, ipOut, 8);
				if (res39 == 0) {
					myHandleDeal("更新工作密钥成功", res39);
				} else {
					myHandleDeal("innerkeysingle更新工作密钥失败39", res39);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x00, 149, innerkey, 8);
				int res40 = Ddi.ddi_innerkey_update_wk((byte) 0x00, 149, 449, 1, ipIn, innerkey, 8, ipOut, 8);
				if (res40 == 0) {
					myHandleDeal("更新工作密钥成功", res40);
				} else {
					myHandleDeal("innerkeysingle更新工作密钥失败40", res40);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x00, 0, innerkey, 8);
				int res41 = Ddi.ddi_innerkey_update_wk((byte) 0x00, 0, 450, 1, ipIn, innerkey, 8, ipOut, 8);
				if (res41 == -6) {
					myHandleDeal("更新工作密钥测试成功", res41);
				} else {
					myHandleDeal("innerkeysingle更新工作密钥测试失败41", res41);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey2, 16);
				int res42 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 0, 0, ipIn, innerkey2, 16, ipOut, 16);
				if (res42 == 0) {
					myHandleDeal("更新工作密钥成功", res42);
				} else {
					myHandleDeal("innerkeysingle更新工作密钥失败42", res42);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x01, 75, innerkey2, 16);
				int res43 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 75, 225, 0, ipIn, innerkey2, 16, ipOut, 16);
				if (res43 == 0) {
					myHandleDeal("更新工作密钥成功", res43);
				} else {
					myHandleDeal("innerkeysingle更新工作密钥失败43", res43);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x01, 149, innerkey2, 16);
				int res44 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 149, 449, 0, ipIn, innerkey2, 16, ipOut, 16);
				if (res44 == 0) {
					myHandleDeal("更新工作密钥成功", res44);
				} else {
					myHandleDeal("innerkeysingle更新工作密钥失败44", res44);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey2, 16);
				int res45 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 450, 0, ipIn, innerkey2, 16, ipOut, 16);
				if (res45 == -6) {
					myHandleDeal("更新工作密钥测试成功", res45);
				} else {
					myHandleDeal("innerkeysingle更新工作密钥测试失败45", res45);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey2, 16);
				int res46 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 0, 1, ipIn, innerkey2, 16, ipOut, 16);
				if (res46 == 0) {
					myHandleDeal("更新工作密钥成功", res46);
				} else {
					myHandleDeal("innerkeysingle更新工作密钥失败46", res46);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x01, 75, innerkey2, 16);
				int res47 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 75, 225, 1, ipIn, innerkey2, 16, ipOut, 16);
				if (res47 == 0) {
					myHandleDeal("更新工作密钥成功", res47);
				} else {
					myHandleDeal("innerkeysingle更新工作密钥失败47", res47);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x01, 149, innerkey2, 16);
				int res48 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 149, 449, 1, ipIn, innerkey2, 16, ipOut, 16);
				if (res48 == 0) {
					myHandleDeal("更新工作密钥成功", res48);
				} else {
					myHandleDeal("innerkeysingle更新工作密钥失败48", res48);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x01, 0, innerkey2, 16);
				int res49 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 0, 450, 1, ipIn, innerkey2, 16, ipOut, 16);
				if (res49 == -6) {
					myHandleDeal("更新工作密钥测试成功", res49);
				} else {
					myHandleDeal("innerkeysingle更新工作密钥测试失败49", res49);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x02, 0, innerkey3, 24);
				int res50 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 0, 0, 0, ipIn, innerkey3, 24, ipOut, 24);
				if (res50 == 0) {
					myHandleDeal("更新工作密钥成功", res50);
				} else {
					myHandleDeal("innerkeysingle更新工作密钥失败50", res50);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x02, 75, innerkey3, 24);
				int res51 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 75, 225, 0, ipIn, innerkey3, 24, ipOut, 24);
				if (res51 == 0) {
					myHandleDeal("更新工作密钥成功", res51);
				} else {
					myHandleDeal("innerkeysingle更新工作密钥失败51", res51);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x02, 149, innerkey3, 24);
				int res52 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 149, 449, 0, ipIn, innerkey3, 24, ipOut, 24);
				if (res52 == 0) {
					myHandleDeal("更新工作密钥成功", res52);
				} else {
					myHandleDeal("innerkeysingle更新工作密钥失败52", res52);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x02, 0, innerkey3, 24);
				int res53 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 0, 450, 0, ipIn, innerkey3, 24, ipOut, 24);
				if (res53 == -6) {
					myHandleDeal("更新工作密钥测试成功", res53);
				} else {
					myHandleDeal("innerkeysingle更新工作密钥测试失败53", res53);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x02, 0, innerkey3, 24);
				int res54 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 0, 0, 1, ipIn, innerkey3, 24, ipOut, 24);
				if (res54 == 0) {
					myHandleDeal("更新工作密钥成功", res54);
				} else {
					myHandleDeal("innerkeysingle更新工作密钥失败54", res54);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x02, 75, innerkey3, 24);
				int res55 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 75, 225, 1, ipIn, innerkey3, 24, ipOut, 24);
				if (res55 == 0) {
					myHandleDeal("更新工作密钥成功", res55);
				} else {
					myHandleDeal("innerkeysingle更新工作密钥失败55", res55);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x02, 149, innerkey3, 24);
				int res56 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 149, 449, 1, ipIn, innerkey3, 24, ipOut, 24);
				if (res56 == 0) {
					myHandleDeal("更新工作密钥成功", res56);
				} else {
					myHandleDeal("innerkeysingle更新工作密钥失败56", res56);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x02, 0, innerkey3, 24);
				int res57 = Ddi.ddi_innerkey_update_wk((byte) 0x02, 0, 450, 1, ipIn, innerkey3, 24, ipOut, 24);
				if (res57 == -6) {
					myHandleDeal("更新工作密钥测试成功", res57);
				} else {
					myHandleDeal("innerkeysingle更新工作密钥测试失败57", res57);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x00, 75, innerkey, 8);
				int res58 = Ddi.ddi_innerkey_delete_key(0, 75);
				if (res58 == 0) {
					myHandleDeal("删除主密钥成功", res58);
				} else {
					myHandleDeal("innerkeysingle删除主密钥失败58", res58);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x01, 149, innerkey2, 16);
				int res59 = Ddi.ddi_innerkey_delete_key(0, 149);
				if (res59 == 0) {
					myHandleDeal("删除主密钥成功", res59);
				} else {
					myHandleDeal("innerkeysingle删除主密钥失败59", res59);
				}
				int res60 = Ddi.ddi_innerkey_delete_key(0, 150);
				if (res60 == -6) {
					myHandleDeal("删除主密钥测试成功", res60);
				} else {
					myHandleDeal("innerkeysingle删除主密钥测试失败60", res60);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x01, 149, innerkey2, 16);
				Ddi.ddi_innerkey_update_wk((byte) 0x02, 149, 410, 1, ipIn, innerkey3, 24, ipOut, 24);
				int res61 = Ddi.ddi_innerkey_delete_key(1, 410);
				if (res61 == 0) {
					myHandleDeal("删除工作密钥成功", res61);
				} else {
					myHandleDeal("innerkeysingle删除工作密钥失败61", res61);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x01, 149, innerkey2, 16);
				Ddi.ddi_innerkey_update_wk((byte) 0x03, 149, 0, 0, ipIn, innerkey2, 16, ipOut, 16);
				int res62 = Ddi.ddi_innerkey_delete_key(1, 0);
				if (res62 == 0) {
					myHandleDeal("删除工作密钥成功", res62);
				} else {
					myHandleDeal("innerkeysingle删除工作密钥失败62", res62);
				}
				int res63 = Ddi.ddi_innerkey_delete_key(1, 450);
				if (res63 == -6) {
					myHandleDeal("删除工作密钥测试成功", res63);
				} else {
					myHandleDeal("innerkeysingle删除工作密钥测试失败63", res63);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x00, 0, innerkey, 8);
				int res64 = Ddi.ddi_innerkey_des_encrypt(0, 0, 0, ipIn, msg_summery, 16, ipOut);
				if (res64 == 0) {
					myHandleDeal("主密钥加密成功", res64);
				} else {
					myHandleDeal("innerkeysingle主密钥加密失败64", res64);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x01, 1, innerkey2, 16);
				int res65 = Ddi.ddi_innerkey_des_encrypt(0, 1, 0, ipIn, msg_summery, 16, ipOut);
				if (res65 == 0) {
					myHandleDeal("主密钥加密成功", res65);
				} else {
					myHandleDeal("innerkeysingle主密钥加密失败65", res65);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x02, 2, innerkey3, 24);
				int res66 = Ddi.ddi_innerkey_des_encrypt(0, 2, 0, ipIn, msg_summery, 16, ipOut);
				if (res66 == 0) {
					myHandleDeal("主密钥加密成功", res66);
				} else {
					myHandleDeal("innerkeysingle主密钥加密失败66", res66);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x00, 0, innerkey, 8);
				int res67 = Ddi.ddi_innerkey_des_encrypt(0, 0, 1, ipIn, msg_summery, 16, ipOut);
				if (res67 == 0) {
					myHandleDeal("主密钥加密成功", res67);
				} else {
					myHandleDeal("innerkeysingle主密钥加密失败67", res67);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x01, 1, innerkey2, 16);
				int res68 = Ddi.ddi_innerkey_des_encrypt(0, 1, 1, ipIn, msg_summery, 16, ipOut);
				if (res68 == 0) {
					myHandleDeal("密钥加密成功", res68);
				} else {
					myHandleDeal("innerkeysingle主密钥加密失败68", res68);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x02, 2, innerkey3, 24);
				int res69 = Ddi.ddi_innerkey_des_encrypt(0, 2, 1, ipIn, msg_summery, 16, ipOut);
				if (res69 == 0) {
					myHandleDeal("主密钥加密成功", res69);
				} else {
					myHandleDeal("innerkeysingle主密钥加密失败69", res69);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x00, 149, innerkey, 8);
				Ddi.ddi_innerkey_update_wk((byte) 0x00, 149, 0, 0, ipIn, innerkey, 8, ipOut, 8);
				int res70 = Ddi.ddi_innerkey_des_encrypt(1, 0, 0, ipIn, msg_summery, 16, ipOut);
				if (res70 == 0) {
					myHandleDeal("工作密钥加密成功", res70);
				} else {
					myHandleDeal("innerkeysingle工作密钥加密失败70", res70);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x01, 1, innerkey2, 16);
				Ddi.ddi_innerkey_update_wk((byte) 0x01, 1, 449, 0, ipIn, innerkey2, 16, ipOut, 16);
				int res71 = Ddi.ddi_innerkey_des_encrypt(1, 449, 0, ipIn, msg_summery, 16, ipOut);
				if (res71 == 0) {
					myHandleDeal("工作密钥加密成功", res71);
				} else {
					myHandleDeal("innerkeysingle工作密钥加密失败71", res71);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x02, 2, innerkey3, 24);
				Ddi.ddi_innerkey_update_wk((byte) 0x02, 2, 5, 0, ipIn, innerkey3, 24, ipOut, 24);
				int res72 = Ddi.ddi_innerkey_des_encrypt(1, 5, 0, ipIn, msg_summery, 16, ipOut);
				if (res72 == 0) {
					myHandleDeal("工作密钥加密成功", res72);
				} else {
					myHandleDeal("innerkeysingle工作密钥加密失败72", res72);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x00, 149, innerkey, 8);
				Ddi.ddi_innerkey_update_wk((byte) 0x00, 149, 0, 0, ipIn, innerkey, 8, ipOut, 8);
				int res73 = Ddi.ddi_innerkey_des_encrypt(1, 0, 1, ipIn, msg_summery, 16, ipOut);
				if (res73 == 0) {
					myHandleDeal("工作密钥加密成功", res73);
				} else {
					myHandleDeal("innerkeysingle工作密钥加密失败73", res73);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x01, 1, innerkey2, 16);
				Ddi.ddi_innerkey_update_wk((byte) 0x01, 1, 449, 0, ipIn, innerkey2, 16, ipOut, 16);
				int res74 = Ddi.ddi_innerkey_des_encrypt(1, 449, 1, ipIn, msg_summery, 16, ipOut);
				if (res74 == 0) {
					myHandleDeal("工作密钥加密成功", res74);
				} else {
					myHandleDeal("innerkeysingle工作密钥加密失败74", res74);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x02, 2, innerkey3, 24);
				Ddi.ddi_innerkey_update_wk((byte) 0x02, 2, 5, 0, ipIn, innerkey3, 24, ipOut, 24);
				int res75 = Ddi.ddi_innerkey_des_encrypt(1, 5, 1, ipIn, msg_summery, 16, ipOut);
				if (res75 == 0) {
					myHandleDeal("工作密钥加密成功", res75);
				} else {
					myHandleDeal("innerkeysingle工作密钥加密失败75", res75);
				}
				// 3131313131313131 数据：12345678abcdEFBFABCDefBCabcdEFBF
				Ddi.ddi_innerkey_update_mk((byte) 0x00, 0, innerkey, 8);
				Ddi.ddi_innerkey_update_wk((byte) 0x00, 0, 0, 0, ipIn, innerkey, 8, ipOut, 8);
				int res76 = Ddi.ddi_innerkey_des_decrypt(1, 0, 0, 0, ipIn, msg_summery, 16, ipOut);
				if (res76 == 0) {
					myHandleDeal("DES解密成功", res76);
				} else {
					myHandleDeal("innerkeysingleDES解密失败76", res76);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x01, 1, innerkey2, 16);
				Ddi.ddi_innerkey_update_wk((byte) 0x00, 1, 0, 0, ipIn, innerkey, 8, ipOut, 8);
				int res77 = Ddi.ddi_innerkey_des_decrypt(0, 1, 0, 0, ipIn, msg_summery, 16, ipOut);
				if (res77 == 0) {
					myHandleDeal("DES解密成功", res77);
				} else {
					myHandleDeal("innerkeysingleDES解密失败77", res77);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x02, 2, innerkey3, 24);
				Ddi.ddi_innerkey_update_wk((byte) 0x00, 2, 0, 0, ipIn, innerkey, 8, ipOut, 8);
				int res78 = Ddi.ddi_innerkey_des_decrypt(0, 2, 0, 0, ipIn, msg_summery, 16, ipOut);
				if (res78 == 0) {
					myHandleDeal("DES解密成功", res78);
				} else {
					myHandleDeal("innerkeysingleDES解密失败78", res78);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x00, 0, innerkey, 8);
				Ddi.ddi_innerkey_update_wk((byte) 0x00, 0, 0, 0, ipIn, innerkey, 8, ipOut, 8);
				int res79 = Ddi.ddi_innerkey_des_decrypt(0, 0, 0, 0, ipIn, innerkey, 8, ipOut);
				if (res79 == 0) {
					myHandleDeal("DES解密成功", res79);
				} else {
					myHandleDeal("innerkeysingleDES解密失败79", res79);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x01, 1, innerkey2, 16);
				Ddi.ddi_innerkey_update_wk((byte) 0x00, 1, 0, 0, ipIn, innerkey, 8, ipOut, 8);
				int res80 = Ddi.ddi_innerkey_des_decrypt(0, 1, 0, 0, ipIn, msg_summery, 16, ipOut);
				if (res80 == 0) {
					myHandleDeal("DES解密成功", res80);
				} else {
					myHandleDeal("innerkeysingleDES解密失败80", res80);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x02, 2, innerkey3, 24);
				Ddi.ddi_innerkey_update_wk((byte) 0x00, 2, 0, 0, ipIn, innerkey, 8, ipOut, 8);
				int res81 = Ddi.ddi_innerkey_des_decrypt(0, 2, 0, 0, ipIn, msg_summery, 16, ipOut);
				if (res81 == 0) {
					myHandleDeal("DES解密成功", res81);
				} else {
					myHandleDeal("innerkeysingleDES解密失败81", res81);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x00, 0, innerkey, 8);
				Ddi.ddi_innerkey_update_wk((byte) 0x00, 0, 0, 0, ipIn, innerkey, 8, ipOut, 8);
				int res82 = Ddi.ddi_innerkey_des_decrypt(1, 0, 0, 0, ipIn, msg_summery, 16, ipOut);
				if (res82 == 0) {
					myHandleDeal("DES解密成功", res82);
				} else {
					myHandleDeal("innerkeysingleDES解密失败82", res82);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x01, 1, innerkey2, 16);
				Ddi.ddi_innerkey_update_wk((byte) 0x00, 1, 0, 0, ipIn, innerkey, 8, ipOut, 8);
				int res83 = Ddi.ddi_innerkey_des_decrypt(1, 0, 1, 0, ipIn, msg_summery, 16, ipOut);
				if (res83 == 0) {
					myHandleDeal("DES解密成功", res83);
				} else {
					myHandleDeal("innerkeysingleDES解密失败83", res83);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x02, 2, innerkey3, 24);
				Ddi.ddi_innerkey_update_wk((byte) 0x00, 2, 0, 0, ipIn, innerkey, 8, ipOut, 8);
				int res84 = Ddi.ddi_innerkey_des_decrypt(1, 0, 2, 0, ipIn, msg_summery, 16, ipOut);
				if (res84 == 0) {
					myHandleDeal("DES解密成功", res84);
				} else {
					myHandleDeal("innerkeysingleDES解密失败84", res84);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x00, 0, innerkey, 8);
				Ddi.ddi_innerkey_update_wk((byte) 0x00, 0, 0, 0, ipIn, innerkey, 8, ipOut, 8);
				int res85 = Ddi.ddi_innerkey_des_decrypt(1, 0, 0, 0, ipIn, msg_summery, 16, ipOut);
				if (res85 == 0) {
					myHandleDeal("DES解密成功", res85);
				} else {
					myHandleDeal("innerkeysingleDES解密失败85", res85);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x01, 1, innerkey2, 16);
				Ddi.ddi_innerkey_update_wk((byte) 0x01, 1, 0, 0, ipIn, innerkey2, 16, ipOut, 16);
				int res86 = Ddi.ddi_innerkey_des_decrypt(1, 0, 0, 0, ipIn, msg_summery, 16, ipOut);
				if (res86 == 0) {
					myHandleDeal("DES解密成功", res86);
				} else {
					myHandleDeal("innerkeysingleDES解密失败86", res86);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x02, 2, innerkey3, 24);
				Ddi.ddi_innerkey_update_wk((byte) 0x00, 2, 0, 0, ipIn, innerkey, 8, ipOut, 8);
				int res87 = Ddi.ddi_innerkey_des_decrypt(1, 0, 0, 0, ipIn, msg_summery, 16, ipOut);
				if (res87 == 0) {
					myHandleDeal("DES解密成功", res87);
				} else {
					myHandleDeal("innerkeysingleDES解密失败87", res87);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x02, 2, innerkey3, 24);
				Ddi.ddi_innerkey_update_wk((byte) 0x00, 2, 0, 0, ipIn, innerkey, 8, ipOut, 8);
				int res88 = Ddi.ddi_innerkey_des_decrypt(1, 0, 0, 1, ipIn, msg_summery, 16, ipOut);
				if (res88 == 0) {
					myHandleDeal("DES解密测试成功", res88);
				} else {
					myHandleDeal("innerkeysingleDES解密测试失败88", res88);
				}
				byte[] iv = null;
				Ddi.ddi_innerkey_update_mk((byte) 0x02, 2, innerkey3, 24);
				Ddi.ddi_innerkey_update_wk((byte) 0x00, 2, 0, 0, ipIn, innerkey, 8, ipOut, 8);
				int res333 = Ddi.ddi_innerkey_delete_key(1, 2);
				if (res333 == 0) {
					myHandleDeal("删除工作密钥测试成功", res1);

				}
				int res89 = Ddi.ddi_innerkey_des_decrypt(1, 2, 1, 1, iv, msg_summery, 16, ipOut);
				if (res89 == -6) {
					myHandleDeal("DES解密测试成功", res89);
				} else {
					myHandleDeal("innerkeysingleDES解密测试失败89", res89);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x01, 1, innerkey2, 16);
				Ddi.ddi_innerkey_update_wk((byte) 0x00, 1, 1, 0, ipIn, innerkey2, 8, ipOut, 8);
				int res90 = Ddi.ddi_innerkey_des_decrypt(1, 1, 1, 0, ipIn, msg_summery, 16, ipOut);
				if (res90 == 0) {
					myHandleDeal("DES解密测试成功", res90);
				} else {
					myHandleDeal("innerkeysingleDES解密测试失败90", res90);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x03, 0, innerkey2, 16);
				int res91 = Ddi.ddi_innerkey_nes_sm4_encrypt(0, 0, group, ipIn, msg_summery, msg_summery.length, ipOut,
						leOut);
				if (res91 == 0) {
					myHandleDeal("SM4加密成功", res91);
				} else {
					myHandleDeal("innerkeysingleSM4加密失败91", res91);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x03, 149, innerkey2, 16);
				Ddi.ddi_innerkey_update_wk((byte) 0x03, 149, 0, 0, ipIn, innerkey2, 16, ipOut, 16);
				int res92 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, 0, group, ipIn, msg_summery, msg_summery.length, ipOut,
						leOut);
				if (res92 == 0) {
					myHandleDeal("SM4加密成功", res92);
				} else {
					myHandleDeal("innerkeysingleSM4加密失败92", res92);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x03, 0, innerkey2, 16);
				int res93 = Ddi.ddi_innerkey_nes_sm4_encrypt(0, 0, group1, ipIn, msg_summery, msg_summery.length, ipOut,
						leOut);
				if (res93 == 0) {
					myHandleDeal("SM4加密成功", res93);
				} else {
					myHandleDeal("innerkeysingleSM4加密失败93", res93);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x03, 149, innerkey2, 16);
				Ddi.ddi_innerkey_update_wk((byte) 0x03, 149, 0, 0, ipIn, innerkey2, 16, ipOut, 16);
				int res94 = Ddi.ddi_innerkey_nes_sm4_encrypt(1, 0, group1, ipIn, msg_summery, msg_summery.length, ipOut,
						leOut);
				if (res94 == 0) {
					myHandleDeal("SM4加密成功", res94);
				} else {
					myHandleDeal("innerkeysingleSM4加密失败94", res94);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x03, 149, innerkey2, 16);
				Ddi.ddi_innerkey_update_wk((byte) 0x03, 149, 0, 0, ipIn, innerkey2, 16, ipOut, 16);
				int res95 = Ddi.ddi_innerkey_nes_sm4_decrypt(0, 149, 0, group, ipIn, msg_summery, msg_summery.length,
						ipOut, leOut);
				if (res95 == 0) {
					myHandleDeal("SM4加密成功", res95);
				} else {
					myHandleDeal("innerkeysingleSM4加密失败95", res95);
				}
				Ddi.ddi_innerkey_update_mk((byte) 0x03, 149, innerkey2, 16);
				Ddi.ddi_innerkey_update_wk((byte) 0x03, 149, 0, 0, ipIn, innerkey2, 16, ipOut, 16);
				int res96 = Ddi.ddi_innerkey_nes_sm4_decrypt(1, 0, 0, group, ipIn, msg_summery, msg_summery.length,
						ipOut, leOut);
				if (res96 == 0) {
					myHandleDeal("SM4加密成功", res96);
				} else {
					myHandleDeal("innerkeysingleSM4加密失败96", res96);
				}
//			}
//		};
//		Thread mThread = new Thread(mRunnable);
//		mThread.start();

	}

	private void testend() {
		myHandleDeal("runall测试结束", 0);
		myHandleDeal("pinblock1需要使用测试pin工具进行测试失败", -99);
	}

	/**
	 * AES
	 */
	private void testAesupdatmk1() {
		byte mk_data[] = { 0x11, 0x11, 0x11, 0x11, 0x11, 0x11, 0x11, 0x11, 0x11, 0x11, 0x11, 0x11, 0x11, 0x11, 0x11,
				0x11 };
		String hexByteArray2BinaryStr = ByteUtils.hexByteArray2BinaryStr(mk_data);
		myHandleDeal("testAesupdatmk1测试" , 0);

		String key1 = "A12345678A12345678A12345678A1239";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "A12345678A12345678A32345678A1234";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x04, 0, innerkey1, 16);
		if (res1 == 0) {
			myHandleDeal("AES更新主密钥成功", res1);
			int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x04, 0, 0, 0, ipIn, innerkey2, 16, innerkey1, 16);
			if (res2 == 0) {
				myHandleDeal("AES更新工作密钥成功", res2);
			} else {
				myHandleDeal("Aesupdatmk1更新工作密钥失败", res2);
			}
		} else {
			myHandleDeal("Aesupdatmk1更新主密钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testAesupdatmk2() {
		myHandleDeal("testAesupdatmk2测试", 0);
		String key1 = "12345678901234567890123456789012";
		byte[] Aesupdatmk1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "A12345678A12345678A32345678A1234";
		byte[] Aesupdatmk2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x04, 149, Aesupdatmk1, 16);
		if (res1 == 0) {
			myHandleDeal("AES更新主密钥成功", res1);
			int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x04, 149, 449, 0, ipIn, innerkey2, 16, Aesupdatmk2, 16);
			if (res2 == 0) {
				myHandleDeal("AES更新工作密钥成功", res2);
			} else {
				myHandleDeal("Aesupdatmk2更新工作密钥失败", res2);
			}
		} else {
			myHandleDeal("Aesupdatmk2更新主密钥失败", res1);
		}

	}

	private void testAesupdatmk3() {
		myHandleDeal("testAesupdatmk3测试", 0);
		String key1 = "A12345678A12345678A12345678A12340123456678912345";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "A12345678A12345678A12345678A123422444AABCDEF23120000000000000000";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		byte[] innerkey3 = new byte[32];
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x05, 149, innerkey1, 24);
		if (res1 == 0) {
			myHandleDeal("AES更新主密钥成功", res1);
			int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x05, 149, 449, 0, ipIn, innerkey2, 32, innerkey3, 32);
			if (res2 == 0) {
				myHandleDeal("AES更新工作密钥成功", res2);
			} else {
				myHandleDeal("Aesupdatmk3更新工作密钥失败", res2);
			}
		} else {
			myHandleDeal("Aesupdatmk3更新主密钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testAesupdatmk4() {
		myHandleDeal("testAesupdatmk4测试", 0);
		String key1 = "123456789012345678901234567890123182930348493921";
		byte[] Aesupdatmk41 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "A12345678A12345678A12345678A123422444AABCDEF23120000000000000000";
		byte[] Aesupdatmk42 = ByteUtils.hexString2ByteArray(key2);
		byte[] Aesupdatmk43 = new byte[32];
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x05, 0, Aesupdatmk41, 24);
		if (res1 == 0) {
			myHandleDeal("AES更新主密钥成功", res1);
			int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x05, 0, 0, 0, ipIn, Aesupdatmk42, 32, Aesupdatmk43, 32);
			if (res2 == 0) {
				myHandleDeal("AES更新工作密钥成功", res2);
			} else {
				myHandleDeal("Aesupdatmk4更新工作密钥失败", res2);
			}
		} else {
			myHandleDeal("Aesupdatmk4更新主密钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testAesupdatmk5() {
		myHandleDeal("testAesupdatmk5测试", 0);
		String key1 = "A12345678A12345678A12345678A12340123456678912345123ABCDEF1234562";
		byte[] Aesupdatmk51 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "A12345678A12345678A12345678A1234ABCDEF012345678ABDECF09876542344";
		byte[] Aesupdatmk52 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x06, 149, Aesupdatmk51, 32);
		if (res1 == 0) {
			myHandleDeal("AES更新主密钥成功", res1);

			int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x06, 149, 449, 0, ipIn, Aesupdatmk52, 32, Aesupdatmk51, 32);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (res2 == 0) {
				myHandleDeal("AES更新工作密钥成功", res2);
			} else {
				myHandleDeal("Aesupdatmk5更新工作密钥失败", res2);
			}
		} else {
			myHandleDeal("Aesupdatmk5更新主密钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testAesupdatmk6() {
		myHandleDeal("testAesupdatmk6测试", 0);
		String key1 = "1234567890123456789012345678901231829303484939211122434444556678";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "A12345678A12345678A12345678A1234ABCDEF012345678ABDECF09876542344";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x06, 0, innerkey1, 32);
		if (res1 == 0) {
			myHandleDeal("AES更新主密钥成功", res1);
			int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x06, 0, 0, 0, ipIn, innerkey2, 32, innerkey1, 32);
			if (res2 == 0) {
				myHandleDeal("AES更新工作密钥成功", res2);
			} else {
				myHandleDeal("Aesupdatmk6更新工作密钥失败", res2);
			}
			int res3 = Ddi.ddi_innerkey_update_wk((byte) 0x06, 0, 0, 1, ipIn, innerkey2, 32, innerkey1, 32);
			if (res3 == 0) {
				myHandleDeal("AES更新工作密钥成功", res3);
			} else {
				myHandleDeal("Aesupdatmk6更新工作密钥失败", res3);
			}
		} else {
			myHandleDeal("Aesupdatmk6更新主密钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testAesupdatmk7() {
		myHandleDeal("testAesupdatmk7测试", 0);
		String key1 = "0000000000000000000000000000000000000000000000000000000000000000";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "A12345678A12345678A12345678A1234ABCDEF012345678ABDECF09876542344";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x06, 0, innerkey1, 32);
		if (res1 == 0) {
			myHandleDeal("AES更新主密钥成功", res1);
			int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x06, 0, 0, 0, ipIn, innerkey2, 32, innerkey1, 32);
			if (res2 == 0) {
				myHandleDeal("AES更新工作密钥成功", res2);
			} else {
				myHandleDeal("Aesupdatmk7更新工作密钥失败", res2);
			}
			int res3 = Ddi.ddi_innerkey_update_wk((byte) 0x06, 0, 0, 1, ipIn, innerkey2, 32, innerkey1, 32);
			if (res3 == 0) {
				myHandleDeal("AES更新工作密钥成功", res3);
			} else {
				myHandleDeal("Aesupdatmk7更新工作密钥失败", res3);
			}
		} else {
			myHandleDeal("Aesupdatmk7更新主密钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testAesupdatmk8() {
		myHandleDeal("testAesupdatmk8测试", 0);
		String key1 = "0000000000000000000000000000000000000000000000000000000000000000";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "A12345678A12345678A12345678A1234ABCDEF012345678ABDECF09876542344";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		byte[] innerkey3 = new byte[32];
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x05, 77, innerkey1, 24);
		if (res1 == 0) {
			myHandleDeal("AES更新主密钥成功", res1);
			int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x05, 77, 225, 1, ipIn, innerkey2, 32, innerkey3, 32);
			if (res2 == 0) {
				myHandleDeal("AES更新工作密钥成功", res2);
			} else {
				myHandleDeal("Aesupdatmk8更新工作密钥失败", res2);
			}
		} else {
			myHandleDeal("Aesupdatmk8更新主密钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testAesupdatmk9() {
		myHandleDeal("testAesupdatmk9测试", 0);
		String key1 = "1234567890123456789012345678901231829303484939211122434444556678";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x07, 0, innerkey1, 32);
		if (res1 == -6) {
			myHandleDeal("AES更新主密钥测试成功", res1);

		} else {
			myHandleDeal("Aesupdatmk9更新主密钥测试失败", res1);
		}
		int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x07, 0, 0, 1, ipIn, innerkey1, 32, innerkey1, 32);
		if (res2 == -6) {
			myHandleDeal("AES更新工作密钥测试成功", res2);
		} else {
			myHandleDeal("Aesupdatmk9更新工作密钥测试失败", res2);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testAesupdatmk10() {
		myHandleDeal("testAesupdatmk10测试", 0);
		String key1 = "123456789012345678901234567890123182930348493921";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x05, 150, innerkey1, 24);
		if (res1 == -6) {
			myHandleDeal("AES更新主密钥测试成功", res1);
		} else {
			myHandleDeal("Aesupdatmk10更新主密钥测试失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testAesupdatmk11() {
		myHandleDeal("testAesupdatmk11测试", 0);
		String key1 = "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		String key2 = "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF";
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(key2);
		String key3 = "A12345678A12345678A12345678A1234ABCDEF012345678ABDECF09876542344";
		byte[] innerkey3 = ByteUtils.hexString2ByteArray(key3);
		String key4 = "000000000000000000000000000000000000000000000000FFFFFFFFFFFFFFFF";
		byte[] innerkey4 = ByteUtils.hexString2ByteArray(key4);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_mk((byte) 0x05, 0, innerkey1, 24);
		if (res1 == 0) {
			myHandleDeal("AES更新主密钥成功", res1);
			int res2 = Ddi.ddi_innerkey_update_wk((byte) 0x05, 0, 0, 1, ipIn, innerkey2, 32, innerkey4, 32);
			if (res2 == 0) {
				myHandleDeal("AES更新工作密钥成功", res2);
			} else {
				myHandleDeal("Aesupdatmk11更新工作密钥失败", res2);
			}
		} else {
			myHandleDeal("Aesupdatmk11更新主密钥失败", res1);
		}
		int res3 = Ddi.ddi_innerkey_update_wk((byte) 0x07, 0, 0, 1, ipIn, innerkey2, 32, innerkey4, 32);
		if (res3 == -6) {
			myHandleDeal("AES更新工作密钥测试成功", res3);
		} else {
			myHandleDeal("Aesupdatmk11更新工作密钥测试失败", res3);
		}
		int res4 = Ddi.ddi_innerkey_delete_key(0, 55);
		if (res4 == 0) {
			myHandleDeal("AES删除密钥成功", res4);
			int res5 = Ddi.ddi_innerkey_update_wk((byte) 0x05, 55, 449, 1, ipIn, innerkey2, 32, innerkey4, 32);
			if (res5 == -6) {
				myHandleDeal("AES更新工作密钥测试成功", res5);
			} else {
				myHandleDeal("Aesupdatmk11更新工作密钥测试失败", res5);
			}
			int res6 = Ddi.ddi_innerkey_update_wk((byte) 0x06, 0, 450, 1, ipIn, innerkey3, 32, innerkey4, 32);
			if (res6 == -6) {
				myHandleDeal("AES更新工作密钥测试成功", res6);
			} else {
				myHandleDeal("Aesupdatmk11更新工作密钥测试失败", res6);
			}
		} else {
			myHandleDeal("Aesupdatmk11删除密钥失败", res4);
		}
		Ddi.ddi_innerkey_close();
	}

	private void testAesupdatmk12() {
		myHandleDeal("testAesupdatmk12测试", 0);
		String key1 = "123456789012345678901234567890123182930348493921";
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(key1);
		Ddi.ddi_innerkey_open();
		int res1 = Ddi.ddi_innerkey_update_wk((byte) 0x05, 0, 450, 1, ipIn, innerkey1, 24, innerkey1, 24);
		if (res1 == -6) {
			myHandleDeal("AES更新主密钥成功", res1);
		} else {
			myHandleDeal("Aesupdatmk12更新主密钥失败", res1);
		}
		Ddi.ddi_innerkey_close();
	}
	
	// ddi_pinpad_deal_cmd 如果该接口调用了close，那么devhandles会是固定一个   这个需要到LF502那个项目区运行，应该是DDI.Java文件的不一样吧
	//N5 N3 devhanl返回的设备句柄
	//N5S和N6devhanl返回的是0
	private void testpinpaddealcmd1(){			
		myHandleDeal("testpinpaddealcmd1测试",0);			 
		String input = "0100083131313131313131";
		StringBuilder strBuilder = new StringBuilder(input);
		strBuilder.setCharAt(1, '4');
		String str=strBuilder.toString();	
//		int[] devhandles=new int[16];
		int[] devhandles=new int[64];
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(input);
		
		int[] poutlen=new int[innerkey1.length];		
		byte[] outerkey=new byte[64];
		byte[] outer=new byte[64];
		
		int res1=Ddi.ddi_pinpad_opendevice(0, devhandles);
		if (res1==0 && devhandles.length!=0) {
			myHandleDeal("testpinpadopendevice打开成功",res1);
			int devhanle=devhandles[0];
//			int devhanle=ByteUtils.intarr2int(devhandles);
			Log.v("TAG", "intarr2int返回值"+devhanle);
			
			myHandleDeal("pinpaddealcmd的devhanle："+devhanle,0);
		
			
			int res2=Ddi.ddi_pinpad_deal_cmd(devhanle, 2, 1, innerkey1.length, innerkey1, poutlen, outerkey);			
			if (res2==0 && outerkey.length!=0) {
				outerkey[0]=3;
				String outerdataString=ByteUtils.byteArray2HexString(outerkey);				
				int[] poutlen2=new int[outerkey.length];
				myHandleDeal("pinpaddealcmd加密后转化的数据："+outerdataString,res2);
				int res3=Ddi.ddi_pinpad_deal_cmd(devhanle, 2, 2, outerkey.length, outerkey, poutlen2, outer);
				String outString=ByteUtils.byteArray2HexString(outer);
				//myHandleDeal("pinpaddealcmd加密后转化的数据："+outString,0);
				String result=outString.substring(0, input.length());				
				if (res3==0&&str.equals(result)) {
					myHandleDeal("pinpaddealcmd解密成功数据："+result,res3);
				} else {
					myHandleDeal("pinpaddealcmd解密失败数据：",res3);
				}
			} else {
				myHandleDeal("ddipinpaddeal_cmd加密失败",res2);

			}						
		}
		else {
			myHandleDeal("testpinpadopendevice打开失败",res1);
			
		}
		int res5=Ddi.ddi_pinpad_closedevice(0, devhandles);
		if (res5==0) {
			myHandleDeal("ddi_pinpad_closedevice关闭成功",res5);
		}
		
	}

	// 数据长度为奇数，数据类型为多种
	private void testpinpaddealcmd2() {
		myHandleDeal("testpinpaddealcmd2测试", 0);
		String input = "010009abcdef12345678989";
		StringBuilder strBuilder = new StringBuilder(input);
		strBuilder.setCharAt(1, '4');
		String str = strBuilder.toString();
		int[] devhandles = new int[1];
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(input);
		int[] poutlen = new int[innerkey1.length];
		byte[] outerkey = new byte[64];
		byte[] outer = new byte[64];
		int res1 = Ddi.ddi_pinpad_opendevice(0, devhandles);
		if (res1 == 0 && devhandles.length != 0) {
			myHandleDeal("pinpadopendevice打开成功", res1);
			int devhanle=devhandles[0];
			myHandleDeal("pinpaddealcmd的devhanle：" + devhanle, 0);
			int res2 = Ddi.ddi_pinpad_deal_cmd(devhanle, 2, 1, innerkey1.length, innerkey1, poutlen, outerkey);
			if (res2 == 0 && outerkey.length != 0) {
				outerkey[0] = 3;
				String outerdataString = ByteUtils.byteArray2HexString(outerkey);
				int[] poutlen2 = new int[outerkey.length];
				myHandleDeal("pinpaddealcmd加密后转化的数据：" + outerdataString, res2);
				int res3 = Ddi.ddi_pinpad_deal_cmd(devhanle, 2, 2, outerkey.length, outerkey, poutlen2, outer);
				String outString = ByteUtils.byteArray2HexString(outer);
				// myHandleDeal("pinpaddealcmd加密后转化的数据："+outString,0);
				String result = outString.substring(0, input.length());
				if (res3 == 0 && str.equals(result)) {
					myHandleDeal("pinpaddealcmd解密成功数据：" + result, res3);
				} else {
					myHandleDeal("pinpaddealcmd解密失败数据：" + result, res3);
				}
			} else {
				myHandleDeal("ddipinpaddeal_cmd加密失败", res2);

			}
		} else {
			myHandleDeal("pinpadopendevice打开失败", res1);

		}
		int res5 = Ddi.ddi_pinpad_closedevice(0, devhandles);
		if (res5 == 0) {
			myHandleDeal("ddi_pinpad_closedevice关闭成功", res5);
		}
	}

	// 循环测试20次,如果该接口调用了close
	private void testpinpaddealcmd3() {
		myHandleDeal("testpinpaddealcmd2测试", 0);
		final String input = "0100083131313131313131";
		StringBuilder strBuilder = new StringBuilder(input);
		strBuilder.setCharAt(1, '4');
		final String str = strBuilder.toString();
		final int[] devhandles = new int[1];
		final byte[] innerkey1 = ByteUtils.hexString2ByteArray(input);
		final int[] poutlen = new int[innerkey1.length];
		final byte[] outerkey = new byte[64];
		final byte[] outer = new byte[64];
		Thread thread = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 50; i++) {
					int res1 = Ddi.ddi_pinpad_opendevice(0, devhandles);
					if (res1 == 0 && devhandles.length != 0) {
						myHandleDeal("第" + i + "次" + "pinpadopendevice打开成功", res1);
						int devhanle = devhandles[0];
						myHandleDeal("第" + i + "次" + "pinpaddealcmd的devhanle：" + devhanle, 0);
						int res2 = Ddi.ddi_pinpad_deal_cmd(devhanle, 2, 1, innerkey1.length, innerkey1, poutlen,
								outerkey);
						if (res2 == 0 && outerkey.length != 0) {
							outerkey[0] = 3;
							String outerdataString = ByteUtils.byteArray2HexString(outerkey);
							int[] poutlen2 = new int[outerkey.length];
							myHandleDeal("第" + i + "次" + "pinpaddealcmd加密后转化的数据：" + outerdataString, res2);
							int res3 = Ddi.ddi_pinpad_deal_cmd(devhanle, 2, 2, outerkey.length, outerkey, poutlen2,
									outer);
							String outString = ByteUtils.byteArray2HexString(outer);
							// myHandleDeal("pinpaddealcmd加密后转化的数据："+outString,0);
							String result = outString.substring(0, input.length());
							if (res3 == 0 && str.equals(result)) {
								myHandleDeal("第" + i + "次" + "pinpaddealcmd解密成功数据：" + result, res3);
								int res5 = Ddi.ddi_pinpad_closedevice(0, devhandles);
								if (res5 == 0) {
									myHandleDeal("ddi_pinpad_closedevice关闭成功", res5);
								}
							} else {
								myHandleDeal("第" + i + "次" + "pinpaddealcmd解密失败数据：", res3);
							}
						} else {
							myHandleDeal("第" + i + "次" + "ddipinpaddeal_cmd加密失败", res2);

						}
					} else {
						myHandleDeal("第" + i + "次" + "pinpadopendevice打开失败", res1);

					}

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

	/***
	 * 2019.3.12 新加坡NETS 正常测试
	 * KEK:索引范围存在主密钥索引区，所以和主密钥索引区是一样的
	 * KEK密文计算方式：
	 * 工作秘钥密文计算方式：
	 * 测试前需要安装定制包的证书
	 * 
	 */
	private void testpinpaddealcmd4() {			
		myHandleDeal("testpinpaddealcmd4测试",0);	
		//指定算法
		String input = "01000100";
		//主密钥索引+KEK索引+KEK密文
		String key4 = "02000162040001630500107773E188C5608F936EE207B037148A5B";
		byte[] innerkey4 = ByteUtils.hexString2ByteArray(key4);
		//主密钥索引+主密钥值
		String key5 = "02000162030010F5B703954386E320619D205D8D64EE86";
		byte[] innerkey5 = ByteUtils.hexString2ByteArray(key5);
		//KEK索引+工作秘钥索引+工作秘钥密文
		String key6 = "040001630600010307001026F1C147A46D1FB28EAF1C8382F0ADCA";
		byte[] innerkey6 = ByteUtils.hexString2ByteArray(key6);
		String key7 = "00000000000000000000000000000000";
		String key8 = "2C05499C1728E18E2C05499C1728E18E"; 
		byte[] innerkey7 = ByteUtils.hexString2ByteArray(key7);
		
		
		
		int[] devhandles=new int[64];
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(input);
		int[] poutlen=new int[64];		
		byte[] outerkey=new byte[64];
		byte[] outer=new byte[16];
		String iNPString2  = "ABCDABCDEFABCD";
		byte[] in2 = ByteUtils.hexString2ByteArray(iNPString2);
		int res1=Ddi.ddi_pinpad_opendevice(0, devhandles);						
		if (res1==0 && devhandles.length!=0) {
			myHandleDeal("pinpadopendevice打开成功",res1);
			int devhanle=devhandles[0];
//			int devhanle=ByteUtils.intarr2int(devhandles);
			myHandleDeal("pinpaddealcmd的devhanle："+devhanle,0);
//			指定算法
			int res2=Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 1, innerkey1.length, innerkey1, poutlen, outerkey);
			//主密钥索引+主密钥值
			int res4=Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 2, innerkey5.length, innerkey5, poutlen, outerkey);
			//主密钥索引+KEK索引+KEK密文
			int res6=Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 3, innerkey4.length, innerkey4, poutlen, outerkey);
//			KEK索引+工作秘钥索引+工作秘钥密文
			int res7=Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 4, innerkey6.length, innerkey6, poutlen, outerkey);
			String outerkey1 = ByteUtils.byteArray2HexString(outerkey);
			Ddi.ddi_innerkey_open();
			int res8 = Ddi.ddi_innerkey_des_encrypt(1,3,0,in2,innerkey7,16,outer);
			String byteArray2HexString = ByteUtils.byteArray2HexString(outer);
//			Log.v("TAG", byteArray2HexString);
//			res2==0&&res4==0&&res7==0&&res8==0&&res6==0&&key8.equalsIgnoreCase(byteArray2HexString)
			if (res8==0&&key8.equalsIgnoreCase(byteArray2HexString)) {
				myHandleDeal("pinpaddealcmd4测试成功",res8);	
			} else {
				myHandleDeal("pinpaddealcmd4测试失败"+res2+res4+res6+res7+res8,res8);	
			}
		}	
		Ddi.ddi_innerkey_close();
		int res5=Ddi.ddi_pinpad_closedevice(0, devhandles);
		if (res5==0) {
			myHandleDeal("ddi_pinpad_closedevice关闭成功",res5);
		}
	}

	//KEK索引和主密钥索引一致
		private void testpinpaddealcmd5(){			
			myHandleDeal("testpinpaddealcmd5测试",0);	
			//指定算法
			String input = "01000100";
			//主密钥索引+KEK索引+KEK密文
			String key4 = "02000195040001950500107773E188C5608F936EE207B037148A5B";
			byte[] innerkey4 = ByteUtils.hexString2ByteArray(key4);
			//主密钥索引+主密钥值
			String key5 = "02000195030010F5B703954386E320619D205D8D64EE86";
			byte[] innerkey5 = ByteUtils.hexString2ByteArray(key5);
			//KEK索引+工作秘钥索引+工作秘钥密文
			String key6 = "040001950600010307001026F1C147A46D1FB28EAF1C8382F0ADCA";
			byte[] innerkey6 = ByteUtils.hexString2ByteArray(key6);
			String key7 = "00000000000000000000000000000000";
			String key8 = "2C05499C1728E18E2C05499C1728E18E";
			byte[] innerkey7 = ByteUtils.hexString2ByteArray(key7);
			int[] devhandles=new int[64];
			byte[] innerkey1 = ByteUtils.hexString2ByteArray(input);
			int[] poutlen=new int[64];		
			byte[] outerkey=new byte[64];
			byte[] outer=new byte[16];
			String iNPString2  = "ABCDABCDEFABCD";
			byte[] in2 = ByteUtils.hexString2ByteArray(iNPString2);
			int res1=Ddi.ddi_pinpad_opendevice(0, devhandles);						
			if (res1==0 && devhandles.length!=0) {
				myHandleDeal("pinpadopendevice打开成功",res1);
				int devhanle=devhandles[0];
//				int devhanle=ByteUtils.intarr2int(devhandles);
				myHandleDeal("pinpaddealcmd的devhanle："+devhanle,0);
				//指定算法
				int res2=Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 1, innerkey1.length, innerkey1, poutlen, outerkey);
				//主密钥索引+主密钥值
				int res4=Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 2, innerkey5.length, innerkey5, poutlen, outerkey);
				//主密钥索引+KEK索引+KEK密文
				int res6=Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 3, innerkey4.length, innerkey4, poutlen, outerkey);
				//KEK索引+工作秘钥索引+工作秘钥密文
				int res7=Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 4, innerkey6.length, innerkey6, poutlen, outerkey);
				Ddi.ddi_innerkey_open();
				int res8 = Ddi.ddi_innerkey_des_encrypt(1,3,0,in2,innerkey7,16,outer);
				String byteArray2HexString = ByteUtils.byteArray2HexString(outer);
				if (res2==0&&res4==0&&res6==196625&&res7==0&&res8==0) {
					myHandleDeal("pinpaddealcmd5测试成功",res7);	
				} else {
					myHandleDeal("pinpaddealcmd5测试失败"+res2+res4+res6+res7+res8,res7);	
				}
			}	
			Ddi.ddi_innerkey_close();
			int res5=Ddi.ddi_pinpad_closedevice(0, devhandles);
			if (res5==0) {
				myHandleDeal("ddi_pinpad_closedevice关闭成功",res5);
			}
				}
		
		    //工作秘钥索引错误
			private void testpinpaddealcmd6(){			
				myHandleDeal("testpinpaddealcmd6测试",0);	
				//指定算法
				String input = "01000100";
				//主密钥索引+KEK索引+KEK密文
				String key4 = "02000195040001940500107773E188C5608F936EE207B037148A5B";
				byte[] innerkey4 = ByteUtils.hexString2ByteArray(key4);
				//主密钥索引+主密钥值
				String key5 = "02000195030010F5B703954386E320619D205D8D64EE86";
				byte[] innerkey5 = ByteUtils.hexString2ByteArray(key5);
				//KEK索引+工作秘钥索引+工作秘钥密文
				String key6 = "040001940600010307001026F1C147A46D1FB28EAF1C8382F0ADCA";
				byte[] innerkey6 = ByteUtils.hexString2ByteArray(key6);
				String key7 = "00000000000000000000000000000000";
				String key8 = "2C05499C1728E18E2C05499C1728E18E";
				String key9 = "602C8C093E7895D3602C8C093E7895D3";
				byte[] innerkey7 = ByteUtils.hexString2ByteArray(key7);
				int[] devhandles=new int[64];
				byte[] innerkey1 = ByteUtils.hexString2ByteArray(input);
				byte[] innerkey8 = ByteUtils.hexString2ByteArray(key8);
				int[] poutlen=new int[64];		
				byte[] outerkey=new byte[64];
				byte[] outer=new byte[16];
				String iNPString2  = "ABCDABCDEFABCD";
				byte[] in2 = ByteUtils.hexString2ByteArray(iNPString2);
				int res1=Ddi.ddi_pinpad_opendevice(0, devhandles);						
				if (res1==0 && devhandles.length!=0) {
					myHandleDeal("pinpadopendevice打开成功",res1);
					int devhanle=devhandles[0];
//					int devhanle=ByteUtils.intarr2int(devhandles);
					myHandleDeal("pinpaddealcmd的devhanle："+devhanle,0);
					//指定算法
					int res2=Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 1, innerkey1.length, innerkey1, poutlen, outerkey);
					//主密钥索引+主密钥值
					int res4=Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 2, innerkey5.length, innerkey5, poutlen, outerkey);
					//主密钥索引+KEK索引+KEK密文
					int res6=Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 3, innerkey4.length, innerkey4, poutlen, outerkey);
					//KEK索引+工作秘钥索引+工作秘钥密文
					int res7=Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 4, innerkey6.length, innerkey6, poutlen, outerkey);
					Ddi.ddi_innerkey_open();
					int res9 = Ddi.ddi_innerkey_delete_key(1, 0);
					if (res9==0) {
						myHandleDeal("pinpadopendevice5删除秘钥成功",res9);
						int res0 = Ddi.ddi_innerkey_update_mk((byte) 0x01, 75, innerkey8, innerkey8.length);
						myHandleDeal("group120更新主密钥成功", res0);
						int res10 = Ddi.ddi_innerkey_update_wk((byte) 0x01, 75, 0, 0, ipIn, innerkey8, innerkey8.length, outer, 16);
						int res8 = Ddi.ddi_innerkey_des_encrypt(1,0,0,in2,innerkey7,16,outer);
						String byteArray2HexString = ByteUtils.byteArray2HexString(outer);
						
						if (res2==0&&res4==0&&res6==0&&res7==0&&res8==0&&byteArray2HexString.equalsIgnoreCase(key9)) {
							myHandleDeal("pinpaddealcmd4测试成功",res7);	
						} else {
							
							myHandleDeal("pinpaddealcmd4测试失败"+res2+res4+res6+res7+res8,res7);	
						}
						
					} else {
						myHandleDeal("pinpadopendevice5删除秘钥失败",res9);

					}
				}	
				Ddi.ddi_innerkey_close();
				int res5=Ddi.ddi_pinpad_closedevice(0, devhandles);
				if (res5==0) {
					myHandleDeal("ddi_pinpad_closedevice关闭成功",res5);
				}
			}
			//指定算法错误
			private void testpinpaddealcmd7(){			
				myHandleDeal("testpinpaddealcmd7测试",0);	
				//指定算法
				String input = "01000101";
				//主密钥索引+KEK索引+KEK密文
				String key4 = "02000195040001940500107773E188C5608F936EE207B037148A5B";
				byte[] innerkey4 = ByteUtils.hexString2ByteArray(key4);
				//主密钥索引+主密钥值
				String key5 = "02000195030010F5B703954386E320619D205D8D64EE86";
				byte[] innerkey5 = ByteUtils.hexString2ByteArray(key5);
				//KEK索引+工作秘钥索引+工作秘钥密文
				String key6 = "040001940600010307001026F1C147A46D1FB28EAF1C8382F0ADCA";
				byte[] innerkey6 = ByteUtils.hexString2ByteArray(key6);
				String key7 = "00000000000000000000000000000000";
				String key8 = "2C05499C1728E18E2C05499C1728E18E";
				byte[] innerkey7 = ByteUtils.hexString2ByteArray(key7);
				int[] devhandles=new int[64];
				byte[] innerkey1 = ByteUtils.hexString2ByteArray(input);
				int[] poutlen=new int[64];		
				byte[] outerkey=new byte[64];
				byte[] outer=new byte[16];
				String iNPString2  = "ABCDABCDEFABCD";
				byte[] in2 = ByteUtils.hexString2ByteArray(iNPString2);
				int res1=Ddi.ddi_pinpad_opendevice(0, devhandles);						
				if (res1==0 && devhandles.length!=0) {
					myHandleDeal("pinpadopendevice打开成功",res1);
					int devhanle=devhandles[0];
//					int devhanle=ByteUtils.intarr2int(devhandles);
					myHandleDeal("pinpaddealcmd的devhanle："+devhanle,0);
					//指定算法
					int res2=Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 1, innerkey1.length, innerkey1, poutlen, outerkey);
					//主密钥索引+主密钥值
					int res4=Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 2, innerkey5.length, innerkey5, poutlen, outerkey);
					//主密钥索引+KEK索引+KEK密文
					int res6=Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 3, innerkey4.length, innerkey4, poutlen, outerkey);
					//KEK索引+工作秘钥索引+工作秘钥密文
					int res7=Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 4, innerkey6.length, innerkey6, poutlen, outerkey);
					Ddi.ddi_innerkey_open();
					int res8 = Ddi.ddi_innerkey_des_encrypt(1,3,0,in2,innerkey7,16,outer);
					String byteArray2HexString = ByteUtils.byteArray2HexString(outer);
					if (res2==196609&&res4==0&&res6==0&&res7==0&&res8==0&&key8.equalsIgnoreCase(byteArray2HexString)) {
						myHandleDeal("pinpaddealcmd4测试成功",res7);	
					} else {
						
						myHandleDeal("pinpaddealcmd4测试失败"+res2+".."+res4+".."+res6+res7+res8,res7);	
					}
				}	
				Ddi.ddi_innerkey_close();
				int res5=Ddi.ddi_pinpad_closedevice(0, devhandles);
				if (res5==0) {
					myHandleDeal("ddi_pinpad_closedevice关闭成功",res5);
				}
			}
			//KEK索引为00,主密钥为4一直95
			private void testpinpaddealcmd8(){			
				myHandleDeal("testpinpaddealcmd8测试",0);	
				//指定算法
				String input = "01000100";
				//主密钥索引+KEK索引+KEK密文
				String key4 = "02000101040001000500107773E188C5608F936EE207B037148A5B";
				byte[] innerkey4 = ByteUtils.hexString2ByteArray(key4);
				//主密钥索引+主密钥值
				String key5 = "02000101030010F5B703954386E320619D205D8D64EE86";
				byte[] innerkey5 = ByteUtils.hexString2ByteArray(key5);
				//KEK索引+工作秘钥索引+工作秘钥密文
				String key6 = "040001000600010307001026F1C147A46D1FB28EAF1C8382F0ADCA";
				byte[] innerkey6 = ByteUtils.hexString2ByteArray(key6);
				String key7 = "00000000000000000000000000000000";
				String key8 = "2C05499C1728E18E2C05499C1728E18E";
				byte[] innerkey7 = ByteUtils.hexString2ByteArray(key7);
				int[] devhandles=new int[64];
				byte[] innerkey1 = ByteUtils.hexString2ByteArray(input);
				int[] poutlen=new int[64];		
				byte[] outerkey=new byte[64];
				byte[] outer=new byte[16];
				String iNPString2  = "ABCDABCDEFABCD";
				byte[] in2 = ByteUtils.hexString2ByteArray(iNPString2);
				int res1=Ddi.ddi_pinpad_opendevice(0, devhandles);						
				if (res1==0 && devhandles.length!=0) {
					myHandleDeal("pinpadopendevice打开成功",res1);
					int devhanle=devhandles[0];
//					int devhanle=ByteUtils.intarr2int(devhandles);
					myHandleDeal("pinpaddealcmd的devhanle："+devhanle,0);
					//指定算法
					int res2=Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 1, innerkey1.length, innerkey1, poutlen, outerkey);
					//主密钥索引+主密钥值
					int res4=Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 2, innerkey5.length, innerkey5, poutlen, outerkey);
					//主密钥索引+KEK索引+KEK密文
					int res6=Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 3, innerkey4.length, innerkey4, poutlen, outerkey);
					//KEK索引+工作秘钥索引+工作秘钥密文
					int res7=Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 4, innerkey6.length, innerkey6, poutlen, outerkey);
					Ddi.ddi_innerkey_open();
					int res8 = Ddi.ddi_innerkey_des_encrypt(1,3,0,in2,innerkey7,16,outer);
					String byteArray2HexString = ByteUtils.byteArray2HexString(outer);
					if (res2==0&&res4==0&&res6==0&&res7==0&&res8==0&&key8.equalsIgnoreCase(byteArray2HexString)) {
						myHandleDeal("pinpaddealcmd4测试成功",res7);	
					} else {
						myHandleDeal("pinpaddealcmd4测试失败"+res2+res4+res6+res7+res8,res7);	
					}
				}	
				Ddi.ddi_innerkey_close();
				int res5=Ddi.ddi_pinpad_closedevice(0, devhandles);
				if (res5==0) {
					myHandleDeal("ddi_pinpad_closedevice关闭成功",res5);
				}
			}
			//KEK索引超标
			private void testpinpaddealcmd9(){			
				myHandleDeal("testpinpaddealcmd9测试",0);	
				//指定算法
				String input = "01000100";
				//主密钥索引+KEK索引+KEK密文
				String key4 = "02000195040001960500107773E188C5608F936EE207B037148A5B";
				byte[] innerkey4 = ByteUtils.hexString2ByteArray(key4);
				//主密钥索引+主密钥值
				String key5 = "02000195030010F5B703954386E320619D205D8D64EE86";
				byte[] innerkey5 = ByteUtils.hexString2ByteArray(key5);
				//KEK索引+工作秘钥索引+工作秘钥密文
				String key6 = "040001960600010307001026F1C147A46D1FB28EAF1C8382F0ADCA";
				byte[] innerkey6 = ByteUtils.hexString2ByteArray(key6);
				String key7 = "00000000000000000000000000000000";
				String key8 = "2C05499C1728E18E2C05499C1728E18E";
				byte[] innerkey7 = ByteUtils.hexString2ByteArray(key7);
				int[] devhandles=new int[64];
				byte[] innerkey1 = ByteUtils.hexString2ByteArray(input);
				int[] poutlen=new int[64];		
				byte[] outerkey=new byte[64];
				byte[] outer=new byte[16];
				String iNPString2  = "ABCDABCDEFABCD";
				byte[] in2 = ByteUtils.hexString2ByteArray(iNPString2);
				int res1=Ddi.ddi_pinpad_opendevice(0, devhandles);						
				if (res1==0 && devhandles.length!=0) {
					myHandleDeal("pinpadopendevice打开成功",res1);
//					int devhanle=ByteUtils.intarr2int(devhandles);
					int devhanle=devhandles[0];
					myHandleDeal("pinpaddealcmd的devhanle："+devhanle,0);
					//指定算法
					int res2=Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 1, innerkey1.length, innerkey1, poutlen, outerkey);
					//主密钥索引+主密钥值
					int res4=Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 2, innerkey5.length, innerkey5, poutlen, outerkey);
					//主密钥索引+KEK索引+KEK密文
					int res6=Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 3, innerkey4.length, innerkey4, poutlen, outerkey);
					//KEK索引+工作秘钥索引+工作秘钥密文
					int res7=Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 4, innerkey6.length, innerkey6, poutlen, outerkey);
					Ddi.ddi_innerkey_open();
					int res8 = Ddi.ddi_innerkey_des_encrypt(1,3,0,in2,innerkey7,16,outer);
					String byteArray2HexString = ByteUtils.byteArray2HexString(outer);
					if (res2==0&&res4==0&&res6==196626&&res7==196627&&res8==0&&key8.equalsIgnoreCase(byteArray2HexString)) {
						myHandleDeal("pinpaddealcmd4测试成功",res7);	
					} else {
						myHandleDeal("pinpaddealcmd4测试失败"+res2+res4+res6+res7+res8,res7);	
					}
				}	
				Ddi.ddi_innerkey_close();
				int res5=Ddi.ddi_pinpad_closedevice(0, devhandles);
				if (res5==0) {
					myHandleDeal("ddi_pinpad_closedevice关闭成功",res5);
				}
			}
			//循环压力测试
			private void testpinpaddealcmd10(){			
				myHandleDeal("testpinpaddealcmd10测试",0);	
				//指定算法
				String input = "01000100";
				//主密钥索引+KEK索引+KEK密文
				String key4 = "02000195040001940500107773E188C5608F936EE207B037148A5B";
				byte[] innerkey4 = ByteUtils.hexString2ByteArray(key4);
				//主密钥索引+主密钥值
				String key5 = "02000195030010F5B703954386E320619D205D8D64EE86";
				byte[] innerkey5 = ByteUtils.hexString2ByteArray(key5);
				//KEK索引+工作秘钥索引+工作秘钥密文
				String key6 = "040001940600010307001026F1C147A46D1FB28EAF1C8382F0ADCA";
				byte[] innerkey6 = ByteUtils.hexString2ByteArray(key6);
				String key7 = "00000000000000000000000000000000";
				String key8 = "2C05499C1728E18E2C05499C1728E18E";
				byte[] innerkey7 = ByteUtils.hexString2ByteArray(key7);
				int[] devhandles=new int[64];
				byte[] innerkey1 = ByteUtils.hexString2ByteArray(input);
				int[] poutlen=new int[64];		
				byte[] outerkey=new byte[64];
				byte[] outer=new byte[16];
				String iNPString2  = "ABCDABCDEFABCD";
				byte[] in2 = ByteUtils.hexString2ByteArray(iNPString2);
				int res1=Ddi.ddi_pinpad_opendevice(0, devhandles);						
				if (res1==0 && devhandles.length!=0) {
					myHandleDeal("pinpadopendevice打开成功",res1);
//					int devhanle=ByteUtils.intarr2int(devhandles);
					int devhanle=devhandles[0];
					myHandleDeal("pinpaddealcmd的devhanle："+devhanle,0);
					for (int i = 0; i < 50; i++) {
						//指定算法
						int res2=Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 1, innerkey1.length, innerkey1, poutlen, outerkey);
						//主密钥索引+主密钥值
						int res4=Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 2, innerkey5.length, innerkey5, poutlen, outerkey);
						//主密钥索引+KEK索引+KEK密文
						int res6=Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 3, innerkey4.length, innerkey4, poutlen, outerkey);
						//KEK索引+工作秘钥索引+工作秘钥密文
						int res7=Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 4, innerkey6.length, innerkey6, poutlen, outerkey);
						Ddi.ddi_innerkey_open();
						int res8 = Ddi.ddi_innerkey_des_encrypt(1,3,0,in2,innerkey7,16,outer);
						String byteArray2HexString = ByteUtils.byteArray2HexString(outer);
						if (res2==0&&res4==0&&res6==0&&res7==0&&res8==0&&key8.equalsIgnoreCase(byteArray2HexString)) {
							myHandleDeal("pinpaddealcmd4测试成功"+i,res7);	
						} else {
							myHandleDeal("pinpaddealcmd4测试失败"+res2+res4+res6+res7+res8,res7);	
						}
						
					}
									
				}	
				Ddi.ddi_innerkey_close();
				int res5=Ddi.ddi_pinpad_closedevice(0, devhandles);
				if (res5==0) {
					myHandleDeal("ddi_pinpad_closedevice关闭成功",res5);
				}
			}
			
		
			/***
			 * 	新加坡nest秘钥测试
			
			TMK：AD935DB2B5CE44C485363FE350B4D409
			KEK="98FBAE3261F2A268A7E607349E462C85"
			Session Key = 4B11B077F697D614CCD84DB7D45E4AC0
			//常规测试
			 */
	private void testpinpaddealcmd35() {
		myHandleDeal("testpinpaddealcmd35测试", 0);
		// 指定算法 step 1
		String input = "01000100";
		// 主密钥索引+KEK索引+KEK密文
		String KEK = "AE39DED87C89262D790863DA53284FD2";
		String key4 = "02000195" + "04000194" + "050010" + KEK;
		byte[] innerkey4 = ByteUtils.hexString2ByteArray(key4);
		// 主密钥索引+主密钥值
		String TMK = "AD935DB2B5CE44C485363FE350B4D409";
		String key5 = "02000195" + "030010" + TMK;
		byte[] innerkey5 = ByteUtils.hexString2ByteArray(key5);
		// KEK索引+工作秘钥索引+工作秘钥密文
		String TWK = "AE39DED87C89262D790863DA53284FD2";
		String key6 = "04000194" + "06000103" + "070010" + TWK;
		byte[] innerkey6 = ByteUtils.hexString2ByteArray(key6);

		String key7 = "00000000000000000000000000000000";
		String key8 = "8E484EEA6FAC33F98E484EEA6FAC33F9";
		byte[] innerkey7 = ByteUtils.hexString2ByteArray(key7);
		// step 5
		String KEKindex = "08000194";
		String GKMindex = "09000193";
		String bseedindex = "09000192";
		String IV = "0A00080000000000000000";
		String GKMendata = "0B0018" + "CD565236EC13F25A4F37FBDE4C021C2BD2BA7C59F1C8A405";
		String bseedendata = "0B0018" + "24C295A9E8121C3DD60C55379F808F46DF6E63D6A2E39115";
		// GMK
		byte[] innerkey8 = ByteUtils.hexString2ByteArray(KEKindex + GKMindex + IV + GKMendata);
		// bseed
		byte[] innerkey9 = ByteUtils.hexString2ByteArray(KEKindex + bseedindex + IV + bseedendata);
		// step 6
		String GKM6index = "0C000193";
		String bseed6index = "0D000192";
		String Sessionkeyindex = "0E000100";
		String IV6 = "0A0008" + "0000000000000000";
		String CSNCANdata = "0F0010" + "309100E9E86A01091111737999609822";
		String TRNCRNdata = "100010" + "862314A34A6061CC387B358800F27F24";
		byte[] innerkey10 = ByteUtils
				.hexString2ByteArray(GKM6index + bseed6index + Sessionkeyindex + IV6 + CSNCANdata + TRNCRNdata);
		//
		int[] devhandles = new int[64];
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(input);
		int[] poutlen = new int[64];
		byte[] outerkey = new byte[64];
		byte[] outer = new byte[16];
		String iNPString2 = "ABCDABCDEFABCD";
		byte[] in2 = ByteUtils.hexString2ByteArray(iNPString2);
		int res1 = Ddi.ddi_pinpad_opendevice(0, devhandles);
		if (res1 == 0 && devhandles.length != 0) {
			myHandleDeal("pinpaddealcmd35打开成功", res1);
//				
			int devhanle = devhandles[0];
			myHandleDeal("pinpaddealcmd35的devhanle：" + devhanle, 0);
			// 指定算法
			int res2 = Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 1, innerkey1.length, innerkey1, poutlen, outerkey);
			// 主密钥索引+主密钥值
			int res4 = Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 2, innerkey5.length, innerkey5, poutlen, outerkey);
			// 主密钥索引+KEK索引+KEK密文
			int res6 = Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 3, innerkey4.length, innerkey4, poutlen, outerkey);
			// KEK索引+工作秘钥索引+工作秘钥密文
			int res7 = Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 4, innerkey6.length, innerkey6, poutlen, outerkey);
			// KEK索引+GKM索引+初始化向量（全0）+密文数据
			int res9 = Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 5, innerkey8.length, innerkey8, poutlen, outerkey);
			// KEK索引+base索引+初始化向量（全0）+密文数据
			int res10 = Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 5, innerkey9.length, innerkey9, poutlen, outerkey);
			// GKM索引+base索引+更 新 的 Session Key 索引+初始化向量（全0）+CSN+CAN数据+TRN+CRN数 据
			int res11 = Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 6, innerkey10.length, innerkey10, poutlen, outerkey);
			Ddi.ddi_innerkey_open();
			int res8 = Ddi.ddi_innerkey_des_encrypt(1, 0, 0, in2, innerkey7, 16, outer);
			String byteArray2HexString = ByteUtils.byteArray2HexString(outer);
			Log.v("TAG", byteArray2HexString);
			if (res2 == 0 && res4 == 0 && res6 == 0 && res7 == 0 && res8 == 0&& res9 == 0&& res10 == 0&& res11 == 0
					&& key8.equalsIgnoreCase(byteArray2HexString)) {
				myHandleDeal("pinpaddealcmd35测试成功", res11);
			} else {
				myHandleDeal(byteArray2HexString + "pinpaddealcmd35测试失败" + res2 + ".." + res4 + ".." + res6 + ".." + res7
						+ ".." + res8 + ".." + res9 + ".." + res10 + ".." + res11, res11);
			}
		}
		Ddi.ddi_innerkey_close();
		int res5 = Ddi.ddi_pinpad_closedevice(0, devhandles);
		if (res5 == 0) {
			myHandleDeal("pinpaddealcmd35关闭成功", res5);
		}
	}
	//session key最大只能支持255索引
	private void testpinpaddealcmd36() {
		myHandleDeal("testpinpaddealcmd36测试", 0);
		// 指定算法 step 1
		String input = "01000100";
		// 主密钥索引+KEK索引+KEK密文
		String KEK = "AE39DED87C89262D790863DA53284FD2";
		String key4 = "02000195" + "04000194" + "050010" + KEK;
		byte[] innerkey4 = ByteUtils.hexString2ByteArray(key4);
		// 主密钥索引+主密钥值
		String TMK = "AD935DB2B5CE44C485363FE350B4D409";
		String key5 = "02000195" + "030010" + TMK;
		byte[] innerkey5 = ByteUtils.hexString2ByteArray(key5);
		// KEK索引+工作秘钥索引+工作秘钥密文
		String TWK = "AE39DED87C89262D790863DA53284FD2";
		String key6 = "04000194" + "06000103" + "070010" + TWK;
		byte[] innerkey6 = ByteUtils.hexString2ByteArray(key6);
		
		String key7 = "00000000000000000000000000000000";
		String key8 = "8E484EEA6FAC33F98E484EEA6FAC33F9";
		byte[] innerkey7 = ByteUtils.hexString2ByteArray(key7);
		// step 5
		String KEKindex = "08000194";
		String GKMindex = "09000193";
		String bseedindex = "09000192";
		String IV = "0A00080000000000000000";
		String GKMendata = "0B0018" + "CD565236EC13F25A4F37FBDE4C021C2BD2BA7C59F1C8A405";
		String bseedendata = "0B0018" + "24C295A9E8121C3DD60C55379F808F46DF6E63D6A2E39115";
		// GMK
		byte[] innerkey8 = ByteUtils.hexString2ByteArray(KEKindex + GKMindex + IV + GKMendata);
		// bseed
		byte[] innerkey9 = ByteUtils.hexString2ByteArray(KEKindex + bseedindex + IV + bseedendata);
		// step 6
		String GKM6index = "0C000193";
		String bseed6index = "0D000192";
		String Sessionkeyindex = "0E0001FF";
		String IV6 = "0A0008" + "0000000000000000";
		String CSNCANdata = "0F0010" + "309100E9E86A01091111737999609822";
		String TRNCRNdata = "100010" + "862314A34A6061CC387B358800F27F24";
		byte[] innerkey10 = ByteUtils
				.hexString2ByteArray(GKM6index + bseed6index + Sessionkeyindex + IV6 + CSNCANdata + TRNCRNdata);
		//
		int[] devhandles = new int[64];
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(input);
		int[] poutlen = new int[64];
		byte[] outerkey = new byte[64];
		byte[] outer = new byte[16];
		String iNPString2 = "ABCDABCDEFABCD";
		byte[] in2 = ByteUtils.hexString2ByteArray(iNPString2);
		int res1 = Ddi.ddi_pinpad_opendevice(0, devhandles);
		if (res1 == 0 && devhandles.length != 0) {
			myHandleDeal("pinpadopendevice打开成功", res1);
			int devhanle = devhandles[0];
			myHandleDeal("pinpaddealcmd36的devhanle：" + devhanle, 0);
			// 指定算法
			int res2 = Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 1, innerkey1.length, innerkey1, poutlen, outerkey);
			// 主密钥索引+主密钥值
			int res4 = Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 2, innerkey5.length, innerkey5, poutlen, outerkey);
			// 主密钥索引+KEK索引+KEK密文
			int res6 = Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 3, innerkey4.length, innerkey4, poutlen, outerkey);
			// KEK索引+工作秘钥索引+工作秘钥密文
			int res7 = Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 4, innerkey6.length, innerkey6, poutlen, outerkey);
			// KEK索引+GKM索引+初始化向量（全0）+密文数据
			int res9 = Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 5, innerkey8.length, innerkey8, poutlen, outerkey);
			// KEK索引+base索引+初始化向量（全0）+密文数据
			int res10 = Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 5, innerkey9.length, innerkey9, poutlen, outerkey);
			// GKM索引+base索引+更 新 的 Session Key 索引+初始化向量（全0）+CSN+CAN数据+TRN+CRN数 据
			int res11 = Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 6, innerkey10.length, innerkey10, poutlen, outerkey);
			Ddi.ddi_innerkey_open();
			int res8 = Ddi.ddi_innerkey_des_encrypt(1, 255, 0, in2, innerkey7, 16, outer);
			String byteArray2HexString = ByteUtils.byteArray2HexString(outer);
			Log.v("TAG", byteArray2HexString);
			if (res2 == 0 && res4 == 0 && res6 == 0 && res7 == 0 && res8 == 0&& res9 == 0&& res10 == 0&& res11 == 0
					&& key8.equalsIgnoreCase(byteArray2HexString)) {
				myHandleDeal("pinpaddealcmd36测试成功", res11);
			} else {
				myHandleDeal(byteArray2HexString + "pinpaddealcmd36测试失败" + res2 + ".." + res4 + ".." + res6 + ".." + res7
						+ ".." + res8 + ".." + res9 + ".." + res10 + ".." + res11, res11);
			}
		}
		Ddi.ddi_innerkey_close();
		int res5 = Ddi.ddi_pinpad_closedevice(0, devhandles);
		if (res5 == 0) {
			myHandleDeal("pinpaddealcmd36关闭成功", res5);
		}
	}
	//主密钥和GMK，basssed秘钥一样
	private void testpinpaddealcmd37() {
		myHandleDeal("testpinpaddealcmd37测试", 0);
		// 指定算法 step 1
		String input = "01000100";
		// 主密钥索引+KEK索引+KEK密文
		String KEK = "AE39DED87C89262D790863DA53284FD2";
		String key4 = "02000100" + "04000195" + "050010" + KEK;
		final byte[] innerkey4 = ByteUtils.hexString2ByteArray(key4);
		// 主密钥索引+主密钥值
		String TMK = "AD935DB2B5CE44C485363FE350B4D409";
		String key5 = "02000100" + "030010" + TMK;
		final byte[] innerkey5 = ByteUtils.hexString2ByteArray(key5);
		// KEK索引+工作秘钥索引+工作秘钥密文
		String TWK = "AE39DED87C89262D790863DA53284FD2";
		String key6 = "04000195" + "06000103" + "070010" + TWK;
		final byte[] innerkey6 = ByteUtils.hexString2ByteArray(key6);
		
		String key7 = "00000000000000000000000000000000";
		final String key8 = "8E484EEA6FAC33F98E484EEA6FAC33F9";
		final byte[] innerkey7 = ByteUtils.hexString2ByteArray(key7);
		// step 5
		String KEKindex = "08000195";
		String GKMindex = "09000194";
		String bseedindex = "09000195";
		String IV = "0A00080000000000000000";
		String GKMendata = "0B0018" + "CD565236EC13F25A4F37FBDE4C021C2BD2BA7C59F1C8A405";
		String bseedendata = "0B0018" + "24C295A9E8121C3DD60C55379F808F46DF6E63D6A2E39115";
		// GMK
		final byte[] innerkey8 = ByteUtils.hexString2ByteArray(KEKindex + GKMindex + IV + GKMendata);
		// bseed
		final byte[] innerkey9 = ByteUtils.hexString2ByteArray(KEKindex + bseedindex + IV + bseedendata);
		// step 6
		String GKM6index = "0C000194";
		String bseed6index = "0D000195";
		String Sessionkeyindex = "0E0001FF";
		String IV6 = "0A0008" + "0000000000000000";
		String CSNCANdata = "0F0010" + "309100E9E86A01091111737999609822";
		String TRNCRNdata = "100010" + "862314A34A6061CC387B358800F27F24";
		final byte[] innerkey10 = ByteUtils
				.hexString2ByteArray(GKM6index + bseed6index + Sessionkeyindex + IV6 + CSNCANdata + TRNCRNdata);
		//
		final int[] devhandles = new int[64];
		final byte[] innerkey1 = ByteUtils.hexString2ByteArray(input);
		final int[] poutlen = new int[64];
		final byte[] outerkey = new byte[64];
		final byte[] outer = new byte[16];
		String iNPString2 = "ABCDABCDEFABCD";
		final byte[] in2 = ByteUtils.hexString2ByteArray(iNPString2);
		
		
		Thread thread = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 100; i++) {
					int res1 = Ddi.ddi_pinpad_opendevice(0, devhandles);
					if (res1 == 0 && devhandles.length != 0) {
						myHandleDeal("pinpadopendevice打开成功", res1);
						int devhanle = devhandles[0];
						myHandleDeal("pinpaddealcmd37的devhanle：" + devhanle, 0);
						// 指定算法
						int res2 = Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 1, innerkey1.length, innerkey1, poutlen,
								outerkey);
						// 主密钥索引+主密钥值
						int res4 = Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 2, innerkey5.length, innerkey5, poutlen,
								outerkey);
						// 主密钥索引+KEK索引+KEK密文
						int res6 = Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 3, innerkey4.length, innerkey4, poutlen,
								outerkey);
						// KEK索引+工作秘钥索引+工作秘钥密文
						int res7 = Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 4, innerkey6.length, innerkey6, poutlen,
								outerkey);
						// KEK索引+GKM索引+初始化向量（全0）+密文数据
						int res9 = Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 5, innerkey8.length, innerkey8, poutlen,
								outerkey);
						// KEK索引+base索引+初始化向量（全0）+密文数据
						int res10 = Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 5, innerkey9.length, innerkey9, poutlen,
								outerkey);
						// GKM索引+base索引+更 新 的 Session Key 索引+初始化向量（全0）+CSN+CAN数据+TRN+CRN数 据
						int res11 = Ddi.ddi_pinpad_deal_cmd(devhanle, 3, 6, innerkey10.length, innerkey10, poutlen,
								outerkey);
						Ddi.ddi_innerkey_open();
						int res8 = Ddi.ddi_innerkey_des_encrypt(1, 255, 0, in2, innerkey7, 16, outer);
						String byteArray2HexString = ByteUtils.byteArray2HexString(outer);
						Log.v("TAG", byteArray2HexString);
						if (res2 == 0 && res4 == 0 && res6 == 0 && res7 == 0 && res8 == 0 && res9 == 0 && res10 == 0
								&& res11 == 0 && key8.equalsIgnoreCase(byteArray2HexString)) {
							myHandleDeal("pinpaddealcmd37测试成功", res11);
						} else {
							myHandleDeal(
									byteArray2HexString + "pinpaddealcmd37测试失败" + res2 + ".." + res4 + ".." + res6
											+ ".." + res7 + ".." + res8 + ".." + res9 + ".." + res10 + ".." + res11,
									res11);
						}
					}
					Ddi.ddi_innerkey_close();
					int res5 = Ddi.ddi_pinpad_closedevice(0, devhandles);
					if (res5 == 0) {
						myHandleDeal("pinpaddealcmd37关闭成功", res5);
					} 
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

	// 检测是否有RSA公私钥 目前是需要下载嘉联秘钥后才能测试
	// 检测公钥
	private void testpinpaddealcmd11() {
		myHandleDeal("testpinpaddealcmd11测试", 0);
		int mode = 00000000;
		int regionid = 0;
		int keyid = 0;
		int[] devhandles = new int[64];
		int res1 = Ddi.ddi_pinpad_opendevice(0, devhandles);
		if (res1 == 0 && devhandles.length != 0) {
			myHandleDeal("pinpadopendevice打开成功", res1);
			int devhanle = ByteUtils.intarr2int(devhandles);
			myHandleDeal("pinpaddealcmd的devhanle：" + devhanle, 0);
			int res2 = Ddi.ddi_pinpad_querykey(devhanle, mode, regionid, keyid);
			if (res2 == 0) {
				myHandleDeal("pinpaddealcmd11RSA公钥存在测试成功11", res2);
			} else {
				myHandleDeal("pinpaddealcmd11RSA嘉联公钥存在测试失败11", res2);

			}
		}
		int res5 = Ddi.ddi_pinpad_closedevice(0, devhandles);
		if (res5 == 0) {
			myHandleDeal("pinpaddealcmd11ddi_pinpad_closedevice关闭成功11", res5);
		}
		int res6 = Ddi.ddi_pinpad_closedevice(0, devhandles);
		if (res6 == 0) {
			myHandleDeal("pinpaddealcmd11ddi_pinpad_closedevice关闭成功11", res6);
		}

	}
	
	// 检测是否有RSA公私钥 目前是需要下载嘉联秘钥后才能测试
	// 验证RSA私钥
	private void testpinpaddealcmd12() {
		myHandleDeal("testpinpaddealcmd12测试", 0);
		int mode = 00000002;
		int regionid = 0;
		int keyid = 0;
		int[] devhandles = new int[64];
		int res1 = Ddi.ddi_pinpad_opendevice(0, devhandles);
		if (res1 == 0 && devhandles.length != 0) {
			myHandleDeal("pinpadopendevice打开成功12", res1);
			int devhanle = ByteUtils.intarr2int(devhandles);
			myHandleDeal("pinpaddealcmd的devhanle：" + devhanle, 0);
			int res2 = Ddi.ddi_pinpad_querykey(devhanle, mode, regionid, keyid);
			if (res2 == 0) {
				myHandleDeal("RSA私钥存在测试成功12", res2);
			} else {
				myHandleDeal("RSA私钥存在测试失败12", res2);

			}
		}
		int res5 = Ddi.ddi_pinpad_closedevice(0, devhandles);
		if (res5 == 0) {
			myHandleDeal("ddi_pinpad_closedevice关闭成功12", res5);
		}

	}

	// SM2私钥
	private void testpinpaddealcmd13() {
		myHandleDeal("testpinpaddealcmd13测试", 0);
		int mode = 00000003;
		int regionid = 0;
		int keyid = 0;
		int[] devhandles = new int[64];
		int res1 = Ddi.ddi_pinpad_opendevice(0, devhandles);
		if (res1 == 0 && devhandles.length != 0) {
			myHandleDeal("pinpadopendevice打开成功13", res1);
			int devhanle = ByteUtils.intarr2int(devhandles);
			myHandleDeal("pinpaddealcmd的devhanle13：" + devhanle, 0);
			int res2 = Ddi.ddi_pinpad_querykey(devhanle, mode, regionid, keyid);
			if (res2 == 0) {
				myHandleDeal("SM2私钥存在测试成功13", res2);
			} else {
				myHandleDeal("SM2私钥存在测试失败13", res2);

			}
		}
		int res5 = Ddi.ddi_pinpad_closedevice(0, devhandles);
		if (res5 == 0) {
			myHandleDeal("ddi_pinpad_closedevice关闭成功13", res5);
		}

	}
	
	/***
	 * 交行更新RSA算法DES加密类型的主秘钥     该算法只支持主密钥
	 * 这个接口只支持RSA算法
	 */
	private void testcustomercmddeal1() {
		myHandleDeal("testcustomercmddeal1测试", 0);
		String KCV = "0840826A";
		int[] devhandles = new int[1];
		byte[] devhandles2 = new byte[520];
		byte[] devhandles3 = new byte[4];

		// 下载主密钥请求
//		int res1 = Ddi.ddi_customer_cmddeal(0,devhandles2.length,devhandles2, devhandles,devhandles2);
//		String outerdataString = ByteUtils.byteArray2HexString(devhandles2);
//		Log.v("TAG", outerdataString);
//		if (res1 == 0 ) {
//			myHandleDeal("customercmddeal1请求下载MK返回成功", res1);
//		}else {
//			myHandleDeal("customercmddeal1请求下载MK返回失败", res1);
//		}

		// 下载主密钥 &&outerdataString2.equalsIgnoreCase(KCV)
		String rsAupdatadesdata = ByteUtils.RSAupdatadesdata();
		Log.v("TAG", "fanhuizhi" + rsAupdatadesdata);
		byte[] innerkey5 = ByteUtils.hexString2ByteArray(rsAupdatadesdata);
		int res2 = Ddi.ddi_customer_cmddeal(1, innerkey5.length, innerkey5, devhandles, devhandles3);
		String outerdataString2 = ByteUtils.byteArray2HexString(devhandles3);
		Log.v("TAG", outerdataString2);
		if (res2 == 0&&outerdataString2.equalsIgnoreCase(KCV)) {
			myHandleDeal("customercmddeal1下载MK返回成功" + outerdataString2, res2);
		} else {
			myHandleDeal("customercmddeal1下载MK返回失败", res2);
		}

	}
	/***
	 * 交行更新RSA算法 2DES加密类型的主秘钥     该算法只支持主密钥
	 * 这个接口只支持RSA算法
	 */
	private void testcustomercmddeal2() {
		myHandleDeal("testcustomercmddeal2测试", 0);
		String KCV = "1040826A";
		int[] devhandles = new int[1];
		byte[] devhandles2 = new byte[520];
		byte[] devhandles3 = new byte[4];
		
		// 下载主密钥请求
//		int res1 = Ddi.ddi_customer_cmddeal(0,devhandles2.length,devhandles2, devhandles,devhandles2);
//		String outerdataString = ByteUtils.byteArray2HexString(devhandles2);
//		Log.v("TAG", outerdataString);
//		if (res1 == 0 ) {
//			myHandleDeal("customercmddeal2请求下载MK返回成功", res1);
//		}else {
//			myHandleDeal("customercmddeal2请求下载MK返回失败", res1);
//		}
		
//		 下载主密钥 &&outerdataString2.equalsIgnoreCase(KCV)
		String rsAupdatadesdata = ByteUtils.RSAupdata2desdata();
		Log.v("TAG", "fanhuizhi" + rsAupdatadesdata);
		byte[] innerkey5 = ByteUtils.hexString2ByteArray(rsAupdatadesdata);
		int res2 = Ddi.ddi_customer_cmddeal(1, innerkey5.length, innerkey5, devhandles, devhandles3);
		String outerdataString2 = ByteUtils.byteArray2HexString(devhandles3);
		Log.v("TAG", outerdataString2);
		if (res2 == 0&&outerdataString2.equalsIgnoreCase(KCV)) {
			myHandleDeal("customercmddeal2下载MK返回成功" + outerdataString2, res2);
		} else {
			myHandleDeal("customercmddeal2下载MK返回失败", res2);
		}
		
	}
	/***
	 * 交行更新RSA算法 3DES加密类型的主秘钥     该算法只支持主密钥
	 * 这个接口只支持RSA算法
	 */
	private void testcustomercmddeal3() {
		myHandleDeal("testcustomercmddea3测试", 0);
		String KCV = "18D5B5FC";
		int[] devhandles = new int[1];
		byte[] devhandles2 = new byte[520];
		byte[] devhandles3 = new byte[4];
		
		// 下载主密钥请求
//		int res1 = Ddi.ddi_customer_cmddeal(0,devhandles2.length,devhandles2, devhandles,devhandles2);
//		String outerdataString = ByteUtils.byteArray2HexString(devhandles2);
//		Log.v("TAG", outerdataString);
//		if (res1 == 0 ) {
//			myHandleDeal("customercmddeal3请求下载MK返回成功", res1);
//		}else {
//			myHandleDeal("customercmddeal3请求下载MK返回失败", res1);
//		}
		
		// 下载主密钥 &&outerdataString2.equalsIgnoreCase(KCV)
		String rsAupdatadesdata = ByteUtils.RSAupdata3desdata();
		Log.v("TAG", "fanhuizhi" + rsAupdatadesdata);
		byte[] innerkey5 = ByteUtils.hexString2ByteArray(rsAupdatadesdata);
		int res2 = Ddi.ddi_customer_cmddeal(1, innerkey5.length, innerkey5, devhandles, devhandles3);
		String outerdataString2 = ByteUtils.byteArray2HexString(devhandles3);
		Log.v("TAG", outerdataString2);
		if (res2 == 0&&outerdataString2.equalsIgnoreCase(KCV)) {
			myHandleDeal("customercmddeal3下载MK返回成功" + outerdataString2, res2);
		} else {
			myHandleDeal("customercmddeal3下载MK返回失败", res2);
		}
		
	}
	/***
	 * 交行更新RSA算法 SM4加密类型的主秘钥     该算法只支持主密钥
	 * 这个接口只支持RSA算法
	 */
	private void testcustomercmddeal4() {
		myHandleDeal("testcustomercmddeal4测试", 0);
		String KCV = "1007A8F2";
		int[] devhandles = new int[1];
		byte[] devhandles2 = new byte[520];
		byte[] devhandles3 = new byte[4];
		
		// 下载主密钥请求
//		int res1 = Ddi.ddi_customer_cmddeal(0,devhandles2.length,devhandles2, devhandles,devhandles2);
//		String outerdataString = ByteUtils.byteArray2HexString(devhandles2);
//		Log.v("TAG", outerdataString);
//		if (res1 == 0 ) {
//			myHandleDeal("customercmddeal4请求下载MK返回成功", res1);
//		}else {
//			myHandleDeal("customercmddeal4请求下载MK返回失败", res1);
//		}
		
		// 下载主密钥 &&outerdataString2.equalsIgnoreCase(KCV)
		String rsAupdatadesdata = ByteUtils.RSAupdataSM4data();
		Log.v("TAG", "fanhuizhi" + rsAupdatadesdata);
		byte[] innerkey5 = ByteUtils.hexString2ByteArray(rsAupdatadesdata);
		int res2 = Ddi.ddi_customer_cmddeal(1, innerkey5.length, innerkey5, devhandles, devhandles3);
		String outerdataString2 = ByteUtils.byteArray2HexString(devhandles3);
		Log.v("TAG", outerdataString2);
		if (res2 == 0&&outerdataString2.equalsIgnoreCase(KCV)) {
			myHandleDeal("customercmddeal4下载MK返回成功" + outerdataString2, res2);
		} else {
			myHandleDeal("customercmddeal4下载MK返回失败", res2);
		}
//		
	}
	/***
	 * 交行更新AES128算法 2DES加密类型的主秘钥     该算法只支持主密钥
	 * 这个接口只支持RSA算法
	 */
	private void testcustomercmddeal5() {
		myHandleDeal("testcustomercmddeal5测试", 0);
		String KCV = "10EF4BB8";
		int[] devhandles = new int[1];
		byte[] devhandles2 = new byte[520];
		byte[] devhandles3 = new byte[4];
		
		// 下载主密钥请求
//		int res1 = Ddi.ddi_customer_cmddeal(0,devhandles2.length,devhandles2, devhandles,devhandles2);
//		String outerdataString = ByteUtils.byteArray2HexString(devhandles2);
//		Log.v("TAG", outerdataString);
//		if (res1 == 0 ) {
//			myHandleDeal("customercmddeal5请求下载MK返回成功", res1);
//		}else {
//			myHandleDeal("customercmddeal5请求下载MK返回失败", res1);
//		}
		
		// 下载主密钥 &&outerdataString2.equalsIgnoreCase(KCV)
		String rsAupdatadesdata = ByteUtils.RSAupdataAES128data();
		Log.v("TAG", "fanhuizhi" + rsAupdatadesdata);
		byte[] innerkey5 = ByteUtils.hexString2ByteArray(rsAupdatadesdata);
		int res2 = Ddi.ddi_customer_cmddeal(1, innerkey5.length, innerkey5, devhandles, devhandles3);
		String outerdataString2 = ByteUtils.byteArray2HexString(devhandles3);
		Log.v("TAG", outerdataString2);
		if (res2 == 0&&outerdataString2.equalsIgnoreCase(KCV)) {
			myHandleDeal("customercmddeal5下载MK返回成功" + outerdataString2, res2);
		} else {
			myHandleDeal("customercmddeal5下载MK返回失败", res2);
		}
		
	}
	/***
	 * 交行更新RSA算法 AES192加密类型的主秘钥     该算法只支持主密钥
	 * 这个接口只支持RSA算法
	 */
	private void testcustomercmddeal6() {
		myHandleDeal("testcustomercmddeal6测试", 0);
		String KCV = "18132387";
		int[] devhandles = new int[1];
		byte[] devhandles2 = new byte[520];
		byte[] devhandles3 = new byte[4];
		
		// 下载主密钥请求
//		int res1 = Ddi.ddi_customer_cmddeal(0,devhandles2.length,devhandles2, devhandles,devhandles2);
//		String outerdataString = ByteUtils.byteArray2HexString(devhandles2);
//		Log.v("TAG", outerdataString);
//		if (res1 == 0 ) {
//			myHandleDeal("customercmddeal6请求下载MK返回成功", res1);
//		}else {
//			myHandleDeal("customercmddeal6请求下载MK返回失败", res1);
//		}
		
		// 下载主密钥 &&outerdataString2.equalsIgnoreCase(KCV)
		String rsAupdatadesdata = ByteUtils.RSAupdataAES192data();
		Log.v("TAG", "fanhuizhi" + rsAupdatadesdata);
		byte[] innerkey5 = ByteUtils.hexString2ByteArray(rsAupdatadesdata);
		int res2 = Ddi.ddi_customer_cmddeal(1, innerkey5.length, innerkey5, devhandles, devhandles3);
		String outerdataString2 = ByteUtils.byteArray2HexString(devhandles3);
		Log.v("TAG", outerdataString2);
		if (res2 == 0&&outerdataString2.equalsIgnoreCase(KCV)) {
			myHandleDeal("customercmddeal6下载MK返回成功" + outerdataString2, res2);
		} else {
			myHandleDeal("customercmddeal6下载MK返回失败", res2);
		}
		
	}
	/***
	 * 交行更新RSA算法 2DES加密类型的主秘钥     该算法只支持主密钥
	 * 这个接口只支持RSA算法
	 */
	private void testcustomercmddeal7() {
		myHandleDeal("testcustomercmddeal7测试", 0);
		String KCV = "20B08ECF";
		int[] devhandles = new int[1];
		byte[] devhandles2 = new byte[520];
		byte[] devhandles3 = new byte[4];
		
		// 下载主密钥请求
//		int res1 = Ddi.ddi_customer_cmddeal(0,devhandles2.length,devhandles2, devhandles,devhandles2);
//		String outerdataString = ByteUtils.byteArray2HexString(devhandles2);
//		Log.v("TAG", outerdataString);
//		if (res1 == 0 ) {
//			myHandleDeal("customercmddeal7请求下载MK返回成功", res1);
//		}else {
//			myHandleDeal("customercmddeal7请求下载MK返回失败", res1);
//		}
//		
		// 下载主密钥 &&outerdataString2.equalsIgnoreCase(KCV)
		String rsAupdatadesdata = ByteUtils.RSAupdataAES256data();
		Log.v("TAG", "fanhuizhi" + rsAupdatadesdata);
		byte[] innerkey5 = ByteUtils.hexString2ByteArray(rsAupdatadesdata);
		int res2 = Ddi.ddi_customer_cmddeal(1, innerkey5.length, innerkey5, devhandles, devhandles3);
		String outerdataString2 = ByteUtils.byteArray2HexString(devhandles3);
		Log.v("TAG", outerdataString2);
		if (res2 == 0&&outerdataString2.equalsIgnoreCase(KCV)) {
			myHandleDeal("customercmddeal7下载MK返回成功" + outerdataString2, res2);
		} else {
			myHandleDeal("customercmddeal7下载MK返回失败", res2);
		}
		
	}

	// SM2公钥
	private void testpinpaddealcmd14() {
		myHandleDeal("testpinpaddealcmd14测试", 0);
		int mode = 00000001;
		int regionid = 0;
		int keyid = 0;
		int[] devhandles = new int[64];
		int res1 = Ddi.ddi_pinpad_opendevice(0, devhandles);
		if (res1 == 0 && devhandles.length != 0) {
			myHandleDeal("pinpadopendevice打开成功14", res1);
			int devhanle = ByteUtils.intarr2int(devhandles);
			myHandleDeal("pinpaddealcmd的devhanle14：" + devhanle, 0);
			int res2 = Ddi.ddi_pinpad_querykey(devhanle, mode, regionid, keyid);
			if (res2 == 0) {
				myHandleDeal("SM2公钥存在测试成功14", res2);
			} else {
				myHandleDeal("SM2公钥存在测试失败14", res2);
			}
		}
		int res5 = Ddi.ddi_pinpad_closedevice(0, devhandles);
		if (res5 == 0) {
			myHandleDeal("ddi_pinpad_closedevice关闭成功14", res5);
		}

	}
	
	//交行秘钥下载测试    交总行的秘钥下载-SM2
	private void testpinpaddealcmd21() {
		myHandleDeal("testpinpaddealcmd21测试", 0);
		String data = "f1acee231d370a171543cd366bb731349eeacd6590270b43";

		String input = "0000";
//			StringBuilder strBuilder = new StringBuilder(input);
		// 明文数据：02001D 00 00 10 10012345678998765432101122334455660AFFFFFFFFFFFFFFFFFFFF
		// RNG：E0CF058CC1542486DD146D643F54E01EDF4EB386F69E617B
		String input1 = "06000110";
		String MKCV = "1100010812000340826a";
		//F900会返回这个：1100010812000340826a 130008c4e7fd02211125cd（后面数据是需要特俗秘钥加密主密钥明文，特俗秘钥没有给）N5S和N6不会改成这样
		
//		C4E7FD02211125CD
		
		int[] devhandles = new int[64];
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(input);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(input1);
		int[] poutlen = new int[24];
		int[] poutlen1 = new int[145];
		byte[] outerkey = new byte[4];
		byte[] outer = new byte[64];
		byte[] outer1 = new byte[145];

		int res1 = Ddi.ddi_pinpad_opendevice(0, devhandles);
		if (res1 == 0 && devhandles.length != 0) {
			myHandleDeal("pinpadopendevice16打开成功", res1);
			int devhanle = ByteUtils.intarr2int(devhandles);
			myHandleDeal("pinpaddealcmd的devhanle16：" + devhanle, 0);
			// step3
			int res2 = Ddi.ddi_pinpad_deal_cmd(devhanle, 8, 3, innerkey1.length, innerkey1, poutlen, outerkey);
			String outerdataString = ByteUtils.byteArray2HexString(outerkey);
			if (res2 == 0) {
				myHandleDeal("pinpaddealcmd21step3机器当前秘钥值" + outerdataString, res2);
				// step：4   主要是获取随机数
//					int res3 = Ddi.ddi_pinpad_deal_cmd(devhanle, 8, 4, innerkey2.length, innerkey2, poutlen1, outer1);
//					String outerdataString1 = ByteUtils.byteArray2HexString(outer1);
//					if (res3 == 0) {
//						myHandleDeal("pinpaddealcmd21step4返回值成功："+outerdataString1, res3);
//						Log.v("costtime", outerdataString1);
//					} else {
//						myHandleDeal("pinpaddealcmd21返回值失败step4" +outerdataString1, res3);
//					}
				// step：5
				String data5 = ByteUtils.updatadesdata();
				myHandleDeal("pinpaddealcmd21step5传入总数据：" + data5, 0);
				byte[] innerkey5 = ByteUtils.hexString2ByteArray(data5);
				int res4 = Ddi.ddi_pinpad_deal_cmd(devhanle, 8, 5, innerkey5.length, innerkey5, poutlen1, outer1);
				String outerdataString5 = ByteUtils.byteArray2HexString(outer1);
				String total=outerdataString5.substring(0, 20);
				if (res4 == 0&&total.equalsIgnoreCase(MKCV)) {
					myHandleDeal("pinpaddealcmd21step5返回值成功：" , res4);
					Log.v("123456", outerdataString5);
				} else {
					myHandleDeal("pinpaddealcmd21step5返回值失败" + outerdataString5, res4);
				}
				int res5 = Ddi.ddi_pinpad_closedevice(0, devhandles);
				if (res5 == 0) {
					myHandleDeal("ddi_pinpad_closedevice21关闭成功", res5);
				}
					
			} else {
				myHandleDeal("pinpaddealcmd21step4机器当前秘失败" + outerdataString, res2);
			}
			
		} else {
			myHandleDeal("pinpadopendevice21打开失败", res1);
		}



	}

	private void testpinpaddealcmd22() {
		myHandleDeal("testpinpaddealcmd22测试", 0);
		String data = "f1acee231d370a171543cd366bb731349eeacd6590270b43";

		String input = "0000";
//			StringBuilder strBuilder = new StringBuilder(input);
		// 明文数据：02001D 00 00 10 10012345678998765432101122334455660AFFFFFFFFFFFFFFFFFFFF
		// RNG：E0CF058CC1542486DD146D643F54E01EDF4EB386F69E617B
		String input1 = "06000110";
		String MKCV = "1100011012000340826a";
		//F900=1100011012000340826a130010c4e7fd02211125cdc4e7fd02211125cd

		int[] devhandles = new int[64];
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(input);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(input1);
		int[] poutlen = new int[24];
		int[] poutlen1 = new int[145];
		byte[] outerkey = new byte[4];
		byte[] outer = new byte[64];
		byte[] outer1 = new byte[145];

		int res1 = Ddi.ddi_pinpad_opendevice(0, devhandles);
		if (res1 == 0 && devhandles.length != 0) {
			myHandleDeal("pinpadopendevice打开成功22", res1);
			int devhanle = ByteUtils.intarr2int(devhandles);
			myHandleDeal("pinpaddealcmd的devhanle22：" + devhanle, 0);
			// step3
			int res2 = Ddi.ddi_pinpad_deal_cmd(devhanle, 8, 3, innerkey1.length, innerkey1, poutlen, outerkey);
			String outerdataString = ByteUtils.byteArray2HexString(outerkey);
			if (res2 == 0) {

				myHandleDeal("pinpaddealcmdstep3机器当前秘钥值22" + outerdataString, res2);
				// step：4
//					int res3 = Ddi.ddi_pinpad_deal_cmd(devhanle, 8, 4, innerkey2.length, innerkey2, poutlen1, outer1);
//					String outerdataString1 = ByteUtils.byteArray2HexString(outer1);
//					if (res3 == 0) {
//						myHandleDeal("pinpaddealcmd22step4返回值成功："+outerdataString1, res3);
//						Log.v("123456", outerdataString1);
//						
//					} else {
//						myHandleDeal("pinpaddealcmd22返回值失败step4" +outerdataString1, res3);
//					}

				// step：5
				String data5 = ByteUtils.updata2desdata();
				myHandleDeal("pinpaddealcmdstep5返回值成功22：" + data5, 0);
				byte[] innerkey5 = ByteUtils.hexString2ByteArray(data5);
				int res4 = Ddi.ddi_pinpad_deal_cmd(devhanle, 8, 5, innerkey5.length, innerkey5, poutlen1, outer1);
				String outerdataString5 = ByteUtils.byteArray2HexString(outer1);
				String total = outerdataString5.substring(0, 20);
				if (res4 == 0 && total.equalsIgnoreCase(MKCV)) {
					myHandleDeal("pinpaddealcmdstep5返回值成功22：", res4);
					Log.v("123456", outerdataString5);
				} else {
					myHandleDeal("pinpaddealcmdstep522返回值失败" + outerdataString5, res4);
				}				
				int res5 = Ddi.ddi_pinpad_closedevice(0, devhandles);
				if (res5 == 0) {
					myHandleDeal("ddi_pinpad_closedevice关闭成功22", res5);
				}
				
				

			} else {
				myHandleDeal("pinpaddealcmdstep4机器当前秘失败22" + outerdataString, res2);

			}
		} else {
			myHandleDeal("pinpadopendevice打开失败22", res1);
		}

	}
	private void testpinpaddealcmd23() {
		myHandleDeal("testpinpaddealcmd23测试", 0);
		String data = "f1acee231d370a171543cd366bb731349eeacd6590270b43";
		
		String input = "0000";
//			StringBuilder strBuilder = new StringBuilder(input);
		// 明文数据：02001D 00 00 10 10012345678998765432101122334455660AFFFFFFFFFFFFFFFFFFFF
		// RNG：E0CF058CC1542486DD146D643F54E01EDF4EB386F69E617B
		String input1 = "06000110";
		String MKCV = "11000118120003AC1B60";
//		F900=11000118120003ac1b6013001846a09622b17a3a5cd9d629807bd17993e862b4c66427c8cd
		
		int[] devhandles = new int[64];
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(input);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(input1);
		int[] poutlen = new int[24];
		int[] poutlen1 = new int[145];
		byte[] outerkey = new byte[4];
		byte[] outer = new byte[64];
		byte[] outer1 = new byte[145];
		
		int res1 = Ddi.ddi_pinpad_opendevice(0, devhandles);
		if (res1 == 0 && devhandles.length != 0) {
			myHandleDeal("pinpadopendevice23打开成功", res1);
			int devhanle = ByteUtils.intarr2int(devhandles);
			myHandleDeal("pinpaddealcmd的devhanle23：" + devhanle, 0);
			// step3
			int res2 = Ddi.ddi_pinpad_deal_cmd(devhanle, 8, 3, innerkey1.length, innerkey1, poutlen, outerkey);
			String outerdataString = ByteUtils.byteArray2HexString(outerkey);
			if (res2 == 0) {
				
				myHandleDeal("pinpaddealcmdstep323机器当前秘钥值" + outerdataString, res2);
				// step：4
					int res3 = Ddi.ddi_pinpad_deal_cmd(devhanle, 8, 4, innerkey2.length, innerkey2, poutlen1, outer1);
					String outerdataString1 = ByteUtils.byteArray2HexString(outer1);
					if (res3 == 0) {
						myHandleDeal("pinpaddealcmd21step4返回值成功："+outerdataString1, res3);
						Log.v("123456", outerdataString1);
						
					} else {
						myHandleDeal("pinpaddealcmd21返回值失败step4" +outerdataString1, res3);
					}
				
				// step：5
				String data5 = ByteUtils.updata3desdata();
				myHandleDeal("pinpaddealcmdstep523返回值成功：" + data5, 0);
				byte[] innerkey5 = ByteUtils.hexString2ByteArray(data5);
				int res4 = Ddi.ddi_pinpad_deal_cmd(devhanle, 8, 5, innerkey5.length, innerkey5, poutlen1, outer1);
				String outerdataString5 = ByteUtils.byteArray2HexString(outer1);
				String total = outerdataString5.substring(0, 20);
				if (res4 == 0 && total.equalsIgnoreCase(MKCV)) {
					myHandleDeal("pinpaddealcmdstep523返回值成功：", res4);
					Log.v("123456", outerdataString5);
					
				} else {
					myHandleDeal("pinpaddealcmdstep523返回值失败" + outerdataString5, res4);
				}
				int res5 = Ddi.ddi_pinpad_closedevice(0, devhandles);
				if (res5 == 0) {
					myHandleDeal("ddi_pinpad_closedevice关闭成功23", res5);
				}
				
				
				
			} else {
				myHandleDeal("pinpaddealcmdstep423机器当前秘失败" + outerdataString, res2);
				
			}
		} else {
			myHandleDeal("pinpadopendevice打开失败23", res1);
		}
		
	}
	
	private void testpinpaddealcmd24() {
		myHandleDeal("testpinpaddealcmd24测试", 0);
		String data = "f1acee231d370a171543cd366bb731349eeacd6590270b43";
		
		String input = "0000";
//			StringBuilder strBuilder = new StringBuilder(input);
		// 明文数据：02001D 00 00 10 10012345678998765432101122334455660AFFFFFFFFFFFFFFFFFFFF
		// RNG：E0CF058CC1542486DD146D643F54E01EDF4EB386F69E617B
		String input1 = "06000110";
		String MKCV = "1100011012000307A8F2";
//		F900：1100011012000307a8f2  130010  46a09622b17a3a5cd9d629807bd17993  
		
		int[] devhandles = new int[64];
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(input);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(input1);
		int[] poutlen = new int[24];
		int[] poutlen1 = new int[145];
		byte[] outerkey = new byte[4];
		byte[] outer = new byte[64];
		byte[] outer1 = new byte[145];
		
		int res1 = Ddi.ddi_pinpad_opendevice(0, devhandles);
		if (res1 == 0 && devhandles.length != 0) {
			myHandleDeal("pinpadopendevice24打开成功", res1);
			int devhanle = ByteUtils.intarr2int(devhandles);
			myHandleDeal("pinpaddealcmd的devhanle24：" + devhanle, 0);
			// step3
			int res2 = Ddi.ddi_pinpad_deal_cmd(devhanle, 8, 3, innerkey1.length, innerkey1, poutlen, outerkey);
			String outerdataString = ByteUtils.byteArray2HexString(outerkey);
			if (res2 == 0) {
				
				myHandleDeal("pinpaddealcmdstep324机器当前秘钥值" + outerdataString, res2);
				// step：4
//					int res3 = Ddi.ddi_pinpad_deal_cmd(devhanle, 8, 4, innerkey2.length, innerkey2, poutlen1, outer1);
//					String outerdataString1 = ByteUtils.byteArray2HexString(outer1);
//					if (res3 == 0) {
//						myHandleDeal("pinpaddealcmd21step4返回值成功："+outerdataString1, res3);
//						Log.v("123456", outerdataString1);
//						
//					} else {
//						myHandleDeal("pinpaddealcmd21返回值失败step4" +outerdataString1, res3);
//					}
//				
				// step：5
				String data5 = ByteUtils.updataSM4data();
				myHandleDeal("pinpaddealcmdstep524返回值成功：" + data5, 0);
				byte[] innerkey5 = ByteUtils.hexString2ByteArray(data5);
				int res4 = Ddi.ddi_pinpad_deal_cmd(devhanle, 8, 5, innerkey5.length, innerkey5, poutlen1, outer1);
				String outerdataString5 = ByteUtils.byteArray2HexString(outer1);
				String total = outerdataString5.substring(0, 20);
				if (res4 == 0 && total.equalsIgnoreCase(MKCV)) {
					myHandleDeal("pinpaddealcmdstep524返回值成功：", res4);
					Log.v("123456", outerdataString5);
					
				} else {
					myHandleDeal("pinpaddealcmdstep524返回值失败" + outerdataString5, res4);
				}
				int res5 = Ddi.ddi_pinpad_closedevice(0, devhandles);
				if (res5 == 0) {
					myHandleDeal("ddi_pinpad_closedevice关闭成功24", res5);
				}else {
					myHandleDeal("ddi_pinpad_closedevice关闭成功24失败", res5);
				}
				
				
				
			} else {
				myHandleDeal("pinpaddealcmdstep424机器当前秘失败" + outerdataString, res2);
				
			}
		} else {
			myHandleDeal("pinpadopendevice打开失败24", res1);
		}
		
	}
	private void testpinpaddealcmd25() {
		myHandleDeal("testpinpaddealcmd25测试", 0);
		String data = "f1acee231d370a171543cd366bb731349eeacd6590270b43";
		
		String input = "0000";
//			StringBuilder strBuilder = new StringBuilder(input);
		// 明文数据：02001D 00 00 10 10012345678998765432101122334455660AFFFFFFFFFFFFFFFFFFFF
		// RNG：E0CF058CC1542486DD146D643F54E01EDF4EB386F69E617B
		String input1 = "06000110";
		//KCV校验值计算是主密钥是那个秘钥就用那个秘钥计算
		String MKCV = "11000110120003C92E40";
//		F900：11000110120003c92e40130010   110c1981689a0ee0882ebdd5467350bf
		
		int[] devhandles = new int[64];
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(input);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(input1);
		int[] poutlen = new int[24];
		int[] poutlen1 = new int[145];
		byte[] outerkey = new byte[4];
		byte[] outer = new byte[64];
		byte[] outer1 = new byte[145];
		
		int res1 = Ddi.ddi_pinpad_opendevice(0, devhandles);
		if (res1 == 0 && devhandles.length != 0) {
			myHandleDeal("pinpadopendevice25打开成功", res1);
			int devhanle = ByteUtils.intarr2int(devhandles);
			myHandleDeal("pinpaddealcmd的devhanle25：" + devhanle, 0);
			// step3
			int res2 = Ddi.ddi_pinpad_deal_cmd(devhanle, 8, 3, innerkey1.length, innerkey1, poutlen, outerkey);
			String outerdataString = ByteUtils.byteArray2HexString(outerkey);
			if (res2 == 0) {
				
				myHandleDeal("pinpaddealcmdstep325机器当前秘钥值" + outerdataString, res2);
				// step：4
//					int res3 = Ddi.ddi_pinpad_deal_cmd(devhanle, 8, 4, innerkey2.length, innerkey2, poutlen1, outer1);
//					String outerdataString1 = ByteUtils.byteArray2HexString(outer1);
//					if (res3 == 0) {
//						myHandleDeal("pinpaddealcmd21step4返回值成功："+outerdataString1, res3);
//						Log.v("123456", outerdataString1);
//						
//					} else {
//						myHandleDeal("pinpaddealcmd21返回值失败step4" +outerdataString1, res3);
//					}
				
				// step：5
				String data5 = ByteUtils.updataaes128data();
				myHandleDeal("pinpaddealcmdstep525返回值成功：" + data5, 0);
				byte[] innerkey5 = ByteUtils.hexString2ByteArray(data5);
				int res4 = Ddi.ddi_pinpad_deal_cmd(devhanle, 8, 5, innerkey5.length, innerkey5, poutlen1, outer1);
				String outerdataString5 = ByteUtils.byteArray2HexString(outer1);
				String total = outerdataString5.substring(0, 20);
				if (res4 == 0 && total.equalsIgnoreCase(MKCV)) {
					myHandleDeal("pinpaddealcmdstep525返回值成功：", res4);
					Log.v("123456", outerdataString5);
					
				} else {
					myHandleDeal("pinpaddealcmdstep525返回值失败" + outerdataString5, res4);
				}
				int res5 = Ddi.ddi_pinpad_closedevice(0, devhandles);
				if (res5 == 0) {
					myHandleDeal("ddi_pinpad_closedevice关闭成功25", res5);
				}else {
					myHandleDeal("ddi_pinpad_closedevice关闭成功25失败", res5);
				}
//////				
				
				
			} else {
				myHandleDeal("pinpaddealcmdstep425机器当前秘失败" + outerdataString, res2);
				
			}
		} else {
			myHandleDeal("pinpadopendevice打开失败25", res1);
		}
		
	}
	private void testpinpaddealcmd26() {
		myHandleDeal("testpinpaddealcmd26测试", 0);
		String data = "f1acee231d370a171543cd366bb731349eeacd6590270b43";
		
		String input = "0000";
//			StringBuilder strBuilder = new StringBuilder(input);
		// 明文数据：02001D 00 00 10 10012345678998765432101122334455660AFFFFFFFFFFFFFFFFFFFF
		// RNG：E0CF058CC1542486DD146D643F54E01EDF4EB386F69E617B
		String input1 = "06000110";
		String MKCV = "11000118120003C1839D";
		//F900=11000118120003c1839d130018110c1981689a0ee09224b43d6546d8f09aaf7d5bb4f34dd8
		
		int[] devhandles = new int[64];
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(input);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(input1);
		int[] poutlen = new int[24];
		int[] poutlen1 = new int[145];
		byte[] outerkey = new byte[4];
		byte[] outer = new byte[64];
		byte[] outer1 = new byte[145];
		
		int res1 = Ddi.ddi_pinpad_opendevice(0, devhandles);
		if (res1 == 0 && devhandles.length != 0) {
			myHandleDeal("pinpadopendevice26打开成功", res1);
			int devhanle = ByteUtils.intarr2int(devhandles);
			myHandleDeal("pinpaddealcmd的devhanle26：" + devhanle, 0);
			// step3
			int res2 = Ddi.ddi_pinpad_deal_cmd(devhanle, 8, 3, innerkey1.length, innerkey1, poutlen, outerkey);
			String outerdataString = ByteUtils.byteArray2HexString(outerkey);
			if (res2 == 0) {
				
				myHandleDeal("pinpaddealcmdstep326机器当前秘钥值" + outerdataString, res2);
				// step：4
//					int res3 = Ddi.ddi_pinpad_deal_cmd(devhanle, 8, 4, innerkey2.length, innerkey2, poutlen1, outer1);
//					String outerdataString1 = ByteUtils.byteArray2HexString(outer1);
//					if (res3 == 0) {
//						myHandleDeal("pinpaddealcmd21step4返回值成功："+outerdataString1, res3);
//						Log.v("123456", outerdataString1);
//						
//					} else {
//						myHandleDeal("pinpaddealcmd21返回值失败step4" +outerdataString1, res3);
//					}
				
				// step：5
				String data5 = ByteUtils.updataaes192data();
				myHandleDeal("pinpaddealcmdstep526返回值成功：" + data5, 0);
				byte[] innerkey5 = ByteUtils.hexString2ByteArray(data5);
				int res4 = Ddi.ddi_pinpad_deal_cmd(devhanle, 8, 5, innerkey5.length, innerkey5, poutlen1, outer1);
				String outerdataString5 = ByteUtils.byteArray2HexString(outer1);
				String total = outerdataString5.substring(0, 20);
				if (res4 == 0 && total.equalsIgnoreCase(MKCV)) {
					myHandleDeal("pinpaddealcmdstep526返回值成功：", res4);
					Log.v("123456", outerdataString5);
					
				} else {
					myHandleDeal("pinpaddealcmdstep526返回值失败" + outerdataString5, res4);
				}
				int res5 = Ddi.ddi_pinpad_closedevice(0, devhandles);
				if (res5 == 0) {
					myHandleDeal("ddi_pinpad_closedevice关闭成功26", res5);
				}else {
					myHandleDeal("ddi_pinpad_closedevice关闭成功26失败", res5);
				}
				
				
				
			} else {
				myHandleDeal("pinpaddealcmdstep426机器当前秘失败" + outerdataString, res2);
				
			}
		} else {
			myHandleDeal("pinpadopendevice打开失败26", res1);
		}
		
	}
	private void testpinpaddealcmd27() {
		myHandleDeal("testpinpaddealcmd27测试", 0);
		String data = "f1acee231d370a171543cd366bb731349eeacd6590270b43";
		
		String input = "0000";
//			StringBuilder strBuilder = new StringBuilder(input);
		// 明文数据：02001D 00 00 10 10012345678998765432101122334455660AFFFFFFFFFFFFFFFFFFFF
		// RNG：E0CF058CC1542486DD146D643F54E01EDF4EB386F69E617B
		String input1 = "06000110";
		String MKCV = "11000120120003AD255D";
		//F900=11000120120003ad255d130020110c1981689a0ee09224b43d6546d8f09aaf7d5bb4f34dd8f64bf585d7c9ffa4
		
		int[] devhandles = new int[64];
		byte[] innerkey1 = ByteUtils.hexString2ByteArray(input);
		byte[] innerkey2 = ByteUtils.hexString2ByteArray(input1);
		int[] poutlen = new int[24];
		int[] poutlen1 = new int[145];
		byte[] outerkey = new byte[4];
		byte[] outer = new byte[64];
		byte[] outer1 = new byte[145];
		
		int res1 = Ddi.ddi_pinpad_opendevice(0, devhandles);
		if (res1 == 0 && devhandles.length != 0) {
			myHandleDeal("pinpadopendevice27打开成功", res1);
			int devhanle = ByteUtils.intarr2int(devhandles);
			myHandleDeal("pinpaddealcmd的devhanle27：" + devhanle, 0);
			// step3
			int res2 = Ddi.ddi_pinpad_deal_cmd(devhanle, 8, 3, innerkey1.length, innerkey1, poutlen, outerkey);
			String outerdataString = ByteUtils.byteArray2HexString(outerkey);
			if (res2 == 0) {
				
				myHandleDeal("pinpaddealcmdstep326机器当前秘钥值" + outerdataString, res2);
				// step：4
//					int res3 = Ddi.ddi_pinpad_deal_cmd(devhanle, 8, 4, innerkey2.length, innerkey2, poutlen1, outer1);
//					String outerdataString1 = ByteUtils.byteArray2HexString(outer1);
//					if (res3 == 0) {
//						myHandleDeal("pinpaddealcmd21step4返回值成功："+outerdataString1, res3);
//						Log.v("123456", outerdataString1);
//						
//					} else {
//						myHandleDeal("pinpaddealcmd21返回值失败step4" +outerdataString1, res3);
//					}
//				
				// step：5
				String data5 = ByteUtils.updataaes256data();
				myHandleDeal("pinpaddealcmdstep527返回值成功：" + data5, 0);
				byte[] innerkey5 = ByteUtils.hexString2ByteArray(data5);
				int res4 = Ddi.ddi_pinpad_deal_cmd(devhanle, 8, 5, innerkey5.length, innerkey5, poutlen1, outer1);
				String outerdataString5 = ByteUtils.byteArray2HexString(outer1);
				String total = outerdataString5.substring(0, 20);
				if (res4 == 0 && total.equalsIgnoreCase(MKCV)) {
					myHandleDeal("pinpaddealcmdstep527返回值成功：", res4);
					Log.v("123456", outerdataString5);
					
				} else {
					myHandleDeal("pinpaddealcmdstep527返回值失败" + outerdataString5, res4);
				}
				int res5 = Ddi.ddi_pinpad_closedevice(0, devhandles);
				if (res5 == 0) {
					myHandleDeal("ddi_pinpad_closedevice关闭成功27", res5);
				}else {
					myHandleDeal("ddi_pinpad_closedevice关闭成功27失败", res5);
				}
//				
				
				
			} else {
				myHandleDeal("pinpaddealcmdstep427机器当前秘失败" + outerdataString, res2);
				
			}
		} else {
			myHandleDeal("pinpadopendevice打开失败27", res1);
		}
		
	}
	
	
	//交行秘钥下载测试    交总行的秘钥下载-RSADES 
		private void testpinpaddealcmd28() {
			myHandleDeal("testpinpaddealcmd28测试", 0);
			String data = "f1acee231d370a171543cd366bb731349eeacd6590270b43";

			String input = "0000";
//				StringBuilder strBuilder = new StringBuilder(input);
			// 明文数据：02001D 00 00 10 10012345678998765432101122334455660AFFFFFFFFFFFFFFFFFFFF
			// RNG：E0CF058CC1542486DD146D643F54E01EDF4EB386F69E617B
			String input1 = "06000100";
			String MKCV = "1100010812000340826a";
			//F900=1100010812000340826a130008c4e7fd02211125cd
			//F900会返回这个：1100010812000340826a 130008c4e7fd02211125cd（后面数据是需要特俗秘钥加密主密钥明文，特俗秘钥没有给）N5S和N6不会改成这样
//			C4E7FD02211125CD
			int[] devhandles = new int[64];
			byte[] innerkey1 = ByteUtils.hexString2ByteArray(input);
			byte[] innerkey2 = ByteUtils.hexString2ByteArray(input1);
			int[] poutlen = new int[24];
			int[] poutlen1 = new int[145];
			byte[] outerkey = new byte[4];
			byte[] outer = new byte[64];
			byte[] outer1 = new byte[145];
			int res1 = Ddi.ddi_pinpad_opendevice(0, devhandles);
			if (res1 == 0 && devhandles.length != 0) {
				myHandleDeal("pinpadopendevice28打开成功", res1);
				int devhanle = ByteUtils.intarr2int(devhandles);
				myHandleDeal("pinpaddealcmd的devhanle28：" + devhanle, 0);
				// step3
				int res2 = Ddi.ddi_pinpad_deal_cmd(devhanle, 8, 3, innerkey1.length, innerkey1, poutlen, outerkey);
				String outerdataString = ByteUtils.byteArray2HexString(outerkey);
				if (res2 == 0) {
//					myHandleDeal("pinpaddealcmd28step3机器当前秘钥值" + outerdataString, res2);
//					// step：4   主要是获取随机数
//						int res3 = Ddi.ddi_pinpad_deal_cmd(devhanle, 8, 4, innerkey2.length, innerkey2, poutlen1, outer1);
//						String outerdataString1 = ByteUtils.byteArray2HexString(outer1);
//						if (res3 == 0) {
//							myHandleDeal("pinpaddealcmd21step4返回值成功："+outerdataString1, res3);
//							Log.v("costtime", outerdataString1);
//						} else {
//							myHandleDeal("pinpaddealcmd21返回值失败step4" +outerdataString1, res3);
//						}
					// step：5
					String data5 = ByteUtils.updatadesRSAdata();
					myHandleDeal("pinpaddealcmd28step5传入总数据：" + data5, 0);
					byte[] innerkey5 = ByteUtils.hexString2ByteArray(data5);
					int res4 = Ddi.ddi_pinpad_deal_cmd(devhanle, 8, 5, innerkey5.length, innerkey5, poutlen1, outer1);
					String outerdataString5 = ByteUtils.byteArray2HexString(outer1);
					String total=outerdataString5.substring(0, 20);
					if (res4 == 0&&total.equalsIgnoreCase(MKCV)) {
						myHandleDeal("pinpaddealcmd28step5返回值成功：" , res4);
						Log.v("123456", outerdataString5);
					} else {
						myHandleDeal("pinpaddealcmd28step5返回值失败" + outerdataString5, res4);
					}
					
					int res5 = Ddi.ddi_pinpad_closedevice(0, devhandles);
					if (res5 == 0) {
						myHandleDeal("ddi_pinpad_closedevice28关闭成功", res5);
					}else {
						myHandleDeal("ddi_pinpad_closedevice28关闭失败", res5);
					}
					
					//到这里
						
				} else {
					myHandleDeal("pinpaddealcmd28step4机器当前秘失败" + outerdataString, res2);
				}
				
			} else {
				myHandleDeal("pinpadopendevice28打开失败", res1);
			}
		}
		
		//交行秘钥下载测试    交总行的秘钥下载-RSA2DES 
		private void testpinpaddealcmd29() {
			myHandleDeal("testpinpaddealcmd29测试", 0);
			String data = "f1acee231d370a171543cd366bb731349eeacd6590270b43";
			
			String input = "0000";
//				StringBuilder strBuilder = new StringBuilder(input);
			// 明文数据：02001D 00 00 10 10012345678998765432101122334455660AFFFFFFFFFFFFFFFFFFFF
			// RNG：E0CF058CC1542486DD146D643F54E01EDF4EB386F69E617B
			String input1 = "06000100";
			String MKCV = "1100010812000340826a";
			//F900=1100010812000340826a130008c4e7fd02211125cd
			//F900会返回这个：1100010812000340826a 130008c4e7fd02211125cd（后面数据是需要特俗秘钥加密主密钥明文，特俗秘钥没有给）N5S和N6不会改成这样
//			C4E7FD02211125CD
			int[] devhandles = new int[64];
			byte[] innerkey1 = ByteUtils.hexString2ByteArray(input);
			byte[] innerkey2 = ByteUtils.hexString2ByteArray(input1);
			int[] poutlen = new int[24];
			int[] poutlen1 = new int[145];
			byte[] outerkey = new byte[4];
			byte[] outer = new byte[64];
			byte[] outer1 = new byte[145];
			int res1 = Ddi.ddi_pinpad_opendevice(0, devhandles);
			if (res1 == 0 && devhandles.length != 0) {
				myHandleDeal("pinpaddealcmd29打开成功", res1);
				int devhanle = ByteUtils.intarr2int(devhandles);
				myHandleDeal("pinpaddealcmd的devhanle29：" + devhanle, 0);
				// step3
				int res2 = Ddi.ddi_pinpad_deal_cmd(devhanle, 8, 3, innerkey1.length, innerkey1, poutlen, outerkey);
				String outerdataString = ByteUtils.byteArray2HexString(outerkey);
				if (res2 == 0) {
					myHandleDeal("pinpaddealcmd29step3机器当前秘钥值" + outerdataString, res2);
					// step：4   主要是获取随机数
						int res3 = Ddi.ddi_pinpad_deal_cmd(devhanle, 8, 4, innerkey2.length, innerkey2, poutlen1, outer1);
						String outerdataString1 = ByteUtils.byteArray2HexString(outer1);
						if (res3 == 0) {
							myHandleDeal("pinpaddealcmd21step4返回值成功："+outerdataString1, res3);
							Log.v("costtime", outerdataString1);
						} else {
							myHandleDeal("pinpaddealcmd21返回值失败step4" +outerdataString1, res3);
						}
					// step：5
					String data5 = ByteUtils.updatadesRSAdata();
					myHandleDeal("pinpaddealcmd29step5传入总数据：" + data5, 0);
					byte[] innerkey5 = ByteUtils.hexString2ByteArray(data5);
					int res4 = Ddi.ddi_pinpad_deal_cmd(devhanle, 8, 5, innerkey5.length, innerkey5, poutlen1, outer1);
					String outerdataString5 = ByteUtils.byteArray2HexString(outer1);
					String total=outerdataString5.substring(0, 20);
					if (res4 == 0&&total.equalsIgnoreCase(MKCV)) {
						myHandleDeal("pinpaddealcmd29tep5返回值成功：" , res4);
						Log.v("123456", outerdataString5);
					} else {
						myHandleDeal("pinpaddealcmd29step5返回值失败" + outerdataString5, res4);
					}
					int res5 = Ddi.ddi_pinpad_closedevice(0, devhandles);
					if (res5 == 0) {
						myHandleDeal("ddi_pinpad_closedevice29关闭成功", res5);
					}else {
						myHandleDeal("ddi_pinpad_closedevice29关闭失败", res5);
					}
					
				} else {
					myHandleDeal("pinpaddealcmd29step4机器当前秘失败" + outerdataString, res2);
				}
				
			} else {
				myHandleDeal("pinpadopendevice29打开失败", res1);
			}
		}
	
	

}
