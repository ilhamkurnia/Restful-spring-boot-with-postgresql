package com.restful.spring.boot.restful_spring_boot_2.main.Service;


import com.restful.spring.boot.restful_spring_boot_2.main.dao.RestDao;
import com.restful.spring.boot.restful_spring_boot_2.main.model.Rest;
import com.restful.spring.boot.restful_spring_boot_2.main.model.RestResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestServiceImp implements RestService {

    @Autowired
    private RestDao restDao;

    @Override
    public List<RestResult> getAll() {
        return restDao.getAll();
    }

    @Override
    public RestResult getRestById(int id) {
        return restDao.getRestById(id);
    }

    @Override
    public void addRest(Rest rest) {
        restDao.addRest(rest);
    }

    @Override
    public void updateRest(Rest rest, int id) {
        restDao.updateRest(rest, id);

    }

    @Override
    public void deleteRestById(int id) {
        restDao.deleteRestById(id);

    }

    @Override
    public int lastestInput() {
        return restDao.lastestInput();
    }
}
