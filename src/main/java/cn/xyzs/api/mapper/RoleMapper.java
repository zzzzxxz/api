package cn.xyzs.api.mapper;

import cn.xyzs.api.pojo.TRole;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

@org.apache.ibatis.annotations.Mapper
public interface RoleMapper extends Mapper<TRole> {
    @Select("SELECT S_NAME name,S_VAL_NEW valnew from XY_BJD_FCSJ_LIST")
    List<Map<String,Object>> selectName();
}
