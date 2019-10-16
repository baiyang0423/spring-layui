package com.bw.cultivate.webtop.wsg.authitor;

import com.alibaba.fastjson.JSONObject;
import com.bw.cultivate.webtop.ai.authitor.DTO.Aoutes;
import com.bw.cultivate.webtop.ai.authitor.DTO.SysFunctionDTO;
import com.bw.cultivate.webtop.ai.authitor.ISysFunctionApp;
import com.bw.cultivate.webtop.util.BeanConvertor;
import com.bw.cultivate.webtop.util.result.Page;
import com.bw.cultivate.webtop.util.result.RetCode;
import com.bw.cultivate.webtop.util.result.WsgResult;
import com.bw.cultivate.webtop.wsg.authitor.VO.SysFunctionVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @ClassName:  SysFunctionWsg
 * @Description: 系统菜单
 * @author: by_csd_hlj
 * @date: 2019/9/27  14:48
 * @version: 1.0
 */
@Slf4j
@RestController
public class SysFunctionWsg {

    @Resource
    private ISysFunctionApp functionApp;


    @GetMapping("/sys/function/select/page")
    public WsgResult select(@RequestParam Map<String, Object> params){

        WsgResult result = new WsgResult();

        try{
            SysFunctionVO vo = BeanConvertor.mapToObject(params,SysFunctionVO.class);

            vo.setPage(Page.getPage(vo.getPage(),vo.getLimit()));

            List<SysFunctionDTO> list = functionApp.selectPage(vo);

            result.setData(list);

            result.setCount(functionApp.selectCount(vo));

        }catch (Exception e){

            log.error(e.getMessage());
            result.setCode(RetCode.OPERATION_FAIL.getCode());
            result.setMsg(e.getMessage());

        }


        return  result;

    }




    /**
     * @Description: 首页菜单获取数据
     * @User: by_csd_hlj
     * @Date:2019/9/27  20:17
     * @Return: List<Aoutes>
     * @Throws 
     */
    @GetMapping("/sys/function/index/data")
    public WsgResult indexData(){
        WsgResult result = new WsgResult();
        try{
            List<Aoutes> list = functionApp.selectIndexData();
            result.setData(list);
        }catch (Exception e){

            log.error(e.getMessage());
            result.setCode(RetCode.OPERATION_FAIL.getCode());
            result.setMsg(e.getMessage());
        }

        return  result;
    }


    /**
     * @Description: 首页菜单获取数据
     * @User: by_csd_hlj
     * @Date:2019/9/27  20:17
     * @Return: List<SysFunctionDTO>
     * @Throws
     */
    @GetMapping("/sys/function/index/data/all")
    public WsgResult indexDataAll(){
        WsgResult result = new WsgResult();
        try{
            List<SysFunctionDTO> list = functionApp.selectIndexDataAll();
            result.setData(list);
        }catch (Exception e){

            log.error(e.getMessage());
            result.setCode(RetCode.OPERATION_FAIL.getCode());
            result.setMsg(e.getMessage());
        }

        return  result;
    }




}
