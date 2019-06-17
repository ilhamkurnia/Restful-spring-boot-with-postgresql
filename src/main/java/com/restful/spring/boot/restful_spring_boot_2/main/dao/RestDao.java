package com.restful.spring.boot.restful_spring_boot_2.main.dao;

import com.restful.spring.boot.restful_spring_boot_2.main.model.Rest;
import com.restful.spring.boot.restful_spring_boot_2.main.model.RestResult;

import java.util.List;

public interface RestDao {
    List<RestResult> getAll();
    RestResult getRestById(int id);
    void addRest (Rest rest);
    void updateRest (Rest rest, int id);
    void deleteRestById(int id);
    int lastestInput();

}
