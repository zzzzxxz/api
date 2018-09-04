package cn.xyzs.api.service;

import cn.xyzs.api.mapper.UserMapper;
import cn.xyzs.api.mapper.XyCustomerInfoMapper;
import cn.xyzs.api.mapper.XyGcbGrxxMapper;
import cn.xyzs.api.pojo.TUser;
import cn.xyzs.api.pojo.XyCustomerInfo;
import cn.xyzs.api.pojo.XyGcbGrxx;
import cn.xyzs.api.util.MD5Util;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LoginService {

    @Resource
    private XyCustomerInfoMapper customerInfoMapper;

    @Resource
    private UserMapper userMapper;

    @Resource
    private XyGcbGrxxMapper xyGcbGrxxMapper;

    /**
     * 登陆
     * @Description:
     * @author: zheng shuai
     * @date: 2018/8/9 15:45
     * @param: [ctrTel, password, verificationCode, roleFlag]
     * @return: java.util.Map<java.lang.String,java.lang.Object>
     */
    public Map<String,Object> login(String ctrTel,String password,String verificationCode,String roleFlag){
        Map<String,Object> resultMap = new HashMap<>();
        Map<String,Object> obj = new HashMap<>();
        String code = "500";
        String msg = "系统异常";
        //判断用户是以什么角色登陆的（0：客户/1：员工/2：工人）
        if ("0".equals(roleFlag)){
            Integer isCustomer = null;
            try {
                isCustomer = customerInfoMapper.isCustomer(ctrTel);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            //判断客户是否存在
            if (isCustomer > 0){
                //判断验证码输入是否正确
                if ("1234".equals(verificationCode)){
                    code = "200";
                    msg = "登陆成功";
                } else {
                    code = "401";
                    msg = "验证码输入错误";
                }
            } else {
                code = "400";
                msg = "用户不存在";
            }
        } else if("1".equals(roleFlag)) {
            TUser tUser = new TUser();
            tUser.setUserTel(ctrTel);
            tUser = userMapper.selectOne(tUser);
            //判断用户手否存在
            if (tUser == null){
                code = "400";
                msg = "用户不存在";
            } else {
                //判断密码是否正确
                if (MD5Util.md5Password(password).equals(tUser.getPassword())){
                    code = "200";
                    msg = "登陆成功";
                    List<Map<String,Object>> roleList = null;
                    try {
                        roleList = userMapper.getUserRole(tUser.getUserId());
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    obj.put("roleList",roleList);
                } else {
                    code = "401";
                    msg = "登陆失败";
                }
            }
        } else if ("2".equals(roleFlag)){
            XyGcbGrxx xyGcbGrxx = new XyGcbGrxx();
            xyGcbGrxx.setGrTel(ctrTel);
            xyGcbGrxx = xyGcbGrxxMapper.selectOne(xyGcbGrxx);
            //判断用户手否存在
            if (xyGcbGrxx == null){
                code = "400";
                msg = "用户不存在";
            } else {
                //判断密码是否正确
                if (MD5Util.md5Password(password).equals(xyGcbGrxx.getPassword())){
                    obj.put("xyGcbGrxx",xyGcbGrxx);
                    code = "200";
                    msg = "登陆成功";
                } else {
                    code = "401";
                    msg = "登陆失败";
                }
            }
        }
        resultMap.put("code",code);
        resultMap.put("msg",msg);
        resultMap.put("resultData",obj);
        return resultMap;
    }
}
