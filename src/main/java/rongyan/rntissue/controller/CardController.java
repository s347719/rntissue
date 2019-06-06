package rongyan.rntissue.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rongyan.rntissue.repo.entity.Card;
import rongyan.rntissue.repo.httpModel.ResultResponseUtil;
import rongyan.rntissue.repo.service.CardService;

import java.util.List;

@RestController
@RequestMapping("/card")
public class CardController {

    @Autowired
    private CardService cardService;


    @RequestMapping(value = "/{userId}")
    public String getAll(@PathVariable("userId") String userId) {
        List<Card> all = cardService.findAllByid(userId);
        return ResultResponseUtil.success(all);
    }

    @RequestMapping(value = "/info/{cardNo}")
    public String getCardInfo(@PathVariable("cardNo") String cardNo) {
        Card all = cardService.findByCardNo(cardNo);
        return ResultResponseUtil.success(all);
    }



}
