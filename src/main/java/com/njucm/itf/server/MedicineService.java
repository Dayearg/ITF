package com.njucm.itf.server;

import com.njucm.itf.dao.Medicine;
import com.njucm.itf.dao.MedicineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class MedicineService {

    @Autowired
    private MedicineRepository MR;

    public Iterable<Medicine> getAllItems(){
        return MR.findAll();
    }

    public boolean add(String MID,String Origin,int MSO,int Grade){
        Medicine medicine = new Medicine();
//        medicine.setMID(MID);  //从图片获取ID信息
//        medicine.setOrigin(Origin);  //调用算法获取产地
//        medicine.setMSO(MSO);  //调用算法获取含硫量
//        medicine.setGrade(Grade);  //调用算法获取等级
        MR.save(medicine);  //持久化
        return true;
    }
}
