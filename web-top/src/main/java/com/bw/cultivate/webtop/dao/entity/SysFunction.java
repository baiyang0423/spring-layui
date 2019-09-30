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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getLev() {
        return lev;
    }

    public void setLev(String lev) {
        this.lev = lev == null ? null : lev.trim();
    }

    public String getIsHtml() {
        return isHtml;
    }

    public void setIsHtml(String isHtml) {
        this.isHtml = isHtml == null ? null : isHtml.trim();
    }
}