package com.springboot_ggbond.mapper;

import com.springboot_ggbond.pojo.Dept;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeptMapper {

    //查询全部部门
    @Select("select * from dept")
    List<Dept> list();
   //删除部门
    @Delete("delete  from dept  where id=#{id}")
    void deleteDeptById(Integer id);
}
