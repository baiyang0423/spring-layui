package com.bw.cultivate.webtop.util.upload;

import com.bw.cultivate.webtop.util.uuid.UUIDGenerator;

/**
 * @ClassName:
 * @Description:
 * @author: by_csd_hlj
 * @date:
 * @version: 1.0
 */
public class FileNameUtils {

    /**
     * 获取文件后缀
     * @param fileName
     * @return
     */
    public static String getSuffix(String fileName){
        return fileName.substring(fileName.lastIndexOf("."));
    }

    /**
     * 生成新的文件名
     * @param fileOriginName 源文件名
     * @return
     */
    public static String getFileName(String fileOriginName){
        return UUIDGenerator.create() + FileNameUtils.getSuffix(fileOriginName);
    }

}
