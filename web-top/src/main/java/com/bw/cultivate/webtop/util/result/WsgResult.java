package com.bw.cultivate.webtop.util.result;

import lombok.Data;

/**
 * @ClassName:  WsgResult
 * @Description: 返回结果封装类
 * @author: by_csd_hlj
 * @date: 2019/9/25  16:51
 * @version: 1.0
 */
@Data
public class WsgResult {

    private String code = "0";

    private String msg = RetCode.SUCCESS.getName();

    private Integer count = 0;

    private Object data;

}
