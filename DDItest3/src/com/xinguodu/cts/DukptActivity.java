package com.xinguodu.cts;

import com.xinguodu.ddiinterface.Ddi;

import android.R.string;
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

public class DukptActivity extends Activity {
//	Ddi Ddi = new Ddi();
	private byte[] m_initkey;
	private byte[] m_initkey1;
	private byte[] m_initksn;
	private byte[] iv;
	private byte[] m_plain;
	private byte[] m_plain1;
	private byte[] cipher;
	private byte[] pinblock;
	private byte[] mac;
	private int[] in;
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
	ParaEntity paraEntity = paraEntity = new ParaEntity();
//	private String MainActivity.model=android.os.Build.MainActivity.model;

	// 创建一个线程进行用例的测试
	private Thread mThread = new Thread(new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			while (Thflg) {
				if (Btflg) {
					
					testDukptInjict1();
					testDukptInjict2();
					testDukptInjict3();
					testDukptInjict4();
					testDukptInjict5();
					testDukptInjict6();
					testDukptInjict7();
					testDukptInjict8();
					testDukptInjict9();
					testDukptInjict10();
					testDukptInjict11();
					testDukptInjict12();
					testDukptInjict13();
					testDukptInjict14();
					testDukptInjict15();
					testDukptInjict16();
					testDukptEncrypt1();
					testDukptEncrypt2();
					testDukptEncrypt3();
					testDukptEncrypt4();
					testDukptEncrypt5();
					testDukptEncrypt6();
					testDukptEncrypt7();
					testDukptEncrypt8();
					testDukptEncrypt9();
					testDukptPinblock1();
					// 这块不用测试
//					testDukptPinblock2();
//					testDukptPinblock3();
//					testDukptPinblock4();
//					testDukptPinblock5();
//					testDukptPinblock6();
					// 这块不用测试
					testDukptMAC1();
					testDukptMAC2();
					testDukptMAC3();
					testDukptMAC4();
					testDukptMAC5();
					testDukptMAC6();
					testDukptMAC7();
					testDukptMAC8();
					testDukptMAC9();
					testDukptMAC10();
					testDukptMAC11();
					testDukptMAC12();
					testDukptMAC13();
					testDukptMAC14();
					testDukptMAC15();
					testDukptKsn3();
					testDukptKsn1();
					testDukptKsn2();
					testDukptEncrypt10();
					testDukptEncrypt11();
					testDukptEncrypt12();
					testDukptEncrypt13();
					testDukptEncrypt14();
					testDukptEncrypt15();
					testDukptInjict17();
					testDukptKsn4();
					testDukptgroup();
					//终端参数是不支持2048
					if (MainActivity.model.equalsIgnoreCase("N3") | (MainActivity.model.equalsIgnoreCase("N5")
							&& MainActivity.version.equalsIgnoreCase("5.1.1"))) {
						testDukptMAC16();
					}else {
						myHandleDeal("终端:" + MainActivity.model + "参数为2048可以加密成功但是用例测试失败", -99);
					}
					testDukptEncrypt16();
					testDukptEncrypt17();
					
					testDukptEncrypt19();
					// 以下的N6不支持  -账户加密
					testDukptEncrypt20();
					testDukptEncrypt21();
					testDukptEncrypt22();
					testDukptEncrypt23();
					testDukptEncrypt24();
					testDukptEncrypt25();
					testDukptEncrypt26();
					//DUKPT数据加密及MAC计算最大输入待运算数据长度修改为2048;
					if ((MainActivity.model.equalsIgnoreCase("N5")&& MainActivity.version.equalsIgnoreCase("7.1.2") )|
							MainActivity.model.equalsIgnoreCase("N6")| MainActivity.model.equalsIgnoreCase("N86")) {
							// N5S 和N6支持2048个字节，其他项目暂时还不支持
							testDukptEncrypt27();
							testDukptEncrypt28();
							testDukptEncrypt29();
							testDukptEncrypt30();
							testDukptEncrypt31();
							testDukptMAC19();
							testDukptMAC20();
							testDukptMAC22();
							testDukptMAC23();
							//压力测试
							testDukptMAC21();
							testDukptEncrypt32();
					}else {
							myHandleDeal("终端:" + MainActivity.model + "不支持数据为2048字节测试失败", -99);
						}
					//压力测试
					testDukptKsn5();
					testDukptMAC18();   
					testDukptInjict18();
					testDukptEncrypt18();
					testDukptEncrypt33();					
					testend();
					Btflg = false;
				}
			}
		}
	});
//	 private   Handler name=new Handler();
	private  Handler myHandler = new Handler() {
		public void handleMessage(Message msg) {
			String infoString = msg.obj.toString() + " 返回值: " + msg.arg1;
			if (infoString.contains("testDukpt")) {
				TotalCount++;
				tv.append(" " + msg.obj.toString() + "\n");
			} else {
				if (infoString.contains("失败")) {
					if (flag != TotalCount) {
						Failcount++;
						flag = TotalCount;
					}
					// String str = "<font color=\"#FF0000\">"+"test"+infoString+"</font>";
					// tv1.append(" ");
					// tv1.append(Html.fromHtml(str));
					// tv1.append("\n");
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

	Ddi Ddi = new Ddi();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);// 去掉标题栏
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
		setContentView(R.layout.activity_dukpt);
		m_initkey = ByteUtils.hexString2ByteArray(ParaEntity.initkey);
		m_initkey1 = ByteUtils.hexString2ByteArray(ParaEntity.initkey1);
		m_initksn = ByteUtils.hexString2ByteArray(ParaEntity.initksn);
		iv = ByteUtils.hexString2ByteArray(ParaEntity.ivt);
		m_plain = ByteUtils.hexString2ByteArray(ParaEntity.plain);
		m_plain1 = ByteUtils.hexString2ByteArray(ParaEntity.plain1);
		pinblock = new byte[8];
		cipher = new byte[24];
		mac = new byte[8];
		in = new int[1];
		
		Ddi.ddi_ddi_sys_init();
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
		tv = (TextView) findViewById(R.id.tv);
		tv1 = (TextView) findViewById(R.id.tv1);
		bt1 = (Button) findViewById(R.id.bt1);
		spinner = (Spinner) findViewById(R.id.spinner);
		scrollView = (ScrollView) findViewById(R.id.scrollView);
		mTotalTextView = (TextView) findViewById(R.id.text_total);
		mSucessTextView = (TextView) findViewById(R.id.text_sucess);
		mFailTextView = (TextView) findViewById(R.id.text_fail);
		mSucessRateTextView = (TextView) findViewById(R.id.text_sucess_rate);
	}

	private void run() {
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

				// String[] languages = getResources().getStringArray(R.array.languages);
				// String str = languages[pos];
				// if(str.equals("testDukptInjict1")){
				// tv.setText("");
				// String fails = tv1.getText().toString();
				
				
				// tv.append(fails);
				// testDukptInjict1();
				// }
				if (Btflg) {
					Toast.makeText(getApplicationContext(), "测试中，请等待", Toast.LENGTH_SHORT).show();
				} else {
					tv.setText("");
					switch (pos) {
					case 1:
						testDukptInjict1();
						break;
					case 2:
						testDukptInjict2();
						break;
					case 3:
						testDukptInjict3();
						break;
					case 4:
						testDukptInjict4();
						break;
					case 5:
						testDukptInjict5();
						break;
					case 6:
						testDukptInjict6();
						break;
					case 7:
						testDukptInjict7();
						break;
					case 8:
						testDukptInjict8();
						break;
					case 9:
						testDukptInjict9();
						break;
					case 10:
						testDukptInjict10();
						break;
					case 11:
						testDukptInjict11();
						break;
					case 12:
						testDukptInjict12();
						break;
					case 13:
						testDukptInjict13();
						break;
					case 14:
						testDukptInjict14();
						break;
					case 15:
						testDukptInjict15();
						break;
					case 16:
						testDukptInjict16();
						break;
					case 17:
						testDukptEncrypt1();
						break;
					case 18:
						testDukptEncrypt2();
						break;
					case 19:
						testDukptEncrypt3();
						break;
					case 20:
						testDukptEncrypt4();
						break;
					case 21:
						testDukptEncrypt5();
						break;
					case 22:
						testDukptEncrypt6();
						break;
					case 23:
						testDukptEncrypt7();
						break;
					case 24:
						testDukptEncrypt7();
						break;
					case 25:
						testDukptEncrypt7();
						break;
					case 26:
						testDukptPinblock1();
						break;
					case 27:
						testDukptPinblock2();
						break;
					case 28:
						testDukptPinblock3();
						break;
					case 29:
						testDukptPinblock4();
						break;
					case 30:
						testDukptPinblock5();
						break;
					case 31:
						testDukptPinblock6();
						break;
					case 32:
						testDukptMAC1();
						break;
					case 33:
						testDukptMAC2();
						break;
					case 34:
						testDukptMAC3();
						break;
					case 35:
						testDukptMAC4();
						break;
					case 36:
						testDukptMAC5();
						break;
					case 37:
						testDukptMAC6();
						break;
					case 38:
						testDukptMAC7();
						break;
					case 39:
						testDukptMAC8();
						break;
					case 40:
						testDukptMAC9();
						break;
					case 41:
						testDukptMAC10();
						break;
					case 42:
						testDukptMAC11();
						break;
					case 43:
						testDukptMAC12();
						break;
					case 44:
						testDukptMAC13();
						break;
					case 45:
						testDukptMAC14();
						break;
					case 46:
						testDukptMAC15();
						break;
					case 47:
						testDukptKsn1();
						break;
					case 48:
						testDukptKsn2();
						break;
					case 49:
						testDukptgroup();
						break;
					case 50:
						testDukptMAC16();
						break;
					case 51:
						testDukptKsn3();
						break;
					case 52:
						testDukptEncrypt10();
						break;
					case 53:
						testDukptEncrypt11();
						break;
					case 54:
						testDukptEncrypt12();
						break;
					case 55:
						testDukptEncrypt13();
						break;
					case 56:
						testDukptEncrypt14();
						break;
					case 57:
						testDukptEncrypt15();
						break;
					case 58:
						testDukptInjict17();
						break;
					case 59:
						testDukptKsn4();
						break;
					case 60:
						testDukptMAC17();
						break;
					case 61:
						testDukptEncrypt16();
						break;
					case 62:
						testDukptEncrypt17();
						break;
					case 63:
						testDukptInjict18();
						break;
					case 64:
						testDukptEncrypt18();
						break;
					case 65:
						testDukptKsn5();
						break;
					case 66:
						testDukptMAC18();
						break;
					case 67:
						testDukptEncrypt19();
						break;
					case 68:
						testDukptEncrypt20();
						break;
					case 69:
						testDukptEncrypt21();
						break;
					case 70:
						testDukptEncrypt22();
						break;
					case 71:
						testDukptEncrypt23();
						break;
					case 72:
						testDukptEncrypt24();
						break;
					case 73:
						testDukptEncrypt25();
						break;
					case 74:
						testDukptEncrypt26();
						break;
					case 75:
						testDukptEncrypt27();
						break;
					case 76:
						testDukptEncrypt28();
						break;
					case 77:
						testDukptEncrypt29();
						break;
					case 78:
						testDukptEncrypt30();
						break;
					case 79:
						testDukptEncrypt31();
						break;
					case 80:
						testDukptEncrypt32();
						break;
					case 81:
						testDukptMAC19();
						break;
					case 82:
						testDukptMAC20();
						break;
					case 83:
						testDukptMAC21();
						break;
					case 84:
						testDukptMAC22();
						break;
					case 85:
						testDukptMAC23();
						break;
					case 86:
						testDukptEncrypt33();
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

	private void testDukptInjict1() {
		myHandleDeal("testDukptInjict1测试", 0);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0x00, (byte) 0x00, 1, m_initkey, (byte) 0x10, m_initksn, (byte) 0xa);

			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_close();
				if (res3 == 0) {
					myHandleDeal("关闭设备成功", res3);
				} else {
					myHandleDeal("DukptInjict1关闭设备失败", res3);
				}
			} else {
				myHandleDeal("DukptInjict1灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptInjict1打开设备失败", res1);
		}
	}

	private void testDukptInjict2() {
		myHandleDeal("testDukptInjict2测试", 0);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0x00, (byte) 0x09, 2, m_initkey, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_close();
				if (res3 == 0) {
					myHandleDeal("关闭设备成功", res3);
				} else {
					myHandleDeal("DukptInjict2关闭设备失败", res3);
				}
			} else {
				myHandleDeal("DukptInjict2灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptInjict2打开设备失败", res1);
		}
	}

	private void testDukptInjict3() {
		myHandleDeal("testDukptInjict3测试", 0);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0x01, (byte) 0x00, 2, m_initkey, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_close();
				if (res3 == 0) {
					myHandleDeal("关闭设备成功", res3);
				} else {
					myHandleDeal("DukptInjict3关闭设备失败", res3);
				}
			} else {
				myHandleDeal("DukptInjict3灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptInjict3打开设备失败", res1);
		}
	}

	private void testDukptInjict4() {
		myHandleDeal("testDukptInjict4测试", 0);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0x01, (byte) 0x09, 2, m_initkey, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_close();
				if (res3 == 0) {
					myHandleDeal("关闭设备成功", res3);
				} else {
					myHandleDeal("DukptInjict4关闭设备失败", res3);
				}
			} else {
				myHandleDeal("DukptInjict4灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptInjict4打开设备失败", res1);
		}
	}

	private void testDukptInjict5() {
		myHandleDeal("testDukptInjict5测试", 0);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0x00, (byte) 0x00, 1, m_initkey, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_close();
				if (res3 == 0) {
					myHandleDeal("关闭设备成功", res3);
				} else {
					myHandleDeal("DukptInjict5关闭设备失败", res3);
				}
			} else {
				myHandleDeal("DukptInjict5灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptInjict4打开设备失败", res1);
		}
	}

	private void testDukptInjict6() {
		myHandleDeal("testDukptInjict6测试", 0);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0x00, (byte) 0x09, 1, m_initkey, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_close();
				if (res3 == 0) {
					myHandleDeal("关闭设备成功", res3);
				} else {
					myHandleDeal("DukptInjict6关闭设备失败", res3);
				}
			} else {
				myHandleDeal("DukptInjict6灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptInjict4打开设备失败", res1);
		}
	}

	private void testDukptInjict7() {
		myHandleDeal("testDukptInjict7测试", 0);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0x09, (byte) 0x00, 1, m_initkey, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == -6) {
				myHandleDeal("灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_close();
				if (res3 == 0) {
					myHandleDeal("关闭设备成功", res3);
				} else {
					myHandleDeal("DukptInjict7关闭设备失败", res3);
				}
			} else {
				myHandleDeal("DukptInjict7灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptInjict7打开设备失败", res1);
		}
	}

	private void testDukptInjict8() {
		myHandleDeal("testDukptInjict8测试", 0);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0x00, (byte) 0x13, 1, m_initkey, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == -6) {
				myHandleDeal("灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_close();
				if (res3 == 0) {
					myHandleDeal("关闭设备成功", res3);
				} else {
					myHandleDeal("DukptInjict8关闭设备失败", res3);
				}
			} else {
				myHandleDeal("DukptInjict8灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptInjict8打开设备失败", res1);
		}
	}

	private void testDukptInjict9() {
		myHandleDeal("testDukptInjict9测试", 0);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0x00, (byte) 0x05, 0, m_initkey, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == -6) {
				myHandleDeal("灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_close();
				if (res3 == 0) {
					myHandleDeal("关闭设备成功", res3);
				} else {
					myHandleDeal("DukptInjict9关闭设备失败", res3);
				}
			} else {
				myHandleDeal("DukptInjict9灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptInjict9打开设备失败", res1);
		}
	}

	private void testDukptInjict10() {
		myHandleDeal("testDukptInjict10测试", 0);
		String initkey1 = "012345678998765432101122334455";
		byte[] mdata = ByteUtils.hexString2ByteArray(ParaEntity.initkey1);
		String initksn = "FFFFFFFFFFFFFFFFFFFF31";
		byte[] mKSn = ByteUtils.hexString2ByteArray(ParaEntity.initksn);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0x00, (byte) 0x05, 1, mdata, (byte) 0x10, m_initksn, (byte) 0xa);
			int res6 = Ddi.ddi_dukpt_inject((byte) 0x00, (byte) 0x10, 1, mdata, (byte) 0x10, m_initksn, (byte) 0xa);
			int res3 = Ddi.ddi_dukpt_inject((byte) 0x00, (byte) 0x05, 1, m_initkey, (byte) 0x11, m_initksn, (byte) 0xa);
			int res4 = Ddi.ddi_dukpt_inject((byte) 0x00, (byte) 0x05, 1, m_initkey, (byte) 0x10, m_initksn, (byte) 0xb);
			int res5 = Ddi.ddi_dukpt_inject((byte) 0x00, (byte) 0x05, 1, m_initkey, (byte) 0x10, mKSn, (byte) 0xa);
			if (res2 == 0 && res3 == -6 && res4 == -6 && res5 == 0 && res6 == -6) {
				myHandleDeal("灌注密钥成功", res2);
				int res9 = Ddi.ddi_dukpt_close();
				if (res9 == 0) {
					myHandleDeal("关闭设备成功", res9);
				} else {
					myHandleDeal("DukptInjict10关闭设备失败", res9);
				}
			} else {
				myHandleDeal("DukptInjict10灌注密钥失败" + res2 + res3 + res4 + res5 + res6, res2);
			}
		} else {
			myHandleDeal("DukptInjict10打开设备失败", res1);
		}
	}

	private void testDukptInjict11() {
		myHandleDeal("testDukptInjict11测试", 0);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0x00, (byte) 0x09, 2, m_initkey1, (byte) 0x10, m_initksn,
					(byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_close();
				if (res3 == 0) {
					myHandleDeal("关闭设备成功", res3);
				} else {
					myHandleDeal("DukptInjict11关闭设备失败", res3);
				}
			} else {
				myHandleDeal("DukptInjict11灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptInjict11打开设备失败", res1);
		}
	}

	private void testDukptInjict12() {
		myHandleDeal("testDukptInjict12测试", 0);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0x00, (byte) 0x09, 1, m_initkey1, (byte) 0x10, m_initksn,
					(byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_close();
				if (res3 == 0) {
					myHandleDeal("关闭设备成功", res3);
				} else {
					myHandleDeal("DukptInjict12关闭设备失败", res3);
				}
			} else {
				myHandleDeal("DukptInjict12灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptInjict12打开设备失败", res1);
		}
	}

	private void testDukptInjict13() {
		myHandleDeal("testDukptInjict13测试", 0);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0xa, (byte) 0xa, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == -6) {
				myHandleDeal("测试成功", res2);
				int res3 = Ddi.ddi_dukpt_close();
				if (res3 == 0) {
					myHandleDeal("关闭设备成功", res3);
				} else {
					myHandleDeal("DukptInjict13关闭设备失败", res3);
				}
			} else {
				myHandleDeal("DukptInjict13测试失败", res2);
			}
		} else {
			myHandleDeal("DukptInjict13打开设备失败", res1);
		}
	}

	private void testDukptInjict14() {
		myHandleDeal("testDukptInjict14测试", 0);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) -1, (byte) -1, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == -6) {
				myHandleDeal("测试成功", res2);
				int res3 = Ddi.ddi_dukpt_close();
				if (res3 == 0) {
					myHandleDeal("关闭设备成功", res3);
				} else {
					myHandleDeal("DukptInjict14关闭设备失败", res3);
				}
			} else {
				myHandleDeal("DukptInjict14测试失败", res2);
			}
		} else {
			myHandleDeal("DukptInjict14打开设备失败", res1);
		}
	}

	private void testDukptInjict15() {
		myHandleDeal("testDukptInjict15测试", 0);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 0, 3, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == -6) {
				myHandleDeal("测试成功", res2);
				int res3 = Ddi.ddi_dukpt_close();
				if (res3 == 0) {
					myHandleDeal("关闭设备成功", res3);
				} else {
					myHandleDeal("DukptInjict15关闭设备失败", res3);
				}
			} else {
				myHandleDeal("DukptInjict15测试失败", res2);
			}
		} else {
			myHandleDeal("DukptInjict15打开设备失败", res1);
		}
	}

	private void testDukptInjict16() {
		myHandleDeal("testDukptInjict16测试", 0);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 0, 0, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == -6) {
				myHandleDeal("测试成功", res2);
				int res3 = Ddi.ddi_dukpt_close();
				if (res3 == 0) {
					myHandleDeal("关闭设备成功", res3);
				} else {
					myHandleDeal("DukptInjict16关闭设备失败", res3);
				}
			} else {
				myHandleDeal("DukptInjict16测试失败", res2);
			}
		} else {
			myHandleDeal("DukptInjict16打开设备失败", res1);
		}
	}

	private void testDukptInjict17() {
		myHandleDeal("testDukptInjict17测试", 0);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0x00, (byte) 0x00, 1, m_initkey, (byte) 0x10, m_initksn, (byte) 0xa);
			myHandleDeal("灌注密钥成功" + res2, res2);
			long begin = System.currentTimeMillis();

			for (int i = 0; i < 500; i++) {
				int res4 = Ddi.ddi_dukpt_inject((byte) 0x00, (byte) 0x00, 1, m_initkey, (byte) 0x10, m_initksn,
						(byte) 0xa);
			}
			long end = System.currentTimeMillis();
			long current = end - begin;
			myHandleDeal("DUKPTECB 注入秘钥耗时" + current + "秒", 0);
		} else {
			myHandleDeal("DukptInjict1打开设备失败", res1);
		}
	}

	private void testDukptInjict18() {
		myHandleDeal("testDukptInjict18测试", 0);
		
		Runnable runnable = new Runnable() {
			public void run() {
				int res1 = Ddi.ddi_dukpt_open();
				if (res1 == 0) {
					myHandleDeal("打开设备成功", res1);
					for (int i = 0; i < 2; i++) {
						for (int j = 0; j < 10; j++) {
							int res2 = Ddi.ddi_dukpt_inject((byte) i, (byte) j, 1, m_initkey, (byte) 0x10, m_initksn,
									(byte) 0xa);
							if (res2 == 0) {
								myHandleDeal("第" + i + "组" + "第" + j + "索引注入成功", res2);
							}

						}

					}

					int res2 = Ddi.ddi_dukpt_inject((byte) 0x00, (byte) 0x00, 1, m_initkey, (byte) 0x10, m_initksn,
							(byte) 0xa);
					if (res2 == 0) {
						myHandleDeal("灌注密钥成功", res2);
						int res3 = Ddi.ddi_dukpt_close();
						if (res3 == 0) {
							myHandleDeal("关闭设备成功", res3);
						} else {
							myHandleDeal("DukptInjict18关闭设备失败", res3);
						}
					} else {
						myHandleDeal("DukptInjict18灌注密钥失败", res2);
					}
				} else {
					myHandleDeal("DukptInjict18打开设备失败", res1);
				}
			}
		};
		Thread Injict18 = new Thread(runnable);
		Injict18.start();
		try {
			Injict18.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void testDukptEncrypt1() {
		myHandleDeal("testDukptEncrypt1测试", 0);
		String data = "f1acee231d370a171543cd366bb731349eeacd6590270b43";
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 0, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_encrypt(0, 0, (byte) 0, iv, 0, m_plain, m_plain.length, cipher);
				String str = ByteUtils.byteArray2HexString(cipher);
				if (res3 == 0 && str.equals(data)) {
					myHandleDeal("加密成功", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("关闭设备成功", res4);
					} else {
						myHandleDeal("DukptEncrypt1关闭设备失败", res4);
					}
				} else {
					myHandleDeal("DukptEncrypt1加密失败" + str, res3);
				}
			} else {
				myHandleDeal("DukptEncrypt1灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptEncrypt1打开设备失败", res1);
		}
		
	}

	private void testDukptEncrypt2() {
		myHandleDeal("testDukptEncrypt2测试", 0);
		String data = "8d6fa88a5469618bffba1886e053ceb168687b4a13894d57";
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 9, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_encrypt(1, 9, (byte) 0, iv, 1, m_plain, m_plain.length, cipher);
				String str = ByteUtils.byteArray2HexString(cipher);
				if (res3 == 0 && str.equals(data)) {
					myHandleDeal("加密成功", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("关闭设备成功", res4);
					} else {
						myHandleDeal("DukptEncrypt2关闭设备失败", res4);
					}
				} else {
					myHandleDeal("DukptEncrypt2加密失败", res3);
				}
			} else {
				myHandleDeal("DukptEncrypt2灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptEncrypt2打开设备失败", res1);
		}
	}

	private void testDukptEncrypt3() {
		
//		myHandleDeal("testDukptEncrypt3测试", 0);
//		String data = "2906db3a39a725b8ffad9dfbadd9ba294aa2c71abbf64e9f";
//		int res1 = Ddi.ddi_dukpt_open();
//		if (res1 == 0) {
//			myHandleDeal("打开设备成功", res1);
////			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 8, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
////			if (res2 == 0) {
////				myHandleDeal("灌注密钥成功", res2);
////			
////			} else {
////				myHandleDeal("DukptEncrypt3灌注密钥失败", res2);
////			}
//			
//			int res3 = Ddi.ddi_dukpt_encrypt(1, 5, (byte) 0, iv, 0, m_plain, m_plain.length, cipher);
//			String str = ByteUtils.byteArray2HexString(cipher);
//			if (res3 == 0 && str.equals(data)) {
//				myHandleDeal("加密成功", res3);
//				int res4 = Ddi.ddi_dukpt_close();
//				if (res4 == 0) {
//					myHandleDeal("关闭设备成功", res4);
//				} else {
//					myHandleDeal("DukptEncrypt3关闭设备失败", res4);
//				}
//			} else {
//				myHandleDeal("DukptEncrypt3加密失败"+str, res3);
//			}
//		} else {
//			myHandleDeal("DukptEncrypt3打开设备失败", res1);
//		}
		
		
		myHandleDeal("testDukptEncrypt3测试", 0);
		String data = "2906db3a39a725b8ffad9dfbadd9ba294aa2c71abbf64e9f";
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 8, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_encrypt(1, 8, (byte) 0, iv, 0, m_plain, m_plain.length, cipher);
				String str = ByteUtils.byteArray2HexString(cipher);
				if (res3 == 0 && str.equals(data)) {
					myHandleDeal("加密成功", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("关闭设备成功", res4);
					} else {
						myHandleDeal("DukptEncrypt3关闭设备失败", res4);
					}
				} else {
					myHandleDeal("DukptEncrypt3加密失败", res3);
				}
			} else {
				myHandleDeal("DukptEncrypt3灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptEncrypt3打开设备失败", res1);
		}
		
		
	}

	private void testDukptEncrypt4() {
		myHandleDeal("testDukptEncrypt4测试", 0);
		String data = "a362be1425730942ebbff1ef13ebd7e051ffc09f8bc58a0f";
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 1, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_encrypt(1, 1, (byte) 0, iv, 1, m_plain, m_plain.length, cipher);
				String str = ByteUtils.byteArray2HexString(cipher);
				if (res3 == 0 && str.equals(data)) {
					myHandleDeal("加密成功", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("关闭设备成功", res4);
					} else {
						myHandleDeal("DukptEncrypt4关闭设备失败", res4);
					}
				} else {
					myHandleDeal("DukptEncrypt4加密失败", res3);
				}
			} else {
				myHandleDeal("DukptEncrypt4灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptEncrypt4打开设备失败", res1);
		}
	}

	/*
	 * 大数据加密，目前只支持32位加密
	 */
	private void testDukptEncrypt5() {
		myHandleDeal("testDukptEncrypt5测试", 0);
		String plain = "";
		for (int i = 0; i < 3; i++) {
			plain = plain + "A12345678A123456";
		}
		byte[] m_plain1 = ByteUtils.hexString2ByteArray(plain);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 9, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_encrypt(1, 9, (byte) 0, iv, 1, m_plain1, m_plain1.length, cipher);
				if (res3 == 0) {
					myHandleDeal("加密成功", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("关闭设备成功", res4);
					} else {
						myHandleDeal("DukptEncrypt5关闭设备失败", res4);
					}
				} else {
					myHandleDeal("DukptEncrypt5加密失败", res3);
				}
			} else {
				myHandleDeal("DukptEncrypt5灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptEncrypt5打开设备失败", res1);
		}
	}

	private void testDukptEncrypt6() {
		myHandleDeal("testDukptEncrypt6测试", 0);
		String data = "a0fe82ce901b5c16de0e9fcde3711e22073ac7ec7b7e8dd0";
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 0, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_encrypt(0, 0, (byte) 1, iv, 0, m_plain, m_plain.length, cipher);
				String str = ByteUtils.byteArray2HexString(cipher);
				if (res3 == 0 && str.equals(data)) {
					myHandleDeal("加密成功", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("关闭设备成功", res4);
					} else {
						myHandleDeal("DukptEncrypt6关闭设备失败", res4);
					}
				} else {
					myHandleDeal("DukptEncrypt6加密失败", res3);
				}
			} else {
				myHandleDeal("DukptEncrypt6灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptEncrypt6打开设备失败", res1);
		}
	}

	private void testDukptEncrypt7() {
		myHandleDeal("testDukptEncrypt7测试", 0);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 8, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_encrypt(1, 8, (byte) 1, iv, 0, m_plain, m_plain.length, cipher);
				if (res3 == 0) {
					myHandleDeal("加密成功", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("关闭设备成功", res4);
					} else {
						myHandleDeal("DukptEncrypt7关闭设备失败", res4);
					}
				} else {
					myHandleDeal("DukptEncrypt7加密失败", res3);
				}
			} else {
				myHandleDeal("DukptEncrypt7灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptEncrypt7打开设备失败", res1);
		}
	}

	private void testDukptEncrypt8() {
		myHandleDeal("testDukptEncrypt8测试", 0);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 0, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_encrypt(0, 0, (byte) 0, iv, 2, m_plain, m_plain.length, cipher);
				if (res3 == -6) {
					myHandleDeal("测试成功", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("关闭设备成功", res4);
					} else {
						myHandleDeal("DukptEncrypt8关闭设备失败", res4);
					}
				} else {
					myHandleDeal("DukptEncrypt8测试失败", res3);
				}
			} else {
				myHandleDeal("DukptEncrypt8灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptEncrypt8打开设备失败", res1);
		}
	}

	private void testDukptEncrypt9() {
		myHandleDeal("testDukptEncrypt9测试", 0);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 8, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_encrypt(1, 8, (byte) 0, iv, 2, m_plain, m_plain.length, cipher);
				if (res3 == -6) {
					myHandleDeal("测试成功", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("关闭设备成功", res4);
					} else {
						myHandleDeal("DukptEncrypt9关闭设备失败", res4);
					}
				} else {
					myHandleDeal("DukptEncrypt9测试失败", res3);
				}
			} else {
				myHandleDeal("DukptEncrypt9灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptEncrypt9打开设备失败", res1);
		}
	}

	private void testDukptEncrypt10() {
		myHandleDeal("testDukptEncrypt10测试", 0);
		String data = "f1acee231d370a171543cd366bb731349eeacd6590270b43";
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 0, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
				int res4 = Ddi.ddi_dukpt_encrypt(0, 0, (byte) 0, iv, 0, m_plain, m_plain.length, cipher);
				long begin = System.currentTimeMillis();

				myHandleDeal("灌注密钥成功" + res4, res2);
				for (int i = 0; i < 500; i++) {
					int res3 = Ddi.ddi_dukpt_encrypt(0, 0, (byte) 0, iv, 0, m_plain, m_plain.length, cipher);
				}
				long end = System.currentTimeMillis();
				long current = end - begin;
				myHandleDeal("DUKPTECB 加密模式耗时" + current + "秒", 0);
			} else {
				myHandleDeal("DukptEncrypt1灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptEncrypt1打开设备失败", res1);
		}
	}

	private void testDukptEncrypt11() {
		myHandleDeal("testDukptEncrypt11测试", 0);
		String data = "f1acee231d370a171543cd366bb731349eeacd6590270b43";
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 0, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
				long begin = System.currentTimeMillis();

				for (int i = 0; i < 500; i++) {
					int res3 = Ddi.ddi_dukpt_encrypt(0, 0, (byte) 1, iv, 0, m_plain, m_plain.length, cipher);
				}
				long end = System.currentTimeMillis();
				long current = end - begin;
				myHandleDeal("DUKPTCBC 加密模式耗时" + current + "秒", 0);
			} else {
				myHandleDeal("testDukptEncrypt11灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptEncrypt11打开设备失败", res1);
		}
	}

	private void testDukptEncrypt12() {
		myHandleDeal("testDukptEncrypt12测试", 0);
		byte[] mdata2 = ByteUtils.hexString2ByteArray(ParaEntity.dataString512);
		byte[] cipher1 = new byte[512];
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 0, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_encrypt(0, 0, (byte) 0, iv, 0, mdata2, mdata2.length, cipher1);
				int res5 = Ddi.ddi_dukpt_encrypt(0, 0, (byte) 0, iv, 1, mdata2, mdata2.length, cipher1);
				if (res3 == 0 && res5 == 0) {
					myHandleDeal("加密成功", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("关闭设备成功", res4);
					} else {
						myHandleDeal("DukptEncrypt12关闭设备失败", res4);
					}
				} else {
					myHandleDeal("DukptEncrypt12加密失败" + res5 + res3, res3);
				}
			} else {
				myHandleDeal("DukptEncrypt12灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptEncrypt12打开设备失败", res1);
		}
	}

	private void testDukptEncrypt13() {
		myHandleDeal("testDukptEncrypt13测试", 0);
		String mString = "313131313131313131313131313131";
		byte[] mdata2 = ByteUtils.hexString2ByteArray(ParaEntity.dataString1025);

		byte[] cipher1 = new byte[1024];
		byte[] bmString = ByteUtils.hexString2ByteArray(mString);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 0, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_encrypt(0, 0, (byte) 0, iv, 0, bmString, bmString.length, cipher1);
				int res5 = Ddi.ddi_dukpt_encrypt(0, 0, (byte) 0, iv, 1, mdata2, mdata2.length, cipher1);
				if (res3 == -6 && res5 == -6) {
					myHandleDeal("加密成功", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("关闭设备成功", res4);
					} else {
						myHandleDeal("DukptEncrypt13关闭设备失败", res4);
					}
				} else {
					myHandleDeal("DukptEncrypt13加密失败" + res5 + res3, res3);
				}
			} else {
				myHandleDeal("DukptEncrypt13灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptEncrypt13打开设备失败", res1);
		}
	}

	private void testDukptEncrypt14() {
		myHandleDeal("testDukptEncrypt14测试", 0);
		String mString = "313131313131313131313131313131";
		byte[] bmString = ByteUtils.hexString2ByteArray(mString);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 8, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_encrypt(1, 8, (byte) 0, iv, 0, bmString, bmString.length, cipher);
				if (res3 == -6) {
					myHandleDeal("加密成功", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("关闭设备成功", res4);
					} else {
						myHandleDeal("DukptEncrypt14关闭设备失败", res4);
					}
				} else {
					myHandleDeal("DukptEncrypt14加密失败", res3);
				}
			} else {
				myHandleDeal("DukptEncrypt14灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptEncrypt14打开设备失败", res1);
		}
	}

	private void testDukptEncrypt15() {
		myHandleDeal("testDukptEncrypt15测试", 0);
		String mString = "313131313131313131313131313131";
		byte[] bmString = ByteUtils.hexString2ByteArray(mString);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 8, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
				// 正常
				int res3 = Ddi.ddi_dukpt_encrypt(1, 8, (byte) 1, iv, 0, m_plain, m_plain.length, cipher);
				// 秘钥长度异常
				int res9 = Ddi.ddi_dukpt_encrypt(1, 8, (byte) 1, iv, 0, m_plain, bmString.length, cipher);
				// 请求包、接收包异常
				int res8 = Ddi.ddi_dukpt_encrypt(1, 8, (byte) 1, iv, 2, m_plain, m_plain.length, cipher);
				// 模式异常
				int res7 = Ddi.ddi_dukpt_encrypt(1, 8, (byte) -1, iv, 0, m_plain, m_plain.length, cipher);
				// 索引异常
				int res6 = Ddi.ddi_dukpt_encrypt(1, -1, (byte) 1, iv, 0, m_plain, m_plain.length, cipher);
				// 组数异常
				int res5 = Ddi.ddi_dukpt_encrypt(-1, 8, (byte) 1, iv, 0, m_plain, m_plain.length, cipher);
				if (res3 == 0 && res5 == -6 && res6 == -6 && res7 == -6 && res8 == -6 && res9 == -6) {
					myHandleDeal("加密成功", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("关闭设备成功", res4);
					} else {
						myHandleDeal("DukptEncrypt15关闭设备失败", res4);
					}
				} else {
					myHandleDeal("DukptEncrypt15加密失败" + res5 + res6 + res7 + res8 + res9, res3);
				}
			} else {
				myHandleDeal("DukptEncrypt15灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptEncrypt15打开设备失败", res1);
		}
	}
//KSN自加
	private void testDukptEncrypt16() {
		myHandleDeal("testDukptEncrypt16测试", 0);
		String data = "7D2B803DA749F0DCD22F596C3494B1D6F57B2F10E0196AC5";
		String data1 = "FFFFFFFFFFFFFFE00999";
		String iv1 = "0000000000000000";
		byte[] ksn = new byte[10];
		int res1 = Ddi.ddi_dukpt_open();
		// 注入的秘钥：01234567899876543210112233445566
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			//KSN：FFFFFFFFFFFFFFFFFFFF
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 0, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
//				int res6 = Ddi.ddi_dukpt_add_ksncnt(0, 0, (byte)1);
//				int res7 = Ddi.ddi_dukpt_getksn(0, 0, in, ksn);
//				String byteArray2HexString = ByteUtils.byteArray2HexString(ksn);
				for (int i = 0; i < 100000; i++) {
					int res8 = Ddi.ddi_dukpt_getksn(0, 0, in, ksn);
					String byteArray2HexString = ByteUtils.byteArray2HexString(ksn);
//				Log.v("111111", byteArray2HexString);
					if (res8 == 0 && byteArray2HexString.equalsIgnoreCase(data1)) {
						myHandleDeal("KSN满足条件", res8);
						i = 100000;
					} else {
						int res9 = Ddi.ddi_dukpt_add_ksncnt(0, 0, (byte) 1);
//					myHandleDeal("KSN自加成功"+i,0);
//					Log.v("111111", "KSN自加成功"+i);
					}
				}
				// 加密数据：A12345678A12345678A12345678A12343232323232323232
				int res7 = Ddi.ddi_dukpt_getksn(0, 0, in, ksn);
				String byteArray2HexString = ByteUtils.byteArray2HexString(ksn);
				myHandleDeal("KSN的值：" + byteArray2HexString, 0);
				int res3 = Ddi.ddi_dukpt_encrypt(0, 0, (byte) 1, iv, 0, m_plain, m_plain.length, cipher);
				String str = ByteUtils.byteArray2HexString(cipher);
				if (res3 == 0 && str.equalsIgnoreCase(data)) {
					myHandleDeal("加密成功", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("关闭设备成功", res4);
					} else {
						myHandleDeal("DukptEncrypt16关闭设备失败", res4);
					}
				} else {
					myHandleDeal("DukptEncrypt16加密失败" + str, res3);
				}
			} else {
				myHandleDeal("DukptEncrypt16灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptEncrypt16打开设备失败", res1);
		}
	}

	private void testDukptEncrypt33() {
		Runnable runnable = new Runnable() {
			public void run() {
				myHandleDeal("testDukptEncrypt33测试", 0);
				String data = "f1acee231d370a171543cd366bb731349eeacd6590270b43";
//				String data1 = "FFFFFFFFFFFFFFE00999";
				String iv1 = "0000000000000000";
				byte[] ksn = new byte[10];
				int res1 = Ddi.ddi_dukpt_open();
				// 注入的秘钥：01234567899876543210112233445566
				if (res1 == 0) {
					myHandleDeal("DukptEncrypt33打开设备成功", res1);
					// KSN：FFFFFFFFFFFFFFFFFFFF
					//m_initkey1=01234567899876543210112233445566
					int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 0, 2, m_initkey1, (byte) 0x10, m_initksn,
							(byte) 0xa);
					if (res2 == 0) {
						myHandleDeal("DukptEncrypt33灌注密钥成功", res2);
						//				int res6 = Ddi.ddi_dukpt_add_ksncnt(0, 0, (byte)1);
						//				int res7 = Ddi.ddi_dukpt_getksn(0, 0, in, ksn);
						//				String byteArray2HexString = ByteUtils.byteArray2HexString(ksn);
						//2049
						for (int i = 0; i < 200; i++) {
							int res8 = Ddi.ddi_dukpt_getksn(0, 0, in, ksn);
							String str2 = ByteUtils.byteArray2HexString(ksn);
//							Log.v("TAG", str2);
							int res3 = Ddi.ddi_dukpt_encrypt(0, 0, (byte) 0, iv, 0, m_plain, m_plain.length, cipher);
							
							int res11 = Ddi.ddi_dukpt_get_mac((byte) 0, 0, 0, 0, m_plain1, m_plain1.length, mac);
							
							if (res3==0&&res11==0) {
								myHandleDeal(res11+"DukptEncrypt33加密和getmac成功"+i, res3);
								int res10 = Ddi.ddi_dukpt_getksn(0, 0, in, ksn);
								String str3 = ByteUtils.byteArray2HexString(ksn);
//								Log.v("TAG", str3);
								int res9 = Ddi.ddi_dukpt_add_ksncnt(0, 0, (byte) 1);
								if (str2.equalsIgnoreCase(str3) ) {
								myHandleDeal("DukptEncrypt33加密成功"+i, res3);
								
								} else {
									myHandleDeal("DukptEncrypt33加密失败" + i, res3);
								}
								
							} else {
								myHandleDeal(res11+"DukptEncrypt33加密和getmac失败"+i, res3);

							}
						}
						myHandleDeal("DukptEncrypt33KSN自加10万次完成", 0);
					} else {
						myHandleDeal("DukptEncryp灌注秘钥失败", res2);
					}

				} else {
					myHandleDeal("DukptEncrypt33打开设备失败", res1);

				}
				int res4 = Ddi.ddi_dukpt_close();
				if (res4 == 0) {
					myHandleDeal("DukptEncrypt33关闭设备成功", res4);
				} else {
					myHandleDeal("DukptEncrypt33关闭设备失败", res4);
				}
			}
		};
		Thread Encrypt33 = new Thread(runnable);
		Encrypt33.start();
		try {
			Encrypt33.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void testDukptEncrypt17() {
		myHandleDeal("testDukptEncrypt17测试", 0);
		String data = "0398D10CB54F557646E3A5D549646576DCE4D0A734152550";
		String data1 = "FFFFFFFFFFFFFFE00999";
		byte[] ksn = new byte[10];
		int res1 = Ddi.ddi_dukpt_open();
		// 注入的秘钥：01234567899876543210112233445566
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 0, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
//				int res6 = Ddi.ddi_dukpt_add_ksncnt(0, 0, (byte)1);
//				int res7 = Ddi.ddi_dukpt_getksn(0, 0, in, ksn);
//				String byteArray2HexString = ByteUtils.byteArray2HexString(ksn);
				for (int i = 0; i < 100000; i++) {
					int res8 = Ddi.ddi_dukpt_getksn(0, 0, in, ksn);
					String byteArray2HexString = ByteUtils.byteArray2HexString(ksn);
				Log.v("111111", byteArray2HexString);
					if (res8 == 0 && byteArray2HexString.equalsIgnoreCase(data1)) {
						myHandleDeal("KSN满足条件", res8);
						i = 100000;
					} else {
						int res9 = Ddi.ddi_dukpt_add_ksncnt(0, 0, (byte) 1);
//					myHandleDeal("KSN自加成功"+i,0);
//					Log.v("111111", "KSN自加成功"+i);

					}

				}
				// 加密数据：A12345678A12345678A12345678A12343232323232323232
				int res7 = Ddi.ddi_dukpt_getksn(0, 0, in, ksn);
				String byteArray2HexString = ByteUtils.byteArray2HexString(ksn);
				myHandleDeal("KSN的值：" + byteArray2HexString, 0);
				int res3 = Ddi.ddi_dukpt_encrypt(0, 0, (byte) 0, iv, 0, m_plain, m_plain.length, cipher);
				String str = ByteUtils.byteArray2HexString(cipher);
				if (res3 == 0 && str.equalsIgnoreCase(data)) {
					myHandleDeal("加密成功", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("关闭设备成功", res4);
					} else {
						myHandleDeal("DukptEncrypt1关闭设备失败", res4);
					}
				} else {
					myHandleDeal("DukptEncrypt1加密失败" + str, res3);
				}
			} else {
				myHandleDeal("DukptEncrypt1灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptEncrypt1打开设备失败", res1);
		}
	}

	// 2018.9.11
//	N3最新支持的DUKPT秘钥组数为0、1，每组索引为0-9
//	private void testDukptEncrypt10(){
//		iv=30303030abCDef99
//	}
	// pinblock = new byte[8]
	private void testDukptPinblock1() {
		myHandleDeal("testDukptPinblock1", 0);
		String data = "4e1494e199d1b3a8";
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == -1) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 9, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
				// 30303030abCDef99
				int res3 = Ddi.ddi_dukpt_get_pin((byte) 0, 9, 0, iv, pinblock);
				String str = ByteUtils.byteArray2HexString(pinblock);
				if (res3 == 0 && str.equals(data)) {
					myHandleDeal("计算Pinblock成功", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("关闭设备成功", res4);
					} else {
						myHandleDeal("DukptPinblock1关闭设备失败", res4);
					}
				} else {
					myHandleDeal("DukptPinblock1计算Pinblock失败", res3);
				}
			} else {
				myHandleDeal("DukptPinblock1灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("PINblock需要使用输入秘钥工具测试测试失败", -99);
		}
	}

	private void testDukptEncrypt18() {
		myHandleDeal("testDukptEncrypt18测试", 0);
		String data = "f1acee231d370a171543cd366bb731349eeacd6590270b43";
		
		Runnable runnable = new Runnable() {
			public void run() {
				int res1 = Ddi.ddi_dukpt_open();
				if (res1 == 0) {
					myHandleDeal("打开设备成功", res1);
					//1026
					for (int a = 0; a < 100; a++) {
						for (int i = 0; i < 2; i++) {
							for (int j = 0; j < 10; j++) {
								int res2 = Ddi.ddi_dukpt_inject((byte) i, (byte) j, 1, m_initkey, (byte) 0x10,
										m_initksn, (byte) 0xa);
								if (res2 == 0) {
									myHandleDeal("第" + a + "次" + i + "组" + "第" + j + "索引注入成功", res2);
									int res3 = Ddi.ddi_dukpt_encrypt(i, j, (byte) 0, iv, 0, m_plain, m_plain.length,
											cipher);
									String str = ByteUtils.byteArray2HexString(cipher);
									if (res3 == 0) {
										myHandleDeal("第" + a + "次" + i + "组" + "第" + j + "索引加密成功", res3);

									}
								}

							}

						}
					}
					int res2 = Ddi.ddi_dukpt_inject((byte) 0x00, (byte) 0x00, 1, m_initkey, (byte) 0x10, m_initksn,
							(byte) 0xa);
					if (res2 == 0) {
						myHandleDeal("灌注密钥成功", res2);
						int res3 = Ddi.ddi_dukpt_close();
						if (res3 == 0) {
							myHandleDeal("关闭设备成功", res3);
						} else {
							myHandleDeal("DukptInjict18关闭设备失败", res3);
						}
					} else {
						myHandleDeal("DukptInjict18灌注密钥失败", res2);
					}
				} else {
					myHandleDeal("DukptInjict18打开设备失败", res1);
				}
			}
		};
		Thread Injict18 = new Thread(runnable);
		Injict18.start();
		try {
			Injict18.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void testDukptEncrypt19() {
		myHandleDeal("testDukptEncrypt19测试", 0);
		String data = "f1acee231d370a171543cd366bb731349eeacd6590270b43";

//		Thread mThread = new Thread(new Runnable() {
//			public void run() {
//				for (int i = 0; i < 2000; i++) {
		int res1 = Ddi.ddi_dukpt_open();
		int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 0, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
		if (res2 == 0) {
			myHandleDeal("DukptEncrypt19灌注密钥成功", res2);

			int res3 = Ddi.ddi_dukpt_encrypt(6, 6, (byte) 0, iv, 0, m_plain, m_plain.length, cipher);
			if (res3 == -6) {
				myHandleDeal("DukptEncrypt19加密成功", res3);

			} else {
				myHandleDeal("DukptEncrypt19加密失败", res3);
			}

		} else {
			myHandleDeal("DukptEncrypt19灌注密钥失败", res2);
		}
//				}
//			}
//		});

//		mThread.start();

		int res4 = Ddi.ddi_dukpt_close();
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
	 *         byte[]cipher); 相关测试用例到123为止，DUKpt相关的在DUKPT里面 DUKPT请求和接收加密
	 *         请求包加密计算方式：先用DUKPT工具计算出KEY值：DC56264BEAF2DB97062A1B101D0D529C
	 *         然后在用DES计算工具把KEY值作为秘钥，你要加密的数据作为数据，进行DES加密，如果是ECBIV不参与运算，CBC参与，
	 *         工具是用该方式计算的KEY；其实里面的计算逻辑和响应包一样的 固定值：0000000000ff00000000000000ff0000
	 *
	 *         响应包加密计算方式：先用DUKPT工具计算出请求包的PEK值 78CA078C40375BF4C8818E8495D40735
	 *         然后用PEK值和固定值000000ff00000000000000ff00000000（加密数据）进行异或后数据
	 *         78CA077340375BF4C8818E7B95D40735，然后用异或后的数据自己对自己进行DES
	 *         ECB模式加密（固定为ECB）后得到的数据就是KEY值35EDA924741ECBEFC7046D1B7D28C3FA；
	 */
	// 请求包 ECB/CBC BDK DUKPT 最小索引
	private void testDukptEncrypt20() {
		myHandleDeal("testDukptEncrypt20测试", 0);
		if (MainActivity.model.equalsIgnoreCase("N5")||MainActivity.model.equalsIgnoreCase("F900")||MainActivity.model.equalsIgnoreCase("EF900")||MainActivity.model.equalsIgnoreCase("N86")) {
			String data = "f1acee231d370a171543cd366bb731349eeacd6590270b43";
			String data2 = "A0FE82CE901B5C16DE0E9FCDE3711E22073AC7EC7B7E8DD0";
			int res1 = Ddi.ddi_dukpt_open();
			if (res1 == 0) {
				myHandleDeal("DukptEncrypt20打开设备成功", res1);
				// 2=BDK 1=IPEK
				// m_initkey1=01234567899876543210112233445566
				// m_initksn=FFFFFFFFFFFFFFFFFFFF
				int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 0, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
				if (res2 == 0) {
					myHandleDeal("DukptEncrypt20灌注密钥成功", res2);
					int res5 = Ddi.ddi_innerkey_open();
					if (res5 == 0) {
						myHandleDeal("DukptEncrypt20打开内置秘钥成功", res5);
					}
					// 0=请求包 1=接收包
					// m_plain=A12345678A12345678A12345678A12343232323232323232
					// iv=30303030abCDef99
					// 请求包 ECB KEY=DC56264BEAF2DB97062A1B101D0D529C
					int res3 = Ddi.ddi_innerkey_account_encrypt(0, 0, 0, m_plain, m_plain.length, iv, cipher);
					String str = ByteUtils.byteArray2HexString(cipher);
					// 请求包 CBC KEY=DC56264BEAF2DB97062A1B101D0D529C
					int res6 = Ddi.ddi_innerkey_account_encrypt(1, 0, 0, m_plain, m_plain.length, iv, cipher);
					String str2 = ByteUtils.byteArray2HexString(cipher);
					if (res3 == 0 && str.equalsIgnoreCase(data) && res6 == 0 && str2.equalsIgnoreCase(data2)) {
						myHandleDeal("DukptEncrypt20加密成功", res3);
					} else {
						myHandleDeal("DukptEncrypt20加密失败" + str, res3);
					}
				} else {
					myHandleDeal("DukptEncrypt20灌注密钥失败", res2);
				}
			} else {
				myHandleDeal("DukptEncrypt20打开设备失败", res1);
			}
			int res4 = Ddi.ddi_dukpt_close();
			int res7 = Ddi.ddi_innerkey_close();
			if (res4 == 0 && res7 == 0) {
				myHandleDeal("DukptEncrypt20关闭接口成功", res4);
			} else {
				myHandleDeal("DukptEncrypt20关闭接口失败", res4);
			}
		} else {
			myHandleDeal("DukptEncrypt20测试失败" + MainActivity.model + "不支持加密卡的账户数据", -99);
		}
	}

	// 响应包 ECB/CBC IPEK DUKPT 最大索引
	private void testDukptEncrypt21() {
		myHandleDeal("testDukptEncrypt21测试", 0);
		if (MainActivity.model.equalsIgnoreCase("N5")||MainActivity.model.equalsIgnoreCase("EF900")||MainActivity.model.equalsIgnoreCase("F900")||MainActivity.model.equalsIgnoreCase("N86")) {
			String data = "A362BE1425730942EBBFF1EF13EBD7E051FFC09F8BC58A0F";
			String data2 = "6FF6CD11C7E73D1E4744B1F92EB5B406660056DDD01174CC";
			int res1 = Ddi.ddi_dukpt_open();
			if (res1 == 0) {
				myHandleDeal("DukptEncrypt21打开设备成功", res1);
				// 2=BDK 1=IPEK
				// m_initkey1=01234567899876543210112233445566
				// m_initksn=FFFFFFFFFFFFFFFFFFFF
				int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 9, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
				if (res2 == 0) {
					myHandleDeal("DukptEncrypt21灌注密钥成功", res2);
					int res5 = Ddi.ddi_innerkey_open();
					if (res5 == 0) {
						myHandleDeal("DukptEncrypt21打开内置秘钥成功", res5);
					}
					// 0=请求包 1=接收包
					// m_plain=A12345678A12345678A12345678A12343232323232323232
					// iv=30303030abCDef99
					// 响应包 ECB KEY=4581DE4FFD1A87526081EB4E48803334
					int res3 = Ddi.ddi_innerkey_account_encrypt(16, 1, 9, m_plain, m_plain.length, iv, cipher);
					String str = ByteUtils.byteArray2HexString(cipher);
					// 响应包 CBC KEY=4581DE4FFD1A87526081EB4E48803334
					int res6 = Ddi.ddi_innerkey_account_encrypt(17, 1, 9, m_plain, m_plain.length, iv, cipher);
					String str2 = ByteUtils.byteArray2HexString(cipher);
					if (res3 == 0 && str.equalsIgnoreCase(data) && res6 == 0 && str2.equalsIgnoreCase(data2)) {
						myHandleDeal("DukptEncrypt21加密成功", res3);
					} else {
						myHandleDeal("DukptEncrypt21加密失败" + str, res3);
					}
				} else {
					myHandleDeal("DukptEncrypt21灌注密钥失败", res2);
				}
			} else {
				myHandleDeal("DukptEncrypt21打开设备失败", res1);
			}
			int res4 = Ddi.ddi_dukpt_close();
			int res7 = Ddi.ddi_innerkey_close();
			if (res4 == 0 && res7 == 0) {
				myHandleDeal("DukptEncrypt21关闭接口成功", res4);
			} else {
				myHandleDeal("DukptEncrypt21关闭接口失败", res4);
			}
		} else {
			myHandleDeal("DukptEncrypt21测试失败" + MainActivity.model + "不支持加密卡的账户数据", -99);
		}
	}

	// 请求包 ECB/CBC IPEK DUKPT 最中间索引
	private void testDukptEncrypt22() {
		myHandleDeal("testDukptEncrypt22测试", 0);
		if (MainActivity.model.equalsIgnoreCase("N5")||MainActivity.model.equalsIgnoreCase("EF900")||MainActivity.model.equalsIgnoreCase("F900")||MainActivity.model.equalsIgnoreCase("N86")) {
			String data = "2906DB3A39A725B8FFAD9DFBADD9BA294AA2C71ABBF64E9F";
			String data2 = "9D91F67935F0467DB98A492B71D122D0BA523F44E0FA2F3F";
			int res1 = Ddi.ddi_dukpt_open();
			if (res1 == 0) {
				myHandleDeal("DukptEncrypt22打开设备成功", res1);
				// 2=BDK 1=IPEK
				// m_initkey1=01234567899876543210112233445566
				// m_initksn=FFFFFFFFFFFFFFFFFFFF
				int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 5, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
				if (res2 == 0) {
					myHandleDeal("DukptEncrypt22灌注密钥成功", res2);
					int res5 = Ddi.ddi_innerkey_open();
					if (res5 == 0) {
						myHandleDeal("DukptEncrypt22打开内置秘钥成功", res5);
					}
					// 0=请求包 1=接收包
					// m_plain=A12345678A12345678A12345678A12343232323232323232
					// iv=30303030abCDef99
					// 响应包 ECB KEY=9BB1049580132E42D8B13FF8B2299F8D
					int res3 = Ddi.ddi_innerkey_account_encrypt(0, 0, 5, m_plain, m_plain.length, iv, cipher);
					String str = ByteUtils.byteArray2HexString(cipher);
					// 响应包 CBC KEY=9BB1049580132E42D8B13FF8B2299F8D
					int res6 = Ddi.ddi_innerkey_account_encrypt(1, 0, 5, m_plain, m_plain.length, iv, cipher);
					String str2 = ByteUtils.byteArray2HexString(cipher);
					if (res3 == 0 && str.equalsIgnoreCase(data) && res6 == 0 && str2.equalsIgnoreCase(data2)) {
						myHandleDeal("DukptEncrypt22加密成功", res3);
					} else {
						myHandleDeal("DukptEncrypt22加密失败" + str, res3);
					}
				} else {
					myHandleDeal("DukptEncrypt22灌注密钥失败", res2);
				}
			} else {
				myHandleDeal("DukptEncrypt22打开设备失败", res1);
			}
			int res4 = Ddi.ddi_dukpt_close();
			int res7 = Ddi.ddi_innerkey_close();
			if (res4 == 0 && res7 == 0) {
				myHandleDeal("DukptEncrypt22关闭接口成功", res4);
			} else {
				myHandleDeal("DukptEncrypt22关闭接口失败", res4);
			}
		} else {
			myHandleDeal("DukptEncrypt22测试失败" + MainActivity.model + "不支持加密卡的账户数据", -99);
		}
	}

	// 响应包 ECB/CBC BDK DUKPT 最中间索引
	private void testDukptEncrypt23() {
		myHandleDeal("testDukptEncrypt23测试", 0);
		if (MainActivity.model.equalsIgnoreCase("N5")||MainActivity.model.equalsIgnoreCase("EF900")||MainActivity.model.equalsIgnoreCase("F900")||MainActivity.model.equalsIgnoreCase("N86")) {
			String data = "8D6FA88A5469618BFFBA1886E053CEB168687B4A13894D57";
			String data2 = "42949E9F0CADADFAA2DCE095A941E5FCCAB6ECBB9B8AA34D";
			int res1 = Ddi.ddi_dukpt_open();
			if (res1 == 0) {
				myHandleDeal("DukptEncrypt23打开设备成功", res1);
				// 2=BDK 1=IPEK
				// m_initkey1=01234567899876543210112233445566
				// m_initksn=FFFFFFFFFFFFFFFFFFFF
				int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 5, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
				if (res2 == 0) {
					myHandleDeal("DukptEncrypt23灌注密钥成功", res2);
					int res5 = Ddi.ddi_innerkey_open();
					if (res5 == 0) {
						myHandleDeal("DukptEncrypt23打开内置秘钥成功", res5);
					}
					// 0=请求包 1=接收包
					// m_plain=A12345678A12345678A12345678A12343232323232323232
					// iv=30303030abCDef99
					// 响应包 ECB KEY=35EDA924741ECBEFC7046D1B7D28C3FA
					int res3 = Ddi.ddi_innerkey_account_encrypt(16, 1, 5, m_plain, m_plain.length, iv, cipher);
					String str = ByteUtils.byteArray2HexString(cipher);
					// 响应包 CBC KEY=35EDA924741ECBEFC7046D1B7D28C3FA
					int res6 = Ddi.ddi_innerkey_account_encrypt(17, 1, 5, m_plain, m_plain.length, iv, cipher);
					String str2 = ByteUtils.byteArray2HexString(cipher);
					if (res3 == 0 && str.equalsIgnoreCase(data) && res6 == 0 && str2.equalsIgnoreCase(data2)) {
						myHandleDeal("DukptEncrypt23加密成功", res3);
					} else {
						myHandleDeal("DukptEncrypt23加密失败" + str, res3);
					}
				} else {
					myHandleDeal("DukptEncrypt23灌注密钥失败", res2);
				}
			} else {
				myHandleDeal("DukptEncrypt23打开设备失败", res1);
			}
			int res4 = Ddi.ddi_dukpt_close();
			int res7 = Ddi.ddi_innerkey_close();
			if (res4 == 0 && res7 == 0) {
				myHandleDeal("DukptEncrypt23关闭接口成功", res4);
			} else {
				myHandleDeal("DukptEncrypt23关闭接口失败", res4);
			}
		} else {
			myHandleDeal("DukptEncrypt23测试失败" + MainActivity.model + "不支持加密卡的账户数据", -99);
		}

	}

	// 响应包 ECB/CBC BDK DUKPT 最中间索引异常测试
	private void testDukptEncrypt24() {
		myHandleDeal("testDukptEncrypt24测试", 0);
		if (MainActivity.model.equalsIgnoreCase("N5")||MainActivity.model.equalsIgnoreCase("EF900")||MainActivity.model.equalsIgnoreCase("F900")||MainActivity.model.equalsIgnoreCase("N86")) {
			String data = "8D6FA88A5469618BFFBA1886E053CEB168687B4A13894D57";
			String data2 = "42949E9F0CADADFAA2DCE095A941E5FCCAB6ECBB9B8AA34D";
			int res1 = Ddi.ddi_dukpt_open();
			if (res1 == 0) {
				myHandleDeal("DukptEncrypt24打开设备成功", res1);
				// 2=BDK 1=IPEK
				// m_initkey1=01234567899876543210112233445566
				// m_initksn=FFFFFFFFFFFFFFFFFFFF
				int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 5, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
				if (res2 == 0) {
					myHandleDeal("DukptEncrypt24灌注密钥成功", res2);
					int res5 = Ddi.ddi_innerkey_open();
					if (res5 == 0) {
						myHandleDeal("DukptEncrypt24打开内置秘钥成功", res5);
					}
					// 0=请求包 1=接收包
					// m_plain=A12345678A12345678A12345678A12343232323232323232
					// iv=30303030abCDef99
					// 响应包 ECB KEY=35EDA924741ECBEFC7046D1B7D28C3FA
					int res3 = Ddi.ddi_innerkey_account_encrypt(18, 1, 5, m_plain, m_plain.length, iv, cipher);
					String str = ByteUtils.byteArray2HexString(cipher);
					int res7 = Ddi.ddi_innerkey_account_encrypt(24, 1, 5, m_plain, m_plain.length, iv, cipher);
					String str4 = ByteUtils.byteArray2HexString(cipher);
					int res8 = Ddi.ddi_innerkey_account_encrypt(26, 1, 5, m_plain, m_plain.length, iv, cipher);
					String str5 = ByteUtils.byteArray2HexString(cipher);

					// 响应包 CBC KEY=35EDA924741ECBEFC7046D1B7D28C3FA
					int res6 = Ddi.ddi_innerkey_account_encrypt(17, 1, 5, m_plain, m_plain.length, iv, cipher);
					String str2 = ByteUtils.byteArray2HexString(cipher);
					int res9 = Ddi.ddi_innerkey_account_encrypt(19, 1, 5, m_plain, m_plain.length, iv, cipher);
					String str6 = ByteUtils.byteArray2HexString(cipher);
					int res10 = Ddi.ddi_innerkey_account_encrypt(25, 1, 5, m_plain, m_plain.length, iv, cipher);
					String str7 = ByteUtils.byteArray2HexString(cipher);
					int res11 = res3 + res7 + res8 + res9 + res6 + res10;
					if (res11 == 0 && str.equalsIgnoreCase(data) && str4.equalsIgnoreCase(data)
							&& str5.equalsIgnoreCase(data) && str2.equalsIgnoreCase(data2)
							&& str6.equalsIgnoreCase(data2) && str7.equalsIgnoreCase(data2)) {
						myHandleDeal("DukptEncrypt24加密成功", res3);
					} else {
						myHandleDeal("DukptEncrypt24加密失败" + str, res3);
					}
				} else {
					myHandleDeal("DukptEncrypt24灌注密钥失败", res2);
				}
			} else {
				myHandleDeal("DukptEncrypt24打开设备失败", res1);
			}
			int res4 = Ddi.ddi_dukpt_close();
			int res7 = Ddi.ddi_innerkey_close();
			if (res4 == 0 && res7 == 0) {
				myHandleDeal("DukptEncrypt24关闭接口成功", res4);
			} else {
				myHandleDeal("DukptEncrypt24关闭接口失败", res4);
			}
		} else {
			myHandleDeal("DukptEncrypt24测试失败" + MainActivity.model + "不支持加密卡的账户数据", -99);
		}
	}

	// 请求包 ECB/CBC IPEK DUKPT 最中间索引
	private void testDukptEncrypt25() {
		myHandleDeal("testDukptEncrypt25测试", 0);
		if (MainActivity.model.equalsIgnoreCase("N5")||MainActivity.model.equalsIgnoreCase("EF900")||MainActivity.model.equalsIgnoreCase("F900")||MainActivity.model.equalsIgnoreCase("N86")) {
			String data = "2906DB3A39A725B8FFAD9DFBADD9BA294AA2C71ABBF64E9F";
			String data2 = "9D91F67935F0467DB98A492B71D122D0BA523F44E0FA2F3F";
			int res1 = Ddi.ddi_dukpt_open();
			if (res1 == 0) {
				myHandleDeal("DukptEncrypt25打开设备成功", res1);
				// 2=BDK 1=IPEK
				// m_initkey1=01234567899876543210112233445566
				// m_initksn=FFFFFFFFFFFFFFFFFFFF
				int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 5, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
				if (res2 == 0) {
					myHandleDeal("DukptEncrypt25灌注密钥成功", res2);
					int res5 = Ddi.ddi_innerkey_open();
					if (res5 == 0) {
						myHandleDeal("DukptEncrypt25打开内置秘钥成功", res5);
					}
					// 0=请求包 1=接收包
					// m_plain=A12345678A12345678A12345678A12343232323232323232
					// iv=30303030abCDef99
					// 响应包 ECB KEY=9BB1049580132E42D8B13FF8B2299F8D
					int res3 = Ddi.ddi_innerkey_account_encrypt(2, 0, 5, m_plain, m_plain.length, iv, cipher);
					String str = ByteUtils.byteArray2HexString(cipher);
					int res7 = Ddi.ddi_innerkey_account_encrypt(8, 0, 5, m_plain, m_plain.length, iv, cipher);
					String str3 = ByteUtils.byteArray2HexString(cipher);
					int res8 = Ddi.ddi_innerkey_account_encrypt(10, 0, 5, m_plain, m_plain.length, iv, cipher);
					String str4 = ByteUtils.byteArray2HexString(cipher);
					// 响应包 CBC KEY=9BB1049580132E42D8B13FF8B2299F8D
					int res6 = Ddi.ddi_innerkey_account_encrypt(3, 0, 5, m_plain, m_plain.length, iv, cipher);
					String str2 = ByteUtils.byteArray2HexString(cipher);
					int res9 = Ddi.ddi_innerkey_account_encrypt(9, 0, 5, m_plain, m_plain.length, iv, cipher);
					String str5 = ByteUtils.byteArray2HexString(cipher);
					int res10 = Ddi.ddi_innerkey_account_encrypt(11, 0, 5, m_plain, m_plain.length, iv, cipher);
					String str6 = ByteUtils.byteArray2HexString(cipher);

					int res12 = res3 + res6 + res7 + res8 + res9 + res10;
					if (res12 == 0 && str.equalsIgnoreCase(data) && str3.equalsIgnoreCase(data)
							&& str4.equalsIgnoreCase(data) && str2.equalsIgnoreCase(data2)
							&& str5.equalsIgnoreCase(data2) && str6.equalsIgnoreCase(data2)) {
						myHandleDeal("DukptEncrypt25加密成功", res3);
					} else {
						myHandleDeal("DukptEncrypt25加密失败" + str, res3);
					}
				} else {
					myHandleDeal("DukptEncrypt25灌注密钥失败", res2);
				}
			} else {
				myHandleDeal("DukptEncrypt25打开设备失败", res1);
			}
			int res4 = Ddi.ddi_dukpt_close();
			int res7 = Ddi.ddi_innerkey_close();
			if (res4 == 0 && res7 == 0) {
				myHandleDeal("DukptEncrypt25关闭接口成功", res4);
			} else {
				myHandleDeal("DukptEncrypt25关闭接口失败", res4);
			}
		} else {
			myHandleDeal("DukptEncrypt25测试失败" + MainActivity.model + "不支持加密卡的账户数据", -99);
		}
	}

	// 响应包 ECB/CBC BDK DUKPT 异常测试
	private void testDukptEncrypt26() {
		myHandleDeal("testDukptEncrypt26测试", 0);
		if (MainActivity.model.equalsIgnoreCase("N5")||MainActivity.model.equalsIgnoreCase("EF900")||MainActivity.model.equalsIgnoreCase("F900")||MainActivity.model.equalsIgnoreCase("N86")) {
			String data = "8D6FA88A5469618BFFBA1886E053CEB168687B4A13894D57";
			String data2 = "42949E9F0CADADFAA2DCE095A941E5FCCAB6ECBB9B8AA34D";
			int res1 = Ddi.ddi_dukpt_open();
			if (res1 == 0) {
				myHandleDeal("DukptEncrypt26打开设备成功", res1);
				// 2=BDK 1=IPEK
				// m_initkey1=01234567899876543210112233445566
				// m_initksn=FFFFFFFFFFFFFFFFFFFF
				int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 5, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
				if (res2 == 0) {
					myHandleDeal("DukptEncrypt26灌注密钥成功", res2);
					int res5 = Ddi.ddi_innerkey_open();
					if (res5 == 0) {
						myHandleDeal("DukptEncrypt26打开内置秘钥成功", res5);
					}
					// 0=请求包 1=接收包
					// m_plain=A12345678A12345678A12345678A12343232323232323232
					// iv=30303030abCDef99
					// 响应包 ECB KEY=35EDA924741ECBEFC7046D1B7D28C3FA
					int res3 = Ddi.ddi_innerkey_account_encrypt(16, 2, 5, m_plain, m_plain.length, iv, cipher);
					int res4 = Ddi.ddi_innerkey_account_encrypt(16, 2, 15, m_plain, m_plain.length, iv, cipher);
					// String str = ByteUtils.byteArray2HexString(cipher);
					// 响应包 CBC KEY=35EDA924741ECBEFC7046D1B7D28C3FA
					// int res6 = Ddi.ddi_innerkey_account_encrypt(17, 1, 5, m_plain,
					// m_plain.length, iv, cipher);
					String str2 = ByteUtils.byteArray2HexString(cipher);
					if (res3 == -6 && res3 == -6) {
						myHandleDeal("DukptEncrypt26加密成功", res3);
					} else {
						myHandleDeal("DukptEncrypt26加密失败", res3);
					}
				} else {
					myHandleDeal("DukptEncrypt26灌注密钥失败", res2);
				}
			} else {
				myHandleDeal("DukptEncrypt26打开设备失败", res1);
			}
			int res4 = Ddi.ddi_dukpt_close();
			int res7 = Ddi.ddi_innerkey_close();
			if (res4 == 0 && res7 == 0) {
				myHandleDeal("DukptEncrypt26关闭接口成功", res4);
			} else {
				myHandleDeal("DukptEncrypt26关闭接口失败", res4);
			}
		} else {
			myHandleDeal("DukptEncrypt26测试失败" + MainActivity.model + "不支持加密卡的账户数据", -99);
		}
	}


	// 内置密钥运算接口(DES,SM4,AES)、DUKPT数据加密及MAC计算最大输入待运算数据长度修改为2048;
	// DukptEncryp（BDK，请求包）CBC/ECB
	public void testDukptEncrypt27() {
		//4096
		myHandleDeal("testDukptEncrypt27测试", 0);
//				String data = "f1acee231d370a171543cd366bb731349eeacd6590270b43";
		byte[] hexString2ByteArray = ByteUtils.hexString2ByteArray(ParaEntity.dataString2048);
		byte[] ByteArray = new byte[2048];
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("DukptEncrypt27打开设备成功", res1);
			// 2=BDK 1=IPEK
			// m_initkey1=01234567899876543210112233445566
			// m_initksn=FFFFFFFFFFFFFFFFFFFF
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 4, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("DukptEncrypt27灌注密钥成功", res2);
				// 请求包=0 接收包=1
				// m_plain=A12345678A12345678A12345678A12343232323232323232
				// ECB
				int res3 = Ddi.ddi_dukpt_encrypt(0, 4, (byte) 0, iv, 0, hexString2ByteArray, hexString2ByteArray.length,
						ByteArray);
				String str = ByteUtils.byteArray2HexString(ByteArray);
				if (res3 == 0 && str.equalsIgnoreCase(ParaEntity.DukptEncrypt27ECB)) {
					myHandleDeal("DukptEncrypt27ECB加密成功", res3);
				} else {
					myHandleDeal("DukptEncrypt27ECB加密失败", res3);
				}
				// CBC
				int res5 = Ddi.ddi_dukpt_encrypt(0, 4, (byte) 1, iv, 0, hexString2ByteArray, hexString2ByteArray.length,
						ByteArray);
				String str1 = ByteUtils.byteArray2HexString(ByteArray);
				if (res5 == 0 && str1.equalsIgnoreCase(ParaEntity.DukptEncrypt27CBC)) {
					myHandleDeal("DukptEncrypt27CBC加密成功", res3);
				} else {
					myHandleDeal("DukptEncrypt27CBC加密失败", res3);
				}
			} else {
				myHandleDeal("DukptEncrypt27CBC灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptEncrypt27打开设备失败", res1);
		}

		int res4 = Ddi.ddi_dukpt_close();
		if (res4 == 0) {
			myHandleDeal("DukptEncrypt27关闭设备成功", res4);
		} else {
			myHandleDeal("DukptEncrypt27关闭设备失败", res4);
		}
		
		//2048
//	
	}

	// 内置密钥运算接口(DES,SM4,AES)、DUKPT数据加密及MAC计算最大输入待运算数据长度修改为2048;
	// DukptEncryp（IPEK，请求包）CBC/ECB
	public void testDukptEncrypt28() {
		//4096
		myHandleDeal("testDukptEncrypt28测试", 0);
//				String data = "f1acee231d370a171543cd366bb731349eeacd6590270b43";
		byte[] hexString2ByteArray = ByteUtils.hexString2ByteArray(ParaEntity.dataString2048);
		byte[] ByteArray = new byte[2048];
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("DukptEncrypt28打开设备成功", res1);
			// 2=BDK 1=IPEK
			// m_initkey1=01234567899876543210112233445566
			// m_initksn=FFFFFFFFFFFFFFFFFFFF
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 4, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("DukptEncrypt28灌注密钥成功", res2);
				// 请求包=0 接收包=1
				// m_plain=A12345678A12345678A12345678A12343232323232323232
				// ECB
				int res3 = Ddi.ddi_dukpt_encrypt(0, 4, (byte) 0, iv, 0, hexString2ByteArray, hexString2ByteArray.length,
						ByteArray);
				String str = ByteUtils.byteArray2HexString(ByteArray);
				if (res3 == 0 && str.equalsIgnoreCase(ParaEntity.DukptEncrypt28ECB)) {
					myHandleDeal("DukptEncrypt28ECB加密成功", res3);
				} else {
					myHandleDeal("DukptEncrypt28ECB加密失败", res3);
				}
				// CBC
				int res5 = Ddi.ddi_dukpt_encrypt(0, 4, (byte) 1, iv, 0, hexString2ByteArray, hexString2ByteArray.length,
						ByteArray);
				String str1 = ByteUtils.byteArray2HexString(ByteArray);
				if (res5 == 0 && str1.equalsIgnoreCase(ParaEntity.DukptEncrypt28CBC)) {
					myHandleDeal("DukptEncrypt28CBC加密成功", res3);
				} else {
					myHandleDeal("DukptEncrypt28CBC加密失败", res3);
				}
			} else {
				myHandleDeal("DukptEncrypt28CBC灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptEncrypt28打开设备失败", res1);
		}

		int res4 = Ddi.ddi_dukpt_close();
		if (res4 == 0) {
			myHandleDeal("DukptEncrypt28关闭设备成功", res4);
		} else {
			myHandleDeal("DukptEncrypt28关闭设备失败", res4);
		}
	
	}

	// 内置密钥运算接口(DES,SM4,AES)、DUKPT数据加密及MAC计算最大输入待运算数据长度修改为2048;
	// DukptEncryp（BDK，响应包）CBC/ECB
	public void testDukptEncrypt29() {
		
		myHandleDeal("testDukptEncrypt29测试", 0);
//				String data = "f1acee231d370a171543cd366bb731349eeacd6590270b43";
		byte[] hexString2ByteArray = ByteUtils.hexString2ByteArray(ParaEntity.dataString2048);
		byte[] ByteArray = new byte[2048];
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("DukptEncrypt29打开设备成功", res1);
			// 2=BDK 1=IPEK
			// m_initkey1=01234567899876543210112233445566
			// m_initksn=FFFFFFFFFFFFFFFFFFFF
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 4, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("DukptEncrypt29灌注密钥成功", res2);
				// 请求包=0 接收包=1
				// m_plain=A12345678A12345678A12345678A12343232323232323232
				// ECB
				int res3 = Ddi.ddi_dukpt_encrypt(0, 4, (byte) 0, iv, 1, hexString2ByteArray, hexString2ByteArray.length,
						ByteArray);
				String str = ByteUtils.byteArray2HexString(ByteArray);
				if (res3 == 0 && str.equalsIgnoreCase(ParaEntity.DukptEncrypt29ECB)) {
					myHandleDeal("DukptEncrypt29ECB加密成功", res3);
				} else {
					myHandleDeal("DukptEncrypt29ECB加密失败", res3);
				}
				// CBC
				int res5 = Ddi.ddi_dukpt_encrypt(0, 4, (byte) 1, iv, 1, hexString2ByteArray, hexString2ByteArray.length,
						ByteArray);
				String str1 = ByteUtils.byteArray2HexString(ByteArray);
				if (res5 == 0 && str1.equalsIgnoreCase(ParaEntity.DukptEncrypt29CBC)) {
					myHandleDeal("DukptEncrypt29CBC加密成功", res3);
				} else {
					myHandleDeal("DukptEncrypt29CBC加密失败", res3);
				}
			} else {
				myHandleDeal("DukptEncrypt29CBC灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptEncrypt29打开设备失败", res1);
		}

		int res4 = Ddi.ddi_dukpt_close();
		if (res4 == 0) {
			myHandleDeal("DukptEncrypt29关闭设备成功", res4);
		} else {
			myHandleDeal("DukptEncrypt29关闭设备失败", res4);
		}
	
	}

	// 内置密钥运算接口(DES,SM4,AES)、DUKPT数据加密及MAC计算最大输入待运算数据长度修改为2048;
	// DukptEncryp（IPEK，响应包）CBC/ECB
	public void testDukptEncrypt30() {
		
		myHandleDeal("testDukptEncrypt30测试", 0);
//				String data = "f1acee231d370a171543cd366bb731349eeacd6590270b43";
		byte[] hexString2ByteArray = ByteUtils.hexString2ByteArray(ParaEntity.dataString2048);
		byte[] ByteArray = new byte[2048];
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("DukptEncrypt30打开设备成功", res1);
			// 2=BDK 1=IPEK
			// m_initkey1=01234567899876543210112233445566
			// m_initksn=FFFFFFFFFFFFFFFFFFFF
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 4, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("DukptEncrypt30灌注密钥成功", res2);
				// 请求包=0 接收包=1
				// m_plain=A12345678A12345678A12345678A12343232323232323232
				// ECB
				int res3 = Ddi.ddi_dukpt_encrypt(0, 4, (byte) 0, iv, 1, hexString2ByteArray, hexString2ByteArray.length,
						ByteArray);
				String str = ByteUtils.byteArray2HexString(ByteArray);
				if (res3 == 0 && str.equalsIgnoreCase(ParaEntity.DukptEncrypt30ECB)) {
					myHandleDeal("DukptEncrypt30ECB加密成功", res3);
				} else {
					myHandleDeal("DukptEncrypt30ECB加密失败", res3);
				}
				// CBC
				int res5 = Ddi.ddi_dukpt_encrypt(0, 4, (byte) 1, iv, 1, hexString2ByteArray, hexString2ByteArray.length,
						ByteArray);
				String str1 = ByteUtils.byteArray2HexString(ByteArray);
				if (res5 == 0 && str1.equalsIgnoreCase(ParaEntity.DukptEncrypt30CBC)) {
					myHandleDeal("DukptEncrypt30CBC加密成功", res3);
				} else {
					myHandleDeal("DukptEncrypt30CBC加密失败", res3);
				}
			} else {
				myHandleDeal("DukptEncrypt30CBC灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptEncrypt30打开设备失败", res1);
		}

		int res4 = Ddi.ddi_dukpt_close();
		if (res4 == 0) {
			myHandleDeal("DukptEncrypt30关闭设备成功", res4);
		} else {
			myHandleDeal("DukptEncrypt30关闭设备失败", res4);
		}
	
	}

	// 内置密钥运算接口(DES,SM4,AES)、DUKPT数据加密及MAC计算最大输入待运算数据长度大于2048;
	// DukptEncryp（IPEK，响应包）CBC/ECB
	public void testDukptEncrypt31() {
		
		myHandleDeal("testDukptEncrypt31测试", 0);
//				String data = "f1acee231d370a171543cd366bb731349eeacd6590270b43";
		byte[] hexString2ByteArray = ByteUtils.hexString2ByteArray(ParaEntity.dataString2056);
		byte[] ByteArray = new byte[2056];
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("DukptEncrypt31打开设备成功", res1);
			// 2=BDK 1=IPEK
			// m_initkey1=01234567899876543210112233445566
			// m_initksn=FFFFFFFFFFFFFFFFFFFF
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 4, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("DukptEncrypt31灌注密钥成功", res2);
				// 请求包=0 接收包=1
				// m_plain=A12345678A12345678A12345678A12343232323232323232
				// ECB
				int res3 = Ddi.ddi_dukpt_encrypt(0, 4, (byte) 0, iv, 1, hexString2ByteArray, hexString2ByteArray.length,
						ByteArray);
//						String str = ByteUtils.byteArray2HexString(ByteArray);
				if (res3 == -6) {
					myHandleDeal("DukptEncrypt31ECB加密成功", res3);
				} else {
					myHandleDeal("DukptEncrypt31ECB加密失败", res3);
				}
				// CBC
				int res5 = Ddi.ddi_dukpt_encrypt(0, 4, (byte) 1, iv, 1, hexString2ByteArray, hexString2ByteArray.length,
						ByteArray);
//						String str1 = ByteUtils.byteArray2HexString(ByteArray);
				if (res5 == -6) {
					myHandleDeal("DukptEncrypt31CBC加密成功", res3);
				} else {
					myHandleDeal("DukptEncrypt31CBC加密失败", res3);
				}
			} else {
				myHandleDeal("DukptEncrypt31CBC灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptEncrypt31打开设备失败", res1);
		}

		int res4 = Ddi.ddi_dukpt_close();
		if (res4 == 0) {
			myHandleDeal("DukptEncrypt31关闭设备成功", res4);
		} else {
			myHandleDeal("DukptEncrypt31关闭设备失败", res4);
		}
		

	}

	// 内置密钥运算接口(DES,SM4,AES)、DUKPT数据加密及MAC计算最大输入待运算数据长度修改为2048，循环200次;
	// DukptEncryp（IPEK，响应包）CBC/ECB
	public void testDukptEncrypt32() {
		
				Runnable runnable = new Runnable() {
					public void run() {
		for (int i = 0; i < 200; i++) {
			myHandleDeal("DukptEncrypt32测试中..........", 0);
//							String data = "f1acee231d370a171543cd366bb731349eeacd6590270b43";
			final byte[] hexString2ByteArray = ByteUtils
					.hexString2ByteArray(paraEntity.get2048(paraEntity.dataString2048));
			final byte[] ByteArray = new byte[2048];
			int res1 = Ddi.ddi_dukpt_open();
			if (res1 == 0) {
				myHandleDeal("DukptEncrypt32打开设备成功" + i, res1);
				// 2=BDK 1=IPEK
				// m_initkey1=01234567899876543210112233445566
				// m_initksn=FFFFFFFFFFFFFFFFFFFF
				int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 4, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
				if (res2 == 0) {
					myHandleDeal("DukptEncrypt32灌注密钥成功" + i, res2);
					// 请求包=0 接收包=1
					// m_plain=A12345678A12345678A12345678A12343232323232323232
					// ECB
					int res3 = Ddi.ddi_dukpt_encrypt(0, 4, (byte) 0, iv, 1, hexString2ByteArray,
							hexString2ByteArray.length, ByteArray);
					String str = ByteUtils.byteArray2HexString(ByteArray);
					if (res3 == 0 && str.equalsIgnoreCase(ParaEntity.DukptEncrypt30ECB)) {
						myHandleDeal("DukptEncrypt32ECB加密成功" + i, res3);
					} else {
						myHandleDeal("DukptEncrypt32ECB加密失败" + i, res3);
					}
					// CBC

					int res5 = Ddi.ddi_dukpt_encrypt(0, 4, (byte) 1, iv, 1, hexString2ByteArray,
							hexString2ByteArray.length, ByteArray);
					String str1 = ByteUtils.byteArray2HexString(ByteArray);
					if (res5 == 0 && str1.equalsIgnoreCase(ParaEntity.DukptEncrypt30CBC)) {
						myHandleDeal("DukptEncrypt32CBC加密成功" + i, res3);
					} else {
						myHandleDeal("DukptEncrypt32CBC加密失败" + i, res3);
					}
				} else {
					myHandleDeal("DukptEncrypt32CBC灌注密钥失败" + i, res2);
				}
			} else {
				myHandleDeal("DukptEncrypt32打开设备失败" + i, res1);
			}
			int res4 = Ddi.ddi_dukpt_close();
			if (res4 == 0) {
				myHandleDeal("DukptEncrypt32关闭设备成功" + i, res4);
			} else {
				myHandleDeal("DukptEncrypt32关闭设备失败" + i, res4);
			}
	
		
		}
					}
				};


				Thread Encrypt32 = new Thread(runnable);
				Encrypt32.start();
				try {
					Encrypt32.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

	private void testDukptPinblock2() {
		myHandleDeal("testDukptPinblock2测试", 0);
		String data = "0a309ce297a9b3b0";
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 0, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_get_pin((byte) 0, 0, 0, iv, pinblock);
				String str = ByteUtils.byteArray2HexString(pinblock);
				if (res3 == 0 && str.equals(data)) {
					myHandleDeal("计算Pinblock成功", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("关闭设备成功", res4);
					} else {
						myHandleDeal("DukptPinblock2关闭设备失败", res4);
					}
				} else {
					myHandleDeal("DukptPinblock2计算Pinblock失败", res3);
				}
			} else {
				myHandleDeal("DukptPinblock2灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptPinblock2打开设备失败", res1);
		}
	}

	private void testDukptPinblock3() {
		myHandleDeal("testDukptPinblock3测试", 0);
		String data = "4e1494e199d1b3a8";
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 9, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_get_pin((byte) 1, 9, 0, iv, pinblock);
				String str = ByteUtils.byteArray2HexString(pinblock);
				if (res3 == 0 && str.equals(data)) {
					myHandleDeal("计算Pinblock成功", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("关闭设备成功", res4);
					} else {
						myHandleDeal("DukptPinblock3关闭设备失败", res4);
					}
				} else {
					myHandleDeal("DukptPinblock3计算Pinblock失败", res3);
				}
			} else {
				myHandleDeal("DukptPinblock3灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptPinblock3打开设备失败", res1);
		}
	}

	private void testDukptPinblock4() {
		myHandleDeal("testDukptPinblock4测试", 0);
		String data = "0a309ce297a9b3b0";
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 9, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_get_pin((byte) 1, 9, 0, iv, pinblock);
				String str = ByteUtils.byteArray2HexString(pinblock);
				if (res3 == 0 && str.equals(data)) {
					myHandleDeal("计算Pinblock成功", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("关闭设备成功", res4);
					} else {
						myHandleDeal("DukptPinblock4关闭设备失败", res4);
					}
				} else {
					myHandleDeal("DukptPinblock4计算Pinblock失败", res3);
				}
			} else {
				myHandleDeal("DukptPinblock4灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptPinblock4打开设备失败", res1);
		}
	}

	private void testDukptPinblock5() {
		myHandleDeal("testDukptPinblock5测试", 0);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 9, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_get_pin((byte) 1, 10, 0, iv, pinblock);
				String str = ByteUtils.byteArray2HexString(pinblock);
				if (res3 == -1) {
					myHandleDeal("测试成功", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("关闭设备成功", res4);
					} else {
						myHandleDeal("DukptPinblock5关闭设备失败", res4);
					}
				} else {
					myHandleDeal("DukptPinblock5测试失败", res3);
				}
			} else {
				myHandleDeal("DukptPinblock5灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptPinblock5打开设备失败", res1);
		}
	}

	private void testDukptPinblock6() {
		myHandleDeal("testDukptPinblock6测试", 0);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 9, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_get_pin((byte) 0, 10, 0, iv, pinblock);
				String str = ByteUtils.byteArray2HexString(pinblock);
				if (res3 == -1) {
					myHandleDeal("测试成功", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("关闭设备成功", res4);
					} else {
						myHandleDeal("DukptPinblock6关闭设备失败", res4);
					}
				} else {
					myHandleDeal("DukptPinblock6测试失败", res3);
				}
			} else {
				myHandleDeal("DukptPinblock6灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptPinblock6打开设备失败", res1);
		}
	}

	private void testDukptMAC1() {
		
	
		myHandleDeal("testDukptMAC1测试", 0);
		String data = "9b7362747319042c";
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 0, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_get_mac((byte) 0, 0, 0, 0, m_plain1, m_plain1.length, mac);
				String str = ByteUtils.byteArray2HexString(mac);
				if (res3 == 0 && str.equals(data)) {
					myHandleDeal("计算MAC成功", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("关闭设备成功", res4);
					} else {
						myHandleDeal("DukptMAC1关闭设备失败", res4);
					}
				} else {
					myHandleDeal("DukptMAC1计算MAC失败" + str, res3);
				}
			} else {
				myHandleDeal("DukptMAC1灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptMAC1打开设备失败", res1);
		}
		
	}

	private void testDukptMAC2() {
	
		
		myHandleDeal("testDukptMAC2测试", 0);
		String data = "621904c5b21b2d22";
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 9, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_get_mac((byte) 1, 9, 0, 0, m_plain1, m_plain1.length, mac);
				String str = ByteUtils.byteArray2HexString(mac);
				if (res3 == 0 && str.equals(data)) {
					myHandleDeal("计算MAC成功", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("关闭设备成功", res4);
					} else {
						myHandleDeal("DukptMAC2关闭设备失败", res4);
					}
				} else {
					myHandleDeal("DukptMAC2计算MAC失败", res3);
				}
			} else {
				myHandleDeal("DukptMAC2灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptMAC2打开设备失败", res1);
		}
//		
	}

	private void testDukptMAC3() {
		myHandleDeal("testDukptMAC3测试", 0);
		String data = "f82967107398ce8e";
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 9, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_get_mac((byte) 0, 9, 0, 1, m_plain1, m_plain1.length, mac);
				String str = ByteUtils.byteArray2HexString(mac);
				if (res3 == 0 && str.equals(data)) {
					myHandleDeal("计算MAC成功", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("关闭设备成功", res4);
					} else {
						myHandleDeal("DukptMAC3关闭设备失败", res4);
					}
				} else {
					myHandleDeal("DukptMAC3计算MAC失败", res3);
				}
			} else {
				myHandleDeal("DukptMAC3灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptMAC3打开设备失败", res1);
		}
	}

	private void testDukptMAC4() {
		myHandleDeal("testDukptMAC4测试", 0);
		String data = "a8d9998c98980e5d";
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 0, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_get_mac((byte) 1, 0, 1, 0, m_plain1, m_plain1.length, mac);
				String str = ByteUtils.byteArray2HexString(mac);
				if (res3 == 0 && str.equals(data)) {
					myHandleDeal("计算MAC成功", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("关闭设备成功", res4);
					} else {
						myHandleDeal("DukptMAC4关闭设备失败", res4);
					}
				} else {
					myHandleDeal("DukptMAC4计算MAC失败" + str, res3);
				}
			} else {
				myHandleDeal("DukptMAC4灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptMAC4打开设备失败", res1);
		}
	}

	private void testDukptMAC5() {
		myHandleDeal("testDukptMAC5测试", 0);
		String data = "7752de89632f2b59";
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 0, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_get_mac((byte) 0, 0, 1, 1, m_plain1, m_plain1.length, mac);
				String str = ByteUtils.byteArray2HexString(mac);
				if (res3 == 0 && str.equals(data)) {
					myHandleDeal("计算MAC成功", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("关闭设备成功", res4);
					} else {
						myHandleDeal("DukptMAC5关闭设备失败", res4);
					}
				} else {
					myHandleDeal("DukptMAC5计算MAC失败" + str, res3);
				}
			} else {
				myHandleDeal("DukptMAC5灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptMAC5打开设备失败", res1);
		}
	}

	private void testDukptMAC6() {
		myHandleDeal("testDukptMAC6测试", 0);
		String data = "9fcee685e2190442";
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 5, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_get_mac((byte) 0, 5, 2, 0, m_plain1, m_plain1.length, mac);
				String str = ByteUtils.byteArray2HexString(mac);
				if (res3 == 0 && str.equals(data)) {
					myHandleDeal("计算MAC成功", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("关闭设备成功", res4);
					} else {
						myHandleDeal("DukptMAC6关闭设备失败", res4);
					}
				} else {
					myHandleDeal("DukptMAC6计算MAC失败", res3);
				}
			} else {
				myHandleDeal("DukptMAC6灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptMAC6打开设备失败", res1);
		}
	}

	private void testDukptMAC7() {
		myHandleDeal("testDukptMAC7测试", 0);
		String data = "2550995b71f5cbc3";
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 5, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_get_mac((byte) 1, 5, 2, 1, m_plain1, m_plain1.length, mac);
				String str = ByteUtils.byteArray2HexString(mac);
				if (res3 == 0 && str.equals(data)) {
					myHandleDeal("计算MAC成功", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("关闭设备成功", res4);
					} else {
						myHandleDeal("DukptMAC7关闭设备失败", res4);
					}
				} else {
					myHandleDeal("DukptMAC7计算MAC失败", res3);
				}
			} else {
				myHandleDeal("DukptMAC7灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptMAC7打开设备失败", res1);
		}
	}

	private void testDukptMAC8() {
		myHandleDeal("testDukptMAC8测试", 0);
		String data = "3431453743443042";
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 1, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_get_mac((byte) 1, 1, 3, 0, m_plain1, m_plain1.length, mac);
				String str = ByteUtils.byteArray2HexString(mac);
				if (res3 == 0 && str.equals(data)) {
					myHandleDeal("计算MAC成功", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("关闭设备成功", res4);
					} else {
						myHandleDeal("DukptMAC8关闭设备失败", res4);
					}
				} else {
					myHandleDeal("DukptMAC8计算MAC失败", res3);
				}
			} else {
				myHandleDeal("DukptMAC8灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptMAC8打开设备失败", res1);
		}
	}

	private void testDukptMAC9() {
		myHandleDeal("testDukptMAC9测试", 0);
		String data = "3746304637314341";
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 2, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_get_mac((byte) 1, 2, 3, 1, m_plain1, m_plain1.length, mac);
				String str = ByteUtils.byteArray2HexString(mac);
				if (res3 == 0 && str.equals(data)) {
					myHandleDeal("计算MAC成功", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("关闭设备成功", res4);
					} else {
						myHandleDeal("DukptMAC9关闭设备失败", res4);
					}
				} else {
					myHandleDeal("DukptMAC9计算MAC失败", res3);
				}
			} else {
				myHandleDeal("DukptMAC9灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptMAC9打开设备失败", res1);
		}
	}

	private void testDukptMAC10() {
		myHandleDeal("testDukptMAC10测试", 0);
		String data = "9fcee685e2190442";
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 1, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_get_mac((byte) 0, 1, 4, 0, m_plain1, m_plain1.length, mac);
				String str = ByteUtils.byteArray2HexString(mac);
				if (res3 == 0 && str.equals(data)) {
					myHandleDeal("计算MAC成功", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("关闭设备成功", res4);
					} else {
						myHandleDeal("DukptMAC10关闭设备失败", res4);
					}
				} else {
					myHandleDeal("DukptMAC10计算MAC失败", res3);
				}
			} else {
				myHandleDeal("DukptMAC10灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptMAC10打开设备失败", res1);
		}
	}

	private void testDukptMAC11() {
		myHandleDeal("testDukptMAC11测试", 0);
		String data = "2550995b71f5cbc3";
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 2, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_get_mac((byte) 0, 2, 4, 1, m_plain1, m_plain1.length, mac);
				String str = ByteUtils.byteArray2HexString(mac);
				if (res3 == 0 && str.equals(data)) {
					myHandleDeal("计算MAC成功", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("关闭设备成功", res4);
					} else {
						myHandleDeal("DukptMAC11关闭设备失败", res4);
					}
				} else {
					myHandleDeal("DukptMAC11计算MAC失败", res3);
				}
			} else {
				myHandleDeal("DukptMAC11灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptMAC11打开设备失败", res1);
		}
	}

	private void testDukptMAC12() {
		myHandleDeal("testDukptMAC12测试", 0);
		String data = "a8d9998c98980e5d";
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 7, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_get_mac((byte) 1, 7, 5, 0, m_plain1, m_plain1.length, mac);
				String str = ByteUtils.byteArray2HexString(mac);
				if (res3 == 0 && str.equals(data)) {
					myHandleDeal("计算MAC成功", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("关闭设备成功", res4);
					} else {
						myHandleDeal("DukptMAC12关闭设备失败", res4);
					}
				} else {
					myHandleDeal("DukptMAC12计算MAC失败", res3);
				}
			} else {
				myHandleDeal("DukptMAC12灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptMAC12打开设备失败", res1);
		}
	}

	private void testDukptMAC13() {
		myHandleDeal("testDukptMAC13测试", 0);
		String data = "7752de89632f2b59";
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 8, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 5, 1, m_plain1, m_plain1.length, mac);
				String str = ByteUtils.byteArray2HexString(mac);
				if (res3 == 0 && str.equals(data)) {
					myHandleDeal("计算MAC成功", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("关闭设备成功", res4);
					} else {
						myHandleDeal("DukptMAC13关闭设备失败", res4);
					}
				} else {
					myHandleDeal("DukptMAC13计算MAC失败", res3);
				}
			} else {
				myHandleDeal("DukptMAC13灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptMAC13打开设备失败", res1);
		}
	}

	private void testDukptMAC14() {
		myHandleDeal("testDukptMAC14测试", 0);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 7, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_get_mac((byte) 0, 7, -1, 0, m_plain1, m_plain1.length, mac);
				int res5 = Ddi.ddi_dukpt_get_mac((byte) 0, 8, 6, 0, m_plain1, m_plain1.length, mac);
				//
				int res6 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 0, 0, m_plain1, m_plain1.length, mac);
				int res7 = Ddi.ddi_dukpt_get_mac((byte) 0, 7, 0, 2, m_plain1, m_plain1.length, mac);
				if (res3 == -6 && res5 == -6 && res6 == 0 && res7 == -6) {
					myHandleDeal("测试成功", 0);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("关闭设备成功", res4);
					} else {
						myHandleDeal("DukptMAC14关闭设备失败", res4);
					}
				} else {
					myHandleDeal("DukptMAC14测试失败" + res3 + res5 + res6 + res7, res3);
				}
			} else {
				myHandleDeal("DukptMAC14灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptMAC14打开设备失败", res1);
		}
	}

	private void testDukptMAC15() {

		myHandleDeal("testDukptMAC15测试", 0);
		String dataString15 = "313131313131313131133131313131";
		byte[] mdata = ByteUtils.hexString2ByteArray(dataString15);
		byte[] mdata2 = ByteUtils.hexString2ByteArray(ParaEntity.dataString1025);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 7, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_get_mac((byte) 0, 7, 0, 0, mdata, mdata.length, mac);
				int res5 = Ddi.ddi_dukpt_get_mac((byte) 0, 7, 0, 0, mdata, mdata.length - 1, mac);
				int res6 = Ddi.ddi_dukpt_get_mac((byte) 0, 7, 0, 0, mdata2, mdata2.length, mac);
				if (res3 == -6 && res5 == -6 && res6 == -6) {
					myHandleDeal("测试成功", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("关闭设备成功", res4);
					} else {
						myHandleDeal("DukptMAC15关闭设备失败", res4);
					}
				} else {
					myHandleDeal("DukptMAC15测试失败" + res3 + res5 + res6, res3);
				}
			} else {
				myHandleDeal("DukptMAC15灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptMAC15打开设备失败", res1);
		}

	}

	private void testDukptMAC16() {
		myHandleDeal("testDukptMAC16测试", 0);
		String dataString8 = "3131313131313131";
		byte[] mdata = ByteUtils.hexString2ByteArray(dataString8);
		byte[] mdata2 = ByteUtils.hexString2ByteArray(ParaEntity.dataString2048);
		byte[] mbyte = new byte[8];
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("DukptMAC16打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 8, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("DukptMAC16灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 5, 1, mdata, mdata.length, mac);
				int res5 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 0, 1, mdata2, mdata2.length, mbyte);
				int res11 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 0, 0, mdata2, mdata2.length, mbyte);
				int res6 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 1, 0, mdata2, mdata2.length, mbyte);
				int res12 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 1, 1, mdata2, mdata2.length, mbyte);
				int res7 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 2, 1, mdata2, mdata2.length, mbyte);
				int res13 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 2, 0, mdata2, mdata2.length, mbyte);
				int res8 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 3, 0, mdata2, mdata2.length, mbyte);
				int res14 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 3, 1, mdata2, mdata2.length, mbyte);
				int res9 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 4, 1, mdata2, mdata2.length, mbyte);
				int res15 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 4, 0, mdata2, mdata2.length, mbyte);
				int res10 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 5, 0, mdata2, mdata2.length, mbyte);
				int res16 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 5, 1, mdata2, mdata2.length, mbyte);
				int res17 = res11 + res12 + res13 + res14 + res15 + res16;
//				String str = ByteUtils.byteArray2HexString(mac);
				if (res3 == 0 && res5 == -6 && res6 == -6 && res7 == -6 && res8 == -6 && res9 == -6 && res10 == -6
						&& res17 == -36) {
					myHandleDeal("DukptMAC16计算MAC成功", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("DukptMAC16关闭设备成功", res4);
					} else {
						myHandleDeal("DukptMAC16关闭设备失败", res4);
					}
				} else {
					myHandleDeal("DukptMAC16计算MAC失败" + res3 + res5 + res6 + res7 + res8 + res9 + res10, res3);
				}
			} else {
				myHandleDeal("DukptMAC16灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptMAC16打开设备失败", res1);
		}
	}

	private void testDukptMAC17() {
		myHandleDeal("testDukptMAC17测试", 0);
		String dataString8 = "3131313131313131";
		byte[] mdata = ByteUtils.hexString2ByteArray(dataString8);
		byte[] mdata2 = ByteUtils.hexString2ByteArray(ParaEntity.dataString512);
		byte[] mbyte = new byte[512];
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 8, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 5, 1, mdata, mdata.length, mac);
				int res5 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 0, 1, mdata2, mdata2.length, mbyte);
				int res6 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 1, 0, mdata2, mdata2.length, mbyte);
				int res7 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 2, 1, mdata2, mdata2.length, mbyte);
				int res8 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 3, 0, mdata2, mdata2.length, mbyte);
				int res9 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 4, 1, mdata2, mdata2.length, mbyte);
				int res10 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 5, 0, mdata2, mdata2.length, mbyte);
				String str = ByteUtils.byteArray2HexString(mac);
				if (res3 == 0 && res5 == 0 && res6 == 0 && res7 == 0 && res8 == 0 && res9 == 0 && res10 == 0) {
					myHandleDeal("计算MAC成功", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("关闭设备成功", res4);
					} else {
						myHandleDeal("DukptMAC17关闭设备失败", res4);
					}
				} else {
					myHandleDeal("DukptMAC17计算MAC失败" + res3 + res5 + res6 + res7 + res8 + res9 + res10, res3);
				}
			} else {
				myHandleDeal("DukptMAC17灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptMAC17打开设备失败", res1);
		}
	}

	private void testDukptMAC18() {
		myHandleDeal("testDukptMAC18测试", 0);
		
		Runnable runnable = new Runnable() {
			public void run() {
				int res1 = Ddi.ddi_dukpt_open();
				if (res1 == 0) {
					myHandleDeal("打开设备成功", res1);
					for (int i = 0; i < 2; i++) {
						for (int j = 0; j < 10; j++) {
							int res2 = Ddi.ddi_dukpt_inject((byte) i, (byte) j, 1, m_initkey, (byte) 0x10, m_initksn,
									(byte) 0xa);
							if (res2 == 0) {
								myHandleDeal("第" + i + "组" + "第" + j + "索引注入成功", res2);
								int res3 = Ddi.ddi_dukpt_get_mac((byte) i, j, 0, 0, m_plain1, m_plain1.length, mac);
								if (res3 == 00) {
									myHandleDeal("第" + i + "组" + "第" + j + "索引getmac成功", res3);
								} else {
									myHandleDeal("第" + i + "组" + "第" + j + "索引getmac失败", res3);

								}
							}

						}

					}

					int res2 = Ddi.ddi_dukpt_inject((byte) 0x00, (byte) 0x00, 1, m_initkey, (byte) 0x10, m_initksn,
							(byte) 0xa);
					if (res2 == 0) {
						myHandleDeal("灌注密钥成功", res2);
						int res3 = Ddi.ddi_dukpt_close();
						if (res3 == 0) {
							myHandleDeal("关闭设备成功", res3);
						} else {
							myHandleDeal("DukptMAC18关闭设备失败", res3);
						}
					} else {
						myHandleDeal("DukptMAC18灌注密钥失败", res2);
					}
				} else {
					myHandleDeal("DukptMAC18打开设备失败", res1);
				}
			}
		};
		Thread MAC18 = new Thread(runnable);
		MAC18.start();
		try {
			MAC18.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// 内置密钥运算接口(DES,SM4,AES)、DUKPT数据加密及MAC计算最大输入待运算数据长度修改为2048;
	// DukptMAC（BDK，请求包 ECB2）
	private void testDukptMAC19() {
		myHandleDeal("testDukptMAC19测试", 0);
		String data = "0A820DD67DC24B89";
		byte[] hexString2ByteArray = ByteUtils.hexString2ByteArray(ParaEntity.dataString2048);
		byte[] MACbyte = new byte[8];
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("DukptMAC19打开设备成功", res1);
			// 2=BDK 1=IPEK
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 0, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("DukptMAC19灌注密钥成功", res2);
				// 请求包=0 接收包=1
				int res3 = Ddi.ddi_dukpt_get_mac((byte) 0, 0, 1, 0, hexString2ByteArray, hexString2ByteArray.length,
						MACbyte);
				String str = ByteUtils.byteArray2HexString(MACbyte);
//				Log.v("TAG", str);
				if (res3 == 0 && str.equalsIgnoreCase(data)) {
					myHandleDeal("DukptMAC19计算MAC成功", res3);
				} else {
					myHandleDeal("DukptMAC19计算MAC失败" + str, res3);
				}
			} else {
				myHandleDeal("DukptMAC19灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptMAC19打开设备失败", res1);
		}

		int res4 = Ddi.ddi_dukpt_close();
		if (res4 == 0) {
			myHandleDeal("DukptMAC19关闭设备成功", res4);
		} else {
			myHandleDeal("DukptMAC19关闭设备失败", res4);
		}
	}

	// 内置密钥运算接口(DES,SM4,AES)、DUKPT数据加密及MAC计算最大输入待运算数据长度修改为2048;
	// DukptMAC（BDK，请求包 ECB2）
	private void testDukptMAC21() {
		Thread MAC21 = new Thread( new Runnable() {
			public void run() {
		for (int i = 0; i < 200; i++) {
			myHandleDeal("testDukptMAC21测试", 0);
			final String data = "0A820DD67DC24B89";
			final byte[] hexString2ByteArray = ByteUtils
					.hexString2ByteArray(paraEntity.get2048(paraEntity.dataString2048));
			final byte[] MACbyte = new byte[8];
			int res1 = Ddi.ddi_dukpt_open();
			if (res1 == 0) {
				myHandleDeal("DukptMAC21打开设备成功" + i, res1);
				// 2=BDK 1=IPEK
				int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 0, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
				if (res2 == 0) {
					myHandleDeal("DukptMAC21灌注密钥成功" + i, res2);
					// 请求包=0 接收包=1
					int res3 = Ddi.ddi_dukpt_get_mac((byte) 0, 0, 1, 0, hexString2ByteArray, hexString2ByteArray.length,
							MACbyte);
					String str = ByteUtils.byteArray2HexString(MACbyte);
					// Log.v("TAG", str);
					if (res3 == 0 && str.equalsIgnoreCase(data)) {
						myHandleDeal("DukptMAC21计算MAC成功" + i, res3);
					} else {
						myHandleDeal("DukptMAC21计算MAC失败" + i, res3);
					}
				} else {
					myHandleDeal("DukptMAC21灌注密钥失败" + i, res2);
				}
			} else {
				myHandleDeal("DukptMAC21打开设备失败" + i, res1);
			}
			int res4 = Ddi.ddi_dukpt_close();
			if (res4 == 0) {
				myHandleDeal("DukptMAC21关闭设备成功" + i, res4);
			} else {
				myHandleDeal("DukptMAC21关闭设备失败" + i, res4);
			}
		}

			}
		});
		MAC21.start();
		try {
			MAC21.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void testDukptMAC22() {
		myHandleDeal("testDukptMAC22测试", 0);
//		String dataString8="3131313131313131";
//		byte[] mdata = ByteUtils.hexString2ByteArray(dataString8);
		byte[] mdata2 = ByteUtils.hexString2ByteArray(ParaEntity.dataString2048);
		byte[] mbyte = new byte[8];
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("DukptMAC22打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 8, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("DukptMAC22灌注密钥成功", res2);
//				int res3 = Ddi.ddi_dukpt_get_mac((byte)1, 8, 5, 1, mdata, mdata.length, mac);
				int res5 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 0, 1, mdata2, mdata2.length, mbyte);
				int res11 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 0, 0, mdata2, mdata2.length, mbyte);
				int res6 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 1, 0, mdata2, mdata2.length, mbyte);
				int res12 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 1, 1, mdata2, mdata2.length, mbyte);
				int res7 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 2, 1, mdata2, mdata2.length, mbyte);
				int res13 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 2, 0, mdata2, mdata2.length, mbyte);
				int res8 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 3, 0, mdata2, mdata2.length, mbyte);
				int res14 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 3, 1, mdata2, mdata2.length, mbyte);
				int res9 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 4, 1, mdata2, mdata2.length, mbyte);
				int res15 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 4, 0, mdata2, mdata2.length, mbyte);
				int res10 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 5, 0, mdata2, mdata2.length, mbyte);
				int res16 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 5, 1, mdata2, mdata2.length, mbyte);
				int res17 = res11 + res12 + res13 + res14 + res15 + res16;
//				String str = ByteUtils.byteArray2HexString(mac);
				if (res5 == 0 && res6 == 0 && res7 == 0 && res8 == 0 && res9 == 0 && res10 == 0 && res17 == 0) {
					myHandleDeal("DukptMAC22计算MAC成功", res5);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("DukptMAC22关闭设备成功", res4);
					} else {
						myHandleDeal("DukptMAC22关闭设备失败", res4);
					}
				} else {
					myHandleDeal("DukptMAC22计算MAC失败" + res5 + res6 + res7 + res8 + res9 + res10, res5);
				}
			} else {
				myHandleDeal("DukptMAC22灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptMAC22打开设备失败", res1);
		}
	}

	private void testDukptMAC23() {
		myHandleDeal("testDukptMAC23测试", 0);
		String dataString8 = "3131313131313131";
		byte[] mdata = ByteUtils.hexString2ByteArray(dataString8);
		byte[] mdata2 = ByteUtils.hexString2ByteArray(ParaEntity.dataString2048);
		byte[] mbyte = new byte[8];
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("DukptMAC23打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 8, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("DukptMAC23灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 5, 1, mdata, mdata.length, mac);
				int res5 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 0, 1, mdata2, mdata2.length, mbyte);
				int res11 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 0, 0, mdata2, mdata2.length, mbyte);
				int res6 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 1, 0, mdata2, mdata2.length, mbyte);
				int res12 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 1, 1, mdata2, mdata2.length, mbyte);
				int res7 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 2, 1, mdata2, mdata2.length, mbyte);
				int res13 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 2, 0, mdata2, mdata2.length, mbyte);
				int res8 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 3, 0, mdata2, mdata2.length, mbyte);
				int res14 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 3, 1, mdata2, mdata2.length, mbyte);
				int res9 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 4, 1, mdata2, mdata2.length, mbyte);
				int res15 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 4, 0, mdata2, mdata2.length, mbyte);
				int res10 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 5, 0, mdata2, mdata2.length, mbyte);
				int res16 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 5, 1, mdata2, mdata2.length, mbyte);
				int res17 = res11 + res12 + res13 + res14 + res15 + res16;
//				String str = ByteUtils.byteArray2HexString(mac);
				if (res3 == 0 && res5 == 0 && res6 == 0 && res7 == 0 && res8 == 0 && res9 == 0 && res10 == 0
						&& res17 == 0) {
					myHandleDeal("DukptMAC23计算MAC成功", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("DukptMAC23关闭设备成功", res4);
					} else {
						myHandleDeal("DukptMAC23关闭设备失败", res4);
					}
				} else {
					myHandleDeal("DukptMAC23计算MAC失败" + res3 + res5 + res6 + res7 + res8 + res9 + res10, res3);
				}
			} else {
				myHandleDeal("DukptMAC23灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptMAC23打开设备失败", res1);
		}
	}

	// 内置密钥运算接口(DES,SM4,AES)、DUKPT数据加密及MAC计算最大输入待运算数据长度修改为2048;
	// DukptMAC（BDK，请求包 ECB2）
	private void testDukptMAC20() {
		myHandleDeal("testDukptMAC20测试", 0);
		String data = "0A820DD67DC24B89";
		byte[] hexString2ByteArray = ByteUtils.hexString2ByteArray(ParaEntity.dataString2056);
		byte[] MACbyte = new byte[8];
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("DukptMAC20打开设备成功", res1);
			// 2=BDK 1=IPEK
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 6, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("DukptMAC20灌注密钥成功", res2);
				// 请求包=0 接收包=1
				int res3 = Ddi.ddi_dukpt_get_mac((byte) 0, 6, 1, 0, hexString2ByteArray, hexString2ByteArray.length,
						MACbyte);
//				String str = ByteUtils.byteArray2HexString(MACbyte);
//				Log.v("TAG", str);
				if (res3 == -6) {
					myHandleDeal("DukptMAC20计算MAC成功", res3);
				} else {
					myHandleDeal("DukptMAC20计算MAC失败", res3);
				}
			} else {
				myHandleDeal("DukptMAC20灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptMAC20打开设备失败", res1);
		}

		int res4 = Ddi.ddi_dukpt_close();
		if (res4 == 0) {
			myHandleDeal("DukptMA20关闭设备成功", res4);
		} else {
			myHandleDeal("DukptMAC20关闭设备失败", res4);
		}
	}

	private void testDukptKsn1() {
		myHandleDeal("testDukptKsn1测试", 0);
		String data = "31313131313131200002";
		byte[] m_initkey = ByteUtils.hexString2ByteArray(ParaEntity.initkey1);
		byte[] m_initksn = ByteUtils.hexString2ByteArray(ParaEntity.initksn1);
//		byte[]m_initkey = ByteUtils.hexString2ByteArray("0123456789ABCDEFFEDCBA9876543210");
//		byte[]m_initksn = ByteUtils.hexString2ByteArray("FFFF9876543210E00001");
		byte[] ksn = new byte[10];
		int[] ksnlen = new int[1];
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 6, 2, m_initkey, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_add_ksncnt(1, 6, (byte) 1);
				if (res3 == 0) {
					myHandleDeal("设置自加成功", res3);
					int res4 = Ddi.ddi_dukpt_getksn(1, 6, ksnlen, ksn);
					String str = ByteUtils.byteArray2HexString(ksn);
					if (res4 == 0 && str.equals(data)) {
						myHandleDeal("自加成功", res4);
						int res5 = Ddi.ddi_dukpt_close();
						if (res5 == 0) {
							myHandleDeal("关闭设备成功", res5);
						} else {
							myHandleDeal("DukptKsn1关闭设备失败" + str, res5);
						}
					} else {
						myHandleDeal("DukptKsn1自加失败" + str, res4);
					}

				} else {
					myHandleDeal("DukptKsn1设置自加失败", res3);
				}
			} else {
				myHandleDeal("DukptKsn1灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptKsn1打开设备失败", res1);
		}
	}

	private void testDukptKsn2() {
		myHandleDeal("testDukptKsn2测试", 0);
		String data = "3131313131313120000b";
		byte[] m_initkey = ByteUtils.hexString2ByteArray(ParaEntity.initkey1);
		byte[] m_initksn = ByteUtils.hexString2ByteArray(ParaEntity.initksn1);
		byte[] ksn = new byte[10];
		int[] ksnlen = new int[1];
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 6, 2, m_initkey, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_add_ksncnt(0, 6, (byte) 10);
				if (res3 == 0) {
					myHandleDeal("设置自加成功", res3);
					int res4 = Ddi.ddi_dukpt_getksn(0, 6, ksnlen, ksn);
					String str = ByteUtils.byteArray2HexString(ksn);
					if (res4 == 0 && str.equals(data)) {
						myHandleDeal("自加成功", res4);
						int res5 = Ddi.ddi_dukpt_close();
						if (res5 == 0) {
							myHandleDeal("关闭设备成功", res5);
						} else {
							myHandleDeal("DukptKsn2关闭设备失败", res5);
						}
					} else {
						myHandleDeal("DukptKsn2自加失败"+str, res4);
					}

				} else {
					myHandleDeal("DukptKsn2设置自加失败", res3);
				}
			} else {
				myHandleDeal("DukptKsn2灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptKsn2打开设备失败", res1);
		}
	}

	private void testDukptKsn3() {
		myHandleDeal("testDukptKsn3测试", 0);
//		String data = "3131313131313120000b";
//		 final byte[] m_initkey = ByteUtils.hexString2ByteArray(ParaEntity.initkey1);
//		 final byte[] m_initksn = ByteUtils.hexString2ByteArray(ParaEntity.initksn1);
//		 final byte[] ksn = new byte[10];
//		 final int[] ksnlen = new int[1];
		
		// 01234567899876543210112233445566
		Thread thread = new Thread(	new Runnable() {
			public void run() {
				String data = "3131313131313120000b";
				 byte[] m_initkey = ByteUtils.hexString2ByteArray(ParaEntity.initkey1);
				 byte[] m_initksn = ByteUtils.hexString2ByteArray(ParaEntity.initksn1);
				 byte[] ksn = new byte[10];
				 int[] ksnlen = new int[1];
				int res1 = Ddi.ddi_dukpt_open();
				if (res1 == 0) {
					myHandleDeal("打开设备成功", res1);
					int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 6, 2, m_initkey, (byte) 0x10, m_initksn,
							(byte) 0xa);
					if (res2 == 0) {
						myHandleDeal("灌注密钥成功", res2);
						int res3 = Ddi.ddi_dukpt_add_ksncnt(0, 6, (byte) 0);
						int res6 = Ddi.ddi_dukpt_add_ksncnt(0, 4, (byte) 1);
						if (res3 == -6 && res6 == 0) {
							myHandleDeal("设置自加成功", res3);
							int res4 = Ddi.ddi_dukpt_getksn(0, 4, ksnlen, ksn);
							String str = ByteUtils.byteArray2HexString(ksn);
							if (res4 == 0) {
								myHandleDeal("自加成功", res4);
								int res5 = Ddi.ddi_dukpt_close();
								if (res5 == 0) {
									myHandleDeal("关闭设备成功", res5);
								} else {
									myHandleDeal("DukptKsn3关闭设备失败", res5);
								}
							} else {
								myHandleDeal("DukptKsn3自加失败", res4);
							}

						} else {
							myHandleDeal("DukptKsn3设置自加失败" + res6, res3);
						}
					} else {
						myHandleDeal("DukptKsn3灌注密钥失败", res2);
					}
				} else {
					myHandleDeal("DukptKsn3打开设备失败", res1);
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

	private void testDukptKsn4() {
		myHandleDeal("testDukptKsn4测试", 0);
		String data = "31313131313131200002";
		byte[] m_initkey = ByteUtils.hexString2ByteArray(ParaEntity.initkey1);
		byte[] m_initksn = ByteUtils.hexString2ByteArray(ParaEntity.initksn1);
		byte[] ksn = new byte[10];
		int[] ksnlen = new int[1];
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("打开设备成功", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 6, 1, m_initkey, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("灌注密钥成功", res2);
				int res3 = Ddi.ddi_dukpt_add_ksncnt(1, 6, (byte) 1);
				myHandleDeal("灌注密钥成功" + res3, res2);
				long begin = System.currentTimeMillis();
				for (int i = 0; i < 500; i++) {
					int res4 = Ddi.ddi_dukpt_add_ksncnt(1, 6, (byte) 1);
				}
				long end = System.currentTimeMillis();
				long current = end - begin;
				myHandleDeal("DUKPTECB 注入秘钥耗时" + current + "秒", 0);

			} else {
				myHandleDeal("DukptKsn1灌注密钥失败", res2);
			}
		} else {
			myHandleDeal("DukptKsn1打开设备失败", res1);
		}
	}

	private void testDukptKsn5() {
		myHandleDeal("testDukptKsn5测试", 0);
		final byte[] ksn = new byte[10];
		final int[] ksnlen = new int[1];
		Runnable runnable = new Runnable() {
			public void run() {
				int res1 = Ddi.ddi_dukpt_open();
				if (res1 == 0) {
					myHandleDeal("打开设备成功", res1);
					for (int i = 0; i < 2; i++) {
						for (int j = 0; j < 10; j++) {
							int res2 = Ddi.ddi_dukpt_inject((byte) i, (byte) j, 1, m_initkey, (byte) 0x10, m_initksn,
									(byte) 0xa);
							if (res2 == 0) {
								myHandleDeal("第" + i + "组" + "第" + j + "索引注入成功", res2);
								int res3 = Ddi.ddi_dukpt_add_ksncnt(i, j, (byte) 1);
								if (res3 == 0) {
									myHandleDeal("第" + i + "组" + "第" + j + "索引自加成功", res3);
									int res4 = Ddi.ddi_dukpt_getksn(i, j, ksnlen, ksn);
									if (res4 == 0) {
										myHandleDeal("第" + i + "组" + "第" + j + "索引获取成功", res4);

									} else {
										myHandleDeal("第" + i + "组" + "第" + j + "索引获取失败", res4);

									}
								} else {
									myHandleDeal("第" + i + "组" + "第" + j + "索引自加失败", res3);
								}

							}

						}

					}

					int res2 = Ddi.ddi_dukpt_inject((byte) 0x00, (byte) 0x00, 1, m_initkey, (byte) 0x10, m_initksn,
							(byte) 0xa);
					if (res2 == 0) {
						myHandleDeal("DukptKsn5灌注密钥成功", res2);
						int res3 = Ddi.ddi_dukpt_close();
						if (res3 == 0) {
							myHandleDeal("DukptKsn5关闭设备成功", res3);
						} else {
							myHandleDeal("DukptKsn5关闭设备失败", res3);
						}
					} else {
						myHandleDeal("DukptKsn5灌注密钥失败", res2);
					}
				} else {
					myHandleDeal("DukptKsn5打开设备失败", res1);
				}
			}
		};
		Thread Ksn5 = new Thread(runnable);
		Ksn5.start();
		try {
			Ksn5.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void testDukptgroup() {
		myHandleDeal("testDukptgroup测试", 0);
//		final byte[] iv = ByteUtils.hexString2ByteArray(ParaEntity.ivt);
//		final byte[] m_plain = ByteUtils.hexString2ByteArray(ParaEntity.plain);
//		final byte[] cipher = new byte[24];
//		String panblock = ParaEntity.ivt;
//		final byte[] m_panblock = ByteUtils.hexString2ByteArray(panblock);
//		final byte[] pinblock = new byte[8];
//		final byte[] mac = new byte[8];
//		final byte[] ksn = new byte[10];
//		final int[] ksnlen = new int[1];
		
		
		Thread thread = new Thread(new Runnable() {
			public void run() {
				
				 byte[] iv = ByteUtils.hexString2ByteArray(ParaEntity.ivt);
				 byte[] m_plain = ByteUtils.hexString2ByteArray(ParaEntity.plain);
				 byte[] cipher = new byte[24];
				String panblock = ParaEntity.ivt;
				 byte[] m_panblock = ByteUtils.hexString2ByteArray(panblock);
				 byte[] pinblock = new byte[8];
				 byte[] mac = new byte[8];
				 byte[] ksn = new byte[10];
				 int[] ksnlen = new int[1];
				
				Ddi.ddi_dukpt_open();
				int res1 = Ddi.ddi_dukpt_encrypt(0, 4, (byte) 0, iv, 0, m_plain, m_plain.length, cipher);
				if (res1 == 0) {
					myHandleDeal("测试成功", res1);
				} else {
					myHandleDeal("Dukptgroup测试失败" + res1, 1);
				}
				int res2 = Ddi.ddi_dukpt_get_pin((byte) 0, 4, 0, m_panblock, pinblock);
				if (res2 == -6) {
					myHandleDeal("测试成功", res2);
				} else {
					myHandleDeal("Dukptgroup测试失败" + res2, 2);
				}
				int res3 = Ddi.ddi_dukpt_get_mac((byte) 0, 4, 0, 0, m_plain, m_plain.length, mac);
				if (res3 == 0) {
					myHandleDeal("测试成功", res3);
				} else {
					myHandleDeal("Dukptgroup测试失败" + res3, 3);
				}
				int res4 = Ddi.ddi_dukpt_add_ksncnt(0, 4, (byte) 1);
				if (res4 == 0) {
					myHandleDeal("测试成功", res4);
				} else {
					myHandleDeal("Dukptgroup测试失败" + res4, 4);
				}
				int res5 = Ddi.ddi_dukpt_getksn(0, 4, ksnlen, ksn);
				if (res5 == 0) {
					myHandleDeal("测试成功", res5);
				} else {
					myHandleDeal("Dukptgroup测试失败" + res5, 5);
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

	private void testend() {
		myHandleDeal("runall测试结束", 0);
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Thflg = false;
	}
}
