package com.xinguodu.cts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;

public class ByteUtils {
	  public ByteUtils() {
	    }

	    public static byte[] asciiByteArray2BcdArray(byte[] var0) {
	        return hexString2ByteArray(asciiByteArray2String1(var0));
	    }
       //asciiByteArray转string
	    public static String asciiByteArray2String(byte[] var0) { 
	        if(var0 != null && var0.length != 0) {
	            StringBuffer var1 = new StringBuffer();
	            char[] var2 = new char[var0.length];
	            int var3 = 0;

	            for(int var4 = 0; var4 < var0.length; ++var4) {
	                if(var0[var4] == 32) {
	                    var3 = var4;
	                    break;
	                }

	                var3 = var0.length;
	                var2[var4] = (char)var0[var4];
	            }

	            var1.append(var2, 0, var3);
	            return var1.toString();
	        } else {
	            return "";
	        }
	    }
	  //asciiByteArray杞瑂tring
	    public static String asciiByteArray2String1(byte[] var0) {
	        StringBuffer var1 = new StringBuffer();
	        char[] var2 = new char[var0.length];
	        int var3 = 0;

	        for(int var4 = 0; var4 < var0.length && var0[var4] != 0; ++var4) {
	            var3 = var0.length;
	            var2[var4] = (char)var0[var4];
	        }

	        var1.append(var2, 0, var3);
	        return var1.toString();
	    }

	    public static byte[] string2ASCIIByteArray(String var0) {
	        byte[] var1 = null;

	        try {
	            var1 = var0.getBytes("US-ASCII");
	        } catch (UnsupportedEncodingException var3) {
	            Log.e("xgd", "锟街凤拷锟斤拷转锟斤拷为ASCII锟斤拷Byte锟斤拷锟斤拷锟斤拷锟�");
	            var3.printStackTrace();
	        }

	        return var1;
	    }

	    public static byte[] int2BCDByteArray(int var0) {
	        if(var0 <= 9999 && var0 >= 0) {
	            StringBuffer var1 = new StringBuffer(var0 + "");
	            int var2 = var1.length();
	            if(var2 != 4) {
	                for(int var3 = 0; var3 < 4 - var2; ++var3) {
	                    var1.insert(0, '0');
	                }
	            }

	            return hexString2ByteArray(var1.toString());
	        } else {
	            return new byte[]{(byte)0, (byte)0};
	        }
	    }

	    public static byte[] hexString2ByteArray(String var0) {
	        if(var0 != null && !var0.equals("")) {
	            if(var0.length() % 2 != 0) {
	                var0 = var0 + "0";
	            }

	            byte[] var1 = new byte[var0.length() / 2];

	            for(int var2 = 0; var2 < var0.length() / 2; ++var2) {
	                char var3 = var0.charAt(2 * var2);
	                char var4 = var0.charAt(2 * var2 + 1);
	                byte var5 = hexChar2Byte(var3);
	                byte var6 = hexChar2Byte(var4);
	                if(var5 < 0 || var6 < 0) {
	                    return null;
	                }

	                int var7 = var5 << 4;
	                var1[var2] = (byte)(var7 + var6);
	            }

	            return var1;
	        } else {
	            return null;
	        }
	    }

	    public static byte hexString2Byte(String var0) {
	        if(TextUtils.isEmpty(var0)) {
	            return (byte)0;
	        } else {
	            char var2 = var0.charAt(0);
	            char var3 = var0.charAt(1);
	            byte var4 = hexChar2Byte(var2);
	            byte var5 = hexChar2Byte(var3);
	            if(var4 >= 0 && var5 >= 0) {
	                int var6 = var4 << 4;
	                byte var1 = (byte)(var6 + var5);
	                return var1;
	            } else {
	                return (byte)0;
	            }
	        }
	    }

	    public static short[] StringAndShorttoShortArray(short[] var0, String var1) {
	        byte[] var4 = hexString2ByteArray(var1.replaceAll(" ", ""));
	        short[] var2;
	        int var3;
	        if(var0 != null) {
	            var3 = var0.length;
	            var2 = new short[var3 + var4.length];
	            System.arraycopy(var0, 0, var2, 0, var3);
	        } else {
	            var3 = 0;
	            var2 = new short[var4.length];
	        }

	        for(int var5 = 0; var5 < var4.length; ++var5) {
	            var2[var3 + var5] = (short)var4[var5];
	        }

	        return var2;
	    }

	    public static short[] Bytes2ShortArray(byte[] var0) {
	        short[] var1 = null;
	        if(var0 != null) {
	            var1 = new short[var0.length];

	            for(int var2 = 0; var2 < var0.length; ++var2) {
	                var1[var2] = (short)var0[var2];
	            }
	        }

	        return var1;
	    }

	    public static byte hexChar2Byte(char var0) {
	        return var0 >= 48 && var0 <= 57?(byte)(var0 - 48):(var0 >= 97 && var0 <= 102?(byte)(var0 - 97 + 10):(var0 >= 65 && var0 <= 70?(byte)(var0 - 65 + 10):-1));
	    }

	    public static String byteArray2HexString(byte[] var0) {
	        if(var0 != null && var0.length != 0) {
	            StringBuilder var1 = new StringBuilder();
	            byte[] var2 = var0;
	            int var3 = var0.length;

	            for(int var4 = 0; var4 < var3; ++var4) {
	                byte var5 = var2[var4];
	                String var6 = Integer.toHexString(255 & var5);
	                if(var6.length() < 2) {
	                    var6 = "0" + var6;
	                }

	                var1.append(var6);
	            }

	            return var1.toString();
	        } else {
	            return "";
	        }
	    }

	    public static String byteArray2HexStringNotAppendZero(byte[] var0) {
	        if(var0 != null && var0.length != 0) {
	            StringBuilder var1 = new StringBuilder();
	            byte[] var2 = var0;
	            int var3 = var0.length;

	            for(int var4 = 0; var4 < var3; ++var4) {
	                byte var5 = var2[var4];
	                String var6 = Integer.toHexString(255 & var5);
	                if(var6.length() < 2) {
	                    var1.append(var6);
	                }
	            }

	            return var1.toString();
	        } else {
	            return "";
	        }
	    }

	    public static String byteArray2HexStringWithSpace(byte[] var0) {
	        if(var0 != null && var0.length != 0) {
	            StringBuilder var1 = new StringBuilder();
	            byte[] var2 = var0;
	            int var3 = var0.length;

	            for(int var4 = 0; var4 < var3; ++var4) {
	                byte var5 = var2[var4];
	                String var6 = Integer.toHexString(255 & var5);
	                if(var6.length() < 2) {
	                    var6 = "0" + var6;
	                }

	                var1.append(var6);
	                var1.append(" ");
	            }

	            return var1.toString();
	        } else {
	            return "";
	        }
	    }

	    public static String getBCDString(byte[] var0, int var1, int var2) {
	        byte[] var3 = new byte[var2 - var1 + 1];
	        System.arraycopy(var0, var1, var3, 0, var3.length);
	        return byteArray2HexString(var3);
	    }

	    public static String getBCDString(String var0) {
	        byte[] var1 = hexString2ByteArray(var0);
	        return getBCDString(var1, 0, var1.length);
	    }

	    public static String getHexString(byte[] var0, int var1, int var2) {
	        byte[] var3 = new byte[var2 - var1 + 1];
	        System.arraycopy(var0, var1, var3, 0, var3.length);
	        return byteArray2HexStringWithSpace(var3);
	    }

	    public static String shortArray2HexStringWithSpace(short[] var0) {
	        StringBuilder var1 = new StringBuilder();
	        short[] var2 = var0;
	        int var3 = var0.length;

	        for(int var4 = 0; var4 < var3; ++var4) {
	            short var5 = var2[var4];
	            String var6 = Integer.toHexString(255 & var5);
	            if(var6.length() < 2) {
	                var6 = "0" + var6;
	            }

	            var1.append(var6);
	        }

	        return var1.toString();
	    }

	    public static byte[] shortArray2bytes(short[] var0) {
	        byte[] var1 = new byte[var0.length];

	        for(int var2 = 0; var2 < var0.length; ++var2) {
	            var1[var2] = (byte)(255 & var0[var2]);
	        }

	        return var1;
	    }

	    public static byte[] shortArray2bytes2(short[] var0) {
	        byte[] var1 = new byte[var0.length * 2];

	        for(int var2 = 0; var2 < var0.length; ++var2) {
	            var1[var2 * 2 + 1] = (byte)(var0[var2] / 256);
	            var1[var2 * 2] = (byte)(255 & var0[var2]);
	        }

	        return var1;
	    }

	    public static byte[] short2ByteArrayLow(short var0) {
	        byte[] var1 = new byte[]{(byte)(255 & var0), (byte)(var0 / 256)};
	        return var1;
	    }

	    public static byte[] short2ByteArrayHigh(short var0) {
	        byte[] var1 = new byte[]{(byte)(var0 / 256), (byte)(255 & var0)};
	        return var1;
	    }

	    public static byte[] short2BcdByteArray(short var0) {
	        byte var3 = 2;
	        byte[] var4 = new byte[2];

	        for(int var5 = 0; var5 < var3; ++var5) {
	            byte var6 = (byte)(var0 >> 8 * (var3 - var5 - 1) & 255);
	            byte var1 = (byte)(var6 / 10);
	            byte var2 = (byte)(var6 % 10);
	            var4[var5] = (byte)((var1 << 4) + var2);
	        }

	        return var4;
	    }

	    public static int bcdByteArray2Int(byte var0, byte var1) {
	        boolean var4 = false;
	        byte var5 = 0;
	        int var6;
	        if((var0 & 128) == 128) {
	            var6 = var0 + 256;
	        } else {
	            var6 = var0;
	        }

	        byte var2 = (byte)(var6 / 16);
	        byte var3 = (byte)(var6 % 16);
	        int var7 = var5 + var2 * 1000 + var3 * 100;
	        if((var1 & 128) == 128) {
	            var6 = var1 + 256;
	        } else {
	            var6 = var1;
	        }

	        var2 = (byte)(var6 / 16);
	        var3 = (byte)(var6 % 16);
	        var7 += var2 * 10 + var3;
	        return var7;
	    }

	    public static int bcdByteArray2Int(byte[] var0) {
	        boolean var3 = false;
	        boolean var4 = false;
	        int var5;
	        if((var0[0] & 128) == 128) {
	            var5 = var0[0] + 256;
	        } else {
	            var5 = var0[0];
	        }

	        byte var1 = (byte)(var5 / 16);
	        byte var2 = (byte)(var5 % 16);
	        int var6 = var1 * 1000 + var2 * 100;
	        if((var0[1] & 128) == 128) {
	            var5 = var0[1] + 256;
	        } else {
	            var5 = var0[1];
	        }

	        var1 = (byte)(var5 / 16);
	        var2 = (byte)(var5 % 16);
	        var6 += var1 * 10 + var2;
	        return var6;
	    }

	    public static int byte2int(byte[] var0, int var1, int var2) {
	        return var0[1] & 255 | var0[0] << 8 & '\uff00';
	    }

	    public static int byte2int(byte var0, byte var1) {
	        return var1 & 255 | var0 << 8 & '\uff00';
	    }

	    public static byte[] int2ByteArray(int var0) {
	        byte[] var1 = new byte[]{(byte)(var0 >> 24 & 255), (byte)(var0 >> 16 & 255), (byte)(var0 >> 8 & 255), (byte)(var0 & 255)};
	        return var1;
	    }

	    public static String byte2BinaryString(byte var0) {
	        String var1 = "00000000";
	        String var2 = Integer.toBinaryString(var0);
	        if(var2.length() > 8) {
	            var2 = var2.substring(var2.length() - 8);
	        } else if(var2.length() < 8) {
	            var2 = "00000000".substring(var2.length()) + var2;
	        }

	        return var2;
	    }

	    public static byte getCrc(byte[] var0, int var1, int var2) {
	        byte var3 = 0;

	        for(int var4 = var1; var4 <= var2; ++var4) {
	            var3 ^= var0[var4];
	        }

	        return var3;
	    }

	    public static byte[] getTLVData(String var0, int var1, byte[] var2) {
	        byte[] var3 = new byte[1024];
	        byte var4 = 0;
	        byte[] var5 = hexString2ByteArray(var0);
	        System.arraycopy(var5, 0, var3, var4, var5.length);
	        int var7 = var4 + var5.length;
	        if(var1 > 127 && var1 < 255) {
	            var3[var7++] = -127;
	        }

	        var3[var7++] = (byte)var1;
	        System.arraycopy(var2, 0, var3, var7, var1);
	        var7 += var1;
	        byte[] var6 = new byte[var7];
	        System.arraycopy(var3, 0, var6, 0, var7);
	        return var6;
	    }

	    public static byte[] mergeByteArray(byte[] var0, byte[] var1) {
	        if(null == var0 && null != var1) {
	            return var1;
	        } else if(null == var0 && null == var1) {
	            return new byte[0];
	        } else if(null != var0 && null == var1) {
	            return var0;
	        } else {
	            byte[] var2 = new byte[var0.length + var1.length];
	            System.arraycopy(var0, 0, var2, 0, var0.length);
	            System.arraycopy(var1, 0, var2, var0.length, var1.length);
	            return var2;
	        }
	    }

	    public static byte[] getSubByteArray(byte[] var0, int var1, int var2) {
	        byte[] var3 = new byte[var2];

	        try {
	            System.arraycopy(var0, var1, var3, 0, var3.length);
	        } catch (Exception var5) {
	            ;
	        }

	        return var3;
	    }

	    public static byte[] byteAppendOne(byte[] var0, byte var1) {
	        byte[] var2 = new byte[]{var1};
	        byte[] var3 = mergeByteArray(var0, var2);
	        return var3;
	    }

	    public static byte[] mergeByteArray(byte[][] var0) {
	        byte[] var1 = new byte[0];

	        for(int var2 = 0; var2 < var0.length; ++var2) {
	            var1 = mergeByteArray(var1, var0[var2]);
	        }

	        return var1;
	    }

	    public static byte[] getTLVData(String var0, String var1) {
	        byte[] var2 = string2ASCIIByteArray(var1);
	        byte[] var3 = null;

	        try {
	            var3 = getTLVData(var0, var2.length, var2);
	        } catch (Exception var5) {
	            var5.printStackTrace();
	        }

	        return var3;
	    }

	    public static byte[] getTLVData(String var0, byte[] var1) {
	        byte[] var2 = null;

	        try {
	            var2 = getTLVData(var0, var1.length, var1);
	        } catch (Exception var4) {
	            var4.printStackTrace();
	        }

	        return var2;
	    }

	    public static byte[] addLL2ByteArr(byte[] var0) {
	        if(null != var0 && 0 != var0.length) {
	            byte[] var1 = int2BCDByteArray(var0.length);
	            byte[] var2 = mergeByteArray(var1, var0);
	            return var2;
	        } else {
	            return new byte[0];
	        }
	    }

	    public static byte[] DoubleList2ByteArray(ArrayList<Double> var0) {
	        if(var0 == null) {
	            return new byte[0];
	        } else {
	            byte[] var1 = new byte[var0.size()];

	            for(int var2 = 0; var2 < var0.size(); ++var2) {
	                var1[var2] = (byte)(new Double(((Double)var0.get(var2)).doubleValue())).intValue();
	            }

	            return var1;
	        }
	    }

	    public static byte[] ByteArrayList2ByteArray(List<byte[]> var0) {
	        ArrayList var1 = new ArrayList();
	        Iterator var2 = var0.iterator();

	        while(var2.hasNext()) {
	            byte[] var3 = (byte[])var2.next();

	            for(int var4 = 0; var4 < var3.length; ++var4) {
	                var1.add(Byte.valueOf(var3[var4]));
	            }
	        }

	        byte[] var5 = new byte[var1.size()];

	        for(int var6 = 0; var6 < var1.size(); ++var6) {
	            var5[var6] = ((Byte)var1.get(var6)).byteValue();
	        }

	        return var5;
	    }

	    public static String decodingTLV(String var0, String var1) {
	        if(var0 != null && var0.length() % 2 == 0) {
	            String var2 = "";
	            int var3 = 0;

	            while(var3 < var0.length()) {
	                try {
	                    String var4 = var0.substring(var3, var3 += 2);
	                    if((Integer.parseInt(var4, 16) & 31) == 31) {
	                        var4 = var4 + var0.substring(var3, var3 += 2);
	                    }

	                    String var5 = var0.substring(var3, var3 += 2);
	                    int var6 = Integer.parseInt(var5, 16);
	                    if(var6 > 128) {
	                        int var7 = var6 - 128;
	                        var5 = var0.substring(var3, var3 += var7 * 2);
	                        var6 = Integer.parseInt(var5, 16);
	                    }

	                    var6 *= 2;
	                    String var10 = var0.substring(var3, var3 += var6);
	                    if(var1.equalsIgnoreCase(var4)) {
	                        var2 = var10;
	                        break;
	                    }
	                } catch (NumberFormatException var8) {
	                    throw new RuntimeException("Error parsing number", var8);
	                } catch (IndexOutOfBoundsException var9) {
	                    throw new RuntimeException("Error processing field", var9);
	                }
	            }

	            return var2;
	        } else {
	            throw new RuntimeException("Invalid tlv, null or odd length");
	        }
	    }

	    public static byte[] byteArrayBase64Encode(byte[] var0) {
	        return Base64.encode(var0, 1);
	    }

	    public static byte[] byteArrayBase64Decode(byte[] var0) {
	        return Base64.decode(var0, 1);
	    }

	    public static byte[] bcd2Ascii(byte[] var0) {
	        byte[] var1 = new byte[2];

	        for(int var2 = 0; var2 < var0.length; ++var2) {
	            if((var0[var2] & 240) >> 4 <= 9) {
	                var1[var2 * 2] = (byte)((var0[var2] >> 4 & 15) + 48);
	            } else {
	                var1[var2 * 2] = (byte)(var0[var2] >> 4 & 70);
	            }

	            var1[var2 * 2 + 1] = (byte)((var0[var2] & 15) + 48);
	        }

	        return var1;
	    }

	    public static String hexByteArray2BinaryStr(byte[] var0) {
	        String[] var1 = new String[]{"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
	        String var2 = "";
	        boolean var3 = false;
	        byte[] var4 = var0;
	        int var5 = var0.length;

	        for(int var6 = 0; var6 < var5; ++var6) {
	            byte var7 = var4[var6];
	            int var8 = (var7 & 240) >> 4;
	            var2 = var2 + var1[var8];
	            var8 = var7 & 15;
	            var2 = var2 + var1[var8];
	        }

	        return var2;
	    }

	    public static String binaryString2hexString(String var0) {
	        if(var0 != null && !var0.equals("") && var0.length() % 8 == 0) {
	            StringBuffer var1 = new StringBuffer();
	            boolean var2 = false;

	            for(int var3 = 0; var3 < var0.length(); var3 += 4) {
	                int var5 = 0;

	                for(int var4 = 0; var4 < 4; ++var4) {
	                    var5 += Integer.parseInt(var0.substring(var3 + var4, var3 + var4 + 1)) << 4 - var4 - 1;
	                }

	                var1.append(Integer.toHexString(var5));
	            }

	            return var1.toString();
	        } else {
	            return null;
	        }
	    }

	    public static byte[] str2Bcd(String var0) {
	        int var1 = var0.length();
	        int var2 = var1 % 2;
	        if(var2 != 0) {
	            var0 = "0" + var0;
	            var1 = var0.length();
	        }

	        byte[] var3 = new byte[var1];
	        if(var1 >= 2) {
	            var1 /= 2;
	        }

	        byte[] var4 = new byte[var1];
	        var3 = var0.getBytes();

	        for(int var7 = 0; var7 < var0.length() / 2; ++var7) {
	            int var5;
	            if(var3[2 * var7] >= 48 && var3[2 * var7] <= 57) {
	                var5 = var3[2 * var7] - 48;
	            } else if(var3[2 * var7] >= 97 && var3[2 * var7] <= 122) {
	                var5 = var3[2 * var7] - 97 + 10;
	            } else {
	                var5 = var3[2 * var7] - 65 + 10;
	            }

	            int var6;
	            if(var3[2 * var7 + 1] >= 48 && var3[2 * var7 + 1] <= 57) {
	                var6 = var3[2 * var7 + 1] - 48;
	            } else if(var3[2 * var7 + 1] >= 97 && var3[2 * var7 + 1] <= 122) {
	                var6 = var3[2 * var7 + 1] - 97 + 10;
	            } else {
	                var6 = var3[2 * var7 + 1] - 65 + 10;
	            }

	            int var8 = (var5 << 4) + var6;
	            byte var9 = (byte)var8;
	            var4[var7] = var9;
	        }

	        return var4;
	    }

	    public static byte[] intToBytes(int var0) {
	        byte[] var1 = new byte[]{(byte)(var0 & 255), (byte)(var0 >> 8 & 255), (byte)(var0 >> 16 & 255), (byte)(var0 >> 24 & 255)};
	        return var1;
	    }
	    //把int数组全部变成int类型
	public static int intarr2int(int[] arr) {
		String a = null;
		int b = 0;
		for (int i = 0; i < arr.length - 1; i++) {

			a = a + arr[i];
			try {
//							String bString=a.substring(4, 4+6);
				String bString = a.substring(0, a.length());
				b = Integer.valueOf(bString).intValue();
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}

		}
		return b;
	}
	//把int数组变成int类型
	public static int intarr2int1(int[] arr) {
		String a = null;
		int b = 0;
		for (int i = 0; i < arr.length - 1; i++) {

			a = a + arr[i];
			try {
//				String bString = a.substring(4, 4 + 6);
	    			String bString=a.substring(0, a.length());
				b = Integer.valueOf(bString).intValue();
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}

		}
		return b;
	}
			

	    public static byte[] intToBytes2(int var0) {
	        byte[] var1 = new byte[]{(byte)(var0 >> 24 & 255), (byte)(var0 >> 16 & 255), (byte)(var0 >> 8 & 255), (byte)(var0 & 255)};
	        return var1;
	    }

	    public static int bytesToInt(byte[] var0, int var1) {
	        int var2 = var0[var1] & 255 | (var0[var1 + 1] & 255) << 8 | (var0[var1 + 2] & 255) << 16 | (var0[var1 + 3] & 255) << 24;
	        return var2;
	    }

	    public static int bytesToInt2(byte[] var0, int var1) {
	        int var2 = (var0[var1] & 255) << 24 | (var0[var1 + 1] & 255) << 16 | (var0[var1 + 2] & 255) << 8 | var0[var1 + 3] & 255;
	        return var2;
	    }

	    public static boolean endOfBytesIsOneGBK(byte[] var0) {
	        if(var0 != null && var0.length != 0) {
	            boolean var1 = true;
	            if(var0[var0.length - 1] < -1) {
	                int var2;
	                for(var2 = var0.length - 1; var2 >= 0 && var0[var2] < 0; --var2) {
	                    ;
	                }

	                if(var2 == 0) {
	                    ;
	                }

	                int var3 = var0.length - var2 - 1;
	                if(var3 % 2 == 0) {
	                    var1 = false;
	                }
	            } else {
	                var1 = false;
	            }

	            return var1;
	        } else {
	            return false;
	        }
	    }

	    public static byte[] xor8(byte[] var0, byte[] var1) {
	        byte[] var2 = new byte[8];
	        if(var0 != null && var1 != null && var0.length >= 8 && var1.length >= 8) {
	            for(int var3 = 0; var3 < 8; ++var3) {
	                var2[var3] = (byte)(var0[var3] ^ var1[var3]);
	            }

	            return var2;
	        } else {
	            return null;
	        }
	    }

	    public static void main(String[] var0) {
	        byte[] var1 = new byte[]{(byte)-76, (byte)-14, (byte)-45, (byte)-95, (byte)-41, (byte)-42, (byte)-73, (byte)-5, (byte)-76, (byte)-82, (byte)-54, (byte)-79, (byte)-93, (byte)-70, (byte)-44, (byte)-38, (byte)-46, (byte)-86, (byte)-45, (byte)-48, (byte)-46, (byte)-69, (byte)-72, (byte)-10, (byte)53, (byte)-41, (byte)-42, (byte)-67, (byte)-38, (byte)-75, (byte)-60, (byte)-54, (byte)-3, (byte)-66, (byte)-35, (byte)-51, (byte)-73, (byte)-93};
	        byte[] var2 = new byte[]{(byte)-76, (byte)-14, (byte)-45, (byte)-95, (byte)-41, (byte)-42, (byte)-73, (byte)-5, (byte)-76, (byte)-82, (byte)-54, (byte)-79, (byte)-93, (byte)-70, (byte)-44, (byte)-38, (byte)-46, (byte)-86, (byte)-45, (byte)-48, (byte)-46, (byte)-69, (byte)-72, (byte)-10, (byte)53, (byte)-41, (byte)-42, (byte)-67, (byte)-38, (byte)-75, (byte)-60, (byte)-54, (byte)-3, (byte)-66, (byte)-35, (byte)-51, (byte)-73, (byte)-93, (byte)-88, (byte)-41, (byte)-42, (byte)-52, (byte)-27, (byte)-76, (byte)-13, (byte)-48, (byte)-95};
	        byte[] var3 = new byte[]{(byte)-76, (byte)-14, (byte)-45, (byte)-95, (byte)-41, (byte)-42, (byte)-73, (byte)-5, (byte)-76, (byte)-82, (byte)-54, (byte)-79, (byte)-93, (byte)-70, (byte)-44, (byte)-38, (byte)-46, (byte)-86, (byte)-45, (byte)-48, (byte)-46, (byte)-69, (byte)-72, (byte)-10};
	        byte[] var4 = var1;
	        int var5 = var1.length;

	        int var6;
	        byte var7;
	        for(var6 = 0; var6 < var5; ++var6) {
	            var7 = var4[var6];
	            System.out.print(var7 + "\t");
	        }

	        System.out.println();
	        var4 = var2;
	        var5 = var2.length;

	        for(var6 = 0; var6 < var5; ++var6) {
	            var7 = var4[var6];
	            System.out.print(var7 + "\t");
	        }

	        System.out.println();
	        boolean var8 = endOfBytesIsOneGBK(var1);
	        System.out.println("bool = " + var8);
	        boolean var9 = endOfBytesIsOneGBK(var2);
	        System.out.println("bool2 = " + var9);
	        boolean var10 = endOfBytesIsOneGBK(var3);
	        System.out.println("bool2 = " + var10);
	    }

	    public static String toStringHex(String var0) {
	        byte[] var1 = new byte[var0.length() / 2];

	        for(int var2 = 0; var2 < var1.length; ++var2) {
	            try {
	                var1[var2] = (byte)(255 & Integer.parseInt(var0.substring(var2 * 2, var2 * 2 + 2), 16));
	            } catch (Exception var5) {
	                var5.printStackTrace();
	            }
	        }

	        try {
	            var0 = new String(var1, "utf-8");
	        } catch (Exception var4) {
	            var4.printStackTrace();
	        }

	        return var0;
	    }

	    public static byte[] commonString2Bcd(String var0) {
	        int var1 = var0.length();
	        int var2 = var1 % 2;
	        if(var2 != 0) {
	            var0 = "0" + var0;
	            var1 = var0.length();
	        }

	        byte[] var3 = new byte[var1];
	        if(var1 >= 2) {
	            var1 /= 2;
	        }

	        byte[] var4 = new byte[var1];
	        var3 = var0.getBytes();

	        for(int var7 = 0; var7 < var0.length() / 2; ++var7) {
	            int var5;
	            if(var3[2 * var7] >= 48 && var3[2 * var7] <= 57) {
	                var5 = var3[2 * var7] - 48;
	            } else if(var3[2 * var7] >= 97 && var3[2 * var7] <= 122) {
	                var5 = var3[2 * var7] - 97 + 10;
	            } else {
	                var5 = var3[2 * var7] - 65 + 10;
	            }

	            int var6;
	            if(var3[2 * var7 + 1] >= 48 && var3[2 * var7 + 1] <= 57) {
	                var6 = var3[2 * var7 + 1] - 48;
	            } else if(var3[2 * var7 + 1] >= 97 && var3[2 * var7 + 1] <= 122) {
	                var6 = var3[2 * var7 + 1] - 97 + 10;
	            } else {
	                var6 = var3[2 * var7 + 1] - 65 + 10;
	            }

	            int var8 = (var5 << 4) + var6;
	            byte var9 = (byte)var8;
	            var4[var7] = var9;
	        }

	        return var4;
	    }

	    public static String hexStringXOR(String var0) {
	        if(!TextUtils.isEmpty(var0) && var0.length() != 0) {
	            String var1 = hexByteArray2BinaryStr(hexString2ByteArray(var0));
	            char[] var2 = var1.toCharArray();

	            for(int var3 = 0; var3 < var2.length; ++var3) {
	                if(var2[var3] == 48) {
	                    var2[var3] = 49;
	                } else if(var2[var3] == 49) {
	                    var2[var3] = 48;
	                }
	            }

	            new String();
	            var1 = binaryString2hexString(String.valueOf(var2));
	            return var1;
	        } else {
	            return "";
	        }
	    }
	    
	    /**  
	     * 锟街凤拷锟斤拷转锟斤拷锟斤拷十锟斤拷锟斤拷锟斤拷锟街凤拷锟斤拷 
	     * @param String str 锟斤拷转锟斤拷锟斤拷ASCII锟街凤拷锟斤拷 
	     * @return String 每锟斤拷Byte之锟斤拷崭锟街革拷锟斤拷锟斤拷: [61 6C 6B] 
	     */    
	    public static String str2HexStr(String str)  
	    {    
	  
	        char[] chars = "0123456789ABCDEF".toCharArray();    
	        StringBuilder sb = new StringBuilder("");  
	        byte[] bs = str.getBytes();    
	        int bit;    
	          
	        for (int i = 0; i < bs.length; i++)  
	        {    
	            bit = (bs[i] & 0x0f0) >> 4;    
	            sb.append(chars[bit]);    
	            bit = bs[i] & 0x0f;    
	            sb.append(chars[bit]);   
	        }    
	        return sb.toString().trim();    
	    }  
	    
	    
	    
	    
	    
	    
	    
	    
	   /*
	    * 图片锟斤拷锟斤拷 
	    */
	    
		public static int saveImage(Bitmap bmp) {
			File appDir = new File("/sdcard/", "bitmap");
			if (!appDir.exists()) {
				appDir.mkdir();
			}
			String fileName = "test" + ".jpg";
			File file = new File(appDir, fileName);
			try {
				FileOutputStream fos = new FileOutputStream(file);
				bmp.compress(Bitmap.CompressFormat.JPEG, 100, fos);
				fos.flush();
				fos.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return 0;
		}
		
		public static byte[] toBmpBytes(Bitmap bitmap) {

			if (bitmap == null)
				return null;

			int nBmpWidth = bitmap.getWidth();
			int nBmpHeight = bitmap.getHeight();
			int nFixBmpHeight = ((nBmpHeight + 7) >> 3) << 3;
			int biBitCount = 1;
			int wWidth = ((((nBmpWidth * biBitCount) + 31) & ~31) >> 3);
			int bufferSize = wWidth * nFixBmpHeight;
			try {
				//bmp锟侥硷拷头
				int bfType = 0x4d42;
				long bfOffBits = 14 + 40 + 8;
				long bfSize = bfOffBits + bufferSize;
				int bfReserved1 = 0;
				int bfReserved2 = 0;
				ByteBuffer byteBuffer = ByteBuffer.allocate((int) bfSize);
				// 锟斤拷锟斤拷bmp锟侥硷拷头
				writeWord(byteBuffer, bfType);
				writeDword(byteBuffer, bfSize);
				writeWord(byteBuffer, bfReserved1);
				writeWord(byteBuffer, bfReserved2);
				writeDword(byteBuffer, bfOffBits);

				//bmp锟斤拷息头
				long biSize = 40L;
				long biWidth = nBmpWidth;
				long biHeight = nFixBmpHeight;
				int biPlanes = 1;
				//	            int biBitCount = 1;
				long biCompression = 0L;
				long biSizeImage = bufferSize;
				long biXpelsPerMeter = 0L;
				long biYPelsPerMeter = 0L;
				long biClrUsed = 0L;
				long biClrImportant = 0L;
				// 锟斤拷锟斤拷bmp锟斤拷息头
				writeDword(byteBuffer, biSize);
				writeLong(byteBuffer, biWidth);
				writeLong(byteBuffer, biHeight);
				writeWord(byteBuffer, biPlanes);
				writeWord(byteBuffer, biBitCount);
				writeDword(byteBuffer, biCompression);
				writeDword(byteBuffer, biSizeImage);
				writeLong(byteBuffer, biXpelsPerMeter);
				writeLong(byteBuffer, biYPelsPerMeter);
				writeDword(byteBuffer, biClrUsed);
				writeDword(byteBuffer, biClrImportant);
				writeLong(byteBuffer, 0xff000000L);
				writeLong(byteBuffer, 0xffffffffL);

				byte[] fix = new byte[(nFixBmpHeight - nBmpHeight) * wWidth];
				Arrays.fill(fix, (byte) 0xff);
				byteBuffer.put(fix);
				byte data[] = byteBuffer.array();
				int position = byteBuffer.position();
				int binary;
				int nCol, nRealCol;
				int wRow;
				int clr;
				int tmp;
				for (nCol = 0, nRealCol = nBmpHeight - 1; nCol < nBmpHeight; ++nCol, --nRealCol) {
					binary = 0;
					for (wRow = 0; wRow < (wWidth << 3); wRow++) {
						if (wRow < nBmpWidth) {
							clr = bitmap.getPixel(wRow, nCol);
							tmp = (Color.red(clr) + Color.green(clr) + Color.blue(clr)) / 3 > 200 ? 1 : 0;
							//	                        tmp = (Color.red(clr) > 180 && Color.green(clr) > 180 && Color.blue(clr) > 180) ? 1 : 0;
							binary <<= 1;
							binary |= tmp;
						} else {
							binary <<= 1;
						}

						if ((wRow + 1) % 8 == 0) {
							data[position + wWidth * nRealCol + (((wRow + 1) >> 3) - 1)] = (byte) binary;
							binary = 0;
						}
					}
				}
				return data;

			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
		}

		private static void writeWord(ByteBuffer buffer, int value) throws IOException {
			buffer.put((byte) (value & 0xff));
			buffer.put((byte) (value >> 8 & 0xff));
		}

		private static void writeDword(ByteBuffer buffer, long value) throws IOException {
			buffer.put((byte) (value & 0xff));
			buffer.put((byte) (value >> 8 & 0xff));
			buffer.put((byte) (value >> 16 & 0xff));
			buffer.put((byte) (value >> 24 & 0xff));
		}

		private static void writeLong(ByteBuffer buffer, long value) throws IOException {
			buffer.put((byte) (value & 0xff));
			buffer.put((byte) (value >> 8 & 0xff));
			buffer.put((byte) (value >> 16 & 0xff));
			buffer.put((byte) (value >> 24 & 0xff));
		}
		
		//RSA更新DES加密方式的主秘钥      用于ddi_customer_cmddeal这个接口，该接口只用于RSA算法
	public static String RSAupdatadesdata() {
		// 主密钥算法类型 00：DES 01：2DES 02:3DES
		String Mkeytype = "00000000";
		// 主密钥索引 16进制
		String Mkeydex = "08000000";
		// 随机数
		String random = "3839323739373934";  //改下这里
		/***
		 * 主密钥密文=终端公钥加密主密钥明文 只需要拷贝公钥到对应值，加密数据前面不需要添加任何数据 终端公钥modulus：
		 * a2d1d5f3041a870cfff2a95b905ba68d3a3992e983d441aa8be64f6ee81ec28a5e536248cc9ccd3bdab9f0a86737ebc5d08bfbdae21099dfbdd4969098b1bef2e1f145eb330c6820fcce6f3ace4abbdbaf5bb9397cd1bdd7c25748191b9b507ad747c52104a5785f120293b85671b6878e5fc486b4bdab264b4f6ef40bb0dfdd8aea77c3f71ac4f8bed194e9797b2ad9b980d49b5620831ab94362ffedc5ccb040cee056e6f8d08b6d5c30d9209d317181bcfbd011912800c1ab5e0d29fe5ec12e176bcdb9708e8a62d35a169fc2235eb0f89f2945798c4fc89834fcc72e23a7e29786b0ab4d2bd08d2b6230a3cbda87ae27a09dcee17bc895cd447777b749fd
		 * 主密钥明文：3131313131313131
		 */
		String crypt_PK_Epp_MK = "86F7FBE87D5CF9A6302DC966120BECD7FEA000DA882648A4C509DEEC8DFFFB73B2EF908FD57B1970E71AA6A7132233A0A55AC7BA43E3F294536733A869C6DD93715CF683D0437871B80E26B23828183BAC069231CB9A1D36D956DF177FE1AC7654C099CF65716E150974E8AB924B5FFBDEB0672ED59206FD5386914F9E14AA3786F71178264A07C1AFE70AE04AA40D684303A7220A5F30315634A04FF275E81AD05B53BE10B6C606C7E2AFF42EDB9146CCF80023BF0BE44C3331A1B48FA6939992AE0A71EADF8F6F470818810D8EE815C9B21EC49DC488BA2652F76DBB2325373BFCF4851C6C570B239558D1AAA48FDA42AD167BE29DBE67E510F8DF02C12185";
		/***
		 * 交行私钥签名主秘钥密文 =交行私钥加密主密钥密文的HASH256值
		 * 私钥签名是需要把公私钥都添加到对应的选项的，然后签名的是实际数据的hash值然后前面添加固定值
		 * 交行私钥privateEXP.（d）：31454BF000CF7CA1AFE19BC36DC55EF9D3432C0B72E1FF7D6639F6F9A95F6C5EA0D9BEF8505D3A599E899687CAA6B4494198C0653090230EE28BCB101F55D3516761E6D5E280EA9BA23E6313D1EFF266E4D60D1F5590F6DD528CE2BAE20666C5D59DAD89AEEACF5CDB0292D14BF95A9F10F599D0204DF77612BCFD55F87D123418BBB511F1E361B8480A7A074006018B662556BA738ECEC6E8B2991CF4BA3B84199DB102608E97808A4DF52150113989B5F9B07CDE22059086E3A71AE3311EC6CE291A5A4AB34797B907C3D5B2201784DC7D019977F4D6529839D6D36234133FDF1AD7412918B4AF5DDA74FE3630FBCCC650819DE60AE99AF52C25390DA71D11
		 * 交行公钥：AD2F9E888421F5FE38DC6484FC0AFE9322E6F5D59D228258B17EDEB9FE8F3AEAC6AE742893D0337FFDD8E22EE425EF8CF77238BB83590908E7CD8CBF52881A59F8543963AFA260096735DAB628B87BE2B779E8FACE426EC78501ED139A780A621F1B220E5029EF99FD54186212765CD97B20C8DE918AA88679FE6F8EB927126F48ED0CCD10C33B4538F08CF6DF5799C54A50E2F38EC7D0522D49BAC3DECCDFB18B37734264538F2A8D94BB9CF0AB5B9655AD3A319CB488A78F17FFEC5C05F09C51C7B511DF1A5B222941B2012A9707460C78185AF29291A07BB6E168975403BD0331C95CED884AA9633C96ED27D1CD7047FF484E401E7CB8CF551D5A37F3760B
		 * 主密钥密文签名添加的值：3031300d060960864801650304020105000420
		 * 主密钥密文hash256值（计算方式等于随机数+主密钥密文值（crypt_PK_Epp_MK），然后通过工具计算出总的HASH值）：67CB0323B3224D68C101E22F6591BCD4FAB0F9ACB1F717A28AEBEF8F537E3680
		 * 
		 */
		//改下这里
		String sigSK_Bank_R_Epp_CryptPK_EppMK = "9013F1032A332B02D6D59DE0506EBDF6486D8F1479B1E1EE9F1596D908C5B19E19A382470BE45E924856D273C2E943DF9FDDAA03C4BF2346AEF9D18A4B6EBB2A99578EC653ED9897FA717AE168643838B473673AAA9D71BA13EC20637A9B1B6BC9CCA2C80CC843C09754C6DE6B33E837A62CF578A459B7A2CBE8A885355AF6609140EDECAB36DE86E35F4E7D8CC782E6F479F28F9C8600A04F12C92244D062EB67A5327BC2CC87D6F4D747DC8F28BCF1AD7B148F47722423A4B780C3BB2933335C78679ABDC890A57604D842F3F05A8A50DC02EDFAD53FFFFDBE053380130B499F5F648DF89B1EDA8DB5F3B5EB5FCC2A7A7BA4F23ABD82C075E92EB8BAB4DCB7";
		/***
		 * 交行公钥
		 */
		String PK_bank = "AD2F9E888421F5FE38DC6484FC0AFE9322E6F5D59D228258B17EDEB9FE8F3AEAC6AE742893D0337FFDD8E22EE425EF8CF77238BB83590908E7CD8CBF52881A59F8543963AFA260096735DAB628B87BE2B779E8FACE426EC78501ED139A780A621F1B220E5029EF99FD54186212765CD97B20C8DE918AA88679FE6F8EB927126F48ED0CCD10C33B4538F08CF6DF5799C54A50E2F38EC7D0522D49BAC3DECCDFB18B37734264538F2A8D94BB9CF0AB5B9655AD3A319CB488A78F17FFEC5C05F09C51C7B511DF1A5B222941B2012A9707460C78185AF29291A07BB6E168975403BD0331C95CED884AA9633C96ED27D1CD7047FF484E401E7CB8CF551D5A37F3760B";
		/***
		 * 厂商私钥签名交行公钥=厂商私钥加密交行公钥的HASH256值
		 * 厂商公钥：C755E36910E52CD55FFBF36C1F3F8EF353E5CE40C670C611B19C9A8A2C557C7E1B661E069F2F6958DF64D1B9F7B32E0E16BED69D25E049B1BE78700FCC0BA2D56041186292F9A49D338B2FC561E8BF743C7E34CF489A0A99DB6CDC32615CE51B3B44DF81C9E01411B9EC7BC49FBD4C30893788438607D701B73905E6614B2CEC1B44506E431F267F7E78C5CD41E9476FD5DC5B5D563E17CC8F97F8B97B2D33A2AB3825D95FB9CB8C39D5E0A092B8496721BE95E2405956EF900A21BB65C939AA48144A02812D1CF52B329759FD5F5F421C496E93712F42C79DAC1490DA4510A62581005517A00394F3B29994275ED3FC5E4F3EFA535CB6CB0A3A61E5B5FD0617
		 * 厂商私钥：66FD9C6ADB9CDD463DBA8AB1D18F60479E907CB9810E217860E13E03A8165F2534F8D508ACD4AD448ADFA770C36763A349E33E35A1AD39C6495826E63291CC871C9D658100D9555117A19184152B5148383D2901F44C0AB025EC1FF533D2F058DA8DA24187D16BED20B7EBD6D285D6C8B90CE52DA62184D851177851E8F1137ADC877B85671DFE2EA807AFB55DA9EC0C2586857214C588D72E6E77BA91DE8620F29B91A9F68B76C0A183D30E2189CD65F7F09C3FDC53D2470C8801768ED3663893798CB21ED1C46C564EAA49161C0AC26E181FC4ED1EE2ED61E2D9DBC56CA105A104DC2B81442CC2185DE71AA2988502A18D2F248AF8809DE3B946BB647682A1
		 * 交行公钥：AD2F9E888421F5FE38DC6484FC0AFE9322E6F5D59D228258B17EDEB9FE8F3AEAC6AE742893D0337FFDD8E22EE425EF8CF77238BB83590908E7CD8CBF52881A59F8543963AFA260096735DAB628B87BE2B779E8FACE426EC78501ED139A780A621F1B220E5029EF99FD54186212765CD97B20C8DE918AA88679FE6F8EB927126F48ED0CCD10C33B4538F08CF6DF5799C54A50E2F38EC7D0522D49BAC3DECCDFB18B37734264538F2A8D94BB9CF0AB5B9655AD3A319CB488A78F17FFEC5C05F09C51C7B511DF1A5B222941B2012A9707460C78185AF29291A07BB6E168975403BD0331C95CED884AA9633C96ED27D1CD7047FF484E401E7CB8CF551D5A37F3760B
		 * 交行公钥hash256：06D2BB13D4D99CB231299F41861F6E98DEA84B85F881E9E6ABC94BEA6E4F4B77
		 * 主密钥密文签名添加的值：3031300d060960864801650304020105000420
		 */
		
		String SigSK_Vnd_PK_Bank = "46315BBBDC760E3DE57D2336C5596E848253B1B17CBE9979FDC52F2DD28BE47D9A976D5752F75CADBA00D7CD871D2DBB848EEC792B05641A1B529E1F290A4C1E13398D8D07461875BA372E7A91A1179CF8A0D940EFCD149C96A5751F36A59D29F0947F68C4B66CF8A0BCBFE795730A274F060A0520C817C3516F65651D62911E13E42D29DD7125E48BDE704875DFD7026D7FE6A3D09CD2B3E36DEA9F09D472464D201EA0810B1889553BD334BB79FA4FDF6074797AA460FE4C71BA9B4EE9CFCAB69EA19252ACDF1BFB35268D62EEC1A4B15D05A7F151D00C6F99FD286F070F804C8726E8F503C24549A380AF5AC03873ADFBA80AD249251E7B049000F562AEDD";
		String total = Mkeytype + Mkeydex + random + crypt_PK_Epp_MK + sigSK_Bank_R_Epp_CryptPK_EppMK + PK_bank
				+ SigSK_Vnd_PK_Bank;
		return total;
	}
	//RSA更新2DES加密方式的主秘钥      用于ddi_customer_cmddeal这个接口，该接口只用于RSA算法
	public static String RSAupdata2desdata() {
		// 主密钥算法类型 00：DES 01：2DES 02:3DES
		String Mkeytype = "01000000";
		// 主密钥索引 16进制
		String Mkeydex = "95000000";
		// 随机数
		String random = "3230333535313130";
		/***
		 * 主密钥密文=终端公钥加密主密钥明文 只需要拷贝公钥到对应值，加密数据前面不需要添加任何数据 终端公钥modulus：
		 * a2d1d5f3041a870cfff2a95b905ba68d3a3992e983d441aa8be64f6ee81ec28a5e536248cc9ccd3bdab9f0a86737ebc5d08bfbdae21099dfbdd4969098b1bef2e1f145eb330c6820fcce6f3ace4abbdbaf5bb9397cd1bdd7c25748191b9b507ad747c52104a5785f120293b85671b6878e5fc486b4bdab264b4f6ef40bb0dfdd8aea77c3f71ac4f8bed194e9797b2ad9b980d49b5620831ab94362ffedc5ccb040cee056e6f8d08b6d5c30d9209d317181bcfbd011912800c1ab5e0d29fe5ec12e176bcdb9708e8a62d35a169fc2235eb0f89f2945798c4fc89834fcc72e23a7e29786b0ab4d2bd08d2b6230a3cbda87ae27a09dcee17bc895cd447777b749fd
		 * 主密钥明文：31313131313131313131313131313131
		 */
		//主密钥密文
		String crypt_PK_Epp_MK = "878A4E0463F7916A5D5B9CC2929E829408DD9F70FDB4F4FFEE7AD1755095616B79872CA81411313E940669DE86D16A613F39287B760D7A03248310195D316EE24CFC71428921BA7678634F47577B9D3143377A0F977C77F98DC90E71454C9A6AE5894249D0F109D03AAE1FAD35EE9FED94E152F418769523F891FA87F81D4AA94E8BDFBF2504A849DD4A388A14A4954BAC712DBBAEA598311CC52A532AC6CFACF4137E6C195CE1BD21FD280C89979240A21DE43D2EFF9481CD1DEE9BF956811F44DAE9E1CED0F48623FFAEB0F4865E82BFEC6F3F272C24A81FDF9FE7D9C20BB8A9BBE331AC980D780C36B3EDB563A3FC43D285B37EDFEB184604C34B1A94700E";
		/***
		 * 交行私钥签名主秘钥密文 =交行私钥加密主密钥密文的HASH256值
		 * 私钥签名是需要把公私钥都添加到对应的选项的，然后签名的是实际数据的hash值然后前面添加固定值
		 * 交行私钥privateEXP.（d）：31454BF000CF7CA1AFE19BC36DC55EF9D3432C0B72E1FF7D6639F6F9A95F6C5EA0D9BEF8505D3A599E899687CAA6B4494198C0653090230EE28BCB101F55D3516761E6D5E280EA9BA23E6313D1EFF266E4D60D1F5590F6DD528CE2BAE20666C5D59DAD89AEEACF5CDB0292D14BF95A9F10F599D0204DF77612BCFD55F87D123418BBB511F1E361B8480A7A074006018B662556BA738ECEC6E8B2991CF4BA3B84199DB102608E97808A4DF52150113989B5F9B07CDE22059086E3A71AE3311EC6CE291A5A4AB34797B907C3D5B2201784DC7D019977F4D6529839D6D36234133FDF1AD7412918B4AF5DDA74FE3630FBCCC650819DE60AE99AF52C25390DA71D11
		 * 交行公钥：AD2F9E888421F5FE38DC6484FC0AFE9322E6F5D59D228258B17EDEB9FE8F3AEAC6AE742893D0337FFDD8E22EE425EF8CF77238BB83590908E7CD8CBF52881A59F8543963AFA260096735DAB628B87BE2B779E8FACE426EC78501ED139A780A621F1B220E5029EF99FD54186212765CD97B20C8DE918AA88679FE6F8EB927126F48ED0CCD10C33B4538F08CF6DF5799C54A50E2F38EC7D0522D49BAC3DECCDFB18B37734264538F2A8D94BB9CF0AB5B9655AD3A319CB488A78F17FFEC5C05F09C51C7B511DF1A5B222941B2012A9707460C78185AF29291A07BB6E168975403BD0331C95CED884AA9633C96ED27D1CD7047FF484E401E7CB8CF551D5A37F3760B
		 * 主密钥密文签名添加的值：3031300d060960864801650304020105000420
		 * 主密钥密文hash256值（计算方式等于随机数+主密钥密文值，然后通过工具计算出总的HASH值）：286AADE49D823FF6EC6524206AAFFA14AE85045A2E8EE9B3C337F4A1EF0ED951
		 * 
		 */
		String sigSK_Bank_R_Epp_CryptPK_EppMK = "3B693559DA6F022CE877823027F6A52EC2675B0E31627DCE87ADD7BE11301BBFEC6BCA9998DC946ECBE596CAAB1B29B0078E9D3793DAE1D4C9EF38788496C792CD78B9A8F0255A399F987DD28451F0481023C93D47F435D894EA3D1D9224F6F2872C0E223718C232229BEE92EB49C8DBCBB4F06A58FC2803DE99361C746406B355D374499DF7DD2C00EC8C10E068E7C5C94F44693E5FE92BA0C8C7B05BA2241CE0FB4FAAD9FD81F4B5F0010F5FF76EA5D494FAC9E98A18C0B16A47181A6AE24F1EBED8F23B1E0A5633AEB8993041BD2C7F36D4FD263CB225A3524A5C03E67BDD8BAADA47C65C5849762972FB7C33BAA5C9E89D2EB54ABC99EBE3793C72387B92";
		/***
		 * 交行公钥
		 */
		String PK_bank = "AD2F9E888421F5FE38DC6484FC0AFE9322E6F5D59D228258B17EDEB9FE8F3AEAC6AE742893D0337FFDD8E22EE425EF8CF77238BB83590908E7CD8CBF52881A59F8543963AFA260096735DAB628B87BE2B779E8FACE426EC78501ED139A780A621F1B220E5029EF99FD54186212765CD97B20C8DE918AA88679FE6F8EB927126F48ED0CCD10C33B4538F08CF6DF5799C54A50E2F38EC7D0522D49BAC3DECCDFB18B37734264538F2A8D94BB9CF0AB5B9655AD3A319CB488A78F17FFEC5C05F09C51C7B511DF1A5B222941B2012A9707460C78185AF29291A07BB6E168975403BD0331C95CED884AA9633C96ED27D1CD7047FF484E401E7CB8CF551D5A37F3760B";
		/***
		 * 厂商私钥签名交行公钥=厂商私钥加密交行公钥的HASH256值
		 * 厂商公钥：C755E36910E52CD55FFBF36C1F3F8EF353E5CE40C670C611B19C9A8A2C557C7E1B661E069F2F6958DF64D1B9F7B32E0E16BED69D25E049B1BE78700FCC0BA2D56041186292F9A49D338B2FC561E8BF743C7E34CF489A0A99DB6CDC32615CE51B3B44DF81C9E01411B9EC7BC49FBD4C30893788438607D701B73905E6614B2CEC1B44506E431F267F7E78C5CD41E9476FD5DC5B5D563E17CC8F97F8B97B2D33A2AB3825D95FB9CB8C39D5E0A092B8496721BE95E2405956EF900A21BB65C939AA48144A02812D1CF52B329759FD5F5F421C496E93712F42C79DAC1490DA4510A62581005517A00394F3B29994275ED3FC5E4F3EFA535CB6CB0A3A61E5B5FD0617
		 * 厂商私钥：66FD9C6ADB9CDD463DBA8AB1D18F60479E907CB9810E217860E13E03A8165F2534F8D508ACD4AD448ADFA770C36763A349E33E35A1AD39C6495826E63291CC871C9D658100D9555117A19184152B5148383D2901F44C0AB025EC1FF533D2F058DA8DA24187D16BED20B7EBD6D285D6C8B90CE52DA62184D851177851E8F1137ADC877B85671DFE2EA807AFB55DA9EC0C2586857214C588D72E6E77BA91DE8620F29B91A9F68B76C0A183D30E2189CD65F7F09C3FDC53D2470C8801768ED3663893798CB21ED1C46C564EAA49161C0AC26E181FC4ED1EE2ED61E2D9DBC56CA105A104DC2B81442CC2185DE71AA2988502A18D2F248AF8809DE3B946BB647682A1
		 * 交行公钥：AD2F9E888421F5FE38DC6484FC0AFE9322E6F5D59D228258B17EDEB9FE8F3AEAC6AE742893D0337FFDD8E22EE425EF8CF77238BB83590908E7CD8CBF52881A59F8543963AFA260096735DAB628B87BE2B779E8FACE426EC78501ED139A780A621F1B220E5029EF99FD54186212765CD97B20C8DE918AA88679FE6F8EB927126F48ED0CCD10C33B4538F08CF6DF5799C54A50E2F38EC7D0522D49BAC3DECCDFB18B37734264538F2A8D94BB9CF0AB5B9655AD3A319CB488A78F17FFEC5C05F09C51C7B511DF1A5B222941B2012A9707460C78185AF29291A07BB6E168975403BD0331C95CED884AA9633C96ED27D1CD7047FF484E401E7CB8CF551D5A37F3760B
		 * 交行公钥hash256：06D2BB13D4D99CB231299F41861F6E98DEA84B85F881E9E6ABC94BEA6E4F4B77
		 * 主密钥密文签名添加的值：3031300d060960864801650304020105000420
		 */
		String SigSK_Vnd_PK_Bank = "46315BBBDC760E3DE57D2336C5596E848253B1B17CBE9979FDC52F2DD28BE47D9A976D5752F75CADBA00D7CD871D2DBB848EEC792B05641A1B529E1F290A4C1E13398D8D07461875BA372E7A91A1179CF8A0D940EFCD149C96A5751F36A59D29F0947F68C4B66CF8A0BCBFE795730A274F060A0520C817C3516F65651D62911E13E42D29DD7125E48BDE704875DFD7026D7FE6A3D09CD2B3E36DEA9F09D472464D201EA0810B1889553BD334BB79FA4FDF6074797AA460FE4C71BA9B4EE9CFCAB69EA19252ACDF1BFB35268D62EEC1A4B15D05A7F151D00C6F99FD286F070F804C8726E8F503C24549A380AF5AC03873ADFBA80AD249251E7B049000F562AEDD";
		String total = Mkeytype + Mkeydex + random + crypt_PK_Epp_MK + sigSK_Bank_R_Epp_CryptPK_EppMK + PK_bank
				+ SigSK_Vnd_PK_Bank;
		return total;
	}
	//RSA更新3DES加密方式的主秘钥      用于ddi_customer_cmddeal这个接口，该接口只用于RSA算法
	public static String RSAupdata3desdata() {
		// 主密钥算法类型 00：DES 01：2DES 02:3DES
		String Mkeytype = "02000000";
		// 主密钥索引 16进制
		String Mkeydex = "4B000000";
		// 随机数   改下这里
		String random = "3738323033373332";
		/***
		 * 主密钥密文=终端公钥加密主密钥明文 只需要拷贝公钥到对应值，加密数据前面不需要添加任何数据 终端公钥modulus：
		 * a2d1d5f3041a870cfff2a95b905ba68d3a3992e983d441aa8be64f6ee81ec28a5e536248cc9ccd3bdab9f0a86737ebc5d08bfbdae21099dfbdd4969098b1bef2e1f145eb330c6820fcce6f3ace4abbdbaf5bb9397cd1bdd7c25748191b9b507ad747c52104a5785f120293b85671b6878e5fc486b4bdab264b4f6ef40bb0dfdd8aea77c3f71ac4f8bed194e9797b2ad9b980d49b5620831ab94362ffedc5ccb040cee056e6f8d08b6d5c30d9209d317181bcfbd011912800c1ab5e0d29fe5ec12e176bcdb9708e8a62d35a169fc2235eb0f89f2945798c4fc89834fcc72e23a7e29786b0ab4d2bd08d2b6230a3cbda87ae27a09dcee17bc895cd447777b749fd
		 * 主密钥明文：32323232321234560122334FEDACBDEF3131313131313131
		 */
		String crypt_PK_Epp_MK = "284F5D8D5D8B0D3C6A0D2D3C01D2B736585C4A9834E2DDC4C4F46DC7885FBB802B9B97692FC2CC93C89E02F89DAB0461D2A7B43C7BD3050EA13AF61EA086942BFCE13186BFF0B5A92CFF7B9FE1306DA07FC7818CD88AA2D873060617FCC0C0466B09D61FCF16D679E11DB283B6F5F568AFE4F29F5227B0A0FB05C85F7F48DCA06221FB951CC64CD461FF083B80B318FECB2383BB92440931544D03585ABB42E192C529FEE53E0E062E69CFC0BB5D21482F931A059D3582A5B3835ADD79EE964C70CE63023E2B713A16462653CB7166EB341E9337443E809D357302666F96AF16ABD70A5CD028D445BEE755B612EE22FB152241FA58061F43A8F974A99714A7A2";
		/***
		 * 交行私钥签名主秘钥密文 =交行私钥加密主密钥密文的HASH256值     需要把公钥和私钥一起全部拷贝到工具里面
		 * 私钥签名是需要把公私钥都添加到对应的选项的，然后签名的是实际数据的hash值然后前面添加固定值
		 * 交行私钥privateEXP.（d）：31454BF000CF7CA1AFE19BC36DC55EF9D3432C0B72E1FF7D6639F6F9A95F6C5EA0D9BEF8505D3A599E899687CAA6B4494198C0653090230EE28BCB101F55D3516761E6D5E280EA9BA23E6313D1EFF266E4D60D1F5590F6DD528CE2BAE20666C5D59DAD89AEEACF5CDB0292D14BF95A9F10F599D0204DF77612BCFD55F87D123418BBB511F1E361B8480A7A074006018B662556BA738ECEC6E8B2991CF4BA3B84199DB102608E97808A4DF52150113989B5F9B07CDE22059086E3A71AE3311EC6CE291A5A4AB34797B907C3D5B2201784DC7D019977F4D6529839D6D36234133FDF1AD7412918B4AF5DDA74FE3630FBCCC650819DE60AE99AF52C25390DA71D11
		 * 交行公钥：AD2F9E888421F5FE38DC6484FC0AFE9322E6F5D59D228258B17EDEB9FE8F3AEAC6AE742893D0337FFDD8E22EE425EF8CF77238BB83590908E7CD8CBF52881A59F8543963AFA260096735DAB628B87BE2B779E8FACE426EC78501ED139A780A621F1B220E5029EF99FD54186212765CD97B20C8DE918AA88679FE6F8EB927126F48ED0CCD10C33B4538F08CF6DF5799C54A50E2F38EC7D0522D49BAC3DECCDFB18B37734264538F2A8D94BB9CF0AB5B9655AD3A319CB488A78F17FFEC5C05F09C51C7B511DF1A5B222941B2012A9707460C78185AF29291A07BB6E168975403BD0331C95CED884AA9633C96ED27D1CD7047FF484E401E7CB8CF551D5A37F3760B
		 * 主密钥密文签名添加的值：3031300d060960864801650304020105000420
		 * 主密钥密文hash256值（计算方式等于随机数+主密钥密文值，然后通过工具计算出总的HASH值）：28A2B4D04E9DC23C8D86D97CFF83BB40FB6333F6A387F1D555F4BEB6ACFB91F3
		 * 
		 */
		//改下这里
		String sigSK_Bank_R_Epp_CryptPK_EppMK = "9EAE56EBDAA71F23CEBB0F642C39A112E13B1D71C358D8482BB1DBBB4FADCC0E62C573EEFC978895F1BAA952394E78344B3D0596082012C0DD25AB846B769859FE9EE67AFD10A473CC3270D170DB8FD33ADAEE1CBAB0D2E40CECEE738FA967EF23661162E181578B25DAD15113A4062F8B79E97ED41A83456AF6C58B755CCF10E206E536B80B1BD42BB576985BEF6A137942ECF01CEDE07024FECC4FAC3DBCB417D674E8A5D18643FE92EF3C07B33F24F9CA04B82A185ED2378DF6E00F6612C6B4DA6F97ECE4D1FDD84862DA50957E10EABD453D328CA4E491604FC3B7DC5429D07C104CB6242CC59D338CF565E87ECEECA0ABE868C1A7D419414B5ADA015640";
		/***
		 * 交行公钥
		 */
		String PK_bank = "AD2F9E888421F5FE38DC6484FC0AFE9322E6F5D59D228258B17EDEB9FE8F3AEAC6AE742893D0337FFDD8E22EE425EF8CF77238BB83590908E7CD8CBF52881A59F8543963AFA260096735DAB628B87BE2B779E8FACE426EC78501ED139A780A621F1B220E5029EF99FD54186212765CD97B20C8DE918AA88679FE6F8EB927126F48ED0CCD10C33B4538F08CF6DF5799C54A50E2F38EC7D0522D49BAC3DECCDFB18B37734264538F2A8D94BB9CF0AB5B9655AD3A319CB488A78F17FFEC5C05F09C51C7B511DF1A5B222941B2012A9707460C78185AF29291A07BB6E168975403BD0331C95CED884AA9633C96ED27D1CD7047FF484E401E7CB8CF551D5A37F3760B";
		/***
		 * 厂商私钥签名交行公钥=厂商私钥加密交行公钥的HASH256值
		 * 厂商公钥：C755E36910E52CD55FFBF36C1F3F8EF353E5CE40C670C611B19C9A8A2C557C7E1B661E069F2F6958DF64D1B9F7B32E0E16BED69D25E049B1BE78700FCC0BA2D56041186292F9A49D338B2FC561E8BF743C7E34CF489A0A99DB6CDC32615CE51B3B44DF81C9E01411B9EC7BC49FBD4C30893788438607D701B73905E6614B2CEC1B44506E431F267F7E78C5CD41E9476FD5DC5B5D563E17CC8F97F8B97B2D33A2AB3825D95FB9CB8C39D5E0A092B8496721BE95E2405956EF900A21BB65C939AA48144A02812D1CF52B329759FD5F5F421C496E93712F42C79DAC1490DA4510A62581005517A00394F3B29994275ED3FC5E4F3EFA535CB6CB0A3A61E5B5FD0617
		 * 厂商私钥：66FD9C6ADB9CDD463DBA8AB1D18F60479E907CB9810E217860E13E03A8165F2534F8D508ACD4AD448ADFA770C36763A349E33E35A1AD39C6495826E63291CC871C9D658100D9555117A19184152B5148383D2901F44C0AB025EC1FF533D2F058DA8DA24187D16BED20B7EBD6D285D6C8B90CE52DA62184D851177851E8F1137ADC877B85671DFE2EA807AFB55DA9EC0C2586857214C588D72E6E77BA91DE8620F29B91A9F68B76C0A183D30E2189CD65F7F09C3FDC53D2470C8801768ED3663893798CB21ED1C46C564EAA49161C0AC26E181FC4ED1EE2ED61E2D9DBC56CA105A104DC2B81442CC2185DE71AA2988502A18D2F248AF8809DE3B946BB647682A1
		 * 交行公钥：AD2F9E888421F5FE38DC6484FC0AFE9322E6F5D59D228258B17EDEB9FE8F3AEAC6AE742893D0337FFDD8E22EE425EF8CF77238BB83590908E7CD8CBF52881A59F8543963AFA260096735DAB628B87BE2B779E8FACE426EC78501ED139A780A621F1B220E5029EF99FD54186212765CD97B20C8DE918AA88679FE6F8EB927126F48ED0CCD10C33B4538F08CF6DF5799C54A50E2F38EC7D0522D49BAC3DECCDFB18B37734264538F2A8D94BB9CF0AB5B9655AD3A319CB488A78F17FFEC5C05F09C51C7B511DF1A5B222941B2012A9707460C78185AF29291A07BB6E168975403BD0331C95CED884AA9633C96ED27D1CD7047FF484E401E7CB8CF551D5A37F3760B
		 * 交行公钥hash256：06D2BB13D4D99CB231299F41861F6E98DEA84B85F881E9E6ABC94BEA6E4F4B77
		 * 主密钥密文签名添加的值：3031300d060960864801650304020105000420
		 */
		String SigSK_Vnd_PK_Bank = "46315BBBDC760E3DE57D2336C5596E848253B1B17CBE9979FDC52F2DD28BE47D9A976D5752F75CADBA00D7CD871D2DBB848EEC792B05641A1B529E1F290A4C1E13398D8D07461875BA372E7A91A1179CF8A0D940EFCD149C96A5751F36A59D29F0947F68C4B66CF8A0BCBFE795730A274F060A0520C817C3516F65651D62911E13E42D29DD7125E48BDE704875DFD7026D7FE6A3D09CD2B3E36DEA9F09D472464D201EA0810B1889553BD334BB79FA4FDF6074797AA460FE4C71BA9B4EE9CFCAB69EA19252ACDF1BFB35268D62EEC1A4B15D05A7F151D00C6F99FD286F070F804C8726E8F503C24549A380AF5AC03873ADFBA80AD249251E7B049000F562AEDD";
		String total = Mkeytype + Mkeydex + random + crypt_PK_Epp_MK + sigSK_Bank_R_Epp_CryptPK_EppMK + PK_bank
				+ SigSK_Vnd_PK_Bank;
		return total;
	}
	//RSA更新SM4加密方式的主秘钥      用于ddi_customer_cmddeal这个接口，该接口只用于RSA算法
	public static String RSAupdataSM4data() {
		// 主密钥算法类型 00：DES 01：2DES 02:3DES
		String Mkeytype = "03000000";
		// 主密钥索引 16进制
		String Mkeydex = "03000000";
		// 随机数  改这里
		String random = "3834363037303938";
		/***
		 * 主密钥密文=终端公钥加密主密钥明文 只需要拷贝公钥到对应值，加密数据前面不需要添加任何数据 终端公钥modulus：
		 * a2d1d5f3041a870cfff2a95b905ba68d3a3992e983d441aa8be64f6ee81ec28a5e536248cc9ccd3bdab9f0a86737ebc5d08bfbdae21099dfbdd4969098b1bef2e1f145eb330c6820fcce6f3ace4abbdbaf5bb9397cd1bdd7c25748191b9b507ad747c52104a5785f120293b85671b6878e5fc486b4bdab264b4f6ef40bb0dfdd8aea77c3f71ac4f8bed194e9797b2ad9b980d49b5620831ab94362ffedc5ccb040cee056e6f8d08b6d5c30d9209d317181bcfbd011912800c1ab5e0d29fe5ec12e176bcdb9708e8a62d35a169fc2235eb0f89f2945798c4fc89834fcc72e23a7e29786b0ab4d2bd08d2b6230a3cbda87ae27a09dcee17bc895cd447777b749fd
		 * 主密钥明文：ABCD03E3F01234560122334FEDACBDEF
		 */
		String crypt_PK_Epp_MK = "6DBE95772C0F0DE138EDC3A71B81E1BF494064740F3D32EED065C35ABBCCA40E8B5FDCCBE00E8981A69AF0B3FB0F715B32AB4E8230E070AFE523B94DA28730191EB9DAA6BFB5973771E595D281A4A89434DEE7F19BC85109800795424E24395010F107925F6893EA9BD9844900822DBBFF6513D18FBF2D75B895C73D07F137E9091CAD39DA262C6695E58044C8BBD8F35B2FD1A234202A419F17066C7F34041409511F774CFBCA076BFDF1020B6208E542D066C70FB2DBE47E44A67ADEF337D9A4826F1633E1656AE47DA550469832747A7EDE7289E1DD2AE13AC3D05CA9A6FAD8604DDB5D9A5B873BE7977E2BDABD45693691F3FA7DDC5B0F9C77ACE12438EA";
		/***
		 * 交行私钥签名主秘钥密文 =交行私钥加密主密钥密文的HASH256值     需要把公钥和私钥一起全部拷贝到工具里面
		 * 私钥签名是需要把公私钥都添加到对应的选项的，然后签名的是实际数据的hash值然后前面添加固定值
		 * 交行私钥privateEXP.（d）：31454BF000CF7CA1AFE19BC36DC55EF9D3432C0B72E1FF7D6639F6F9A95F6C5EA0D9BEF8505D3A599E899687CAA6B4494198C0653090230EE28BCB101F55D3516761E6D5E280EA9BA23E6313D1EFF266E4D60D1F5590F6DD528CE2BAE20666C5D59DAD89AEEACF5CDB0292D14BF95A9F10F599D0204DF77612BCFD55F87D123418BBB511F1E361B8480A7A074006018B662556BA738ECEC6E8B2991CF4BA3B84199DB102608E97808A4DF52150113989B5F9B07CDE22059086E3A71AE3311EC6CE291A5A4AB34797B907C3D5B2201784DC7D019977F4D6529839D6D36234133FDF1AD7412918B4AF5DDA74FE3630FBCCC650819DE60AE99AF52C25390DA71D11
		 * 交行公钥：AD2F9E888421F5FE38DC6484FC0AFE9322E6F5D59D228258B17EDEB9FE8F3AEAC6AE742893D0337FFDD8E22EE425EF8CF77238BB83590908E7CD8CBF52881A59F8543963AFA260096735DAB628B87BE2B779E8FACE426EC78501ED139A780A621F1B220E5029EF99FD54186212765CD97B20C8DE918AA88679FE6F8EB927126F48ED0CCD10C33B4538F08CF6DF5799C54A50E2F38EC7D0522D49BAC3DECCDFB18B37734264538F2A8D94BB9CF0AB5B9655AD3A319CB488A78F17FFEC5C05F09C51C7B511DF1A5B222941B2012A9707460C78185AF29291A07BB6E168975403BD0331C95CED884AA9633C96ED27D1CD7047FF484E401E7CB8CF551D5A37F3760B
		 * 主密钥密文签名添加的值：3031300d060960864801650304020105000420
		 * 主密钥密文hash256值（计算方式等于随机数+主密钥密文值，然后通过工具计算出总的HASH值）：E181CB4D4645A2EAD18D70D4E4AB641C6F4BC483407D26E6ABB0942373E32D75
		 * 
		 */
		//改这里
		String sigSK_Bank_R_Epp_CryptPK_EppMK = "3E18CADA883B67519135CDE2D30FF72147E5A0200850DCA5C50ED1CEB60E3B71123FD380C2BE56B417AA1034A408265637E19290F0557161B5F31B2A94E63AA735FF00B1F8064F32B705CC704F716E5CCF34B46081893B481696668221FA37C0736B856C7ED6E28ED1F8726284F98C01D20D636FEFBDD43884ED2999B81D9B9A76315B556688985D4F5096125E32069553126D11BCB0C1656436DD0BDA25CB0341A339ECE749D79CC7C4DB58988A828F834400C240C61CF43953982EA7CE8E0C08F42C42F21AB7FA25AAE0AD1BCDB333564D9543AB2B438D7FDFFD88F188376839DD37E25A7F4A99575060E060521BFE659D785EAEA1B4D6653735ABB4A1FC8B";
		/***
		 * 交行公钥
		 */
		String PK_bank = "AD2F9E888421F5FE38DC6484FC0AFE9322E6F5D59D228258B17EDEB9FE8F3AEAC6AE742893D0337FFDD8E22EE425EF8CF77238BB83590908E7CD8CBF52881A59F8543963AFA260096735DAB628B87BE2B779E8FACE426EC78501ED139A780A621F1B220E5029EF99FD54186212765CD97B20C8DE918AA88679FE6F8EB927126F48ED0CCD10C33B4538F08CF6DF5799C54A50E2F38EC7D0522D49BAC3DECCDFB18B37734264538F2A8D94BB9CF0AB5B9655AD3A319CB488A78F17FFEC5C05F09C51C7B511DF1A5B222941B2012A9707460C78185AF29291A07BB6E168975403BD0331C95CED884AA9633C96ED27D1CD7047FF484E401E7CB8CF551D5A37F3760B";
		/***
		 * 厂商私钥签名交行公钥=厂商私钥加密交行公钥的HASH256值
		 * 厂商公钥：C755E36910E52CD55FFBF36C1F3F8EF353E5CE40C670C611B19C9A8A2C557C7E1B661E069F2F6958DF64D1B9F7B32E0E16BED69D25E049B1BE78700FCC0BA2D56041186292F9A49D338B2FC561E8BF743C7E34CF489A0A99DB6CDC32615CE51B3B44DF81C9E01411B9EC7BC49FBD4C30893788438607D701B73905E6614B2CEC1B44506E431F267F7E78C5CD41E9476FD5DC5B5D563E17CC8F97F8B97B2D33A2AB3825D95FB9CB8C39D5E0A092B8496721BE95E2405956EF900A21BB65C939AA48144A02812D1CF52B329759FD5F5F421C496E93712F42C79DAC1490DA4510A62581005517A00394F3B29994275ED3FC5E4F3EFA535CB6CB0A3A61E5B5FD0617
		 * 厂商私钥：66FD9C6ADB9CDD463DBA8AB1D18F60479E907CB9810E217860E13E03A8165F2534F8D508ACD4AD448ADFA770C36763A349E33E35A1AD39C6495826E63291CC871C9D658100D9555117A19184152B5148383D2901F44C0AB025EC1FF533D2F058DA8DA24187D16BED20B7EBD6D285D6C8B90CE52DA62184D851177851E8F1137ADC877B85671DFE2EA807AFB55DA9EC0C2586857214C588D72E6E77BA91DE8620F29B91A9F68B76C0A183D30E2189CD65F7F09C3FDC53D2470C8801768ED3663893798CB21ED1C46C564EAA49161C0AC26E181FC4ED1EE2ED61E2D9DBC56CA105A104DC2B81442CC2185DE71AA2988502A18D2F248AF8809DE3B946BB647682A1
		 * 交行公钥：AD2F9E888421F5FE38DC6484FC0AFE9322E6F5D59D228258B17EDEB9FE8F3AEAC6AE742893D0337FFDD8E22EE425EF8CF77238BB83590908E7CD8CBF52881A59F8543963AFA260096735DAB628B87BE2B779E8FACE426EC78501ED139A780A621F1B220E5029EF99FD54186212765CD97B20C8DE918AA88679FE6F8EB927126F48ED0CCD10C33B4538F08CF6DF5799C54A50E2F38EC7D0522D49BAC3DECCDFB18B37734264538F2A8D94BB9CF0AB5B9655AD3A319CB488A78F17FFEC5C05F09C51C7B511DF1A5B222941B2012A9707460C78185AF29291A07BB6E168975403BD0331C95CED884AA9633C96ED27D1CD7047FF484E401E7CB8CF551D5A37F3760B
		 * 交行公钥hash256：06D2BB13D4D99CB231299F41861F6E98DEA84B85F881E9E6ABC94BEA6E4F4B77
		 * 主密钥密文签名添加的值：3031300d060960864801650304020105000420
		 */
		String SigSK_Vnd_PK_Bank = "46315BBBDC760E3DE57D2336C5596E848253B1B17CBE9979FDC52F2DD28BE47D9A976D5752F75CADBA00D7CD871D2DBB848EEC792B05641A1B529E1F290A4C1E13398D8D07461875BA372E7A91A1179CF8A0D940EFCD149C96A5751F36A59D29F0947F68C4B66CF8A0BCBFE795730A274F060A0520C817C3516F65651D62911E13E42D29DD7125E48BDE704875DFD7026D7FE6A3D09CD2B3E36DEA9F09D472464D201EA0810B1889553BD334BB79FA4FDF6074797AA460FE4C71BA9B4EE9CFCAB69EA19252ACDF1BFB35268D62EEC1A4B15D05A7F151D00C6F99FD286F070F804C8726E8F503C24549A380AF5AC03873ADFBA80AD249251E7B049000F562AEDD";
		String total = Mkeytype + Mkeydex + random + crypt_PK_Epp_MK + sigSK_Bank_R_Epp_CryptPK_EppMK + PK_bank
				+ SigSK_Vnd_PK_Bank;
		return total; 
	}
	//RSA更新AES128加密方式的主秘钥      用于ddi_customer_cmddeal这个接口，该接口只用于RSA算法
	public static String RSAupdataAES128data() {
		// 主密钥算法类型 00：DES 01：2DES 02:3DES
		String Mkeytype = "04000000";
		// 主密钥索引 16进制
		String Mkeydex = "10000000";
		// 随机数  改这里
		String random = "3635353236373831";
		/***
		 * 主密钥密文=终端公钥加密主密钥明文 只需要拷贝公钥到对应值，加密数据前面不需要添加任何数据 终端公钥modulus：
		 * a2d1d5f3041a870cfff2a95b905ba68d3a3992e983d441aa8be64f6ee81ec28a5e536248cc9ccd3bdab9f0a86737ebc5d08bfbdae21099dfbdd4969098b1bef2e1f145eb330c6820fcce6f3ace4abbdbaf5bb9397cd1bdd7c25748191b9b507ad747c52104a5785f120293b85671b6878e5fc486b4bdab264b4f6ef40bb0dfdd8aea77c3f71ac4f8bed194e9797b2ad9b980d49b5620831ab94362ffedc5ccb040cee056e6f8d08b6d5c30d9209d317181bcfbd011912800c1ab5e0d29fe5ec12e176bcdb9708e8a62d35a169fc2235eb0f89f2945798c4fc89834fcc72e23a7e29786b0ab4d2bd08d2b6230a3cbda87ae27a09dcee17bc895cd447777b749fd
		 * 主密钥明文：ABCD03E3F01234560122334FEDACBDEF
		 */
		String crypt_PK_Epp_MK = "6DBE95772C0F0DE138EDC3A71B81E1BF494064740F3D32EED065C35ABBCCA40E8B5FDCCBE00E8981A69AF0B3FB0F715B32AB4E8230E070AFE523B94DA28730191EB9DAA6BFB5973771E595D281A4A89434DEE7F19BC85109800795424E24395010F107925F6893EA9BD9844900822DBBFF6513D18FBF2D75B895C73D07F137E9091CAD39DA262C6695E58044C8BBD8F35B2FD1A234202A419F17066C7F34041409511F774CFBCA076BFDF1020B6208E542D066C70FB2DBE47E44A67ADEF337D9A4826F1633E1656AE47DA550469832747A7EDE7289E1DD2AE13AC3D05CA9A6FAD8604DDB5D9A5B873BE7977E2BDABD45693691F3FA7DDC5B0F9C77ACE12438EA";
		/***
		 * 交行私钥签名主秘钥密文 =交行私钥加密主密钥密文的HASH256值     需要把公钥和私钥一起全部拷贝到工具里面
		 * 私钥签名是需要把公私钥都添加到对应的选项的，然后签名的是实际数据的hash值然后前面添加固定值
		 * 交行私钥privateEXP.（d）：31454BF000CF7CA1AFE19BC36DC55EF9D3432C0B72E1FF7D6639F6F9A95F6C5EA0D9BEF8505D3A599E899687CAA6B4494198C0653090230EE28BCB101F55D3516761E6D5E280EA9BA23E6313D1EFF266E4D60D1F5590F6DD528CE2BAE20666C5D59DAD89AEEACF5CDB0292D14BF95A9F10F599D0204DF77612BCFD55F87D123418BBB511F1E361B8480A7A074006018B662556BA738ECEC6E8B2991CF4BA3B84199DB102608E97808A4DF52150113989B5F9B07CDE22059086E3A71AE3311EC6CE291A5A4AB34797B907C3D5B2201784DC7D019977F4D6529839D6D36234133FDF1AD7412918B4AF5DDA74FE3630FBCCC650819DE60AE99AF52C25390DA71D11
		 * 交行公钥：AD2F9E888421F5FE38DC6484FC0AFE9322E6F5D59D228258B17EDEB9FE8F3AEAC6AE742893D0337FFDD8E22EE425EF8CF77238BB83590908E7CD8CBF52881A59F8543963AFA260096735DAB628B87BE2B779E8FACE426EC78501ED139A780A621F1B220E5029EF99FD54186212765CD97B20C8DE918AA88679FE6F8EB927126F48ED0CCD10C33B4538F08CF6DF5799C54A50E2F38EC7D0522D49BAC3DECCDFB18B37734264538F2A8D94BB9CF0AB5B9655AD3A319CB488A78F17FFEC5C05F09C51C7B511DF1A5B222941B2012A9707460C78185AF29291A07BB6E168975403BD0331C95CED884AA9633C96ED27D1CD7047FF484E401E7CB8CF551D5A37F3760B
		 * 主密钥密文签名添加的值：3031300d060960864801650304020105000420
		 * 主密钥密文hash256值（计算方式等于随机数+主密钥密文值，然后通过工具计算出总的HASH值）：1579E21E8F28F789191DCE6D11A25F448C687568286338C0860E503E00594C4A
		 * 
		 */
		//改这里
		String sigSK_Bank_R_Epp_CryptPK_EppMK = "7BE9AC385E33FC20C59E82D57F54748B90901901A1A8AD34E6430B3D29B87C0452258184830E7A11C2A71C3472DDAE7F771903103876D1E5551408C4127CAB09FC948DD7D465367F8FB060D3E66151778ADFB128521CD6AD1071A62A1DBE5DDD47ACB63BE04596DBF1574B94265110AC6825E9E1B90C0F045C309F68A6EFCAB0C49E02A63DCD8A6FDF735CBC0E5B97F6D28415144C775196556B20F0842AB0E7ABCA28DCDFA291FB655179935023E1A6C5A8A00AA0F5E7F722EC49ADC1E4B837695D90F33B1EB710A050DC2F404F7FE9884BE0A9C8FE5A19E13F8CE9055D35DC412B94A3F9DE13858EFD2FD42CDD0A2011E67A04CF4A5C83A0AACBB521094B1C";
		/***
		 * 交行公钥
		 */
		String PK_bank = "AD2F9E888421F5FE38DC6484FC0AFE9322E6F5D59D228258B17EDEB9FE8F3AEAC6AE742893D0337FFDD8E22EE425EF8CF77238BB83590908E7CD8CBF52881A59F8543963AFA260096735DAB628B87BE2B779E8FACE426EC78501ED139A780A621F1B220E5029EF99FD54186212765CD97B20C8DE918AA88679FE6F8EB927126F48ED0CCD10C33B4538F08CF6DF5799C54A50E2F38EC7D0522D49BAC3DECCDFB18B37734264538F2A8D94BB9CF0AB5B9655AD3A319CB488A78F17FFEC5C05F09C51C7B511DF1A5B222941B2012A9707460C78185AF29291A07BB6E168975403BD0331C95CED884AA9633C96ED27D1CD7047FF484E401E7CB8CF551D5A37F3760B";
		/***
		 * 厂商私钥签名交行公钥=厂商私钥加密交行公钥的HASH256值
		 * 厂商公钥：C755E36910E52CD55FFBF36C1F3F8EF353E5CE40C670C611B19C9A8A2C557C7E1B661E069F2F6958DF64D1B9F7B32E0E16BED69D25E049B1BE78700FCC0BA2D56041186292F9A49D338B2FC561E8BF743C7E34CF489A0A99DB6CDC32615CE51B3B44DF81C9E01411B9EC7BC49FBD4C30893788438607D701B73905E6614B2CEC1B44506E431F267F7E78C5CD41E9476FD5DC5B5D563E17CC8F97F8B97B2D33A2AB3825D95FB9CB8C39D5E0A092B8496721BE95E2405956EF900A21BB65C939AA48144A02812D1CF52B329759FD5F5F421C496E93712F42C79DAC1490DA4510A62581005517A00394F3B29994275ED3FC5E4F3EFA535CB6CB0A3A61E5B5FD0617
		 * 厂商私钥：66FD9C6ADB9CDD463DBA8AB1D18F60479E907CB9810E217860E13E03A8165F2534F8D508ACD4AD448ADFA770C36763A349E33E35A1AD39C6495826E63291CC871C9D658100D9555117A19184152B5148383D2901F44C0AB025EC1FF533D2F058DA8DA24187D16BED20B7EBD6D285D6C8B90CE52DA62184D851177851E8F1137ADC877B85671DFE2EA807AFB55DA9EC0C2586857214C588D72E6E77BA91DE8620F29B91A9F68B76C0A183D30E2189CD65F7F09C3FDC53D2470C8801768ED3663893798CB21ED1C46C564EAA49161C0AC26E181FC4ED1EE2ED61E2D9DBC56CA105A104DC2B81442CC2185DE71AA2988502A18D2F248AF8809DE3B946BB647682A1
		 * 交行公钥：AD2F9E888421F5FE38DC6484FC0AFE9322E6F5D59D228258B17EDEB9FE8F3AEAC6AE742893D0337FFDD8E22EE425EF8CF77238BB83590908E7CD8CBF52881A59F8543963AFA260096735DAB628B87BE2B779E8FACE426EC78501ED139A780A621F1B220E5029EF99FD54186212765CD97B20C8DE918AA88679FE6F8EB927126F48ED0CCD10C33B4538F08CF6DF5799C54A50E2F38EC7D0522D49BAC3DECCDFB18B37734264538F2A8D94BB9CF0AB5B9655AD3A319CB488A78F17FFEC5C05F09C51C7B511DF1A5B222941B2012A9707460C78185AF29291A07BB6E168975403BD0331C95CED884AA9633C96ED27D1CD7047FF484E401E7CB8CF551D5A37F3760B
		 * 交行公钥hash256：06D2BB13D4D99CB231299F41861F6E98DEA84B85F881E9E6ABC94BEA6E4F4B77
		 * 主密钥密文签名添加的值：3031300d060960864801650304020105000420
		 */
		String SigSK_Vnd_PK_Bank = "46315BBBDC760E3DE57D2336C5596E848253B1B17CBE9979FDC52F2DD28BE47D9A976D5752F75CADBA00D7CD871D2DBB848EEC792B05641A1B529E1F290A4C1E13398D8D07461875BA372E7A91A1179CF8A0D940EFCD149C96A5751F36A59D29F0947F68C4B66CF8A0BCBFE795730A274F060A0520C817C3516F65651D62911E13E42D29DD7125E48BDE704875DFD7026D7FE6A3D09CD2B3E36DEA9F09D472464D201EA0810B1889553BD334BB79FA4FDF6074797AA460FE4C71BA9B4EE9CFCAB69EA19252ACDF1BFB35268D62EEC1A4B15D05A7F151D00C6F99FD286F070F804C8726E8F503C24549A380AF5AC03873ADFBA80AD249251E7B049000F562AEDD";
		String total = Mkeytype + Mkeydex + random + crypt_PK_Epp_MK + sigSK_Bank_R_Epp_CryptPK_EppMK + PK_bank
				+ SigSK_Vnd_PK_Bank;
		return total;
	}
	//RSA更新AES192加密方式的主秘钥      用于ddi_customer_cmddeal这个接口，该接口只用于RSA算法
	public static String RSAupdataAES192data() {
		// 主密钥算法类型 00：DES 01：2DES 02:3DES
		String Mkeytype = "05000000";
		// 主密钥索引 16进制
		String Mkeydex = "4C000000";
		// 随机数  改这里
		String random = "3032363539343338";
		/***
		 * 主密钥密文=终端公钥加密主密钥明文 只需要拷贝公钥到对应值，加密数据前面不需要添加任何数据 终端公钥modulus：
		 * a2d1d5f3041a870cfff2a95b905ba68d3a3992e983d441aa8be64f6ee81ec28a5e536248cc9ccd3bdab9f0a86737ebc5d08bfbdae21099dfbdd4969098b1bef2e1f145eb330c6820fcce6f3ace4abbdbaf5bb9397cd1bdd7c25748191b9b507ad747c52104a5785f120293b85671b6878e5fc486b4bdab264b4f6ef40bb0dfdd8aea77c3f71ac4f8bed194e9797b2ad9b980d49b5620831ab94362ffedc5ccb040cee056e6f8d08b6d5c30d9209d317181bcfbd011912800c1ab5e0d29fe5ec12e176bcdb9708e8a62d35a169fc2235eb0f89f2945798c4fc89834fcc72e23a7e29786b0ab4d2bd08d2b6230a3cbda87ae27a09dcee17bc895cd447777b749fd
		 * 主密钥明文：32323232321234560122334FEDACBDEF3131313131313131
		 */
		String crypt_PK_Epp_MK = "284F5D8D5D8B0D3C6A0D2D3C01D2B736585C4A9834E2DDC4C4F46DC7885FBB802B9B97692FC2CC93C89E02F89DAB0461D2A7B43C7BD3050EA13AF61EA086942BFCE13186BFF0B5A92CFF7B9FE1306DA07FC7818CD88AA2D873060617FCC0C0466B09D61FCF16D679E11DB283B6F5F568AFE4F29F5227B0A0FB05C85F7F48DCA06221FB951CC64CD461FF083B80B318FECB2383BB92440931544D03585ABB42E192C529FEE53E0E062E69CFC0BB5D21482F931A059D3582A5B3835ADD79EE964C70CE63023E2B713A16462653CB7166EB341E9337443E809D357302666F96AF16ABD70A5CD028D445BEE755B612EE22FB152241FA58061F43A8F974A99714A7A2";
		/***
		 * 交行私钥签名主秘钥密文 =交行私钥加密主密钥密文的HASH256值     需要把公钥和私钥一起全部拷贝到工具里面
		 * 私钥签名是需要把公私钥都添加到对应的选项的，然后签名的是实际数据的hash值然后前面添加固定值
		 * 交行私钥privateEXP.（d）：31454BF000CF7CA1AFE19BC36DC55EF9D3432C0B72E1FF7D6639F6F9A95F6C5EA0D9BEF8505D3A599E899687CAA6B4494198C0653090230EE28BCB101F55D3516761E6D5E280EA9BA23E6313D1EFF266E4D60D1F5590F6DD528CE2BAE20666C5D59DAD89AEEACF5CDB0292D14BF95A9F10F599D0204DF77612BCFD55F87D123418BBB511F1E361B8480A7A074006018B662556BA738ECEC6E8B2991CF4BA3B84199DB102608E97808A4DF52150113989B5F9B07CDE22059086E3A71AE3311EC6CE291A5A4AB34797B907C3D5B2201784DC7D019977F4D6529839D6D36234133FDF1AD7412918B4AF5DDA74FE3630FBCCC650819DE60AE99AF52C25390DA71D11
		 * 交行公钥：AD2F9E888421F5FE38DC6484FC0AFE9322E6F5D59D228258B17EDEB9FE8F3AEAC6AE742893D0337FFDD8E22EE425EF8CF77238BB83590908E7CD8CBF52881A59F8543963AFA260096735DAB628B87BE2B779E8FACE426EC78501ED139A780A621F1B220E5029EF99FD54186212765CD97B20C8DE918AA88679FE6F8EB927126F48ED0CCD10C33B4538F08CF6DF5799C54A50E2F38EC7D0522D49BAC3DECCDFB18B37734264538F2A8D94BB9CF0AB5B9655AD3A319CB488A78F17FFEC5C05F09C51C7B511DF1A5B222941B2012A9707460C78185AF29291A07BB6E168975403BD0331C95CED884AA9633C96ED27D1CD7047FF484E401E7CB8CF551D5A37F3760B
		 * 主密钥密文签名添加的值：3031300d060960864801650304020105000420
		 * 主密钥密文hash256值（计算方式等于随机数+主密钥密文值，然后通过工具计算出总的HASH值）：4E51FBAFD344B7593CD763225FF42B9C7EA898524C4575D907D887F7B25D1036
		 * 
		 */
		//改这里
		String sigSK_Bank_R_Epp_CryptPK_EppMK = "45B44083704939B213B8BADF9757649693B598593A53E57D57025CEDB0878B896EAC6BD0506B57EC161847F0F1E77C82383E5707AD83B60642AB65F33887B0070DC3ADAB7CCDCB286D01AC76C0007DC22E36701269877C1AEB5C306CABFBB9720DEBDBB350754009B4774AE1E407E7F2F2BD58E9191E5F006AF02F063757BC5445C4B6149FDFB5F759088A46CFD6F6C084EF62A79B5547ACC76EAB775403F91FA252ADE2C4A04784D6768FC5F44ADF33F26B64CDD0342AF13ECDFE07AA16C267D82D0692F5EA8AC9858100B2F89B70CBC5CB52E98A18FAD159CA794375AC3EC04230B5FA7AD8AB8BF7130A271CA4FF8A5E0E9EE85199F98187B3917D1C24B1E9";
		/***
		 * 交行公钥
		 */
		String PK_bank = "AD2F9E888421F5FE38DC6484FC0AFE9322E6F5D59D228258B17EDEB9FE8F3AEAC6AE742893D0337FFDD8E22EE425EF8CF77238BB83590908E7CD8CBF52881A59F8543963AFA260096735DAB628B87BE2B779E8FACE426EC78501ED139A780A621F1B220E5029EF99FD54186212765CD97B20C8DE918AA88679FE6F8EB927126F48ED0CCD10C33B4538F08CF6DF5799C54A50E2F38EC7D0522D49BAC3DECCDFB18B37734264538F2A8D94BB9CF0AB5B9655AD3A319CB488A78F17FFEC5C05F09C51C7B511DF1A5B222941B2012A9707460C78185AF29291A07BB6E168975403BD0331C95CED884AA9633C96ED27D1CD7047FF484E401E7CB8CF551D5A37F3760B";
		/***
		 * 厂商私钥签名交行公钥=厂商私钥加密交行公钥的HASH256值
		 * 厂商公钥：C755E36910E52CD55FFBF36C1F3F8EF353E5CE40C670C611B19C9A8A2C557C7E1B661E069F2F6958DF64D1B9F7B32E0E16BED69D25E049B1BE78700FCC0BA2D56041186292F9A49D338B2FC561E8BF743C7E34CF489A0A99DB6CDC32615CE51B3B44DF81C9E01411B9EC7BC49FBD4C30893788438607D701B73905E6614B2CEC1B44506E431F267F7E78C5CD41E9476FD5DC5B5D563E17CC8F97F8B97B2D33A2AB3825D95FB9CB8C39D5E0A092B8496721BE95E2405956EF900A21BB65C939AA48144A02812D1CF52B329759FD5F5F421C496E93712F42C79DAC1490DA4510A62581005517A00394F3B29994275ED3FC5E4F3EFA535CB6CB0A3A61E5B5FD0617
		 * 厂商私钥：66FD9C6ADB9CDD463DBA8AB1D18F60479E907CB9810E217860E13E03A8165F2534F8D508ACD4AD448ADFA770C36763A349E33E35A1AD39C6495826E63291CC871C9D658100D9555117A19184152B5148383D2901F44C0AB025EC1FF533D2F058DA8DA24187D16BED20B7EBD6D285D6C8B90CE52DA62184D851177851E8F1137ADC877B85671DFE2EA807AFB55DA9EC0C2586857214C588D72E6E77BA91DE8620F29B91A9F68B76C0A183D30E2189CD65F7F09C3FDC53D2470C8801768ED3663893798CB21ED1C46C564EAA49161C0AC26E181FC4ED1EE2ED61E2D9DBC56CA105A104DC2B81442CC2185DE71AA2988502A18D2F248AF8809DE3B946BB647682A1
		 * 交行公钥：AD2F9E888421F5FE38DC6484FC0AFE9322E6F5D59D228258B17EDEB9FE8F3AEAC6AE742893D0337FFDD8E22EE425EF8CF77238BB83590908E7CD8CBF52881A59F8543963AFA260096735DAB628B87BE2B779E8FACE426EC78501ED139A780A621F1B220E5029EF99FD54186212765CD97B20C8DE918AA88679FE6F8EB927126F48ED0CCD10C33B4538F08CF6DF5799C54A50E2F38EC7D0522D49BAC3DECCDFB18B37734264538F2A8D94BB9CF0AB5B9655AD3A319CB488A78F17FFEC5C05F09C51C7B511DF1A5B222941B2012A9707460C78185AF29291A07BB6E168975403BD0331C95CED884AA9633C96ED27D1CD7047FF484E401E7CB8CF551D5A37F3760B
		 * 交行公钥hash256：06D2BB13D4D99CB231299F41861F6E98DEA84B85F881E9E6ABC94BEA6E4F4B77
		 * 主密钥密文签名添加的值：3031300d060960864801650304020105000420
		 */
		String SigSK_Vnd_PK_Bank = "46315BBBDC760E3DE57D2336C5596E848253B1B17CBE9979FDC52F2DD28BE47D9A976D5752F75CADBA00D7CD871D2DBB848EEC792B05641A1B529E1F290A4C1E13398D8D07461875BA372E7A91A1179CF8A0D940EFCD149C96A5751F36A59D29F0947F68C4B66CF8A0BCBFE795730A274F060A0520C817C3516F65651D62911E13E42D29DD7125E48BDE704875DFD7026D7FE6A3D09CD2B3E36DEA9F09D472464D201EA0810B1889553BD334BB79FA4FDF6074797AA460FE4C71BA9B4EE9CFCAB69EA19252ACDF1BFB35268D62EEC1A4B15D05A7F151D00C6F99FD286F070F804C8726E8F503C24549A380AF5AC03873ADFBA80AD249251E7B049000F562AEDD";
		String total = Mkeytype + Mkeydex + random + crypt_PK_Epp_MK + sigSK_Bank_R_Epp_CryptPK_EppMK + PK_bank
				+ SigSK_Vnd_PK_Bank;
		return total;
	}
	//RSA更新AES256加密方式的主秘钥      用于ddi_customer_cmddeal这个接口，该接口只用于RSA算法
	public static String RSAupdataAES256data() {
		// 主密钥算法类型 00：DES 01：2DES 02:3DES
		String Mkeytype = "06000000";
		// 主密钥索引 16进制
		String Mkeydex = "88000000";
		// 随机数  改这里
		String random = "3436303633363333";
		/***
		 * 主密钥密文=终端公钥加密主密钥明文 只需要拷贝公钥到对应值，加密数据前面不需要添加任何数据 终端公钥modulus：
		 * a2d1d5f3041a870cfff2a95b905ba68d3a3992e983d441aa8be64f6ee81ec28a5e536248cc9ccd3bdab9f0a86737ebc5d08bfbdae21099dfbdd4969098b1bef2e1f145eb330c6820fcce6f3ace4abbdbaf5bb9397cd1bdd7c25748191b9b507ad747c52104a5785f120293b85671b6878e5fc486b4bdab264b4f6ef40bb0dfdd8aea77c3f71ac4f8bed194e9797b2ad9b980d49b5620831ab94362ffedc5ccb040cee056e6f8d08b6d5c30d9209d317181bcfbd011912800c1ab5e0d29fe5ec12e176bcdb9708e8a62d35a169fc2235eb0f89f2945798c4fc89834fcc72e23a7e29786b0ab4d2bd08d2b6230a3cbda87ae27a09dcee17bc895cd447777b749fd
		 * 主密钥明文：3131313131313131313131313131313131313131313131313131313131313131
		 */
		String crypt_PK_Epp_MK = "3AE31553A237CB149E09C4F4B3CC8CB44A0358EADFC8E0B12DE9174BF703655F823A776896C6141DCCADC45E3866C1FD1552414F3D399B0A78D7D11DA5550867E5A1980AC1FBB5EA9C757838C719BDAB3B1690715AF72F5045722169F66F81BE46924C0A6E468C6740A200D4C9A81525463E6880B2FCAA44B0451B997F203DD90577D1F651055B172893A874E99377EA7A743D04E47E5A1D7C3E168BB6B3F82822F406FA23F130ECAB83E17081BB3160DF491BC0AB1BE6158E3FABBD32A48CBA479B42A81322AB514CAC05A033E9366182AC41D19927FAABED2CF78B07866CF7782E0F7D319F82A433A58BE5F0AB46A47A77771C76290BFA771B15F19E6D3058";
		/***
		 * 交行私钥签名主秘钥密文 =交行私钥加密主密钥密文的HASH256值
		 * 私钥签名是需要把公私钥都添加到对应的选项的，然后签名的是实际数据的hash值然后前面添加固定值
		 * 交行私钥privateEXP.（d）：31454BF000CF7CA1AFE19BC36DC55EF9D3432C0B72E1FF7D6639F6F9A95F6C5EA0D9BEF8505D3A599E899687CAA6B4494198C0653090230EE28BCB101F55D3516761E6D5E280EA9BA23E6313D1EFF266E4D60D1F5590F6DD528CE2BAE20666C5D59DAD89AEEACF5CDB0292D14BF95A9F10F599D0204DF77612BCFD55F87D123418BBB511F1E361B8480A7A074006018B662556BA738ECEC6E8B2991CF4BA3B84199DB102608E97808A4DF52150113989B5F9B07CDE22059086E3A71AE3311EC6CE291A5A4AB34797B907C3D5B2201784DC7D019977F4D6529839D6D36234133FDF1AD7412918B4AF5DDA74FE3630FBCCC650819DE60AE99AF52C25390DA71D11
		 * 交行公钥：AD2F9E888421F5FE38DC6484FC0AFE9322E6F5D59D228258B17EDEB9FE8F3AEAC6AE742893D0337FFDD8E22EE425EF8CF77238BB83590908E7CD8CBF52881A59F8543963AFA260096735DAB628B87BE2B779E8FACE426EC78501ED139A780A621F1B220E5029EF99FD54186212765CD97B20C8DE918AA88679FE6F8EB927126F48ED0CCD10C33B4538F08CF6DF5799C54A50E2F38EC7D0522D49BAC3DECCDFB18B37734264538F2A8D94BB9CF0AB5B9655AD3A319CB488A78F17FFEC5C05F09C51C7B511DF1A5B222941B2012A9707460C78185AF29291A07BB6E168975403BD0331C95CED884AA9633C96ED27D1CD7047FF484E401E7CB8CF551D5A37F3760B
		 * 主密钥密文签名添加的值：3031300d060960864801650304020105000420
		 * 主密钥密文hash256值（计算方式等于随机数+主密钥密文值，然后通过工具计算出总的HASH值）：1610842D0CE7700174B7DA3F41952969F05DC0AEAD9D8F173EA33D44B1DD5FF0
		 * 
		 */
		//改这里
		String sigSK_Bank_R_Epp_CryptPK_EppMK = "7801FF4CEE28C9FF1CFB6A24A5DAEE69F79772A3B1B217D001273D01E9E940DE096B3ABA0E79649252897FCEEBC3B80957C740D2460A9D2E24B4F23968FDE049F5EA35C2266D6477CCEE36451CC6B32D948B9C10FE9CA6E094478BBCBFE6E2455D49213030D740BA030718BCC38A307EF77180D61DC8375C874DD03EF2D7B490867AA893779E183630C81BCF57A1D1DF1642B022C9C2AFE085F4847C995054AF83B966702094352368F82D21E82B5122FD8F4864FECE17247C797AF7DE3AF434B8FE2647E0C9801002955A7A85A37E66E03827C5893BB458EFCBBDFE6E7E2A09C0D746EFADF9E4660E1C0F54B62AA91C3C2735BA32C1DBAC3FA98644CA35D2AD";
		/***
		 * 交行公钥
		 */
		String PK_bank = "AD2F9E888421F5FE38DC6484FC0AFE9322E6F5D59D228258B17EDEB9FE8F3AEAC6AE742893D0337FFDD8E22EE425EF8CF77238BB83590908E7CD8CBF52881A59F8543963AFA260096735DAB628B87BE2B779E8FACE426EC78501ED139A780A621F1B220E5029EF99FD54186212765CD97B20C8DE918AA88679FE6F8EB927126F48ED0CCD10C33B4538F08CF6DF5799C54A50E2F38EC7D0522D49BAC3DECCDFB18B37734264538F2A8D94BB9CF0AB5B9655AD3A319CB488A78F17FFEC5C05F09C51C7B511DF1A5B222941B2012A9707460C78185AF29291A07BB6E168975403BD0331C95CED884AA9633C96ED27D1CD7047FF484E401E7CB8CF551D5A37F3760B";
		/***
		 * 厂商私钥签名交行公钥=厂商私钥加密交行公钥的HASH256值
		 * 厂商公钥：C755E36910E52CD55FFBF36C1F3F8EF353E5CE40C670C611B19C9A8A2C557C7E1B661E069F2F6958DF64D1B9F7B32E0E16BED69D25E049B1BE78700FCC0BA2D56041186292F9A49D338B2FC561E8BF743C7E34CF489A0A99DB6CDC32615CE51B3B44DF81C9E01411B9EC7BC49FBD4C30893788438607D701B73905E6614B2CEC1B44506E431F267F7E78C5CD41E9476FD5DC5B5D563E17CC8F97F8B97B2D33A2AB3825D95FB9CB8C39D5E0A092B8496721BE95E2405956EF900A21BB65C939AA48144A02812D1CF52B329759FD5F5F421C496E93712F42C79DAC1490DA4510A62581005517A00394F3B29994275ED3FC5E4F3EFA535CB6CB0A3A61E5B5FD0617
		 * 厂商私钥：66FD9C6ADB9CDD463DBA8AB1D18F60479E907CB9810E217860E13E03A8165F2534F8D508ACD4AD448ADFA770C36763A349E33E35A1AD39C6495826E63291CC871C9D658100D9555117A19184152B5148383D2901F44C0AB025EC1FF533D2F058DA8DA24187D16BED20B7EBD6D285D6C8B90CE52DA62184D851177851E8F1137ADC877B85671DFE2EA807AFB55DA9EC0C2586857214C588D72E6E77BA91DE8620F29B91A9F68B76C0A183D30E2189CD65F7F09C3FDC53D2470C8801768ED3663893798CB21ED1C46C564EAA49161C0AC26E181FC4ED1EE2ED61E2D9DBC56CA105A104DC2B81442CC2185DE71AA2988502A18D2F248AF8809DE3B946BB647682A1
		 * 交行公钥：AD2F9E888421F5FE38DC6484FC0AFE9322E6F5D59D228258B17EDEB9FE8F3AEAC6AE742893D0337FFDD8E22EE425EF8CF77238BB83590908E7CD8CBF52881A59F8543963AFA260096735DAB628B87BE2B779E8FACE426EC78501ED139A780A621F1B220E5029EF99FD54186212765CD97B20C8DE918AA88679FE6F8EB927126F48ED0CCD10C33B4538F08CF6DF5799C54A50E2F38EC7D0522D49BAC3DECCDFB18B37734264538F2A8D94BB9CF0AB5B9655AD3A319CB488A78F17FFEC5C05F09C51C7B511DF1A5B222941B2012A9707460C78185AF29291A07BB6E168975403BD0331C95CED884AA9633C96ED27D1CD7047FF484E401E7CB8CF551D5A37F3760B
		 * 交行公钥hash256：06D2BB13D4D99CB231299F41861F6E98DEA84B85F881E9E6ABC94BEA6E4F4B77
		 * 主密钥密文签名添加的值：3031300d060960864801650304020105000420
		 */
		String SigSK_Vnd_PK_Bank = "46315BBBDC760E3DE57D2336C5596E848253B1B17CBE9979FDC52F2DD28BE47D9A976D5752F75CADBA00D7CD871D2DBB848EEC792B05641A1B529E1F290A4C1E13398D8D07461875BA372E7A91A1179CF8A0D940EFCD149C96A5751F36A59D29F0947F68C4B66CF8A0BCBFE795730A274F060A0520C817C3516F65651D62911E13E42D29DD7125E48BDE704875DFD7026D7FE6A3D09CD2B3E36DEA9F09D472464D201EA0810B1889553BD334BB79FA4FDF6074797AA460FE4C71BA9B4EE9CFCAB69EA19252ACDF1BFB35268D62EEC1A4B15D05A7F151D00C6F99FD286F070F804C8726E8F503C24549A380AF5AC03873ADFBA80AD249251E7B049000F562AEDD";
		String total = Mkeytype + Mkeydex + random + crypt_PK_Epp_MK + sigSK_Bank_R_Epp_CryptPK_EppMK + PK_bank
				+ SigSK_Vnd_PK_Bank;
		return total;
	}
  		
		
		
		
		//SM2更新DES算法        
  		/***
  		 * SM2
  		 * 下载终端公钥SM2：01 01 01 01 01 14 DC 00 49 01 16 12 01 00 43 12 00 40 37 3C 40 CB C0 16 14 B8 E7 F8 AF 8F DC 1F C0 16 F7 BC E9 41 DC 38 F1 B0 A4 5C 94 87 56 07 0C 9D 96 9E 8B F2 4E 7B E9 12 09 4C 91 CC 6D 6A 79 F0 50 C0 CA 5B 3A 66 2B 6A 90 14 28 22 49 7E 72 A9 03 5E
  		 * 下载终端私钥SM2：01 01 01 01 01 14 DC 01 09 01 16 12 02 01 03 13 01 00 87 F2 71 49 AC 70 93 22 F9 55 44 90 4E DF D9 3A 0D 37 4E 03 A7 4B 45 30 53 D4 1A BE 22 21 20 98 B1 11 88 6B 00 33 0C CC 74 98 7B B7 C4 2A B2 17 D9 A7 99 B7 05 86 FD C7 BF 0B 25 24 0C F9 C5 85 14 96 1A 0D D1 7A 5D 6E 60 4D 97 6F 16 E4 F3 10 31 A6 25 AB 3B 16 69 7B B3 AE C0 C9 A0 C1 FC 17 3B 77 1A EC E4 46 07 2A 71 40 99 40 EA 5D D6 0D 31 16 F0 F6 92 6E B4 08 FA 49 15 CB BD 0C 62 82 F0 2C 18 65 08 FE 7E C3 C3 E1 90 A3 24 E1 DD 9D 2B D4 E6 54 45 D9 D3 94 57 CE 07 11 DD 1F 82 4D A7 F2 F4 4B 98 87 69 6B B9 A2 5C CB 92 FC 62 2F E6 C9 ED 15 FE 87 C8 81 5F 12 76 4C C0 7C 7A 9D D1 B5 A7 16 C3 43 12 6E 8D 8D 5D 2B C5 8F B4 4C 09 6C 83 28 CC 80 F8 9F E2 29 1F 89 98 59 B8 3F 2A BA A4 F8 A2 6F B8 B1 D7 E2 A0 41 F2 BE EC 7C B7 A0 84 04 DA 21 40 D6 5D 2E 5A 0E BA C4 FA 73 03 68
  		 * 下载签名GM：01 01 01 01 01 14 DC 00 49 01 16 12 03 00 43 15 00 40 60 AC F5 45 D7 D9 B9 F4 DA 97 F3 AB 5A 9D 13 DB FE EB 6B 4C 20 E6 64 39 0C 8B 07 AC 80 43 E3 33 F2 E8 30 D4 78 D3 3C E1 6C AF F4 0C D4 00 82 F4 76 1C 44 C5 B2 40 2F 81 33 51 D6 03 74 09 E1 85 03 26
  		 * 下载系统公钥SM2：01 01 01 01 01 14 DC 00 49 01 16 12 03 00 43 14 00 40 AF 48 A0 58 8D B3 89 69 10 CE DD 91 18 7F 65 D6 E6 C2 1A DF 2D A0 8F DC 1A 8D 9B C3 6E 8F DD FA 4B DD D4 6E 47 0A F5 52 70 89 7A E4 2D 44 21 A4 5B F7 53 0F 98 D4 58 FA DD 0E EF 10 65 CA DD 44 03 2C
  		 * RSA：
  		 * 
  		 * @return
  		 */
  		public static String updatadesdata () {
  			
  			//指定算法
  			String arithmetic="06000110";
  			//随机数
  			String random="0A00083931343630303830";      //改下这里
  			//交行公钥：
  			String a1="661062D341073D200C96AC555839FC16707F0A6ABFD2E167CE351E8B06ACD0AC23FF55AAEE5E4469079FE15E8A2307F326F6E75A28AAFB54D3383F3AA65CFDA5";
  			String PK_bank="0B0040"+a1;
  			//厂商私钥对交行公钥hash签名
  			//需要先用厂商的公钥计算出hash其中   
  			//所有公钥计算hash都不使用用户ID，采用只对数据进行SM3算法摘要
  			//数据为交行公钥：661062D341073D200C96AC555839FC16707F0A6ABFD2E167CE351E8B06ACD0AC23FF55AAEE5E4469079FE15E8A2307F326F6E75A28AAFB54D3383F3AA65CFDA5
            //
  			String a="400EF2F72A9619200A9834084B031225EAB86FADF08C4603952C41204A9B2A8BF4B2D3F17EBC36A14206ED415C6883FD7D457AF6FD2332BBF3D9C68040C1696C";
  			String SigSK_Vnd_PK_Bank="0C0040"+a;
  			//主密钥算法
  			String Mkeytype="0D000100";
  		    //主密钥索引
  			String Mkeydex="0E000100";
  			//主秘钥密文=终端公钥SM2加密主密钥明文
  			//终端公钥：373C40CBC01614B8E7F8AF8FDC1FC016F7BCE941DC38F1B0A45C948756070C9D  969E8BF24E7BE912094C91CC6D6A79F050C0CA5B3A662B6A90142822497E72A9
  		    //主明：3131313131313131
  		//计算这步需要使用工具SM2和SM4工具
  			String b="49E9A74C255B0BB96BAFBE84D854F270265A40CD5E24337CEEF1D1574D61B3AF20603C0A0A13A271558B6428DF56463642A8A83743C31467477C39D6992793B155006D47CBEFAE9095F26B96F4785F666A14AEA982F534D9A135E32282BE01C12852782C6550938A";
  			String Mkeysdata="0F0068"+b;
  			//交行私钥SM2签名（随机数+主密钥密文）
  			//需要先用交行公钥计算出hash：
  			//公钥：661062D341073D200C96AC555839FC16707F0A6ABFD2E167CE351E8B06ACD0AC
  			//    23FF55AAEE5E4469079FE15E8A2307F326F6E75A28AAFB54D3383F3AA65CFDA5  
  		    //所有公钥计算hash都不使用用户ID，采用只对数据进行SM3算法摘要
  			//数据=（随机数+主密钥密文）
  			//交行私钥：EE5D342050416D2A4322E45FD8348E16D2DB2DB9A2EAF22EECCB2E76A510FFC7
  			String c="CA8A7E1E76D9457A42561B5239445C067A0004351577496D46CE6512DC2E07A3A8427F53BA15D206CF26987C4D26F5CBF81124F40E9D936CB5254905F7943CB5";
  			//改下上面一行
  			String signvalue="100040"+c;
  			String total=arithmetic+random+PK_bank+SigSK_Vnd_PK_Bank+Mkeytype+Mkeydex+Mkeysdata+signvalue;
  			return total;
  		}
  		
  		
  		public static String updata2desdata () {
  			
  			//指定算法
  			String arithmetic="06000110";
  			//随机数
  			String random="0A00083539393531313535";
  			//交行公钥：
  			String a1="661062D341073D200C96AC555839FC16707F0A6ABFD2E167CE351E8B06ACD0AC23FF55AAEE5E4469079FE15E8A2307F326F6E75A28AAFB54D3383F3AA65CFDA5";
  			String PK_bank="0B0040"+a1;
  		//厂商私钥对交行公钥hash签名
  			//需要先用厂商的公钥计算出hash其中   
  			//所有公钥计算hash都不使用用户ID，采用只对数据进行SM3算法摘要
  			//数据为交行公钥：661062D341073D200C96AC555839FC16707F0A6ABFD2E167CE351E8B06ACD0AC23FF55AAEE5E4469079FE15E8A2307F326F6E75A28AAFB54D3383F3AA65CFDA5
  			String a="400EF2F72A9619200A9834084B031225EAB86FADF08C4603952C41204A9B2A8BF4B2D3F17EBC36A14206ED415C6883FD7D457AF6FD2332BBF3D9C68040C1696C";
  			String SigSK_Vnd_PK_Bank="0C0040"+a;
  			//主密钥算法
  			String Mkeytype="0D000101";
  			//主密钥索引
  			String Mkeydex="0E000195";
  			//主秘钥密文=终端公钥SM2加密主密钥明文
  			//终端公钥：373C40CBC01614B8E7F8AF8FDC1FC016F7BCE941DC38F1B0A45C948756070C9D  969E8BF24E7BE912094C91CC6D6A79F050C0CA5B3A662B6A90142822497E72A9
  			//主明：31313131313131313131313131313131
  		//计算这步需要使用工具SM2和SM4工具
  			String b="9C9E0E0E52B88EC2D9D83D076748A30CE67C6AE5E54E59689100D0824B4D4114A0F596C83B17DA245B7BEDDD0FBB8552D3D72173CA1AE131A6511F8AE45E345F9C2D490B6B2C26F2D7741E256DCDE1DEF37D6558245DEF9563893848C9C550E583D6C9DD9432F8D7FB188DAB9A5D19C7";
  			String Mkeysdata="0F0070"+b;
  		    //交行私钥SM2签名（随机数+主密钥密文）
  			//需要先用交行公钥计算出hash：
  			//公钥：661062D341073D200C96AC555839FC16707F0A6ABFD2E167CE351E8B06ACD0AC
  			//    23FF55AAEE5E4469079FE15E8A2307F326F6E75A28AAFB54D3383F3AA65CFDA5
  		    //所有公钥计算hash都不使用用户ID，采用只对数据进行SM3算法摘要
  			//数据=（随机数+主密钥密文）
  			//交行私钥：EE5D342050416D2A4322E45FD8348E16D2DB2DB9A2EAF22EECCB2E76A510FFC7
  			String c="57F10E3C3EBC4E2E53C63470A2298C093D441D439FA971DD48512E479E1BF759206FFF2FDAE6CEAAE8FF87BAD7D51A810DE2649A3AD3944FFA58D0CA56572E60";
  			String signvalue="100040"+c;
  			String total=arithmetic+random+PK_bank+SigSK_Vnd_PK_Bank+Mkeytype+Mkeydex+Mkeysdata+signvalue;
  			return total;
  		}
  		public static String updata3desdata () {
  			
  			//指定算法
  			String arithmetic="06000110";
  			//随机数
  			String random="0A00083133343430323433";
  			//交行公钥：
  			String a1="661062D341073D200C96AC555839FC16707F0A6ABFD2E167CE351E8B06ACD0AC23FF55AAEE5E4469079FE15E8A2307F326F6E75A28AAFB54D3383F3AA65CFDA5";
  			String PK_bank="0B0040"+a1;
  		//厂商私钥对交行公钥hash签名
  			//需要先用厂商的公钥计算出hash其中   
  			//所有公钥计算hash都不使用用户ID，采用只对数据进行SM3算法摘要
  			//数据为交行公钥：661062D341073D200C96AC555839FC16707F0A6ABFD2E167CE351E8B06ACD0AC23FF55AAEE5E4469079FE15E8A2307F326F6E75A28AAFB54D3383F3AA65CFDA5
  			String a="400EF2F72A9619200A9834084B031225EAB86FADF08C4603952C41204A9B2A8BF4B2D3F17EBC36A14206ED415C6883FD7D457AF6FD2332BBF3D9C68040C1696C";
  			String SigSK_Vnd_PK_Bank="0C0040"+a;
  			//主密钥算法
  			String Mkeytype="0D000102";
  			//主密钥索引
  			String Mkeydex="0E00014B";
  			//主秘钥密文=终端公钥SM2加密主密钥明文
  			//终端公钥：373C40CBC01614B8E7F8AF8FDC1FC016F7BCE941DC38F1B0A45C948756070C9D  969E8BF24E7BE912094C91CC6D6A79F050C0CA5B3A662B6A90142822497E72A9
  			//主明：ABCD03E3F01234560122334FEDACBDEF12345678ABCDEF1A
  			//计算这步需要使用工具SM2和SM4工具
  			String b="2FEB3052BD89A362D7E2D6FCFBBD6EB8B33EE3F5CE6C081FA4AF13737611CF4854402D67AE03EB64CDC5304FB82E42E0D37AA1DD4E4FB1EC5BFCD73FF999DBC8EA143D9D786B4E03DFC2A6480527058732C5780351540AB998F9B9F9EF0E4E83949A22F41E41CF663B0C54A71E46A0A890BD831AA27C8EAD";
  			String Mkeysdata="0F0078"+b;
  		    //交行私钥SM2签名（随机数+主密钥密文）
  			//需要先用交行公钥计算出hash：
  			//公钥：661062D341073D200C96AC555839FC16707F0A6ABFD2E167CE351E8B06ACD0AC
  			//    23FF55AAEE5E4469079FE15E8A2307F326F6E75A28AAFB54D3383F3AA65CFDA5
  		    //所有公钥计算hash都不使用用户ID，采用只对数据进行SM3算法摘要
  			//数据=（随机数+主密钥密文）
  			//交行私钥：EE5D342050416D2A4322E45FD8348E16D2DB2DB9A2EAF22EECCB2E76A510FFC7
  			String c="F89424CEEB6503EA98E579924966F0FB59960A42328DDC7865121FFE354DD2BB32BD2CA686667BA436FC7CC7CAE79E65116AEE5EB5D58B79185C167F46DCEE26";
  			String signvalue="100040"+c;
  			String total=arithmetic+random+PK_bank+SigSK_Vnd_PK_Bank+Mkeytype+Mkeydex+Mkeysdata+signvalue;
  			return total;
  		}
  		public static String updataSM4data () {
  			
  			//指定算法
  			String arithmetic="06000110";
  			//随机数
  			String random="0A00083638373231323137";
  			//交行公钥：
  			String a1="661062D341073D200C96AC555839FC16707F0A6ABFD2E167CE351E8B06ACD0AC23FF55AAEE5E4469079FE15E8A2307F326F6E75A28AAFB54D3383F3AA65CFDA5";
  			String PK_bank="0B0040"+a1;
  		//厂商私钥对交行公钥hash签名
  			//需要先用厂商的公钥计算出hash其中   
  			//所有公钥计算hash都不使用用户ID，采用只对数据进行SM3算法摘要
  			//数据为交行公钥：661062D341073D200C96AC555839FC16707F0A6ABFD2E167CE351E8B06ACD0AC23FF55AAEE5E4469079FE15E8A2307F326F6E75A28AAFB54D3383F3AA65CFDA5
  			String a="400EF2F72A9619200A9834084B031225EAB86FADF08C4603952C41204A9B2A8BF4B2D3F17EBC36A14206ED415C6883FD7D457AF6FD2332BBF3D9C68040C1696C";
  			String SigSK_Vnd_PK_Bank="0C0040"+a;
  			//主密钥算法
  			String Mkeytype="0D000103";
  			//主密钥索引
  			String Mkeydex="0E000109";
  			//主秘钥密文=终端公钥SM2加密主密钥明文
  			//终端公钥：373C40CBC01614B8E7F8AF8FDC1FC016F7BCE941DC38F1B0A45C948756070C9D  969E8BF24E7BE912094C91CC6D6A79F050C0CA5B3A662B6A90142822497E72A9
  			//主明：ABCD03E3F01234560122334FEDACBDEF
  			////计算这步需要使用工具SM2和SM4工具
  			String b="79977A145D9E89357CFCD877625BC848E11AB936DDBFBA3FABBB41D94FB529394EEEE09ED8C2E9D7D929405B7A40539003D33A4289B696AB928167A3E8827D2EB39CF8EE0EBBC16581B591249E851CECA874FEFDE145B45B6916CE22840274D2A0704F2265499B2442C318802A6A5270";
  			String Mkeysdata="0F0070"+b;
  		//交行私钥SM2签名（随机数+主密钥密文）
  			//需要先用交行公钥计算出hash：
  			//公钥：661062D341073D200C96AC555839FC16707F0A6ABFD2E167CE351E8B06ACD0AC
  			//    23FF55AAEE5E4469079FE15E8A2307F326F6E75A28AAFB54D3383F3AA65CFDA5
  		    //所有公钥计算hash都不使用用户ID，采用只对数据进行SM3算法摘要
  			//数据=（随机数+主密钥密文）
  			//交行私钥：EE5D342050416D2A4322E45FD8348E16D2DB2DB9A2EAF22EECCB2E76A510FFC7
  			String c="4A7EB0D33A0748600A9C64383B801543197B03A7AED22D60F45C90599CCCFE1F3CB1DF75D67FF1923EA96BA1E16D026CD0EACD8C468264281EA18B939FD2822A";
  			String signvalue="100040"+c;
  			String total=arithmetic+random+PK_bank+SigSK_Vnd_PK_Bank+Mkeytype+Mkeydex+Mkeysdata+signvalue;
  			return total;
  		}
  		public static String updataaes128data () {
  			
  			//指定算法
  			String arithmetic="06000110";
  			//随机数
  			String random="0A00083830333535383036";
  			//交行公钥：
  			String a1="661062D341073D200C96AC555839FC16707F0A6ABFD2E167CE351E8B06ACD0AC23FF55AAEE5E4469079FE15E8A2307F326F6E75A28AAFB54D3383F3AA65CFDA5";
  			String PK_bank="0B0040"+a1;
  		//厂商私钥对交行公钥hash签名
  			//需要先用厂商的公钥计算出hash其中   
  			//所有公钥计算hash都不使用用户ID，采用只对数据进行SM3算法摘要
  			//数据为交行公钥：661062D341073D200C96AC555839FC16707F0A6ABFD2E167CE351E8B06ACD0AC23FF55AAEE5E4469079FE15E8A2307F326F6E75A28AAFB54D3383F3AA65CFDA5
  			String a="400EF2F72A9619200A9834084B031225EAB86FADF08C4603952C41204A9B2A8BF4B2D3F17EBC36A14206ED415C6883FD7D457AF6FD2332BBF3D9C68040C1696C";
  			String SigSK_Vnd_PK_Bank="0C0040"+a;
  			//主密钥算法
  			String Mkeytype="0D000105";
  			//主密钥索引
  			String Mkeydex="0E000190";
  			//主秘钥密文=终端公钥SM2加密主密钥明文
  			//终端公钥：373C40CBC01614B8E7F8AF8FDC1FC016F7BCE941DC38F1B0A45C948756070C9D  969E8BF24E7BE912094C91CC6D6A79F050C0CA5B3A662B6A90142822497E72A9
  			//主明：A12345678A12345678A12345678A1239
  			////计算这步需要使用工具SM2和SM4工具
  			String b="2BBC11D268E2E4F432E8869913188500150DA1D2FAF3A9CED5099DA479BB76A6FC3A12EA53E92D4B64F185E491F2351493D67C35EDE1204343EC5BCB0CECA313E14748294F1B73DF847E34ADF51EE0659C9CB417E8E0ED3803EAB590ABBB98CC0200003B14E3F5DAF21034C759F00943";
  			String Mkeysdata="0F0070"+b;
  		//交行私钥SM2签名（随机数+主密钥密文）
  			//需要先用交行公钥计算出hash：
  			//公钥：661062D341073D200C96AC555839FC16707F0A6ABFD2E167CE351E8B06ACD0AC
  			//    23FF55AAEE5E4469079FE15E8A2307F326F6E75A28AAFB54D3383F3AA65CFDA5
  		    //所有公钥计算hash都不使用用户ID，采用只对数据进行SM3算法摘要
  			//数据=（随机数+主密钥密文）
  			//交行私钥：EE5D342050416D2A4322E45FD8348E16D2DB2DB9A2EAF22EECCB2E76A510FFC7
  			String c="FE26B49BA2ECBE426ACD1881AE22FEDA5240217803B9964EB0463EF27558D7EFE7D37FB34C0230A38A30E29D950131E7F44BC4B78E414F1F63EBA6D158570888";
  			String signvalue="100040"+c;
  			String total=arithmetic+random+PK_bank+SigSK_Vnd_PK_Bank+Mkeytype+Mkeydex+Mkeysdata+signvalue;
  			return total;
  		}
  		public static String updataaes192data () {
  			
  			//指定算法
  			String arithmetic="06000110";
  			//随机数
  			String random="0A00083434373033303336";
  			//交行公钥：
  			String a1="661062D341073D200C96AC555839FC16707F0A6ABFD2E167CE351E8B06ACD0AC23FF55AAEE5E4469079FE15E8A2307F326F6E75A28AAFB54D3383F3AA65CFDA5";
  			String PK_bank="0B0040"+a1;
  		//厂商私钥对交行公钥hash签名
  			//需要先用厂商的公钥计算出hash其中   
  			//所有公钥计算hash都不使用用户ID，采用只对数据进行SM3算法摘要
  			//数据为交行公钥：661062D341073D200C96AC555839FC16707F0A6ABFD2E167CE351E8B06ACD0AC23FF55AAEE5E4469079FE15E8A2307F326F6E75A28AAFB54D3383F3AA65CFDA5
  			String a="400EF2F72A9619200A9834084B031225EAB86FADF08C4603952C41204A9B2A8BF4B2D3F17EBC36A14206ED415C6883FD7D457AF6FD2332BBF3D9C68040C1696C";
  			String SigSK_Vnd_PK_Bank="0C0040"+a;
  			//主密钥算法
  			String Mkeytype="0D000105";
  			//主密钥索引
  			String Mkeydex="0E000145";
  			//主秘钥密文=终端公钥SM2加密主密钥明文
  			//终端公钥：373C40CBC01614B8E7F8AF8FDC1FC016F7BCE941DC38F1B0A45C948756070C9D  969E8BF24E7BE912094C91CC6D6A79F050C0CA5B3A662B6A90142822497E72A9
  			//主明：A12345678A12345678A12345678A12340123456678912345
  			////计算这步需要使用工具SM2和SM4工具
  			String b="7111122A18898E0BAAE6E04109144A21B609F0394FE4F95FFA5A3258BA7BE4490E622129078CB2B9C5A7D49D1F615F0B7B14EE2A1AAD860CC113C0886256813222070D16E8378EEE24419C9E636A14F840854AA1BF61E2B4ABAA16D8FACCD5D0A816B083F53A9F94424C912DE64539AE1B0CCE83962D582A";
  			String Mkeysdata="0F0078"+b;
  		//交行私钥SM2签名（随机数+主密钥密文）
  			//需要先用交行公钥计算出hash：
  			//公钥：661062D341073D200C96AC555839FC16707F0A6ABFD2E167CE351E8B06ACD0AC
  			//    23FF55AAEE5E4469079FE15E8A2307F326F6E75A28AAFB54D3383F3AA65CFDA5
  		    //所有公钥计算hash都不使用用户ID，采用只对数据进行SM3算法摘要
  			//数据=（随机数+主密钥密文）
  			//交行私钥：EE5D342050416D2A4322E45FD8348E16D2DB2DB9A2EAF22EECCB2E76A510FFC7
  			String c="8740F7349C721DD75803149324D7C9484F6C29D9D41EAE91FD6AE31F8B0DDFF0886ED358B3D46AE5187F049845E64F25BF6A0C3BF4F42AE7B5B4C6D750187656";
  			String signvalue="100040"+c;
  			String total=arithmetic+random+PK_bank+SigSK_Vnd_PK_Bank+Mkeytype+Mkeydex+Mkeysdata+signvalue;
  			return total;
  		}
  		public static String updataaes256data () {
  			
  			//指定算法
  			String arithmetic="06000110";
  			//随机数
  			String random="0A00083832383034323339";
  			//交行公钥：
  			String a1="661062D341073D200C96AC555839FC16707F0A6ABFD2E167CE351E8B06ACD0AC23FF55AAEE5E4469079FE15E8A2307F326F6E75A28AAFB54D3383F3AA65CFDA5";
  			String PK_bank="0B0040"+a1;
  		//厂商私钥对交行公钥hash签名
  			//需要先用厂商的公钥计算出hash其中   
  			//所有公钥计算hash都不使用用户ID，采用只对数据进行SM3算法摘要
  			//数据为交行公钥：661062D341073D200C96AC555839FC16707F0A6ABFD2E167CE351E8B06ACD0AC23FF55AAEE5E4469079FE15E8A2307F326F6E75A28AAFB54D3383F3AA65CFDA5
  			String a="400EF2F72A9619200A9834084B031225EAB86FADF08C4603952C41204A9B2A8BF4B2D3F17EBC36A14206ED415C6883FD7D457AF6FD2332BBF3D9C68040C1696C";
  			String SigSK_Vnd_PK_Bank="0C0040"+a;
  			//主密钥算法   N5用06，  N5S用04
  			String Mkeytype="0D000104";
  			//主密钥索引
  			String Mkeydex="0E000188";
  			//主秘钥密文=终端公钥SM2加密主密钥明文
  			//终端公钥：373C40CBC01614B8E7F8AF8FDC1FC016F7BCE941DC38F1B0A45C948756070C9D  969E8BF24E7BE912094C91CC6D6A79F050C0CA5B3A662B6A90142822497E72A9
  			//主明：A12345678A12345678A12345678A12340123456678912345123ABCDEF1234562
  			////计算这步需要使用工具SM2和SM4工具
  			String b="6DCA5090088B1EC1009B98AD5DE3EB1F4FBB0C2164C7BB24D4E8D47E91D49936273ACA5F185D5FF5656D7BA81D68DBEA75753F1A38F4D0B508ADCDFA5E1A53DA3599819FC3E0EB3BF117D7FD7BFB8FC5081463B094B1A5219BC04291DD90F90030126A42C1E968E1B5BA2AA0EE8CC78DD7C9286ED92A8E10E000AC76D0F2CD1F";
  			String Mkeysdata="0F0080"+b;
  		//交行私钥SM2签名（随机数+主密钥密文）
  			//需要先用交行公钥计算出hash：
  			//公钥：661062D341073D200C96AC555839FC16707F0A6ABFD2E167CE351E8B06ACD0AC
  			//    23FF55AAEE5E4469079FE15E8A2307F326F6E75A28AAFB54D3383F3AA65CFDA5
  		    //所有公钥计算hash都不使用用户ID，采用只对数据进行SM3算法摘要
  			//数据=（随机数+主密钥密文）
  			//交行私钥：EE5D342050416D2A4322E45FD8348E16D2DB2DB9A2EAF22EECCB2E76A510FFC7
  			String c="C58B30E61C01CCBA26F40F38BCC3909151AA91FE63DB436B7952B35E3AE7B7D691E9C9D245FF80C63940DF429A649BB831E287EA3A08C495EE63855594339237";
  			String signvalue="100040"+c;
  			String total=arithmetic+random+PK_bank+SigSK_Vnd_PK_Bank+Mkeytype+Mkeydex+Mkeysdata+signvalue;
  			return total;
  		}
  		
public static String updatadesRSAdata () {
  			
  			//指定算法
  			String arithmetic="06000100";
  			//随机数
  			String random="0A00083935303939353034";      //改下这里
  			//交行公钥：
  			String a1="AD2F9E888421F5FE38DC6484FC0AFE9322E6F5D59D228258B17EDEB9FE8F3AEAC6AE742893D0337FFDD8E22EE425EF8CF77238BB83590908E7CD8CBF52881A59F8543963AFA260096735DAB628B87BE2B779E8FACE426EC78501ED139A780A621F1B220E5029EF99FD54186212765CD97B20C8DE918AA88679FE6F8EB927126F48ED0CCD10C33B4538F08CF6DF5799C54A50E2F38EC7D0522D49BAC3DECCDFB18B37734264538F2A8D94BB9CF0AB5B9655AD3A319CB488A78F17FFEC5C05F09C51C7B511DF1A5B222941B2012A9707460C78185AF29291A07BB6E168975403BD0331C95CED884AA9633C96ED27D1CD7047FF484E401E7CB8CF551D5A37F3760B";
  			String PK_bank="0B0100"+a1;
  			//厂商私钥对交行公钥hash签名
  			//需要先用厂商的公钥计算出hash其中   
  			//所有公钥计算hash都不使用用户ID，采用只对数据进行SM3算法摘要
  			//数据为交行公钥：661062D341073D200C96AC555839FC16707F0A6ABFD2E167CE351E8B06ACD0AC23FF55AAEE5E4469079FE15E8A2307F326F6E75A28AAFB54D3383F3AA65CFDA5
            //
  			String a="46315BBBDC760E3DE57D2336C5596E848253B1B17CBE9979FDC52F2DD28BE47D9A976D5752F75CADBA00D7CD871D2DBB848EEC792B05641A1B529E1F290A4C1E13398D8D07461875BA372E7A91A1179CF8A0D940EFCD149C96A5751F36A59D29F0947F68C4B66CF8A0BCBFE795730A274F060A0520C817C3516F65651D62911E13E42D29DD7125E48BDE704875DFD7026D7FE6A3D09CD2B3E36DEA9F09D472464D201EA0810B1889553BD334BB79FA4FDF6074797AA460FE4C71BA9B4EE9CFCAB69EA19252ACDF1BFB35268D62EEC1A4B15D05A7F151D00C6F99FD286F070F804C8726E8F503C24549A380AF5AC03873ADFBA80AD249251E7B049000F562AEDD";
  			String SigSK_Vnd_PK_Bank="0C0100"+a;
  			//主密钥算法
  			String Mkeytype="0D000100";
  		    //主密钥索引
  			String Mkeydex="0E000100";
  			//主秘钥密文=终端公钥SM2加密主密钥明文
  			//终端公钥：373C40CBC01614B8E7F8AF8FDC1FC016F7BCE941DC38F1B0A45C948756070C9D  969E8BF24E7BE912094C91CC6D6A79F050C0CA5B3A662B6A90142822497E72A9
  		    //主明：3131313131313131
  		//计算这步需要使用工具SM2和SM4工具
  			String b="86F7FBE87D5CF9A6302DC966120BECD7FEA000DA882648A4C509DEEC8DFFFB73B2EF908FD57B1970E71AA6A7132233A0A55AC7BA43E3F294536733A869C6DD93715CF683D0437871B80E26B23828183BAC069231CB9A1D36D956DF177FE1AC7654C099CF65716E150974E8AB924B5FFBDEB0672ED59206FD5386914F9E14AA3786F71178264A07C1AFE70AE04AA40D684303A7220A5F30315634A04FF275E81AD05B53BE10B6C606C7E2AFF42EDB9146CCF80023BF0BE44C3331A1B48FA6939992AE0A71EADF8F6F470818810D8EE815C9B21EC49DC488BA2652F76DBB2325373BFCF4851C6C570B239558D1AAA48FDA42AD167BE29DBE67E510F8DF02C12185";
  			String Mkeysdata="0F0100"+b;
  			//交行私钥SM2签名（随机数+主密钥密文）
  			//需要先用交行公钥计算出hash：
  			//公钥：661062D341073D200C96AC555839FC16707F0A6ABFD2E167CE351E8B06ACD0AC
  			//    23FF55AAEE5E4469079FE15E8A2307F326F6E75A28AAFB54D3383F3AA65CFDA5  
  		    //所有公钥计算hash都不使用用户ID，采用只对数据进行SM3算法摘要
  			//数据=（随机数+主密钥密文）
  			//交行私钥：EE5D342050416D2A4322E45FD8348E16D2DB2DB9A2EAF22EECCB2E76A510FFC7
  			String c="56E8378FA60CCC39260CBE33CC5F1C4583D253969B797BD797C912225E7AA47444294AD3FBDFE218D3122C81FC5906A8200F804E00DA565CD1EFD92E615E2653C785035C2C8F31423C74A1027C0D7258EBA0F67EF04AB038E166BCA13FFE2890CFC34FB9ECF19694041315AD29C54726E34C81E679B1F48538E03D0ABDD4D2D6A1129369D7B5C98FF7BA746A923E19247869A31549E3B4D4E79A3B5131EE14949345CC9BF80C2AD0513FBEB6C9C78059A443C845DA83E884592FC0EBB77FF2E94B11E47983473649247B68B2A5A02E75FA2F92DABE6AF71467C75929290BDC84F270EB9C0D1C88B8EA863BDAD3C603A374BE8AC08360DD655CB825757FB297B3";
  			//改下上面一行
  			String signvalue="100100"+c;
  			String total=arithmetic+random+PK_bank+SigSK_Vnd_PK_Bank+Mkeytype+Mkeydex+Mkeysdata+signvalue;
  			return total;
  		}

public static String updata2desRSAdata () {
		
		//指定算法
		String arithmetic="06000100";
		//随机数
		String random="0A00083937343734353335";      //改下这里
		//交行公钥：
		String a1="AD2F9E888421F5FE38DC6484FC0AFE9322E6F5D59D228258B17EDEB9FE8F3AEAC6AE742893D0337FFDD8E22EE425EF8CF77238BB83590908E7CD8CBF52881A59F8543963AFA260096735DAB628B87BE2B779E8FACE426EC78501ED139A780A621F1B220E5029EF99FD54186212765CD97B20C8DE918AA88679FE6F8EB927126F48ED0CCD10C33B4538F08CF6DF5799C54A50E2F38EC7D0522D49BAC3DECCDFB18B37734264538F2A8D94BB9CF0AB5B9655AD3A319CB488A78F17FFEC5C05F09C51C7B511DF1A5B222941B2012A9707460C78185AF29291A07BB6E168975403BD0331C95CED884AA9633C96ED27D1CD7047FF484E401E7CB8CF551D5A37F3760B";
		String PK_bank="0B0100"+a1;
		//厂商私钥对交行公钥hash签名
		//需要先用厂商的公钥计算出hash其中   
		//所有公钥计算hash都不使用用户ID，采用只对数据进行SM3算法摘要
		//数据为交行公钥：661062D341073D200C96AC555839FC16707F0A6ABFD2E167CE351E8B06ACD0AC23FF55AAEE5E4469079FE15E8A2307F326F6E75A28AAFB54D3383F3AA65CFDA5
       //
		String a="46315BBBDC760E3DE57D2336C5596E848253B1B17CBE9979FDC52F2DD28BE47D9A976D5752F75CADBA00D7CD871D2DBB848EEC792B05641A1B529E1F290A4C1E13398D8D07461875BA372E7A91A1179CF8A0D940EFCD149C96A5751F36A59D29F0947F68C4B66CF8A0BCBFE795730A274F060A0520C817C3516F65651D62911E13E42D29DD7125E48BDE704875DFD7026D7FE6A3D09CD2B3E36DEA9F09D472464D201EA0810B1889553BD334BB79FA4FDF6074797AA460FE4C71BA9B4EE9CFCAB69EA19252ACDF1BFB35268D62EEC1A4B15D05A7F151D00C6F99FD286F070F804C8726E8F503C24549A380AF5AC03873ADFBA80AD249251E7B049000F562AEDD";
		String SigSK_Vnd_PK_Bank="0C0100"+a;
		//主密钥算法
		String Mkeytype="0D000101";
	    //主密钥索引
		String Mkeydex="0E000195";
		//主秘钥密文=终端公钥SM2加密主密钥明文
		//终端公钥：373C40CBC01614B8E7F8AF8FDC1FC016F7BCE941DC38F1B0A45C948756070C9D  969E8BF24E7BE912094C91CC6D6A79F050C0CA5B3A662B6A90142822497E72A9
	    //主明：3131313131313131
	    //计算这步需要使用工具SM2和SM4工具
		String b="878A4E0463F7916A5D5B9CC2929E829408DD9F70FDB4F4FFEE7AD1755095616B79872CA81411313E940669DE86D16A613F39287B760D7A03248310195D316EE24CFC71428921BA7678634F47577B9D3143377A0F977C77F98DC90E71454C9A6AE5894249D0F109D03AAE1FAD35EE9FED94E152F418769523F891FA87F81D4AA94E8BDFBF2504A849DD4A388A14A4954BAC712DBBAEA598311CC52A532AC6CFACF4137E6C195CE1BD21FD280C89979240A21DE43D2EFF9481CD1DEE9BF956811F44DAE9E1CED0F48623FFAEB0F4865E82BFEC6F3F272C24A81FDF9FE7D9C20BB8A9BBE331AC980D780C36B3EDB563A3FC43D285B37EDFEB184604C34B1A94700E";
		String Mkeysdata="0F0100"+b;
		//交行私钥SM2签名（随机数+主密钥密文）
		//需要先用交行公钥计算出hash：
		//公钥：661062D341073D200C96AC555839FC16707F0A6ABFD2E167CE351E8B06ACD0AC
		//    23FF55AAEE5E4469079FE15E8A2307F326F6E75A28AAFB54D3383F3AA65CFDA5  
	    //所有公钥计算hash都不使用用户ID，采用只对数据进行SM3算法摘要
		//数据=（随机数+主密钥密文）
		//交行私钥：EE5D342050416D2A4322E45FD8348E16D2DB2DB9A2EAF22EECCB2E76A510FFC7
		String c="56E8378FA60CCC39260CBE33CC5F1C4583D253969B797BD797C912225E7AA47444294AD3FBDFE218D3122C81FC5906A8200F804E00DA565CD1EFD92E615E2653C785035C2C8F31423C74A1027C0D7258EBA0F67EF04AB038E166BCA13FFE2890CFC34FB9ECF19694041315AD29C54726E34C81E679B1F48538E03D0ABDD4D2D6A1129369D7B5C98FF7BA746A923E19247869A31549E3B4D4E79A3B5131EE14949345CC9BF80C2AD0513FBEB6C9C78059A443C845DA83E884592FC0EBB77FF2E94B11E47983473649247B68B2A5A02E75FA2F92DABE6AF71467C75929290BDC84F270EB9C0D1C88B8EA863BDAD3C603A374BE8AC08360DD655CB825757FB297B3";
		//改下上面一行
		String signvalue="100100"+c;
		String total=arithmetic+random+PK_bank+SigSK_Vnd_PK_Bank+Mkeytype+Mkeydex+Mkeysdata+signvalue;
		return total;
	}
public static String updata3desRSAdata () {
	
	//指定算法
	String arithmetic="06000100";
	//随机数
	String random="0A00083937343734353335";      //改下这里
	//交行公钥：
	String a1="AD2F9E888421F5FE38DC6484FC0AFE9322E6F5D59D228258B17EDEB9FE8F3AEAC6AE742893D0337FFDD8E22EE425EF8CF77238BB83590908E7CD8CBF52881A59F8543963AFA260096735DAB628B87BE2B779E8FACE426EC78501ED139A780A621F1B220E5029EF99FD54186212765CD97B20C8DE918AA88679FE6F8EB927126F48ED0CCD10C33B4538F08CF6DF5799C54A50E2F38EC7D0522D49BAC3DECCDFB18B37734264538F2A8D94BB9CF0AB5B9655AD3A319CB488A78F17FFEC5C05F09C51C7B511DF1A5B222941B2012A9707460C78185AF29291A07BB6E168975403BD0331C95CED884AA9633C96ED27D1CD7047FF484E401E7CB8CF551D5A37F3760B";
	String PK_bank="0B0100"+a1;
	//厂商私钥对交行公钥hash签名
	//需要先用厂商的公钥计算出hash其中   
	//所有公钥计算hash都不使用用户ID，采用只对数据进行SM3算法摘要
	//数据为交行公钥：661062D341073D200C96AC555839FC16707F0A6ABFD2E167CE351E8B06ACD0AC23FF55AAEE5E4469079FE15E8A2307F326F6E75A28AAFB54D3383F3AA65CFDA5
	//
	String a="46315BBBDC760E3DE57D2336C5596E848253B1B17CBE9979FDC52F2DD28BE47D9A976D5752F75CADBA00D7CD871D2DBB848EEC792B05641A1B529E1F290A4C1E13398D8D07461875BA372E7A91A1179CF8A0D940EFCD149C96A5751F36A59D29F0947F68C4B66CF8A0BCBFE795730A274F060A0520C817C3516F65651D62911E13E42D29DD7125E48BDE704875DFD7026D7FE6A3D09CD2B3E36DEA9F09D472464D201EA0810B1889553BD334BB79FA4FDF6074797AA460FE4C71BA9B4EE9CFCAB69EA19252ACDF1BFB35268D62EEC1A4B15D05A7F151D00C6F99FD286F070F804C8726E8F503C24549A380AF5AC03873ADFBA80AD249251E7B049000F562AEDD";
	String SigSK_Vnd_PK_Bank="0C0100"+a;
	//主密钥算法
	String Mkeytype="0D000102";
	//主密钥索引
	String Mkeydex="0E0001B4";
	//主秘钥密文=终端公钥SM2加密主密钥明文
	//终端公钥：373C40CBC01614B8E7F8AF8FDC1FC016F7BCE941DC38F1B0A45C948756070C9D  969E8BF24E7BE912094C91CC6D6A79F050C0CA5B3A662B6A90142822497E72A9
	//主明：3131313131313131
	//计算这步需要使用工具SM2和SM4工具
	String b="284F5D8D5D8B0D3C6A0D2D3C01D2B736585C4A9834E2DDC4C4F46DC7885FBB802B9B97692FC2CC93C89E02F89DAB0461D2A7B43C7BD3050EA13AF61EA086942BFCE13186BFF0B5A92CFF7B9FE1306DA07FC7818CD88AA2D873060617FCC0C0466B09D61FCF16D679E11DB283B6F5F568AFE4F29F5227B0A0FB05C85F7F48DCA06221FB951CC64CD461FF083B80B318FECB2383BB92440931544D03585ABB42E192C529FEE53E0E062E69CFC0BB5D21482F931A059D3582A5B3835ADD79EE964C70CE63023E2B713A16462653CB7166EB341E9337443E809D357302666F96AF16ABD70A5CD028D445BEE755B612EE22FB152241FA58061F43A8F974A99714A7A2";
	String Mkeysdata="0F0100"+b;
	//交行私钥SM2签名（随机数+主密钥密文）
	//需要先用交行公钥计算出hash：
	//公钥：661062D341073D200C96AC555839FC16707F0A6ABFD2E167CE351E8B06ACD0AC
	//    23FF55AAEE5E4469079FE15E8A2307F326F6E75A28AAFB54D3383F3AA65CFDA5  
	//所有公钥计算hash都不使用用户ID，采用只对数据进行SM3算法摘要
	//数据=（随机数+主密钥密文）
	//交行私钥：EE5D342050416D2A4322E45FD8348E16D2DB2DB9A2EAF22EECCB2E76A510FFC7
	String c="56E8378FA60CCC39260CBE33CC5F1C4583D253969B797BD797C912225E7AA47444294AD3FBDFE218D3122C81FC5906A8200F804E00DA565CD1EFD92E615E2653C785035C2C8F31423C74A1027C0D7258EBA0F67EF04AB038E166BCA13FFE2890CFC34FB9ECF19694041315AD29C54726E34C81E679B1F48538E03D0ABDD4D2D6A1129369D7B5C98FF7BA746A923E19247869A31549E3B4D4E79A3B5131EE14949345CC9BF80C2AD0513FBEB6C9C78059A443C845DA83E884592FC0EBB77FF2E94B11E47983473649247B68B2A5A02E75FA2F92DABE6AF71467C75929290BDC84F270EB9C0D1C88B8EA863BDAD3C603A374BE8AC08360DD655CB825757FB297B3";
	//改下上面一行
	String signvalue="100100"+c;
	String total=arithmetic+random+PK_bank+SigSK_Vnd_PK_Bank+Mkeytype+Mkeydex+Mkeysdata+signvalue;
	return total;
}
public static String updataSM4RSAdata () {
	
	//指定算法
	String arithmetic="06000100";
	//随机数
	String random="0A00083937343734353335";      //改下这里
	//交行公钥：
	String a1="AD2F9E888421F5FE38DC6484FC0AFE9322E6F5D59D228258B17EDEB9FE8F3AEAC6AE742893D0337FFDD8E22EE425EF8CF77238BB83590908E7CD8CBF52881A59F8543963AFA260096735DAB628B87BE2B779E8FACE426EC78501ED139A780A621F1B220E5029EF99FD54186212765CD97B20C8DE918AA88679FE6F8EB927126F48ED0CCD10C33B4538F08CF6DF5799C54A50E2F38EC7D0522D49BAC3DECCDFB18B37734264538F2A8D94BB9CF0AB5B9655AD3A319CB488A78F17FFEC5C05F09C51C7B511DF1A5B222941B2012A9707460C78185AF29291A07BB6E168975403BD0331C95CED884AA9633C96ED27D1CD7047FF484E401E7CB8CF551D5A37F3760B";
	String PK_bank="0B0100"+a1;
	//厂商私钥对交行公钥hash签名
	//需要先用厂商的公钥计算出hash其中   
	//所有公钥计算hash都不使用用户ID，采用只对数据进行SM3算法摘要
	//数据为交行公钥：661062D341073D200C96AC555839FC16707F0A6ABFD2E167CE351E8B06ACD0AC23FF55AAEE5E4469079FE15E8A2307F326F6E75A28AAFB54D3383F3AA65CFDA5
	//
	String a="46315BBBDC760E3DE57D2336C5596E848253B1B17CBE9979FDC52F2DD28BE47D9A976D5752F75CADBA00D7CD871D2DBB848EEC792B05641A1B529E1F290A4C1E13398D8D07461875BA372E7A91A1179CF8A0D940EFCD149C96A5751F36A59D29F0947F68C4B66CF8A0BCBFE795730A274F060A0520C817C3516F65651D62911E13E42D29DD7125E48BDE704875DFD7026D7FE6A3D09CD2B3E36DEA9F09D472464D201EA0810B1889553BD334BB79FA4FDF6074797AA460FE4C71BA9B4EE9CFCAB69EA19252ACDF1BFB35268D62EEC1A4B15D05A7F151D00C6F99FD286F070F804C8726E8F503C24549A380AF5AC03873ADFBA80AD249251E7B049000F562AEDD";
	String SigSK_Vnd_PK_Bank="0C0100"+a;
	//主密钥算法
	String Mkeytype="0D000103";
	//主密钥索引
	String Mkeydex="0E000110";
	//主秘钥密文=终端公钥SM2加密主密钥明文
	//终端公钥：373C40CBC01614B8E7F8AF8FDC1FC016F7BCE941DC38F1B0A45C948756070C9D  969E8BF24E7BE912094C91CC6D6A79F050C0CA5B3A662B6A90142822497E72A9
	//主明：3131313131313131
	//计算这步需要使用工具SM2和SM4工具
	String b="6DBE95772C0F0DE138EDC3A71B81E1BF494064740F3D32EED065C35ABBCCA40E8B5FDCCBE00E8981A69AF0B3FB0F715B32AB4E8230E070AFE523B94DA28730191EB9DAA6BFB5973771E595D281A4A89434DEE7F19BC85109800795424E24395010F107925F6893EA9BD9844900822DBBFF6513D18FBF2D75B895C73D07F137E9091CAD39DA262C6695E58044C8BBD8F35B2FD1A234202A419F17066C7F34041409511F774CFBCA076BFDF1020B6208E542D066C70FB2DBE47E44A67ADEF337D9A4826F1633E1656AE47DA550469832747A7EDE7289E1DD2AE13AC3D05CA9A6FAD8604DDB5D9A5B873BE7977E2BDABD45693691F3FA7DDC5B0F9C77ACE12438EA";
	String Mkeysdata="0F0100"+b;
	//交行私钥SM2签名（随机数+主密钥密文）
	//需要先用交行公钥计算出hash：
	//公钥：661062D341073D200C96AC555839FC16707F0A6ABFD2E167CE351E8B06ACD0AC
	//    23FF55AAEE5E4469079FE15E8A2307F326F6E75A28AAFB54D3383F3AA65CFDA5  
	//所有公钥计算hash都不使用用户ID，采用只对数据进行SM3算法摘要
	//数据=（随机数+主密钥密文）
	//交行私钥：EE5D342050416D2A4322E45FD8348E16D2DB2DB9A2EAF22EECCB2E76A510FFC7
	String c="56E8378FA60CCC39260CBE33CC5F1C4583D253969B797BD797C912225E7AA47444294AD3FBDFE218D3122C81FC5906A8200F804E00DA565CD1EFD92E615E2653C785035C2C8F31423C74A1027C0D7258EBA0F67EF04AB038E166BCA13FFE2890CFC34FB9ECF19694041315AD29C54726E34C81E679B1F48538E03D0ABDD4D2D6A1129369D7B5C98FF7BA746A923E19247869A31549E3B4D4E79A3B5131EE14949345CC9BF80C2AD0513FBEB6C9C78059A443C845DA83E884592FC0EBB77FF2E94B11E47983473649247B68B2A5A02E75FA2F92DABE6AF71467C75929290BDC84F270EB9C0D1C88B8EA863BDAD3C603A374BE8AC08360DD655CB825757FB297B3";
	//改下上面一行
	String signvalue="100100"+c;
	String total=arithmetic+random+PK_bank+SigSK_Vnd_PK_Bank+Mkeytype+Mkeydex+Mkeysdata+signvalue;
	return total;
}
public static String updataAES128RSAdata () {
	
	//指定算法
	String arithmetic="06000100";
	//随机数
	String random="0A00083937343734353335";      //改下这里
	//交行公钥：
	String a1="AD2F9E888421F5FE38DC6484FC0AFE9322E6F5D59D228258B17EDEB9FE8F3AEAC6AE742893D0337FFDD8E22EE425EF8CF77238BB83590908E7CD8CBF52881A59F8543963AFA260096735DAB628B87BE2B779E8FACE426EC78501ED139A780A621F1B220E5029EF99FD54186212765CD97B20C8DE918AA88679FE6F8EB927126F48ED0CCD10C33B4538F08CF6DF5799C54A50E2F38EC7D0522D49BAC3DECCDFB18B37734264538F2A8D94BB9CF0AB5B9655AD3A319CB488A78F17FFEC5C05F09C51C7B511DF1A5B222941B2012A9707460C78185AF29291A07BB6E168975403BD0331C95CED884AA9633C96ED27D1CD7047FF484E401E7CB8CF551D5A37F3760B";
	String PK_bank="0B0100"+a1;
	//厂商私钥对交行公钥hash签名
	//需要先用厂商的公钥计算出hash其中   
	//所有公钥计算hash都不使用用户ID，采用只对数据进行SM3算法摘要
	//数据为交行公钥：661062D341073D200C96AC555839FC16707F0A6ABFD2E167CE351E8B06ACD0AC23FF55AAEE5E4469079FE15E8A2307F326F6E75A28AAFB54D3383F3AA65CFDA5
	//
	String a="46315BBBDC760E3DE57D2336C5596E848253B1B17CBE9979FDC52F2DD28BE47D9A976D5752F75CADBA00D7CD871D2DBB848EEC792B05641A1B529E1F290A4C1E13398D8D07461875BA372E7A91A1179CF8A0D940EFCD149C96A5751F36A59D29F0947F68C4B66CF8A0BCBFE795730A274F060A0520C817C3516F65651D62911E13E42D29DD7125E48BDE704875DFD7026D7FE6A3D09CD2B3E36DEA9F09D472464D201EA0810B1889553BD334BB79FA4FDF6074797AA460FE4C71BA9B4EE9CFCAB69EA19252ACDF1BFB35268D62EEC1A4B15D05A7F151D00C6F99FD286F070F804C8726E8F503C24549A380AF5AC03873ADFBA80AD249251E7B049000F562AEDD";
	String SigSK_Vnd_PK_Bank="0C0100"+a;
	//主密钥算法
	String Mkeytype="0D000104";
	//主密钥索引
	String Mkeydex="0E000110";
	//主秘钥密文=终端公钥SM2加密主密钥明文
	//终端公钥：373C40CBC01614B8E7F8AF8FDC1FC016F7BCE941DC38F1B0A45C948756070C9D  969E8BF24E7BE912094C91CC6D6A79F050C0CA5B3A662B6A90142822497E72A9
	//主明：3131313131313131
	//计算这步需要使用工具SM2和SM4工具
	String b="6DBE95772C0F0DE138EDC3A71B81E1BF494064740F3D32EED065C35ABBCCA40E8B5FDCCBE00E8981A69AF0B3FB0F715B32AB4E8230E070AFE523B94DA28730191EB9DAA6BFB5973771E595D281A4A89434DEE7F19BC85109800795424E24395010F107925F6893EA9BD9844900822DBBFF6513D18FBF2D75B895C73D07F137E9091CAD39DA262C6695E58044C8BBD8F35B2FD1A234202A419F17066C7F34041409511F774CFBCA076BFDF1020B6208E542D066C70FB2DBE47E44A67ADEF337D9A4826F1633E1656AE47DA550469832747A7EDE7289E1DD2AE13AC3D05CA9A6FAD8604DDB5D9A5B873BE7977E2BDABD45693691F3FA7DDC5B0F9C77ACE12438EA";
	String Mkeysdata="0F0100"+b;
	//交行私钥SM2签名（随机数+主密钥密文）
	//需要先用交行公钥计算出hash：
	//公钥：661062D341073D200C96AC555839FC16707F0A6ABFD2E167CE351E8B06ACD0AC
	//    23FF55AAEE5E4469079FE15E8A2307F326F6E75A28AAFB54D3383F3AA65CFDA5  
	//所有公钥计算hash都不使用用户ID，采用只对数据进行SM3算法摘要
	//数据=（随机数+主密钥密文）
	//交行私钥：EE5D342050416D2A4322E45FD8348E16D2DB2DB9A2EAF22EECCB2E76A510FFC7
	String c="56E8378FA60CCC39260CBE33CC5F1C4583D253969B797BD797C912225E7AA47444294AD3FBDFE218D3122C81FC5906A8200F804E00DA565CD1EFD92E615E2653C785035C2C8F31423C74A1027C0D7258EBA0F67EF04AB038E166BCA13FFE2890CFC34FB9ECF19694041315AD29C54726E34C81E679B1F48538E03D0ABDD4D2D6A1129369D7B5C98FF7BA746A923E19247869A31549E3B4D4E79A3B5131EE14949345CC9BF80C2AD0513FBEB6C9C78059A443C845DA83E884592FC0EBB77FF2E94B11E47983473649247B68B2A5A02E75FA2F92DABE6AF71467C75929290BDC84F270EB9C0D1C88B8EA863BDAD3C603A374BE8AC08360DD655CB825757FB297B3";
	//改下上面一行
	String signvalue="100100"+c;
	String total=arithmetic+random+PK_bank+SigSK_Vnd_PK_Bank+Mkeytype+Mkeydex+Mkeysdata+signvalue;
	return total;
}

public static String updataAES192RSAdata () {
	
	//指定算法
	String arithmetic="06000100";
	//随机数
	String random="0A00083937343734353335";      //改下这里
	//交行公钥：
	String a1="AD2F9E888421F5FE38DC6484FC0AFE9322E6F5D59D228258B17EDEB9FE8F3AEAC6AE742893D0337FFDD8E22EE425EF8CF77238BB83590908E7CD8CBF52881A59F8543963AFA260096735DAB628B87BE2B779E8FACE426EC78501ED139A780A621F1B220E5029EF99FD54186212765CD97B20C8DE918AA88679FE6F8EB927126F48ED0CCD10C33B4538F08CF6DF5799C54A50E2F38EC7D0522D49BAC3DECCDFB18B37734264538F2A8D94BB9CF0AB5B9655AD3A319CB488A78F17FFEC5C05F09C51C7B511DF1A5B222941B2012A9707460C78185AF29291A07BB6E168975403BD0331C95CED884AA9633C96ED27D1CD7047FF484E401E7CB8CF551D5A37F3760B";
	String PK_bank="0B0100"+a1;
	//厂商私钥对交行公钥hash签名
	//需要先用厂商的公钥计算出hash其中   
	//所有公钥计算hash都不使用用户ID，采用只对数据进行SM3算法摘要
	//数据为交行公钥：661062D341073D200C96AC555839FC16707F0A6ABFD2E167CE351E8B06ACD0AC23FF55AAEE5E4469079FE15E8A2307F326F6E75A28AAFB54D3383F3AA65CFDA5
	//
	String a="46315BBBDC760E3DE57D2336C5596E848253B1B17CBE9979FDC52F2DD28BE47D9A976D5752F75CADBA00D7CD871D2DBB848EEC792B05641A1B529E1F290A4C1E13398D8D07461875BA372E7A91A1179CF8A0D940EFCD149C96A5751F36A59D29F0947F68C4B66CF8A0BCBFE795730A274F060A0520C817C3516F65651D62911E13E42D29DD7125E48BDE704875DFD7026D7FE6A3D09CD2B3E36DEA9F09D472464D201EA0810B1889553BD334BB79FA4FDF6074797AA460FE4C71BA9B4EE9CFCAB69EA19252ACDF1BFB35268D62EEC1A4B15D05A7F151D00C6F99FD286F070F804C8726E8F503C24549A380AF5AC03873ADFBA80AD249251E7B049000F562AEDD";
	String SigSK_Vnd_PK_Bank="0C0100"+a;
	//主密钥算法
	String Mkeytype="0D000105";
	//主密钥索引
	String Mkeydex="0E00014C";
	//主秘钥密文=终端公钥SM2加密主密钥明文
	//终端公钥：373C40CBC01614B8E7F8AF8FDC1FC016F7BCE941DC38F1B0A45C948756070C9D  969E8BF24E7BE912094C91CC6D6A79F050C0CA5B3A662B6A90142822497E72A9
	//主明：3131313131313131
	//计算这步需要使用工具SM2和SM4工具
	String b="284F5D8D5D8B0D3C6A0D2D3C01D2B736585C4A9834E2DDC4C4F46DC7885FBB802B9B97692FC2CC93C89E02F89DAB0461D2A7B43C7BD3050EA13AF61EA086942BFCE13186BFF0B5A92CFF7B9FE1306DA07FC7818CD88AA2D873060617FCC0C0466B09D61FCF16D679E11DB283B6F5F568AFE4F29F5227B0A0FB05C85F7F48DCA06221FB951CC64CD461FF083B80B318FECB2383BB92440931544D03585ABB42E192C529FEE53E0E062E69CFC0BB5D21482F931A059D3582A5B3835ADD79EE964C70CE63023E2B713A16462653CB7166EB341E9337443E809D357302666F96AF16ABD70A5CD028D445BEE755B612EE22FB152241FA58061F43A8F974A99714A7A2";
	String Mkeysdata="0F0100"+b;
	//交行私钥SM2签名（随机数+主密钥密文）
	//需要先用交行公钥计算出hash：
	//公钥：661062D341073D200C96AC555839FC16707F0A6ABFD2E167CE351E8B06ACD0AC
	//    23FF55AAEE5E4469079FE15E8A2307F326F6E75A28AAFB54D3383F3AA65CFDA5  
	//所有公钥计算hash都不使用用户ID，采用只对数据进行SM3算法摘要
	//数据=（随机数+主密钥密文）
	//交行私钥：EE5D342050416D2A4322E45FD8348E16D2DB2DB9A2EAF22EECCB2E76A510FFC7
	String c="56E8378FA60CCC39260CBE33CC5F1C4583D253969B797BD797C912225E7AA47444294AD3FBDFE218D3122C81FC5906A8200F804E00DA565CD1EFD92E615E2653C785035C2C8F31423C74A1027C0D7258EBA0F67EF04AB038E166BCA13FFE2890CFC34FB9ECF19694041315AD29C54726E34C81E679B1F48538E03D0ABDD4D2D6A1129369D7B5C98FF7BA746A923E19247869A31549E3B4D4E79A3B5131EE14949345CC9BF80C2AD0513FBEB6C9C78059A443C845DA83E884592FC0EBB77FF2E94B11E47983473649247B68B2A5A02E75FA2F92DABE6AF71467C75929290BDC84F270EB9C0D1C88B8EA863BDAD3C603A374BE8AC08360DD655CB825757FB297B3";
	//改下上面一行
	String signvalue="100100"+c;
	String total=arithmetic+random+PK_bank+SigSK_Vnd_PK_Bank+Mkeytype+Mkeydex+Mkeysdata+signvalue;
	return total;
}

public static String updataAES256RSAdata () {
	
	//指定算法
	String arithmetic="06000100";
	//随机数
	String random="0A00083937343734353335";      //改下这里
	//交行公钥：
	String a1="AD2F9E888421F5FE38DC6484FC0AFE9322E6F5D59D228258B17EDEB9FE8F3AEAC6AE742893D0337FFDD8E22EE425EF8CF77238BB83590908E7CD8CBF52881A59F8543963AFA260096735DAB628B87BE2B779E8FACE426EC78501ED139A780A621F1B220E5029EF99FD54186212765CD97B20C8DE918AA88679FE6F8EB927126F48ED0CCD10C33B4538F08CF6DF5799C54A50E2F38EC7D0522D49BAC3DECCDFB18B37734264538F2A8D94BB9CF0AB5B9655AD3A319CB488A78F17FFEC5C05F09C51C7B511DF1A5B222941B2012A9707460C78185AF29291A07BB6E168975403BD0331C95CED884AA9633C96ED27D1CD7047FF484E401E7CB8CF551D5A37F3760B";
	String PK_bank="0B0100"+a1;
	//厂商私钥对交行公钥hash签名
	//需要先用厂商的公钥计算出hash其中   
	//所有公钥计算hash都不使用用户ID，采用只对数据进行SM3算法摘要
	//数据为交行公钥：661062D341073D200C96AC555839FC16707F0A6ABFD2E167CE351E8B06ACD0AC23FF55AAEE5E4469079FE15E8A2307F326F6E75A28AAFB54D3383F3AA65CFDA5
	//
	String a="46315BBBDC760E3DE57D2336C5596E848253B1B17CBE9979FDC52F2DD28BE47D9A976D5752F75CADBA00D7CD871D2DBB848EEC792B05641A1B529E1F290A4C1E13398D8D07461875BA372E7A91A1179CF8A0D940EFCD149C96A5751F36A59D29F0947F68C4B66CF8A0BCBFE795730A274F060A0520C817C3516F65651D62911E13E42D29DD7125E48BDE704875DFD7026D7FE6A3D09CD2B3E36DEA9F09D472464D201EA0810B1889553BD334BB79FA4FDF6074797AA460FE4C71BA9B4EE9CFCAB69EA19252ACDF1BFB35268D62EEC1A4B15D05A7F151D00C6F99FD286F070F804C8726E8F503C24549A380AF5AC03873ADFBA80AD249251E7B049000F562AEDD";
	String SigSK_Vnd_PK_Bank="0C0100"+a;
	//主密钥算法
	String Mkeytype="0D000106";
	//主密钥索引
	String Mkeydex="0E000188";
	//主秘钥密文=终端公钥SM2加密主密钥明文
	//终端公钥：373C40CBC01614B8E7F8AF8FDC1FC016F7BCE941DC38F1B0A45C948756070C9D  969E8BF24E7BE912094C91CC6D6A79F050C0CA5B3A662B6A90142822497E72A9
	//主明：3131313131313131
	//计算这步需要使用工具SM2和SM4工具
	String b="3AE31553A237CB149E09C4F4B3CC8CB44A0358EADFC8E0B12DE9174BF703655F823A776896C6141DCCADC45E3866C1FD1552414F3D399B0A78D7D11DA5550867E5A1980AC1FBB5EA9C757838C719BDAB3B1690715AF72F5045722169F66F81BE46924C0A6E468C6740A200D4C9A81525463E6880B2FCAA44B0451B997F203DD90577D1F651055B172893A874E99377EA7A743D04E47E5A1D7C3E168BB6B3F82822F406FA23F130ECAB83E17081BB3160DF491BC0AB1BE6158E3FABBD32A48CBA479B42A81322AB514CAC05A033E9366182AC41D19927FAABED2CF78B07866CF7782E0F7D319F82A433A58BE5F0AB46A47A77771C76290BFA771B15F19E6D3058";
	String Mkeysdata="0F0100"+b;
	//交行私钥SM2签名（随机数+主密钥密文）
	//需要先用交行公钥计算出hash：
	//公钥：661062D341073D200C96AC555839FC16707F0A6ABFD2E167CE351E8B06ACD0AC
	//    23FF55AAEE5E4469079FE15E8A2307F326F6E75A28AAFB54D3383F3AA65CFDA5  
	//所有公钥计算hash都不使用用户ID，采用只对数据进行SM3算法摘要
	//数据=（随机数+主密钥密文）
	//交行私钥：EE5D342050416D2A4322E45FD8348E16D2DB2DB9A2EAF22EECCB2E76A510FFC7
	String c="56E8378FA60CCC39260CBE33CC5F1C4583D253969B797BD797C912225E7AA47444294AD3FBDFE218D3122C81FC5906A8200F804E00DA565CD1EFD92E615E2653C785035C2C8F31423C74A1027C0D7258EBA0F67EF04AB038E166BCA13FFE2890CFC34FB9ECF19694041315AD29C54726E34C81E679B1F48538E03D0ABDD4D2D6A1129369D7B5C98FF7BA746A923E19247869A31549E3B4D4E79A3B5131EE14949345CC9BF80C2AD0513FBEB6C9C78059A443C845DA83E884592FC0EBB77FF2E94B11E47983473649247B68B2A5A02E75FA2F92DABE6AF71467C75929290BDC84F270EB9C0D1C88B8EA863BDAD3C603A374BE8AC08360DD655CB825757FB297B3";
	//改下上面一行
	String signvalue="100100"+c;
	String total=arithmetic+random+PK_bank+SigSK_Vnd_PK_Bank+Mkeytype+Mkeydex+Mkeysdata+signvalue;
	return total;
}


}
