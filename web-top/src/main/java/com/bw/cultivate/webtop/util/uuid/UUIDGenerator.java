package com.bw.cultivate.webtop.util.uuid;

import java.util.UUID;

/**
 * @ClassName:
 * @Description:
 * @author: by_csd_hlj
 * @date:
 * @version: 1.0
 */
public class UUIDGenerator {

    public static String create(){
        return  UUID.randomUUID().toString().replace("-","");
    }
}
