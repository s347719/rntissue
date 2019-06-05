package rongyan.rntissue.repo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rongyan.rntissue.repo.dao.StoreInfoDao;
import rongyan.rntissue.repo.entity.StoreInfo;
import rongyan.rntissue.repo.service.StoreInfoService;

import javax.transaction.Transactional;

@Service("StoreInfoService")
@Transactional
public class StoreInfoServiceImpl implements StoreInfoService {

    @Autowired
    private StoreInfoDao storeInfoDao;

    @Override
    public StoreInfo getInfo() {
        return storeInfoDao.findDistinctTopByIdAfter(0);
    }
}
