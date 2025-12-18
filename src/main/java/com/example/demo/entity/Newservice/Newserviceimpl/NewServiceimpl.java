package com.example.demo.newservice.newserviceimpl;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.newentity.NewfileEntity;
import com.example.demo.newrepository.NewfileRepo;
import com.example.demo.newservice.NewfileService;
@Service
public class NewfileServiceImpl implements NewfileService{

    private final NewfileRepo rep;

   public NewfileEntity savedata(NewfileRepo rep){
        this.rep=rep;

    }
    @override
    public NewfileEntity savedata(NewfileEntity newfile){
        return rep.save(newfile);
    }

    @override
    public NewfileEntity getidval(Long id){
        return rep.findAll();
    }
    @override
    public List<NewfileEntity> getall(){
        return rep.findAll();
    }

    @ 
    }


    }
}