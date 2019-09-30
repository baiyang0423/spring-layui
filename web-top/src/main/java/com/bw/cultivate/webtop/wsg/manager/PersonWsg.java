package com.bw.cultivate.webtop.wsg.manager;

import com.bw.cultivate.webtop.util.result.WsgResult;
import com.bw.cultivate.webtop.util.upload.FileUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @ClassName:
 * @Description:
 * @author: by_csd_hlj
 * @date:
 * @version: 1.0
 */
@RestController
@Slf4j
public class PersonWsg {


    @PostMapping("/manager/user/person/file/upload")
    public WsgResult fileUpload(@RequestParam("file")MultipartFile file){
        WsgResult result = new WsgResult();
        if(file != null){
            log.info("接收文件："+file.getName()+"；并开始上传！");
        }
        // 要上传的目标文件存放路径
        String localPath = "E:/temp";
        // 上传成功或者失败的提示
        String msg = "";

        if (FileUtils.upload(file, localPath, file.getOriginalFilename())){
            // 上传成功，给出页面提示
            msg = "上传成功！";
        }else {
            msg = "上传失败！";

        }


        log.info("文件上传完成！");
        return  result;
    }

}
