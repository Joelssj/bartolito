package com.basedatos.basededatos.services;

import com.basedatos.basededatos.dao.ProductoDao;
import com.basedatos.basededatos.models.ProfileTwoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileTwoService {
    @Autowired
    ProductoDao productoDao;

    public List<ProfileTwoModel> getAll(){
        return productoDao.getPAll();
    }
    public ProfileTwoModel register( ProfileTwoModel profileTwoModel){
        return productoDao.registerP(profileTwoModel);
    }


}
