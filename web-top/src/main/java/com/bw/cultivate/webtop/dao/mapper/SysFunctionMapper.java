package com.bw.cultivate.webtop.dao.mapper;

import com.bw.cultivate.webtop.dao.entity.SysFunction;
import com.bw.cultivate.webtop.wsg.authitor.VO.SysFunctionVO;
import java.util.List;

public interface SysFunctionMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysFunction record);

    SysFunction selectByPrimaryKey(String id);

    List<SysFunction> selectAll();

    int updateByPrimaryKey(SysFunction record);

    List<SysFunction> selectPage(SysFunctionVO vo);

    Integer selectCount(SysFunctionVO vo);

    List<SysFunction> selectIndexData();
}