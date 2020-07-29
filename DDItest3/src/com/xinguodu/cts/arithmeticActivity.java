package com.xinguodu.cts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import com.xinguodu.ddiinterface.Ddi;
import com.xinguodu.ddiinterface.GeneralDdi;
import com.xinguodu.ddiinterface.KeyCode;
import com.xinguodu.pincontrol.PinControl;

import android.R.string;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
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

public class arithmeticActivity extends Activity {

	private TextView tv;
	private TextView tv1;
	private Button bt1;
	private Spinner spinner;
	private ScrollView scrollView;
	private boolean Btflg = false;
	private boolean Thflg = true;
	private boolean Thflg1 = false;
	private long TotalCount = 0;
	private long SucessCount = 0;
	private int cnt = 0, statusRet = 0, cardTypeFlag = 0,Bslot = 0;
	private long Failcount = 0;
	private long SucessRate = 0;
	static byte wParam[] = new byte[20];
	private String mstring = "00000000000000000000000000000000000000000000000000000000000000000000000000000000";
	private TextView mTotalTextView = null;
	static byte[] atr = new byte[33];
	private TextView mSucessTextView = null;
	private TextView mFailTextView = null;
	private TextView mSucessRateTextView = null;
	public static final int track1Len = 79+1;
	public static final int track2Len = 40+1;
	public static final int track3Len = 107+1;
	static byte track1[] = new byte[track1Len];
	static byte track2[] = new byte[track2Len];
	static byte track3[] = new byte[track3Len];
	private byte[] lpOut;
	private byte[] keycode= {KeyCode.KEYCODE_0,KeyCode.KEYCODE_1,KeyCode.KEYCODE_2,KeyCode.KEYCODE_3,KeyCode.KEYCODE_4,KeyCode.KEYCODE_5,KeyCode.KEYCODE_6
			,KeyCode.KEYCODE_7,KeyCode.KEYCODE_8,KeyCode.KEYCODE_9,KeyCode.KEYCODE_STAR,KeyCode.KEYCODE_OCTOTHORPE,KeyCode.KEYCODE_CANCEL,KeyCode.KEYCODE_BACKSPACE
			,KeyCode.KEYCODE_CLEAR,KeyCode.KEYCODE_CONFIRM};
	private int mode0=0;
	private int mode1=1;
	

	private Thread mThread = new Thread(new Runnable() {

		@Override
		public void run() {
			while (Thflg) {
				if (Btflg) {
//					testgetcardno1();
					testcardimput1();
					testcardimput2();
					testcardimput3();
					testcardimput4();
//				    testimputdata1();
					testinputcancel1();
					testgetrandom1();
					testgetrandom2();
					testgetrandom3();
					testsetinputindex1();
					testsetinputindex2();
					testsetclearmode1();
					testsetclearmode2();
					testsetclearmode3();
					testmaskmode1();
					testmaskmode2();
					testmaskmode3();
					testgetrandom4();
//					testgetcardno1();
					testgetrandom5();
					//����IC�������
//					testrtctime15();
					testdealcmd1();
					testdealcmd2();
					testdealcmd3();
					testdealcmd4();
					testdealcmd5();
//					testdealcmd6();
					testpermission1();
					testpermission2();
					testpermission3();
					testpermission4();
					
					
					
					
					
					
					testend();
					Btflg = false;
				}
			}
		}
	});
	//���ݷ���ֵ�Ա���������ʾ
	private Handler myHandler = new Handler() {
		public void handleMessage(Message msg) {
			String infoString = msg.obj.toString() + " ����ֵ: " + msg.arg1;
			if (infoString.contains("test")) {
				TotalCount++;
				tv.append(" " + msg.obj.toString() + "\n");
			} else {
				if (infoString.contains("ʧ��")) {
					Failcount++;
					tv1.append("   " + infoString + "\n");
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
	  static public String bytearrayToCharString(byte[] b)
		{
			StringBuffer strbuf = new StringBuffer();

			for (int i = 0; i < b.length; i++)
			{
				if (b[i] == '\0')
				{
					break;
				}
				strbuf.append((char) b[i]);
			}

			return strbuf.toString();
		}

	private void scrollToBottom() {
		scrollView.post(new Runnable() {
			public void run() {
				scrollView.smoothScrollTo(0, tv.getBottom());
			}
		});
	}
   //��ʾ��UI������ʾ��������������
	private void myHandleDeal(String info, int ret) {
		try {
			testtoolclass.creatcsv(ret, info);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		StringBuilder sb1 = new StringBuilder(1025);
		Message myMessage = myHandler.obtainMessage();
		myMessage.obj = info;
		myMessage.arg1 = ret;
		myHandler.sendMessage(myMessage);
//		sb1.append(info + "  " + ret + ",\r\n");
//		// Log.v("print", sb1.toString());
//		String filepath = "/mnt/sdcard/test.txt";
//		File file = new File(filepath);
//		if (!file.exists()) {
//			try {
//				file.delete();
//				file.createNewFile();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		try {
//			FileOutputStream fo = new FileOutputStream(file, true);
//			fo.write(sb1.toString().getBytes());
//			fo.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

	}
    GeneralDdi gDdi = new GeneralDdi();
	Ddi Ddi = new Ddi();
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);// ȥ��������
		setContentView(R.layout.activity_arithmetic);
		Thflg1=true;
		lpOut = new byte[20];
		Ddi.ddi_ddi_sys_init();//�����Ǽ���һ�������൱�ڼ���K21�ķ���
		initview();
		mThread.start();
		run();
	}
	

  


	private void initview() {	
		tv = (TextView)findViewById(R.id.umstv);
		tv1 = (TextView)findViewById(R.id.umstv1);
		bt1 = (Button)findViewById(R.id.umsbt1);
		spinner = (Spinner) findViewById(R.id.umsspinner);
		scrollView = (ScrollView)findViewById(R.id.umsscrollView);
		mTotalTextView = (TextView)findViewById(R.id.umstext_total);
		mSucessTextView = (TextView)findViewById(R.id.umstext_sucess);
		mFailTextView = (TextView)findViewById(R.id.umstext_fail);
		mSucessRateTextView = (TextView)findViewById(R.id.umstext_sucess_rate);
	}

	private void run() {
		bt1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				if (Btflg) {
					Toast.makeText(getApplicationContext(), "�����У���ȴ�",
							Toast.LENGTH_SHORT).show();
					// Btflg = false;
				} else {
					Btflg = true;
				}
			}
		});
		spinner.setOnItemSelectedListener(new OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int pos, long id) {
				if (Btflg) {
					Toast.makeText(getApplicationContext(), "�����У���ȴ�",
							Toast.LENGTH_SHORT).show();
				} else {
					tv.setText("");
					switch (pos) {
					case 1:
						testcardimput1();
						break;
					case 2:
						testcardimput2();
						break;
					case 3:
						testcardimput3();
						break;
					case 4:
						testcardimput4();
						break;
					case 5:
						testimputdata1();
						break;
					case 6:
						testinputcancel1();
						break;
					case 7:
						testgetrandom1();
						break;
					case 8:
						testgetrandom2();
						break;
					case 9:
						testgetrandom3();
						break;
					case 10:
						testsetinputindex1();
						break;
					case 11:
						testsetinputindex2();
						break;
					case 12:
						testsetclearmode1();
						break;
					case 13:
						testsetclearmode2();
						break;
					case 14:
						testsetclearmode3();
						break;
					case 15:
						testmaskmode1();
						break;
					case 16:
						testmaskmode2();
						break;
					case 17:
						testmaskmode3();
						break;
					case 18:
						testgetrandom4();
						break;
					case 19:
						testgetcardno1();
						break;
					case 20:
						testgetrandom5();
						break;
					case 21:
						testiccardimputtimes();
						break;
					case 22:
						testRFcardimputtimes();
						break;
					case 23:
						testrtctime15();
						break;
					case 24:
						testdealcmd1();
						break;
					case 25:
						testdealcmd2();
						break;
					case 26:
						testdealcmd3();
						break;
					case 27:
						testdealcmd4();
						break;
					case 28:
						testdealcmd5();
						break;
					case 29:
						testdealcmd6();
						break;
					case 30:
						testpermission1();
						break;
					case 31:
						testpermission2();
						break;
					case 32:
						testpermission3();
						break;
					case 33:
						testpermission4();
						break;
					default:
						break;
					}
				}
			}

			private void testgetcardno1() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// Another interface callback
			}
		});
	}
    //���������� �򿪿�������
	
	private void testend(){
		myHandleDeal("runall���Խ���",0);
	}
	private void testcardimput1() {
		myHandleDeal("testcardimput1����", 0);
		int res = gDdi.ddi_sred_cardno_set_inputmode(mode0, 16, 19, 30);
		if (res == 0) {
			myHandleDeal("cardimput1�ɹ�:", res);
		} else {
			myHandleDeal("cardimput1ʧ��", res);
		} 
	}
	private void testcardimput2() {
		myHandleDeal("testcardimput2����", 0);
		int res = gDdi.ddi_sred_cardno_set_inputmode(mode1, 16, 19, 30);
		if (res == 0) {
			myHandleDeal("cardimput2�ɹ�:", res);
		} else {
			myHandleDeal("cardimput2ʧ��", res);
		} 
	}
	private void testcardimput3() {
		myHandleDeal("testcardimput3����", 0);
		int res = gDdi.ddi_sred_cardno_set_inputmode(mode1, 19, 16, 30);
		int res1 = gDdi.ddi_sred_cardno_set_inputmode(mode1, 19, 19, 30);
		int res2 = gDdi.ddi_sred_cardno_set_inputmode(mode1, 16, 16, 30);
		if (res == 0&&res1==0&&res2==0) {
			myHandleDeal("cardimput3�ɹ�:", res);
		} else {
			myHandleDeal("cardimput3ʧ��", res);
		} 
	}
	private void testcardimput4() {
		myHandleDeal("testcardimput4����", 0);
		int res = gDdi.ddi_sred_cardno_set_inputmode(-1, 10, 15, 30);
		int res1 = gDdi.ddi_sred_cardno_set_inputmode(mode1, 15, 18, 30);
		int res2 = gDdi.ddi_sred_cardno_set_inputmode(mode1, 16, -1, 30);
		int res3 = gDdi.ddi_sred_cardno_set_inputmode(mode1, 16, 20, -1);
		if (res == -6&&res1==-6&&res2==-6&&res3==-6) {
			myHandleDeal("cardimput4�ɹ�:", 0);
		} else {
			myHandleDeal("cardimput4ʧ��"+res+res1+res2+res3, res);
		} 
	}
    //�����������
	private void testimputdata1() {
		myHandleDeal("testimputdata1����", 0);
//		Log.e("AndroidRuntime", "testimputdata1");
		int res=-1;
//		for (int i = 0; i < keycode.length; i++) {
			byte[] ipkeykode= new byte[8];
			 res = gDdi.ddi_sred_cardno_inputdata(mode0, ipkeykode);
			 String randomdata=ByteUtils.byteArray2HexString(ipkeykode);
			 
			 if (res == 0) {
					myHandleDeal("imputdata1�ɹ�:"+randomdata, res);
				} else {
					myHandleDeal("imputdata1ʧ��"+randomdata, res);
				} 
//		}
		
		
	}
	//ȡ����������
	private void testinputcancel1() {
//		Log.e("AndroidRuntime", "testimputdata1");
		myHandleDeal("testinputcancel1����", 0);
		int res=-99;
		for (int i = 0; i < 50; i++) 
		{
		res = gDdi. ddi_sred_cardno_inputcancel();		
		}
		if (res == 0) {
			myHandleDeal("inputcancel1�ɹ�:", res);
		} else {
			myHandleDeal("inputcancel1ʧ��", res);
		} 
	}
	//��ȡ�����������
	private void testgetrandom1() {
		myHandleDeal("testgetrandom1����", 0);
		byte[] random = new byte[10];
		int res = gDdi.  ddi_sred_cardno_getinputlayout(mode0, 10,random);
		String randomdata=ByteUtils.byteArray2HexString(random);
		if (res == 0) {
			myHandleDeal("getrandom1�ɹ�:"+randomdata, res);
		} else {
			myHandleDeal("getrandom1ʧ��", res);
		} 
	}
	private void testgetrandom2() {
		myHandleDeal("testgetrandom2����", 0);
		byte[] random = new byte[10];
		int res = gDdi.ddi_sred_cardno_getinputlayout(mode0, 0,random);
		String randomdata=ByteUtils.byteArray2HexString(random);
		if (res == -6) {
			myHandleDeal("getrandom2�ɹ�:"+randomdata, res);
		} else {
			myHandleDeal("getrandom2ʧ��", res);
		} 
	}
	private void testgetrandom3() {
		myHandleDeal("testgetrandom3����", 0);
		byte[] random = new byte[10];
		int res = gDdi.ddi_sred_cardno_getinputlayout(mode0, -1,random);
		int res1 = gDdi.ddi_sred_cardno_getinputlayout(mode0, 10,random);
		String randomdata=ByteUtils.byteArray2HexString(random);
		
		if (res == -6&&res1==0) {
			myHandleDeal("getrandom3�ɹ�:", 0);
		} else {
			myHandleDeal("getrandom3ʧ��"+res+res1, res);
		} 
	}
	private void testgetrandom4() {
		myHandleDeal("testgetrandom4����", 0);
		byte[] random = new byte[10];
		int res = gDdi.  ddi_sred_cardno_getinputlayout(mode0, 1,random);
		String randomdata=ByteUtils.byteArray2HexString(random);
		if (res == -6) {
			myHandleDeal("getrandom4�ɹ�:"+randomdata, res);
		} else {
			myHandleDeal("getrandom4ʧ��", res);
		} 
	}
	
	private void testgetrandom5() {
		myHandleDeal("testgetrandom5����", 0);
		byte[] random = new byte[10];
		int res = gDdi.  ddi_sred_cardno_getinputlayout(mode0, 10,random);
		myHandleDeal("testgetrandom5��ȡ������ɹ�", res);
		for (int i = 0; i < 50; i++) {
			int res1 = gDdi.  ddi_sred_cardno_getinputlayout(mode0, 10,random);
		}
		int res3 = gDdi.  ddi_sred_cardno_getinputlayout(mode0, 10,random);
		String randomdata=ByteUtils.byteArray2HexString(random);
		if (res3 == 0) {
			myHandleDeal("getrandom5�ɹ�:"+randomdata, res3);
		} else {
			myHandleDeal("getrandom5ʧ��", res);
		} 
	}
	//�������뿨������
	private void testsetinputindex1() {
		myHandleDeal("testsetinputindex1����", 0);
		byte[] random = new byte[1];
		int res = gDdi.ddi_sred_cardno_setinputindex(mode0, 1,random);
		String randomdata=ByteUtils.byteArray2HexString(random);
		if (res == 0) {
			myHandleDeal("setinputindex1�ɹ�:"+randomdata, 0);
		} else {
			myHandleDeal("setinputindex1ʧ��"+randomdata+"=="+res, res);
		} 
	}
	private void testsetinputindex2() {
		myHandleDeal("testsetinputindex2����", 0);
		byte[] random = new byte[2];
		int res = gDdi.ddi_sred_cardno_setinputindex(mode0, 2,random);
		String randomdata=ByteUtils.byteArray2HexString(random);
		if (res == -6) {
			myHandleDeal("setinputindex2�ɹ�:"+randomdata, 0);
		} else {
			myHandleDeal("setinputindex2ʧ��"+randomdata+"=="+res, res);
		} 
	}
	//�������ģʽ setclearmode
	private void testsetclearmode1() {
		myHandleDeal("testsetclearmode1����", 0);
		int res = gDdi.ddi_sred_cardno_setclearmode(mode0);
		if (res == 0) {
			myHandleDeal("setclearmode1�ɹ�:", 0);
		} else {
			myHandleDeal("setclearmode1ʧ��", res);
		} 
	}
	private void testsetclearmode2() {
		myHandleDeal("testsetclearmode2����", 0);
		int res = gDdi.ddi_sred_cardno_setclearmode(mode1);
		if (res == 0) {
			myHandleDeal("setclearmode2�ɹ�:", 0);
		} else {
			myHandleDeal("setclearmode2ʧ��", res);
		} 
	}
	private void testsetclearmode3() {
		myHandleDeal("testsetclearmode3����", 0);
		int res = gDdi.ddi_sred_cardno_setclearmode(2);
		if (res == -6) {
			myHandleDeal("setclearmode3�ɹ�:", 0);
		} else {
			myHandleDeal("setclearmode3ʧ��", res);
		} 
	}
	//�������˺����뷽ʽ���������ã�Ĭ��֧��ǰ6��4������ʾ������*��
	private void testmaskmode1() {
		myHandleDeal("testmaskmode1����", 0);
		int res = gDdi.ddi_sred_getcardno_maskmode(mode0, 4, 6);
		int res1 = gDdi.ddi_sred_getcardno_maskmode(mode0, 6, 4);
		if (res == 0&&res1==0) {
			myHandleDeal("maskmode1�ɹ�:", 0);
		} else {
			myHandleDeal("maskmode1ʧ��", res);
		} 
	}
	private void testmaskmode2() {
		myHandleDeal("testmaskmode2����", 0);
		int res = gDdi.ddi_sred_getcardno_maskmode(mode1, 6, 4);
		int res1 = gDdi.ddi_sred_getcardno_maskmode(mode1, 5, 5);
		int res2 = gDdi.ddi_sred_getcardno_maskmode(mode1, 0, 10);
		if (res == 0&&res1==0&&res2==0) {
			myHandleDeal("maskmode2�ɹ�:", 0);
		} else {
			myHandleDeal("maskmode2ʧ��", res);
		} 
	}
	private void testmaskmode3() {
		myHandleDeal("testmaskmode3����", 0);
		int res = gDdi.ddi_sred_getcardno_maskmode(-1, 6, 4);
		int res1 = gDdi.ddi_sred_getcardno_maskmode(mode1, -1, 5);
		int res2 = gDdi.ddi_sred_getcardno_maskmode(mode1, 0, -1);
		if (res == -6&&res1==-6&&res2==-6) {
			myHandleDeal("maskmode3�ɹ�:", 0);
		} else {
			myHandleDeal("maskmode3ʧ��"+res1+res2+res, res);
		} 
	}
	/***
	 * ��Ҫǩ���֣�ǩ����ӿڲ�������
	 * �ýӿ���Ҫ�����Ӧ��ʹ�õģ���ҪӦ�û�ȡȨ�޺���ܵ��ö�Ӧ�Ľӿ�
	 * permission_len:�������ݵĳ��ȣ����Ϊ256
	 * permission��Ŀǰ����ֻ��֧����Щ��Ŀ
	 * ��Ҫreleaseģʽ������ģʽĬ���ǳɹ���
	 * ������Ҫ���ҵĲ���Ӧ��+�����Ȩ���ļ�����zip���Ȼ��֣�ǩ��������ǩ�����Ӧ��ȥ����
	 */
	//��������Ȩ��
	private void testpermission1() {
		myHandleDeal("testpermission1����", 0);
		List<String> myper=new ArrayList<String>();
		initlist(myper);
		Log.v("TAG", myper.size()+"");
		for (int i = 0; i < myper.size(); i++) {
//			byte[] innerkey1 = ByteUtils.hexString2ByteArray(myper.get(i));
			byte[] innerkey1=myper.get(i).getBytes();
//			Log.v("TAG",myper.get(i)+"");
//			Log.v("TAG",innerkey1.length+"");
			int res = gDdi.ddi_get_ddi_permission(innerkey1.length, innerkey1);
			if (res == 0) {
				myHandleDeal("testpermission1�ɹ�:", 0);
			} else {
				myHandleDeal("permission1ʧ��"+"��Ӧ������"+myper.get(i), res);
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}
	//�쳣���ԣ�
	private void testpermission2() {
		myHandleDeal("testpermission2����", 0);
		List<String> myper=new ArrayList<String>();
		initlist(myper);
		Log.v("TAG", myper.size()+"");
		for (int i = 0; i < myper.size(); i++) {
//			byte[] innerkey1 = ByteUtils.hexString2ByteArray(myper.get(i));
			byte[] innerkey1=myper.get(i).getBytes();
			byte[] innerkey2=null;
//			Log.v("TAG",myper.get(i)+"");
//			Log.v("TAG",innerkey1.length+"");
			int res = gDdi.ddi_get_ddi_permission(-1, innerkey1);
			int res2 = gDdi.ddi_get_ddi_permission(3, innerkey2);
			int res3 = gDdi.ddi_get_ddi_permission(innerkey1.length+1, innerkey1);
			if (res == -6&& res2==-6&&res3==-6) {
				myHandleDeal("testpermission2�ɹ�:", 0);
			} else {
				myHandleDeal("permission2ʧ��"+"��Ӧ������"+myper.get(i), res);
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	//ʵ��ǩ��Ȩ��û����Ӹ�Ȩ��
	private void testpermission3() {
		myHandleDeal("testpermission3����", 0);
		List<String> myper=new ArrayList<String>();
		initlist(myper);
		//�쳣����
		myper.add("android.permission.CLOUDPOS_CAMERAS");
		Log.v("TAG", myper.size()+"");
		for (int i = 0; i < myper.size(); i++) {
//			byte[] innerkey1 = ByteUtils.hexString2ByteArray(myper.get(i));
			byte[] innerkey1=myper.get(i).getBytes();
//			Log.v("TAG",myper.get(i)+"");
//			Log.v("TAG",innerkey1.length+"");
			int err = -99;
			if (myper.get(i).equalsIgnoreCase("android.permission.CLOUDPOS_CAMERAS")) {
				err = gDdi.ddi_get_ddi_permission(innerkey1.length, innerkey1);
				if (err == -1) {
					myHandleDeal("testpermission3�ɹ�:", 0);
				} else {
					myHandleDeal("permission3ʧ��"+"��Ӧ������"+myper.get(i), err);
				}
			}else {
				int res = gDdi.ddi_get_ddi_permission(innerkey1.length, innerkey1);
				if (res == 0) {
					myHandleDeal("testpermission3�ɹ�:", 0);
				} else {
					myHandleDeal("permission3ʧ��"+"��Ӧ������"+myper.get(i), res);
				}
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}

	}
	//���ݳ��ȴ���4096
	private void testpermission4() {
		myHandleDeal("testpermission4����", 0);
		List<String> myper=new ArrayList<String>();
		initlist(myper);
		Log.v("TAG", myper.size()+"");
		for (int i = 0; i < myper.size(); i++) {
//			byte[] innerkey1 = ByteUtils.hexString2ByteArray(myper.get(i));
			byte[] innerkey1=new byte[4104];
		     innerkey1=myper.get(i).getBytes();
//			Log.v("TAG",myper.get(i)+"");
			Log.v("TAG","����"+innerkey1.length+"");
			int err = -99;
			
//			if (myper.get(i).equalsIgnoreCase("android.permission.CLOUDPOS_CAMERAS")) {
//				err = gDdi.ddi_get_ddi_permission(innerkey1.length, innerkey1);
//				if (err == -1) {
//					myHandleDeal("testpermission4�ɹ�:", 0);
//				} else {
//					myHandleDeal("permission4ʧ��"+"��Ӧ������"+myper.get(i), err);
//				}
//			}
			
			int res = gDdi.ddi_get_ddi_permission(256, innerkey1);
			if (res == -6) {
				myHandleDeal("testpermission4�ɹ�:", 0);
			} else {
				myHandleDeal("permission4ʧ��"+"��Ӧ������"+myper.get(i), res);
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	private void initlist(List<String> myper) {
		myper.add("android.permission.CLOUDPOS_SAFE_MODULE");
		myper.add("android.permission.CLOUDPOS_MSR");
		myper.add("android.permission.CLOUDPOS_SMARTCARD");
		myper.add("android.permission.CLOUDPOS_CONTACTLESS_CARD");
		myper.add("android.permission.CLOUDPOS_PRINTER");
		myper.add("android.permission.CLOUDPOS_PIN_GET_PIN_BLOCK");
		myper.add("android.permission.CLOUDPOS_PIN_MAC");
		myper.add("android.permission.CLOUDPOS_PIN_ENCRYPT_DATA");
		myper.add("android.permission.CLOUDPOS_PIN_UPDATE_MASTER_KEY");
		myper.add("android.permission.CLOUDPOS_PIN_UPDATE_USER_KEY");
		myper.add("android.permission.CLOUDPOS_SERIAL");
		myper.add("android.permission.CLOUDPOS_LED");
		myper.add("android.permission.CLOUDPOS_EMV");
		myper.add("android.permission.CLOUDPOS_SAFE_KEYBOARD");
		myper.add("android.permission.CLOUDPOS_CONTACTLESS_CARD");
		myper.add("android.permission.CLOUDPOS_EMV");
		myper.add("android.permission.CLOUDPOS_SMARTCARD");
		myper.add("android.permission.CLOUDPOS_PINPAD");
		myper.add("android.permission.CLOUDPOS_SAFE_KEYBOARD");
		myper.add("android.permission.CLOUDPOS_PIN_GET_PIN_BLOCK");
		myper.add("android.permission.CLOUDPOS_PERM_NORMAL");
		myper.add("android.permission.CLOUDPOS_CAMERA");
	
	}
	
	
	
	//
	//��ȡ���ࣨ�ſ���IC����RF��������       int mode, byte cardtype, int[] p_outlen, byte[] p_outdata
	
	//��ȫ�����ļ�����
	private void testdealcmd1() {
		myHandleDeal("testdealcmd1����", 0);
		int[] outlen = new int[16];
		byte[] indata = new byte[8];
		byte[] outdata = new byte[1];
		String data="32";
		int res = gDdi.ddi_secdata_dealcmd(mode0,2, indata.length, indata, outlen, outdata);
		String byteArray2HexString = ByteUtils.byteArray2HexString(outdata);
//		Log.v("costtime",byteArray2HexString );
		if (res == 0&&byteArray2HexString.equalsIgnoreCase(data)) {
			myHandleDeal("dealcmd1��ȡ�ɹ�:"+byteArray2HexString, 0);
			
		} else {
			myHandleDeal("dealcmd1���������ļ���ȡʧ��"+byteArray2HexString, res);
		}
	}
	private void testdealcmd2() {
		myHandleDeal("testdealcmd2����", 0);
		int[] outlen = new int[16];
		byte[] indata = new byte[8];
		byte[] outdata = new byte[1];
		String data="31";
		int res = gDdi.ddi_secdata_dealcmd(mode0,3, indata.length, indata, outlen, outdata);
		String byteArray2HexString = ByteUtils.byteArray2HexString(outdata);
//		Log.v("costtime",byteArray2HexString );
		//��Ϊ��������û�����أ����Ա���
		if (res == -1) {
			myHandleDeal("dealcmd2��ȡ�ɹ�:", 0);
			
		} else {
			myHandleDeal("dealcmd2���������ļ���ȡʧ��"+byteArray2HexString, res);
		}
	}
	private void testdealcmd3() {
		myHandleDeal("testdealcmd3����", 0);
		int[] outlen = new int[16];
		byte[] indata = new byte[8];
		byte[] outdata = new byte[1];
		String data="31";
		int res = gDdi.ddi_secdata_dealcmd(mode0,4, indata.length, indata, outlen, outdata);
		String byteArray2HexString = ByteUtils.byteArray2HexString(outdata);
//		Log.v("costtime",byteArray2HexString );
		//��Ϊ��������û�����أ����Ա���
		if (res == -1) {
			myHandleDeal("dealcmd3��ȡ�ɹ�:", 0);
			
		} else {
			myHandleDeal("dealcmd3���������ļ���ȡʧ��"+byteArray2HexString, res);
		}
	}
	private void testdealcmd4() {
		myHandleDeal("testdealcmd4����", 0);
		int[] outlen = new int[100];
		byte[] indata = new byte[8];
		byte[] outdata = new byte[14];
		String data="0d05013202013206053030303332";
		int res = gDdi.ddi_secdata_dealcmd(mode0,100, 8, indata, outlen, outdata);
		String byteArray2HexString = ByteUtils.byteArray2HexString(outdata);
//		String substring = byteArray2HexString.substring(0, 14);
		Log.v("costtime",byteArray2HexString );
		if (res == 0&&byteArray2HexString.equalsIgnoreCase(data)) {
//			Log.v("TAG",substring );
			myHandleDeal("dealcmd4��ȡ�ɹ�:"+byteArray2HexString, 0);
			
		} else {
			myHandleDeal("dealcmd4���������ļ���ȡʧ��"+byteArray2HexString, res);
		}
	}
	//�쳣����
	private void testdealcmd5() {
		myHandleDeal("testdealcmd5����", 0);
		int[] outlen = new int[16];
		byte[] indata = new byte[8];
		byte[] outdata = new byte[8];
		int res = gDdi.ddi_secdata_dealcmd(mode1,100, 8, indata, outlen, outdata);
		int res1 = gDdi.ddi_secdata_dealcmd(mode0,-1, 8, indata, outlen, outdata);
		int res2 = gDdi.ddi_secdata_dealcmd(mode0,101, 8, indata, outlen, outdata);
		String byteArray2HexString = ByteUtils.byteArray2HexString(outdata);
		if (res == -6&&res1 == -6&&res2 == -6) {
			myHandleDeal("dealcmd5��ȡ�ɹ�:", 0);
			
		} else {
			myHandleDeal("dealcmd5��ȡʧ��", res);
		}
	}
	private void testdealcmd6() {
		myHandleDeal("testdealcmd6����", 0);
		int[] outlen = new int[16];
		byte[] indata = new byte[8];
		byte[] outdata = new byte[1];
		String data="32";
		int res = gDdi.ddi_secdata_dealcmd(mode0,1, 8, indata, outlen, outdata);
		String byteArray2HexString = ByteUtils.byteArray2HexString(outdata);
//		Log.v("costtime",byteArray2HexString );
		if (res == 0&&byteArray2HexString.equalsIgnoreCase(data)) {
			myHandleDeal("dealcmd6��ȡ�ɹ�:", 0);
			
		} else {
			myHandleDeal("dealcmd6��ȡʧ��"+byteArray2HexString, res);
		}
	}
	//2019.7.10�½�����
	private void testblocktime() {
		myHandleDeal("testblocktime����", 0);
		int res = gDdi.ddi_set_spi_blocktime(10);
//		String byteArray2HexString = ByteUtils.byteArray2HexString(outdata);
		if (res == 0) {
			myHandleDeal("blocktime��ȡ�ɹ�:", 0);
			
		} else {
			myHandleDeal("blocktime��ȡʧ��", res);
		}
	}

	//����IC��1Сʱ��IC��120�ε�����
	private void testiccardimputtimes() {
		myHandleDeal("testiccardimputtimes����", 0);
		Thread mThread=new Thread(	new Runnable() {
			public void run() {
				for (int i = 0; i < 120; i++) {

					int ret;

					ret = Ddi.ddi_iccpsam_poweron(Bslot, atr);
					if (ret == -7) {
						myHandleDeal("��ʼ��" + i + "��IC������", 0);
						try {
							Thread.sleep(1 * 1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}

				}
			}
		});
		mThread.start();
	
	}
	//����RF��1Сʱ����120�β���
	private void testRFcardimputtimes() {
		myHandleDeal("testiccardimputtimes����", 0);
		Thread mThread = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 120; i++) {

					int ret;

					ret = Ddi.ddi_rf_activate();
					if (ret == -7) {
						myHandleDeal("��ʼ��" + i + "��RF������", 0);
						try {
							Thread.sleep(1 * 1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}

				}
			}
		});
		mThread.start();

	}
	 //ÿˢһ�ο��͸�һ��ʱ��
	private void testrtctime15() {
		myHandleDeal("testrtctime15����", 0);
		final byte[] Dt1 = new byte[6];
		final int[] len1 = new int[1];
		final Random mRandom=new Random();
		Thread mThread=new Thread(		new Runnable() {
			public void run() {
				for (int i = 0; i < 121; i++) {
					int YYYY = mRandom.nextInt(81) + 17;
					int MM = mRandom.nextInt(10) + 1;
					int DD = mRandom.nextInt(26) + 1;
					int hh = mRandom.nextInt(22) + 1;
					int mm = mRandom.nextInt(22) + 1;
					int ss = mRandom.nextInt(50) + 1;
					String DT = "" + YYYY + MM + DD + hh + mm + ss;
					byte[] Dt = ByteUtils.hexString2ByteArray(DT);
					
					int res1=Ddi.ddi_rf_open();
					if (res1==0) {
						myHandleDeal("RF���򿪳ɹ�", 0);
						
					} else {
						myHandleDeal("RF����ʧ��", res1);

					}
					int res2=Ddi.ddi_rf_poweron(1);
					if (res2==0) {
						myHandleDeal("RF�ϵ�ɹ�", 0);
//						int res3=Ddi.ddi_rf_get_status();
//						if (res3==0) {
//							myHandleDeal("RF��ȡ״̬�ɹ�", 0);
//							
//						} else {
//							myHandleDeal("RF��ȡ״̬ʧ��", res3);
//						}
						
					} else {
						myHandleDeal("RF�ϵ�ʧ��", res2);

					}
					int ret = Ddi.ddi_rf_activate();
					
					if (ret==-1) {
						myHandleDeal("��ʼ��" + i + "��RF������", 0);
						
					} else {
						myHandleDeal("����ʧ��", ret);
					}
					try {
						Thread.sleep(1 * 1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					int res5 = Ddi.ddi_dev_set_rtc_time(Dt, Dt.length);
					if (res5 == 0) {
						myHandleDeal("����K21RTC�ɹ�:" + DT, res1);
						int res6 = Ddi.ddi_dev_get_rtc_time(Dt1, len1);
						String str = ByteUtils.byteArray2HexString(Dt1);
						if (res6 == 0) {
							myHandleDeal("��ȡK21RTC�ɹ���" + str, res6);
						} else {
							myHandleDeal("rtctime15��ȡK21RTCʧ��", res6);
						}
					} else {
						myHandleDeal("rtctime15����K21RTCʧ��", res5);
					}
					
					int res8=Ddi.ddi_rf_close();
					if (res8==0) {
						myHandleDeal("RF�رճɹ�", 0);
						
					} else {
						myHandleDeal("RF�ر�ʧ��", res8);

					}
					
					
					
				}
			}
		});
		mThread.start();

	}
	

	
	
Runnable  mRunnable=   new Runnable() {
	public void run() {
		int[] datalen=new int[108];
		byte[] data=new byte[108];
			
int res0=Ddi.ddi_mag_open();
if (res0==0) {
	myHandleDeal("�򿪴ſ��ɹ�", 0);
	Arrays.fill(wParam, (byte) 0);
	int ret = Ddi.ddi_mag_ioctl_getVer(wParam);
	if (ret==0) {
		String byteArray2HexString = ByteUtils.byteArray2HexString(wParam);
		myHandleDeal("�ſ��汾Ϊ"+byteArray2HexString, 0);

	}
	
	while (Thflg1) {
		Arrays.fill(track1,(byte)0);
		Arrays.fill(track2,(byte)0);
		Arrays.fill(track3,(byte)0);
		int ret1 = Ddi.ddi_mag_read(track1,track2,track3);
		if(0==ret1 &&(bytearrayToCharString(track2).length() !=0 
				|| bytearrayToCharString(track3).length() !=0)){
			myHandleDeal("��ȡ���ݳɹ�", ret1);	
			String byteArray2HexString2 = bytearrayToCharString(track2);
			myHandleDeal("�ŵ�������"+byteArray2HexString2, 0);
				}else {
					myHandleDeal("�ŵ���ʧ��", ret1);
					String byteArray2HexString3 = bytearrayToCharString(track2);
					myHandleDeal("�ŵ����ɹ�"+byteArray2HexString3, 0);
					Thflg1=false;
				}
		
//		int res = gDdi.ddi_sred_getcardno(mode0,(byte)0, datalen, data);
//		String byteArray2HexString = ByteUtils.byteArray2HexString(data);
//		if (res == 0) {
//			myHandleDeal("getcardno1�ɹ�:", 0);
//			int res3 = Ddi.ddi_mag_close();
//			if (res3==0) {
//				myHandleDeal("�رմſ��ɹ�", 0);
//				
//			} else {
//				myHandleDeal("�رմſ�ʧ��", -6);
//
//			}
//		} else {
//			myHandleDeal("getcardno1ʧ��", res);
//		} 
		

		  int res3 = Ddi.ddi_mag_close();
	}
	}
}
	// pointC
};
}
