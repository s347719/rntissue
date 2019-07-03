package rongyan.rntissue.repo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rongyan.rntissue.repo.dao.CardDao;
import rongyan.rntissue.repo.entity.Card;
import rongyan.rntissue.repo.service.CardService;

import javax.transaction.Transactional;
import java.util.List;

@Service("CardService")
@Transactional
public class CardServiceImpl implements CardService {

    @Autowired
    private CardDao cardDao;

    @Override
    public List<Card> findAllByid(String tell) {
        return cardDao.findCardByTel(tell);
    }

    @Override
    public Card findByCardNo(String num) {
        return cardDao.findFirstByFVipCardNo(num);
    }
}
