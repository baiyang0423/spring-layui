package com.bw.cultivate.webtop.dao.mapper;

import com.bw.cultivate.webtop.ai.authitor.DTO.UserDTO;
import com.bw.cultivate.webtop.dao.entity.SysUser;
import com.bw.cultivate.webtop.wsg.authitor.VO.SysUserVO;

import java.util.List;

public interface SysUserMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysUser record);

    SysUser selectByPrimaryKey(String id);

    List<SysUser> selectAll();

    int updateByPrimaryKey(SysUser record);

    int selectCount(SysUserVO vo);

    List<SysUser> selectPage(SysUserVO vo);
}