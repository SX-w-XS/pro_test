package com.springboot_ggbond.service;

import com.springboot_ggbond.pojo.Dept;

import java.util.List;

public interface DeptService {
   //查询所有部门信息
    public List<Dept> list();

    public void  deleteDeptById( Integer id);
}
