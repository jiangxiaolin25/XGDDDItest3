package com.xinguodu.cts;

import java.io.File;
import java.io.UnsupportedEncodingException;

import com.xinguodu.ddiinterface.Ddi;
import com.xinguodu.ddiinterface2.Ddi_BT;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Bitmap.Config;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.ActivityCompat;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;
import tools.testtoolclass;

public class PrintActivity extends Activity {
	Ddi Ddi = new Ddi();
	private TextView tv;
	private TextView tv1;
	private Button bt1;
	private Spinner spinner;
	private ScrollView scrollView;
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
	Ddi_BT ddi_bt = new Ddi_BT();
	private Bitmap mBitmap;
	private Canvas canvas;
	byte[] srtbyte = null;
	byte[] lpOut = new byte[20];
	int nType = 0;
	String str = "";
	String storageDir;
	byte[] s6 = null;
	byte[] s5 = null;
	byte[] s4 = null;
	byte[] s3 = null;
	byte[] s2 = null;
	byte[] s1 = null;
	byte[] s7 = null;
	byte[] s8 = null;
	byte[] s9 = null;
	byte[] s10 = null;
	byte[] s11 = null;
	byte[] s12 = null;
	byte[] s13 = null;
	byte[] s14 = null;
	byte[] s15 = null;
	byte[] s16 = null;

	private Thread mThread = new Thread(new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			while (Thflg) {
				if (Btflg) {
					testthmprntext1();
					testthmprntext2();
					testthmprntext3();
					testthmprntext4();
					testthmprntext5();
					testthmprntext6();
					testthmprntext7();
					testthmprntext8();
					testthmprntext9();
					testthmprntext10();
					testthmprntext11();
					testthmprntext12();
					testthmprntext13();
					testthmprntext14();
					testthmprntext15();
					testthmprntext16();
					testthmprntext17();
					testthmprntext18();
					testthmprntext19();
					testthmprntext20();
					testthmprntext21();
					testthmprntext22();
					testthmprntext23();
					testthmprntext24();
					testthmprn1();
					testthmprn2();
					testthmprn3();
					testthmprn4();
					testthmprn5();
					testthmprn6();
					testthmprn7();
					testthmprn8();
					testthmprn9();
					testthmprn10();
					testthmprn12();
					testthmprn13();
					testthmprn14();
					testthmprn15();
					testthmprn16();
					testthmprn17();
					testthmprn18();
					testthmprn19();
					testthmprn20();
					testthmprn21();
					testthmprn22();
					testthmprn23();
					testthmprn24();
					testthmprn25();
					testthmprn26();
					testthmprn27();
					testthmprn28();
					testthmprn29();
					testthmprn30();
					Runnable runnable = new Runnable() {
						public void run() {
							testthmprnys1();
							testthmprnys2();
							testthmprnys3();
							testthmprnys4();
							testthmprnys5();
							testthmprnys6();
							testthmprnys7();
							testthmprnys8();
							testthmprnys9();
							testthmprnys10();
							testthmprnys12();
							testthmprnys13();
							testthmprnys14();
							testthmprnys15();
							testthmprnys16();
							testthmprnys17();
							testthmprnys18();
							testthmprnys19();
							testthmprnys20();
							testthmprnys21();
							testthmprnys22();
							testthmprnys23();
							testthmprnys24();
							testthmprnys25();
							testthmprnys26();
							testthmprnys27();
							testthmprnys28();
							testthmprnys29();
							testthmprnys30();
							testthmprnys31();
							testthmprnys32();
							testthmprnys33();
							testthmprnys34();
							testthmprnys35();
							testthmprnys36();
							testthmprnys37();
							testthmprnys38();
							testthmprnys39();
							testprintpress1();
							testprintpress2();
							testthmprntextft1();
							testthmprntext25();
							testthmprn31();
							testprintpress3();
							testprintpress5();
							testprintpress6();
							testprintpress7();
							testprintpress8();
							testprnt1();
						}
					};
					Thread name = new Thread(runnable);
					try {
						name.join();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					name.start();
					
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
					Failcount++;
					tv1.append("   " + infoString + "\n");
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

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);// 去掉标题栏
		setContentView(R.layout.activity_print);
		verifyStoragePermissions(this);
		Ddi.ddi_ddi_sys_init();
		storageDir = Environment.getExternalStorageDirectory().toString();
		Log.v("111111", storageDir);
		initview();
		mThread.start();
		run();
	}

	private static final int REQUEST_EXTERNAL_STORAGE = 1;
	private static String[] PERMISSIONS_STORAGE = { Manifest.permission.READ_EXTERNAL_STORAGE,
			Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.MOUNT_UNMOUNT_FILESYSTEMS };

	public static void verifyStoragePermissions(Activity activity) {
		int permission = ActivityCompat.checkSelfPermission(activity, Manifest.permission.WRITE_EXTERNAL_STORAGE);

		if (permission != PackageManager.PERMISSION_GRANTED) {
			ActivityCompat.requestPermissions(activity, PERMISSIONS_STORAGE, REQUEST_EXTERNAL_STORAGE);
		}
	}

//	public static void verifyStoragePermissions(Activity activity) {
//        int permission = ActivityCompat.checkSelfPermission(activity,Manifest.permission.ACCESS_FINE_LOCATION);
// 
//        if (permission != PackageManager.PERMISSION_GRANTED) {
//            ActivityCompat.checkSelfPermission(activity, PERMISSIONS_STORAGE,REQUEST_EXTERNAL_STORAGE);
//        }
//    }

	private void initview() {
		tv = (TextView) findViewById(R.id.printtv);
		tv1 = (TextView) findViewById(R.id.printtv1);
		bt1 = (Button) findViewById(R.id.printbt1);
		spinner = (Spinner) findViewById(R.id.printspinner);
		scrollView = (ScrollView) findViewById(R.id.printscrollView);
		mTotalTextView = (TextView) findViewById(R.id.printtext_total);
		mSucessTextView = (TextView) findViewById(R.id.printtext_sucess);
		mFailTextView = (TextView) findViewById(R.id.printtext_fail);
		mSucessRateTextView = (TextView) findViewById(R.id.printtext_sucess_rate);
	}

	private void run() {
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
						testthmprntext1();
						break;
					case 2:
						testthmprntext2();
						break;
					case 3:
						testthmprntext3();
						break;
					case 4:
						testthmprntext4();
						break;
					case 5:
						testthmprntext5();
						break;
					case 6:
						testthmprntext6();
						break;
					case 7:
						testthmprntext7();
						break;
					case 8:
						testthmprntext8();
						break;
					case 9:
						testthmprntext9();
						break;
					case 10:
						testthmprntext10();
						break;
					case 11:
						testthmprntext11();
						break;
					case 12:
						testthmprntext12();
						break;
					case 13:
						testthmprntext13();
						break;
					case 14:
						testthmprntext14();
						break;
					case 15:
						testthmprntext15();
						break;
					case 16:
						testthmprntext16();
						break;
					case 17:
						testthmprntext17();
						break;
					case 18:
						testthmprntext18();
						break;
					case 19:
						testthmprntext19();
						break;
					case 20:
						testthmprntext20();
						break;
					case 21:
						testthmprntext21();
						break;
					case 22:
						testthmprntext22();
						break;
					case 23:
						testthmprntext23();
						break;
					case 24:
						testthmprntext24();
						break;
					case 25:
						testthmprn1();
						break;
					case 26:
						testthmprn2();
						break;
					case 27:
						testthmprn3();
						break;
					case 28:
						testthmprn4();
						break;
					case 29:
						testthmprn5();
						break;
					case 30:
						testthmprn6();
						break;
					case 31:
						testthmprn7();
						break;
					case 32:
						testthmprn8();
						break;
					case 33:
						testthmprn9();
						break;
					case 34:
						testthmprn10();
						break;
					case 35:
						testthmprn11();
						break;
					case 36:
						testthmprn12();
						break;
					case 37:
						testthmprn13();
						break;
					case 38:
						testthmprn14();
						break;
					case 39:
						testthmprn15();
						break;
					case 40:
						testthmprn16();
						break;
					case 41:
						testthmprn17();
						break;
					case 42:
						testthmprn18();
						break;
					case 43:
						testthmprn19();
						break;
					case 44:
						testthmprn20();
						break;
					case 45:
						testthmprn21();
						break;
					case 46:
						testthmprn22();
						break;
					case 47:
						testthmprn23();
						break;
					case 48:
						testthmprn24();
						break;
					case 49:
						testthmprn25();
						break;
					case 50:
						testthmprn26();
						break;
					case 51:
						testthmprn27();
						break;
					case 52:
						testthmprn28();
						break;
					case 53:
						testthmprn29();
						break;
					case 54:
						testthmprn30();
						break;
					case 55:
						testthmprnys1();
						break;
					case 56:
						testthmprnys2();
						break;
					case 57:
						testthmprnys3();
						break;
					case 58:
						testthmprnys4();
						break;
					case 59:
						testthmprnys5();
						break;
					case 60:
						testthmprnys6();
						break;
					case 61:
						testthmprnys7();
						break;
					case 62:
						testthmprnys8();
						break;
					case 63:
						testthmprnys9();
						break;
					case 64:
						testthmprnys10();
						break;
					case 65:
						testthmprnys11();
						break;
					case 66:
						testthmprnys12();
						break;
					case 67:
						testthmprnys13();
						break;
					case 68:
						testthmprnys14();
						break;
					case 69:
						testthmprnys15();
						break;
					case 70:
						testthmprnys16();
						break;
					case 71:
						testthmprnys17();
						break;
					case 72:
						testthmprnys18();
						break;
					case 73:
						testthmprnys19();
						break;
					case 74:
						testthmprnys20();
						break;
					case 75:
						testthmprnys21();
						break;
					case 76:
						testthmprnys22();
						break;
					case 77:
						testthmprnys23();
						break;
					case 78:
						testthmprnys24();
						break;
					case 79:
						testthmprnys25();
						break;
					case 80:
						testthmprnys26();
						break;
					case 81:
						testthmprnys27();
						break;
					case 82:
						testthmprnys28();
						break;
					case 83:
						testthmprnys29();
						break;
					case 84:
						testthmprnys30();
						break;
					case 85:
						testthmprnys31();
						break;
					case 86:
						testthmprnys32();
						break;
					case 87:
						testthmprnys33();
						break;
					case 88:
						testthmprnys34();
						break;
					case 89:
						testthmprnys35();
						break;
					case 90:
						testthmprnys36();
						break;
					case 91:
						testthmprnys37();
						break;
					case 92:
						testthmprnys38();
						break;
					case 93:
						testthmprnys39();
						break;
					case 94:
						testthmprnys40();
						break;
					case 95:
						testprintpress1();
						break;
					case 96:
						testprintpress2();
						break;
					case 97:
						testthmprntextft1();
						break;
					case 98:
						testthmprntext25();
						break;
					case 99:
						testprintpress3();
						break;
					case 100:
						testprnt1();
						break;
					case 101:
						testprnt2();
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
	
	private void testprnt1() {
		myHandleDeal("testReadsn1测试", 0);
		for (int i = 0; i < 500; i++) {
			int res1 = Ddi.ddi_thmprn_open();
//			String data = ByteUtils.asciiByteArray2String(lpOut);
			if (res1 == 0) {
				myHandleDeal("prn1测试成功:"+i , res1);
			} else {
				myHandleDeal("prn1测试失败"+i, res1);
			}
			int res = Ddi.ddi_thmprn_close();
			//		String data = ByteUtils.asciiByteArray2String(lpOut);
			if (res == 0) {
				myHandleDeal("prn1测试成功1:"+i, res);
			} else {
				myHandleDeal("prn1测试失败1"+i, res);
			} 
		}
	}
	
	private void testprnt2() {
		myHandleDeal("testReadsn2测试", 0);
		int res1 = Ddi.ddi_thmprn_open();
//		String data = ByteUtils.asciiByteArray2String(lpOut);
		if (res1 == 0) {
			myHandleDeal("prn1测试成功:" , res1);
		} else {
			myHandleDeal("prn1测试失败", res1);
		}
		
			int res = Ddi.ddi_thmprn_feed_paper(10);
			//		String data = ByteUtils.asciiByteArray2String(lpOut);
			if (res == 0) {
				myHandleDeal("prn1测试成功2:", res);
			} else {
				myHandleDeal("prn1测试失败2", res);
			} 
			int res2 = Ddi.ddi_thmprn_back_paper(10);
			//		String data = ByteUtils.asciiByteArray2String(lpOut);
			if (res2 == 0) {
				myHandleDeal("prn1测试成功2:", res2);
			} else {
				myHandleDeal("prn1测试失败2", res2);
			} 
	}

	/**
	 * 字体打印
	 */
	private void testthmprntext1() {
		myHandleDeal("testthmprntext1测试", 0);
		initImage(100);
		String s = "点阵o—O_0-0II11Ll";
		drawImage(s, 24, 3, 10, 20);
		String printStr2 = storageDir + "/bitmap/test.jpg";
		Log.v("111111", printStr2);
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("点阵打印返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
			} else {
				myHandleDeal("thmprntext1点阵打印返回失败", res);
			}
		} else {
			myHandleDeal("thmprntext1文件创建失败", 1);
		}
	}

	private void testthmprntext2() {
		myHandleDeal("testthmprntext2测试", 0);
		initImage(1000);
		String printStr1 = storageDir + "/PicBMP/ylsw.bmp";
		Bitmap bitmap1 = BitmapFactory.decodeFile(printStr1);
		canvas.drawBitmap(bitmap1, 0, 20, null);
		drawImage("-----------点阵字库-------------", 22, 3, 10, 95);
		drawImage("商户名(MERCHANT NAME): 新国都", 24, 3, 10, 120);
		drawImage("商户编号(MERCHANT NO.): 124456", 24, 3, 10, 150);
		drawImage("终端编号(TERMINAL NO.): 124456", 24, 3, 10, 180);
		drawImage("操作员号(OPERATOR NO.): 01", 24, 3, 10, 210);
		drawImage("发卡行(ISSUER): 工商银行", 24, 3, 10, 240);
		drawImage("收单行(ACQUIRER): 华夏银行", 24, 3, 10, 270);
		drawImage("卡号(CARD NO.):", 24, 3, 10, 300);
		drawImage(" 621792******3292", 30, 4, 10, 325);
		drawImage(" 621792******3292", 30, 4, 11, 325);
		drawImage("有效期(EXP DATE): 2017/06", 24, 3, 10, 360);
		drawImage("交易类型(TRAN TYPE):", 24, 3, 10, 390);
		drawImage(" 消费/SALE(C)", 30, 4, 10, 415);
		drawImage(" 消费/SALE(C)", 30, 4, 11, 415);
		drawImage("批次号(BATCH NO.): 000024", 24, 3, 10, 450);
		drawImage("凭证号(VOUCHER NO.): 000003", 24, 3, 10, 480);
		drawImage("授权码(AUTH NO.): 124456", 24, 3, 10, 510);
		drawImage("参考号(REFER NO.): 210031895667", 24, 3, 10, 540);
		drawImage("日期/时间(DATE/TIME):", 24, 3, 10, 570);
		drawImage(" 2017-06-14", 24, 3, 10, 600);
		drawImage("金额(AMOUNT):", 24, 3, 10, 630);
		drawImage(" RMB 0.01:", 30, 6, 10, 655);
		drawImage(" RMB 0.01:", 30, 6, 11, 655);
		drawImage("-------------------------------", 24, 3, 10, 690);
		drawImage("备注(REFERENCE)", 24, 3, 10, 720);
		drawImage("AID: A000000333010101", 24, 3, 10, 750);
		drawImage("ARQC: C9BF4290B898976D", 24, 3, 10, 780);
		drawImage("交易金额未超过300.00元，无需签名", 23, 3, 10, 810);
		drawImage("交易金额未超过300.00元，无需签名", 23, 3, 11, 810);
		drawImage("商户存根    MERCHANT", 24, 3, 10, 840);
		String printStr2 = storageDir + "/bitmap/test.jpg";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("点阵打印返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
			} else {
				myHandleDeal("thmprntext2点阵打印返回失败", 3);
			}
		} else {
			myHandleDeal("thmprntext2文件创建失败", 2);
		}
	}

	// 2019.2.27 繁体点阵打印
	private void testthmprntextft1() {
		myHandleDeal("testthmprntextft测试", 0);
		initImage(1000);
		String printStr1 = storageDir + "/PicBMP/ylsw.bmp";
		Bitmap bitmap1 = BitmapFactory.decodeFile(printStr1);
		canvas.drawBitmap(bitmap1, 0, 20, null);
		drawImage("-----------點陣字庫-------------", 22, 3, 10, 95);
		drawImage("商戶名(MERCHANT NAME): 新國都", 24, 3, 10, 120);
		drawImage("商户编号(MERCHANT NO.): 124456", 24, 3, 10, 150);
		drawImage("商戶編號(MERCHANT NO.): 124456", 24, 3, 10, 180);
		drawImage("操作員號(OPERATOR NO.): 01", 24, 3, 10, 210);
		drawImage("發卡行(ISSUER): 工商銀行", 24, 3, 10, 240);
		drawImage("收單行(ACQUIRER): 華夏銀行", 24, 3, 10, 270);
		drawImage("卡號(CARD NO.):", 24, 3, 10, 300);
		drawImage(" 621792******3292", 30, 4, 10, 325);
		drawImage(" 621792******3292", 30, 4, 11, 325);
		drawImage("有效期(EXP DATE): 2017/06", 24, 3, 10, 360);
		drawImage("交易類型(TRAN TYPE):", 24, 3, 10, 390);
		drawImage(" 消費/SALE(C)", 30, 4, 10, 415);
		drawImage(" 消費/SALE(C)", 30, 4, 11, 415);
		drawImage("批次號(BATCH NO.): 000024", 24, 3, 10, 450);
		drawImage("憑證號(VOUCHER NO.): 000003", 24, 3, 10, 480);
		drawImage("授權碼(AUTH NO.): 124456", 24, 3, 10, 510);
		drawImage("參考號(REFER NO.): 210031895667", 24, 3, 10, 540);
		drawImage("日期/時間(DATE/TIME):", 24, 3, 10, 570);
		drawImage(" 2017-06-14", 24, 3, 10, 600);
		drawImage("金額(AMOUNT):", 24, 3, 10, 630);
		drawImage(" RMB 0.01:", 30, 6, 10, 655);
		drawImage(" RMB 0.01:", 30, 6, 11, 655);
		drawImage("-------------------------------", 24, 3, 10, 690);
		drawImage("備註(REFERENCE)", 24, 3, 10, 720);
		drawImage("AID: A000000333010101", 24, 3, 10, 750);
		drawImage("ARQC: C9BF4290B898976D", 24, 3, 10, 780);
		drawImage("交易金額未超過300.00元，無需簽名", 23, 3, 10, 810);
		drawImage("交易金額未超過300.00元，無需簽名", 23, 3, 11, 810);
		drawImage("商戶存根    MERCHANT", 24, 3, 10, 840);
		String printStr2 = storageDir + "/bitmap/test.jpg";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("点阵打印返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
			} else {
				myHandleDeal("thmprntextft点阵打印返回失败", 3);
			}
		} else {
			myHandleDeal("thmprntextft文件创建失败", 2);
		}
	}

	private void testthmprntext3() {
		myHandleDeal("testthmprntext3测试", 0);
		initImage(100);
		String s = "憑證號(VOUCHER NO.): 000003";
		drawImage2(s, 24, 10, 40);
		String printStr2 = storageDir + "/bitmap/test.jpg";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("矢量打印返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
			} else {
				myHandleDeal("thmprntext3矢量打印返回失败", 2);
			}
		} else {
			myHandleDeal("thmprntext3文件创建失败", 1);
		}
	}

	private void testthmprntext4() {
		myHandleDeal("testthmprntext4测试", 0);
		initImage(1000);
		String printStr1 = storageDir + "/PicBMP/ylsw.bmp";
		Bitmap bitmap1 = BitmapFactory.decodeFile(printStr1);
		canvas.drawBitmap(bitmap1, 0, 20, null);
		drawImage2("-----------矢量字库-------------", 22, 10, 115);
		drawImage2("商户名(MERCHANT NAME): 新国都", 24, 10, 140);
		drawImage2("商户编号(MERCHANT NO.): 124456", 24, 10, 170);
		drawImage2("终端编号(TERMINAL NO.): 124456", 24, 10, 200);
		drawImage2("操作员号(OPERATOR NO.): 01", 24, 10, 230);
		drawImage2("发卡行(ISSUER): 工商银行", 24, 10, 260);
		drawImage2("收单行(ACQUIRER): 华夏银行", 24, 10, 290);
		drawImage2("卡号(CARD NO.):", 24, 10, 310);
		drawImage2(" 621792******3292", 30, 10, 350);
		drawImage2(" 621792******3292", 30, 11, 350);
		drawImage2("有效期(EXP DATE): 2017/06", 24, 10, 380);
		drawImage2("交易类型(TRAN TYPE):", 24, 10, 410);
		drawImage2(" 消费/SALE(C)", 30, 10, 440);
		drawImage2(" 消费/SALE(C)", 30, 11, 440);
		drawImage2("批次号(BATCH NO.): 000024", 24, 10, 470);
		drawImage2("凭证号(VOUCHER NO.): 000003", 24, 10, 500);
		drawImage2("授权码(AUTH NO.): 124456", 24, 10, 530);
		drawImage2("参考号(REFER NO.): 210031895667", 24, 10, 560);
		drawImage2("日期/时间(DATE/TIME):", 24, 10, 590);
		drawImage2(" 2017-06-14", 24, 10, 620);
		drawImage2("金额(AMOUNT):", 24, 10, 650);
		drawImage2(" RMB 0.01:", 30, 10, 680);
		drawImage2(" RMB 0.01:", 30, 11, 680);
		drawImage2("-------------------------------", 24, 10, 710);
		drawImage2("备注(REFERENCE)", 24, 10, 740);
		drawImage2("AID: A000000333010101", 24, 10, 770);
		drawImage2("ARQC: C9BF4290B898976D", 24, 10, 800);
		drawImage2("交易金额未超过300.00元，无需签名", 23, 10, 830);
		drawImage2("交易金额未超过300.00元，无需签名", 23, 11, 830);
		drawImage2("商户存根    MERCHANT", 24, 10, 860);
		String printStr2 = storageDir + "/bitmap/test.jpg";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("矢量打印返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
			} else {
				myHandleDeal("thmprntext4矢量打印返回失败", 2);
			}
		} else {
			myHandleDeal("thmprntext4文件创建失败", 1);
		}
	}

	private void testthmprntext5() {
		myHandleDeal("testthmprntext5测试", 0);
		initImage(400);
		String s = "点阵打印加粗O0Il";
		str = s;
		try {
			srtbyte = str.getBytes("GBK");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		int res1 = ddi_bt.drawdottextblod(mBitmap, srtbyte, 24, 4, 10, 50, 1, 2, 1);
		int res2 = ddi_bt.drawdottextblod(mBitmap, srtbyte, 24, 4, 10, 100, 2, 1, 1);
		int res3 = ddi_bt.drawdottextblod(mBitmap, srtbyte, 24, 4, 10, 150, 1, 1, 1);
		int res4 = ddi_bt.drawdottextblod(mBitmap, srtbyte, 24, 4, 10, 200, 1, 2, 0);
		int res5 = ddi_bt.drawdottextblod(mBitmap, srtbyte, 24, 4, 10, 250, 2, 1, 0);
		int res6 = ddi_bt.drawdottextblod(mBitmap, srtbyte, 24, 4, 10, 300, 1, 1, 0);
		int res7 = ddi_bt.drawdottext(mBitmap, srtbyte, 24, 4, 10, 350, 1, 1);
		if (res1 == 0 && res2 == 0 && res3 == 0 && res4 == 0 && res5 == 0 && res6 == 0 && res7 == 0) {
			myHandleDeal("画图成功", res1);
		} else {
			myHandleDeal("thmprntext5画图失败", 1);
		}
		ByteUtils.saveImage(mBitmap);
		String printStr2 = storageDir + "/bitmap/test.jpg";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("点阵打印返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
			} else {
				myHandleDeal("thmprntext5点阵打印返回失败", 3);
			}
		} else {
			myHandleDeal("thmprntext5文件创建失败", 2);
		}
	}

	// 繁体接口测试
	private void testthmprntext25() {
		myHandleDeal("testthmprntext25测试", 0);
		initImage(400);
		String s = "点阵打印加粗O0Il";
		str = s;
		try {
			srtbyte = str.getBytes("GBK");
			byte[] s6 = "時間額過權碼".getBytes("GBK");
			
			byte[] s5 = "無需簽發單銀".getBytes("GBK");
			byte[] s4 = "號額額碼超過".getBytes("GBK");
			byte[] s3 = "憑證號類消費".getBytes("GBK");
			byte[] s2 = "編號員號授".getBytes("GBK");
			byte[] s1 = "號國參考號".getBytes("GBK");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String printStr1 = storageDir + "/PicBMP/ylsw.bmp";
		Bitmap bitmap1 = BitmapFactory.decodeFile(printStr1);
		canvas.drawBitmap(bitmap1, 0, 20, null);
		int res1 = ddi_bt.drawdottextblod_TW(mBitmap, s1, 24, 4, 10, 50, 1, 2, 1);
		int res2 = ddi_bt.drawdottextblod_TW(mBitmap, s2, 24, 4, 10, 100, 2, 1, 1);
		int res3 = ddi_bt.drawdottextblod_TW(mBitmap, s3, 24, 4, 10, 150, 1, 1, 1);
		int res4 = ddi_bt.drawdottextblod_TW(mBitmap, s4, 24, 4, 10, 200, 1, 2, 0);
		int res5 = ddi_bt.drawdottextblod_TW(mBitmap, s5, 24, 4, 10, 250, 2, 1, 0);
		int res6 = ddi_bt.drawdottextblod_TW(mBitmap, s6, 24, 4, 10, 300, 1, 1, 0);
		int res7 = ddi_bt.drawdottext(mBitmap, srtbyte, 24, 4, 10, 350, 1, 1);
		if (res1 == 0 && res2 == 0 && res3 == 0 && res4 == 0 && res5 == 0 && res6 == 0 && res7 == 0) {
			myHandleDeal("画图成功", res1);
		} else {
			myHandleDeal("thmprntext25画图失败", 1);
		}
		ByteUtils.saveImage(mBitmap);
		String printStr2 = storageDir + "/bitmap/test.jpg";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("点阵打印返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
			} else {
				myHandleDeal("thmprntext25点阵打印返回失败", res);
			}
		} else {
			myHandleDeal("thmprntext25文件创建失败", 2);
		}
	}

	private void testthmprntext6() {
		myHandleDeal("testthmprntext6测试", 0);
		initImage(430);
		String s = "矢量字库倍宽O0Il";
		str = s;
		try {
			srtbyte = str.getBytes("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String S = "/system/fonts/NotoSansHans-Light_new.ttf";
		int res1 = ddi_bt.setfont(S, S.length());
		int res2 = ddi_bt.drawIntoBitmapDouble(mBitmap, srtbyte, 24, 10, 50, 1, 2, 1);
		int res3 = ddi_bt.drawIntoBitmapDouble(mBitmap, srtbyte, 24, 10, 100, 2, 1, 1);
		int res4 = ddi_bt.drawIntoBitmapDouble(mBitmap, srtbyte, 24, 10, 150, 1, 1, 1);
		int res5 = ddi_bt.drawIntoBitmapDouble(mBitmap, srtbyte, 24, 10, 200, 1, 2, 0);
		int res6 = ddi_bt.drawIntoBitmapDouble(mBitmap, srtbyte, 24, 10, 250, 2, 1, 0);
		int res7 = ddi_bt.drawIntoBitmapDouble(mBitmap, srtbyte, 24, 10, 300, 1, 1, 0);
		int res8 = ddi_bt.drawIntoBitmap(mBitmap, srtbyte, 24, 10, 350, 0);
		int res9 = ddi_bt.drawIntoBitmap(mBitmap, srtbyte, 24, 10, 400, 1);
		if (res1 == 0 && res2 == 0 && res3 == 0 && res4 == 0 && res5 == 0 && res6 == 0 && res7 == 0 && res8 == 0
				&& res9 == 0) {
			myHandleDeal("画图成功", res1);
		} else {
			myHandleDeal("thmprntext6画图失败", 1);
		}
		ByteUtils.saveImage(mBitmap);
		String printStr2 = storageDir + "/bitmap/test.jpg";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("矢量打印返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
			} else {
				myHandleDeal("thmprntext6矢量打印返回失败", 3);
			}
		} else {
			myHandleDeal("thmprntext6文件创建失败", 2);
		}
	}
	/*
	 * 打印灰度与加热调整
	 */

	private void testthmprntext7() {
		myHandleDeal("testthmprntext7测试", 0);
		initImage(100);
		String s = "点阵O0Il灰度0加热微调100";
		// String s = "商戶編號(MERCHANT NO.): 124456";
		drawImage(s, 24, 3, 10, 20);
		String printStr2 = storageDir + "/bitmap/test.jpg";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res1 = Ddi.ddi_thmprn_ioctl_setGray(25600);
			if (res1 == 0) {
				myHandleDeal("设置灰度成功", res1);
			} else {
				myHandleDeal("thmprntext7设置灰度失败", 1);
			}
			int res2 = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res2 == 0) {
				myHandleDeal("点阵打印返回成功", res2);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
			} else {
				myHandleDeal("thmprntext7点阵打印返回失败", 3);
			}
		} else {
			myHandleDeal("thmprntext7文件创建失败", 2);
		}
	}

	private void testthmprntext8() {
		myHandleDeal("testthmprntext8测试", 0);
		initImage(100);
		String s = "点阵O0Il灰度1加热微调100";
		drawImage(s, 24, 3, 10, 20);
		String printStr2 = storageDir + "/bitmap/test.jpg";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res1 = Ddi.ddi_thmprn_ioctl_setGray(25601);
			if (res1 == 0) {
				myHandleDeal("设置灰度成功", res1);
			} else {
				myHandleDeal("thmprntext8设置灰度失败", 1);
			}
			int res2 = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res2 == 0) {
				myHandleDeal("点阵打印返回成功", res2);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
			} else {
				myHandleDeal("thmprntext8点阵打印返回失败", 3);
			}
		} else {
			myHandleDeal("thmprntext8文件创建失败", 2);
		}
	}

	private void testthmprntext9() {
		myHandleDeal("testthmprntext9测试", 0);
		initImage(100);
		String s = "点阵O0Il灰度2加热微调100";
		drawImage(s, 24, 3, 10, 20);
		String printStr2 = storageDir + "/bitmap/test.jpg";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res1 = Ddi.ddi_thmprn_ioctl_setGray(25602);
			if (res1 == 0) {
				myHandleDeal("设置灰度成功", res1);
			} else {
				myHandleDeal("thmprntext9设置灰度失败", 1);
			}
			int res2 = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res2 == 0) {
				myHandleDeal("点阵打印返回成功", res2);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
			} else {
				myHandleDeal("thmprntext9点阵打印返回失败", 3);
			}
		} else {
			myHandleDeal("thmprntext9文件创建失败", 2);
		}
	}

	private void testthmprntext10() {
		myHandleDeal("testthmprntext10测试", 0);
		initImage(100);
		String s = "点阵O0Il灰度忽略加热微调100";
		drawImage(s, 24, 3, 10, 20);
		String printStr2 = storageDir + "/bitmap/test.jpg";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res1 = Ddi.ddi_thmprn_ioctl_setGray(25608);
			if (res1 == 0) {
				myHandleDeal("设置灰度成功", res1);
			} else {
				myHandleDeal("thmprntext10设置灰度失败", 1);
			}
			int res2 = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res2 == 0) {
				myHandleDeal("点阵打印返回成功", res2);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
			} else {
				myHandleDeal("thmprntext10点阵打印返回失败", 3);
			}
		} else {
			myHandleDeal("thmprntext10文件创建失败", 2);
		}
	}

	private void testthmprntext11() {
		myHandleDeal("testthmprntext11测试", 0);
		initImage(100);
		String s = "点阵O0Il灰度0加热微调-100";
		drawImage(s, 24, 3, 10, 20);
		String printStr2 = storageDir + "/bitmap/test.jpg";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res1 = Ddi.ddi_thmprn_ioctl_setGray(39936);
			if (res1 == 0) {
				myHandleDeal("设置灰度成功", res1);
			} else {
				myHandleDeal("thmprntext11设置灰度失败", 1);
			}
			int res2 = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res2 == 0) {
				myHandleDeal("点阵打印返回成功", res2);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
			} else {
				myHandleDeal("thmprntext11点阵打印返回失败", 3);
			}
		} else {
			myHandleDeal("thmprntext11文件创建失败", 2);
		}
	}

	private void testthmprntext12() {
		myHandleDeal("testthmprntext12测试", 0);
		initImage(100);
		String s = "点阵O0Il灰度忽略加热微调忽略";
		drawImage(s, 24, 3, 10, 20);
		String printStr2 = storageDir + "/bitmap/test.jpg";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res1 = Ddi.ddi_thmprn_ioctl_setGray(32008);
			if (res1 == 0) {
				myHandleDeal("设置灰度成功", res1);
			} else {
				myHandleDeal("thmprntext12设置灰度失败", 1);
			}
			int res2 = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res2 == 0) {
				myHandleDeal("点阵打印返回成功", res2);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
			} else {
				myHandleDeal("thmprntext12点阵打印返回失败", 3);
			}
		} else {
			myHandleDeal("thmprntext12文件创建失败", 2);
		}
	}

	private void testthmprntext13() {
		myHandleDeal("testthmprntext13测试", 0);
		initImage(100);
		String s = "点阵O0Il灰度1加热微调-100";
		drawImage(s, 24, 3, 10, 20);
		String printStr2 = storageDir + "/bitmap/test.jpg";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res1 = Ddi.ddi_thmprn_ioctl_setGray(39937);
			if (res1 == 0) {
				myHandleDeal("设置灰度成功", res1);
			} else {
				myHandleDeal("thmprntext13设置灰度失败", 1);
			}
			int res2 = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res2 == 0) {
				myHandleDeal("点阵打印返回成功", res2);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
			} else {
				myHandleDeal("thmprntext13点阵打印返回失败", 3);
			}
		} else {
			myHandleDeal("thmprntext13文件创建失败", 2);
		}
	}

	private void testthmprntext14() {
		myHandleDeal("testthmprntext14测试", 0);
		initImage(100);
		String s = "点阵O0Il灰度2加热微调-100";
		drawImage(s, 24, 3, 10, 20);
		String printStr2 = storageDir + "/bitmap/test.jpg";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res1 = Ddi.ddi_thmprn_ioctl_setGray(39938);
			if (res1 == 0) {
				myHandleDeal("设置灰度成功", res1);
			} else {
				myHandleDeal("thmprntext14设置灰度失败", 1);
			}
			int res2 = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res2 == 0) {
				myHandleDeal("点阵打印返回成功", res2);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
			} else {
				myHandleDeal("thmprntext14点阵打印返回失败", 3);
			}
		} else {
			myHandleDeal("thmprntext14文件创建失败", 2);
		}
	}

	private void testthmprntext15() {
		myHandleDeal("testthmprntext15测试", 0);
		initImage(100);
		String s = "点阵O0Il灰度0加热微调50";
		drawImage(s, 24, 3, 10, 20);
		String printStr2 = storageDir + "/bitmap/test.jpg";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res1 = Ddi.ddi_thmprn_ioctl_setGray(12800);
			if (res1 == 0) {
				myHandleDeal("设置灰度成功", res1);
			} else {
				myHandleDeal("thmprntext15设置灰度失败", 1);
			}
			int res2 = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res2 == 0) {
				myHandleDeal("点阵打印返回成功", res2);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
			} else {
				myHandleDeal("thmprntext15点阵打印返回失败", 3);
			}
		} else {
			myHandleDeal("thmprntext15文件创建失败", 2);
		}
	}

	private void testthmprntext16() {
		myHandleDeal("testthmprntext16测试", 0);
		initImage(100);
		String s = "点阵O0Il灰度1加热微调50";
		drawImage(s, 24, 3, 10, 20);
		String printStr2 = storageDir + "/bitmap/test.jpg";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res1 = Ddi.ddi_thmprn_ioctl_setGray(12801);
			if (res1 == 0) {
				myHandleDeal("设置灰度成功", res1);
			} else {
				myHandleDeal("thmprntext16设置灰度失败", 1);
			}
			int res2 = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res2 == 0) {
				myHandleDeal("点阵打印返回成功", res2);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
			} else {
				myHandleDeal("thmprntext16点阵打印返回失败", 3);
			}
		} else {
			myHandleDeal("thmprntext16文件创建失败", 2);
		}
	}

	private void testthmprntext17() {
		myHandleDeal("testthmprntext17测试", 0);
		initImage(100);
		String s = "点阵O0Il灰度2加热微调50";
		drawImage(s, 24, 3, 10, 20);
		String printStr2 = storageDir + "/bitmap/test.jpg";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res1 = Ddi.ddi_thmprn_ioctl_setGray(12802);
			if (res1 == 0) {
				myHandleDeal("设置灰度成功", res1);
			} else {
				myHandleDeal("thmprntext17设置灰度失败", 1);
			}
			int res2 = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res2 == 0) {
				myHandleDeal("点阵打印返回成功", res2);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
			} else {
				myHandleDeal("thmprntext17点阵打印返回失败", 3);
			}
		} else {
			myHandleDeal("thmprntext17文件创建失败", 2);
		}
	}

	private void testthmprntext18() {
		myHandleDeal("testthmprntext18测试", 0);
		initImage(100);
		String s = "点阵O0Il灰度0加热微调-50";
		drawImage(s, 24, 3, 10, 20);
		String printStr2 = storageDir + "/bitmap/test.jpg";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res1 = Ddi.ddi_thmprn_ioctl_setGray(52736);
			if (res1 == 0) {
				myHandleDeal("设置灰度成功", res1);
			} else {
				myHandleDeal("thmprntext18设置灰度失败", 1);
			}
			int res2 = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res2 == 0) {
				myHandleDeal("点阵打印返回成功", res2);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
			} else {
				myHandleDeal("thmprntext18点阵打印返回失败", 3);
			}
		} else {
			myHandleDeal("thmprntext18文件创建失败", 2);
		}
	}

	private void testthmprntext19() {
		myHandleDeal("testthmprntext19测试", 0);
		initImage(100);
		String s = "点阵O0Il灰度1加热微调-50";
		drawImage(s, 24, 3, 10, 20);
		String printStr2 = storageDir + "/bitmap/test.jpg";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res1 = Ddi.ddi_thmprn_ioctl_setGray(52737);
			if (res1 == 0) {
				myHandleDeal("设置灰度成功", res1);
			} else {
				myHandleDeal("thmprntext19设置灰度失败", 1);
			}
			int res2 = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res2 == 0) {
				myHandleDeal("点阵打印返回成功", res2);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
			} else {
				myHandleDeal("thmprntext19点阵打印返回失败", 3);
			}
		} else {
			myHandleDeal("thmprntext19文件创建失败", 2);
		}
	}

	private void testthmprntext20() {
		myHandleDeal("testthmprntext20测试", 0);
		initImage(100);
		String s = "点阵O0Il灰度2加热微调-50";
		drawImage(s, 24, 3, 10, 20);
		String printStr2 = storageDir + "/bitmap/test.jpg";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res1 = Ddi.ddi_thmprn_ioctl_setGray(52738);
			if (res1 == 0) {
				myHandleDeal("设置灰度成功", res1);
			} else {
				myHandleDeal("thmprntext20设置灰度失败", 1);
			}
			int res2 = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res2 == 0) {
				myHandleDeal("点阵打印返回成功", res2);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
			} else {
				myHandleDeal("thmprntext20点阵打印返回失败", 3);
			}
		} else {
			myHandleDeal("thmprntext20文件创建失败", 2);
		}
	}

	private void testthmprntext21() {
		myHandleDeal("testthmprntext21测试", 0);
		initImage(100);
		String s = "点阵O0Il灰度0加热微调忽略";
		drawImage(s, 24, 3, 10, 20);
		String printStr2 = storageDir + "/bitmap/test.jpg";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res1 = Ddi.ddi_thmprn_ioctl_setGray(0);
			if (res1 == 0) {
				myHandleDeal("设置灰度成功", res1);
			} else {
				myHandleDeal("thmprntext21设置灰度失败", 1);
			}
			int res2 = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res2 == 0) {
				myHandleDeal("点阵打印返回成功", res2);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
			} else {
				myHandleDeal("thmprntext21点阵打印返回失败", 3);
			}
		} else {
			myHandleDeal("thmprntext21文件创建失败", 2);
		}
	}

	private void testthmprntext22() {
		myHandleDeal("testthmprntext22测试", 0);
		initImage(100);
		String s = "点阵O0Il灰度1加热微调忽略";
		drawImage(s, 24, 3, 10, 20);
		String printStr2 = storageDir + "/bitmap/test.jpg";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res1 = Ddi.ddi_thmprn_ioctl_setGray(1);
			if (res1 == 0) {
				myHandleDeal("设置灰度成功", res1);
			} else {
				myHandleDeal("thmprntext22设置灰度失败", 1);
			}
			int res2 = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res2 == 0) {
				myHandleDeal("点阵打印返回成功", res2);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
			} else {
				myHandleDeal("thmprntext22点阵打印返回失败", 3);
			}
		} else {
			myHandleDeal("thmprntext22文件创建失败", 2);
		}
	}

	private void testthmprntext23() {
		myHandleDeal("testthmprntext23测试", 0);
		initImage(100);
		String s = "点阵O0Il灰度2加热微调忽略";
		drawImage(s, 24, 3, 10, 20);
		String printStr2 = storageDir + "/bitmap/test.jpg";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res1 = Ddi.ddi_thmprn_ioctl_setGray(2);
			if (res1 == 0) {
				myHandleDeal("设置灰度成功", res1);
			} else {
				myHandleDeal("thmprntext23设置灰度失败", 1);
			}
			int res2 = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res2 == 0) {
				myHandleDeal("点阵打印返回成功", res2);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
			} else {
				myHandleDeal("thmprntext23点阵打印返回失败", 3);
			}
		} else {
			myHandleDeal("thmprntext23文件创建失败", 2);
		}
	}

	private void testthmprntext24() {
		myHandleDeal("testthmprntext24测试", 0);
		initImage(100);
		String s = "犇猋骉蟲麤掱燚";
		drawImage(s, 24, 3, 10, 20);
		String printStr2 = storageDir + "/bitmap/test.jpg";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("点阵打印返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
			} else {
				myHandleDeal("thmprntext24点阵打印返回失败", 3);
			}
		} else {
			myHandleDeal("thmprntext24文件创建失败", 2);
		}
	}

	/*
	 * 图片打印
	 */
	private void testthmprn1() {
		myHandleDeal("testthmprn1测试", 0);
		String printStr2 = storageDir + "/PicBMP/320X240_单色.bmp";
		byte[] printText = printStr2.getBytes();
		Ddi.ddi_thmprn_open();
		int res = Ddi.ddi_thmprn_print_oneBitBMPImage(printText, printText.length);
		if (res == 0) {
			myHandleDeal("打印图片返回成功", res);
			try {
				Thread.sleep(500*2);
			} catch (Exception e) {

			}
			Ddi.ddi_thmprn_feed_paper(400);
			Ddi.ddi_thmprn_close();
		} else {
			myHandleDeal("thmprn1打印图片返回失败", 1);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void testthmprn2() {
		myHandleDeal("testthmprn2测试", 0);
		String printStr2 = storageDir + "/PicBMP/384x384.bmp";
		byte[] printText = printStr2.getBytes();
		Ddi.ddi_thmprn_open();
		int res = Ddi.ddi_thmprn_print_oneBitBMPImage(printText, printText.length);
		if (res == 0) {
			myHandleDeal("打印图片返回成功", res);
			try {
				Thread.sleep(500*2);
			} catch (Exception e) {

			}
			Ddi.ddi_thmprn_feed_paper(400);
			Ddi.ddi_thmprn_close();
		} else {
			myHandleDeal("thmprn2打印图片返回失败", 1);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void testthmprn3() {
		myHandleDeal("testthmprn3测试", 0);
		String printStr2 = storageDir + "/PicBMP/big.bmp";
		byte[] printText = printStr2.getBytes();
		Ddi.ddi_thmprn_open();
		int res = Ddi.ddi_thmprn_print_oneBitBMPImage(printText, printText.length);
		if (res == 0) {
			myHandleDeal("打印图片返回成功", res);
			try {
				Thread.sleep(500*2);
			} catch (Exception e) {

			}
			Ddi.ddi_thmprn_feed_paper(400);
			Ddi.ddi_thmprn_close();
		} else {
			myHandleDeal("thmprn3打印图片返回失败", 1);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void testthmprn4() {
		myHandleDeal("testthmprn4测试", 0);
		String printStr2 = storageDir + "/PicBMP/black_block_high.bmp";
		byte[] printText = printStr2.getBytes();
		Ddi.ddi_thmprn_open();
		int res = Ddi.ddi_thmprn_print_oneBitBMPImage(printText, printText.length);
		if (res == 0) {
			myHandleDeal("打印图片返回成功", res);
			try {
				Thread.sleep(500*2);
			} catch (Exception e) {

			}
			Ddi.ddi_thmprn_feed_paper(400);
			Ddi.ddi_thmprn_close();
		} else {
			myHandleDeal("thmprn4打印图片返回失败", 1);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void testthmprn5() {
		myHandleDeal("testthmprn5测试", 0);
		String printStr2 = storageDir + "/PicBMP/chinamobile.bmp";
		byte[] printText = printStr2.getBytes();
		Ddi.ddi_thmprn_open();
		int res = Ddi.ddi_thmprn_print_oneBitBMPImage(printText, printText.length);
		if (res == 0) {
			myHandleDeal("打印图片返回成功", res);
			try {
				Thread.sleep(500*2);
			} catch (Exception e) {

			}
			Ddi.ddi_thmprn_feed_paper(400);
			Ddi.ddi_thmprn_close();
		} else {
			myHandleDeal("thmprn5打印图片返回失败", 1);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void testthmprn6() {
		myHandleDeal("testthmprn6测试", 0);
		String printStr2 = storageDir + "/PicBMP/jsyh.bmp";
		byte[] printText = printStr2.getBytes();
		Ddi.ddi_thmprn_open();
		int res = Ddi.ddi_thmprn_print_oneBitBMPImage(printText, printText.length);
		if (res == 0) {
			myHandleDeal("打印图片返回成功", res);
			try {
				Thread.sleep(500*2);
			} catch (Exception e) {

			}
			Ddi.ddi_thmprn_feed_paper(400);
			Ddi.ddi_thmprn_close();
		} else {
			myHandleDeal("thmprn6打印图片返回失败", 1);
		}
	}

	private void testthmprn7() {
		myHandleDeal("testthmprn7测试", 0);
		String printStr2 = storageDir + "/PicBMP/1564396716071_111111.bmp";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("打印图片返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
			} else {
				myHandleDeal("thmprn7打印图片返回失败", 1);
			}
		} else {
			myHandleDeal("thmprn7文件创建失败", 2);
		}
	}

	private void testthmprn31() {
		myHandleDeal("testthmprn31测试", 0);
		String printStr2 = storageDir + "/PicBMP/YL1.png";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("打印图片返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
			} else {
				myHandleDeal("thmprn31打印图片返回失败", 1);
			}
		} else {
			myHandleDeal("thmprn31文件创建失败", 2);
		}
	}

	private void testthmprn8() {
		myHandleDeal("testthmprn8测试", 0);
		String printStr2 = storageDir + "/PicBMP/YL2.png";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("打印图片返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
			} else {
				myHandleDeal("thmprn8打印图片返回失败", 1);
			}
		} else {
			myHandleDeal("thmprn8文件创建失败", 2);
		}
	}

	private void testthmprn9() {
		myHandleDeal("testthmprn9测试", 0);
		String printStr2 = storageDir + "/PicBMP/printlogo.bmp";
		byte[] printText = printStr2.getBytes();
		Ddi.ddi_thmprn_open();
		int res = Ddi.ddi_thmprn_print_oneBitBMPImage(printText, printText.length);
		if (res == 0) {
			myHandleDeal("打印图片返回成功", res);
			try {
				Thread.sleep(500*2);
			} catch (Exception e) {

			}
			Ddi.ddi_thmprn_feed_paper(400);
			Ddi.ddi_thmprn_close();
		} else {
			myHandleDeal("thmprn9打印图片返回失败", 1);
		}
	}

	private void testthmprn10() {
		myHandleDeal("testthmprn10测试", 0);
		String printStr2 = storageDir + "/PicBMP/qr_name_big.bmp";
		byte[] printText = printStr2.getBytes();
		Ddi.ddi_thmprn_open();
		int res = Ddi.ddi_thmprn_print_oneBitBMPImage(printText, printText.length);
		if (res == 0) {
			myHandleDeal("打印图片返回成功", res);
			try {
				Thread.sleep(500*2);
			} catch (Exception e) {

			}
			Ddi.ddi_thmprn_feed_paper(400);
			Ddi.ddi_thmprn_close();
		} else {
			myHandleDeal("thmprn10打印图片返回失败", res);
		}
	}

	private void testthmprn11() {
		myHandleDeal("testthmprn11测试", 0);
		String printStr2 = storageDir + "/PicBMP/qr_name_middle.bmp";
		byte[] printText = printStr2.getBytes();
		Ddi.ddi_thmprn_open();
		int res = Ddi.ddi_thmprn_print_oneBitBMPImage(printText, printText.length);
		if (res == 0) {
			myHandleDeal("打印图片返回成功", res);
			try {
				Thread.sleep(500*2);
			} catch (Exception e) {

			}
			Ddi.ddi_thmprn_feed_paper(400);
			Ddi.ddi_thmprn_close();
		} else {
			myHandleDeal("thmprn11打印图片返回失败", res);
		}
	}

	private void testthmprn12() {
		myHandleDeal("testthmprn12测试", 0);
		String printStr2 = storageDir + "/PicBMP/qr_progress_big.bmp";
		byte[] printText = printStr2.getBytes();
		Ddi.ddi_thmprn_open();
		int res = Ddi.ddi_thmprn_print_oneBitBMPImage(printText, printText.length);
		if (res == 0) {
			myHandleDeal("打印图片返回成功", res);
			try {
				Thread.sleep(500*2);
			} catch (Exception e) {

			}
			Ddi.ddi_thmprn_feed_paper(400);
			Ddi.ddi_thmprn_close();
		} else {
			myHandleDeal("thmprn12打印图片返回失败", res);
		}
	}

	private void testthmprn13() {
		myHandleDeal("testthmprn13测试", 0);
		String printStr2 = storageDir + "/PicBMP/qr_progress_middle.bmp";
		byte[] printText = printStr2.getBytes();
		Ddi.ddi_thmprn_open();
		int res = Ddi.ddi_thmprn_print_oneBitBMPImage(printText, printText.length);
		if (res == 0) {
			myHandleDeal("打印图片返回成功", res);
			try {
				Thread.sleep(500*2);
			} catch (Exception e) {

			}
			Ddi.ddi_thmprn_feed_paper(400);
			Ddi.ddi_thmprn_close();
		} else {
			myHandleDeal("thmprn13打印图片返回失败", res);
		}
	}

	private void testthmprn14() {
		myHandleDeal("testthmprn14测试", 0);
		String printStr2 = storageDir + "/PicBMP/qr_text_big.bmp";
		byte[] printText = printStr2.getBytes();
		Ddi.ddi_thmprn_open();
		int res = Ddi.ddi_thmprn_print_oneBitBMPImage(printText, printText.length);
		if (res == 0) {
			myHandleDeal("打印图片返回成功", res);
			try {
				Thread.sleep(500*2);
			} catch (Exception e) {

			}
			Ddi.ddi_thmprn_feed_paper(400);
			Ddi.ddi_thmprn_close();
		} else {
			myHandleDeal("thmprn14打印图片返回失败", res);
		}
	}

	private void testthmprn15() {
		myHandleDeal("testthmprn15测试", 0);
		String printStr2 = storageDir + "/PicBMP/qr_text_middle.bmp";
		byte[] printText = printStr2.getBytes();
		Ddi.ddi_thmprn_open();
		int res = Ddi.ddi_thmprn_print_oneBitBMPImage(printText, printText.length);
		if (res == 0) {
			myHandleDeal("打印图片返回成功", res);
			try {
				Thread.sleep(500*2);
			} catch (Exception e) {

			}
			Ddi.ddi_thmprn_feed_paper(400);
			Ddi.ddi_thmprn_close();
		} else {
			myHandleDeal("thmprn15打印图片返回失败", 1);
		}
	}

	private void testthmprn16() {
		myHandleDeal("testthmprn16测试", 0);
		String printStr2 = storageDir + "/PicBMP/qr_url_big.bmp";
		byte[] printText = printStr2.getBytes();
		Ddi.ddi_thmprn_open();
		int res = Ddi.ddi_thmprn_print_oneBitBMPImage(printText, printText.length);
		if (res == 0) {
			myHandleDeal("打印图片返回成功", res);
			try {
				Thread.sleep(500*2);
			} catch (Exception e) {

			}
			Ddi.ddi_thmprn_feed_paper(400);
			Ddi.ddi_thmprn_close();
		} else {
			myHandleDeal("thmprn16打印图片返回失败", 1);
		}
	}

	private void testthmprn17() {
		myHandleDeal("testthmprn17测试", 0);
		String printStr2 = storageDir + "/PicBMP/qr_url_middle.bmp";
		byte[] printText = printStr2.getBytes();
		Ddi.ddi_thmprn_open();
		int res = Ddi.ddi_thmprn_print_oneBitBMPImage(printText, printText.length);
		if (res == 0) {
			myHandleDeal("打印图片返回成功", res);
			try {
				Thread.sleep(500*2);
			} catch (Exception e) {

			}
			Ddi.ddi_thmprn_feed_paper(400);
			Ddi.ddi_thmprn_close();
		} else {
			myHandleDeal("thmprn17打印图片返回失败", 1);
		}
	}

	private void testthmprn18() {
		myHandleDeal("testthmprn18测试", 0);
		String printStr2 = storageDir + "/PicBMP/qr_wifi_big.bmp";
		byte[] printText = printStr2.getBytes();
		Ddi.ddi_thmprn_open();
		int res = Ddi.ddi_thmprn_print_oneBitBMPImage(printText, printText.length);
		if (res == 0) {
			myHandleDeal("打印图片返回成功", res);
			try {
				Thread.sleep(500*2);
			} catch (Exception e) {

			}
			Ddi.ddi_thmprn_feed_paper(400);
			Ddi.ddi_thmprn_close();
		} else {
			myHandleDeal("thmprn18打印图片返回失败", 1);
		}
	}

	private void testthmprn19() {
		myHandleDeal("testthmprn19测试", 0);
		String printStr2 = storageDir + "/PicBMP/qr_wifi_middle.bmp";
		byte[] printText = printStr2.getBytes();
		Ddi.ddi_thmprn_open();
		int res = Ddi.ddi_thmprn_print_oneBitBMPImage(printText, printText.length);
		if (res == 0) {
			myHandleDeal("打印图片返回成功", res);
			try {
				Thread.sleep(500*2);
			} catch (Exception e) {

			}
			Ddi.ddi_thmprn_feed_paper(400);
			Ddi.ddi_thmprn_close();
		} else {
			myHandleDeal("thmprn19打印图片返回失败", 1);
		}
	}

	private void testthmprn20() {
		myHandleDeal("testthmprn20测试", 0);
		String printStr2 = storageDir + "/PicBMP/small.bmp";
		byte[] printText = printStr2.getBytes();
		Ddi.ddi_thmprn_open();
		int res = Ddi.ddi_thmprn_print_oneBitBMPImage(printText, printText.length);
		if (res == 0) {
			myHandleDeal("打印图片返回成功", res);
			try {
				Thread.sleep(500*2);
			} catch (Exception e) {

			}
			Ddi.ddi_thmprn_feed_paper(400);
			Ddi.ddi_thmprn_close();
		} else {
			myHandleDeal("thmprn20打印图片返回失败", 1);
		}
	}

	private void testthmprn21() {
		myHandleDeal("testthmprn21测试", 0);
		String printStr2 = storageDir + "/PicBMP/tm_200070.bmp";
		byte[] printText = printStr2.getBytes();
		Ddi.ddi_thmprn_open();
		int res = Ddi.ddi_thmprn_print_oneBitBMPImage(printText, printText.length);
		if (res == 0) {
			myHandleDeal("打印图片返回成功", res);
			try {
				Thread.sleep(500*2);
			} catch (Exception e) {

			}
			Ddi.ddi_thmprn_feed_paper(400);
			Ddi.ddi_thmprn_close();
		} else {
			myHandleDeal("thmprn21打印图片返回失败", 1);
		}
	}

	private void testthmprn22() {
		myHandleDeal("testthmprn22测试", 0);
		String printStr2 = storageDir + "/PicBMP/tm_384070.bmp";
		byte[] printText = printStr2.getBytes();
		Ddi.ddi_thmprn_open();
		int res = Ddi.ddi_thmprn_print_oneBitBMPImage(printText, printText.length);
		if (res == 0) {
			myHandleDeal("打印图片返回成功", res);
			try {
				Thread.sleep(500*2);
			} catch (Exception e) {

			}
			Ddi.ddi_thmprn_feed_paper(400);
			Ddi.ddi_thmprn_close();
		} else {
			myHandleDeal("thmprn22打印图片返回失败", 1);
		}
	}

	private void testthmprn23() {
		myHandleDeal("testthmprn23测试", 0);
		String printStr2 = storageDir + "/PicBMP/tm_nil.bmp";
		byte[] printText = printStr2.getBytes();
		Ddi.ddi_thmprn_open();
		int res = Ddi.ddi_thmprn_print_oneBitBMPImage(printText, printText.length);
		if (res == 0) {
			myHandleDeal("打印图片返回成功", res);
			try {
				Thread.sleep(500*2);
			} catch (Exception e) {

			}
			Ddi.ddi_thmprn_feed_paper(400);
			Ddi.ddi_thmprn_close();
		} else {
			myHandleDeal("thmprn23打印图片返回失败", 1);
		}
	}

	private void testthmprn24() {
		myHandleDeal("testthmprn24测试", 0);
		String printStr2 = storageDir + "/PicBMP/tm_zhongguo.bmp";
		byte[] printText = printStr2.getBytes();
		Ddi.ddi_thmprn_open();
		int res = Ddi.ddi_thmprn_print_oneBitBMPImage(printText, printText.length);
		if (res == 0) {
			myHandleDeal("打印图片返回成功", res);
			try {
				Thread.sleep(500*2);
			} catch (Exception e) {

			}
			Ddi.ddi_thmprn_feed_paper(400);
			Ddi.ddi_thmprn_close();
		} else {
			myHandleDeal("thmprn24打印图片返回失败", 1);
		}
	}

	private void testthmprn25() {
		myHandleDeal("testthmprn25测试", 0);
		String printStr2 = storageDir + "/PicBMP/white_block.bmp";
		byte[] printText = printStr2.getBytes();
		Ddi.ddi_thmprn_open();
		int res = Ddi.ddi_thmprn_print_oneBitBMPImage(printText, printText.length);
		if (res == 0) {
			myHandleDeal("打印图片返回成功", res);
			try {
				Thread.sleep(500*2);
			} catch (Exception e) {

			}
			Ddi.ddi_thmprn_feed_paper(400);
			Ddi.ddi_thmprn_close();
		} else {
			myHandleDeal("thmprn25打印图片返回失败", 1);
		}
	}

	private void testthmprn26() {
		myHandleDeal("testthmprn26测试", 0);
		String printStr2 = storageDir + "/PicBMP/ylsw.bmp";
		byte[] printText = printStr2.getBytes();
		Ddi.ddi_thmprn_open();
		int res = Ddi.ddi_thmprn_print_oneBitBMPImage(printText, printText.length);
		if (res == 0) {
			myHandleDeal("打印图片返回成功", res);
			try {
				Thread.sleep(500*2);
			} catch (Exception e) {

			}
			Ddi.ddi_thmprn_feed_paper(400);
			Ddi.ddi_thmprn_close();
		} else {
			myHandleDeal("thmprn26打印图片返回失败", 1);
		}
	}

	private void testthmprn27() {
		myHandleDeal("testthmprn27测试", 0);
		String printStr2 = storageDir + "/PicBMP/unionpay.bmp";
		byte[] printText = printStr2.getBytes();
		Ddi.ddi_thmprn_open();
		int res = Ddi.ddi_thmprn_print_oneBitBMPImage(printText, printText.length);
		if (res == 0) {
			myHandleDeal("打印图片返回成功", res);
			try {
				Thread.sleep(500*2);
			} catch (Exception e) {

			}
			Ddi.ddi_thmprn_feed_paper(400);
			Ddi.ddi_thmprn_close();
		} else {
			myHandleDeal("thmprn27打印图片返回失败", 1);
		}
	}

	private void testthmprn28() {
		myHandleDeal("testthmprn28测试", 0);
		String printStr2 = storageDir + "/PicBMP/testPrint.bmp";
		byte[] printText = printStr2.getBytes();
		Ddi.ddi_thmprn_open();
		int res = Ddi.ddi_thmprn_print_oneBitBMPImage(printText, printText.length);
		if (res == 0) {
			myHandleDeal("打印图片返回成功", res);
			try {
				Thread.sleep(500*2);
			} catch (Exception e) {

			}
			Ddi.ddi_thmprn_feed_paper(400);
			Ddi.ddi_thmprn_close();
		} else {
			myHandleDeal("thmprn28打印图片返回失败", 1);
		}
	}

	private void testthmprn29() {
		myHandleDeal("testthmprn29测试", 0);
		String printStr2 = storageDir + "/PicBMP/guozi.bmp";
		byte[] printText = printStr2.getBytes();
		Ddi.ddi_thmprn_open();
		int res = Ddi.ddi_thmprn_print_oneBitBMPImage(printText, printText.length);
		if (res == 0) {
			myHandleDeal("打印图片返回成功", res);
			try {
				Thread.sleep(500*2);
			} catch (Exception e) {

			}
			Ddi.ddi_thmprn_feed_paper(400);
			Ddi.ddi_thmprn_close();
		} else {
			myHandleDeal("thmprn29打印图片返回失败", 1);
		}
	}

	private void testthmprn30() {
		myHandleDeal("testthmprn30测试", 0);
		String printStr2 = storageDir + "/PicBMP/Black.bmp";
		byte[] printText = printStr2.getBytes();
		Ddi.ddi_thmprn_open();
		int res = Ddi.ddi_thmprn_print_oneBitBMPImage(printText, printText.length);
		if (res == 0) {
			myHandleDeal("打印图片返回成功", res);
			try {
				Thread.sleep(500*2);
			} catch (Exception e) {

			}
			Ddi.ddi_thmprn_feed_paper(400);
			Ddi.ddi_thmprn_close();
		} else {
			myHandleDeal("thmprn30打印图片返回失败", 1);
		}
	}
	/*
	 * 银商图片
	 */

	private void testthmprnys1() {
		myHandleDeal("testthmprnys1测试", 0);
		String printStr2 = storageDir + "/PicBMP/ys1.png";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("打印图片返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {
				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
				try {
					Thread.sleep(500*2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				myHandleDeal("thmprnys1打印图片返回失败", res);
			}
		} else {
			myHandleDeal("thmprnys1文件创建失败", 1);
		}
	}

	private void testthmprnys2() {
		myHandleDeal("testthmprnys2测试", 0);
		String printStr2 = storageDir + "/PicBMP/ys2.png";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("打印图片返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
				try {
					Thread.sleep(500*2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				myHandleDeal("thmprnys2打印图片返回失败", res);
			}
		} else {
			myHandleDeal("thmprnys2文件创建失败", 1);
		}
	}

	private void testthmprnys3() {
		myHandleDeal("testthmprnys3测试", 0);
		String printStr2 = storageDir + "/PicBMP/ys3.png";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("打印图片返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {
				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
				try {
					Thread.sleep(500*2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				myHandleDeal("thmprnys3打印图片返回失败", res);
			}
		} else {
			myHandleDeal("thmprnys3文件创建失败", 1);
		}
	}

	private void testthmprnys4() {
		myHandleDeal("testthmprnys4测试", 0);
		String printStr2 = storageDir + "/PicBMP/ys4.png";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("打印图片返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
				try {
					Thread.sleep(500*2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				myHandleDeal("thmprnys4打印图片返回失败", res);
			}
		} else {
			myHandleDeal("thmprnys4文件创建失败", 1);
		}
	}

	private void testthmprnys5() {
		myHandleDeal("testthmprnys5测试", 0);
		String printStr2 = storageDir + "/PicBMP/ys5.png";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("打印图片返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
				try {
					Thread.sleep(500*2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				myHandleDeal("thmprnys5打印图片返回失败", res);
			}
		} else {
			myHandleDeal("thmprnys5文件创建失败", 1);
		}
	}

	private void testthmprnys6() {
		myHandleDeal("testthmprnys6测试", 0);
		String printStr2 = storageDir + "/PicBMP/ys6.png";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("打印图片返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
				try {
					Thread.sleep(500*2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				myHandleDeal("thmprnys6打印图片返回失败", res);
			}
		} else {
			myHandleDeal("thmprnys6文件创建失败", 1);
		}
	}

	private void testthmprnys7() {
		myHandleDeal("testthmprnys7测试", 0);
		String printStr2 = storageDir + "/PicBMP/ys7.png";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("打印图片返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
				try {
					Thread.sleep(500*2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				myHandleDeal("thmprnys7打印图片返回失败", res);
			}
		} else {
			myHandleDeal("thmprnys7文件创建失败", 1);
		}
	}

	private void testthmprnys8() {
		myHandleDeal("testthmprnys8测试", 0);
		String printStr2 = storageDir + "/PicBMP/ys8.png";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("打印图片返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
				try {
					Thread.sleep(500*2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				myHandleDeal("thmprnys8打印图片返回失败", res);
			}
		} else {
			myHandleDeal("thmprnys8文件创建失败", 1);
		}
	}

	private void testthmprnys9() {
		myHandleDeal("testthmprnys9测试", 0);
		String printStr2 = storageDir + "/PicBMP/ys9.png";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("打印图片返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
				try {
					Thread.sleep(500*2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				myHandleDeal("thmprnys9打印图片返回失败", res);
			}
		} else {
			myHandleDeal("thmprnys9文件创建失败", 1);
		}
	}

	private void testthmprnys10() {
		myHandleDeal("testthmprnys10测试", 0);
		String printStr2 = storageDir + "/PicBMP/ys10.png";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("打印图片返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
				try {
					Thread.sleep(500*2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				myHandleDeal("thmprnys10打印图片返回失败", res);
			}
		} else {
			myHandleDeal("thmprnys10文件创建失败", 1);
		}
	}

	private void testthmprnys11() {
		
		myHandleDeal("testthmprnys11测试", 0);
				String printStr2 = storageDir + "/PicBMP/ys11.jpg";
				File mFile = new File(printStr2);
				if (mFile.exists()) {
					Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
					byte[] data = ByteUtils.toBmpBytes(bitmap);
					int ddi_thmprn_open = Ddi.ddi_thmprn_open();
					if (ddi_thmprn_open == 0) {
						myHandleDeal("testthmprnys11设备打开成功", ddi_thmprn_open);
					} else {
						myHandleDeal("testthmprnys11设备打开失败", ddi_thmprn_open);
					}
					int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
					if (res == 0) {
						myHandleDeal("打印图片返回成功", res);
						try {
							Thread.sleep(500*2);
						} catch (Exception e) {

						}
						Ddi.ddi_thmprn_feed_paper(400);
						Ddi.ddi_thmprn_close();
						try {
							Thread.sleep(500*2);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					} else {
						myHandleDeal("thmprnys11打印图片返回失败", res);
					}
				} else {
					myHandleDeal("thmprnys11文件创建失败", 1);
				}

		
	}

	private void testthmprnys12() {
		myHandleDeal("testthmprnys12测试", 0);
		String printStr2 = storageDir + "/PicBMP/ys12.jpg";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			int res0 = Ddi.ddi_thmprn_open();
			if (res0==0) {
				myHandleDeal("设备打开成功", res0);
			} else {
				myHandleDeal("设备打开失败", res0);

			}
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("打印图片返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
				try {
					Thread.sleep(500*2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				myHandleDeal("thmprnys12打印图片返回失败", res);
			}
		} else {
			myHandleDeal("thmprnys12文件创建失败", 1);
		}
	}

	private void testthmprnys13() {
		myHandleDeal("testthmprnys13测试", 0);
		String printStr2 = storageDir + "/PicBMP/ys13.jpg";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("打印图片返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
				try {
					Thread.sleep(500*2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				myHandleDeal("thmprnys13打印图片返回失败", res);
			}
		} else {
			myHandleDeal("thmprnys13文件创建失败", 1);
		}
	}

	private void testthmprnys14() {
		myHandleDeal("testthmprnys14测试", 0);
		String printStr2 = storageDir + "/PicBMP/ys14.png";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("打印图片返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
				try {
					Thread.sleep(500*2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				myHandleDeal("thmprnys14打印图片返回失败", res);
			}
		} else {
			myHandleDeal("thmprnys14文件创建失败", 1);
		}
	}

	private void testthmprnys15() {
		myHandleDeal("testthmprnys15测试", 0);
		String printStr2 = storageDir + "/PicBMP/ys15.png";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("打印图片返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
				try {
					Thread.sleep(500*2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				myHandleDeal("thmprnys15打印图片返回失败", res);
			}
		} else {
			myHandleDeal("thmprnys15文件创建失败", 1);
		}
	}

	private void testthmprnys16() {
		myHandleDeal("testthmprnys16测试", 0);
		String printStr2 = storageDir + "/PicBMP/ys16.png";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("打印图片返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
				try {
					Thread.sleep(500*2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				myHandleDeal("thmprnys16打印图片返回失败", res);
			}
		} else {
			myHandleDeal("thmprnys16文件创建失败", 1);
		}
	}

	private void testthmprnys17() {
		myHandleDeal("testthmprnys17测试", 0);
		String printStr2 = storageDir + "/PicBMP/ys18.png";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("打印图片返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
				try {
					Thread.sleep(500*2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				myHandleDeal("thmprnys17打印图片返回失败", res);
			}
		} else {
			myHandleDeal("thmprnys17文件创建失败", 1);
		}
	}

	private void testthmprnys18() {
		myHandleDeal("testthmprnys18测试", 0);
		String printStr2 = storageDir + "/PicBMP/ys19.png";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("打印图片返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
				try {
					Thread.sleep(500*2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				myHandleDeal("thmprnys18打印图片返回失败", res);
			}
		} else {
			myHandleDeal("thmprnys18文件创建失败", 1);
		}
	}

	private void testthmprnys19() {
		myHandleDeal("testthmprnys19测试", 0);
		String printStr2 = storageDir + "/PicBMP/ys20.png";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("打印图片返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
				try {
					Thread.sleep(500*2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				myHandleDeal("thmprnys19打印图片返回失败", res);
			}
		} else {
			myHandleDeal("thmprnys19文件创建失败", 1);
		}
	}

	private void testthmprnys20() {
		myHandleDeal("testthmprnys20测试", 0);
		String printStr2 = storageDir + "/PicBMP/ys21.png";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("打印图片返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
				try {
					Thread.sleep(500*2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				myHandleDeal("thmprnys20打印图片返回失败", res);
			}
		} else {
			myHandleDeal("thmprnys20文件创建失败", 1);
		}
	}

	private void testthmprnys21() {
		myHandleDeal("testthmprnys21测试", 0);
		String printStr2 = storageDir + "/PicBMP/ys22.png";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("打印图片返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
				try {
					Thread.sleep(500*2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				myHandleDeal("thmprnys21打印图片返回失败", res);
			}
		} else {
			myHandleDeal("thmprnys21文件创建失败", 1);
		}
	}

	private void testthmprnys22() {
		myHandleDeal("testthmprnys22测试", 0);
		String printStr2 = storageDir + "/PicBMP/ys23.png";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("打印图片返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
				try {
					Thread.sleep(500*2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				myHandleDeal("thmprnys22打印图片返回失败", res);
			}
		} else {
			myHandleDeal("thmprnys22文件创建失败", 1);
		}
	}

	private void testthmprnys23() {
		myHandleDeal("testthmprnys23测试", 0);
		String printStr2 = storageDir + "/PicBMP/ys24.png";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("打印图片返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
				try {
					Thread.sleep(500*2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				myHandleDeal("thmprnys23打印图片返回失败", res);
			}
		} else {
			myHandleDeal("thmprnys23文件创建失败", 1);
		}
	}

	private void testthmprnys24() {
		myHandleDeal("testthmprnys24测试", 0);
		String printStr2 = storageDir + "/PicBMP/ys25.png";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("打印图片返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
				try {
					Thread.sleep(500*2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				myHandleDeal("thmprnys24打印图片返回失败", res);
			}
		} else {
			myHandleDeal("thmprnys24文件创建失败", 1);
		}
	}

	private void testthmprnys25() {
		myHandleDeal("testthmprnys25测试", 0);
		String printStr2 = storageDir + "/PicBMP/ys26.png";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("打印图片返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
				try {
					Thread.sleep(500*2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				myHandleDeal("thmprnys25打印图片返回失败", res);
			}
		} else {
			myHandleDeal("thmprnys25文件创建失败", 1);
		}
	}

	private void testthmprnys26() {
		myHandleDeal("testthmprnys26测试", 0);
		String printStr2 = storageDir + "/PicBMP/ys27.png";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("打印图片返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
				try {
					Thread.sleep(500*2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				myHandleDeal("thmprnys26打印图片返回失败", res);
			}
		} else {
			myHandleDeal("thmprnys26文件创建失败", 1);
		}
	}

	private void testthmprnys27() {
		myHandleDeal("testthmprnys27测试", 0);
		String printStr2 = storageDir + "/PicBMP/ys28.png";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("打印图片返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
				try {
					Thread.sleep(500*2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				myHandleDeal("thmprnys27打印图片返回失败", res);
			}
		} else {
			myHandleDeal("thmprnys27文件创建失败", 1);
		}
	}

	private void testthmprnys28() {
		myHandleDeal("testthmprnys28测试", 0);
		String printStr2 = storageDir + "/PicBMP/ys29.png";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("打印图片返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
				try {
					Thread.sleep(500*2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				myHandleDeal("thmprnys28打印图片返回失败", res);
			}
		} else {
			myHandleDeal("thmprnys28文件创建失败", 1);
		}
	}

	private void testthmprnys29() {
		myHandleDeal("testthmprnys29测试", 0);
		String printStr2 = storageDir + "/PicBMP/ys30.png";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("打印图片返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
				try {
					Thread.sleep(500*2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				myHandleDeal("thmprnys29打印图片返回失败", res);
			}
		} else {
			myHandleDeal("thmprnys29文件创建失败", 1);
		}
	}

	private void testthmprnys30() {
		myHandleDeal("testthmprnys30测试", 0);
		String printStr2 = storageDir + "/PicBMP/ys31.jpg";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("打印图片返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
				try {
					Thread.sleep(500*2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				myHandleDeal("thmprnys30打印图片返回失败", res);
			}
		} else {
			myHandleDeal("thmprnys30文件创建失败", 1);
		}
	}

	private void testthmprnys31() {
		myHandleDeal("testthmprnys31测试", 0);
		String printStr2 = storageDir + "/PicBMP/ys32.jpg";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("打印图片返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
				try {
					Thread.sleep(500*2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				myHandleDeal("thmprnys31打印图片返回失败", res);
			}
		} else {
			myHandleDeal("thmprnys31文件创建失败", 1);
		}
	}

	private void testthmprnys32() {
		myHandleDeal("testthmprnys32测试", 0);
		String printStr2 = storageDir + "/PicBMP/ys33.jpg";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("打印图片返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
				try {
					Thread.sleep(500*2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				myHandleDeal("thmprnys32打印图片返回失败", res);
			}
		} else {
			myHandleDeal("thmprnys32文件创建失败", 1);
		}
	}

	private void testthmprnys33() {
		myHandleDeal("testthmprnys33测试", 0);
		String printStr2 = storageDir + "/PicBMP/ys34.jpg";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("打印图片返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
				try {
					Thread.sleep(500*2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				myHandleDeal("thmprnys1打印图片返回失败", res);
			}
		} else {
			myHandleDeal("thmprnys1文件创建失败", 1);
		}
	}

	private void testthmprnys34() {
		myHandleDeal("testthmprnys34测试", 0);
		String printStr2 = storageDir + "/PicBMP/ys35.jpg";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("打印图片返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
				try {
					Thread.sleep(500*2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				myHandleDeal("thmprnys34打印图片返回失败", res);
			}
		} else {
			myHandleDeal("thmprnys34文件创建失败", 1);
		}
	}

	private void testthmprnys35() {
		myHandleDeal("testthmprnys35测试", 0);
		String printStr2 = storageDir + "/PicBMP/ys36.jpg";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("打印图片返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
				try {
					Thread.sleep(500*2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				myHandleDeal("thmprnys35打印图片返回失败", res);
			}
		} else {
			myHandleDeal("thmprnys35文件创建失败", 1);
		}
	}

	private void testthmprnys36() {
		myHandleDeal("testthmprnys36测试", 0);
		String printStr2 = storageDir + "/PicBMP/ys37.jpg";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("打印图片返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
				try {
					Thread.sleep(500*2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				myHandleDeal("thmprnys36打印图片返回失败", res);
			}
		} else {
			myHandleDeal("thmprnys36文件创建失败", 1);
		}
	}

	private void testthmprnys37() {
		myHandleDeal("testthmprnys37测试", 0);
		String printStr2 = storageDir + "/PicBMP/ys38.jpg";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("打印图片返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
				try {
					Thread.sleep(500*2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				myHandleDeal("thmprnys37打印图片返回失败", res);
			}
		} else {
			myHandleDeal("thmprnys37文件创建失败", 1);
		}
	}

	private void testthmprnys38() {
		myHandleDeal("testthmprnys38测试", 0);
		String printStr2 = storageDir + "/PicBMP/ys39.jpg";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("打印图片返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
				try {
					Thread.sleep(500*2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				myHandleDeal("thmprnys38打印图片返回失败", res);
			}
		} else {
			myHandleDeal("thmprnys38文件创建失败", 1);
		}
	}

	private void testthmprnys39() {
		myHandleDeal("testthmprnys39测试", 0);
		String printStr2 = storageDir + "/PicBMP/ys40.jpg";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("打印图片返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
				try {
					Thread.sleep(500*2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				myHandleDeal("thmprnys39打印图片返回失败", res);
			}
		} else {
			myHandleDeal("thmprnys39文件创建失败", 1);
		}
	}

	private void testthmprnys40() {
		myHandleDeal("testthmprnys40测试", 0);
		String printStr2 = storageDir + "/PicBMP/ys41.bmp";
		byte[] printText = printStr2.getBytes();
		Ddi.ddi_thmprn_open();
		int res = Ddi.ddi_thmprn_print_oneBitBMPImage(printText, printText.length);
		if (res == 0) {
			myHandleDeal("打印图片返回成功", res);
			try {
				Thread.sleep(500*2);
			} catch (Exception e) {

			}
			Ddi.ddi_thmprn_feed_paper(400);
			Ddi.ddi_thmprn_close();
			try {
				Thread.sleep(500*2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			myHandleDeal("thmprnys40打印图片返回失败", res);
		}
	}

	private void testend() {
//		Thread name = new Thread(new Runnable() {
//			public void run() {
				myHandleDeal("runall测试结束", 0);
//			}
//		});
//		name.setDaemon(true);
//		name.start();
		
		
	}

	/*
	 * 多次调用画图崩溃
	 */
	private void testprintpress1() {
		myHandleDeal("testprintpress1矢量接口测试", 0);
		initImage(150);
		String s = "矢量打印加粗O0Il";
		str = s;
		try {
			srtbyte = str.getBytes("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String S = "/system/fonts/NotoSansHans-Light_new.ttf";
		ddi_bt.setfont(S, S.length());
		for (int i = 0; i < 600; i++) {
			int res1 = ddi_bt.drawIntoBitmapDouble(mBitmap, srtbyte, 24, 10, 50, 1, 2, 1);
			if (res1 == 0) {
				myHandleDeal(i + "测试成功", res1);
			} else {
				myHandleDeal(i + "printpress1测试失败", res1);
			}
			int res2 = ddi_bt.drawIntoBitmap(mBitmap, srtbyte, 24, 10, 100, 0);
			if (res2 == 0) {
				myHandleDeal(i + "测试成功", res2);
			} else {
				myHandleDeal(i + "printpress1测试失败", res2);
			}
		}
		ByteUtils.saveImage(mBitmap);
		String printStr2 = storageDir + "/bitmap/test.jpg";
		File mFile = new File(printStr2);
		// 若该文件存在
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			Ddi.ddi_thmprn_ioctl_setGray(25600);
			Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			try {
				Thread.sleep(500*2);
			} catch (Exception e) {

			}
			Ddi.ddi_thmprn_feed_paper(500);
			Ddi.ddi_thmprn_close();
		} else {

		}
	}
	// 这里还需修改

//		myHandleDeal("testprintpress2点阵接口测试",0);
//		initImage(150);
//		String s = "点阵打印加粗O0Il";
//		str = s;
//		try {
//			srtbyte = str.getBytes("GBK");
//		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
//		}
//		String S = "/system/fonts/NotoSansHans-Light_new.ttf";
//		ddi_bt.setfont(S, S.length());
//		for(int i=0;i<600;i++){
//			int res1 = ddi_bt.drawdottextblod(mBitmap, srtbyte, 24, 4, 10, 50, 1, 2, 1);
//			if(res1==0){
//				myHandleDeal(i+"测试成功",res1);
//			}else{
//				myHandleDeal(i+"printpress2测试失败",1);
//			}
//			int res2 = ddi_bt.drawdottext(mBitmap, srtbyte, 24, 4, 10, 350, 1, 1);
//			if(res2==0){
//				myHandleDeal(i+"测试成功",res2);
//			}else{
//				myHandleDeal(i+"printpress2测试失败",2);
//			}
//		}
//		ByteUtils.saveImage(mBitmap);
//		String printStr2 = storageDir+"/bitmap/test.jpg";
//		File mFile=new File(printStr2);
//		//若该文件存在
//		if (mFile.exists()) {
//			Bitmap bitmap=BitmapFactory.decodeFile(printStr2);
//			byte[]data = ByteUtils.toBmpBytes(bitmap);
//			Ddi.ddi_thmprn_open();
//			Ddi.ddi_thmprn_ioctl_setGray(25600);
//			Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data,data.length);
//			try {
//				Thread.sleep(500*2);
//			} catch (Exception e) {
//
//			}
//			Ddi.ddi_thmprn_feed_paper(500);
//			Ddi.ddi_thmprn_close();
//		}else{
//
//		}

//		myHandleDeal("testthmprntextft测试",0);
//		initImage(1000);
//		String printStr1 = storageDir+"/PicBMP/ylsw.bmp";		
//		Bitmap bitmap1=BitmapFactory.decodeFile(printStr1);
//		canvas.drawBitmap(bitmap1,0,20, null);
//		drawImage("-----------點陣字庫-------------",22,3,10,95);
//		drawImage("商戶名(MERCHANT NAME): 新國都",24,3,10,120);
//		drawImage("商户编号(MERCHANT NO.): 124456",24,3,10,150);
//		drawImage("商戶編號(MERCHANT NO.): 124456",24,3,10,180);
//		drawImage("操作員號(OPERATOR NO.): 01",24,3,10,210);
//		drawImage("發卡行(ISSUER): 工商銀行",24,3,10,240);
//		drawImage("收單行(ACQUIRER): 華夏銀行",24,3,10,270);
//		drawImage("卡號(CARD NO.):",24,3,10,300);
//		drawImage(" 621792******3292",30,4,10,325);
//		drawImage(" 621792******3292",30,4,11,325);
//		drawImage("有效期(EXP DATE): 2017/06",24,3,10,360);
//		drawImage("交易類型(TRAN TYPE):",24,3,10,390);
//		//drawImage(" 商戶存根 消費/SALE(C)",30,4,10,415);
//		//drawImage(" 消費/SALE(C)",30,4,11,415);
//		drawImage("批次號(BATCH NO.): 000024",24,3,10,450);
//		drawImage("憑證號(VOUCHER NO.): 000003",24,3,10,480);
//		drawImage("授權碼(AUTH NO.): 124456",24,3,10,510);
//		drawImage("參考號(REFER NO.): 210031895667",24,3,10,540);
//		drawImage("日期/時間(DATE/TIME):",24,3,10,570);
//		drawImage(" 2017-06-14",24,3,10,600);
//		drawImage("金額(AMOUNT):",24,3,10,630);
//		drawImage(" RMB 0.01:",30,6,10,655);
//		drawImage(" RMB 0.01:",30,6,11,655);
//		drawImage("-------------------------------",24,3,10,690);
//		drawImage("備註(REFERENCE)",24,3,10,720);
//		drawImage("AID: A000000333010101",24,3,10,750);
//		drawImage("ARQC: C9BF4290B898976D",24,3,10,780);
//		drawImage("交易金額未超過300.00元，無需簽名",23,3,10,810);
//		//drawImage("交易金額未超過300.00元，無需簽名",23,3,11,810);
//		drawImage("消費消費消費    MERCHANT",24,3,10,840);
//		String printStr2 = storageDir+"/bitmap/test.jpg";
//		File mFile=new File(printStr2);
//		if (mFile.exists()) {
//			Bitmap bitmap=BitmapFactory.decodeFile(printStr2);
//			byte[]data = ByteUtils.toBmpBytes(bitmap);
//			Ddi.ddi_thmprn_open();
//			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data,data.length);
//			if(res==0){
//				myHandleDeal("点阵打印返回成功",res);
//				try {
//					Thread.sleep(500*2);
//				} catch (Exception e) {
//
//				}
//				Ddi.ddi_thmprn_feed_paper(400);
//				Ddi.ddi_thmprn_close();
//			}else{
//				myHandleDeal("testthmprntextft点阵打印返回失败",3);
//			}
//		}else{
//			myHandleDeal("testthmprntextft文件创建失败",2);
//		}

	private void testprintpress2() {
		myHandleDeal("testthmprntext25测试", 0);
		initImage(550);
		String s = "点阵打印加粗O0Il";
		str = s;
		try {
			srtbyte = str.getBytes("GBK");
			s6 = "房房房房".getBytes("GBK");
			s5 = "房房房房".getBytes("GBK");
			s4 = "犇猋骉蟲".getBytes("GBK");
			s3 = "麤掱燚".getBytes("GBK");
			s2 = "麤掱燚".getBytes("GBK");
			s1 = "".getBytes("GBK");
			s7 = "權碼單銀".getBytes("GBK");
			s8 = "超過費號".getBytes("GBK");
			s9 = "授號".getBytes("GBK");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
//		String printStr1 = storageDir+"/PicBMP/ylsw.bmp";
//		Bitmap bitmap1=BitmapFactory.decodeFile(printStr1);
//		canvas.drawBitmap(bitmap1,0,20, null);
		int res1 = ddi_bt.drawdottextblod_TW(mBitmap, s1, 24, 4, 10, 50, 1, 2, 1);
		int res2 = ddi_bt.drawdottextblod_TW(mBitmap, s2, 24, 4, 10, 100, 2, 1, 1);
		int res3 = ddi_bt.drawdottextblod_TW(mBitmap, s3, 24, 4, 10, 150, 1, 1, 1);
		int res4 = ddi_bt.drawdottextblod_TW(mBitmap, s4, 24, 4, 10, 200, 1, 2, 0);
		int res5 = ddi_bt.drawdottextblod_TW(mBitmap, s5, 24, 4, 10, 250, 2, 1, 0);
		int res6 = ddi_bt.drawdottextblod_TW(mBitmap, s6, 24, 4, 10, 300, 1, 1, 0);
		int res8 = ddi_bt.drawdottextblod_TW(mBitmap, s7, 24, 4, 10, 350, 1, 1, 0);
		int res9 = ddi_bt.drawdottextblod_TW(mBitmap, s8, 24, 4, 10, 400, 1, 1, 0);
		int res10 = ddi_bt.drawdottextblod_TW(mBitmap, s9, 24, 4, 10, 450, 1, 1, 0);
		int res7 = ddi_bt.drawdottext(mBitmap, srtbyte, 24, 4, 10, 500, 1, 1);
		if (res1 == 0 && res2 == 0 && res3 == 0 && res4 == 0 && res5 == 0 && res6 == 0 && res7 == 0 && res8 == 0
				&& res9 == 0 && res10 == 0) {
			myHandleDeal("画图成功", res1);
		} else {
			myHandleDeal("thmprntext25画图失败", res1);
		}
		ByteUtils.saveImage(mBitmap);
		String printStr2 = storageDir + "/bitmap/test.jpg";
		
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("点阵打印返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
			} else {
				myHandleDeal("thmprntext25点阵打印返回失败", res);
			}
		} else {
			myHandleDeal("thmprntext25文件创建失败", 2);
		}

	}

	private void testprintpress3() {
		myHandleDeal("testprintpress3测试", 0);
		initImage(900);
		String s = "点阵打印加粗O0Il";
		str = s;
		try {
			srtbyte = str.getBytes("GBK");
			s6 = "魃 魈 魁 鬾 魑 魅 魍 魉".getBytes("GBK");
			s5 = "又 双 叒 叕".getBytes("GBK");
			s4 = "火 炎 焱 燚".getBytes("GBK");
			s3 = "水 沝 淼 㵘".getBytes("GBK");
			s2 = "茕 茕 孑 立 沆 瀣 一 气".getBytes("GBK");
			s1 = "踽 踽 独 行 醍 醐 灌 顶".getBytes("GBK");
			s7 = "绵 绵 瓜 瓞 奉 为 圭 臬".getBytes("GBK");
			s8 = "龙 行 龘 龘 犄 角 旮 旯".getBytes("GBK");
			s9 = "娉 婷 袅 娜 涕 泗 滂 沱".getBytes("GBK");
			s10 = "呶 呶 不 休 不 稂 不 莠".getBytes("GBK");
			s11 = "咄 嗟 蹀 躞 耄 耋 饕 餮".getBytes("GBK");
			s12 = "囹 圄 蘡 薁 觊 觎 龃 龉".getBytes("GBK");
			s13 = "狖 轭 鼯 轩 怙 恶 不 悛".getBytes("GBK");
			s14 = "其 靁 虺 虺 腌 臜 孑 孓".getBytes("GBK");
			s15 = "陟 罚 臧 否 针 砭 时 弊".getBytes("GBK");
			s16 = "鳞 次 栉 比 一 张 一 翕".getBytes("GBK");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
//		String printStr1 = storageDir+"/PicBMP/ylsw.bmp";
//		Bitmap bitmap1=BitmapFactory.decodeFile(printStr1);
//		canvas.drawBitmap(bitmap1,0,20, null);
		int res1 = ddi_bt.drawdottextblod_TW(mBitmap, s1, 24, 4, 10, 50, 1, 1, 0);
		int res2 = ddi_bt.drawdottextblod_TW(mBitmap, s2, 24, 4, 10, 100, 1, 1, 0);
		int res3 = ddi_bt.drawdottextblod_TW(mBitmap, s3, 24, 4, 10, 150, 1, 1, 0);
		int res4 = ddi_bt.drawdottextblod_TW(mBitmap, s4, 24, 4, 10, 200, 1, 1, 0);
		int res5 = ddi_bt.drawdottextblod_TW(mBitmap, s5, 24, 4, 10, 250, 1, 1, 0);
		int res6 = ddi_bt.drawdottextblod_TW(mBitmap, s6, 24, 4, 10, 300, 1, 1, 0);
		int res8 = ddi_bt.drawdottextblod_TW(mBitmap, s7, 24, 4, 10, 350, 1, 1, 0);
		int res9 = ddi_bt.drawdottextblod_TW(mBitmap, s8, 24, 4, 10, 400, 1, 1, 0);
		int res10 = ddi_bt.drawdottextblod_TW(mBitmap, s9, 24, 4, 10, 450, 1, 1, 0);
		int res11 = ddi_bt.drawdottextblod_TW(mBitmap, s10, 24, 4, 10, 500, 1, 1, 0);
		int res12 = ddi_bt.drawdottextblod_TW(mBitmap, s11, 24, 4, 10, 550, 1, 1, 0);
		int res13 = ddi_bt.drawdottextblod_TW(mBitmap, s12, 24, 4, 10, 600, 1, 1, 0);
		int res14 = ddi_bt.drawdottextblod_TW(mBitmap, s13, 24, 4, 10, 650, 1, 1, 0);
		int res15 = ddi_bt.drawdottextblod_TW(mBitmap, s14, 24, 4, 10, 700, 1, 1, 0);
		int res16 = ddi_bt.drawdottextblod_TW(mBitmap, s15, 24, 4, 10, 750, 1, 1, 0);
		int res17 = ddi_bt.drawdottextblod_TW(mBitmap, s16, 24, 4, 10, 800, 1, 1, 0);
		int res7 = ddi_bt.drawdottext(mBitmap, srtbyte, 24, 4, 10, 850, 1, 1);
		if (res1 == 0 && res2 == 0 && res3 == 0 && res4 == 0 && res5 == 0 && res6 == 0 && res7 == 0 && res8 == 0
				&& res9 == 0 && res10 == 0 && res11 == 0 && res12 == 0 && res13 == 0 && res14 == 0 && res15 == 0
				&& res16 == 0 && res17 == 0) {
			myHandleDeal("画图成功", res1);
		} else {
			myHandleDeal("printpress3画图失败", res1);
		}
		ByteUtils.saveImage(mBitmap);
		String printStr2 = storageDir + "/bitmap/test.jpg";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("点阵打印返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
			} else {
				myHandleDeal("printpress3点阵打印返回失败", res);
			}
		} else {
			myHandleDeal("printpress3文件创建失败", 2);
		}

	}
	private void testprintpress5() {
		myHandleDeal("testprintpress5测试", 0);
		initImage(900);
		String s = "点阵打印加粗O0Il";
		str = s;
		try {
			srtbyte = str.getBytes("GBK");
			s6 = "魃 魈 魁 鬾 魑 魅 魍 魉".getBytes("GBK");
			s5 = "又 双 叒 叕浐灞".getBytes("GBK");
			s4 = "火 炎 焱 燚浐灞".getBytes("GBK");
			s3 = "水 沝 淼 㵘浐灞".getBytes("GBK");
			s2 = "茕 茕 孑 立 沆 瀣 一 气".getBytes("GBK");
			s1 = "踽 踽 独 行 醍 醐 灌 顶".getBytes("GBK");
			s7 = "绵 绵 瓜 瓞 奉 为 圭 臬".getBytes("GBK");
			s8 = "龙 行 龘 龘 犄 角 旮 旯".getBytes("GBK");
			s9 = "娉 婷 袅 娜 涕 泗 滂 沱".getBytes("GBK");
			s10 = "呶 呶 不 休 不 稂 不 莠".getBytes("GBK");
			s11 = "咄 嗟 蹀 躞 耄 耋 饕 餮".getBytes("GBK");
			s12 = "囹 圄 蘡 薁 觊 觎 龃 龉".getBytes("GBK");
			s13 = "狖 轭 鼯 轩 怙 恶 不 悛".getBytes("GBK");
			s14 = "其 靁 虺 虺 腌 臜 孑 孓".getBytes("GBK");
			s15 = "陟 罚 臧 否 针 砭 时 弊".getBytes("GBK");
			s16 = "鳞 次 栉 比 一 张 一 翕".getBytes("GBK");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
//		String printStr1 = storageDir+"/PicBMP/ylsw.bmp";
//		Bitmap bitmap1=BitmapFactory.decodeFile(printStr1);
//		canvas.drawBitmap(bitmap1,0,20, null);
		int res1 = ddi_bt.drawdottext(mBitmap, s1, 16, 22, 10, 50, 1, 1);
		int res2 = ddi_bt.drawdottext(mBitmap, s2, 24, 4, 10, 100, 1, 1);
		int res3 = ddi_bt.drawdottext(mBitmap, s3, 32, 4, 10, 150, 1, 1);
		int res4 = ddi_bt.drawdottext(mBitmap, s4, 16, 4, 10, 200, 1, 1);
		int res5 = ddi_bt.drawdottext(mBitmap, s5, 24, 4, 10, 250, 1, 1);
		int res6 = ddi_bt.drawdottext(mBitmap, s6, 32, 4, 10, 300, 1, 1);
		int res8 = ddi_bt.drawdottext(mBitmap, s7, 16, 4, 10, 350, 1, 1);
		int res9 = ddi_bt.drawdottext(mBitmap, s8, 24, 4, 10, 400, 1, 1);
		int res10 = ddi_bt.drawdottext(mBitmap, s9, 32, 4, 10, 450, 1, 1);
		int res11 = ddi_bt.drawdottext(mBitmap, s10, 16, 4, 10, 500, 1, 1);
		int res12 = ddi_bt.drawdottext(mBitmap, s11, 24, 4, 10, 550, 1, 1);
		int res13 = ddi_bt.drawdottext(mBitmap, s12, 32, 4, 10, 600, 1, 1);
		int res14 = ddi_bt.drawdottext(mBitmap, s13, 16, 4, 10, 650, 1, 1);
		int res15 = ddi_bt.drawdottext(mBitmap, s14, 24, 4, 10, 700, 1, 1);
		int res16 = ddi_bt.drawdottext(mBitmap, s15, 32, 4, 10, 750, 1, 1);
		int res17 = ddi_bt.drawdottext(mBitmap, s16, 24, 4, 10, 800, 1, 1);
		int res7 = ddi_bt.drawdottext(mBitmap, srtbyte, 24, 4, 10, 850, 1,1);
		if (res1 == 0 && res2 == 0 && res3 == 0 && res4 == 0 && res5 == 0 && res6 == 0 && res7 == 0 && res8 == 0
				&& res9 == 0 && res10 == 0 && res11 == 0 && res12 == 0 && res13 == 0 && res14 == 0 && res15 == 0
				&& res16 == 0 && res17 == 0) {
			myHandleDeal("画图成功", res1);
		} else {
			myHandleDeal("printpress3画图失败", 1);
		}
		ByteUtils.saveImage(mBitmap);
		String printStr2 = storageDir + "/bitmap/test.jpg";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("点阵打印返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {
					
				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
			} else {
				myHandleDeal("printpress3点阵打印返回失败", res);
			}
		} else {
			myHandleDeal("printpress3文件创建失败", 2);
		}
		
	}
	private void testprintpress6() {
		myHandleDeal("testprintpress5测试", 0);
		initImage(900);
		String s = "点阵打印加粗O0Il";
		str = s;
		try {
			srtbyte = str.getBytes("GBK");
			s6 = "魃 魈 魁 鬾 魑 魅 魍 魉".getBytes("GBK");
			s5 = "又 双 叒 叕浐灞".getBytes("GBK");
			s4 = "火 炎 焱 燚浐灞".getBytes("GBK");
			s3 = "水 沝 淼 㵘浐灞".getBytes("GBK");
			s2 = "茕 茕 孑 立 沆 瀣 一 气浐灞".getBytes("GBK");
			s1 = "踽 踽 独 行 醍 醐 灌 顶浐灞".getBytes("GBK");
			s7 = "绵 绵 瓜 瓞 奉 为 圭 臬浐灞".getBytes("GBK");
			s8 = "龙 行 龘 龘 犄 角 旮 旯浐灞".getBytes("GBK");
			s9 = "娉 婷 袅 娜 涕 泗 滂 沱浐灞".getBytes("GBK");
			s10 = "呶 呶 不 休 不 稂 不 莠浐灞".getBytes("GBK");
			s11 = "咄 嗟 蹀 躞 耄 耋 饕 餮浐灞".getBytes("GBK");
			s12 = "囹 圄 蘡 薁 觊 觎 龃 龉浐灞".getBytes("GBK");
			s13 = "狖 轭 鼯 轩 怙 恶 不 悛浐灞".getBytes("GBK");
			s14 = "其 靁 虺 虺 腌 臜 孑 孓浐灞".getBytes("GBK");
			s15 = "陟 罚 臧 否 针 砭 时 弊浐灞".getBytes("GBK");
			s16 = "鳞 次 栉 比 一 张 一 翕浐灞".getBytes("GBK");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
//		String printStr1 = storageDir+"/PicBMP/ylsw.bmp";
//		Bitmap bitmap1=BitmapFactory.decodeFile(printStr1);
//		canvas.drawBitmap(bitmap1,0,20, null);
		int res1 = ddi_bt.drawdottext(mBitmap, s1, 16, 22, 10, 50, 1, 1);
		int res2 = ddi_bt.drawdottext(mBitmap, s2, 16, 4, 10, 100, 1, 1);
		int res3 = ddi_bt.drawdottext(mBitmap, s3, 16, 4, 10, 150, 1, 1);
		int res4 = ddi_bt.drawdottext(mBitmap, s4, 16, 4, 10, 200, 1, 1);
		int res5 = ddi_bt.drawdottext(mBitmap, s5, 16, 4, 10, 250, 1, 1);
		int res6 = ddi_bt.drawdottext(mBitmap, s6, 16, 4, 10, 300, 1, 1);
		int res8 = ddi_bt.drawdottext(mBitmap, s7, 16, 4, 10, 350, 1, 1);
		int res9 = ddi_bt.drawdottext(mBitmap, s8, 16, 4, 10, 400, 1, 1);
		int res10 = ddi_bt.drawdottext(mBitmap, s9, 16, 4, 10, 450, 1, 1);
		int res11 = ddi_bt.drawdottext(mBitmap, s10, 16, 4, 10, 500, 1, 1);
		int res12 = ddi_bt.drawdottext(mBitmap, s11, 16, 4, 10, 550, 1, 1);
		int res13 = ddi_bt.drawdottext(mBitmap, s12, 16, 4, 10, 600, 1, 1);
		int res14 = ddi_bt.drawdottext(mBitmap, s13, 16, 4, 10, 650, 1, 1);
		int res15 = ddi_bt.drawdottext(mBitmap, s14, 16, 4, 10, 700, 1, 1);
		int res16 = ddi_bt.drawdottext(mBitmap, s15, 16, 4, 10, 750, 1, 1);
		int res17 = ddi_bt.drawdottext(mBitmap, s16, 16, 4, 10, 800, 1, 1);
		int res7 = ddi_bt.drawdottext(mBitmap, srtbyte, 16, 4, 10, 850, 1,1);
		if (res1 == 0 && res2 == 0 && res3 == 0 && res4 == 0 && res5 == 0 && res6 == 0 && res7 == 0 && res8 == 0
				&& res9 == 0 && res10 == 0 && res11 == 0 && res12 == 0 && res13 == 0 && res14 == 0 && res15 == 0
				&& res16 == 0 && res17 == 0) {
			myHandleDeal("画图成功", res1);
		} else {
			myHandleDeal("printpress3画图失败", 1);
		}
		ByteUtils.saveImage(mBitmap);
		String printStr2 = storageDir + "/bitmap/test.jpg";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("点阵打印返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {
					
				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
			} else {
				myHandleDeal("printpress3点阵打印返回失败", res);
			}
		} else {
			myHandleDeal("printpress3文件创建失败", 2);
		}
		
	}
	private void testprintpress7() {
		myHandleDeal("testprintpress7测试", 0);
		initImage(900);
		String s = "点阵打印加粗O0Il";
		str = s;
		try {
			srtbyte = str.getBytes("GBK");
			s6 = "魃 魈 魁 鬾 魑 魅 魍 魉".getBytes("GBK");
			s5 = "又 双 叒 叕浐灞".getBytes("GBK");
			s4 = "火 炎 焱 燚浐灞".getBytes("GBK");
			s3 = "水 沝 淼 㵘浐灞".getBytes("GBK");
			s2 = "茕 茕 孑 立 沆 瀣 一 气浐灞".getBytes("GBK");
			s1 = "踽 踽 独 行 醍 醐 灌 顶浐灞".getBytes("GBK");
			s7 = "绵 绵 瓜 瓞 奉 为 圭 臬浐灞".getBytes("GBK");
			s8 = "龙 行 龘 龘 犄 角 旮 旯浐灞".getBytes("GBK");
			s9 = "娉 婷 袅 娜 涕 泗 滂 沱浐灞".getBytes("GBK");
			s10 = "呶 呶 不 休 不 稂 不 莠浐灞".getBytes("GBK");
			s11 = "咄 嗟 蹀 躞 耄 耋 饕 餮浐灞".getBytes("GBK");
			s12 = "囹 圄 蘡 薁 觊 觎 龃 龉浐灞".getBytes("GBK");
			s13 = "狖 轭 鼯 轩 怙 恶 不 悛浐灞".getBytes("GBK");
			s14 = "其 靁 虺 虺 腌 臜 孑 孓浐灞".getBytes("GBK");
			s15 = "陟 罚 臧 否 针 砭 时 弊浐灞".getBytes("GBK");
			s16 = "鳞 次 栉 比 一 张 一 翕浐灞".getBytes("GBK");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
//		String printStr1 = storageDir+"/PicBMP/ylsw.bmp";
//		Bitmap bitmap1=BitmapFactory.decodeFile(printStr1);
//		canvas.drawBitmap(bitmap1,0,20, null);
		int res1 = ddi_bt.drawdottext(mBitmap, s1, 24, 22, 10, 50, 1, 1);
		int res2 = ddi_bt.drawdottext(mBitmap, s2, 24, 4, 10, 100, 1, 1);
		int res3 = ddi_bt.drawdottext(mBitmap, s3, 24, 4, 10, 150, 1, 1);
		int res4 = ddi_bt.drawdottext(mBitmap, s4, 24, 4, 10, 200, 1, 1);
		int res5 = ddi_bt.drawdottext(mBitmap, s5, 24, 4, 10, 250, 1, 1);
		int res6 = ddi_bt.drawdottext(mBitmap, s6, 24, 4, 10, 300, 1, 1);
		int res8 = ddi_bt.drawdottext(mBitmap, s7, 24, 4, 10, 350, 1, 1);
		int res9 = ddi_bt.drawdottext(mBitmap, s8, 24, 4, 10, 400, 1, 1);
		int res10 = ddi_bt.drawdottext(mBitmap, s9, 24, 4, 10, 450, 1, 1);
		int res11 = ddi_bt.drawdottext(mBitmap, s10, 24, 4, 10, 500, 1, 1);
		int res12 = ddi_bt.drawdottext(mBitmap, s11, 24, 4, 10, 550, 1, 1);
		int res13 = ddi_bt.drawdottext(mBitmap, s12, 24, 4, 10, 600, 1, 1);
		int res14 = ddi_bt.drawdottext(mBitmap, s13, 24, 4, 10, 650, 1, 1);
		int res15 = ddi_bt.drawdottext(mBitmap, s14, 24, 4, 10, 700, 1, 1);
		int res16 = ddi_bt.drawdottext(mBitmap, s15, 24, 4, 10, 750, 1, 1);
		int res17 = ddi_bt.drawdottext(mBitmap, s16, 24, 4, 10, 800, 1, 1);
		int res7 = ddi_bt.drawdottext(mBitmap, srtbyte, 16, 4, 10, 850, 1,1);
		if (res1 == 0 && res2 == 0 && res3 == 0 && res4 == 0 && res5 == 0 && res6 == 0 && res7 == 0 && res8 == 0
				&& res9 == 0 && res10 == 0 && res11 == 0 && res12 == 0 && res13 == 0 && res14 == 0 && res15 == 0
				&& res16 == 0 && res17 == 0) {
			myHandleDeal("画图成功", res1);
		} else {
			myHandleDeal("printpress3画图失败", res1);
		}
		ByteUtils.saveImage(mBitmap);
		String printStr2 = storageDir + "/bitmap/test.jpg";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("点阵打印返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {
					
				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
			} else {
				myHandleDeal("printpress3点阵打印返回失败", res);
			}
		} else {
			myHandleDeal("printpress3文件创建失败", 2);
		}
		
	}
	private void testprintpress8() {
		myHandleDeal("testprintpress8测试", 0);
		initImage(900);
		String s = "点阵打印加粗O0Il";
		str = s;
		try {
			srtbyte = str.getBytes("GBK");
			s6 = "魃 魈 魁 鬾 魑 魅 魍 魉".getBytes("GBK");
			s5 = "又 双 叒 叕浐灞".getBytes("GBK");
			s4 = "火 炎 焱 燚浐灞".getBytes("GBK");
			s3 = "水 沝 淼 㵘浐灞".getBytes("GBK");
			s2 = "茕 茕 孑 立 沆 瀣 一 气浐灞".getBytes("GBK");
			s1 = "踽 踽 独 行 醍 醐 灌 顶浐灞".getBytes("GBK");
			s7 = "绵 绵 瓜 瓞 奉 为 圭 臬浐灞".getBytes("GBK");
			s8 = "龙 行 龘 龘 犄 角 旮 旯浐灞".getBytes("GBK");
			s9 = "娉 婷 袅 娜 涕 泗 滂 沱浐灞".getBytes("GBK");
			s10 = "呶 呶 不 休 不 稂 不 莠浐灞".getBytes("GBK");
			s11 = "咄 嗟 蹀 躞 耄 耋 饕 餮浐灞".getBytes("GBK");
			s12 = "囹 圄 蘡 薁 觊 觎 龃 龉浐灞".getBytes("GBK");
			s13 = "狖 轭 鼯 轩 怙 恶 不 悛浐灞".getBytes("GBK");
			s14 = "其 靁 虺 虺 腌 臜 孑 孓浐灞".getBytes("GBK");
			s15 = "陟 罚 臧 否 针 砭 时 弊浐灞".getBytes("GBK");
			s16 = "鳞 次 栉 比 一 张 一 翕浐灞".getBytes("GBK");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
//		String printStr1 = storageDir+"/PicBMP/ylsw.bmp";
//		Bitmap bitmap1=BitmapFactory.decodeFile(printStr1);
//		canvas.drawBitmap(bitmap1,0,20, null);
		int res1 = ddi_bt.drawdottext(mBitmap, s1, 32, 22, 10, 50, 1, 1);
		int res2 = ddi_bt.drawdottext(mBitmap, s2, 32, 4, 10, 100, 1, 1);
		int res3 = ddi_bt.drawdottext(mBitmap, s3, 32, 4, 10, 150, 1, 1);
		int res4 = ddi_bt.drawdottext(mBitmap, s4, 32, 4, 10, 200, 1, 1);
		int res5 = ddi_bt.drawdottext(mBitmap, s5, 32, 4, 10, 250, 1, 1);
		int res6 = ddi_bt.drawdottext(mBitmap, s6, 32, 4, 10, 300, 1, 1);
		int res8 = ddi_bt.drawdottext(mBitmap, s7, 32, 4, 10, 350, 1, 1);
		int res9 = ddi_bt.drawdottext(mBitmap, s8, 32, 4, 10, 400, 1, 1);
		int res10 = ddi_bt.drawdottext(mBitmap, s9, 32, 4, 10, 450, 1, 1);
		int res11 = ddi_bt.drawdottext(mBitmap, s10, 32, 4, 10, 500, 1, 1);
		int res12 = ddi_bt.drawdottext(mBitmap, s11, 32, 4, 10, 550, 1, 1);
		int res13 = ddi_bt.drawdottext(mBitmap, s12, 32, 4, 10, 600, 1, 1);
		int res14 = ddi_bt.drawdottext(mBitmap, s13, 32, 4, 10, 650, 1, 1);
		int res15 = ddi_bt.drawdottext(mBitmap, s14, 32, 4, 10, 700, 1, 1);
		int res16 = ddi_bt.drawdottext(mBitmap, s15, 32, 4, 10, 750, 1, 1);
		int res17 = ddi_bt.drawdottext(mBitmap, s16, 32, 4, 10, 800, 1, 1);
		int res7 = ddi_bt.drawdottext(mBitmap, srtbyte, 32, 4, 10, 850, 1,1);
		if (res1 == 0 && res2 == 0 && res3 == 0 && res4 == 0 && res5 == 0 && res6 == 0 && res7 == 0 && res8 == 0
				&& res9 == 0 && res10 == 0 && res11 == 0 && res12 == 0 && res13 == 0 && res14 == 0 && res15 == 0
				&& res16 == 0 && res17 == 0) {
			myHandleDeal("画图成功", res1);
		} else {
			myHandleDeal("printpress3画图失败", res1);
		}
		ByteUtils.saveImage(mBitmap);
		String printStr2 = storageDir + "/bitmap/test.jpg";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("点阵打印返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {
					
				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
			} else {
				myHandleDeal("printpress3点阵打印返回失败", res);
			}
		} else {
			myHandleDeal("printpress3文件创建失败", 2);
		}
		
	}

	private void testprintpress4() {
		myHandleDeal("testprintpress4测试", 0);
		initImage(1000);
		String printStr1 = storageDir + "/PicBMP/ylsw.bmp";
		Bitmap bitmap1 = BitmapFactory.decodeFile(printStr1);
		canvas.drawBitmap(bitmap1, 0, 20, null);
		drawImage2("-----------矢量字库-------------", 22, 10, 115);
		drawImage2("商户名(MERCHANT NAME): 新国都", 24, 10, 140);
		drawImage2("商户编号(MERCHANT NO.): 124456", 24, 10, 170);
		drawImage2("终端编号(TERMINAL NO.): 124456", 24, 10, 200);
		drawImage2("操作员号(OPERATOR NO.): 01", 24, 10, 230);
		drawImage2("发卡行(ISSUER): 工商银行", 24, 10, 260);
		drawImage2("收单行(ACQUIRER): 华夏银行", 24, 10, 290);
		drawImage2("卡号(CARD NO.):", 24, 10, 310);
		drawImage2(" 621792******3292", 30, 10, 350);
		drawImage2(" 621792******3292", 30, 11, 350);
		drawImage2("有效期(EXP DATE): 2017/06", 24, 10, 380);
		drawImage2("交易类型(TRAN TYPE):", 24, 10, 410);
		drawImage2(" 消费/SALE(C)", 30, 10, 440);
		drawImage2(" 消费/SALE(C)", 30, 11, 440);
		drawImage2("批次号(BATCH NO.): 000024", 24, 10, 470);
		drawImage2("凭证号(VOUCHER NO.): 000003", 24, 10, 500);
		drawImage2("授权码(AUTH NO.): 124456", 24, 10, 530);
		drawImage2("参考号(REFER NO.): 210031895667", 24, 10, 560);
		drawImage2("日期/时间(DATE/TIME):", 24, 10, 590);
		drawImage2(" 2017-06-14", 24, 10, 620);
		drawImage2("金额(AMOUNT):", 24, 10, 650);
		drawImage2(" RMB 0.01:", 30, 10, 680);
		drawImage2(" RMB 0.01:", 30, 11, 680);
		drawImage2("-------------------------------", 24, 10, 710);
		drawImage2("备注(REFERENCE)", 24, 10, 740);
		drawImage2("AID: A000000333010101", 24, 10, 770);
		drawImage2("ARQC: C9BF4290B898976D", 24, 10, 800);
		drawImage2("交易金额未超过300.00元，无需签名", 23, 10, 830);
		drawImage2("交易金额未超过300.00元，无需签名", 23, 11, 830);
		drawImage2("商户存根    MERCHANT", 24, 10, 860);
		String printStr2 = storageDir + "/bitmap/test.jpg";
		File mFile = new File(printStr2);
		if (mFile.exists()) {
			Bitmap bitmap = BitmapFactory.decodeFile(printStr2);
			byte[] data = ByteUtils.toBmpBytes(bitmap);
			Ddi.ddi_thmprn_open();
			int res = Ddi.ddi_thmprn_print_oneBitBMPImageByBuffer(data, data.length);
			if (res == 0) {
				myHandleDeal("printpress4矢量打印返回成功", res);
				try {
					Thread.sleep(500*2);
				} catch (Exception e) {

				}
				Ddi.ddi_thmprn_feed_paper(400);
				Ddi.ddi_thmprn_close();
			} else {
				myHandleDeal("printpress4矢量打印返回失败", res);
			}
		} else {
			myHandleDeal("printpress4文件创建失败", 1);
		}
	}

	public void initImage(int n) {
		mBitmap = Bitmap.createBitmap(384, n, Config.ARGB_8888);
		canvas = new Canvas(mBitmap);
		Paint paint = new Paint();
		canvas.drawColor(Color.WHITE);
		paint.setColor(Color.BLACK);
		canvas.drawBitmap(mBitmap, 0, 0, null);
		canvas.drawLine(0, 10, 384, 10, paint);
	}

	public void drawImage(String s, int m, int n, int x, int y) {
		str = s;
		try {
			srtbyte = str.getBytes("GBK");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		// 这个其实就是点帧字库
		ddi_bt.drawdottext(mBitmap, srtbyte, m, n, x, y, 1, 1);
		ByteUtils.saveImage(mBitmap);
	}

	public void drawImage2(String s, int m, int x, int y) {
		str = s;
		try {
			srtbyte = str.getBytes("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} // ttf就是矢量字库
		String S = "/system/fonts/NotoSansHans-Light_new.ttf";
		// 制定了用哪个字库
		ddi_bt.setfont(S, S.length());
		ddi_bt.drawIntoBitmap(mBitmap, srtbyte, m, x, y, 1);
		ByteUtils.saveImage(mBitmap);
	}
}
