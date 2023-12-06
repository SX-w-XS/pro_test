package com.springboot_ggbond.mapper;

import com.springboot_ggbond.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeptMapper {

    //查询全部部门
    @Select("select * from dept")
    public   List<Dept> list();
}
