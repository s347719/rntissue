package rongyan.rntissue.repo.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rongyan.rntissue.repo.dao.ConsumeInfoDao;
import rongyan.rntissue.repo.entity.ConsumeInfo;
import rongyan.rntissue.repo.service.ConsumeInfoService;

import javax.transaction.Transactional;
import java.util.List;

@Service("ConsumeInfoService")
@Transactional
public class ConsumeInfoServiceImpl implements ConsumeInfoService {

    @Autowired
    private ConsumeInfoDao consumeInfoDao;

    @Override
    public ConsumeInfo getOne(int id) {
        return consumeInfoDao.findById(id);
    }

    @Override
    public List<ConsumeInfo> findAll() {
        //参数为1 为有效
        return consumeInfoDao.findAllByFIsDeleteIsOrderByIdDesc(1);
    }

    @Override
    public List<ConsumeInfo> findAllByuserTel(String userTel) {

        return consumeInfoDao.findAllByFUserID(userTel);
    }
}
