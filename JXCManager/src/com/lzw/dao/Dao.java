package com.lzw.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dao {
   /* protected static String dbClassName = "com.microsoft.jdbc.sqlserver.SQLServerDrive";
    protected static String dbUrl = "jdbc.microsoft:";
    protected static String dbUser = "";
    protected static String dbPwd = "";
    protected static String second = null;
    public static Connection conn = null;
    static{
        try {
            if (conn == null) {
                Class.forName(dbClassName).newInstance();
                conn = DriverManager.getConnection(dbUrl,dbUser,dbPwd);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static boolean addGys(TbGysinfo gysinfo){
        if (gysinfo == null) {
            return false;
        }
        return insert("insert tb_gysinfo values(\""+gysinfo.getId()+"\",\""+gysinfo.getName()+"\",\""+gysinfo.getJc()+","+
                gysinfo.getAddress()+","+gysinfo.getBianma()+","+gysinfo.getTel()+","+gysinfo.getFax()+","+gysinfo.getLian()+","+
                gysinfo.getLtel()+","+gysinfo.getMail()+","+gysinfo.getYh()+")");
    }*/
}
