package com.example.demo.newservice;

import java.util.List;

import com.example.demo.newentity.NewfileEntity;

public interface NewfileService{
    NewfileEntity savedata (NewfileEntity newfile);
    NewfileEntity getidval(Long id);
    New<fileEntity>getall();
    NewfileEntity update(Login Id,NewfileEntity newfile);
    void delete(Long id);
    



      
}

