package rongyan.rntissue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rongyan.rntissue.repo.entity.OrderInfo;
import rongyan.rntissue.repo.httpModel.ResultResponseUtil;
import rongyan.rntissue.repo.service.OrderInfoService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderInfoService orderInfoService;

    //根据个人id获取订单数据
    @RequestMapping(value = "/{userId}")
    public String getAll(@PathVariable("userId") String userId) {
        List<OrderInfo> all = orderInfoService.getListById(userId);
        return ResultResponseUtil.success(all);
    }
}
