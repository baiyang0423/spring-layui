package com.bw.cultivate.webtop.util.result;

import lombok.Data;

/**
 * @ClassName:
 * @Description:
 * @author: by_csd_hlj
 * @date:
 * @version: 1.0
 */
@Data
public class Page {

    public Integer currPage ;

    public Integer limit ;

    public Page(Integer currPage,Integer limit){
        this.currPage = (currPage - 1) * limit;
    }


    public static Integer getPage(Integer currPage,Integer limit){
        return  (currPage - 1) * limit;
    }

}
