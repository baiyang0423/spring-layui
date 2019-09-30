package com.bw.cultivate.webtop.wsg.authitor.VO;

import lombok.Data;

/**
 * @ClassName:
 * @Description:
 * @author: by_csd_hlj
 * @date:
 * @version: 1.0
 */
@Data
public class SysUserVO {

    private Integer page ;

    private Integer limit;

    private String id;

    private String name;

    private String password;

    private String account;

    private String mobile;

    private String email;

    private String status;

}
