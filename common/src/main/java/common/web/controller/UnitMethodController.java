package common.web.controller;

import common.web.service.UnitMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author peter
 * @version 1.1
 * @date 2019/12/14 10:16
 */
@RestController
public class UnitMethodController {
    @Autowired
    UnitMethodService methodService;

    @GetMapping("total")
    public Integer getTotal(@RequestParam("n") Integer num){
       return  methodService.staticOrders(num);
    }

}
