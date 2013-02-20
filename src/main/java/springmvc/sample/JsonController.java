package springmvc.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JsonController {

    @RequestMapping(value="/json",  method = RequestMethod.GET, produces="application/json")
    @ResponseBody
    public  Object hello()  {
        return new Object() { public String foo = "Hello world!"; };
    }

}
