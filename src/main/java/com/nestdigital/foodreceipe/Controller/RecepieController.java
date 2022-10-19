package com.nestdigital.foodreceipe.Controller;

import com.nestdigital.foodreceipe.Dao.RecepieDao;
import com.nestdigital.foodreceipe.Model.RecepieModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecepieController {

    @Autowired
    private RecepieDao dao;

     @CrossOrigin(origins = "*")
    @PostMapping(path = "/addRecepie",consumes = "application/json",produces = "application/json")
    public String addRecepie(@RequestBody RecepieModel recepie){
         dao.save(recepie);
        return "(status:success)";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewRecepie")
    public List<RecepieModel> viewRecepie(){
         return (List<RecepieModel>) dao.findAll();
    }
}
