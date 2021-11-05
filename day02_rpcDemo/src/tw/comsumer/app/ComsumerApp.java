package tw.comsumer.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tw.provider.service.Calculator;
import tw.comsumer.service.CalculatorRemoteImpl;

public class ComsumerApp {
    private static Logger log = LoggerFactory.getLogger(ComsumerApp.class);

    //首先是Client端的应用层怎么发起RPC:
    public static void main(String[] args) {
        Calculator calculator = new CalculatorRemoteImpl();
        int result = calculator.add(1, 2);
        log.info("result is {}", result);
    }
}
