package com.bw.cultivate.webtop.app.authitor;

import com.bw.cultivate.webtop.ai.authitor.DTO.Aoutes;
import com.bw.cultivate.webtop.ai.authitor.DTO.SysFunctionDTO;
import com.bw.cultivate.webtop.ai.authitor.ISysFunctionApp;
import com.bw.cultivate.webtop.dao.entity.SysFunction;
import com.bw.cultivate.webtop.dao.mapper.SysFunctionMapper;
import com.bw.cultivate.webtop.util.BeanConvertor;
import com.bw.cultivate.webtop.wsg.authitor.VO.SysFunctionVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName:  SysFunctionAppImpl
 * @Description: 
 * @author: by_csd_hlj
 * @date: 2019/9/27  15:04
 * @version: 1.0
 */
@Slf4j
@Service
public class SysFunctionAppImpl implements ISysFunctionApp{



    @Resource
    private SysFunctionMapper functionMapper;


    @Override
    public List<SysFunctionDTO> selectPage(SysFunctionVO vo) {

        List<SysFunction> list = functionMapper.selectPage(vo);
        return BeanConvertor.copyList(list,SysFunctionDTO.class,"");

    }

    @Override
    public Integer selectCount(SysFunctionVO vo) {
        return functionMapper.selectCount(vo);
    }

    /**
     * 首页菜单获取数据
     * @return List<Aoutes>
     */
    @Override
    public List<Aoutes> selectIndexData() {
        List<Aoutes> reList = new ArrayList<>();
        List<SysFunction> list = functionMapper.selectIndexData();
        for(SysFunction sf : list){
            Aoutes aoutes = Aoutes.builder()
                    .path(sf.getPath())
                    .component(sf.getUrl())
                    .name(sf.getTitle())
                    .build();

            reList.add(aoutes);
        }
        return reList;
    }

    @Override
    public List<SysFunctionDTO> selectIndexDataAll() {
        List<SysFunction> list = functionMapper.selectAll();
        return BeanConvertor.copyList(list,SysFunctionDTO.class ,"");
    }


}
