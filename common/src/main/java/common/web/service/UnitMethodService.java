package common.web.service;

import org.springframework.stereotype.Service;

/**
 * @author peter
 * @version 1.1
 * @date 2019/12/14 10:13
 */
@Service
public class UnitMethodService {


    public int staticOrders(int num){
        System.out.println("进入service");
        int sum = 0;
        for( int i=0;i<num;i++){
            sum += i;
        }
        return sum;
    }
}
