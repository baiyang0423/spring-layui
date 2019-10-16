package com.bw.cultivate.webtop.wsg.authitor.VO;

import lombok.Data;

/**
 * @ClassName:  SysFunctionVO
 * @Description: 
 * @author: by_csd_hlj
 * @date: 2019/9/27  14:53
 * @version: 1.0
 */
@Data
public class SysFunctionVO {

    private Integer page;

    private Integer limit;

    private String id;

    private String title;

    private String code;

    private String url;

    private String path;

    private String icon;

    private String lev;

    private String parentId;

    private Integer orderValue;

}
