package rongyan.rntissue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import rongyan.rntissue.repo.entity.StoreNews;
import rongyan.rntissue.repo.httpModel.ResultResponseUtil;
import rongyan.rntissue.repo.service.StoreNewsService;

@RestController
@RequestMapping("/news")
public class StoreNewsController {

    @Autowired
    private StoreNewsService storeNewsService;


    @RequestMapping(value = "/getOneNews",method = RequestMethod.GET)
    public String getStorenewsByPub(String publishUser){
        StoreNews storeNewsByFPubUser = storeNewsService.findStoreNewsByFPubUser(publishUser);
        return ResultResponseUtil.success(storeNewsByFPubUser);
    }
}
