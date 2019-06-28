package rongyan.rntissue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rongyan.rntissue.repo.entity.User;
import rongyan.rntissue.repo.httpModel.ResultResponseUtil;
import rongyan.rntissue.repo.service.UserService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //根据等级来查询所有人
    @RequestMapping(value = "/level/{level}")
    public String getAll(@PathVariable("level") int level) {
        List<User> all = userService.getListByLevel(level);
        return ResultResponseUtil.success(all);
    }

    //根据等级来查询所有人
    @RequestMapping(value = "/all")
    public String getAll() {
        List<User> all = userService.findAll();
        return ResultResponseUtil.success(all);
    }

    //根据等级来查询所有人
    @RequestMapping(value = "/user")
    public String isExits(HttpServletRequest request) {
        String openid = request.getParameter("openid");
        boolean exitsByWX = userService.isExitsByWX(openid);
        if (exitsByWX) {
            return ResultResponseUtil.success();
        } else {
            return ResultResponseUtil.error();
        }
    }


}
