package groupware.sample.web;

import groupware.sample.service.SampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/sample")
public class SampleController {

    private final SampleService sampleService;

    @GetMapping("/samplePage")
    public String samplePage(Model model) {
        model.addAttribute("list", sampleService.selectSampleList());
        return "sample/samplePage";
    }
}
