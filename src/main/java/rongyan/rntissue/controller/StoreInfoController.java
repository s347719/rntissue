package rongyan.rntissue.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rongyan.rntissue.repo.entity.StoreInfo;
import rongyan.rntissue.repo.httpModel.ResultResponseUtil;
import rongyan.rntissue.repo.service.StoreInfoService;

@RestController
@RequestMapping("/storeInfo")
public class StoreInfoController {

    @Autowired
    private StoreInfoService storeInfoService;

    @RequestMapping(value = "/info")
    public String getStoreInfo() {
        StoreInfo info = storeInfoService.getInfo();
        return ResultResponseUtil.success(info);
    }

}
