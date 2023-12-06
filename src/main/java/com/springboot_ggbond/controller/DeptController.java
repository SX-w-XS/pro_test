package com.springboot_ggbond.controller;
import com.springboot_ggbond.pojo.Dept;
import com.springboot_ggbond.pojo.Result;
import com.springboot_ggbond.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.logging.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class DeptController {
    @Autowired
    private DeptService  deptService;
//     private  static Logger log= (Logger) LoggerFactory.getLogger(DeptController.class);
//
    @GetMapping("/depts")
    public Result ListDept(){
      log.info("全部部门数据");
      List<Dept> deptList=deptService.list();
       return  Result.success(deptList);
    }
}
