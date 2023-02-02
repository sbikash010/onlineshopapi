package com.onlinshoping.onlineshopingapi.service.admin;

import com.onlinshoping.onlineshopingapi.model.admin.AdminDetails;

import java.util.List;

public interface AdminService {
    public AdminDetails saveAdmin(AdminDetails adminDetails);

    public List<AdminDetails> getadminlist() ;

    public AdminDetails getAdminById(Integer id) ;
    public AdminDetails getAdminByName(String name) ;

    public String deleteById(Integer id) ;


    public AdminDetails updateAdmin(Integer id) ;

}
