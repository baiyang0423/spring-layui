package com.bw.cultivate.webtop.dao.mapper;

import com.bw.cultivate.webtop.dao.entity.SysRole;
import java.util.List;

public interface SysRoleMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysRole record);

    SysRole selectByPrimaryKey(String id);

    List<SysRole> selectAll();

    int updateByPrimaryKey(SysRole record);
}