package io.github.emrecankoc.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @GetMapping({ "/", "/index" })
    public String home() {
        return "index.html";
    }

    @RequestMapping(value = "{_:^(?!index\\.html|api|swagger-ui\\.html).*$}")
    public String redirectApi() {
        return "forward:/";
    }
}