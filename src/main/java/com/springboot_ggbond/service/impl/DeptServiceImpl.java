package com.springboot_ggbond.service.impl;

import com.springboot_ggbond.mapper.DeptMapper;
import com.springboot_ggbond.pojo.Dept;
import com.springboot_ggbond.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;
    @Override
    public List<Dept> list() {
        return deptMapper.list();
    }
}
