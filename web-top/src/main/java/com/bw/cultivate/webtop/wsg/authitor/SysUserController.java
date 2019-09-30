package com.bw.cultivate.webtop.wsg.authitor;

import com.bw.cultivate.webtop.ai.authitor.DTO.UserDTO;
import com.bw.cultivate.webtop.ai.authitor.SysUserApp;
import com.bw.cultivate.webtop.util.BeanConvertor;
import com.bw.cultivate.webtop.util.result.Page;
import com.bw.cultivate.webtop.util.result.RetCode;
import com.bw.cultivate.webtop.util.result.WsgResult;
import com.bw.cultivate.webtop.wsg.authitor.VO.SysUserVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @ClassName:  TestController
 * @Description:    框架测试类
 * @author: by_csd_hlj
 * @date: 2019/9/25  16:56
 * @version: 1.0
 */
@RestController
@Slf4j
public class SysUserController {


    @Resource
    private SysUserApp userApp;

    /**
     * @Description: 测试类
     * @User: by_csd_hlj
     * @Date:2019/9/25  16:55
     * @Param: 
     * @Return: 
     * @Throws 
     */
    @GetMapping("/sys/user/select/page")
    public WsgResult select(@RequestParam Map<String ,Object> map){

        WsgResult result = new WsgResult();
        try{

            SysUserVO vo = BeanConvertor.mapToObject(map, SysUserVO.class);

            vo.setPage(Page.getPage(vo.getPage(),vo.getLimit()));

            List<UserDTO> list = userApp.selectPage(vo);

            result.setData(list);

            result.setCount(userApp.selectCount(vo));
        }catch (Exception e){

          log.error(e.getMessage());

        }


        return  result;

    }


    @PostMapping("/sys/user/save")
    public WsgResult save(@RequestBody UserDTO user){
        WsgResult result = new WsgResult();
        try{
            if(StringUtils.isNotBlank(user.getId())){
                userApp.update(user);
            }else {
                userApp.save(user);
            }

        }catch (Exception e){
            result.setCode(RetCode.OPERATION_FAIL.getCode());
            result.setMsg(e.getMessage());
        }
        return result;
    }


    @GetMapping("/sys/user/select/one")
    public  WsgResult selectOne(@RequestParam String id){
        WsgResult result = new WsgResult();
        try{
            UserDTO dto = userApp.selectOne(id);
            result.setData(dto);
        }catch (Exception e){
            result.setCode(RetCode.OPERATION_FAIL.getCode());
            result.setMsg(e.getMessage());
        }
        return  result;
    }


    @PostMapping("/sys/user/delete")
    public WsgResult delete(@RequestBody UserDTO userDTO){
        WsgResult result = new WsgResult();
        try{
            userApp.delete(userDTO);
        }catch (Exception e){
            result.setCode(RetCode.OPERATION_FAIL.getCode());
            result.setMsg(e.getMessage());
        }
        return result;
    }


}
