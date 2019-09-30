package com.bw.cultivate.webtop.util.result;

/**
 * @ClassName:  AppData
 * @Description: 执行结果封装类
 * @author: by_csd_hlj
 * @date: 2019/9/25  16:49
 * @version: 1.0
 */
public class AppData {

    private Object entity;

    public AppData(){

    }
    public AppData(Object resultList) {
        this.entity = resultList;
    }

    public Object getEntity() {
        return entity;
    }

    public void setEntity(Object entity) {
        this.entity = entity;
    }

}
