package com.bw.cultivate.webtop.dao.entity;

import lombok.Data;

@Data
public class SysFunction {
    private String id;

    private String title;

    private String code;

    private String url;

    private String path;

    private String icon;

    private String lev;

    private String isHtml;

    private  String parentId;

    private Integer orderValue;

}