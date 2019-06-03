package rongyan.rntissue.repo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rongyan.rntissue.repo.dao.StoreNewsDao;
import rongyan.rntissue.repo.entity.StoreNews;
import rongyan.rntissue.repo.service.StoreNewsService;

import javax.transaction.Transactional;
import java.util.List;

@Service("StoreNewsService")
@Transactional
public class StoreNewsServiceImpl implements StoreNewsService {

    @Autowired
    StoreNewsDao storeNewsDao;

    @Override
    public List<StoreNews> findAll() {
        return storeNewsDao.findAll();
    }

    @Override
    public StoreNews findStoreNewsByFPubUser(String pubUser) {
        return storeNewsDao.findByFPubUser(pubUser);
    }
}
