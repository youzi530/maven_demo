package com.example.day01_restfuldemo;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/restfull")
public class Restfull {

    /**
     * 查询,GET
     * @return
     */
    @GetMapping()
    public String getEmployee(){
        return "restfull查询成功";
    }

    /**
     *  新增,POST
     * @return
     */
    @PostMapping()
    public String getEmployee1(){
        return "restfull新增成功";
    }
    /**
     *  更新,PUT
     * @return
     */
    @PutMapping()
    public String getEmployee2(){
        return "restfull更新成功";
    }

    /**
     * 删除,DELETE
     * @return
     */
    @DeleteMapping()
    public String getEmployee3(){
        return "restfull删除成功";
    }
}
