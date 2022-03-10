package com.njucm.itf.matlab;

import com.mathworks.toolbox.javabuilder.MWException;
import GSO2.GSO2;


public class GS {
    public static String Res(String FileName) throws MWException {
        GSO2 C1=new GSO2();
        Object[] Res=(C1.GingerSO2(1,"/Users/zhangjin/MATLAB/Ginger/Pic","/Users/zhangjin/MATLAB/Ginger",FileName));
        System.out.println(Res[0].toString());
        return Res[0].toString();
    }
}