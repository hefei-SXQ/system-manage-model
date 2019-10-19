package com.sxq.common.constant;

import java.util.Map;

public interface SystemConstant {
    /** 计算机信息 */
    public static final Map<String, String> map = System.getenv();

    /**当前登录用户的计算机名*/
    public static final String USERNAME =map.get("USERNAME");

    /** 计算机名 */
    public static final String COMPUTERNAME = map.get("COMPUTERNAME");

    /** JavaHome*/
    public static final String JAVA_HOME = map.get("JAVA_HOME");

    /** 系统零时路径 */
    public static final String TEMP = map.get("TEMP");
}
