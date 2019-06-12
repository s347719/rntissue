package rongyan.rntissue.repo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rongyan.rntissue.repo.dao.LibertyDao;
import rongyan.rntissue.repo.entity.Liberty;
import rongyan.rntissue.repo.service.LibertyService;

import javax.transaction.Transactional;

@Service("LibertyService")
@Transactional
public class LibertyServiceImpl implements LibertyService {


    @Autowired
    private LibertyDao libertyDao;

    @Override
    public Liberty getLibertybyId(int id) {
        return libertyDao.findById(id);
    }
}
