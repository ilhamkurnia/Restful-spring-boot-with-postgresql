package com.restful.spring.boot.restful_spring_boot_2.main.controller;

import com.restful.spring.boot.restful_spring_boot_2.main.Service.RestService;
import com.restful.spring.boot.restful_spring_boot_2.main.model.Rest;
import com.restful.spring.boot.restful_spring_boot_2.main.model.RestResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("rest")
public class RestController {
    @Autowired
    RestService restService;

    @GetMapping("/id")
    public ResponseEntity<RestResult> getById(@PathVariable("id") int id){
        RestResult rest = restService.getRestById(id);
        return new ResponseEntity<RestResult>(rest, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<RestResult> addRest(@RequestBody Rest rest){
        restService.addRest(rest);
        RestResult rest2 = restService.getRestById(restService.lastestInput());

        return new ResponseEntity<RestResult>(rest2, HttpStatus.OK);
    }

    @PutMapping("{/id}")
    public ResponseEntity<RestResult> updateRest(@PathVariable("id") int id, @RequestBody Rest rest){
        restService.updateRest(rest, id);
        RestResult rest2 = restService.getRestById(id);
        return new ResponseEntity<RestResult>(rest2, HttpStatus.OK);
    }

    @DeleteMapping("{/id}")
    public ResponseEntity<RestResult> deleteRest(@PathVariable("id") int id){
        RestResult rest2 = restService.getRestById(id);
        restService.deleteRestById(id);
        return new ResponseEntity<RestResult>(rest2, HttpStatus.OK);
    }


}
