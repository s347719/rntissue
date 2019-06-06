package rongyan.rntissue.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rongyan.rntissue.repo.entity.ProjectInfo;
import rongyan.rntissue.repo.httpModel.ResultResponseUtil;
import rongyan.rntissue.repo.serviceImpl.ProjectInfoServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/project")
public class ProjectInfoController {

    @Autowired
    private ProjectInfoServiceImpl projectInfoService;


    @RequestMapping()
    public String getAllNotDelete() {
        List<ProjectInfo> all = projectInfoService.findAllNotDelete();
        return ResultResponseUtil.success(all);
    }


    @RequestMapping(value = "/{id}")
    public String getOne(@PathVariable("id") int id) {
        ProjectInfo projectInfo = projectInfoService.findById(id);
        return ResultResponseUtil.success(projectInfo);
    }

    @RequestMapping(value="/all")
    public String getAll() {
        List<ProjectInfo> all = projectInfoService.findAll();
        return ResultResponseUtil.success(all);
    }

    @RequestMapping(value="/state/{state}")
    public String getAllByState(@PathVariable("state") int state) {
        ProjectInfo projectInfo = projectInfoService.findByFStateEquals(state);
        return ResultResponseUtil.success(projectInfo);
    }


}
