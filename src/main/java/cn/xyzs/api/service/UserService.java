package cn.xyzs.api.service;

import cn.xyzs.api.mapper.UserMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;
    public PageInfo<Map<String,Object>> getUsers(int index,int size,Map<String,Object> map){
        PageHelper.startPage(index,size);
        List<Map<String,Object>> users = userMapper.selectByCondition(map);
        PageInfo<Map<String,Object>> pageInfo = new PageInfo<>(users);
        return pageInfo;
    }
}
