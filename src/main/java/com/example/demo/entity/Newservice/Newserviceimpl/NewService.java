package com.example.demo.newservice;
NewfileService.java

import com.example.demo.newentity.NewfileEntity;
public interface NewfileService{
    NewfileEntity savedata (NewfileEntity newfile);
    NewfileEntity getidval(Long id);


    
}

