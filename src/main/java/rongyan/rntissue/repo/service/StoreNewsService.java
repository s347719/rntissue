package rongyan.rntissue.repo.service;


import org.springframework.stereotype.Service;
import rongyan.rntissue.repo.entity.StoreNews;

import java.util.List;

@Service
public interface StoreNewsService {

    List<StoreNews> findAll();

    StoreNews findStoreNewsByFPubUser(String pubUser);
}
