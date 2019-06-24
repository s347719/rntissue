package rongyan.rntissue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rongyan.rntissue.repo.httpModel.ResultResponseEnum;
import rongyan.rntissue.repo.httpModel.ResultResponseUtil;
import rongyan.rntissue.repo.service.UserService;
import rongyan.rntissue.repo.util.JwtUtil;

@RestController
public class LoginController {


    @Autowired
    private UserService userService;


    //根据加密的名称和密码
    @RequestMapping(value = "/login")
    public String getUser(@PathVariable("username") String username,@PathVariable("password")String password) {
        boolean exits = userService.isExits(username, JwtUtil.getPassWord(password));
        if (exits) {
            return ResultResponseUtil.success(null);
        } else {
            return ResultResponseUtil.getApiResponse(ResultResponseEnum.LOGIN_FAIL);
        }
    }

    //根据加密的名称和密码
    @RequestMapping(value = "/login/admin")
    public String getadmin(@PathVariable("username") String username,@PathVariable("password")String password) {
        boolean exits = userService.isExitsAdmin(username, password);
        if (exits) {
            return ResultResponseUtil.success(null);
        } else {
            return ResultResponseUtil.getApiResponse(ResultResponseEnum.LOGIN_FAIL);
        }
    }


}
