package com.bw.cultivate.webtop.ai.authitor;

import com.bw.cultivate.webtop.ai.authitor.DTO.Aoutes;
import com.bw.cultivate.webtop.ai.authitor.DTO.SysFunctionDTO;
import com.bw.cultivate.webtop.wsg.authitor.VO.SysFunctionVO;

import java.util.List;

public interface ISysFunctionApp {
    
    List<SysFunctionDTO> selectPage(SysFunctionVO vo);

    Integer selectCount(SysFunctionVO vo);

    List<Aoutes> selectIndexData();

    List<SysFunctionDTO> selectIndexDataAll();
}
