package tools;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Date;
import java.util.Locale;

import com.xinguodu.cts.MainActivity;

import android.R.integer;
import android.annotation.SuppressLint;
import android.icu.text.SimpleDateFormat;
import android.os.Environment;

public class testtoolclass {
	
	   /**在安卓的跟目录新建一个result的txt文档，然后再把txt文档改为csv格式的就变成了excel格式的
     * @param result   新建的result文档的名字
     * @throws Exception
     */
    public static void creatcsv(int ret,String result) throws Exception {
        String path = Environment.getExternalStorageDirectory().getAbsolutePath();
        File file = new File(path, MainActivity.model+"接口测试记录"+ ".txt");
//        if (file.exists()){
//            file.delete();
////            file.createNewFile();
//        }else {
//            file.createNewFile();
//        }
//        BufferedWriter output = new BufferedWriter(new FileWriter(file, true));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file,true),"GBK"));
        if (result.contains("test")) {
        	
        	output.append(result+","+","+ret +"\r\n");
        	  output.close();
			
		}else {
			  output.append(","+result+","+ret +"\r\n");
		        output.close();
			
		}
      

    }
    
    @SuppressLint("NewApi")
	public static void creattitle() throws Exception {
    	String path = Environment.getExternalStorageDirectory().getAbsolutePath();
    	File file = new File(path, MainActivity.model+"接口测试记录"+ ".txt");
        if (file.exists()){
//            file.delete();
//            file.createNewFile();
        	
        	
        }else {
            file.createNewFile();
        }
//        BufferedWriter output = new BufferedWriter(new FileWriter(file, true));
    	BufferedWriter output = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file,true),"GBK"));
//    	if (result.contains("test")) {
//    		
//    		output.append(result+","+","+res +"\r\n");
//    		
//    	}
    	if (MainActivity.version.equalsIgnoreCase("5.1.1")) {
       	output.append("测试用例标题"+","+"测试结果"+","+"接口返回值" +"\r\n");
       	output.close();
		} else {
			  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss", Locale.CHINA);// 日期格式名定义
	           String fname =sdf.format(new Date());
	    	output.append(fname+","+""+","+"" +"\r\n");
	    	output.append("测试用例标题"+","+"测试结果"+","+"接口返回值" +"\r\n");
	    	output.close();

		}
    	 
    	
    }
	
	
	
	

}
