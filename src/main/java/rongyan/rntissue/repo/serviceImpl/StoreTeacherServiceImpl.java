package rongyan.rntissue.repo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rongyan.rntissue.repo.dao.StoreTeacherDao;
import rongyan.rntissue.repo.entity.StoreTeacher;
import rongyan.rntissue.repo.service.StoreTeacherService;

import javax.transaction.Transactional;
import java.util.List;

@Service("StoreTeacherService")
@Transactional
public class StoreTeacherServiceImpl implements StoreTeacherService {



    @Autowired
    private StoreTeacherDao storeTeacherDao;


    @Override
    public StoreTeacher findTeacherByName(String name) {

        return storeTeacherDao.findByFName(name);
    }

    @Override
    public List<StoreTeacher> findAll() {
        return storeTeacherDao.findAll();
    }
}
