package rongyan.rntissue.repo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import rongyan.rntissue.repo.dao.StoreTeacherDao;
import rongyan.rntissue.repo.entity.StoreTeacher;
import rongyan.rntissue.repo.service.StoreTeacherService;
import rongyan.rntissue.repo.util.DateUtils;

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

    @Override
    public boolean updateOrSave(StoreTeacher storeTeacher) {
        StoreTeacher byFName = storeTeacherDao.findByFName(storeTeacher.getfName());
        try {
            if (StringUtils.isEmpty(byFName)) {
                storeTeacherDao.save(storeTeacher);
            }else {
                byFName.setfName(storeTeacher.getfName());
                byFName.setfDisplayName(storeTeacher.getfDisplayName());
                byFName.setfPhotoUrl(storeTeacher.getfPhotoUrl());
                byFName.setfNumber(storeTeacher.getfNumber());
                byFName.setfRemark(storeTeacher.getfRemark());
                byFName.setfState(storeTeacher.getfState());
                byFName.setfTell(storeTeacher.getfTell());
                byFName.setfUpdateTime(DateUtils.getNowDate());
                storeTeacherDao.save(storeTeacher);
            }
            return true;
        }catch (Exception e){
            return false;
        }

    }
}
