package com.onlinshoping.onlineshopingapi.service.admin;

import com.onlinshoping.onlineshopingapi.adminrepo.AdminRepo;
import com.onlinshoping.onlineshopingapi.model.admin.AdminDetails;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminServiceImp implements AdminService {
    @Autowired
    private final   AdminRepo adminRepo;
    @Override
    public AdminDetails saveAdmin(AdminDetails adminDetails)  {
        return adminRepo.save(adminDetails);
    }

    @Override
    public List<AdminDetails> getadminlist() {
        return adminRepo.findAll();
    }

    @Override
    public AdminDetails getAdminById(Integer id)  {
        return adminRepo.findById(id).orElse(null);
    }

    @Override
    public AdminDetails getAdminByName(String name)  {
        return adminRepo.getAdminByName(name);
    }

    @Override
    public String deleteById(Integer id) {
        adminRepo.deleteById(id);
        return "admin is deleted whose Admin Id is "+id;
    }
    @Override
    public AdminDetails updateAdmin(Integer id) {
        AdminDetails existadmin=adminRepo.getAdminById(id);
        existadmin.setName("binod");
        existadmin.setAddress("nepal");
        existadmin.setEmail("binod@gmail.com");
        return this.saveAdmin(existadmin);
    }
}
