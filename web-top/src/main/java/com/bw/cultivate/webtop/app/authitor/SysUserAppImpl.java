package com.bw.cultivate.webtop.app.authitor;

import com.bw.cultivate.webtop.ai.authitor.DTO.UserDTO;
import com.bw.cultivate.webtop.ai.authitor.SysUserApp;
import com.bw.cultivate.webtop.dao.entity.SysUser;
import com.bw.cultivate.webtop.dao.mapper.SysUserMapper;
import com.bw.cultivate.webtop.util.BeanConvertor;
import com.bw.cultivate.webtop.util.uuid.UUIDGenerator;
import com.bw.cultivate.webtop.wsg.authitor.VO.SysUserVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName:
 * @Description:
 * @author: by_csd_hlj
 * @date:
 * @version: 1.0
 */
@Slf4j
@Service
public class SysUserAppImpl implements SysUserApp {

    @Resource
    private SysUserMapper userMapper;

    @Override
    public List<UserDTO> selectAll() {

        List<SysUser> list = userMapper.selectAll();
        List<UserDTO> re_list = BeanConvertor.copyList(list, UserDTO.class, "");
        return re_list;
    }

    @Override
    public int selectCount(SysUserVO vo) {
        return userMapper.selectCount(vo);
    }

    @Override
    public void save(UserDTO user) {
        SysUser sUser = BeanConvertor.copy(user,SysUser.class,"");
        sUser.setId(UUIDGenerator.create());
        userMapper.insert(sUser);
    }

    @Override
    public void update(UserDTO user) {
        SysUser sUser = BeanConvertor.copy(user,SysUser.class,"");
        userMapper.updateByPrimaryKey(sUser);
    }

    @Override
    public List<UserDTO> selectPage(SysUserVO vo) {
        List<SysUser> list = userMapper.selectPage(vo);
        log.info("0"+list.size());
        return BeanConvertor.copyList(list ,UserDTO.class,"");
    }

    @Override
    public UserDTO selectOne(String id) {
        SysUser suser = userMapper.selectByPrimaryKey(id);
        return BeanConvertor.copy(suser,UserDTO.class,"");
    }

    @Override
    public void delete(UserDTO userDTO) {
        log.info(userDTO.getId());
        userMapper.deleteByPrimaryKey(userDTO.getId());
    }
}
