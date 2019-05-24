package rongyan.rntissue.controller;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import rongyan.rntissue.repo.entity.Teacher;
import rongyan.rntissue.repo.entity.User;
import rongyan.rntissue.repo.service.TeacherService;
import rongyan.rntissue.repo.service.UserService;


@RestController
@RequestMapping("/user")
public class UserController {

    private static Logger log = LoggerFactory.getLogger(Controller.class);

    @Autowired
    private UserService userService;

    @Autowired
    private TeacherService teacherService;

    //因为是RestController 所以不需要标注@ResponseBody
    @RequestMapping(value = "/testReturnPage", method = RequestMethod.GET)
//    @ResponseBody
    public String testReturnPage(@RequestParam("username") String name, Long id) {
        userService.findByName("lixf");
        System.out.println(name);
        System.out.println(id);
        return "122";
    }


    @RequestMapping("/findUserByName")
    @ResponseBody
    public String findUserByName(String name, Long id) {
        Teacher user = teacherService.findTeacherByName("shuhuan");
        return JSONObject.toJSONString(user);
    }
}
