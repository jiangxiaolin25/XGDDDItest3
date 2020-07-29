package com.xinguodu.ddiinterface;

/**
 * ����
 * Created by jinniu on 2015/9/6.
 */
public class DdiConstant {
    public static final int FONT_TYPE_HZ1212 = 0;
    public static final int FONT_TYPE_HZ1616 = 1;
    public static final int FONT_TYPE_HZ2020 = 2;
    public static final int FONT_TYPE_HZ2424 = 3;
    public static final int FONT_TYPE_HZ3232 = 4;
    public static final int FONT_TYPE_HZ4848 = 5;
    public static final int FONT_TYPE_NOHZ = 6;//�����ڵ��ֿ⣬���ڲ��Ժڿ�

    public static final int FONT_TYPE_ASC6X12 = 0;
    public static final int FONT_TYPE_ASC8X16 = 1;
    public static final int FONT_TYPE_ASC1224 = 2;
    public static final int FONT_TYPE_ASC1632 = 3;
    public static final int FONT_TYPE_ASC2448 = 4;
    public static final int FONT_TYPE_ASC6X8 = 5;
    public static final int FONT_TYPE_ASC1624 = 6;
    public static final int FONT_TYPE_NOASC = 7;//�����ڵ��ֿ⣬���ڲ��Ժڿ�

    public static final int FONT_HORIZONTAL = 1;//���
    public static final int FONT_VERTICAL = 2;//�ݿ�

    public static final int FONT_NATIVE_ZOOM_BASE = 0; //�����ֺ�
    public static final int FONT_NATIVE_ZOOM_GENERAL = 3; //�����Ŵ�

    public static final int FONT_ALIGN_LEFT = 0; //�����
    public static final int FONT_ALIGN_RIGHT = 1; //�Ҷ���
    public static final int FONT_ALIGN_CENTER = 2; //���ж���

    public static final int PRINT_CONENT_STRING = 0;//�ַ���
    public static final int PRINT_CONENT_BITMAP = 1;//ͼƬ

    public static final int FONT_SIZE_SMALL = 0; //����С
    public static final int FONT_SIZE_MIDDLE = 1;//������
    public static final int FONT_SIZE_LARGE = 2;//�����

    public static final int FONT_SIZE_16 = 16;
    public static final int FONT_SIZE_20 = 20;
    public static final int FONT_SIZE_24 = 24;
    public static final int FONT_SIZE_28 = 28;
    public static final int FONT_SIZE_32 = 32;


/*    //����֧�ֵ���������
    public static final Typeface FONT_TYPE_DEFAULT = Typeface.DEFAULT; //������������
    public static final Typeface FONT_TYPE_DEFAULT_BOLD = Typeface.DEFAULT_BOLD; //������������
    public static final Typeface FONT_TYPE_MONOSPACE = Typeface.MONOSPACE; //�ȿ���������
    public static final Typeface FONT_TYPE_SANS_SERIF = Typeface.SANS_SERIF; //sans serif��������
    public static final Typeface FONT_TYPE_SERIF = Typeface.SERIF; //serif��������*/

    public static final int FONT_TYPE_SONG = 0; //����
    public static final int FONT_TYPE_BLANK = 1; //����
    public static final int FONT_TYPE_YOUYUAN = 2; //��Բ

    public static final int DDI_THMPRN_CTL_VER = 0;
    public static final int DDI_THMPRN_CTL_GRAY = 1;
    public static final int DDI_THMPRN_CTL_LINEGAP = 2;
    public static final int DDI_THMPRN_CTL_COLGAP = 3;

    public static final int DDI_OK = 0;
    public static final int DDI_ERR = -1;
    public static final int DDI_ETIMEOUT = -2;
    public static final int DDI_EBUSY = -3;
    public static final int DDI_ENODEV = -4;
    public static final int DDI_EACCES = -5;
    public static final int DDI_EINVAL = -6;
    public static final int DDI_EIO = -7;
    public static final int DDI_EDATA = -8;
    public static final int DDI_EPROTOCOL = -9;
    public static final int DDI_ETRANSPORT = -10;
    public static final int DDI_DRAWERR = -11;


    public static final int DDI_RF_CTL_VER = 0;//��ȡ�ǽӶ������豸�汾
    public static final int DDI_RF_CTL_SAK = 1;//��ȡѡ��Ӧ�� SAK ֵ
    public static final int DDI_RF_CTL_UID = 2;//��Ƭ ID
    public static final int DDI_RF_CTL_MF_AUTH = 3;//Mifare ����֤
    public static final int DDI_RF_CTL_MF_READ_RAW = 4;//��ȡԭʼ����������
    public static final int DDI_RF_CTL_MF_WRITE_RAW = 5;//дԭʼ����������
    public static final int DDI_RF_CTL_MF_READ_VALUE = 6;//��ȡ��ֵ
    public static final int DDI_RF_CTL_MF_WRITE_VALUE = 7;//д��ֵ
    public static final int DDI_RF_CTL_MF_INC_VALUE = 8;//��ֵ����
    public static final int DDI_RF_CTL_MF_DEC_VALUE = 9;//��ֵ����
    public static final int DDI_RF_CTL_MF_BACKUP_VALUE = 10;//��ֵ����
    public static final int DDI_RF_CTL_SET_PARAM = 11;//���÷ǽӿ���оƬ����
    public static final int DDI_RF_CTL_GET_PARAM = 12;//���ǽӿ���оƬ����

    public static final int DDI_KEYVALUE = 0;
    public static final int DDI_BYPASSPIN = -3;
    public static final int DDI_INPUTCANCEL = -5;
    public static final int DDI_TIMEOUT = -2;

}
