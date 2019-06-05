package rongyan.rntissue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rongyan.rntissue.repo.entity.ConsumeInfo;
import rongyan.rntissue.repo.httpModel.ResultResponseUtil;
import rongyan.rntissue.repo.service.ConsumeInfoService;

import java.util.List;

@RestController
@RequestMapping("/consume")
public class ConsumeInfoController {

    @Autowired
    private ConsumeInfoService consumeInfoService;

    @RequestMapping(value = "/all")
    public String getAll() {
        List<ConsumeInfo> all = consumeInfoService.findAll();
        return ResultResponseUtil.success(all);
    }

    //本方法将处理 /courses/view2/123 形式的URL
    @RequestMapping(value = "/getConsume/{userTel}")
    public String getAllByUserId(@PathVariable("userTel") String userTel) {
        List<ConsumeInfo> allByuserTel = consumeInfoService.findAllByuserTel(userTel);
        return ResultResponseUtil.success(allByuserTel);
    }

    //本方法将处理 /courses/view2/123 形式的URL
    @RequestMapping(value = "/getConsumeTop/{id}")
    public String getOneByUserId(@PathVariable("id") int id) {
        ConsumeInfo consumeInfo = consumeInfoService.getOne(id);
        return ResultResponseUtil.success(consumeInfo);
    }


}
