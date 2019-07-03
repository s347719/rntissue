package rongyan.rntissue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rongyan.rntissue.repo.entity.StoreTeacher;
import rongyan.rntissue.repo.httpModel.ResultResponseEnum;
import rongyan.rntissue.repo.httpModel.ResultResponseUtil;
import rongyan.rntissue.repo.service.StoreTeacherService;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class StoreTeacherController {


    @Autowired
    private StoreTeacherService storeTeacherService;

    @RequestMapping(value = "/{name}")
    public String getTeacherByName(@PathVariable("name") String name) {
        StoreTeacher teacherByName = storeTeacherService.findTeacherByName(name);
        return ResultResponseUtil.success(teacherByName);
    }

    @RequestMapping(value = "/all")
    public String getAll() {
        List<StoreTeacher> all = storeTeacherService.findAll();
        return ResultResponseUtil.success(all);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String updaeOrSave(@ModelAttribute StoreTeacher storeTeacher) {
        boolean b = storeTeacherService.updateOrSave(storeTeacher);
        if (b) {
            return ResultResponseUtil.success(null);
        } else {
            return ResultResponseUtil.getApiResponse(ResultResponseEnum.REQUEST_ERROR);
        }
    }
}
