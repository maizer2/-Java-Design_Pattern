package com.butter_con.Singleton.Prac07;

public class Config {

    static public String conf = null;

    public static void setValue(String val) {
        conf = val;
    }

    public static String getValue() {
        return conf;
    }
}
