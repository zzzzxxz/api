package cn.xyzs.api.service;

import cn.xyzs.api.mapper.RoleMapper;
import cn.xyzs.api.pojo.TRole;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class RoleService {
    @Resource
    private RoleMapper roleMapper;

    public PageInfo<TRole> getRole(){
        PageHelper.startPage(1,5);
        List<TRole> roles = roleMapper.selectAll();
        PageInfo<TRole> pageInfo = new PageInfo<TRole>(roles);
        return pageInfo;
    }
    public PageInfo<Map<String,Object>> getMap(){
        PageHelper.startPage(1,5);
        List<Map<String,Object>> roles = roleMapper.selectName();
        PageInfo<Map<String,Object>> pageInfo = new PageInfo<Map<String,Object>>(roles);
        return pageInfo;
    }
}
