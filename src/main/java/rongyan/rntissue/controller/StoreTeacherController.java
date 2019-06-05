package rongyan.rntissue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rongyan.rntissue.repo.entity.StoreTeacher;
import rongyan.rntissue.repo.httpModel.ResultResponseUtil;
import rongyan.rntissue.repo.service.StoreTeacherService;

@RestController
@RequestMapping("/teacher")
public class StoreTeacherController {


    @Autowired
    private StoreTeacherService storeTeacherService;

    @RequestMapping(value = "/getByName")
    public String getTeacherByName(String name){
        StoreTeacher teacherByName = storeTeacherService.findTeacherByName(name);
        return ResultResponseUtil.success(teacherByName);
    }



}
