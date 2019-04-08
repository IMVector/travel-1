package com.qdu.utils;

import static java.lang.Math.log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author qdu
 */
public class ReflectionUtil {

    /**
     * 获取类的属性个数
     *
     * @param obj
     * @return
     */
    public static int getFieldsNum(Object obj) {
        return obj.getClass().getDeclaredFields().length;
    }

    /**
     * 根据属性名获取属性值
     *
     */
    private static Object getFieldValueByName(String fieldName, Object obj) {
        try {
            String firstLetter = fieldName.substring(0, 1).toUpperCase();
            String getter = "get" + firstLetter + fieldName.substring(1);
            Method method = obj.getClass().getMethod(getter, new Class[]{});
            Object value = method.invoke(obj, new Object[]{});
            return value;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 获取属性名数组
     *
     */
    public static String[] getFiledName(Object obj) {
        Field[] fields = obj.getClass().getDeclaredFields();
        String[] fieldNames = new String[fields.length];
        for (int i = 0; i < fields.length; i++) {
            fieldNames[i] = fields[i].getName();
        }
        return fieldNames;
    }

    /**
     * 获取属性类型(type)，属性名(name)，属性值(value)的map组成的list
     *
     */
    public static List getFiledsInfo(Object obj) {
        Field[] fields = obj.getClass().getDeclaredFields();
        String[] fieldNames = new String[fields.length];
        List list = new ArrayList();
        Map infoMap = null;
        for (int i = 0; i < fields.length; i++) {
            infoMap = new HashMap();
//            infoMap.put("type", fields[i].getType().toString());
//            infoMap.put("name", fields[i].getName());
            infoMap.put(fields[i].getName(), getFieldValueByName(fields[i].getName(), obj));
            list.add(infoMap);
        }
        return list;
    }

    /**
     * 获取对象的所有属性值，返回一个对象数组
     *
     */
    public static Object[] getFiledValues(Object obj) {
        String[] fieldNames = getFiledName(obj);
        Object[] value = new Object[fieldNames.length];
        for (int i = 0; i < fieldNames.length; i++) {
            value[i] = getFieldValueByName(fieldNames[i], obj);
        }
        return value;
    }

}
