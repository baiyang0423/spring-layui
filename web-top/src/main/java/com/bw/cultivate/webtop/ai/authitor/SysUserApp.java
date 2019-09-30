package com.bw.cultivate.webtop.ai.authitor;

import com.bw.cultivate.webtop.ai.authitor.DTO.UserDTO;
import com.bw.cultivate.webtop.wsg.authitor.VO.SysUserVO;

import java.util.List;

public interface SysUserApp {
    List<UserDTO> selectAll();

    int selectCount(SysUserVO user);

    void save(UserDTO user);

    void update(UserDTO user);

    List<UserDTO> selectPage(SysUserVO user);

    UserDTO selectOne(String id);

    void delete(UserDTO userDTO);
}
