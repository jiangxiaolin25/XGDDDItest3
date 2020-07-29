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

	// ����һ���߳̽��������Ĳ���
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
					// ��鲻�ò���
//					testDukptPinblock2();
//					testDukptPinblock3();
//					testDukptPinblock4();
//					testDukptPinblock5();
//					testDukptPinblock6();
					// ��鲻�ò���
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
					//�ն˲����ǲ�֧��2048
					if (MainActivity.model.equalsIgnoreCase("N3") | (MainActivity.model.equalsIgnoreCase("N5")
							&& MainActivity.version.equalsIgnoreCase("5.1.1"))) {
						testDukptMAC16();
					}else {
						myHandleDeal("�ն�:" + MainActivity.model + "����Ϊ2048���Լ��ܳɹ�������������ʧ��", -99);
					}
					testDukptEncrypt16();
					testDukptEncrypt17();
					
					testDukptEncrypt19();
					// ���µ�N6��֧��  -�˻�����
					testDukptEncrypt20();
					testDukptEncrypt21();
					testDukptEncrypt22();
					testDukptEncrypt23();
					testDukptEncrypt24();
					testDukptEncrypt25();
					testDukptEncrypt26();
					//DUKPT���ݼ��ܼ�MAC�������������������ݳ����޸�Ϊ2048;
					if ((MainActivity.model.equalsIgnoreCase("N5")&& MainActivity.version.equalsIgnoreCase("7.1.2") )|
							MainActivity.model.equalsIgnoreCase("N6")| MainActivity.model.equalsIgnoreCase("N86")) {
							// N5S ��N6֧��2048���ֽڣ�������Ŀ��ʱ����֧��
							testDukptEncrypt27();
							testDukptEncrypt28();
							testDukptEncrypt29();
							testDukptEncrypt30();
							testDukptEncrypt31();
							testDukptMAC19();
							testDukptMAC20();
							testDukptMAC22();
							testDukptMAC23();
							//ѹ������
							testDukptMAC21();
							testDukptEncrypt32();
					}else {
							myHandleDeal("�ն�:" + MainActivity.model + "��֧������Ϊ2048�ֽڲ���ʧ��", -99);
						}
					//ѹ������
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
			String infoString = msg.obj.toString() + " ����ֵ: " + msg.arg1;
			if (infoString.contains("testDukpt")) {
				TotalCount++;
				tv.append(" " + msg.obj.toString() + "\n");
			} else {
				if (infoString.contains("ʧ��")) {
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
			mTotalTextView.setText("�ܴ���:" + TotalCount);
			mSucessTextView.setText("�ɹ�:" + SucessCount);
			mFailTextView.setText("ʧ��:" + Failcount);
			mSucessRateTextView.setText("�ɹ���:" + SucessRate + "%");
		}
	};

	Ddi Ddi = new Ddi();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);// ȥ��������
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

				// String[] languages = getResources().getStringArray(R.array.languages);
				// String str = languages[pos];
				// if(str.equals("testDukptInjict1")){
				// tv.setText("");
				// String fails = tv1.getText().toString();
				
				
				// tv.append(fails);
				// testDukptInjict1();
				// }
				if (Btflg) {
					Toast.makeText(getApplicationContext(), "�����У���ȴ�", Toast.LENGTH_SHORT).show();
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
		myHandleDeal("testDukptInjict1����", 0);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0x00, (byte) 0x00, 1, m_initkey, (byte) 0x10, m_initksn, (byte) 0xa);

			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res3 = Ddi.ddi_dukpt_close();
				if (res3 == 0) {
					myHandleDeal("�ر��豸�ɹ�", res3);
				} else {
					myHandleDeal("DukptInjict1�ر��豸ʧ��", res3);
				}
			} else {
				myHandleDeal("DukptInjict1��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptInjict1���豸ʧ��", res1);
		}
	}

	private void testDukptInjict2() {
		myHandleDeal("testDukptInjict2����", 0);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0x00, (byte) 0x09, 2, m_initkey, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res3 = Ddi.ddi_dukpt_close();
				if (res3 == 0) {
					myHandleDeal("�ر��豸�ɹ�", res3);
				} else {
					myHandleDeal("DukptInjict2�ر��豸ʧ��", res3);
				}
			} else {
				myHandleDeal("DukptInjict2��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptInjict2���豸ʧ��", res1);
		}
	}

	private void testDukptInjict3() {
		myHandleDeal("testDukptInjict3����", 0);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0x01, (byte) 0x00, 2, m_initkey, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res3 = Ddi.ddi_dukpt_close();
				if (res3 == 0) {
					myHandleDeal("�ر��豸�ɹ�", res3);
				} else {
					myHandleDeal("DukptInjict3�ر��豸ʧ��", res3);
				}
			} else {
				myHandleDeal("DukptInjict3��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptInjict3���豸ʧ��", res1);
		}
	}

	private void testDukptInjict4() {
		myHandleDeal("testDukptInjict4����", 0);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0x01, (byte) 0x09, 2, m_initkey, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res3 = Ddi.ddi_dukpt_close();
				if (res3 == 0) {
					myHandleDeal("�ر��豸�ɹ�", res3);
				} else {
					myHandleDeal("DukptInjict4�ر��豸ʧ��", res3);
				}
			} else {
				myHandleDeal("DukptInjict4��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptInjict4���豸ʧ��", res1);
		}
	}

	private void testDukptInjict5() {
		myHandleDeal("testDukptInjict5����", 0);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0x00, (byte) 0x00, 1, m_initkey, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res3 = Ddi.ddi_dukpt_close();
				if (res3 == 0) {
					myHandleDeal("�ر��豸�ɹ�", res3);
				} else {
					myHandleDeal("DukptInjict5�ر��豸ʧ��", res3);
				}
			} else {
				myHandleDeal("DukptInjict5��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptInjict4���豸ʧ��", res1);
		}
	}

	private void testDukptInjict6() {
		myHandleDeal("testDukptInjict6����", 0);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0x00, (byte) 0x09, 1, m_initkey, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res3 = Ddi.ddi_dukpt_close();
				if (res3 == 0) {
					myHandleDeal("�ر��豸�ɹ�", res3);
				} else {
					myHandleDeal("DukptInjict6�ر��豸ʧ��", res3);
				}
			} else {
				myHandleDeal("DukptInjict6��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptInjict4���豸ʧ��", res1);
		}
	}

	private void testDukptInjict7() {
		myHandleDeal("testDukptInjict7����", 0);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0x09, (byte) 0x00, 1, m_initkey, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == -6) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res3 = Ddi.ddi_dukpt_close();
				if (res3 == 0) {
					myHandleDeal("�ر��豸�ɹ�", res3);
				} else {
					myHandleDeal("DukptInjict7�ر��豸ʧ��", res3);
				}
			} else {
				myHandleDeal("DukptInjict7��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptInjict7���豸ʧ��", res1);
		}
	}

	private void testDukptInjict8() {
		myHandleDeal("testDukptInjict8����", 0);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0x00, (byte) 0x13, 1, m_initkey, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == -6) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res3 = Ddi.ddi_dukpt_close();
				if (res3 == 0) {
					myHandleDeal("�ر��豸�ɹ�", res3);
				} else {
					myHandleDeal("DukptInjict8�ر��豸ʧ��", res3);
				}
			} else {
				myHandleDeal("DukptInjict8��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptInjict8���豸ʧ��", res1);
		}
	}

	private void testDukptInjict9() {
		myHandleDeal("testDukptInjict9����", 0);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0x00, (byte) 0x05, 0, m_initkey, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == -6) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res3 = Ddi.ddi_dukpt_close();
				if (res3 == 0) {
					myHandleDeal("�ر��豸�ɹ�", res3);
				} else {
					myHandleDeal("DukptInjict9�ر��豸ʧ��", res3);
				}
			} else {
				myHandleDeal("DukptInjict9��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptInjict9���豸ʧ��", res1);
		}
	}

	private void testDukptInjict10() {
		myHandleDeal("testDukptInjict10����", 0);
		String initkey1 = "012345678998765432101122334455";
		byte[] mdata = ByteUtils.hexString2ByteArray(ParaEntity.initkey1);
		String initksn = "FFFFFFFFFFFFFFFFFFFF31";
		byte[] mKSn = ByteUtils.hexString2ByteArray(ParaEntity.initksn);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0x00, (byte) 0x05, 1, mdata, (byte) 0x10, m_initksn, (byte) 0xa);
			int res6 = Ddi.ddi_dukpt_inject((byte) 0x00, (byte) 0x10, 1, mdata, (byte) 0x10, m_initksn, (byte) 0xa);
			int res3 = Ddi.ddi_dukpt_inject((byte) 0x00, (byte) 0x05, 1, m_initkey, (byte) 0x11, m_initksn, (byte) 0xa);
			int res4 = Ddi.ddi_dukpt_inject((byte) 0x00, (byte) 0x05, 1, m_initkey, (byte) 0x10, m_initksn, (byte) 0xb);
			int res5 = Ddi.ddi_dukpt_inject((byte) 0x00, (byte) 0x05, 1, m_initkey, (byte) 0x10, mKSn, (byte) 0xa);
			if (res2 == 0 && res3 == -6 && res4 == -6 && res5 == 0 && res6 == -6) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res9 = Ddi.ddi_dukpt_close();
				if (res9 == 0) {
					myHandleDeal("�ر��豸�ɹ�", res9);
				} else {
					myHandleDeal("DukptInjict10�ر��豸ʧ��", res9);
				}
			} else {
				myHandleDeal("DukptInjict10��ע��Կʧ��" + res2 + res3 + res4 + res5 + res6, res2);
			}
		} else {
			myHandleDeal("DukptInjict10���豸ʧ��", res1);
		}
	}

	private void testDukptInjict11() {
		myHandleDeal("testDukptInjict11����", 0);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0x00, (byte) 0x09, 2, m_initkey1, (byte) 0x10, m_initksn,
					(byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res3 = Ddi.ddi_dukpt_close();
				if (res3 == 0) {
					myHandleDeal("�ر��豸�ɹ�", res3);
				} else {
					myHandleDeal("DukptInjict11�ر��豸ʧ��", res3);
				}
			} else {
				myHandleDeal("DukptInjict11��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptInjict11���豸ʧ��", res1);
		}
	}

	private void testDukptInjict12() {
		myHandleDeal("testDukptInjict12����", 0);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0x00, (byte) 0x09, 1, m_initkey1, (byte) 0x10, m_initksn,
					(byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res3 = Ddi.ddi_dukpt_close();
				if (res3 == 0) {
					myHandleDeal("�ر��豸�ɹ�", res3);
				} else {
					myHandleDeal("DukptInjict12�ر��豸ʧ��", res3);
				}
			} else {
				myHandleDeal("DukptInjict12��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptInjict12���豸ʧ��", res1);
		}
	}

	private void testDukptInjict13() {
		myHandleDeal("testDukptInjict13����", 0);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0xa, (byte) 0xa, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == -6) {
				myHandleDeal("���Գɹ�", res2);
				int res3 = Ddi.ddi_dukpt_close();
				if (res3 == 0) {
					myHandleDeal("�ر��豸�ɹ�", res3);
				} else {
					myHandleDeal("DukptInjict13�ر��豸ʧ��", res3);
				}
			} else {
				myHandleDeal("DukptInjict13����ʧ��", res2);
			}
		} else {
			myHandleDeal("DukptInjict13���豸ʧ��", res1);
		}
	}

	private void testDukptInjict14() {
		myHandleDeal("testDukptInjict14����", 0);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) -1, (byte) -1, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == -6) {
				myHandleDeal("���Գɹ�", res2);
				int res3 = Ddi.ddi_dukpt_close();
				if (res3 == 0) {
					myHandleDeal("�ر��豸�ɹ�", res3);
				} else {
					myHandleDeal("DukptInjict14�ر��豸ʧ��", res3);
				}
			} else {
				myHandleDeal("DukptInjict14����ʧ��", res2);
			}
		} else {
			myHandleDeal("DukptInjict14���豸ʧ��", res1);
		}
	}

	private void testDukptInjict15() {
		myHandleDeal("testDukptInjict15����", 0);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 0, 3, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == -6) {
				myHandleDeal("���Գɹ�", res2);
				int res3 = Ddi.ddi_dukpt_close();
				if (res3 == 0) {
					myHandleDeal("�ر��豸�ɹ�", res3);
				} else {
					myHandleDeal("DukptInjict15�ر��豸ʧ��", res3);
				}
			} else {
				myHandleDeal("DukptInjict15����ʧ��", res2);
			}
		} else {
			myHandleDeal("DukptInjict15���豸ʧ��", res1);
		}
	}

	private void testDukptInjict16() {
		myHandleDeal("testDukptInjict16����", 0);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 0, 0, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == -6) {
				myHandleDeal("���Գɹ�", res2);
				int res3 = Ddi.ddi_dukpt_close();
				if (res3 == 0) {
					myHandleDeal("�ر��豸�ɹ�", res3);
				} else {
					myHandleDeal("DukptInjict16�ر��豸ʧ��", res3);
				}
			} else {
				myHandleDeal("DukptInjict16����ʧ��", res2);
			}
		} else {
			myHandleDeal("DukptInjict16���豸ʧ��", res1);
		}
	}

	private void testDukptInjict17() {
		myHandleDeal("testDukptInjict17����", 0);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0x00, (byte) 0x00, 1, m_initkey, (byte) 0x10, m_initksn, (byte) 0xa);
			myHandleDeal("��ע��Կ�ɹ�" + res2, res2);
			long begin = System.currentTimeMillis();

			for (int i = 0; i < 500; i++) {
				int res4 = Ddi.ddi_dukpt_inject((byte) 0x00, (byte) 0x00, 1, m_initkey, (byte) 0x10, m_initksn,
						(byte) 0xa);
			}
			long end = System.currentTimeMillis();
			long current = end - begin;
			myHandleDeal("DUKPTECB ע����Կ��ʱ" + current + "��", 0);
		} else {
			myHandleDeal("DukptInjict1���豸ʧ��", res1);
		}
	}

	private void testDukptInjict18() {
		myHandleDeal("testDukptInjict18����", 0);
		
		Runnable runnable = new Runnable() {
			public void run() {
				int res1 = Ddi.ddi_dukpt_open();
				if (res1 == 0) {
					myHandleDeal("���豸�ɹ�", res1);
					for (int i = 0; i < 2; i++) {
						for (int j = 0; j < 10; j++) {
							int res2 = Ddi.ddi_dukpt_inject((byte) i, (byte) j, 1, m_initkey, (byte) 0x10, m_initksn,
									(byte) 0xa);
							if (res2 == 0) {
								myHandleDeal("��" + i + "��" + "��" + j + "����ע��ɹ�", res2);
							}

						}

					}

					int res2 = Ddi.ddi_dukpt_inject((byte) 0x00, (byte) 0x00, 1, m_initkey, (byte) 0x10, m_initksn,
							(byte) 0xa);
					if (res2 == 0) {
						myHandleDeal("��ע��Կ�ɹ�", res2);
						int res3 = Ddi.ddi_dukpt_close();
						if (res3 == 0) {
							myHandleDeal("�ر��豸�ɹ�", res3);
						} else {
							myHandleDeal("DukptInjict18�ر��豸ʧ��", res3);
						}
					} else {
						myHandleDeal("DukptInjict18��ע��Կʧ��", res2);
					}
				} else {
					myHandleDeal("DukptInjict18���豸ʧ��", res1);
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
		myHandleDeal("testDukptEncrypt1����", 0);
		String data = "f1acee231d370a171543cd366bb731349eeacd6590270b43";
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 0, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res3 = Ddi.ddi_dukpt_encrypt(0, 0, (byte) 0, iv, 0, m_plain, m_plain.length, cipher);
				String str = ByteUtils.byteArray2HexString(cipher);
				if (res3 == 0 && str.equals(data)) {
					myHandleDeal("���ܳɹ�", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("�ر��豸�ɹ�", res4);
					} else {
						myHandleDeal("DukptEncrypt1�ر��豸ʧ��", res4);
					}
				} else {
					myHandleDeal("DukptEncrypt1����ʧ��" + str, res3);
				}
			} else {
				myHandleDeal("DukptEncrypt1��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptEncrypt1���豸ʧ��", res1);
		}
		
	}

	private void testDukptEncrypt2() {
		myHandleDeal("testDukptEncrypt2����", 0);
		String data = "8d6fa88a5469618bffba1886e053ceb168687b4a13894d57";
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 9, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res3 = Ddi.ddi_dukpt_encrypt(1, 9, (byte) 0, iv, 1, m_plain, m_plain.length, cipher);
				String str = ByteUtils.byteArray2HexString(cipher);
				if (res3 == 0 && str.equals(data)) {
					myHandleDeal("���ܳɹ�", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("�ر��豸�ɹ�", res4);
					} else {
						myHandleDeal("DukptEncrypt2�ر��豸ʧ��", res4);
					}
				} else {
					myHandleDeal("DukptEncrypt2����ʧ��", res3);
				}
			} else {
				myHandleDeal("DukptEncrypt2��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptEncrypt2���豸ʧ��", res1);
		}
	}

	private void testDukptEncrypt3() {
		
//		myHandleDeal("testDukptEncrypt3����", 0);
//		String data = "2906db3a39a725b8ffad9dfbadd9ba294aa2c71abbf64e9f";
//		int res1 = Ddi.ddi_dukpt_open();
//		if (res1 == 0) {
//			myHandleDeal("���豸�ɹ�", res1);
////			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 8, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
////			if (res2 == 0) {
////				myHandleDeal("��ע��Կ�ɹ�", res2);
////			
////			} else {
////				myHandleDeal("DukptEncrypt3��ע��Կʧ��", res2);
////			}
//			
//			int res3 = Ddi.ddi_dukpt_encrypt(1, 5, (byte) 0, iv, 0, m_plain, m_plain.length, cipher);
//			String str = ByteUtils.byteArray2HexString(cipher);
//			if (res3 == 0 && str.equals(data)) {
//				myHandleDeal("���ܳɹ�", res3);
//				int res4 = Ddi.ddi_dukpt_close();
//				if (res4 == 0) {
//					myHandleDeal("�ر��豸�ɹ�", res4);
//				} else {
//					myHandleDeal("DukptEncrypt3�ر��豸ʧ��", res4);
//				}
//			} else {
//				myHandleDeal("DukptEncrypt3����ʧ��"+str, res3);
//			}
//		} else {
//			myHandleDeal("DukptEncrypt3���豸ʧ��", res1);
//		}
		
		
		myHandleDeal("testDukptEncrypt3����", 0);
		String data = "2906db3a39a725b8ffad9dfbadd9ba294aa2c71abbf64e9f";
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 8, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res3 = Ddi.ddi_dukpt_encrypt(1, 8, (byte) 0, iv, 0, m_plain, m_plain.length, cipher);
				String str = ByteUtils.byteArray2HexString(cipher);
				if (res3 == 0 && str.equals(data)) {
					myHandleDeal("���ܳɹ�", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("�ر��豸�ɹ�", res4);
					} else {
						myHandleDeal("DukptEncrypt3�ر��豸ʧ��", res4);
					}
				} else {
					myHandleDeal("DukptEncrypt3����ʧ��", res3);
				}
			} else {
				myHandleDeal("DukptEncrypt3��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptEncrypt3���豸ʧ��", res1);
		}
		
		
	}

	private void testDukptEncrypt4() {
		myHandleDeal("testDukptEncrypt4����", 0);
		String data = "a362be1425730942ebbff1ef13ebd7e051ffc09f8bc58a0f";
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 1, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res3 = Ddi.ddi_dukpt_encrypt(1, 1, (byte) 0, iv, 1, m_plain, m_plain.length, cipher);
				String str = ByteUtils.byteArray2HexString(cipher);
				if (res3 == 0 && str.equals(data)) {
					myHandleDeal("���ܳɹ�", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("�ر��豸�ɹ�", res4);
					} else {
						myHandleDeal("DukptEncrypt4�ر��豸ʧ��", res4);
					}
				} else {
					myHandleDeal("DukptEncrypt4����ʧ��", res3);
				}
			} else {
				myHandleDeal("DukptEncrypt4��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptEncrypt4���豸ʧ��", res1);
		}
	}

	/*
	 * �����ݼ��ܣ�Ŀǰֻ֧��32λ����
	 */
	private void testDukptEncrypt5() {
		myHandleDeal("testDukptEncrypt5����", 0);
		String plain = "";
		for (int i = 0; i < 3; i++) {
			plain = plain + "A12345678A123456";
		}
		byte[] m_plain1 = ByteUtils.hexString2ByteArray(plain);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 9, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res3 = Ddi.ddi_dukpt_encrypt(1, 9, (byte) 0, iv, 1, m_plain1, m_plain1.length, cipher);
				if (res3 == 0) {
					myHandleDeal("���ܳɹ�", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("�ر��豸�ɹ�", res4);
					} else {
						myHandleDeal("DukptEncrypt5�ر��豸ʧ��", res4);
					}
				} else {
					myHandleDeal("DukptEncrypt5����ʧ��", res3);
				}
			} else {
				myHandleDeal("DukptEncrypt5��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptEncrypt5���豸ʧ��", res1);
		}
	}

	private void testDukptEncrypt6() {
		myHandleDeal("testDukptEncrypt6����", 0);
		String data = "a0fe82ce901b5c16de0e9fcde3711e22073ac7ec7b7e8dd0";
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 0, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res3 = Ddi.ddi_dukpt_encrypt(0, 0, (byte) 1, iv, 0, m_plain, m_plain.length, cipher);
				String str = ByteUtils.byteArray2HexString(cipher);
				if (res3 == 0 && str.equals(data)) {
					myHandleDeal("���ܳɹ�", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("�ر��豸�ɹ�", res4);
					} else {
						myHandleDeal("DukptEncrypt6�ر��豸ʧ��", res4);
					}
				} else {
					myHandleDeal("DukptEncrypt6����ʧ��", res3);
				}
			} else {
				myHandleDeal("DukptEncrypt6��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptEncrypt6���豸ʧ��", res1);
		}
	}

	private void testDukptEncrypt7() {
		myHandleDeal("testDukptEncrypt7����", 0);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 8, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res3 = Ddi.ddi_dukpt_encrypt(1, 8, (byte) 1, iv, 0, m_plain, m_plain.length, cipher);
				if (res3 == 0) {
					myHandleDeal("���ܳɹ�", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("�ر��豸�ɹ�", res4);
					} else {
						myHandleDeal("DukptEncrypt7�ر��豸ʧ��", res4);
					}
				} else {
					myHandleDeal("DukptEncrypt7����ʧ��", res3);
				}
			} else {
				myHandleDeal("DukptEncrypt7��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptEncrypt7���豸ʧ��", res1);
		}
	}

	private void testDukptEncrypt8() {
		myHandleDeal("testDukptEncrypt8����", 0);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 0, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res3 = Ddi.ddi_dukpt_encrypt(0, 0, (byte) 0, iv, 2, m_plain, m_plain.length, cipher);
				if (res3 == -6) {
					myHandleDeal("���Գɹ�", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("�ر��豸�ɹ�", res4);
					} else {
						myHandleDeal("DukptEncrypt8�ر��豸ʧ��", res4);
					}
				} else {
					myHandleDeal("DukptEncrypt8����ʧ��", res3);
				}
			} else {
				myHandleDeal("DukptEncrypt8��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptEncrypt8���豸ʧ��", res1);
		}
	}

	private void testDukptEncrypt9() {
		myHandleDeal("testDukptEncrypt9����", 0);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 8, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res3 = Ddi.ddi_dukpt_encrypt(1, 8, (byte) 0, iv, 2, m_plain, m_plain.length, cipher);
				if (res3 == -6) {
					myHandleDeal("���Գɹ�", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("�ر��豸�ɹ�", res4);
					} else {
						myHandleDeal("DukptEncrypt9�ر��豸ʧ��", res4);
					}
				} else {
					myHandleDeal("DukptEncrypt9����ʧ��", res3);
				}
			} else {
				myHandleDeal("DukptEncrypt9��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptEncrypt9���豸ʧ��", res1);
		}
	}

	private void testDukptEncrypt10() {
		myHandleDeal("testDukptEncrypt10����", 0);
		String data = "f1acee231d370a171543cd366bb731349eeacd6590270b43";
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 0, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res4 = Ddi.ddi_dukpt_encrypt(0, 0, (byte) 0, iv, 0, m_plain, m_plain.length, cipher);
				long begin = System.currentTimeMillis();

				myHandleDeal("��ע��Կ�ɹ�" + res4, res2);
				for (int i = 0; i < 500; i++) {
					int res3 = Ddi.ddi_dukpt_encrypt(0, 0, (byte) 0, iv, 0, m_plain, m_plain.length, cipher);
				}
				long end = System.currentTimeMillis();
				long current = end - begin;
				myHandleDeal("DUKPTECB ����ģʽ��ʱ" + current + "��", 0);
			} else {
				myHandleDeal("DukptEncrypt1��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptEncrypt1���豸ʧ��", res1);
		}
	}

	private void testDukptEncrypt11() {
		myHandleDeal("testDukptEncrypt11����", 0);
		String data = "f1acee231d370a171543cd366bb731349eeacd6590270b43";
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 0, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				long begin = System.currentTimeMillis();

				for (int i = 0; i < 500; i++) {
					int res3 = Ddi.ddi_dukpt_encrypt(0, 0, (byte) 1, iv, 0, m_plain, m_plain.length, cipher);
				}
				long end = System.currentTimeMillis();
				long current = end - begin;
				myHandleDeal("DUKPTCBC ����ģʽ��ʱ" + current + "��", 0);
			} else {
				myHandleDeal("testDukptEncrypt11��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptEncrypt11���豸ʧ��", res1);
		}
	}

	private void testDukptEncrypt12() {
		myHandleDeal("testDukptEncrypt12����", 0);
		byte[] mdata2 = ByteUtils.hexString2ByteArray(ParaEntity.dataString512);
		byte[] cipher1 = new byte[512];
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 0, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res3 = Ddi.ddi_dukpt_encrypt(0, 0, (byte) 0, iv, 0, mdata2, mdata2.length, cipher1);
				int res5 = Ddi.ddi_dukpt_encrypt(0, 0, (byte) 0, iv, 1, mdata2, mdata2.length, cipher1);
				if (res3 == 0 && res5 == 0) {
					myHandleDeal("���ܳɹ�", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("�ر��豸�ɹ�", res4);
					} else {
						myHandleDeal("DukptEncrypt12�ر��豸ʧ��", res4);
					}
				} else {
					myHandleDeal("DukptEncrypt12����ʧ��" + res5 + res3, res3);
				}
			} else {
				myHandleDeal("DukptEncrypt12��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptEncrypt12���豸ʧ��", res1);
		}
	}

	private void testDukptEncrypt13() {
		myHandleDeal("testDukptEncrypt13����", 0);
		String mString = "313131313131313131313131313131";
		byte[] mdata2 = ByteUtils.hexString2ByteArray(ParaEntity.dataString1025);

		byte[] cipher1 = new byte[1024];
		byte[] bmString = ByteUtils.hexString2ByteArray(mString);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 0, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res3 = Ddi.ddi_dukpt_encrypt(0, 0, (byte) 0, iv, 0, bmString, bmString.length, cipher1);
				int res5 = Ddi.ddi_dukpt_encrypt(0, 0, (byte) 0, iv, 1, mdata2, mdata2.length, cipher1);
				if (res3 == -6 && res5 == -6) {
					myHandleDeal("���ܳɹ�", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("�ر��豸�ɹ�", res4);
					} else {
						myHandleDeal("DukptEncrypt13�ر��豸ʧ��", res4);
					}
				} else {
					myHandleDeal("DukptEncrypt13����ʧ��" + res5 + res3, res3);
				}
			} else {
				myHandleDeal("DukptEncrypt13��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptEncrypt13���豸ʧ��", res1);
		}
	}

	private void testDukptEncrypt14() {
		myHandleDeal("testDukptEncrypt14����", 0);
		String mString = "313131313131313131313131313131";
		byte[] bmString = ByteUtils.hexString2ByteArray(mString);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 8, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res3 = Ddi.ddi_dukpt_encrypt(1, 8, (byte) 0, iv, 0, bmString, bmString.length, cipher);
				if (res3 == -6) {
					myHandleDeal("���ܳɹ�", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("�ر��豸�ɹ�", res4);
					} else {
						myHandleDeal("DukptEncrypt14�ر��豸ʧ��", res4);
					}
				} else {
					myHandleDeal("DukptEncrypt14����ʧ��", res3);
				}
			} else {
				myHandleDeal("DukptEncrypt14��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptEncrypt14���豸ʧ��", res1);
		}
	}

	private void testDukptEncrypt15() {
		myHandleDeal("testDukptEncrypt15����", 0);
		String mString = "313131313131313131313131313131";
		byte[] bmString = ByteUtils.hexString2ByteArray(mString);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 8, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				// ����
				int res3 = Ddi.ddi_dukpt_encrypt(1, 8, (byte) 1, iv, 0, m_plain, m_plain.length, cipher);
				// ��Կ�����쳣
				int res9 = Ddi.ddi_dukpt_encrypt(1, 8, (byte) 1, iv, 0, m_plain, bmString.length, cipher);
				// ����������հ��쳣
				int res8 = Ddi.ddi_dukpt_encrypt(1, 8, (byte) 1, iv, 2, m_plain, m_plain.length, cipher);
				// ģʽ�쳣
				int res7 = Ddi.ddi_dukpt_encrypt(1, 8, (byte) -1, iv, 0, m_plain, m_plain.length, cipher);
				// �����쳣
				int res6 = Ddi.ddi_dukpt_encrypt(1, -1, (byte) 1, iv, 0, m_plain, m_plain.length, cipher);
				// �����쳣
				int res5 = Ddi.ddi_dukpt_encrypt(-1, 8, (byte) 1, iv, 0, m_plain, m_plain.length, cipher);
				if (res3 == 0 && res5 == -6 && res6 == -6 && res7 == -6 && res8 == -6 && res9 == -6) {
					myHandleDeal("���ܳɹ�", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("�ر��豸�ɹ�", res4);
					} else {
						myHandleDeal("DukptEncrypt15�ر��豸ʧ��", res4);
					}
				} else {
					myHandleDeal("DukptEncrypt15����ʧ��" + res5 + res6 + res7 + res8 + res9, res3);
				}
			} else {
				myHandleDeal("DukptEncrypt15��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptEncrypt15���豸ʧ��", res1);
		}
	}
//KSN�Լ�
	private void testDukptEncrypt16() {
		myHandleDeal("testDukptEncrypt16����", 0);
		String data = "7D2B803DA749F0DCD22F596C3494B1D6F57B2F10E0196AC5";
		String data1 = "FFFFFFFFFFFFFFE00999";
		String iv1 = "0000000000000000";
		byte[] ksn = new byte[10];
		int res1 = Ddi.ddi_dukpt_open();
		// ע�����Կ��01234567899876543210112233445566
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			//KSN��FFFFFFFFFFFFFFFFFFFF
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 0, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
//				int res6 = Ddi.ddi_dukpt_add_ksncnt(0, 0, (byte)1);
//				int res7 = Ddi.ddi_dukpt_getksn(0, 0, in, ksn);
//				String byteArray2HexString = ByteUtils.byteArray2HexString(ksn);
				for (int i = 0; i < 100000; i++) {
					int res8 = Ddi.ddi_dukpt_getksn(0, 0, in, ksn);
					String byteArray2HexString = ByteUtils.byteArray2HexString(ksn);
//				Log.v("111111", byteArray2HexString);
					if (res8 == 0 && byteArray2HexString.equalsIgnoreCase(data1)) {
						myHandleDeal("KSN��������", res8);
						i = 100000;
					} else {
						int res9 = Ddi.ddi_dukpt_add_ksncnt(0, 0, (byte) 1);
//					myHandleDeal("KSN�Լӳɹ�"+i,0);
//					Log.v("111111", "KSN�Լӳɹ�"+i);
					}
				}
				// �������ݣ�A12345678A12345678A12345678A12343232323232323232
				int res7 = Ddi.ddi_dukpt_getksn(0, 0, in, ksn);
				String byteArray2HexString = ByteUtils.byteArray2HexString(ksn);
				myHandleDeal("KSN��ֵ��" + byteArray2HexString, 0);
				int res3 = Ddi.ddi_dukpt_encrypt(0, 0, (byte) 1, iv, 0, m_plain, m_plain.length, cipher);
				String str = ByteUtils.byteArray2HexString(cipher);
				if (res3 == 0 && str.equalsIgnoreCase(data)) {
					myHandleDeal("���ܳɹ�", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("�ر��豸�ɹ�", res4);
					} else {
						myHandleDeal("DukptEncrypt16�ر��豸ʧ��", res4);
					}
				} else {
					myHandleDeal("DukptEncrypt16����ʧ��" + str, res3);
				}
			} else {
				myHandleDeal("DukptEncrypt16��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptEncrypt16���豸ʧ��", res1);
		}
	}

	private void testDukptEncrypt33() {
		Runnable runnable = new Runnable() {
			public void run() {
				myHandleDeal("testDukptEncrypt33����", 0);
				String data = "f1acee231d370a171543cd366bb731349eeacd6590270b43";
//				String data1 = "FFFFFFFFFFFFFFE00999";
				String iv1 = "0000000000000000";
				byte[] ksn = new byte[10];
				int res1 = Ddi.ddi_dukpt_open();
				// ע�����Կ��01234567899876543210112233445566
				if (res1 == 0) {
					myHandleDeal("DukptEncrypt33���豸�ɹ�", res1);
					// KSN��FFFFFFFFFFFFFFFFFFFF
					//m_initkey1=01234567899876543210112233445566
					int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 0, 2, m_initkey1, (byte) 0x10, m_initksn,
							(byte) 0xa);
					if (res2 == 0) {
						myHandleDeal("DukptEncrypt33��ע��Կ�ɹ�", res2);
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
								myHandleDeal(res11+"DukptEncrypt33���ܺ�getmac�ɹ�"+i, res3);
								int res10 = Ddi.ddi_dukpt_getksn(0, 0, in, ksn);
								String str3 = ByteUtils.byteArray2HexString(ksn);
//								Log.v("TAG", str3);
								int res9 = Ddi.ddi_dukpt_add_ksncnt(0, 0, (byte) 1);
								if (str2.equalsIgnoreCase(str3) ) {
								myHandleDeal("DukptEncrypt33���ܳɹ�"+i, res3);
								
								} else {
									myHandleDeal("DukptEncrypt33����ʧ��" + i, res3);
								}
								
							} else {
								myHandleDeal(res11+"DukptEncrypt33���ܺ�getmacʧ��"+i, res3);

							}
						}
						myHandleDeal("DukptEncrypt33KSN�Լ�10������", 0);
					} else {
						myHandleDeal("DukptEncryp��ע��Կʧ��", res2);
					}

				} else {
					myHandleDeal("DukptEncrypt33���豸ʧ��", res1);

				}
				int res4 = Ddi.ddi_dukpt_close();
				if (res4 == 0) {
					myHandleDeal("DukptEncrypt33�ر��豸�ɹ�", res4);
				} else {
					myHandleDeal("DukptEncrypt33�ر��豸ʧ��", res4);
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
		myHandleDeal("testDukptEncrypt17����", 0);
		String data = "0398D10CB54F557646E3A5D549646576DCE4D0A734152550";
		String data1 = "FFFFFFFFFFFFFFE00999";
		byte[] ksn = new byte[10];
		int res1 = Ddi.ddi_dukpt_open();
		// ע�����Կ��01234567899876543210112233445566
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 0, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
//				int res6 = Ddi.ddi_dukpt_add_ksncnt(0, 0, (byte)1);
//				int res7 = Ddi.ddi_dukpt_getksn(0, 0, in, ksn);
//				String byteArray2HexString = ByteUtils.byteArray2HexString(ksn);
				for (int i = 0; i < 100000; i++) {
					int res8 = Ddi.ddi_dukpt_getksn(0, 0, in, ksn);
					String byteArray2HexString = ByteUtils.byteArray2HexString(ksn);
				Log.v("111111", byteArray2HexString);
					if (res8 == 0 && byteArray2HexString.equalsIgnoreCase(data1)) {
						myHandleDeal("KSN��������", res8);
						i = 100000;
					} else {
						int res9 = Ddi.ddi_dukpt_add_ksncnt(0, 0, (byte) 1);
//					myHandleDeal("KSN�Լӳɹ�"+i,0);
//					Log.v("111111", "KSN�Լӳɹ�"+i);

					}

				}
				// �������ݣ�A12345678A12345678A12345678A12343232323232323232
				int res7 = Ddi.ddi_dukpt_getksn(0, 0, in, ksn);
				String byteArray2HexString = ByteUtils.byteArray2HexString(ksn);
				myHandleDeal("KSN��ֵ��" + byteArray2HexString, 0);
				int res3 = Ddi.ddi_dukpt_encrypt(0, 0, (byte) 0, iv, 0, m_plain, m_plain.length, cipher);
				String str = ByteUtils.byteArray2HexString(cipher);
				if (res3 == 0 && str.equalsIgnoreCase(data)) {
					myHandleDeal("���ܳɹ�", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("�ر��豸�ɹ�", res4);
					} else {
						myHandleDeal("DukptEncrypt1�ر��豸ʧ��", res4);
					}
				} else {
					myHandleDeal("DukptEncrypt1����ʧ��" + str, res3);
				}
			} else {
				myHandleDeal("DukptEncrypt1��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptEncrypt1���豸ʧ��", res1);
		}
	}

	// 2018.9.11
//	N3����֧�ֵ�DUKPT��Կ����Ϊ0��1��ÿ������Ϊ0-9
//	private void testDukptEncrypt10(){
//		iv=30303030abCDef99
//	}
	// pinblock = new byte[8]
	private void testDukptPinblock1() {
		myHandleDeal("testDukptPinblock1", 0);
		String data = "4e1494e199d1b3a8";
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == -1) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 9, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				// 30303030abCDef99
				int res3 = Ddi.ddi_dukpt_get_pin((byte) 0, 9, 0, iv, pinblock);
				String str = ByteUtils.byteArray2HexString(pinblock);
				if (res3 == 0 && str.equals(data)) {
					myHandleDeal("����Pinblock�ɹ�", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("�ر��豸�ɹ�", res4);
					} else {
						myHandleDeal("DukptPinblock1�ر��豸ʧ��", res4);
					}
				} else {
					myHandleDeal("DukptPinblock1����Pinblockʧ��", res3);
				}
			} else {
				myHandleDeal("DukptPinblock1��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("PINblock��Ҫʹ��������Կ���߲��Բ���ʧ��", -99);
		}
	}

	private void testDukptEncrypt18() {
		myHandleDeal("testDukptEncrypt18����", 0);
		String data = "f1acee231d370a171543cd366bb731349eeacd6590270b43";
		
		Runnable runnable = new Runnable() {
			public void run() {
				int res1 = Ddi.ddi_dukpt_open();
				if (res1 == 0) {
					myHandleDeal("���豸�ɹ�", res1);
					//1026
					for (int a = 0; a < 100; a++) {
						for (int i = 0; i < 2; i++) {
							for (int j = 0; j < 10; j++) {
								int res2 = Ddi.ddi_dukpt_inject((byte) i, (byte) j, 1, m_initkey, (byte) 0x10,
										m_initksn, (byte) 0xa);
								if (res2 == 0) {
									myHandleDeal("��" + a + "��" + i + "��" + "��" + j + "����ע��ɹ�", res2);
									int res3 = Ddi.ddi_dukpt_encrypt(i, j, (byte) 0, iv, 0, m_plain, m_plain.length,
											cipher);
									String str = ByteUtils.byteArray2HexString(cipher);
									if (res3 == 0) {
										myHandleDeal("��" + a + "��" + i + "��" + "��" + j + "�������ܳɹ�", res3);

									}
								}

							}

						}
					}
					int res2 = Ddi.ddi_dukpt_inject((byte) 0x00, (byte) 0x00, 1, m_initkey, (byte) 0x10, m_initksn,
							(byte) 0xa);
					if (res2 == 0) {
						myHandleDeal("��ע��Կ�ɹ�", res2);
						int res3 = Ddi.ddi_dukpt_close();
						if (res3 == 0) {
							myHandleDeal("�ر��豸�ɹ�", res3);
						} else {
							myHandleDeal("DukptInjict18�ر��豸ʧ��", res3);
						}
					} else {
						myHandleDeal("DukptInjict18��ע��Կʧ��", res2);
					}
				} else {
					myHandleDeal("DukptInjict18���豸ʧ��", res1);
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
		myHandleDeal("testDukptEncrypt19����", 0);
		String data = "f1acee231d370a171543cd366bb731349eeacd6590270b43";

//		Thread mThread = new Thread(new Runnable() {
//			public void run() {
//				for (int i = 0; i < 2000; i++) {
		int res1 = Ddi.ddi_dukpt_open();
		int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 0, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
		if (res2 == 0) {
			myHandleDeal("DukptEncrypt19��ע��Կ�ɹ�", res2);

			int res3 = Ddi.ddi_dukpt_encrypt(6, 6, (byte) 0, iv, 0, m_plain, m_plain.length, cipher);
			if (res3 == -6) {
				myHandleDeal("DukptEncrypt19���ܳɹ�", res3);

			} else {
				myHandleDeal("DukptEncrypt19����ʧ��", res3);
			}

		} else {
			myHandleDeal("DukptEncrypt19��ע��Կʧ��", res2);
		}
//				}
//			}
//		});

//		mThread.start();

		int res4 = Ddi.ddi_dukpt_close();
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
	 *         byte[]cipher); ��ز���������123Ϊֹ��DUKpt��ص���DUKPT���� DUKPT����ͽ��ռ���
	 *         ��������ܼ��㷽ʽ������DUKPT���߼����KEYֵ��DC56264BEAF2DB97062A1B101D0D529C
	 *         Ȼ������DES���㹤�߰�KEYֵ��Ϊ��Կ����Ҫ���ܵ�������Ϊ���ݣ�����DES���ܣ������ECBIV���������㣬CBC���룬
	 *         �������ø÷�ʽ�����KEY����ʵ����ļ����߼�����Ӧ��һ���� �̶�ֵ��0000000000ff00000000000000ff0000
	 *
	 *         ��Ӧ�����ܼ��㷽ʽ������DUKPT���߼�����������PEKֵ 78CA078C40375BF4C8818E8495D40735
	 *         Ȼ����PEKֵ�͹̶�ֵ000000ff00000000000000ff00000000���������ݣ�������������
	 *         78CA077340375BF4C8818E7B95D40735��Ȼ��������������Լ����Լ�����DES
	 *         ECBģʽ���ܣ��̶�ΪECB����õ������ݾ���KEYֵ35EDA924741ECBEFC7046D1B7D28C3FA��
	 */
	// ����� ECB/CBC BDK DUKPT ��С����
	private void testDukptEncrypt20() {
		myHandleDeal("testDukptEncrypt20����", 0);
		if (MainActivity.model.equalsIgnoreCase("N5")||MainActivity.model.equalsIgnoreCase("F900")||MainActivity.model.equalsIgnoreCase("EF900")||MainActivity.model.equalsIgnoreCase("N86")) {
			String data = "f1acee231d370a171543cd366bb731349eeacd6590270b43";
			String data2 = "A0FE82CE901B5C16DE0E9FCDE3711E22073AC7EC7B7E8DD0";
			int res1 = Ddi.ddi_dukpt_open();
			if (res1 == 0) {
				myHandleDeal("DukptEncrypt20���豸�ɹ�", res1);
				// 2=BDK 1=IPEK
				// m_initkey1=01234567899876543210112233445566
				// m_initksn=FFFFFFFFFFFFFFFFFFFF
				int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 0, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
				if (res2 == 0) {
					myHandleDeal("DukptEncrypt20��ע��Կ�ɹ�", res2);
					int res5 = Ddi.ddi_innerkey_open();
					if (res5 == 0) {
						myHandleDeal("DukptEncrypt20��������Կ�ɹ�", res5);
					}
					// 0=����� 1=���հ�
					// m_plain=A12345678A12345678A12345678A12343232323232323232
					// iv=30303030abCDef99
					// ����� ECB KEY=DC56264BEAF2DB97062A1B101D0D529C
					int res3 = Ddi.ddi_innerkey_account_encrypt(0, 0, 0, m_plain, m_plain.length, iv, cipher);
					String str = ByteUtils.byteArray2HexString(cipher);
					// ����� CBC KEY=DC56264BEAF2DB97062A1B101D0D529C
					int res6 = Ddi.ddi_innerkey_account_encrypt(1, 0, 0, m_plain, m_plain.length, iv, cipher);
					String str2 = ByteUtils.byteArray2HexString(cipher);
					if (res3 == 0 && str.equalsIgnoreCase(data) && res6 == 0 && str2.equalsIgnoreCase(data2)) {
						myHandleDeal("DukptEncrypt20���ܳɹ�", res3);
					} else {
						myHandleDeal("DukptEncrypt20����ʧ��" + str, res3);
					}
				} else {
					myHandleDeal("DukptEncrypt20��ע��Կʧ��", res2);
				}
			} else {
				myHandleDeal("DukptEncrypt20���豸ʧ��", res1);
			}
			int res4 = Ddi.ddi_dukpt_close();
			int res7 = Ddi.ddi_innerkey_close();
			if (res4 == 0 && res7 == 0) {
				myHandleDeal("DukptEncrypt20�رսӿڳɹ�", res4);
			} else {
				myHandleDeal("DukptEncrypt20�رսӿ�ʧ��", res4);
			}
		} else {
			myHandleDeal("DukptEncrypt20����ʧ��" + MainActivity.model + "��֧�ּ��ܿ����˻�����", -99);
		}
	}

	// ��Ӧ�� ECB/CBC IPEK DUKPT �������
	private void testDukptEncrypt21() {
		myHandleDeal("testDukptEncrypt21����", 0);
		if (MainActivity.model.equalsIgnoreCase("N5")||MainActivity.model.equalsIgnoreCase("EF900")||MainActivity.model.equalsIgnoreCase("F900")||MainActivity.model.equalsIgnoreCase("N86")) {
			String data = "A362BE1425730942EBBFF1EF13EBD7E051FFC09F8BC58A0F";
			String data2 = "6FF6CD11C7E73D1E4744B1F92EB5B406660056DDD01174CC";
			int res1 = Ddi.ddi_dukpt_open();
			if (res1 == 0) {
				myHandleDeal("DukptEncrypt21���豸�ɹ�", res1);
				// 2=BDK 1=IPEK
				// m_initkey1=01234567899876543210112233445566
				// m_initksn=FFFFFFFFFFFFFFFFFFFF
				int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 9, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
				if (res2 == 0) {
					myHandleDeal("DukptEncrypt21��ע��Կ�ɹ�", res2);
					int res5 = Ddi.ddi_innerkey_open();
					if (res5 == 0) {
						myHandleDeal("DukptEncrypt21��������Կ�ɹ�", res5);
					}
					// 0=����� 1=���հ�
					// m_plain=A12345678A12345678A12345678A12343232323232323232
					// iv=30303030abCDef99
					// ��Ӧ�� ECB KEY=4581DE4FFD1A87526081EB4E48803334
					int res3 = Ddi.ddi_innerkey_account_encrypt(16, 1, 9, m_plain, m_plain.length, iv, cipher);
					String str = ByteUtils.byteArray2HexString(cipher);
					// ��Ӧ�� CBC KEY=4581DE4FFD1A87526081EB4E48803334
					int res6 = Ddi.ddi_innerkey_account_encrypt(17, 1, 9, m_plain, m_plain.length, iv, cipher);
					String str2 = ByteUtils.byteArray2HexString(cipher);
					if (res3 == 0 && str.equalsIgnoreCase(data) && res6 == 0 && str2.equalsIgnoreCase(data2)) {
						myHandleDeal("DukptEncrypt21���ܳɹ�", res3);
					} else {
						myHandleDeal("DukptEncrypt21����ʧ��" + str, res3);
					}
				} else {
					myHandleDeal("DukptEncrypt21��ע��Կʧ��", res2);
				}
			} else {
				myHandleDeal("DukptEncrypt21���豸ʧ��", res1);
			}
			int res4 = Ddi.ddi_dukpt_close();
			int res7 = Ddi.ddi_innerkey_close();
			if (res4 == 0 && res7 == 0) {
				myHandleDeal("DukptEncrypt21�رսӿڳɹ�", res4);
			} else {
				myHandleDeal("DukptEncrypt21�رսӿ�ʧ��", res4);
			}
		} else {
			myHandleDeal("DukptEncrypt21����ʧ��" + MainActivity.model + "��֧�ּ��ܿ����˻�����", -99);
		}
	}

	// ����� ECB/CBC IPEK DUKPT ���м�����
	private void testDukptEncrypt22() {
		myHandleDeal("testDukptEncrypt22����", 0);
		if (MainActivity.model.equalsIgnoreCase("N5")||MainActivity.model.equalsIgnoreCase("EF900")||MainActivity.model.equalsIgnoreCase("F900")||MainActivity.model.equalsIgnoreCase("N86")) {
			String data = "2906DB3A39A725B8FFAD9DFBADD9BA294AA2C71ABBF64E9F";
			String data2 = "9D91F67935F0467DB98A492B71D122D0BA523F44E0FA2F3F";
			int res1 = Ddi.ddi_dukpt_open();
			if (res1 == 0) {
				myHandleDeal("DukptEncrypt22���豸�ɹ�", res1);
				// 2=BDK 1=IPEK
				// m_initkey1=01234567899876543210112233445566
				// m_initksn=FFFFFFFFFFFFFFFFFFFF
				int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 5, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
				if (res2 == 0) {
					myHandleDeal("DukptEncrypt22��ע��Կ�ɹ�", res2);
					int res5 = Ddi.ddi_innerkey_open();
					if (res5 == 0) {
						myHandleDeal("DukptEncrypt22��������Կ�ɹ�", res5);
					}
					// 0=����� 1=���հ�
					// m_plain=A12345678A12345678A12345678A12343232323232323232
					// iv=30303030abCDef99
					// ��Ӧ�� ECB KEY=9BB1049580132E42D8B13FF8B2299F8D
					int res3 = Ddi.ddi_innerkey_account_encrypt(0, 0, 5, m_plain, m_plain.length, iv, cipher);
					String str = ByteUtils.byteArray2HexString(cipher);
					// ��Ӧ�� CBC KEY=9BB1049580132E42D8B13FF8B2299F8D
					int res6 = Ddi.ddi_innerkey_account_encrypt(1, 0, 5, m_plain, m_plain.length, iv, cipher);
					String str2 = ByteUtils.byteArray2HexString(cipher);
					if (res3 == 0 && str.equalsIgnoreCase(data) && res6 == 0 && str2.equalsIgnoreCase(data2)) {
						myHandleDeal("DukptEncrypt22���ܳɹ�", res3);
					} else {
						myHandleDeal("DukptEncrypt22����ʧ��" + str, res3);
					}
				} else {
					myHandleDeal("DukptEncrypt22��ע��Կʧ��", res2);
				}
			} else {
				myHandleDeal("DukptEncrypt22���豸ʧ��", res1);
			}
			int res4 = Ddi.ddi_dukpt_close();
			int res7 = Ddi.ddi_innerkey_close();
			if (res4 == 0 && res7 == 0) {
				myHandleDeal("DukptEncrypt22�رսӿڳɹ�", res4);
			} else {
				myHandleDeal("DukptEncrypt22�رսӿ�ʧ��", res4);
			}
		} else {
			myHandleDeal("DukptEncrypt22����ʧ��" + MainActivity.model + "��֧�ּ��ܿ����˻�����", -99);
		}
	}

	// ��Ӧ�� ECB/CBC BDK DUKPT ���м�����
	private void testDukptEncrypt23() {
		myHandleDeal("testDukptEncrypt23����", 0);
		if (MainActivity.model.equalsIgnoreCase("N5")||MainActivity.model.equalsIgnoreCase("EF900")||MainActivity.model.equalsIgnoreCase("F900")||MainActivity.model.equalsIgnoreCase("N86")) {
			String data = "8D6FA88A5469618BFFBA1886E053CEB168687B4A13894D57";
			String data2 = "42949E9F0CADADFAA2DCE095A941E5FCCAB6ECBB9B8AA34D";
			int res1 = Ddi.ddi_dukpt_open();
			if (res1 == 0) {
				myHandleDeal("DukptEncrypt23���豸�ɹ�", res1);
				// 2=BDK 1=IPEK
				// m_initkey1=01234567899876543210112233445566
				// m_initksn=FFFFFFFFFFFFFFFFFFFF
				int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 5, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
				if (res2 == 0) {
					myHandleDeal("DukptEncrypt23��ע��Կ�ɹ�", res2);
					int res5 = Ddi.ddi_innerkey_open();
					if (res5 == 0) {
						myHandleDeal("DukptEncrypt23��������Կ�ɹ�", res5);
					}
					// 0=����� 1=���հ�
					// m_plain=A12345678A12345678A12345678A12343232323232323232
					// iv=30303030abCDef99
					// ��Ӧ�� ECB KEY=35EDA924741ECBEFC7046D1B7D28C3FA
					int res3 = Ddi.ddi_innerkey_account_encrypt(16, 1, 5, m_plain, m_plain.length, iv, cipher);
					String str = ByteUtils.byteArray2HexString(cipher);
					// ��Ӧ�� CBC KEY=35EDA924741ECBEFC7046D1B7D28C3FA
					int res6 = Ddi.ddi_innerkey_account_encrypt(17, 1, 5, m_plain, m_plain.length, iv, cipher);
					String str2 = ByteUtils.byteArray2HexString(cipher);
					if (res3 == 0 && str.equalsIgnoreCase(data) && res6 == 0 && str2.equalsIgnoreCase(data2)) {
						myHandleDeal("DukptEncrypt23���ܳɹ�", res3);
					} else {
						myHandleDeal("DukptEncrypt23����ʧ��" + str, res3);
					}
				} else {
					myHandleDeal("DukptEncrypt23��ע��Կʧ��", res2);
				}
			} else {
				myHandleDeal("DukptEncrypt23���豸ʧ��", res1);
			}
			int res4 = Ddi.ddi_dukpt_close();
			int res7 = Ddi.ddi_innerkey_close();
			if (res4 == 0 && res7 == 0) {
				myHandleDeal("DukptEncrypt23�رսӿڳɹ�", res4);
			} else {
				myHandleDeal("DukptEncrypt23�رսӿ�ʧ��", res4);
			}
		} else {
			myHandleDeal("DukptEncrypt23����ʧ��" + MainActivity.model + "��֧�ּ��ܿ����˻�����", -99);
		}

	}

	// ��Ӧ�� ECB/CBC BDK DUKPT ���м������쳣����
	private void testDukptEncrypt24() {
		myHandleDeal("testDukptEncrypt24����", 0);
		if (MainActivity.model.equalsIgnoreCase("N5")||MainActivity.model.equalsIgnoreCase("EF900")||MainActivity.model.equalsIgnoreCase("F900")||MainActivity.model.equalsIgnoreCase("N86")) {
			String data = "8D6FA88A5469618BFFBA1886E053CEB168687B4A13894D57";
			String data2 = "42949E9F0CADADFAA2DCE095A941E5FCCAB6ECBB9B8AA34D";
			int res1 = Ddi.ddi_dukpt_open();
			if (res1 == 0) {
				myHandleDeal("DukptEncrypt24���豸�ɹ�", res1);
				// 2=BDK 1=IPEK
				// m_initkey1=01234567899876543210112233445566
				// m_initksn=FFFFFFFFFFFFFFFFFFFF
				int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 5, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
				if (res2 == 0) {
					myHandleDeal("DukptEncrypt24��ע��Կ�ɹ�", res2);
					int res5 = Ddi.ddi_innerkey_open();
					if (res5 == 0) {
						myHandleDeal("DukptEncrypt24��������Կ�ɹ�", res5);
					}
					// 0=����� 1=���հ�
					// m_plain=A12345678A12345678A12345678A12343232323232323232
					// iv=30303030abCDef99
					// ��Ӧ�� ECB KEY=35EDA924741ECBEFC7046D1B7D28C3FA
					int res3 = Ddi.ddi_innerkey_account_encrypt(18, 1, 5, m_plain, m_plain.length, iv, cipher);
					String str = ByteUtils.byteArray2HexString(cipher);
					int res7 = Ddi.ddi_innerkey_account_encrypt(24, 1, 5, m_plain, m_plain.length, iv, cipher);
					String str4 = ByteUtils.byteArray2HexString(cipher);
					int res8 = Ddi.ddi_innerkey_account_encrypt(26, 1, 5, m_plain, m_plain.length, iv, cipher);
					String str5 = ByteUtils.byteArray2HexString(cipher);

					// ��Ӧ�� CBC KEY=35EDA924741ECBEFC7046D1B7D28C3FA
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
						myHandleDeal("DukptEncrypt24���ܳɹ�", res3);
					} else {
						myHandleDeal("DukptEncrypt24����ʧ��" + str, res3);
					}
				} else {
					myHandleDeal("DukptEncrypt24��ע��Կʧ��", res2);
				}
			} else {
				myHandleDeal("DukptEncrypt24���豸ʧ��", res1);
			}
			int res4 = Ddi.ddi_dukpt_close();
			int res7 = Ddi.ddi_innerkey_close();
			if (res4 == 0 && res7 == 0) {
				myHandleDeal("DukptEncrypt24�رսӿڳɹ�", res4);
			} else {
				myHandleDeal("DukptEncrypt24�رսӿ�ʧ��", res4);
			}
		} else {
			myHandleDeal("DukptEncrypt24����ʧ��" + MainActivity.model + "��֧�ּ��ܿ����˻�����", -99);
		}
	}

	// ����� ECB/CBC IPEK DUKPT ���м�����
	private void testDukptEncrypt25() {
		myHandleDeal("testDukptEncrypt25����", 0);
		if (MainActivity.model.equalsIgnoreCase("N5")||MainActivity.model.equalsIgnoreCase("EF900")||MainActivity.model.equalsIgnoreCase("F900")||MainActivity.model.equalsIgnoreCase("N86")) {
			String data = "2906DB3A39A725B8FFAD9DFBADD9BA294AA2C71ABBF64E9F";
			String data2 = "9D91F67935F0467DB98A492B71D122D0BA523F44E0FA2F3F";
			int res1 = Ddi.ddi_dukpt_open();
			if (res1 == 0) {
				myHandleDeal("DukptEncrypt25���豸�ɹ�", res1);
				// 2=BDK 1=IPEK
				// m_initkey1=01234567899876543210112233445566
				// m_initksn=FFFFFFFFFFFFFFFFFFFF
				int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 5, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
				if (res2 == 0) {
					myHandleDeal("DukptEncrypt25��ע��Կ�ɹ�", res2);
					int res5 = Ddi.ddi_innerkey_open();
					if (res5 == 0) {
						myHandleDeal("DukptEncrypt25��������Կ�ɹ�", res5);
					}
					// 0=����� 1=���հ�
					// m_plain=A12345678A12345678A12345678A12343232323232323232
					// iv=30303030abCDef99
					// ��Ӧ�� ECB KEY=9BB1049580132E42D8B13FF8B2299F8D
					int res3 = Ddi.ddi_innerkey_account_encrypt(2, 0, 5, m_plain, m_plain.length, iv, cipher);
					String str = ByteUtils.byteArray2HexString(cipher);
					int res7 = Ddi.ddi_innerkey_account_encrypt(8, 0, 5, m_plain, m_plain.length, iv, cipher);
					String str3 = ByteUtils.byteArray2HexString(cipher);
					int res8 = Ddi.ddi_innerkey_account_encrypt(10, 0, 5, m_plain, m_plain.length, iv, cipher);
					String str4 = ByteUtils.byteArray2HexString(cipher);
					// ��Ӧ�� CBC KEY=9BB1049580132E42D8B13FF8B2299F8D
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
						myHandleDeal("DukptEncrypt25���ܳɹ�", res3);
					} else {
						myHandleDeal("DukptEncrypt25����ʧ��" + str, res3);
					}
				} else {
					myHandleDeal("DukptEncrypt25��ע��Կʧ��", res2);
				}
			} else {
				myHandleDeal("DukptEncrypt25���豸ʧ��", res1);
			}
			int res4 = Ddi.ddi_dukpt_close();
			int res7 = Ddi.ddi_innerkey_close();
			if (res4 == 0 && res7 == 0) {
				myHandleDeal("DukptEncrypt25�رսӿڳɹ�", res4);
			} else {
				myHandleDeal("DukptEncrypt25�رսӿ�ʧ��", res4);
			}
		} else {
			myHandleDeal("DukptEncrypt25����ʧ��" + MainActivity.model + "��֧�ּ��ܿ����˻�����", -99);
		}
	}

	// ��Ӧ�� ECB/CBC BDK DUKPT �쳣����
	private void testDukptEncrypt26() {
		myHandleDeal("testDukptEncrypt26����", 0);
		if (MainActivity.model.equalsIgnoreCase("N5")||MainActivity.model.equalsIgnoreCase("EF900")||MainActivity.model.equalsIgnoreCase("F900")||MainActivity.model.equalsIgnoreCase("N86")) {
			String data = "8D6FA88A5469618BFFBA1886E053CEB168687B4A13894D57";
			String data2 = "42949E9F0CADADFAA2DCE095A941E5FCCAB6ECBB9B8AA34D";
			int res1 = Ddi.ddi_dukpt_open();
			if (res1 == 0) {
				myHandleDeal("DukptEncrypt26���豸�ɹ�", res1);
				// 2=BDK 1=IPEK
				// m_initkey1=01234567899876543210112233445566
				// m_initksn=FFFFFFFFFFFFFFFFFFFF
				int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 5, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
				if (res2 == 0) {
					myHandleDeal("DukptEncrypt26��ע��Կ�ɹ�", res2);
					int res5 = Ddi.ddi_innerkey_open();
					if (res5 == 0) {
						myHandleDeal("DukptEncrypt26��������Կ�ɹ�", res5);
					}
					// 0=����� 1=���հ�
					// m_plain=A12345678A12345678A12345678A12343232323232323232
					// iv=30303030abCDef99
					// ��Ӧ�� ECB KEY=35EDA924741ECBEFC7046D1B7D28C3FA
					int res3 = Ddi.ddi_innerkey_account_encrypt(16, 2, 5, m_plain, m_plain.length, iv, cipher);
					int res4 = Ddi.ddi_innerkey_account_encrypt(16, 2, 15, m_plain, m_plain.length, iv, cipher);
					// String str = ByteUtils.byteArray2HexString(cipher);
					// ��Ӧ�� CBC KEY=35EDA924741ECBEFC7046D1B7D28C3FA
					// int res6 = Ddi.ddi_innerkey_account_encrypt(17, 1, 5, m_plain,
					// m_plain.length, iv, cipher);
					String str2 = ByteUtils.byteArray2HexString(cipher);
					if (res3 == -6 && res3 == -6) {
						myHandleDeal("DukptEncrypt26���ܳɹ�", res3);
					} else {
						myHandleDeal("DukptEncrypt26����ʧ��", res3);
					}
				} else {
					myHandleDeal("DukptEncrypt26��ע��Կʧ��", res2);
				}
			} else {
				myHandleDeal("DukptEncrypt26���豸ʧ��", res1);
			}
			int res4 = Ddi.ddi_dukpt_close();
			int res7 = Ddi.ddi_innerkey_close();
			if (res4 == 0 && res7 == 0) {
				myHandleDeal("DukptEncrypt26�رսӿڳɹ�", res4);
			} else {
				myHandleDeal("DukptEncrypt26�رսӿ�ʧ��", res4);
			}
		} else {
			myHandleDeal("DukptEncrypt26����ʧ��" + MainActivity.model + "��֧�ּ��ܿ����˻�����", -99);
		}
	}


	// ������Կ����ӿ�(DES,SM4,AES)��DUKPT���ݼ��ܼ�MAC�������������������ݳ����޸�Ϊ2048;
	// DukptEncryp��BDK���������CBC/ECB
	public void testDukptEncrypt27() {
		//4096
		myHandleDeal("testDukptEncrypt27����", 0);
//				String data = "f1acee231d370a171543cd366bb731349eeacd6590270b43";
		byte[] hexString2ByteArray = ByteUtils.hexString2ByteArray(ParaEntity.dataString2048);
		byte[] ByteArray = new byte[2048];
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("DukptEncrypt27���豸�ɹ�", res1);
			// 2=BDK 1=IPEK
			// m_initkey1=01234567899876543210112233445566
			// m_initksn=FFFFFFFFFFFFFFFFFFFF
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 4, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("DukptEncrypt27��ע��Կ�ɹ�", res2);
				// �����=0 ���հ�=1
				// m_plain=A12345678A12345678A12345678A12343232323232323232
				// ECB
				int res3 = Ddi.ddi_dukpt_encrypt(0, 4, (byte) 0, iv, 0, hexString2ByteArray, hexString2ByteArray.length,
						ByteArray);
				String str = ByteUtils.byteArray2HexString(ByteArray);
				if (res3 == 0 && str.equalsIgnoreCase(ParaEntity.DukptEncrypt27ECB)) {
					myHandleDeal("DukptEncrypt27ECB���ܳɹ�", res3);
				} else {
					myHandleDeal("DukptEncrypt27ECB����ʧ��", res3);
				}
				// CBC
				int res5 = Ddi.ddi_dukpt_encrypt(0, 4, (byte) 1, iv, 0, hexString2ByteArray, hexString2ByteArray.length,
						ByteArray);
				String str1 = ByteUtils.byteArray2HexString(ByteArray);
				if (res5 == 0 && str1.equalsIgnoreCase(ParaEntity.DukptEncrypt27CBC)) {
					myHandleDeal("DukptEncrypt27CBC���ܳɹ�", res3);
				} else {
					myHandleDeal("DukptEncrypt27CBC����ʧ��", res3);
				}
			} else {
				myHandleDeal("DukptEncrypt27CBC��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptEncrypt27���豸ʧ��", res1);
		}

		int res4 = Ddi.ddi_dukpt_close();
		if (res4 == 0) {
			myHandleDeal("DukptEncrypt27�ر��豸�ɹ�", res4);
		} else {
			myHandleDeal("DukptEncrypt27�ر��豸ʧ��", res4);
		}
		
		//2048
//	
	}

	// ������Կ����ӿ�(DES,SM4,AES)��DUKPT���ݼ��ܼ�MAC�������������������ݳ����޸�Ϊ2048;
	// DukptEncryp��IPEK���������CBC/ECB
	public void testDukptEncrypt28() {
		//4096
		myHandleDeal("testDukptEncrypt28����", 0);
//				String data = "f1acee231d370a171543cd366bb731349eeacd6590270b43";
		byte[] hexString2ByteArray = ByteUtils.hexString2ByteArray(ParaEntity.dataString2048);
		byte[] ByteArray = new byte[2048];
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("DukptEncrypt28���豸�ɹ�", res1);
			// 2=BDK 1=IPEK
			// m_initkey1=01234567899876543210112233445566
			// m_initksn=FFFFFFFFFFFFFFFFFFFF
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 4, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("DukptEncrypt28��ע��Կ�ɹ�", res2);
				// �����=0 ���հ�=1
				// m_plain=A12345678A12345678A12345678A12343232323232323232
				// ECB
				int res3 = Ddi.ddi_dukpt_encrypt(0, 4, (byte) 0, iv, 0, hexString2ByteArray, hexString2ByteArray.length,
						ByteArray);
				String str = ByteUtils.byteArray2HexString(ByteArray);
				if (res3 == 0 && str.equalsIgnoreCase(ParaEntity.DukptEncrypt28ECB)) {
					myHandleDeal("DukptEncrypt28ECB���ܳɹ�", res3);
				} else {
					myHandleDeal("DukptEncrypt28ECB����ʧ��", res3);
				}
				// CBC
				int res5 = Ddi.ddi_dukpt_encrypt(0, 4, (byte) 1, iv, 0, hexString2ByteArray, hexString2ByteArray.length,
						ByteArray);
				String str1 = ByteUtils.byteArray2HexString(ByteArray);
				if (res5 == 0 && str1.equalsIgnoreCase(ParaEntity.DukptEncrypt28CBC)) {
					myHandleDeal("DukptEncrypt28CBC���ܳɹ�", res3);
				} else {
					myHandleDeal("DukptEncrypt28CBC����ʧ��", res3);
				}
			} else {
				myHandleDeal("DukptEncrypt28CBC��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptEncrypt28���豸ʧ��", res1);
		}

		int res4 = Ddi.ddi_dukpt_close();
		if (res4 == 0) {
			myHandleDeal("DukptEncrypt28�ر��豸�ɹ�", res4);
		} else {
			myHandleDeal("DukptEncrypt28�ر��豸ʧ��", res4);
		}
	
	}

	// ������Կ����ӿ�(DES,SM4,AES)��DUKPT���ݼ��ܼ�MAC�������������������ݳ����޸�Ϊ2048;
	// DukptEncryp��BDK����Ӧ����CBC/ECB
	public void testDukptEncrypt29() {
		
		myHandleDeal("testDukptEncrypt29����", 0);
//				String data = "f1acee231d370a171543cd366bb731349eeacd6590270b43";
		byte[] hexString2ByteArray = ByteUtils.hexString2ByteArray(ParaEntity.dataString2048);
		byte[] ByteArray = new byte[2048];
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("DukptEncrypt29���豸�ɹ�", res1);
			// 2=BDK 1=IPEK
			// m_initkey1=01234567899876543210112233445566
			// m_initksn=FFFFFFFFFFFFFFFFFFFF
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 4, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("DukptEncrypt29��ע��Կ�ɹ�", res2);
				// �����=0 ���հ�=1
				// m_plain=A12345678A12345678A12345678A12343232323232323232
				// ECB
				int res3 = Ddi.ddi_dukpt_encrypt(0, 4, (byte) 0, iv, 1, hexString2ByteArray, hexString2ByteArray.length,
						ByteArray);
				String str = ByteUtils.byteArray2HexString(ByteArray);
				if (res3 == 0 && str.equalsIgnoreCase(ParaEntity.DukptEncrypt29ECB)) {
					myHandleDeal("DukptEncrypt29ECB���ܳɹ�", res3);
				} else {
					myHandleDeal("DukptEncrypt29ECB����ʧ��", res3);
				}
				// CBC
				int res5 = Ddi.ddi_dukpt_encrypt(0, 4, (byte) 1, iv, 1, hexString2ByteArray, hexString2ByteArray.length,
						ByteArray);
				String str1 = ByteUtils.byteArray2HexString(ByteArray);
				if (res5 == 0 && str1.equalsIgnoreCase(ParaEntity.DukptEncrypt29CBC)) {
					myHandleDeal("DukptEncrypt29CBC���ܳɹ�", res3);
				} else {
					myHandleDeal("DukptEncrypt29CBC����ʧ��", res3);
				}
			} else {
				myHandleDeal("DukptEncrypt29CBC��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptEncrypt29���豸ʧ��", res1);
		}

		int res4 = Ddi.ddi_dukpt_close();
		if (res4 == 0) {
			myHandleDeal("DukptEncrypt29�ر��豸�ɹ�", res4);
		} else {
			myHandleDeal("DukptEncrypt29�ر��豸ʧ��", res4);
		}
	
	}

	// ������Կ����ӿ�(DES,SM4,AES)��DUKPT���ݼ��ܼ�MAC�������������������ݳ����޸�Ϊ2048;
	// DukptEncryp��IPEK����Ӧ����CBC/ECB
	public void testDukptEncrypt30() {
		
		myHandleDeal("testDukptEncrypt30����", 0);
//				String data = "f1acee231d370a171543cd366bb731349eeacd6590270b43";
		byte[] hexString2ByteArray = ByteUtils.hexString2ByteArray(ParaEntity.dataString2048);
		byte[] ByteArray = new byte[2048];
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("DukptEncrypt30���豸�ɹ�", res1);
			// 2=BDK 1=IPEK
			// m_initkey1=01234567899876543210112233445566
			// m_initksn=FFFFFFFFFFFFFFFFFFFF
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 4, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("DukptEncrypt30��ע��Կ�ɹ�", res2);
				// �����=0 ���հ�=1
				// m_plain=A12345678A12345678A12345678A12343232323232323232
				// ECB
				int res3 = Ddi.ddi_dukpt_encrypt(0, 4, (byte) 0, iv, 1, hexString2ByteArray, hexString2ByteArray.length,
						ByteArray);
				String str = ByteUtils.byteArray2HexString(ByteArray);
				if (res3 == 0 && str.equalsIgnoreCase(ParaEntity.DukptEncrypt30ECB)) {
					myHandleDeal("DukptEncrypt30ECB���ܳɹ�", res3);
				} else {
					myHandleDeal("DukptEncrypt30ECB����ʧ��", res3);
				}
				// CBC
				int res5 = Ddi.ddi_dukpt_encrypt(0, 4, (byte) 1, iv, 1, hexString2ByteArray, hexString2ByteArray.length,
						ByteArray);
				String str1 = ByteUtils.byteArray2HexString(ByteArray);
				if (res5 == 0 && str1.equalsIgnoreCase(ParaEntity.DukptEncrypt30CBC)) {
					myHandleDeal("DukptEncrypt30CBC���ܳɹ�", res3);
				} else {
					myHandleDeal("DukptEncrypt30CBC����ʧ��", res3);
				}
			} else {
				myHandleDeal("DukptEncrypt30CBC��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptEncrypt30���豸ʧ��", res1);
		}

		int res4 = Ddi.ddi_dukpt_close();
		if (res4 == 0) {
			myHandleDeal("DukptEncrypt30�ر��豸�ɹ�", res4);
		} else {
			myHandleDeal("DukptEncrypt30�ر��豸ʧ��", res4);
		}
	
	}

	// ������Կ����ӿ�(DES,SM4,AES)��DUKPT���ݼ��ܼ�MAC�������������������ݳ��ȴ���2048;
	// DukptEncryp��IPEK����Ӧ����CBC/ECB
	public void testDukptEncrypt31() {
		
		myHandleDeal("testDukptEncrypt31����", 0);
//				String data = "f1acee231d370a171543cd366bb731349eeacd6590270b43";
		byte[] hexString2ByteArray = ByteUtils.hexString2ByteArray(ParaEntity.dataString2056);
		byte[] ByteArray = new byte[2056];
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("DukptEncrypt31���豸�ɹ�", res1);
			// 2=BDK 1=IPEK
			// m_initkey1=01234567899876543210112233445566
			// m_initksn=FFFFFFFFFFFFFFFFFFFF
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 4, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("DukptEncrypt31��ע��Կ�ɹ�", res2);
				// �����=0 ���հ�=1
				// m_plain=A12345678A12345678A12345678A12343232323232323232
				// ECB
				int res3 = Ddi.ddi_dukpt_encrypt(0, 4, (byte) 0, iv, 1, hexString2ByteArray, hexString2ByteArray.length,
						ByteArray);
//						String str = ByteUtils.byteArray2HexString(ByteArray);
				if (res3 == -6) {
					myHandleDeal("DukptEncrypt31ECB���ܳɹ�", res3);
				} else {
					myHandleDeal("DukptEncrypt31ECB����ʧ��", res3);
				}
				// CBC
				int res5 = Ddi.ddi_dukpt_encrypt(0, 4, (byte) 1, iv, 1, hexString2ByteArray, hexString2ByteArray.length,
						ByteArray);
//						String str1 = ByteUtils.byteArray2HexString(ByteArray);
				if (res5 == -6) {
					myHandleDeal("DukptEncrypt31CBC���ܳɹ�", res3);
				} else {
					myHandleDeal("DukptEncrypt31CBC����ʧ��", res3);
				}
			} else {
				myHandleDeal("DukptEncrypt31CBC��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptEncrypt31���豸ʧ��", res1);
		}

		int res4 = Ddi.ddi_dukpt_close();
		if (res4 == 0) {
			myHandleDeal("DukptEncrypt31�ر��豸�ɹ�", res4);
		} else {
			myHandleDeal("DukptEncrypt31�ر��豸ʧ��", res4);
		}
		

	}

	// ������Կ����ӿ�(DES,SM4,AES)��DUKPT���ݼ��ܼ�MAC�������������������ݳ����޸�Ϊ2048��ѭ��200��;
	// DukptEncryp��IPEK����Ӧ����CBC/ECB
	public void testDukptEncrypt32() {
		
				Runnable runnable = new Runnable() {
					public void run() {
		for (int i = 0; i < 200; i++) {
			myHandleDeal("DukptEncrypt32������..........", 0);
//							String data = "f1acee231d370a171543cd366bb731349eeacd6590270b43";
			final byte[] hexString2ByteArray = ByteUtils
					.hexString2ByteArray(paraEntity.get2048(paraEntity.dataString2048));
			final byte[] ByteArray = new byte[2048];
			int res1 = Ddi.ddi_dukpt_open();
			if (res1 == 0) {
				myHandleDeal("DukptEncrypt32���豸�ɹ�" + i, res1);
				// 2=BDK 1=IPEK
				// m_initkey1=01234567899876543210112233445566
				// m_initksn=FFFFFFFFFFFFFFFFFFFF
				int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 4, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
				if (res2 == 0) {
					myHandleDeal("DukptEncrypt32��ע��Կ�ɹ�" + i, res2);
					// �����=0 ���հ�=1
					// m_plain=A12345678A12345678A12345678A12343232323232323232
					// ECB
					int res3 = Ddi.ddi_dukpt_encrypt(0, 4, (byte) 0, iv, 1, hexString2ByteArray,
							hexString2ByteArray.length, ByteArray);
					String str = ByteUtils.byteArray2HexString(ByteArray);
					if (res3 == 0 && str.equalsIgnoreCase(ParaEntity.DukptEncrypt30ECB)) {
						myHandleDeal("DukptEncrypt32ECB���ܳɹ�" + i, res3);
					} else {
						myHandleDeal("DukptEncrypt32ECB����ʧ��" + i, res3);
					}
					// CBC

					int res5 = Ddi.ddi_dukpt_encrypt(0, 4, (byte) 1, iv, 1, hexString2ByteArray,
							hexString2ByteArray.length, ByteArray);
					String str1 = ByteUtils.byteArray2HexString(ByteArray);
					if (res5 == 0 && str1.equalsIgnoreCase(ParaEntity.DukptEncrypt30CBC)) {
						myHandleDeal("DukptEncrypt32CBC���ܳɹ�" + i, res3);
					} else {
						myHandleDeal("DukptEncrypt32CBC����ʧ��" + i, res3);
					}
				} else {
					myHandleDeal("DukptEncrypt32CBC��ע��Կʧ��" + i, res2);
				}
			} else {
				myHandleDeal("DukptEncrypt32���豸ʧ��" + i, res1);
			}
			int res4 = Ddi.ddi_dukpt_close();
			if (res4 == 0) {
				myHandleDeal("DukptEncrypt32�ر��豸�ɹ�" + i, res4);
			} else {
				myHandleDeal("DukptEncrypt32�ر��豸ʧ��" + i, res4);
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
		myHandleDeal("testDukptPinblock2����", 0);
		String data = "0a309ce297a9b3b0";
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 0, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res3 = Ddi.ddi_dukpt_get_pin((byte) 0, 0, 0, iv, pinblock);
				String str = ByteUtils.byteArray2HexString(pinblock);
				if (res3 == 0 && str.equals(data)) {
					myHandleDeal("����Pinblock�ɹ�", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("�ر��豸�ɹ�", res4);
					} else {
						myHandleDeal("DukptPinblock2�ر��豸ʧ��", res4);
					}
				} else {
					myHandleDeal("DukptPinblock2����Pinblockʧ��", res3);
				}
			} else {
				myHandleDeal("DukptPinblock2��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptPinblock2���豸ʧ��", res1);
		}
	}

	private void testDukptPinblock3() {
		myHandleDeal("testDukptPinblock3����", 0);
		String data = "4e1494e199d1b3a8";
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 9, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res3 = Ddi.ddi_dukpt_get_pin((byte) 1, 9, 0, iv, pinblock);
				String str = ByteUtils.byteArray2HexString(pinblock);
				if (res3 == 0 && str.equals(data)) {
					myHandleDeal("����Pinblock�ɹ�", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("�ر��豸�ɹ�", res4);
					} else {
						myHandleDeal("DukptPinblock3�ر��豸ʧ��", res4);
					}
				} else {
					myHandleDeal("DukptPinblock3����Pinblockʧ��", res3);
				}
			} else {
				myHandleDeal("DukptPinblock3��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptPinblock3���豸ʧ��", res1);
		}
	}

	private void testDukptPinblock4() {
		myHandleDeal("testDukptPinblock4����", 0);
		String data = "0a309ce297a9b3b0";
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 9, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res3 = Ddi.ddi_dukpt_get_pin((byte) 1, 9, 0, iv, pinblock);
				String str = ByteUtils.byteArray2HexString(pinblock);
				if (res3 == 0 && str.equals(data)) {
					myHandleDeal("����Pinblock�ɹ�", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("�ر��豸�ɹ�", res4);
					} else {
						myHandleDeal("DukptPinblock4�ر��豸ʧ��", res4);
					}
				} else {
					myHandleDeal("DukptPinblock4����Pinblockʧ��", res3);
				}
			} else {
				myHandleDeal("DukptPinblock4��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptPinblock4���豸ʧ��", res1);
		}
	}

	private void testDukptPinblock5() {
		myHandleDeal("testDukptPinblock5����", 0);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 9, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res3 = Ddi.ddi_dukpt_get_pin((byte) 1, 10, 0, iv, pinblock);
				String str = ByteUtils.byteArray2HexString(pinblock);
				if (res3 == -1) {
					myHandleDeal("���Գɹ�", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("�ر��豸�ɹ�", res4);
					} else {
						myHandleDeal("DukptPinblock5�ر��豸ʧ��", res4);
					}
				} else {
					myHandleDeal("DukptPinblock5����ʧ��", res3);
				}
			} else {
				myHandleDeal("DukptPinblock5��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptPinblock5���豸ʧ��", res1);
		}
	}

	private void testDukptPinblock6() {
		myHandleDeal("testDukptPinblock6����", 0);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 9, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res3 = Ddi.ddi_dukpt_get_pin((byte) 0, 10, 0, iv, pinblock);
				String str = ByteUtils.byteArray2HexString(pinblock);
				if (res3 == -1) {
					myHandleDeal("���Գɹ�", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("�ر��豸�ɹ�", res4);
					} else {
						myHandleDeal("DukptPinblock6�ر��豸ʧ��", res4);
					}
				} else {
					myHandleDeal("DukptPinblock6����ʧ��", res3);
				}
			} else {
				myHandleDeal("DukptPinblock6��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptPinblock6���豸ʧ��", res1);
		}
	}

	private void testDukptMAC1() {
		
	
		myHandleDeal("testDukptMAC1����", 0);
		String data = "9b7362747319042c";
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 0, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res3 = Ddi.ddi_dukpt_get_mac((byte) 0, 0, 0, 0, m_plain1, m_plain1.length, mac);
				String str = ByteUtils.byteArray2HexString(mac);
				if (res3 == 0 && str.equals(data)) {
					myHandleDeal("����MAC�ɹ�", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("�ر��豸�ɹ�", res4);
					} else {
						myHandleDeal("DukptMAC1�ر��豸ʧ��", res4);
					}
				} else {
					myHandleDeal("DukptMAC1����MACʧ��" + str, res3);
				}
			} else {
				myHandleDeal("DukptMAC1��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptMAC1���豸ʧ��", res1);
		}
		
	}

	private void testDukptMAC2() {
	
		
		myHandleDeal("testDukptMAC2����", 0);
		String data = "621904c5b21b2d22";
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 9, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res3 = Ddi.ddi_dukpt_get_mac((byte) 1, 9, 0, 0, m_plain1, m_plain1.length, mac);
				String str = ByteUtils.byteArray2HexString(mac);
				if (res3 == 0 && str.equals(data)) {
					myHandleDeal("����MAC�ɹ�", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("�ر��豸�ɹ�", res4);
					} else {
						myHandleDeal("DukptMAC2�ر��豸ʧ��", res4);
					}
				} else {
					myHandleDeal("DukptMAC2����MACʧ��", res3);
				}
			} else {
				myHandleDeal("DukptMAC2��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptMAC2���豸ʧ��", res1);
		}
//		
	}

	private void testDukptMAC3() {
		myHandleDeal("testDukptMAC3����", 0);
		String data = "f82967107398ce8e";
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 9, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res3 = Ddi.ddi_dukpt_get_mac((byte) 0, 9, 0, 1, m_plain1, m_plain1.length, mac);
				String str = ByteUtils.byteArray2HexString(mac);
				if (res3 == 0 && str.equals(data)) {
					myHandleDeal("����MAC�ɹ�", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("�ر��豸�ɹ�", res4);
					} else {
						myHandleDeal("DukptMAC3�ر��豸ʧ��", res4);
					}
				} else {
					myHandleDeal("DukptMAC3����MACʧ��", res3);
				}
			} else {
				myHandleDeal("DukptMAC3��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptMAC3���豸ʧ��", res1);
		}
	}

	private void testDukptMAC4() {
		myHandleDeal("testDukptMAC4����", 0);
		String data = "a8d9998c98980e5d";
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 0, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res3 = Ddi.ddi_dukpt_get_mac((byte) 1, 0, 1, 0, m_plain1, m_plain1.length, mac);
				String str = ByteUtils.byteArray2HexString(mac);
				if (res3 == 0 && str.equals(data)) {
					myHandleDeal("����MAC�ɹ�", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("�ر��豸�ɹ�", res4);
					} else {
						myHandleDeal("DukptMAC4�ر��豸ʧ��", res4);
					}
				} else {
					myHandleDeal("DukptMAC4����MACʧ��" + str, res3);
				}
			} else {
				myHandleDeal("DukptMAC4��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptMAC4���豸ʧ��", res1);
		}
	}

	private void testDukptMAC5() {
		myHandleDeal("testDukptMAC5����", 0);
		String data = "7752de89632f2b59";
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 0, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res3 = Ddi.ddi_dukpt_get_mac((byte) 0, 0, 1, 1, m_plain1, m_plain1.length, mac);
				String str = ByteUtils.byteArray2HexString(mac);
				if (res3 == 0 && str.equals(data)) {
					myHandleDeal("����MAC�ɹ�", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("�ر��豸�ɹ�", res4);
					} else {
						myHandleDeal("DukptMAC5�ر��豸ʧ��", res4);
					}
				} else {
					myHandleDeal("DukptMAC5����MACʧ��" + str, res3);
				}
			} else {
				myHandleDeal("DukptMAC5��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptMAC5���豸ʧ��", res1);
		}
	}

	private void testDukptMAC6() {
		myHandleDeal("testDukptMAC6����", 0);
		String data = "9fcee685e2190442";
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 5, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res3 = Ddi.ddi_dukpt_get_mac((byte) 0, 5, 2, 0, m_plain1, m_plain1.length, mac);
				String str = ByteUtils.byteArray2HexString(mac);
				if (res3 == 0 && str.equals(data)) {
					myHandleDeal("����MAC�ɹ�", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("�ر��豸�ɹ�", res4);
					} else {
						myHandleDeal("DukptMAC6�ر��豸ʧ��", res4);
					}
				} else {
					myHandleDeal("DukptMAC6����MACʧ��", res3);
				}
			} else {
				myHandleDeal("DukptMAC6��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptMAC6���豸ʧ��", res1);
		}
	}

	private void testDukptMAC7() {
		myHandleDeal("testDukptMAC7����", 0);
		String data = "2550995b71f5cbc3";
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 5, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res3 = Ddi.ddi_dukpt_get_mac((byte) 1, 5, 2, 1, m_plain1, m_plain1.length, mac);
				String str = ByteUtils.byteArray2HexString(mac);
				if (res3 == 0 && str.equals(data)) {
					myHandleDeal("����MAC�ɹ�", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("�ر��豸�ɹ�", res4);
					} else {
						myHandleDeal("DukptMAC7�ر��豸ʧ��", res4);
					}
				} else {
					myHandleDeal("DukptMAC7����MACʧ��", res3);
				}
			} else {
				myHandleDeal("DukptMAC7��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptMAC7���豸ʧ��", res1);
		}
	}

	private void testDukptMAC8() {
		myHandleDeal("testDukptMAC8����", 0);
		String data = "3431453743443042";
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 1, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res3 = Ddi.ddi_dukpt_get_mac((byte) 1, 1, 3, 0, m_plain1, m_plain1.length, mac);
				String str = ByteUtils.byteArray2HexString(mac);
				if (res3 == 0 && str.equals(data)) {
					myHandleDeal("����MAC�ɹ�", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("�ر��豸�ɹ�", res4);
					} else {
						myHandleDeal("DukptMAC8�ر��豸ʧ��", res4);
					}
				} else {
					myHandleDeal("DukptMAC8����MACʧ��", res3);
				}
			} else {
				myHandleDeal("DukptMAC8��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptMAC8���豸ʧ��", res1);
		}
	}

	private void testDukptMAC9() {
		myHandleDeal("testDukptMAC9����", 0);
		String data = "3746304637314341";
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 2, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res3 = Ddi.ddi_dukpt_get_mac((byte) 1, 2, 3, 1, m_plain1, m_plain1.length, mac);
				String str = ByteUtils.byteArray2HexString(mac);
				if (res3 == 0 && str.equals(data)) {
					myHandleDeal("����MAC�ɹ�", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("�ر��豸�ɹ�", res4);
					} else {
						myHandleDeal("DukptMAC9�ر��豸ʧ��", res4);
					}
				} else {
					myHandleDeal("DukptMAC9����MACʧ��", res3);
				}
			} else {
				myHandleDeal("DukptMAC9��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptMAC9���豸ʧ��", res1);
		}
	}

	private void testDukptMAC10() {
		myHandleDeal("testDukptMAC10����", 0);
		String data = "9fcee685e2190442";
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 1, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res3 = Ddi.ddi_dukpt_get_mac((byte) 0, 1, 4, 0, m_plain1, m_plain1.length, mac);
				String str = ByteUtils.byteArray2HexString(mac);
				if (res3 == 0 && str.equals(data)) {
					myHandleDeal("����MAC�ɹ�", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("�ر��豸�ɹ�", res4);
					} else {
						myHandleDeal("DukptMAC10�ر��豸ʧ��", res4);
					}
				} else {
					myHandleDeal("DukptMAC10����MACʧ��", res3);
				}
			} else {
				myHandleDeal("DukptMAC10��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptMAC10���豸ʧ��", res1);
		}
	}

	private void testDukptMAC11() {
		myHandleDeal("testDukptMAC11����", 0);
		String data = "2550995b71f5cbc3";
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 2, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res3 = Ddi.ddi_dukpt_get_mac((byte) 0, 2, 4, 1, m_plain1, m_plain1.length, mac);
				String str = ByteUtils.byteArray2HexString(mac);
				if (res3 == 0 && str.equals(data)) {
					myHandleDeal("����MAC�ɹ�", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("�ر��豸�ɹ�", res4);
					} else {
						myHandleDeal("DukptMAC11�ر��豸ʧ��", res4);
					}
				} else {
					myHandleDeal("DukptMAC11����MACʧ��", res3);
				}
			} else {
				myHandleDeal("DukptMAC11��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptMAC11���豸ʧ��", res1);
		}
	}

	private void testDukptMAC12() {
		myHandleDeal("testDukptMAC12����", 0);
		String data = "a8d9998c98980e5d";
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 7, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res3 = Ddi.ddi_dukpt_get_mac((byte) 1, 7, 5, 0, m_plain1, m_plain1.length, mac);
				String str = ByteUtils.byteArray2HexString(mac);
				if (res3 == 0 && str.equals(data)) {
					myHandleDeal("����MAC�ɹ�", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("�ر��豸�ɹ�", res4);
					} else {
						myHandleDeal("DukptMAC12�ر��豸ʧ��", res4);
					}
				} else {
					myHandleDeal("DukptMAC12����MACʧ��", res3);
				}
			} else {
				myHandleDeal("DukptMAC12��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptMAC12���豸ʧ��", res1);
		}
	}

	private void testDukptMAC13() {
		myHandleDeal("testDukptMAC13����", 0);
		String data = "7752de89632f2b59";
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 8, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res3 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 5, 1, m_plain1, m_plain1.length, mac);
				String str = ByteUtils.byteArray2HexString(mac);
				if (res3 == 0 && str.equals(data)) {
					myHandleDeal("����MAC�ɹ�", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("�ر��豸�ɹ�", res4);
					} else {
						myHandleDeal("DukptMAC13�ر��豸ʧ��", res4);
					}
				} else {
					myHandleDeal("DukptMAC13����MACʧ��", res3);
				}
			} else {
				myHandleDeal("DukptMAC13��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptMAC13���豸ʧ��", res1);
		}
	}

	private void testDukptMAC14() {
		myHandleDeal("testDukptMAC14����", 0);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 7, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res3 = Ddi.ddi_dukpt_get_mac((byte) 0, 7, -1, 0, m_plain1, m_plain1.length, mac);
				int res5 = Ddi.ddi_dukpt_get_mac((byte) 0, 8, 6, 0, m_plain1, m_plain1.length, mac);
				//
				int res6 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 0, 0, m_plain1, m_plain1.length, mac);
				int res7 = Ddi.ddi_dukpt_get_mac((byte) 0, 7, 0, 2, m_plain1, m_plain1.length, mac);
				if (res3 == -6 && res5 == -6 && res6 == 0 && res7 == -6) {
					myHandleDeal("���Գɹ�", 0);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("�ر��豸�ɹ�", res4);
					} else {
						myHandleDeal("DukptMAC14�ر��豸ʧ��", res4);
					}
				} else {
					myHandleDeal("DukptMAC14����ʧ��" + res3 + res5 + res6 + res7, res3);
				}
			} else {
				myHandleDeal("DukptMAC14��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptMAC14���豸ʧ��", res1);
		}
	}

	private void testDukptMAC15() {

		myHandleDeal("testDukptMAC15����", 0);
		String dataString15 = "313131313131313131133131313131";
		byte[] mdata = ByteUtils.hexString2ByteArray(dataString15);
		byte[] mdata2 = ByteUtils.hexString2ByteArray(ParaEntity.dataString1025);
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 7, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res3 = Ddi.ddi_dukpt_get_mac((byte) 0, 7, 0, 0, mdata, mdata.length, mac);
				int res5 = Ddi.ddi_dukpt_get_mac((byte) 0, 7, 0, 0, mdata, mdata.length - 1, mac);
				int res6 = Ddi.ddi_dukpt_get_mac((byte) 0, 7, 0, 0, mdata2, mdata2.length, mac);
				if (res3 == -6 && res5 == -6 && res6 == -6) {
					myHandleDeal("���Գɹ�", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("�ر��豸�ɹ�", res4);
					} else {
						myHandleDeal("DukptMAC15�ر��豸ʧ��", res4);
					}
				} else {
					myHandleDeal("DukptMAC15����ʧ��" + res3 + res5 + res6, res3);
				}
			} else {
				myHandleDeal("DukptMAC15��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptMAC15���豸ʧ��", res1);
		}

	}

	private void testDukptMAC16() {
		myHandleDeal("testDukptMAC16����", 0);
		String dataString8 = "3131313131313131";
		byte[] mdata = ByteUtils.hexString2ByteArray(dataString8);
		byte[] mdata2 = ByteUtils.hexString2ByteArray(ParaEntity.dataString2048);
		byte[] mbyte = new byte[8];
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("DukptMAC16���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 8, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("DukptMAC16��ע��Կ�ɹ�", res2);
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
					myHandleDeal("DukptMAC16����MAC�ɹ�", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("DukptMAC16�ر��豸�ɹ�", res4);
					} else {
						myHandleDeal("DukptMAC16�ر��豸ʧ��", res4);
					}
				} else {
					myHandleDeal("DukptMAC16����MACʧ��" + res3 + res5 + res6 + res7 + res8 + res9 + res10, res3);
				}
			} else {
				myHandleDeal("DukptMAC16��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptMAC16���豸ʧ��", res1);
		}
	}

	private void testDukptMAC17() {
		myHandleDeal("testDukptMAC17����", 0);
		String dataString8 = "3131313131313131";
		byte[] mdata = ByteUtils.hexString2ByteArray(dataString8);
		byte[] mdata2 = ByteUtils.hexString2ByteArray(ParaEntity.dataString512);
		byte[] mbyte = new byte[512];
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 8, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res3 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 5, 1, mdata, mdata.length, mac);
				int res5 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 0, 1, mdata2, mdata2.length, mbyte);
				int res6 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 1, 0, mdata2, mdata2.length, mbyte);
				int res7 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 2, 1, mdata2, mdata2.length, mbyte);
				int res8 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 3, 0, mdata2, mdata2.length, mbyte);
				int res9 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 4, 1, mdata2, mdata2.length, mbyte);
				int res10 = Ddi.ddi_dukpt_get_mac((byte) 1, 8, 5, 0, mdata2, mdata2.length, mbyte);
				String str = ByteUtils.byteArray2HexString(mac);
				if (res3 == 0 && res5 == 0 && res6 == 0 && res7 == 0 && res8 == 0 && res9 == 0 && res10 == 0) {
					myHandleDeal("����MAC�ɹ�", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("�ر��豸�ɹ�", res4);
					} else {
						myHandleDeal("DukptMAC17�ر��豸ʧ��", res4);
					}
				} else {
					myHandleDeal("DukptMAC17����MACʧ��" + res3 + res5 + res6 + res7 + res8 + res9 + res10, res3);
				}
			} else {
				myHandleDeal("DukptMAC17��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptMAC17���豸ʧ��", res1);
		}
	}

	private void testDukptMAC18() {
		myHandleDeal("testDukptMAC18����", 0);
		
		Runnable runnable = new Runnable() {
			public void run() {
				int res1 = Ddi.ddi_dukpt_open();
				if (res1 == 0) {
					myHandleDeal("���豸�ɹ�", res1);
					for (int i = 0; i < 2; i++) {
						for (int j = 0; j < 10; j++) {
							int res2 = Ddi.ddi_dukpt_inject((byte) i, (byte) j, 1, m_initkey, (byte) 0x10, m_initksn,
									(byte) 0xa);
							if (res2 == 0) {
								myHandleDeal("��" + i + "��" + "��" + j + "����ע��ɹ�", res2);
								int res3 = Ddi.ddi_dukpt_get_mac((byte) i, j, 0, 0, m_plain1, m_plain1.length, mac);
								if (res3 == 00) {
									myHandleDeal("��" + i + "��" + "��" + j + "����getmac�ɹ�", res3);
								} else {
									myHandleDeal("��" + i + "��" + "��" + j + "����getmacʧ��", res3);

								}
							}

						}

					}

					int res2 = Ddi.ddi_dukpt_inject((byte) 0x00, (byte) 0x00, 1, m_initkey, (byte) 0x10, m_initksn,
							(byte) 0xa);
					if (res2 == 0) {
						myHandleDeal("��ע��Կ�ɹ�", res2);
						int res3 = Ddi.ddi_dukpt_close();
						if (res3 == 0) {
							myHandleDeal("�ر��豸�ɹ�", res3);
						} else {
							myHandleDeal("DukptMAC18�ر��豸ʧ��", res3);
						}
					} else {
						myHandleDeal("DukptMAC18��ע��Կʧ��", res2);
					}
				} else {
					myHandleDeal("DukptMAC18���豸ʧ��", res1);
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

	// ������Կ����ӿ�(DES,SM4,AES)��DUKPT���ݼ��ܼ�MAC�������������������ݳ����޸�Ϊ2048;
	// DukptMAC��BDK������� ECB2��
	private void testDukptMAC19() {
		myHandleDeal("testDukptMAC19����", 0);
		String data = "0A820DD67DC24B89";
		byte[] hexString2ByteArray = ByteUtils.hexString2ByteArray(ParaEntity.dataString2048);
		byte[] MACbyte = new byte[8];
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("DukptMAC19���豸�ɹ�", res1);
			// 2=BDK 1=IPEK
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 0, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("DukptMAC19��ע��Կ�ɹ�", res2);
				// �����=0 ���հ�=1
				int res3 = Ddi.ddi_dukpt_get_mac((byte) 0, 0, 1, 0, hexString2ByteArray, hexString2ByteArray.length,
						MACbyte);
				String str = ByteUtils.byteArray2HexString(MACbyte);
//				Log.v("TAG", str);
				if (res3 == 0 && str.equalsIgnoreCase(data)) {
					myHandleDeal("DukptMAC19����MAC�ɹ�", res3);
				} else {
					myHandleDeal("DukptMAC19����MACʧ��" + str, res3);
				}
			} else {
				myHandleDeal("DukptMAC19��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptMAC19���豸ʧ��", res1);
		}

		int res4 = Ddi.ddi_dukpt_close();
		if (res4 == 0) {
			myHandleDeal("DukptMAC19�ر��豸�ɹ�", res4);
		} else {
			myHandleDeal("DukptMAC19�ر��豸ʧ��", res4);
		}
	}

	// ������Կ����ӿ�(DES,SM4,AES)��DUKPT���ݼ��ܼ�MAC�������������������ݳ����޸�Ϊ2048;
	// DukptMAC��BDK������� ECB2��
	private void testDukptMAC21() {
		Thread MAC21 = new Thread( new Runnable() {
			public void run() {
		for (int i = 0; i < 200; i++) {
			myHandleDeal("testDukptMAC21����", 0);
			final String data = "0A820DD67DC24B89";
			final byte[] hexString2ByteArray = ByteUtils
					.hexString2ByteArray(paraEntity.get2048(paraEntity.dataString2048));
			final byte[] MACbyte = new byte[8];
			int res1 = Ddi.ddi_dukpt_open();
			if (res1 == 0) {
				myHandleDeal("DukptMAC21���豸�ɹ�" + i, res1);
				// 2=BDK 1=IPEK
				int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 0, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
				if (res2 == 0) {
					myHandleDeal("DukptMAC21��ע��Կ�ɹ�" + i, res2);
					// �����=0 ���հ�=1
					int res3 = Ddi.ddi_dukpt_get_mac((byte) 0, 0, 1, 0, hexString2ByteArray, hexString2ByteArray.length,
							MACbyte);
					String str = ByteUtils.byteArray2HexString(MACbyte);
					// Log.v("TAG", str);
					if (res3 == 0 && str.equalsIgnoreCase(data)) {
						myHandleDeal("DukptMAC21����MAC�ɹ�" + i, res3);
					} else {
						myHandleDeal("DukptMAC21����MACʧ��" + i, res3);
					}
				} else {
					myHandleDeal("DukptMAC21��ע��Կʧ��" + i, res2);
				}
			} else {
				myHandleDeal("DukptMAC21���豸ʧ��" + i, res1);
			}
			int res4 = Ddi.ddi_dukpt_close();
			if (res4 == 0) {
				myHandleDeal("DukptMAC21�ر��豸�ɹ�" + i, res4);
			} else {
				myHandleDeal("DukptMAC21�ر��豸ʧ��" + i, res4);
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
		myHandleDeal("testDukptMAC22����", 0);
//		String dataString8="3131313131313131";
//		byte[] mdata = ByteUtils.hexString2ByteArray(dataString8);
		byte[] mdata2 = ByteUtils.hexString2ByteArray(ParaEntity.dataString2048);
		byte[] mbyte = new byte[8];
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("DukptMAC22���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 8, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("DukptMAC22��ע��Կ�ɹ�", res2);
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
					myHandleDeal("DukptMAC22����MAC�ɹ�", res5);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("DukptMAC22�ر��豸�ɹ�", res4);
					} else {
						myHandleDeal("DukptMAC22�ر��豸ʧ��", res4);
					}
				} else {
					myHandleDeal("DukptMAC22����MACʧ��" + res5 + res6 + res7 + res8 + res9 + res10, res5);
				}
			} else {
				myHandleDeal("DukptMAC22��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptMAC22���豸ʧ��", res1);
		}
	}

	private void testDukptMAC23() {
		myHandleDeal("testDukptMAC23����", 0);
		String dataString8 = "3131313131313131";
		byte[] mdata = ByteUtils.hexString2ByteArray(dataString8);
		byte[] mdata2 = ByteUtils.hexString2ByteArray(ParaEntity.dataString2048);
		byte[] mbyte = new byte[8];
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("DukptMAC23���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 8, 1, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("DukptMAC23��ע��Կ�ɹ�", res2);
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
					myHandleDeal("DukptMAC23����MAC�ɹ�", res3);
					int res4 = Ddi.ddi_dukpt_close();
					if (res4 == 0) {
						myHandleDeal("DukptMAC23�ر��豸�ɹ�", res4);
					} else {
						myHandleDeal("DukptMAC23�ر��豸ʧ��", res4);
					}
				} else {
					myHandleDeal("DukptMAC23����MACʧ��" + res3 + res5 + res6 + res7 + res8 + res9 + res10, res3);
				}
			} else {
				myHandleDeal("DukptMAC23��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptMAC23���豸ʧ��", res1);
		}
	}

	// ������Կ����ӿ�(DES,SM4,AES)��DUKPT���ݼ��ܼ�MAC�������������������ݳ����޸�Ϊ2048;
	// DukptMAC��BDK������� ECB2��
	private void testDukptMAC20() {
		myHandleDeal("testDukptMAC20����", 0);
		String data = "0A820DD67DC24B89";
		byte[] hexString2ByteArray = ByteUtils.hexString2ByteArray(ParaEntity.dataString2056);
		byte[] MACbyte = new byte[8];
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("DukptMAC20���豸�ɹ�", res1);
			// 2=BDK 1=IPEK
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 6, 2, m_initkey1, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("DukptMAC20��ע��Կ�ɹ�", res2);
				// �����=0 ���հ�=1
				int res3 = Ddi.ddi_dukpt_get_mac((byte) 0, 6, 1, 0, hexString2ByteArray, hexString2ByteArray.length,
						MACbyte);
//				String str = ByteUtils.byteArray2HexString(MACbyte);
//				Log.v("TAG", str);
				if (res3 == -6) {
					myHandleDeal("DukptMAC20����MAC�ɹ�", res3);
				} else {
					myHandleDeal("DukptMAC20����MACʧ��", res3);
				}
			} else {
				myHandleDeal("DukptMAC20��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptMAC20���豸ʧ��", res1);
		}

		int res4 = Ddi.ddi_dukpt_close();
		if (res4 == 0) {
			myHandleDeal("DukptMA20�ر��豸�ɹ�", res4);
		} else {
			myHandleDeal("DukptMAC20�ر��豸ʧ��", res4);
		}
	}

	private void testDukptKsn1() {
		myHandleDeal("testDukptKsn1����", 0);
		String data = "31313131313131200002";
		byte[] m_initkey = ByteUtils.hexString2ByteArray(ParaEntity.initkey1);
		byte[] m_initksn = ByteUtils.hexString2ByteArray(ParaEntity.initksn1);
//		byte[]m_initkey = ByteUtils.hexString2ByteArray("0123456789ABCDEFFEDCBA9876543210");
//		byte[]m_initksn = ByteUtils.hexString2ByteArray("FFFF9876543210E00001");
		byte[] ksn = new byte[10];
		int[] ksnlen = new int[1];
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 6, 2, m_initkey, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res3 = Ddi.ddi_dukpt_add_ksncnt(1, 6, (byte) 1);
				if (res3 == 0) {
					myHandleDeal("�����Լӳɹ�", res3);
					int res4 = Ddi.ddi_dukpt_getksn(1, 6, ksnlen, ksn);
					String str = ByteUtils.byteArray2HexString(ksn);
					if (res4 == 0 && str.equals(data)) {
						myHandleDeal("�Լӳɹ�", res4);
						int res5 = Ddi.ddi_dukpt_close();
						if (res5 == 0) {
							myHandleDeal("�ر��豸�ɹ�", res5);
						} else {
							myHandleDeal("DukptKsn1�ر��豸ʧ��" + str, res5);
						}
					} else {
						myHandleDeal("DukptKsn1�Լ�ʧ��" + str, res4);
					}

				} else {
					myHandleDeal("DukptKsn1�����Լ�ʧ��", res3);
				}
			} else {
				myHandleDeal("DukptKsn1��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptKsn1���豸ʧ��", res1);
		}
	}

	private void testDukptKsn2() {
		myHandleDeal("testDukptKsn2����", 0);
		String data = "3131313131313120000b";
		byte[] m_initkey = ByteUtils.hexString2ByteArray(ParaEntity.initkey1);
		byte[] m_initksn = ByteUtils.hexString2ByteArray(ParaEntity.initksn1);
		byte[] ksn = new byte[10];
		int[] ksnlen = new int[1];
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 6, 2, m_initkey, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res3 = Ddi.ddi_dukpt_add_ksncnt(0, 6, (byte) 10);
				if (res3 == 0) {
					myHandleDeal("�����Լӳɹ�", res3);
					int res4 = Ddi.ddi_dukpt_getksn(0, 6, ksnlen, ksn);
					String str = ByteUtils.byteArray2HexString(ksn);
					if (res4 == 0 && str.equals(data)) {
						myHandleDeal("�Լӳɹ�", res4);
						int res5 = Ddi.ddi_dukpt_close();
						if (res5 == 0) {
							myHandleDeal("�ر��豸�ɹ�", res5);
						} else {
							myHandleDeal("DukptKsn2�ر��豸ʧ��", res5);
						}
					} else {
						myHandleDeal("DukptKsn2�Լ�ʧ��"+str, res4);
					}

				} else {
					myHandleDeal("DukptKsn2�����Լ�ʧ��", res3);
				}
			} else {
				myHandleDeal("DukptKsn2��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptKsn2���豸ʧ��", res1);
		}
	}

	private void testDukptKsn3() {
		myHandleDeal("testDukptKsn3����", 0);
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
					myHandleDeal("���豸�ɹ�", res1);
					int res2 = Ddi.ddi_dukpt_inject((byte) 0, (byte) 6, 2, m_initkey, (byte) 0x10, m_initksn,
							(byte) 0xa);
					if (res2 == 0) {
						myHandleDeal("��ע��Կ�ɹ�", res2);
						int res3 = Ddi.ddi_dukpt_add_ksncnt(0, 6, (byte) 0);
						int res6 = Ddi.ddi_dukpt_add_ksncnt(0, 4, (byte) 1);
						if (res3 == -6 && res6 == 0) {
							myHandleDeal("�����Լӳɹ�", res3);
							int res4 = Ddi.ddi_dukpt_getksn(0, 4, ksnlen, ksn);
							String str = ByteUtils.byteArray2HexString(ksn);
							if (res4 == 0) {
								myHandleDeal("�Լӳɹ�", res4);
								int res5 = Ddi.ddi_dukpt_close();
								if (res5 == 0) {
									myHandleDeal("�ر��豸�ɹ�", res5);
								} else {
									myHandleDeal("DukptKsn3�ر��豸ʧ��", res5);
								}
							} else {
								myHandleDeal("DukptKsn3�Լ�ʧ��", res4);
							}

						} else {
							myHandleDeal("DukptKsn3�����Լ�ʧ��" + res6, res3);
						}
					} else {
						myHandleDeal("DukptKsn3��ע��Կʧ��", res2);
					}
				} else {
					myHandleDeal("DukptKsn3���豸ʧ��", res1);
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
		myHandleDeal("testDukptKsn4����", 0);
		String data = "31313131313131200002";
		byte[] m_initkey = ByteUtils.hexString2ByteArray(ParaEntity.initkey1);
		byte[] m_initksn = ByteUtils.hexString2ByteArray(ParaEntity.initksn1);
		byte[] ksn = new byte[10];
		int[] ksnlen = new int[1];
		int res1 = Ddi.ddi_dukpt_open();
		if (res1 == 0) {
			myHandleDeal("���豸�ɹ�", res1);
			int res2 = Ddi.ddi_dukpt_inject((byte) 1, (byte) 6, 1, m_initkey, (byte) 0x10, m_initksn, (byte) 0xa);
			if (res2 == 0) {
				myHandleDeal("��ע��Կ�ɹ�", res2);
				int res3 = Ddi.ddi_dukpt_add_ksncnt(1, 6, (byte) 1);
				myHandleDeal("��ע��Կ�ɹ�" + res3, res2);
				long begin = System.currentTimeMillis();
				for (int i = 0; i < 500; i++) {
					int res4 = Ddi.ddi_dukpt_add_ksncnt(1, 6, (byte) 1);
				}
				long end = System.currentTimeMillis();
				long current = end - begin;
				myHandleDeal("DUKPTECB ע����Կ��ʱ" + current + "��", 0);

			} else {
				myHandleDeal("DukptKsn1��ע��Կʧ��", res2);
			}
		} else {
			myHandleDeal("DukptKsn1���豸ʧ��", res1);
		}
	}

	private void testDukptKsn5() {
		myHandleDeal("testDukptKsn5����", 0);
		final byte[] ksn = new byte[10];
		final int[] ksnlen = new int[1];
		Runnable runnable = new Runnable() {
			public void run() {
				int res1 = Ddi.ddi_dukpt_open();
				if (res1 == 0) {
					myHandleDeal("���豸�ɹ�", res1);
					for (int i = 0; i < 2; i++) {
						for (int j = 0; j < 10; j++) {
							int res2 = Ddi.ddi_dukpt_inject((byte) i, (byte) j, 1, m_initkey, (byte) 0x10, m_initksn,
									(byte) 0xa);
							if (res2 == 0) {
								myHandleDeal("��" + i + "��" + "��" + j + "����ע��ɹ�", res2);
								int res3 = Ddi.ddi_dukpt_add_ksncnt(i, j, (byte) 1);
								if (res3 == 0) {
									myHandleDeal("��" + i + "��" + "��" + j + "�����Լӳɹ�", res3);
									int res4 = Ddi.ddi_dukpt_getksn(i, j, ksnlen, ksn);
									if (res4 == 0) {
										myHandleDeal("��" + i + "��" + "��" + j + "������ȡ�ɹ�", res4);

									} else {
										myHandleDeal("��" + i + "��" + "��" + j + "������ȡʧ��", res4);

									}
								} else {
									myHandleDeal("��" + i + "��" + "��" + j + "�����Լ�ʧ��", res3);
								}

							}

						}

					}

					int res2 = Ddi.ddi_dukpt_inject((byte) 0x00, (byte) 0x00, 1, m_initkey, (byte) 0x10, m_initksn,
							(byte) 0xa);
					if (res2 == 0) {
						myHandleDeal("DukptKsn5��ע��Կ�ɹ�", res2);
						int res3 = Ddi.ddi_dukpt_close();
						if (res3 == 0) {
							myHandleDeal("DukptKsn5�ر��豸�ɹ�", res3);
						} else {
							myHandleDeal("DukptKsn5�ر��豸ʧ��", res3);
						}
					} else {
						myHandleDeal("DukptKsn5��ע��Կʧ��", res2);
					}
				} else {
					myHandleDeal("DukptKsn5���豸ʧ��", res1);
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
		myHandleDeal("testDukptgroup����", 0);
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
					myHandleDeal("���Գɹ�", res1);
				} else {
					myHandleDeal("Dukptgroup����ʧ��" + res1, 1);
				}
				int res2 = Ddi.ddi_dukpt_get_pin((byte) 0, 4, 0, m_panblock, pinblock);
				if (res2 == -6) {
					myHandleDeal("���Գɹ�", res2);
				} else {
					myHandleDeal("Dukptgroup����ʧ��" + res2, 2);
				}
				int res3 = Ddi.ddi_dukpt_get_mac((byte) 0, 4, 0, 0, m_plain, m_plain.length, mac);
				if (res3 == 0) {
					myHandleDeal("���Գɹ�", res3);
				} else {
					myHandleDeal("Dukptgroup����ʧ��" + res3, 3);
				}
				int res4 = Ddi.ddi_dukpt_add_ksncnt(0, 4, (byte) 1);
				if (res4 == 0) {
					myHandleDeal("���Գɹ�", res4);
				} else {
					myHandleDeal("Dukptgroup����ʧ��" + res4, 4);
				}
				int res5 = Ddi.ddi_dukpt_getksn(0, 4, ksnlen, ksn);
				if (res5 == 0) {
					myHandleDeal("���Գɹ�", res5);
				} else {
					myHandleDeal("Dukptgroup����ʧ��" + res5, 5);
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
		myHandleDeal("runall���Խ���", 0);
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Thflg = false;
	}
}
