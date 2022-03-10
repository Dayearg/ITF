package com.njucm.itf.control;

import com.mathworks.toolbox.javabuilder.MWException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping(path = "/upload")
public class UploadImages {
    @PostMapping(path = "/images")
    public @ResponseBody boolean FileLoad(@RequestParam(value = "File") MultipartFile file) throws MWException {
        String fileName = file.getOriginalFilename();  // 文件名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));  // 后缀名
        File dest = new File(fileName);
        // 如果文件的父路径不存在，则创建
        if (fileName.startsWith("/") && !dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }
        // 开始存放文件到指定目录
        try {
            file.transferTo(dest);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
