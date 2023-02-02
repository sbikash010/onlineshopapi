package com.onlinshoping.onlineshopingapi.controller.adminController;

import com.onlinshoping.onlineshopingapi.model.admin.AdminDetails;
import com.onlinshoping.onlineshopingapi.service.admin.AdminServiceImp;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/admin/v1")
public class AdminController {
    private  final AdminServiceImp adminServiceImp;

    @PostMapping("/addAdmin")
    public  AdminDetails saveaalldmin(@RequestBody AdminDetails adminDetails)
    {
        return adminServiceImp.saveAdmin(adminDetails);
    }

    @GetMapping("/admin")
    public List<AdminDetails> findlistAdmin(){
        return adminServiceImp.getadminlist();
    }

    @GetMapping("/adminid/{id}")
    public AdminDetails getdetailFindById(@PathVariable Integer id){
        return adminServiceImp.getAdminById(id);
    }

    @GetMapping("/adminName/{name}")
    public AdminDetails getdetailFindByName(@PathVariable String name){
        return adminServiceImp.getAdminByName(name);
    }
    @PutMapping("/update/{id}")
    public AdminDetails updatedetailFindByid(@PathVariable Integer id){
        return adminServiceImp.updateAdmin(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteByid(@PathVariable Integer id){
        return adminServiceImp.deleteById(id);
    }

}
