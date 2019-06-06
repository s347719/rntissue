package rongyan.rntissue.repo.service;

import org.springframework.stereotype.Service;
import rongyan.rntissue.repo.entity.Card;

import java.util.List;

@Service
public interface CardService {


    List<Card> findAllByid(String tell);


    Card findByCardNo(String num);
}
