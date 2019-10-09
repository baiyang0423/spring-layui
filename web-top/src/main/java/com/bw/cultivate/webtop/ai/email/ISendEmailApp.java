package com.bw.cultivate.webtop.ai.email;

import com.alibaba.fastjson.JSONObject;

/**
 * @ClassName:
 * @Description:
 * @author: by_csd_hlj
 * @date:
 * @version: 1.0
 */
public interface ISendEmailApp {
    void send(JSONObject json);

    void sendInlineResourceMail(JSONObject json);
}
