package com.njucm.itf.control;

import com.njucm.itf.dao.Medicine;
import com.njucm.itf.server.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/medicine")
public class MedicineControl {
    @Autowired
    private MedicineService MS;

    @RequestMapping(path="/getAll")
    public @ResponseBody
    Iterable<Medicine> getAllItems(){
        return MS.getAllItems();
    }
    @PostMapping(path = "/add")
    public @ResponseBody boolean add(@RequestParam String MID
            ,@RequestParam String Orign
            ,@RequestParam int MSO
            ,@RequestParam int Grade){
        return MS.add(MID,Orign,MSO,Grade);
    }
}