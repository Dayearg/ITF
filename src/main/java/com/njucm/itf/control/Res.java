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
            Res.setLocation("未知");
            Res.setSulfur(Integer.parseInt(GS.Res(Name)));
            Res.setSecurity(0);
            Res.setMix(0);

        }
        return mapper.writeValueAsString(Res);
    }
}
