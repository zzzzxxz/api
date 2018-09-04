package cn.xyzs.api.service;

import cn.xyzs.api.mapper.XyCustomerInfoMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class XyCustomerInfoService {

    @Resource
    private XyCustomerInfoMapper xyCustomerInfoMapper;

    public Map<String, Object> getCustomerEngineeringInfo(String ctrTel){
        Map<String, Object> resultMap = new HashMap<>();
        Map<String, Object> obj = new HashMap<>();
        String code = "500";
        String msg = "系统异常";
        try {
            List<Map<String, Object>> CustomerEngineeringInfo = xyCustomerInfoMapper.getCustomerEngineeringInfo(ctrTel);
            code = "200";
            msg = "成功";
            obj.put("CustomerEngineeringInfo",CustomerEngineeringInfo);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        resultMap.put("code",code);
        resultMap.put("msg",msg);
        resultMap.put("resultData",obj);
        return resultMap;
    }
}
