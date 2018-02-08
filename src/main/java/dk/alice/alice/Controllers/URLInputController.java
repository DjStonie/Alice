package dk.alice.alice.Controllers;

import dk.alice.alice.Services.LetterManager;
import dk.alice.alice.Services.TextAnalysis;
import dk.alice.alice.Services.URLReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class URLInputController {

    @Autowired
    URLReader urlReader;

    @RequestMapping("/URLTEXT")
    public ModelAndView URL() {
        ModelAndView modelAndView = new ModelAndView("URLTEXT");

        return modelAndView;
    }

    @RequestMapping(value={"/analysis"}, method = RequestMethod.POST)
    public ModelAndView Text(@RequestParam String url) {
        ModelAndView modelAndView = new ModelAndView("Analysis");
        TextAnalysis.getInstance().analysis(urlReader.reader(url));
        modelAndView.addObject("letter", LetterManager.getInstance().getAllLetters().values());

        return modelAndView;
    }

}
