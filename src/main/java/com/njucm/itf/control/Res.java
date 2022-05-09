package com.njucm.itf.control;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mathworks.toolbox.javabuilder.MWException;
import com.njucm.itf.dao.Medicine;
import com.njucm.itf.matlab.GS;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/res")
public class Res {
    private ObjectMapper mapper = new ObjectMapper();
    @PostMapping(path = "/get")
    public @ResponseBody String Get(@RequestParam(value = "File") String Name) throws MWException, JsonProcessingException {
        Medicine Res=new Medicine();
        if (Name.charAt(0)=='G')
        {
            Res.setName("干姜");
            Res.setLocation("未知");  //调用位置鉴别算法（未完成）
            Res.setSulfur(2);  //调用含硫量鉴别算法
            Res.setSecurity(0);  //调用鉴别等级算法（未完成）
            Res.setMix(0);  //调用混合算法（未完成）
        }
        else if(Name.charAt(0)=='W')
        {
            Res.setName("枸杞子");
            Res.setLocation("未知"); //调用位置鉴别算法（未完成）
            Res.setSulfur(0); //调用含硫量鉴别算法（未完成）
            Res.setSecurity(0); //调用鉴别等级算法（未完成）
            Res.setMix(0); //调用混合算法（未完成）
        }
        return mapper.writeValueAsString(Res);
    }
}
