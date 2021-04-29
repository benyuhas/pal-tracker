package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class EnvController {
    private static final String PORT = "PORT";
    private static final String MEMORY_LIMIT = "MEMORY_LIMIT";
    private static final String CF_INSTANCE_INDEX = "CF_INSTANCE_INDEX";
    private static final String CF_INSTANCE_ADDR = "CF_INSTANCE_ADDR";

    private Map<String,String> environmentMap;

    public EnvController(@Value("${port:NOT SET}")String port, @Value("${memory.limit:NOT SET}")String memoryLimit, @Value("${cf.instance.index:NOT SET}")String instanceNumber, @Value("${cf.instance.address:NOT SET}")String instanceAddress){
        environmentMap = new HashMap<>();


        environmentMap.put(PORT,port);
        environmentMap.put(MEMORY_LIMIT,memoryLimit);
        environmentMap.put(CF_INSTANCE_INDEX,instanceNumber);
        environmentMap.put(CF_INSTANCE_ADDR,instanceAddress);
    }

    @GetMapping("/env")
    public Map<String,String> getEnv(){
        return environmentMap;
    }
}
